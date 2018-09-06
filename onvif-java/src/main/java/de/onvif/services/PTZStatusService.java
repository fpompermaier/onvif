/*
 * Copyright 2018 Alessio Iannone
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions: The above copyright
 * notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package de.onvif.services;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.onvif.ver10.schema.PTZStatus;
import org.onvif.ver10.schema.PTZVector;
import org.onvif.ver10.schema.Vector1D;
import org.onvif.ver10.schema.Vector2D;
import org.onvif.ver20.ptz.wsdl.PTZ;

import de.onvif.soap.OnvifDevice;
import de.onvif.utils.OnvifHelper;
import de.onvif.utils.Spaces.PanTiltPositionSpace;
import de.onvif.utils.Spaces.ZoomPositionSpace;
import lombok.extern.slf4j.Slf4j;

/**
 * Service to poll for PTZStatus and notify to registered value the read values
 * 
 * @author Alessio Iannone - quonn77@gmail.com
 * @version 0.9b
 *
 */
@Slf4j
public class PTZStatusService {

    private List<IPTZListener> listeners;
    private long pollingPeriod;
    private long initialDelay;

    private OnvifDevice device;
    private String profileToken;

    private Thread scheduledService;
    private long minPollingPeriod;
    private boolean running;
    private boolean suspend;

    /**
     * Builder of the PTZStatus Service
     */
    public static class Builder {
        private List<IPTZListener> listeners;
        private long pollingPeriod;
        private long initialDelay;

        public Builder() {
            listeners = new CopyOnWriteArrayList<>();
        }

        public Builder listener(IPTZListener l) {
            listeners.add(l);
            return this;
        }

        public Builder pollingPeriod(long period) {
            this.pollingPeriod = period;
            return this;
        }

        public Builder initialDelay(long delay) {
            this.initialDelay = delay;
            return this;
        }

        public PTZStatusService build() {
            PTZStatusService service = new PTZStatusService(this);
            return service;
        }
    }

    /**
     * 
     * @param builder
     */
    private PTZStatusService(PTZStatusService.Builder builder) {
        this.listeners = builder.listeners;
        this.initialDelay = builder.initialDelay;
        this.pollingPeriod = builder.pollingPeriod;
        this.minPollingPeriod = 200;
        this.running = false;
        this.suspend = false;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Start the service for the given {@link OnvifDevice} and the specified profileToken
     * 
     * @param device
     * @param profileToken
     */
    public void startService(OnvifDevice device, String profileToken) {
        if (scheduledService != null) {
            // TODO Throw an exception
            return;
        }
        this.running = true;
        this.suspend = false;
        this.device = device;
        this.profileToken = profileToken;
        this.running = true;
        scheduledService = new Thread(() -> {
            try {
                Thread.sleep(initialDelay);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            while (running) {
                // TODO Change code using Condition.
                long now = System.currentTimeMillis();
                long elapsed = System.currentTimeMillis() - now;

                // Perform polling only if we are not suspended
                if (!suspend) {
                    try {
                        notifyListeners();
                    } catch (Throwable th) {
                        log.error(th.getMessage(), th);
                    }
                }
                // Compute how much we spent for retrieve data and notify it
                long toSleep = pollingPeriod - elapsed;
                try {
                    Thread.sleep(Math.max(minPollingPeriod, toSleep));
                } catch (InterruptedException e) {
                    log.error(e.getMessage());
                }
            }
        });
        scheduledService.start();
        // Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(this::notifyListeners, this.initialDelay,
        // this.pollingPeriod, TimeUnit.MILLISECONDS);
    }

    /**
     * Stop the PTZStatus Polling Service
     */
    public void stopService() {
        if (scheduledService != null) {
            this.running = false;
            // Give a chance to stop
            try {
                Thread.sleep(minPollingPeriod);
            } catch (InterruptedException e) {
                log.error(e.getMessage());
            }
            scheduledService.interrupt();
            scheduledService = null;
        }
    }

    /**
     * Suspend the PTZStatus Service
     * 
     * @throws IllegalStateException if the service has not been started
     */
    public void suspend() {
        if (!running) {
            throw new IllegalStateException("The service has not yet been started");
        }
        this.suspend = true;
    }

    /**
     * Resume the PTZStatus Service
     */
    public void resume() {
        if (!running) {
            throw new IllegalStateException("The service has not yet been started");
        }
        this.suspend = false;
    }

    /**
     * Check if the service has been suspended.
     * 
     * @return true in case the service has been suspended / false otherwise
     */
    public boolean isSuspended() {
        return suspend;
    }

    /**
     * Poll the PTZ status and notify to any registered {@link IPTZListener} of the queried values.
     */
    private void notifyListeners() {
        PTZ ptz = device.getPtz();
        PTZStatus status = ptz.getStatus(profileToken);
        PTZVector pos = status.getPosition();
        Vector2D panTilt = pos.getPanTilt();
        Vector1D zoom = pos.getZoom();

        PanTiltPositionSpace space = PanTiltPositionSpace.fromSpace(panTilt.getSpace());
        // PanTiltPositionSpace destSpace = PanTiltPositionSpace.ABSOLUTE_SPHERICAL;

        float pan = panTilt.getX();
        float tilt = panTilt.getY();
        double azimuth = OnvifHelper.toTargetDomain(pan, space.getXMin(), space.getXMax(), device.getPanStart(),
                device.getPanEnd());
        azimuth = (360 + azimuth) % 360;

        double elevation = 0;
        if (tilt <= 0) {
            elevation = OnvifHelper.toTargetDomain(tilt, space.getYMin(), 0, device.getTiltStart(), 0);
        } else {
            elevation = OnvifHelper.toTargetDomain(tilt, 0, space.getYMax(), 0, device.getTiltEnd());
        }

        ZoomPositionSpace zoomSpace = ZoomPositionSpace.fromSpace(zoom.getSpace());
        float zoomVal = zoom.getX();
        double fov = OnvifHelper.toTargetDomain(zoomVal, zoomSpace.getMin(), zoomSpace.getMax(), device.getFovMin(),
                device.getFovMax());

        // TODO Change using log parameters. Actually this is a direct conversion of a system.out
        log.info("FOV:" + fov + " Azimuth:" + azimuth + " Elevation:" + elevation + " - Pan:" + pan + " Tilt:"
                + tilt + " Zoom:" + zoomVal);

        for (IPTZListener listener : listeners) {
            try {
                listener.notifyPTZStatus(fov, azimuth, elevation);
            } catch (Exception ex) {
                log.error(ex.getMessage(), ex);
            }
        }
    }
}
