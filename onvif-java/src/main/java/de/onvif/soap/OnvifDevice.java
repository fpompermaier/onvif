package de.onvif.soap;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import javax.xml.soap.SOAPException;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.apache.cxf.binding.soap.Soap12;
import org.apache.cxf.binding.soap.SoapBindingConfiguration;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
import org.onvif.ver10.device.wsdl.Device;
import org.onvif.ver10.device.wsdl.DeviceService;
import org.onvif.ver10.events.wsdl.EventPortType;
import org.onvif.ver10.events.wsdl.EventService;
import org.onvif.ver10.events.wsdl.PullPointSubscription;
import org.onvif.ver10.events.wsdl.PullPointSubscriptionService;
import org.onvif.ver10.media.wsdl.Media;
import org.onvif.ver10.media.wsdl.MediaService;
import org.onvif.ver10.schema.Capabilities;
import org.onvif.ver10.schema.CapabilityCategory;
import org.onvif.ver10.schema.DateTime;
import org.onvif.ver10.schema.SetDateTimeType;
import org.onvif.ver20.imaging.wsdl.ImagingPort;
import org.onvif.ver20.imaging.wsdl.ImagingService;
import org.onvif.ver20.ptz.wsdl.PTZ;
import org.onvif.ver20.ptz.wsdl.PtzService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.onvif.beans.DeviceInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Alessio Iannone - quonn77@gmail.com (minor improvements)
 * @author Robin Dick
 * 
 */
public class OnvifDevice {
    private static final Logger logger = LoggerFactory.getLogger(OnvifDevice.class);

    private String deviceIp;

    private String username;
    private String password;

    private String deviceUri;

    private Device device;
    private Media media;
    private PTZ ptz;
    private ImagingPort imaging;
    private EventPortType events;
    private PullPointSubscription pull;
    private boolean resetSystemTime;
    private boolean digestAuthentication;

    /**
     * Initializes an Onvif device, e.g. a Network Video Transmitter (NVT) with
     * logindata.
     * 
     * @param deviceIp
     *            The IP address of your device, you can also add a port but not
     *            protocol (e.g. http://)
     * @param user
     *            Username you need to login
     * @param password
     *            User's password to login
     * @param resetSystemTime
     * @throws ConnectException
     *             Exception gets thrown, if device isn't accessible or invalid and
     *             doesn't answer to SOAP messages
     * @throws SOAPException
     */
    @Builder
    private OnvifDevice(String deviceIp, String username, String password, boolean resetSystemTime,
            boolean digestAuthentication, float panStart, float panEnd, float tiltStart, float tiltEnd, float fovMin,
            float fovMax)
            throws ConnectException, SOAPException {
        this.deviceIp = deviceIp;
        if (!isOnline()) {
            throw new ConnectException("Host not available.");
        }
        this.deviceUri = "http://" + deviceIp + "/onvif/device_service";
        this.username = username;
        this.password = password;
        this.resetSystemTime = resetSystemTime;
        this.digestAuthentication = digestAuthentication;
        this.panStart = panStart;
        this.panEnd = panEnd;
        this.tiltStart = tiltStart;
        this.tiltEnd = tiltEnd;
        this.fovMin = fovMin;
        this.fovMax = fovMax;
        init();
    }

    /**
     * Set the default values for the builder
     */
    public static class OnvifDeviceBuilder {
        private String username = null;
        private String password = null;
        private boolean resetSystemTime = true;
        private boolean digestAuthentication = true;
        private float panStart = -180;
        private float panEnd = 180;
        private float tiltStart = -20;
        private float tiltEnd = 45;
        private float fovMin = 45;
        private float fovMax = 2;
        

    }

    private static OnvifDeviceBuilder builder() {
        return new OnvifDeviceBuilder();
    }

    /**
     * 
     * @param deviceIp
     * @return
     */
    public static OnvifDeviceBuilder builder(String deviceIp) {
        return builder().deviceIp(deviceIp);
    }

