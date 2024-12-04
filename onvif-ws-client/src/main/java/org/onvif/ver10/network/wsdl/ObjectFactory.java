
package org.onvif.ver10.network.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import org.xmlsoap.schemas.ws._2005._04.discovery.ByeType;
import org.xmlsoap.schemas.ws._2005._04.discovery.HelloType;
import org.xmlsoap.schemas.ws._2005._04.discovery.ProbeMatchesType;
import org.xmlsoap.schemas.ws._2005._04.discovery.ProbeType;
import org.xmlsoap.schemas.ws._2005._04.discovery.ResolveType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.onvif.ver10.network.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Hello_QNAME = new QName("http://www.onvif.org/ver10/network/wsdl", "Hello");
    private final static QName _HelloResponse_QNAME = new QName("http://www.onvif.org/ver10/network/wsdl", "HelloResponse");
    private final static QName _Probe_QNAME = new QName("http://www.onvif.org/ver10/network/wsdl", "Probe");
    private final static QName _ProbeResponse_QNAME = new QName("http://www.onvif.org/ver10/network/wsdl", "ProbeResponse");
    private final static QName _Bye_QNAME = new QName("http://www.onvif.org/ver10/network/wsdl", "Bye");
    private final static QName _ByeResponse_QNAME = new QName("http://www.onvif.org/ver10/network/wsdl", "ByeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver10.network.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/network/wsdl", name = "Hello")
    public JAXBElement<HelloType> createHello(HelloType value) {
        return new JAXBElement<HelloType>(_Hello_QNAME, HelloType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResolveType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResolveType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/network/wsdl", name = "HelloResponse")
    public JAXBElement<ResolveType> createHelloResponse(ResolveType value) {
        return new JAXBElement<ResolveType>(_HelloResponse_QNAME, ResolveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProbeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProbeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/network/wsdl", name = "Probe")
    public JAXBElement<ProbeType> createProbe(ProbeType value) {
        return new JAXBElement<ProbeType>(_Probe_QNAME, ProbeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProbeMatchesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProbeMatchesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/network/wsdl", name = "ProbeResponse")
    public JAXBElement<ProbeMatchesType> createProbeResponse(ProbeMatchesType value) {
        return new JAXBElement<ProbeMatchesType>(_ProbeResponse_QNAME, ProbeMatchesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ByeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/network/wsdl", name = "Bye")
    public JAXBElement<ByeType> createBye(ByeType value) {
        return new JAXBElement<ByeType>(_Bye_QNAME, ByeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResolveType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResolveType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/network/wsdl", name = "ByeResponse")
    public JAXBElement<ResolveType> createByeResponse(ResolveType value) {
        return new JAXBElement<ResolveType>(_ByeResponse_QNAME, ResolveType.class, null, value);
    }

}
