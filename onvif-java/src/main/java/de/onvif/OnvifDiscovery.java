package de.onvif;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.onvif.ver10.schema.ImagingSettings20;
import org.onvif.ver10.schema.MediaUri;
import org.onvif.ver10.schema.PTZConfiguration;
import org.onvif.ver10.schema.Profile;
import org.onvif.ver10.schema.StreamSetup;
import org.onvif.ver10.schema.StreamType;
import org.onvif.ver10.schema.Transport;
import org.onvif.ver10.schema.TransportProtocol;
import org.onvif.ver10.schema.VideoSource;
import org.onvif.ver10.schema.VideoSourceConfiguration;
import org.onvif.ver10.schema.VideoSourceExtension;

//import javax.xml.ws.EndpointReference;
//
////import org.apache.cxf.ws.discovery.WSDiscoveryClient;
//import org.onvif.ver10.network.wsdl.DiscoveryService;

import de.onvif.discovery.DeviceDiscovery;
import de.onvif.soap.OnvifDevice;
import de.onvif.soap.UTPasswordCallback;

/**
 * @author th
 * @date 2015-06-18
 */
public class OnvifDiscovery {
    public static List<URL> discoverOnvifDevices(boolean useIpv4, String... addressList) {
        final ArrayList<URL> onvifPointers = new ArrayList<>();
        final Collection<URL> urls = DeviceDiscovery.discoverWsDevicesAsUrls("^http$", ".*onvif.*", useIpv4,
                addressList);
        for (URL url : urls) {
            try {
                onvifPointers.add(url);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return onvifPointers;
    }

    public static void main(String[] args) throws IOException {
        // List<URL> onvifDevices = discoverOnvifDevices(true);
        List<URL> onvifDevices = discoverOnvifDevices(true, "192.168.150.55");
        if (onvifDevices.size() == 0)
            System.out.println("No Onvif device found");
        for (URL url : onvifDevices) {
            System.out.println("Device discovered: " + url.toString());
        }

        try {

            UTPasswordCallback.setAliasPassword("user", "pwd");
            OnvifDevice cam = OnvifDevice.builder("192.168.150.55").username("user").password("password").build();
            List<VideoSource> sources = cam.getMedia().getVideoSources();

            List<Profile> profiles = cam.getMedia().getProfiles();
            profiles.forEach(p -> {
                System.out.println("P:" + p.getName() + " Token:" + p.getToken());
            });

            StreamSetup ss = new StreamSetup();
            ss.setStream(StreamType.RTP_UNICAST);
            Transport t = new Transport();
            t.setProtocol(TransportProtocol.RTSP);
            ss.setTransport(t);

            String token = "profile_1_h264";
            MediaUri uri = cam.getMedia().getStreamUri(ss, token);
            System.out.println("URI:" + uri);
            sources.forEach(vs -> {
                VideoSourceExtension vse = vs.getExtension();
                ImagingSettings20 imageSettings = vse != null ? vse.getImaging() : null;
                System.out.println("===============================");
                StringBuilder sb = new StringBuilder("VS - Token=");
                sb.append(vs.getToken()).append(" frame rate=").append(vs.getFramerate());
                sb.append(" Res [").append(vs.getResolution().getWidth()).append(",")
                        .append(vs.getResolution().getHeight()).append("]");
                if (vse != null) {
                    sb.append(" Brightness=");
                    if (imageSettings != null) {
                        sb.append(imageSettings.getBrightness());
                    } else {
                        sb.append("NONE");
                    }
                    sb.append(" Focus=");
                    if (imageSettings.getFocus() != null) {
                        sb.append(imageSettings.getFocus().getDefaultSpeed());
                    } else {
                        sb.append("NONE");
                    }
                    sb.append(" AutoFocus=");
                    if (imageSettings.getFocus() != null) {
                        sb.append(imageSettings.getFocus().getAutoFocusMode());
                    } else {
                        sb.append("NONE");
                    }
                } else {
                    sb.append(" NO VIDEO SOURCE EXTENSION!!");
                }
                System.out.println(sb.toString());
            });
            VideoSourceConfiguration vsc = cam.getMedia().getVideoSourceConfiguration("0");

            System.out.println("VideoSourceConfiguration= " + vsc);

            List<PTZConfiguration> ptzConfigurations = cam.getPtz().getConfigurations();
            ptzConfigurations.forEach(ptzC -> {
                System.out.println("PTZConfig:" + ptzC);
            });
        } catch (SOAPException e) {
            e.printStackTrace();
        }

        // cxfDiscovery();

    }

    // @SuppressWarnings("unused")
    // private static void cxfDiscovery() throws IOException {
    // //Use WS-Discovery to find references to services that implement the changeName portType
    // String targetAddress = "soap.udp://192.168.1.53:3702";
    // WSDiscoveryClient client = new WSDiscoveryClient();
    // // Setting timeout for WS-Discovery
    // client.setDefaultProbeTimeout(1000);
    // // Use WS-discovery 1.0
    // client.setVersion10();
    // client.setSoapVersion11();
    // System.out.println("Probe:" + client.getAddress());
    // List<EndpointReference> references = client.probe(DiscoveryService.SERVICE);
    //// List<EndpointReference> references = client.probe();
    // System.out.println("The probe has been finished");
    // client.close();
    //
    // System.out.println("Found "+references.size()+" ONVIF devices");
    // //loop through all of them and have them greet me.
    //// DiscoveryService service = new DiscoveryService();
    // for (EndpointReference ref : references) {
    //// HelloType g = service.getPort(ref, HelloType.class);
    // System.out.println(ref);
    // }
    // }
}
