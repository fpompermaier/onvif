
package org.onvif.ver10.receiver.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.onvif.ver10.receiver.wsdl package. 
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

    private final static QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver10/receiver/wsdl", "Capabilities");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver10.receiver.wsdl
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
     * Create an instance of {@link GetReceivers }
     * 
     */
    public GetReceivers createGetReceivers() {
        return new GetReceivers();
    }

    /**
     * Create an instance of {@link GetReceiversResponse }
     * 
     */
    public GetReceiversResponse createGetReceiversResponse() {
        return new GetReceiversResponse();
    }

    /**
     * Create an instance of {@link GetReceiver }
     * 
     */
    public GetReceiver createGetReceiver() {
        return new GetReceiver();
    }

    /**
     * Create an instance of {@link GetReceiverResponse }
     * 
     */
    public GetReceiverResponse createGetReceiverResponse() {
        return new GetReceiverResponse();
    }

    /**
     * Create an instance of {@link CreateReceiver }
     * 
     */
    public CreateReceiver createCreateReceiver() {
        return new CreateReceiver();
    }

    /**
     * Create an instance of {@link CreateReceiverResponse }
     * 
     */
    public CreateReceiverResponse createCreateReceiverResponse() {
        return new CreateReceiverResponse();
    }

    /**
     * Create an instance of {@link DeleteReceiver }
     * 
     */
    public DeleteReceiver createDeleteReceiver() {
        return new DeleteReceiver();
    }

    /**
     * Create an instance of {@link DeleteReceiverResponse }
     * 
     */
    public DeleteReceiverResponse createDeleteReceiverResponse() {
        return new DeleteReceiverResponse();
    }

    /**
     * Create an instance of {@link ConfigureReceiver }
     * 
     */
    public ConfigureReceiver createConfigureReceiver() {
        return new ConfigureReceiver();
    }

    /**
     * Create an instance of {@link ConfigureReceiverResponse }
     * 
     */
    public ConfigureReceiverResponse createConfigureReceiverResponse() {
        return new ConfigureReceiverResponse();
    }

    /**
     * Create an instance of {@link SetReceiverMode }
     * 
     */
    public SetReceiverMode createSetReceiverMode() {
        return new SetReceiverMode();
    }

    /**
     * Create an instance of {@link SetReceiverModeResponse }
     * 
     */
    public SetReceiverModeResponse createSetReceiverModeResponse() {
        return new SetReceiverModeResponse();
    }

    /**
     * Create an instance of {@link GetReceiverState }
     * 
     */
    public GetReceiverState createGetReceiverState() {
        return new GetReceiverState();
    }

    /**
     * Create an instance of {@link GetReceiverStateResponse }
     * 
     */
    public GetReceiverStateResponse createGetReceiverStateResponse() {
        return new GetReceiverStateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/receiver/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
        return new JAXBElement<Capabilities>(_Capabilities_QNAME, Capabilities.class, null, value);
    }

}
