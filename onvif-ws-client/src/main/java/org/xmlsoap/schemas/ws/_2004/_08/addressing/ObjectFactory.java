
package org.xmlsoap.schemas.ws._2004._08.addressing;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.xmlsoap.schemas.ws._2004._08.addressing package. 
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

    private final static QName _EndpointReference_QNAME = new QName("http://schemas.xmlsoap.org/ws/2004/08/addressing", "EndpointReference");
    private final static QName _MessageID_QNAME = new QName("http://schemas.xmlsoap.org/ws/2004/08/addressing", "MessageID");
    private final static QName _RelatesTo_QNAME = new QName("http://schemas.xmlsoap.org/ws/2004/08/addressing", "RelatesTo");
    private final static QName _To_QNAME = new QName("http://schemas.xmlsoap.org/ws/2004/08/addressing", "To");
    private final static QName _Action_QNAME = new QName("http://schemas.xmlsoap.org/ws/2004/08/addressing", "Action");
    private final static QName _From_QNAME = new QName("http://schemas.xmlsoap.org/ws/2004/08/addressing", "From");
    private final static QName _ReplyTo_QNAME = new QName("http://schemas.xmlsoap.org/ws/2004/08/addressing", "ReplyTo");
    private final static QName _FaultTo_QNAME = new QName("http://schemas.xmlsoap.org/ws/2004/08/addressing", "FaultTo");
    private final static QName _ReplyAfter_QNAME = new QName("http://schemas.xmlsoap.org/ws/2004/08/addressing", "ReplyAfter");
    private final static QName _RetryAfter_QNAME = new QName("http://schemas.xmlsoap.org/ws/2004/08/addressing", "RetryAfter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.xmlsoap.schemas.ws._2004._08.addressing
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EndpointReferenceType }
     * 
     */
    public EndpointReferenceType createEndpointReferenceType() {
        return new EndpointReferenceType();
    }

    /**
     * Create an instance of {@link AttributedURI }
     * 
     */
    public AttributedURI createAttributedURI() {
        return new AttributedURI();
    }

    /**
     * Create an instance of {@link Relationship }
     * 
     */
    public Relationship createRelationship() {
        return new Relationship();
    }

    /**
     * Create an instance of {@link ReplyAfterType }
     * 
     */
    public ReplyAfterType createReplyAfterType() {
        return new ReplyAfterType();
    }

    /**
     * Create an instance of {@link RetryAfterType }
     * 
     */
    public RetryAfterType createRetryAfterType() {
        return new RetryAfterType();
    }

    /**
     * Create an instance of {@link ReferencePropertiesType }
     * 
     */
    public ReferencePropertiesType createReferencePropertiesType() {
        return new ReferencePropertiesType();
    }

    /**
     * Create an instance of {@link ReferenceParametersType }
     * 
     */
    public ReferenceParametersType createReferenceParametersType() {
        return new ReferenceParametersType();
    }

    /**
     * Create an instance of {@link ServiceNameType }
     * 
     */
    public ServiceNameType createServiceNameType() {
        return new ServiceNameType();
    }

    /**
     * Create an instance of {@link AttributedQName }
     * 
     */
    public AttributedQName createAttributedQName() {
        return new AttributedQName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", name = "EndpointReference")
    public JAXBElement<EndpointReferenceType> createEndpointReference(EndpointReferenceType value) {
        return new JAXBElement<EndpointReferenceType>(_EndpointReference_QNAME, EndpointReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedURI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttributedURI }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", name = "MessageID")
    public JAXBElement<AttributedURI> createMessageID(AttributedURI value) {
        return new JAXBElement<AttributedURI>(_MessageID_QNAME, AttributedURI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Relationship }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Relationship }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", name = "RelatesTo")
    public JAXBElement<Relationship> createRelatesTo(Relationship value) {
        return new JAXBElement<Relationship>(_RelatesTo_QNAME, Relationship.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedURI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttributedURI }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", name = "To")
    public JAXBElement<AttributedURI> createTo(AttributedURI value) {
        return new JAXBElement<AttributedURI>(_To_QNAME, AttributedURI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributedURI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttributedURI }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", name = "Action")
    public JAXBElement<AttributedURI> createAction(AttributedURI value) {
        return new JAXBElement<AttributedURI>(_Action_QNAME, AttributedURI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", name = "From")
    public JAXBElement<EndpointReferenceType> createFrom(EndpointReferenceType value) {
        return new JAXBElement<EndpointReferenceType>(_From_QNAME, EndpointReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", name = "ReplyTo")
    public JAXBElement<EndpointReferenceType> createReplyTo(EndpointReferenceType value) {
        return new JAXBElement<EndpointReferenceType>(_ReplyTo_QNAME, EndpointReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", name = "FaultTo")
    public JAXBElement<EndpointReferenceType> createFaultTo(EndpointReferenceType value) {
        return new JAXBElement<EndpointReferenceType>(_FaultTo_QNAME, EndpointReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyAfterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReplyAfterType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", name = "ReplyAfter")
    public JAXBElement<ReplyAfterType> createReplyAfter(ReplyAfterType value) {
        return new JAXBElement<ReplyAfterType>(_ReplyAfter_QNAME, ReplyAfterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetryAfterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetryAfterType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2004/08/addressing", name = "RetryAfter")
    public JAXBElement<RetryAfterType> createRetryAfter(RetryAfterType value) {
        return new JAXBElement<RetryAfterType>(_RetryAfter_QNAME, RetryAfterType.class, null, value);
    }

}
