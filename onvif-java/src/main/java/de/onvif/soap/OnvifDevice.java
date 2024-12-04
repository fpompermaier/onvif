package de.onvif.soap;

import de.onvif.beans.DeviceInfo;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
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
import org.onvif.ver10.schema.Capabilities;
import org.onvif.ver10.schema.CapabilityCategory;
import org.onvif.ver10.schema.DateTime;
import org.onvif.ver10.schema.MediaUri;
import org.onvif.ver10.schema.SetDateTimeType;
import org.onvif.ver10.schema.StreamSetup;
import org.onvif.ver10.schema.StreamType;
import org.onvif.ver10.schema.Transport;
import org.onvif.ver10.schema.TransportProtocol;
import org.onvif.ver20.imaging.wsdl.ImagingPort;
import org.onvif.ver20.imaging.wsdl.ImagingService;
import org.onvif.ver20.ptz.wsdl.PTZ;
import org.onvif.ver20.ptz.wsdl.PtzService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Robin Dick
 * @author Modified by Brad Lowe
 */
public class OnvifDevice {
  private static final Logger logger = LoggerFactory.getLogger(OnvifDevice.class);
  private static final String DEVICE_SERVICE = "/onvif/device_service";

  private final URL url; // Example http://host:port, https://host, http://host, http://ip_address

  private Device device;
  private Media media;
  private PTZ ptz;
  private ImagingPort imaging;
  private EventPortType events;

  private static boolean verbose = false; // enable/disable logging of SOAP messages
  final SimpleSecurityHandler securityHandler;

  private static URL cleanURL(URL u) throws ConnectException {
    if (u == null) throw new ConnectException("null url not allowed");
    String f = u.getFile();
    if (!f.isEmpty()) {
      String out = u.toString().replace(f, "");
      try {
        return new URL(out);
      } catch (MalformedURLException e) {
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
      throws ConnectException, SOAPException, MalformedURLException {
    this(
        deviceIp.startsWith("http") ? new URL(deviceIp) : new URL("http://" + deviceIp),
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
  public OnvifDevice(String hostIp) throws ConnectException, SOAPException, MalformedURLException {
    this(hostIp, null, null);
  }

  /**
   * Initalizes the addresses used for SOAP messages and to get the internal IP, if given IP is a
   * proxy.
   *
   * @throws ConnectException Get thrown if device doesn't give answers to GetCapabilities()
   * @throws SOAPException
   */
  protected void init() throws ConnectException, SOAPException {

    DeviceService deviceService = new DeviceService(null, DeviceService.SERVICE);

    BindingProvider deviceServicePort = (BindingProvider) deviceService.getDevicePort();
    this.device =
        getServiceProxy(deviceServicePort, url.toString() + DEVICE_SERVICE).create(Device.class);

    // resetSystemDateAndTime();		// don't modify the camera in a constructor.. :)

    Capabilities capabilities = this.device.getCapabilities(Arrays.asList(CapabilityCategory.ALL));
    if (capabilities == null) {
      throw new ConnectException("Capabilities not reachable.");
    }

    if (capabilities.getMedia() != null && capabilities.getMedia().getXAddr() != null) {
      this.media = new MediaService().getMediaPort();
      this.media =
          getServiceProxy((BindingProvider) media, capabilities.getMedia().getXAddr())
              .create(Media.class);
    }

    if (capabilities.getPTZ() != null && capabilities.getPTZ().getXAddr() != null) {
      this.ptz = new PtzService().getPtzPort();
      this.ptz =
          getServiceProxy((BindingProvider) ptz, capabilities.getPTZ().getXAddr())
              .create(PTZ.class);
    }

    if (capabilities.getImaging() != null && capabilities.getImaging().getXAddr() != null) {
      this.imaging = new ImagingService().getImagingPort();
      this.imaging =
          getServiceProxy((BindingProvider) imaging, capabilities.getImaging().getXAddr())
              .create(ImagingPort.class);
    }

    if (capabilities.getEvents() != null && capabilities.getEvents().getXAddr() != null) {
      this.events = new EventService().getEventPort();
      this.events =
          getServiceProxy((BindingProvider) events, capabilities.getEvents().getXAddr())
              .create(EventPortType.class);
    }
  }

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
    long minutes =
        TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset()) - TimeUnit.HOURS.toMinutes(hours);
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

  /** Is used for basic devices and requests of given Onvif Device */
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
    MediaUri sceenshotUri = media.getSnapshotUri(profileToken);
    if (sceenshotUri != null) {
      return sceenshotUri.getUri();
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
    if (media.getProfiles().size() >= index)
      return getSnapshotUri(media.getProfiles().get(index).getToken());
    return "";
  }

  public String getStreamUri(int index) {
    return getStreamUri(media.getProfiles().get(index).getToken());
  }

  // returns rtsp://host[:port]/path_for_rtsp
  public String getStreamUri(String profileToken) {
    StreamSetup streamSetup = new StreamSetup();
    Transport t = new Transport();
    t.setProtocol(TransportProtocol.RTSP);
    streamSetup.setTransport(t);
    streamSetup.setStream(StreamType.RTP_UNICAST);
    MediaUri rtsp = media.getStreamUri(streamSetup, profileToken);
    return rtsp != null ? rtsp.getUri() : "";
  }

  public static boolean isVerbose() {
    return verbose;
  }

  public static void setVerbose(boolean verbose) {
    OnvifDevice.verbose = verbose;
  }
}
