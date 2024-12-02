package org.onvif.ver10.advancedsecurity.wsdl;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.1
 * Generated source version: 4.0.1
 *
 */
@WebServiceClient(name = "AdvancedSecurityService",
                  wsdlLocation = "null",
                  targetNamespace = "http://www.onvif.org/ver10/advancedsecurity/wsdl")
public class AdvancedSecurityService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.onvif.org/ver10/advancedsecurity/wsdl", "AdvancedSecurityService");
    public final static QName TLSServerPort = new QName("http://www.onvif.org/ver10/advancedsecurity/wsdl", "TLSServerPort");
    public final static QName KeystorePort = new QName("http://www.onvif.org/ver10/advancedsecurity/wsdl", "KeystorePort");
    public final static QName AdvancedSecurityServicePort = new QName("http://www.onvif.org/ver10/advancedsecurity/wsdl", "AdvancedSecurityServicePort");
    static {
        WSDL_LOCATION = null;
    }

    public AdvancedSecurityService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AdvancedSecurityService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdvancedSecurityService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public AdvancedSecurityService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AdvancedSecurityService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AdvancedSecurityService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns TLSServer
     */
    @WebEndpoint(name = "TLSServerPort")
    public TLSServer getTLSServerPort() {
        return super.getPort(TLSServerPort, TLSServer.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TLSServer
     */
    @WebEndpoint(name = "TLSServerPort")
    public TLSServer getTLSServerPort(WebServiceFeature... features) {
        return super.getPort(TLSServerPort, TLSServer.class, features);
    }


    /**
     *
     * @return
     *     returns Keystore
     */
    @WebEndpoint(name = "KeystorePort")
    public Keystore getKeystorePort() {
        return super.getPort(KeystorePort, Keystore.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Keystore
     */
    @WebEndpoint(name = "KeystorePort")
    public Keystore getKeystorePort(WebServiceFeature... features) {
        return super.getPort(KeystorePort, Keystore.class, features);
    }


    /**
     *
     * @return
     *     returns AdvancedSecurityService
     */
    @WebEndpoint(name = "AdvancedSecurityServicePort")
    public AdvancedSecurityService getAdvancedSecurityServicePort() {
        return super.getPort(AdvancedSecurityServicePort, AdvancedSecurityService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdvancedSecurityService
     */
    @WebEndpoint(name = "AdvancedSecurityServicePort")
    public AdvancedSecurityService getAdvancedSecurityServicePort(WebServiceFeature... features) {
        return super.getPort(AdvancedSecurityServicePort, AdvancedSecurityService.class, features);
    }

}