    /**
     * @return fovMin the minimum angular field of view as sessadecimal degree
     */
    @Getter
    private float fovMin;

    /**
     * @return fovMax the maximum angular field of view as sessadecimal degree
     */
    @Getter
    private float fovMax;

    /**
     * The start value in sessadecial degree of the panning
     * 
     * @return the Start pan angle in sessadecimal degree
     */
    @Getter
    private float panStart;

    /**
     * The end value in sesasdecimal degree of the panning
     * 
     * @return the end value of the pan angle in sessadecimal degree
     */
    @Getter
    private float panEnd;

    /**
     * The start value of the Tilt in sessadecimal degree.
     * 
     * @return the start value in sessadecimal degree of the tilt
     */
    @Getter
    private float tiltStart;

    /**
     * The end value of the Tilt in sessadecimal degree
     * return the end value in sessadecimal degree of the tilt
     */
    @Getter
    private float tiltEnd;

    // public OnvifDevice(String hostIp, String user, String password) throws ConnectException, SOAPException {
    // this.deviceIp = hostIp;
    //
    // if (!isOnline()) {
    // throw new ConnectException("Host not available.");
    // }
    //
    // this.deviceUri = "http://" + deviceIp + "/onvif/device_service";
    // this.username = user;
    // this.password = password;
    //
    // init();
    // }

    // /**
    // * Initializes an Onvif device, e.g. a Network Video Transmitter (NVT) with
    // * logindata.
    // *
    // * @param hostIp
    // * The IP address of your device, you can also add a port but noch
    // * protocol (e.g. http://)
    // * @throws ConnectException
    // * Exception gets thrown, if device isn't accessible or invalid and
    // * doesn't answer to SOAP messages
    // * @throws SOAPException
    // */
    // public OnvifDevice(String hostIp) throws ConnectException, SOAPException {
    // this(hostIp, null, null);
    // }

