
package org.onvif.ver10.replay.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.onvif.ver10.replay.wsdl package. 
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

    private final static QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver10/replay/wsdl", "Capabilities");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver10.replay.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetServiceCapabilities }
     * 
     */
    public GetServiceCapabilities createGetServiceCapabilities() {
        return new GetServiceCapabilities();
    }

    /**
     * Create an instance of {@link GetServiceCapabilitiesResponse }
     * 
     */
    public GetServiceCapabilitiesResponse createGetServiceCapabilitiesResponse() {
        return new GetServiceCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link Capabilities }
     * 
     */
    public Capabilities createCapabilities() {
        return new Capabilities();
    }

    /**
     * Create an instance of {@link GetReplayUri }
     * 
     */
    public GetReplayUri createGetReplayUri() {
        return new GetReplayUri();
    }

    /**
     * Create an instance of {@link GetReplayUriResponse }
     * 
     */
    public GetReplayUriResponse createGetReplayUriResponse() {
        return new GetReplayUriResponse();
    }

    /**
     * Create an instance of {@link SetReplayConfiguration }
     * 
     */
    public SetReplayConfiguration createSetReplayConfiguration() {
        return new SetReplayConfiguration();
    }

    /**
     * Create an instance of {@link SetReplayConfigurationResponse }
     * 
     */
    public SetReplayConfigurationResponse createSetReplayConfigurationResponse() {
        return new SetReplayConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetReplayConfiguration }
     * 
     */
    public GetReplayConfiguration createGetReplayConfiguration() {
        return new GetReplayConfiguration();
    }

    /**
     * Create an instance of {@link GetReplayConfigurationResponse }
     * 
     */
    public GetReplayConfigurationResponse createGetReplayConfigurationResponse() {
        return new GetReplayConfigurationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/replay/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
        return new JAXBElement<Capabilities>(_Capabilities_QNAME, Capabilities.class, null, value);
    }

}
