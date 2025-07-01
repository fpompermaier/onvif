package de.onvif.soap;

import de.onvif.beans.DeviceInfo;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.Holder;
import org.apache.cxf.binding.soap.Soap12;
import org.apache.cxf.binding.soap.SoapBindingConfiguration;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.onvif.ver10.device.wsdl.Device;
import org.onvif.ver10.device.wsdl.DeviceService;
import org.onvif.ver10.events.wsdl.EventPortType;
import org.onvif.ver10.events.wsdl.EventService;
import org.onvif.ver10.media.wsdl.Media;
import org.onvif.ver10.media.wsdl.MediaService;
import org.onvif.ver10.schema.*;
import org.onvif.ver20.imaging.wsdl.ImagingPort;
import org.onvif.ver20.imaging.wsdl.ImagingService;
import org.onvif.ver20.ptz.wsdl.PTZ;
import org.onvif.ver20.ptz.wsdl.PtzService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/**
 * @author Robin Dick
 * @author Modified by Brad Lowe
 */
public class OnvifDevice {
  private static final Logger logger = LoggerFactory.getLogger(OnvifDevice.class);
  private static final String DEVICE_SERVICE = "/onvif/device_service";

  private final URL url; // Example http://host:port, https://host, http://host, http://ip_address

  private Device device;
  private volatile Media media;
  private volatile PTZ ptz;
  private volatile ImagingPort imaging;
  private volatile EventPortType events;
  public final EventService eventService = new EventService();

  // Cache capabilities to avoid repeated network requests
  private volatile Capabilities capabilities;

  private static boolean verbose = false; // enable/disable logging of SOAP messages
  final SimpleSecurityHandler securityHandler;

  private static URL cleanURL(URL u) throws ConnectException {
    if (u == null) throw new ConnectException("null url not allowed");
    String f = u.getFile();
    if (!f.isEmpty()) {
      String out = u.toString().replace(f, "");
      try {
        return new URI(out).toURL();
      } catch (MalformedURLException | URISyntaxException e) {
        throw new ConnectException("MalformedURLException " + u);
      }
    }

    return u;
  }
  /*
   * @param url is http://host or http://host:port or https://host or https://host:port
   * @param user     Username you need to login, or "" for none
   * @param password User's password to login, or "" for none
   */
  public OnvifDevice(URL url, String user, String password) throws ConnectException, SOAPException {
    this.url = cleanURL(url);
    securityHandler =
        !user.isEmpty() && !password.isEmpty() ? new SimpleSecurityHandler(user, password) : null;
    init();
  }

  /**
   * Initializes an Onvif device, e.g. a Network Video Transmitter (NVT) with logindata.
   *
   * @param deviceIp The IP address or host name of your device, you can also add a port
   * @param user Username you need to login
   * @param password User's password to login
   * @throws ConnectException Exception gets thrown, if device isn't accessible or invalid and
   *     doesn't answer to SOAP messages
   * @throws SOAPException
   */
  public OnvifDevice(String deviceIp, String user, String password)
          throws ConnectException, SOAPException, MalformedURLException, URISyntaxException {
    this(
        deviceIp.startsWith("http") ? new URI(deviceIp).toURL() : new URI("http://" + deviceIp).toURL(),
        user,
        password);
  }

  /**
   * Initializes an Onvif device, e.g. a Network Video Transmitter (NVT) with logindata.
   *
   * @param hostIp The IP address of your device, you can also add a port but noch protocol (e.g.
   *     http://)
   * @throws ConnectException Exception gets thrown, if device isn't accessible or invalid and
   *     doesn't answer to SOAP messages
   * @throws SOAPException
   */
  public OnvifDevice(String hostIp) throws ConnectException, SOAPException, MalformedURLException, URISyntaxException {
    this(hostIp, null, null);
  }

  /**
   * Initialize ONVIF device connection, only creates Device service, other services use lazy initialization
   * This strategy significantly reduces initial memory usage and startup time
   *
   * @throws ConnectException Thrown when device is inaccessible or invalid, doesn't respond to SOAP messages
   * @throws SOAPException SOAP related exceptions
   */
  protected void init() throws ConnectException, SOAPException {
    logger.debug("Initializing ONVIF device connection: {}", url);

    DeviceService deviceService = new DeviceService(null, DeviceService.SERVICE);
    BindingProvider deviceServicePort = (BindingProvider) deviceService.getDevicePort();

        // Use OnvifServiceFactory to create Device service proxy
    this.device = OnvifServiceFactory.createServiceProxy(
        deviceServicePort,
        url.toString() + DEVICE_SERVICE,
        Device.class,
        securityHandler,
        verbose
    );

    // Get and cache capabilities to avoid subsequent repeated network requests
    this.capabilities = this.device.getCapabilities(List.of(CapabilityCategory.ALL));
    if (this.capabilities == null) {
      throw new ConnectException("Capabilities not reachable.");
    }

    logger.debug("Device initialization completed, capabilities cached, other services will be initialized on demand");
    // Note: Other services (Media, PTZ, Imaging, Events) now use lazy initialization
    // They will only be created on first access, significantly reducing memory usage
  }