    /**
     * Internal function to check, if device is available and answers to ping
     * requests.
     */
    private boolean isOnline() {
        String port = deviceIp.contains(":") ? deviceIp.substring(deviceIp.indexOf(':') + 1) : "80";
        String ip = deviceIp.contains(":") ? deviceIp.substring(0, deviceIp.indexOf(':')) : deviceIp;

        Socket socket = null;
        try {
            String networkInterface = System.getProperty("networkInterface", "eth0");
            NetworkInterface ni = NetworkInterface.getByName(networkInterface);
            InetSocketAddress sockaddr = new InetSocketAddress(ip, new Integer(port));
            socket = new Socket();
            socket.bind(new InetSocketAddress(ni.getInetAddresses().nextElement(), 0));
            socket.connect(sockaddr, 5000);
        } catch (Exception e) {
            System.err.println("Unable to connect to " + deviceIp);
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException ex) {
            }
        }
        return true;
    }

    /**
     * Initializes the addresses used for SOAP messages and to get the internal IP,
     * if given IP is a proxy.
     * 
     * @throws ConnectException
     *             Get thrown if device doesn't give answers to GetCapabilities()
     * @throws SOAPException
     */
    protected void init() throws ConnectException, SOAPException {
        BindingProvider deviceServicePort = (BindingProvider) new DeviceService().getDevicePort();
        this.device = getServiceProxy(deviceServicePort, deviceUri, username, digestAuthentication)
                .create(Device.class);
        if (resetSystemTime) {
            resetSystemDateAndTime();
        }
        Capabilities capabilities = this.device.getCapabilities(Arrays.asList(CapabilityCategory.ALL));
        if (capabilities == null) {
            throw new ConnectException("Capabilities not reachable.");
        }

        // String localDeviceUri = capabilities.getDevice().getXAddr();

        if (capabilities.getMedia() != null && capabilities.getMedia().getXAddr() != null) {
            this.media = new MediaService().getMediaPort();
            this.media = getServiceProxy((BindingProvider) media, capabilities.getMedia().getXAddr(), username,
                    digestAuthentication)
                            .create(Media.class);
        }

        if (capabilities.getPTZ() != null && capabilities.getPTZ().getXAddr() != null) {
            this.ptz = new PtzService().getPtzPort();
            this.ptz = getServiceProxy((BindingProvider) ptz, capabilities.getPTZ().getXAddr(), username,
                    digestAuthentication)
                            .create(PTZ.class);
        }

        if (capabilities.getImaging() != null && capabilities.getImaging().getXAddr() != null) {
            this.imaging = new ImagingService().getImagingPort();
            this.imaging = getServiceProxy((BindingProvider) imaging, capabilities.getImaging().getXAddr(), username,
                    digestAuthentication)
                            .create(ImagingPort.class);
        }

        if (capabilities.getEvents() != null && capabilities.getEvents().getXAddr() != null) {
            this.events = new EventService().getEventPort();
            this.events = getServiceProxy((BindingProvider) events, capabilities.getEvents().getXAddr(), username,
                    digestAuthentication)
                            .create(EventPortType.class);

            this.pull = new PullPointSubscriptionService().getPullPointSubscription();
            this.pull = getServiceProxy((BindingProvider) pull, capabilities.getEvents().getXAddr(), username,
                    digestAuthentication)
                            .create(PullPointSubscription.class);
        }
    }

    /**
     * 
     * @param servicePort
     * @param serviceAddr
     * @param username
     * @param password
     * @return
     */
    public static ClientProxyFactoryBean getServiceProxy(BindingProvider servicePort, String serviceAddr,
                                                         String username, boolean useDigest) {
        ClientProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
        if (serviceAddr != null)
            proxyFactory.setAddress(serviceAddr);

        proxyFactory.setServiceClass(servicePort.getClass());
        proxyFactory.getOutInterceptors().add(new LoggingOutInterceptor());
        SoapBindingConfiguration config = new SoapBindingConfiguration();
        config.setVersion(Soap12.getInstance());
        proxyFactory.setBindingConfig(config);

        // Retrieve the device client proxy
        Client deviceClient = ClientProxy.getClient(servicePort);
        Endpoint deviceEndPoint = deviceClient.getEndpoint();

        WSS4JOutInterceptor handler = configureEndPoint(deviceEndPoint, username, useDigest);
        proxyFactory.getOutInterceptors().add(handler);

        HTTPConduit http = (HTTPConduit) deviceClient.getConduit();

        // AuthorizationPolicy authPolicy = new AuthorizationPolicy();
        // authPolicy.setUserName(username);
        // authPolicy.setPassword(password);
        // authPolicy.setAuthorizationType("Basic");
        // http.setAuthorization(authPolicy);

        HTTPClientPolicy httpClientPolicy = http.getClient();
        httpClientPolicy.setConnectionTimeout(36000);
        httpClientPolicy.setReceiveTimeout(32000);
        httpClientPolicy.setAllowChunking(false);
        return proxyFactory;
    }

    /**
     * 
     * @param deviceEndPoint
     */
    private static WSS4JOutInterceptor configureEndPoint(Endpoint deviceEndPoint, String username, boolean useDigest) {
        // Map<String, Object> inProps = new HashMap<String, Object>();
        // how to configure the properties is outlined below;
        // inProps.put(WSHandlerConstants.ACTION,WSHandlerConstants.USERNAME_TOKEN);
        // inProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
        // inProps.put(WSHandlerConstants.PW_CALLBACK_CLASS,UTPasswordCallback.class.getName());
        //
        // WSS4JInInterceptor wssIn = new WSS4JInInterceptor(inProps);
        // deviceEndPoint.getInInterceptors().add(wssIn);

        Map<String, Object> outProps = new HashMap<String, Object>();
        // how to configure the properties is outlined below;
        outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
        outProps.put(WSHandlerConstants.PASSWORD_TYPE, useDigest ? WSConstants.PW_DIGEST : WSConstants.PW_TEXT);
        outProps.put(WSHandlerConstants.USER, username);
        outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, UTPasswordCallback.class.getName());

        WSS4JOutInterceptor wssOut = new WSSUsernameTokenInterceptor(outProps);
        // wssOut.setPhase(phase);
        return wssOut;

    }

    static class WSSUsernameTokenInterceptor extends WSS4JOutInterceptor {

        public WSSUsernameTokenInterceptor(Map<String, Object> props) {
            super(props);
        }

        @Override
        public void handleMessage(SoapMessage mc) throws Fault {
            super.handleMessage(mc);
        }
    }

    private void resetSystemDateAndTime() {
        Calendar calendar = Calendar.getInstance();
        Date currentDate = new Date();
        boolean daylightSavings = calendar.getTimeZone().inDaylightTime(currentDate);
        org.onvif.ver10.schema.TimeZone timeZone = new org.onvif.ver10.schema.TimeZone();
        timeZone.setTZ(displayTimeZone(calendar.getTimeZone()));
        org.onvif.ver10.schema.Time time = new org.onvif.ver10.schema.Time();
        time.setHour(calendar.get(Calendar.HOUR_OF_DAY));
        time.setMinute(calendar.get(Calendar.MINUTE));
        time.setSecond(calendar.get(Calendar.SECOND));
        org.onvif.ver10.schema.Date date = new org.onvif.ver10.schema.Date();
        date.setYear(calendar.get(Calendar.YEAR));
        date.setMonth(calendar.get(Calendar.MONTH) + 1);
        date.setDay(calendar.get(Calendar.DAY_OF_MONTH));
        org.onvif.ver10.schema.DateTime utcDateTime = new org.onvif.ver10.schema.DateTime();
        utcDateTime.setDate(date);
        utcDateTime.setTime(time);
        device.setSystemDateAndTime(SetDateTimeType.MANUAL, daylightSavings, timeZone, utcDateTime);
    }

    private static String displayTimeZone(TimeZone tz) {
        long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
        long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset()) - TimeUnit.HOURS.toMinutes(hours);
        // avoid -4:-30 issue
        minutes = Math.abs(minutes);

        String result = "";
        if (hours > 0) {
            result = String.format("GMT+%02d:%02d", hours, minutes);
        } else {
            result = String.format("GMT%02d:%02d", hours, minutes);
        }

        return result;

    }

    /**
     * Is used for basic devices and requests of given Onvif Device
     */
    public Device getDevice() {
        return device;
    }

    public PTZ getPtz() {
        return ptz;
    }

    public Media getMedia() {
        return media;
    }

    public ImagingPort getImaging() {
        return imaging;
    }

    public EventPortType getEvents() {
        return events;
    }

    public PullPointSubscription getPull() {
        return pull;
    }

    public DateTime getDate() {
        return device.getSystemDateAndTime().getLocalDateTime();
    }

    /**
     * 
     * @return
     */
    public DeviceInfo getDeviceInfo() {
        Holder<String> manufacturer = new Holder<>();
        Holder<String> model = new Holder<>();
        Holder<String> firmwareVersion = new Holder<>();
        Holder<String> serialNumber = new Holder<>();
        Holder<String> hardwareId = new Holder<>();
        device.getDeviceInformation(manufacturer, model, firmwareVersion, serialNumber, hardwareId);
        return new DeviceInfo(manufacturer.value, model.value, firmwareVersion.value, serialNumber.value,
                hardwareId.value);
    }

    /**
     * 
     * @return
     */
    public String getHostname() {
        return device.getHostname().getName();
    }

    /**
     * 
     * @return
     * @throws ConnectException
     * @throws SOAPException
     */
    public String reboot() throws ConnectException, SOAPException {
        return device.systemReboot();
    }
}
