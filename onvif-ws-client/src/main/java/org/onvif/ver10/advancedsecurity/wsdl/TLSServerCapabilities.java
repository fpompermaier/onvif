
package org.onvif.ver10.advancedsecurity.wsdl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * The capabilities of a TLS server implementation on a device.
 *           
 * 
 * <p>Java class for TLSServerCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TLSServerCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TLSServerSupported" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}TLSVersions" /&gt;
 *       &lt;attribute name="MaximumNumberOfTLSCertificationPaths" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="TLSClientAuthSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MaximumNumberOfTLSCertificationPathValidationPolicies" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLSServerCapabilities", propOrder = {
    "any"
})
public class TLSServerCapabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "TLSServerSupported")
    protected List<String> tlsServerSupported;
    @XmlAttribute(name = "MaximumNumberOfTLSCertificationPaths")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumNumberOfTLSCertificationPaths;
    @XmlAttribute(name = "TLSClientAuthSupported")
    protected Boolean tlsClientAuthSupported;
    @XmlAttribute(name = "MaximumNumberOfTLSCertificationPathValidationPolicies")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumberOfTLSCertificationPathValidationPolicies;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the tlsServerSupported property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tlsServerSupported property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTLSServerSupported().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTLSServerSupported() {
        if (tlsServerSupported == null) {
            tlsServerSupported = new ArrayList<String>();
        }
        return this.tlsServerSupported;
    }

    /**
     * Gets the value of the maximumNumberOfTLSCertificationPaths property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfTLSCertificationPaths() {
        return maximumNumberOfTLSCertificationPaths;
    }

    /**
     * Sets the value of the maximumNumberOfTLSCertificationPaths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfTLSCertificationPaths(BigInteger value) {
        this.maximumNumberOfTLSCertificationPaths = value;
    }

    /**
     * Gets the value of the tlsClientAuthSupported property.
     * This getter has been renamed from isTLSClientAuthSupported() to getTLSClientAuthSupported() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTLSClientAuthSupported() {
        return tlsClientAuthSupported;
    }

    /**
     * Sets the value of the tlsClientAuthSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTLSClientAuthSupported(Boolean value) {
        this.tlsClientAuthSupported = value;
    }

    /**
     * Gets the value of the maximumNumberOfTLSCertificationPathValidationPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfTLSCertificationPathValidationPolicies() {
        return maximumNumberOfTLSCertificationPathValidationPolicies;
    }

    /**
     * Sets the value of the maximumNumberOfTLSCertificationPathValidationPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfTLSCertificationPathValidationPolicies(BigInteger value) {
        this.maximumNumberOfTLSCertificationPathValidationPolicies = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
