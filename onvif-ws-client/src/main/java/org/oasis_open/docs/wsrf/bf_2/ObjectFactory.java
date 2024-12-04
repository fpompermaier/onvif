
package org.oasis_open.docs.wsrf.bf_2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.wsrf.bf_2 package. 
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

    private final static QName _BaseFault_QNAME = new QName("http://docs.oasis-open.org/wsrf/bf-2", "BaseFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.wsrf.bf_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BaseFaultType }
     * 
     */
    public BaseFaultType createBaseFaultType() {
        return new BaseFaultType();
    }

    /**
     * Create an instance of {@link BaseFaultType.ErrorCode }
     * 
     */
    public BaseFaultType.ErrorCode createBaseFaultTypeErrorCode() {
        return new BaseFaultType.ErrorCode();
    }

    /**
     * Create an instance of {@link BaseFaultType.Description }
     * 
     */
    public BaseFaultType.Description createBaseFaultTypeDescription() {
        return new BaseFaultType.Description();
    }

    /**
     * Create an instance of {@link BaseFaultType.FaultCause }
     * 
     */
    public BaseFaultType.FaultCause createBaseFaultTypeFaultCause() {
        return new BaseFaultType.FaultCause();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaseFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/bf-2", name = "BaseFault")
    public JAXBElement<BaseFaultType> createBaseFault(BaseFaultType value) {
        return new JAXBElement<BaseFaultType>(_BaseFault_QNAME, BaseFaultType.class, null, value);
    }

}