  /**
   * @deprecated Use OnvifServiceFactory instead for better memory management and Schema caching
   * This method is retained only to ensure backward compatibility
   */
  @Deprecated
  public JaxWsProxyFactoryBean getServiceProxy(BindingProvider servicePort, String serviceAddr) {

    JaxWsProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
    proxyFactory.getHandlers();

    if (serviceAddr != null) proxyFactory.setAddress(serviceAddr);
    proxyFactory.setServiceClass(servicePort.getClass());

    SoapBindingConfiguration config = new SoapBindingConfiguration();

    config.setVersion(Soap12.getInstance());
    proxyFactory.setBindingConfig(config);
    Client deviceClient = ClientProxy.getClient(servicePort);

    if (verbose) {
      // these logging interceptors are depreciated, but should be fine for debugging/development
      // use.
      proxyFactory.getOutInterceptors().add(new LoggingOutInterceptor());
      proxyFactory.getInInterceptors().add(new LoggingInInterceptor());
    }

    HTTPConduit http = (HTTPConduit) deviceClient.getConduit();
    if (securityHandler != null) proxyFactory.getHandlers().add(securityHandler);
    HTTPClientPolicy httpClientPolicy = http.getClient();
    httpClientPolicy.setConnectionTimeout(36000);
    httpClientPolicy.setReceiveTimeout(32000);
    httpClientPolicy.setAllowChunking(false);

    return proxyFactory;
  }

  public void resetSystemDateAndTime() {
    Calendar calendar = Calendar.getInstance();
    Date currentDate = new Date();
    boolean daylightSavings = calendar.getTimeZone().inDaylightTime(currentDate);
    org.onvif.ver10.schema.TimeZone timeZone = new org.onvif.ver10.schema.TimeZone();
    timeZone.setTZ(displayTimeZone(calendar.getTimeZone()));
    Time time = new Time();
    time.setHour(calendar.get(Calendar.HOUR_OF_DAY));
    time.setMinute(calendar.get(Calendar.MINUTE));
    time.setSecond(calendar.get(Calendar.SECOND));
    org.onvif.ver10.schema.Date date = new org.onvif.ver10.schema.Date();
    date.setYear(calendar.get(Calendar.YEAR));
    date.setMonth(calendar.get(Calendar.MONTH) + 1);
    date.setDay(calendar.get(Calendar.DAY_OF_MONTH));
    DateTime utcDateTime = new DateTime();
    utcDateTime.setDate(date);
    utcDateTime.setTime(time);
    device.setSystemDateAndTime(SetDateTimeType.MANUAL, daylightSavings, timeZone, utcDateTime);
  }

  private static String displayTimeZone(TimeZone tz) {

    long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
    long minutes =
        TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset()) - TimeUnit.HOURS.toMinutes(hours);
    // avoid -4:-30 issue
    minutes = Math.abs(minutes);

    String result;
    if (hours > 0) {
      result = String.format("GMT+%02d:%02d", hours, minutes);
    } else {
      result = String.format("GMT%02d:%02d", hours, minutes);
    }

