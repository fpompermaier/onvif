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
package de.onvif.utils;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

import org.onvif.ver10.schema.PTZSpeed;
import org.onvif.ver10.schema.Vector1D;
import org.onvif.ver10.schema.Vector2D;

import de.onvif.utils.Spaces.SpeedSpace;

/**
 * 
 * @author Alessio Iannone - quonn77@gmail.com
 */
public final class OnvifHelper {
    private final static DatatypeFactory dataFactory = initDataFactory();

    /**
     * Initialize {@link DatatypeFactory}
     * @return {@link DatatypeFactory}
     */
    private final static DatatypeFactory initDataFactory() {
        DatatypeFactory dFactory = null;
        try {
            dFactory = DatatypeFactory.newInstance();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return dFactory;
    }

    /**
     * Obtain a new instance of a Duration specifying the Duration as its string representation,
     * "PnYnMnDTnHnMnS", as defined in XML Schema 1.0 section 3.2.6.1.
     * 
     * @param duration Same as DatatypaFactory lexical representation
     * @return a new {@link Duration} object
     * 
     * @see {@link DatatypeFactory#newDuration(String)}
     */
    public final static Duration createDuration(String duration) {
        if (dataFactory == null)
            return null;
        return dataFactory.newDuration(duration);
    }

    /**
     * 
     * @param space
     * @param xVal
     * @return
     */
    public final static Vector1D createV1D(String space, float xVal) {
        Vector1D v1 = new Vector1D();
        v1.setSpace(space);
        v1.setX(xVal);
        return v1;
    }

    /**
     * 
     * @param space
     * @param xVal
     * @param yVal
     * @return
     */
    public final static Vector2D createV2D(String space, float xVal, float yVal) {
        Vector2D v2D = new Vector2D();
        v2D.setSpace(space);
        v2D.setX(xVal);
        v2D.setY(yVal);
        return v2D;
    }

    /**
     * With empty speed
     * @return
     */
    public final static PTZSpeed getDefaultSpeedEmptySpace() {
        PTZSpeed speed = new PTZSpeed();
        speed.setPanTilt(createV2D("", 0, 0));
        speed.setZoom(createV1D("", 0));
        return speed;
    }

    /**
     * Create a {@link PTZSpeed} with the PT_CONTINUOUS space for pan & tilt and ZOOM_CONTINUOUS for zoom
     * 
     * @return
     */
    public final static PTZSpeed getDefaultSpeed() {
        PTZSpeed speed = new PTZSpeed();
        speed.setPanTilt(createV2D(SpeedSpace.PT_CONTINUOUS.getSpace(), 0, 0));
        speed.setZoom(createV1D(SpeedSpace.ZOOM_CONTINUOUS.getSpace(), 0));
        return speed;
    }

    
    /**
     * Convert the input sourceDomainValue belonging to the domain (sourceDomainStart,sourceDomainEnd) to a value
     * belonging to the (targetDomainStart,targetDomainEnd)
     * 
     * @param sourceDomainValue the input value to be converted to a value belonging to the target domain
     * @param sourceDomainStart the start value of the source domain
     * @param sourceDomainEnd the end value of the source domain
     * @param targetDomainStart the start value of the target domain
     * @param targetDomainEnd the end value of the target domain
     * @return The converted value into the target domain
     */
    public static double toTargetDomain(double sourceDomainValue, double sourceDomainStart, double sourceDomainEnd,
                                        double targetDomainStart, double targetDomainEnd) {
        double deltaValue = sourceDomainValue - sourceDomainStart;
        double deltaADomain = sourceDomainEnd - sourceDomainStart;
        double deltaBDomain = targetDomainEnd - targetDomainStart;
        return (deltaValue / deltaADomain) * deltaBDomain + targetDomainStart;
    }
}
