package org.onvif.ver10.doorcontrol.wsdl;

import java.net.URI;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.5
 * Generated source version: 4.0.5
 *
 */
@WebServiceClient(name = "DoorControlService",
                  wsdlLocation = "null",
                  targetNamespace = "http://www.onvif.org/ver10/doorcontrol/wsdl")
public class DoorControlService extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("http://www.onvif.org/ver10/doorcontrol/wsdl", "DoorControlService");
    public static final QName DoorControlPort = new QName("http://www.onvif.org/ver10/doorcontrol/wsdl", "DoorControlPort");
    static {
        WSDL_LOCATION = null;
    }

    public DoorControlService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DoorControlService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DoorControlService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public DoorControlService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public DoorControlService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public DoorControlService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns DoorControlPort
     */
    @WebEndpoint(name = "DoorControlPort")
    public DoorControlPort getDoorControlPort() {
        return super.getPort(DoorControlPort, DoorControlPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DoorControlPort
     */
    @WebEndpoint(name = "DoorControlPort")
    public DoorControlPort getDoorControlPort(WebServiceFeature... features) {
        return super.getPort(DoorControlPort, DoorControlPort.class, features);
    }

}