    return result;
  }

  /** Is used for basic devices and requests of given Onvif Device */
  public Device getDevice() {
    return device;
  }

  /**
   * Get cached device capabilities information
   * This information was obtained and cached during initialization to avoid repeated network requests
   */
  public Capabilities getCapabilities() {
    return capabilities;
  }

  public PTZ getPtz() {
    initPtzService();
    return ptz;
  }

  /**
   * Lazy initialization of PTZ service
   * Uses double-checked locking pattern to ensure thread safety
   */
  private void initPtzService() {
    if (ptz == null && capabilities.getPTZ() != null && capabilities.getPTZ().getXAddr() != null) {
      synchronized (this) {
        if (ptz == null) {
          logger.debug("Lazy initializing PTZ service");
          PtzService ptzService = new PtzService();
          BindingProvider ptzServicePort = (BindingProvider) ptzService.getPtzPort();
          this.ptz = OnvifServiceFactory.createServiceProxy(
              ptzServicePort,
              capabilities.getPTZ().getXAddr(),
              PTZ.class,
              securityHandler,
              verbose
          );
        }
      }
    }
  }

  public Media getMedia() {
    initMediaService();
    return media;
  }

  /**
   * Lazy initialization of Media service
   * Uses double-checked locking pattern to ensure thread safety
   */
  private void initMediaService() {
    if (media == null && capabilities.getMedia() != null && capabilities.getMedia().getXAddr() != null) {
      synchronized (this) {
        if (media == null) {
          logger.debug("Lazy initializing Media service");
          MediaService mediaService = new MediaService();
          BindingProvider mediaServicePort = (BindingProvider) mediaService.getMediaPort();
          this.media = OnvifServiceFactory.createServiceProxy(
              mediaServicePort,
              capabilities.getMedia().getXAddr(),
              Media.class,
              securityHandler,
              verbose
          );
        }
      }
    }
  }

  public ImagingPort getImaging() {
    initImagingService();
    return imaging;
  }

  /**
   * Lazy initialization of Imaging service
   * Uses double-checked locking pattern to ensure thread safety
   */
  private void initImagingService() {
    if (imaging == null && capabilities.getImaging() != null && capabilities.getImaging().getXAddr() != null) {
      synchronized (this) {
        if (imaging == null) {
          logger.debug("Lazy initializing Imaging service");
          ImagingService imagingService = new ImagingService();
          BindingProvider imagingServicePort = (BindingProvider) imagingService.getImagingPort();
          this.imaging = OnvifServiceFactory.createServiceProxy(
              imagingServicePort,
              capabilities.getImaging().getXAddr(),
              ImagingPort.class,
              securityHandler,
              verbose
          );
        }
      }
    }
  }

  public EventPortType getEvents() {
    initEventsService();
    return events;
  }

  /**
   * Lazy initialization of Events service
   * Uses double-checked locking pattern to ensure thread safety
   */
  private void initEventsService() {
    if (events == null && capabilities.getEvents() != null && capabilities.getEvents().getXAddr() != null) {
      synchronized (this) {
        if (events == null) {
          logger.debug("Lazy initializing Events service");
          BindingProvider eventsServicePort = (BindingProvider) eventService.getEventPort();
          this.events = OnvifServiceFactory.createServiceProxy(
              eventsServicePort,
              capabilities.getEvents().getXAddr(),
              EventPortType.class,
              securityHandler,
              verbose
          );
        }
      }
    }
  }

  public DateTime getDate() {
    return device.getSystemDateAndTime().getLocalDateTime();
  }

  public DeviceInfo getDeviceInfo() {
    Holder<String> manufacturer = new Holder<>();
    Holder<String> model = new Holder<>();
    Holder<String> firmwareVersion = new Holder<>();
    Holder<String> serialNumber = new Holder<>();
    Holder<String> hardwareId = new Holder<>();
    device.getDeviceInformation(manufacturer, model, firmwareVersion, serialNumber, hardwareId);
    return new DeviceInfo(
        manufacturer.value,
        model.value,
        firmwareVersion.value,
        serialNumber.value,
        hardwareId.value);
  }

  public String getHostname() {
    return device.getHostname().getName();
  }

  public String reboot() throws ConnectException, SOAPException {
    return device.systemReboot();
  }

  // returns http://host[:port]/path_for_snapshot
  public String getSnapshotUri(String profileToken) {
    Media mediaService = getMedia();
    if (mediaService != null) {
      MediaUri sceenshotUri = mediaService.getSnapshotUri(profileToken);
      if (sceenshotUri != null) {
        return sceenshotUri.getUri();
      }
    }
    return "";
  }

  public String getSnapshotUri() {
    return getSnapshotUri(0);
  }

  public String getStreamUri() {
    return getStreamUri(0);
  }

  // Get snapshot uri for profile with index
  public String getSnapshotUri(int index) {
    Media mediaService = getMedia();
    if (mediaService != null && mediaService.getProfiles().size() > index) {
      return getSnapshotUri(mediaService.getProfiles().get(index).getToken());
    }
    return "";
  }

  public String getStreamUri(int index) {
    Media mediaService = getMedia();
    if (mediaService != null && mediaService.getProfiles().size() > index) {
      return getStreamUri(mediaService.getProfiles().get(index).getToken());
    }
    return "";
  }

  // returns rtsp://host[:port]/path_for_rtsp
  public String getStreamUri(String profileToken) {
    Media mediaService = getMedia();
    if (mediaService != null) {
      StreamSetup streamSetup = new StreamSetup();
      Transport t = new Transport();
      t.setProtocol(TransportProtocol.RTSP);
      streamSetup.setTransport(t);
      streamSetup.setStream(StreamType.RTP_UNICAST);
      MediaUri rtsp = mediaService.getStreamUri(streamSetup, profileToken);
      return rtsp != null ? rtsp.getUri() : "";
    }
    return "";
  }

  public static boolean isVerbose() {
    return verbose;
  }

  public static void setVerbose(boolean verbose) {
    OnvifDevice.verbose = verbose;
  }

  /**
   * Check if service is initialized
   */
  public boolean isServiceInitialized(String serviceName) {
    switch (serviceName.toLowerCase()) {
      case "media": return media != null;
      case "ptz": return ptz != null;
      case "imaging": return imaging != null;
      case "events": return events != null;
      case "device": return device != null;
      default: return false;
    }
  }

  /**
   * Get count of initialized services
   */
  public int getInitializedServicesCount() {
    int count = 0;
    if (device != null) count++;
    if (media != null) count++;
    if (ptz != null) count++;
    if (imaging != null) count++;
    if (events != null) count++;
    return count;
  }

  /**
   * Clean up resources and clear cache (static method, affects all instances)
   * Recommended to call when application shuts down
   */
  public static void cleanupResources() {
    OnvifServiceFactory.clearCache();
  }
}
