package de.onvif.discovery;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import jakarta.xml.soap.MessageFactory;
import jakarta.xml.soap.MimeHeaders;
import jakarta.xml.soap.SOAPBody;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPMessage;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Device discovery class to list local accessible devices probed per UDP probe messages.
 *
 * @author th
 * @version 0.1
 * @date 2015-06-18
 */
@SuppressWarnings({"unused", "UseOfSystemOutOrSystemErr", "CallToPrintStackTrace"})
public class DeviceDiscovery {
  public static final String WS_DISCOVERY_SOAP_VERSION = "SOAP 1.2 Protocol";
  public static final String WS_DISCOVERY_CONTENT_TYPE = "application/soap+xml";
  public static final int WS_DISCOVERY_TIMEOUT = 4000;
  public static final int WS_DISCOVERY_PORT = 3702;
  public static final String WS_DISCOVERY_ADDRESS_IPv4 = "239.255.255.250";

  /** IPv6 not supported yet. set enableIPv6 to true for testing if you need IP6 discovery. */
  public static final boolean enableIPv6 = false;

  public static final String WS_DISCOVERY_ADDRESS_IPv6 = "[FF02::C]";
  public static final String WS_DISCOVERY_PROBE_MESSAGE = """
            <?xml version="1.0" encoding="utf-8"?>
            <Envelope xmlns:tds="http://www.onvif.org/ver10/device/wsdl" xmlns="http://www.w3.org/2003/05/soap-envelope">
                <Header>
                    <wsa:MessageID xmlns:wsa="http://schemas.xmlsoap.org/ws/2004/08/addressing">
                        uuid:732fb73a-5681-19f5-0ad8-522c31113505
                    </wsa:MessageID>
                    <wsa:To xmlns:wsa="http://schemas.xmlsoap.org/ws/2004/08/addressing">
                        urn:schemas-xmlsoap-org:ws:2005:04:discovery
                    </wsa:To>
                    <wsa:Action xmlns:wsa="http://schemas.xmlsoap.org/ws/2004/08/addressing">
                        http://schemas.xmlsoap.org/ws/2005/04/discovery/Probe
                    </wsa:Action>
                </Header>
                <Body>
                    <Probe xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                           xmlns="http://schemas.xmlsoap.org/ws/2005/04/discovery">
                        <Types>tds:Device</Types>
                        <Scopes/>
                    </Probe>
                </Body>
            </Envelope><?xml version="1.0" encoding="utf-8"?>""";
  private static final Random random = new SecureRandom();

  public static void main(String[] args) throws InterruptedException {
    for (URL url : discoverWsDevicesAsUrls()) {
      System.out.println("Device discovered: " + url.toString());
    }
  }

  /**
   * Discover WS device on the local network and returns Urls
   *
   * @return list of unique device urls
   */
  public static Collection<URL> discoverWsDevicesAsUrls() {
    return discoverWsDevicesAsUrls("", "");
  }

  /**
   * Discover WS device on the local network with specified filter
   *
   * @param regexpProtocol url protocol matching regexp like "^http$", might be empty ""
   * @param regexpPath url path matching regexp like "onvif", might be empty ""
   * @return list of unique device urls filtered
   */
  public static Collection<URL> discoverWsDevicesAsUrls(String regexpProtocol, String regexpPath) {
    final Collection<URL> urls =
        new TreeSet<>(
            new Comparator<URL>() {
              public int compare(URL o1, URL o2) {
                return o1.toString().compareTo(o2.toString());
              }
            });
    for (String key : discoverWsDevices()) {
      try {
        final URL url = new URL(key);
        boolean ok = true;
        if (regexpProtocol.length() > 0 && !url.getProtocol().matches(regexpProtocol)) ok = false;
        if (regexpPath.length() > 0 && !url.getPath().matches(regexpPath)) ok = false;
        // ignore ip6 hosts
        if (ok && !enableIPv6 && url.getHost().startsWith("[")) ok = false;
        if (ok) urls.add(url);
      } catch (MalformedURLException e) {
        e.printStackTrace();
      }
    }
    return urls;
  }

