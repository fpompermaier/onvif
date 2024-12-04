
package org.oasis_open.docs.wsrf.r_2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.wsrf.r_2 package. 
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

    private final static QName _ResourceUnknownFault_QNAME = new QName("http://docs.oasis-open.org/wsrf/r-2", "ResourceUnknownFault");
    private final static QName _ResourceUnavailableFault_QNAME = new QName("http://docs.oasis-open.org/wsrf/r-2", "ResourceUnavailableFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.wsrf.r_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResourceUnknownFaultType }
     * 
     */
    public ResourceUnknownFaultType createResourceUnknownFaultType() {
        return new ResourceUnknownFaultType();
    }

    /**
     * Create an instance of {@link ResourceUnavailableFaultType }
     * 
     */
    public ResourceUnavailableFaultType createResourceUnavailableFaultType() {
        return new ResourceUnavailableFaultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceUnknownFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceUnknownFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/r-2", name = "ResourceUnknownFault")
    public JAXBElement<ResourceUnknownFaultType> createResourceUnknownFault(ResourceUnknownFaultType value) {
        return new JAXBElement<ResourceUnknownFaultType>(_ResourceUnknownFault_QNAME, ResourceUnknownFaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceUnavailableFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceUnavailableFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/r-2", name = "ResourceUnavailableFault")
    public JAXBElement<ResourceUnavailableFaultType> createResourceUnavailableFault(ResourceUnavailableFaultType value) {
        return new JAXBElement<ResourceUnavailableFaultType>(_ResourceUnavailableFault_QNAME, ResourceUnavailableFaultType.class, null, value);
    }

}
