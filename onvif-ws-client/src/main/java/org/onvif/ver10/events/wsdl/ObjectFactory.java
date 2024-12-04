
package org.onvif.ver10.events.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.onvif.ver10.events.wsdl package. 
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

    private final static QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver10/events/wsdl", "Capabilities");
    private final static QName _CreatePullPointSubscriptionInitialTerminationTime_QNAME = new QName("http://www.onvif.org/ver10/events/wsdl", "InitialTerminationTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver10.events.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreatePullPointSubscription }
     * 
     */
    public CreatePullPointSubscription createCreatePullPointSubscription() {
        return new CreatePullPointSubscription();
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
     * Create an instance of {@link CreatePullPointSubscription.SubscriptionPolicy }
     * 
     */
    public CreatePullPointSubscription.SubscriptionPolicy createCreatePullPointSubscriptionSubscriptionPolicy() {
        return new CreatePullPointSubscription.SubscriptionPolicy();
    }

    /**
     * Create an instance of {@link CreatePullPointSubscriptionResponse }
     * 
     */
    public CreatePullPointSubscriptionResponse createCreatePullPointSubscriptionResponse() {
        return new CreatePullPointSubscriptionResponse();
    }

    /**
     * Create an instance of {@link PullMessages }
     * 
     */
    public PullMessages createPullMessages() {
        return new PullMessages();
    }

    /**
     * Create an instance of {@link PullMessagesResponse }
     * 
     */
    public PullMessagesResponse createPullMessagesResponse() {
        return new PullMessagesResponse();
    }

    /**
     * Create an instance of {@link PullMessagesFaultResponse }
     * 
     */
    public PullMessagesFaultResponse createPullMessagesFaultResponse() {
        return new PullMessagesFaultResponse();
    }

    /**
     * Create an instance of {@link Seek }
     * 
     */
    public Seek createSeek() {
        return new Seek();
    }

    /**
     * Create an instance of {@link SeekResponse }
     * 
     */
    public SeekResponse createSeekResponse() {
        return new SeekResponse();
    }

    /**
     * Create an instance of {@link SetSynchronizationPoint }
     * 
     */
    public SetSynchronizationPoint createSetSynchronizationPoint() {
        return new SetSynchronizationPoint();
    }

    /**
     * Create an instance of {@link SetSynchronizationPointResponse }
     * 
     */
    public SetSynchronizationPointResponse createSetSynchronizationPointResponse() {
        return new SetSynchronizationPointResponse();
    }

    /**
     * Create an instance of {@link GetEventProperties }
     * 
     */
    public GetEventProperties createGetEventProperties() {
        return new GetEventProperties();
    }

    /**
     * Create an instance of {@link GetEventPropertiesResponse }
     * 
     */
    public GetEventPropertiesResponse createGetEventPropertiesResponse() {
        return new GetEventPropertiesResponse();
    }

    /**
     * Create an instance of {@link org.onvif.ver10.events.wsdl.SubscriptionPolicy }
     * 
     */
    public org.onvif.ver10.events.wsdl.SubscriptionPolicy createSubscriptionPolicy() {
        return new org.onvif.ver10.events.wsdl.SubscriptionPolicy();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/events/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
        return new JAXBElement<Capabilities>(_Capabilities_QNAME, Capabilities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/events/wsdl", name = "InitialTerminationTime", scope = CreatePullPointSubscription.class)
    public JAXBElement<String> createCreatePullPointSubscriptionInitialTerminationTime(String value) {
        return new JAXBElement<String>(_CreatePullPointSubscriptionInitialTerminationTime_QNAME, String.class, CreatePullPointSubscription.class, value);
    }

}