  /**
   * Discover WS device on the local network
   *
   * @return list of unique devices access strings which might be URLs in most cases
   */
  public static Collection<String> discoverWsDevices() {
    final Collection<String> addresses = new ConcurrentSkipListSet<>();
    final CountDownLatch serverStarted = new CountDownLatch(1);
    final CountDownLatch serverFinished = new CountDownLatch(1);
    final Collection<InetAddress> addressList = new ArrayList<>();
    try {
      final Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
      if (interfaces != null) {
        while (interfaces.hasMoreElements()) {
          NetworkInterface anInterface = interfaces.nextElement();
          if (!anInterface.isLoopback()) {
            final List<InterfaceAddress> interfaceAddresses = anInterface.getInterfaceAddresses();
            for (InterfaceAddress address : interfaceAddresses) {
              Class clz = address.getAddress().getClass();

              if (!enableIPv6 && address.getAddress() instanceof Inet6Address) continue;
              addressList.add(address.getAddress());
            }
          }
        }
      }
    } catch (SocketException e) {
      e.printStackTrace();
    }

    ExecutorService executorService = Executors.newCachedThreadPool();
    for (final InetAddress address : addressList) {
      Runnable runnable =
          new Runnable() {
            public void run() {
              try {
                final String uuid = UUID.randomUUID().toString();
                final String probe =
                    WS_DISCOVERY_PROBE_MESSAGE.replaceAll(
                        "<wsa:MessageID>urn:uuid:.*</wsa:MessageID>",
                        "<wsa:MessageID>urn:uuid:" + uuid + "</wsa:MessageID>");
                final int port = random.nextInt(20000) + 40000;
                @SuppressWarnings("SocketOpenedButNotSafelyClosed")
                final DatagramSocket server = new DatagramSocket(port, address);
                new Thread() {
                  public void run() {
                    try {
                      final DatagramPacket packet = new DatagramPacket(new byte[4096], 4096);
                      server.setSoTimeout(WS_DISCOVERY_TIMEOUT);
                      long timerStarted = System.currentTimeMillis();
                      while (System.currentTimeMillis() - timerStarted < (WS_DISCOVERY_TIMEOUT)) {
                        serverStarted.countDown();
                        server.receive(packet);
                        final Collection<String> collection =
                            parseSoapResponseForUrls(
                                Arrays.copyOf(packet.getData(), packet.getLength()));
                        for (String key : collection) {
                          addresses.add(key);
                        }
                      }
                    } catch (SocketTimeoutException ignored) {
                    } catch (Exception e) {
                      e.printStackTrace();
                    } finally {
                      serverFinished.countDown();
                      server.close();
                    }
                  }
                }.start();
                try {
                  serverStarted.await(1000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
                if (address instanceof Inet4Address) {
                  server.send(
                      new DatagramPacket(
                          probe.getBytes(StandardCharsets.UTF_8),
                          probe.length(),
                          InetAddress.getByName(WS_DISCOVERY_ADDRESS_IPv4),
                          WS_DISCOVERY_PORT));
                } else {
                  if (address instanceof Inet6Address) {
                    if (enableIPv6)
                      server.send(
                          new DatagramPacket(
                              probe.getBytes(StandardCharsets.UTF_8),
                              probe.length(),
                              InetAddress.getByName(WS_DISCOVERY_ADDRESS_IPv6),
                              WS_DISCOVERY_PORT));
                  } else {
                    assert (false); // 	unknown network type.. ignore or warn developer
                  }
                }

              } catch (Exception e) {
                e.printStackTrace();
              }
              try {
                serverFinished.await((WS_DISCOVERY_TIMEOUT), TimeUnit.MILLISECONDS);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            }
          };
      executorService.submit(runnable);
    }
    try {
      executorService.shutdown();
      executorService.awaitTermination(WS_DISCOVERY_TIMEOUT + 2000, TimeUnit.MILLISECONDS);
    } catch (InterruptedException ignored) {
    }
    return addresses;
  }

  private static Collection<Node> getNodeMatching(Node body, String regexp) {
    final Collection<Node> nodes = new ArrayList<>();
    if (body.getNodeName().matches(regexp)) nodes.add(body);
    if (body.getChildNodes().getLength() == 0) return nodes;
    NodeList returnList = body.getChildNodes();
    for (int k = 0; k < returnList.getLength(); k++) {
      final Node node = returnList.item(k);
      nodes.addAll(getNodeMatching(node, regexp));
    }
    return nodes;
  }

  private static Collection<String> parseSoapResponseForUrls(byte[] data)
      throws SOAPException, IOException {
    // System.out.println(new String(data));
    final Collection<String> urls = new ArrayList<>();
    MessageFactory factory = MessageFactory.newInstance(WS_DISCOVERY_SOAP_VERSION);
    final MimeHeaders headers = new MimeHeaders();
    headers.addHeader("Content-type", WS_DISCOVERY_CONTENT_TYPE);
    SOAPMessage message = factory.createMessage(headers, new ByteArrayInputStream(data));
    SOAPBody body = message.getSOAPBody();
    for (Node node : getNodeMatching(body, ".*:XAddrs")) {
      if (node.getTextContent().length() > 0) {
        urls.addAll(Arrays.asList(node.getTextContent().split(" ")));
      }
    }
    return urls;
  }
}
