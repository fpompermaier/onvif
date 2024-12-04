
package org.onvif.ver10.advancedsecurity.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * A CSR attribute as specified in PKCS#10.
 * 
 * <p>Java class for CSRAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CSRAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="X509v3Extension" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}X509v3Extension"/&gt;
 *         &lt;element name="BasicRequestAttribute" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}BasicRequestAttribute"/&gt;
 *         &lt;element name="anyAttribute" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSRAttribute", propOrder = {
    "x509V3Extension",
    "basicRequestAttribute",
    "anyAttribute"
})
public class CSRAttribute {

    @XmlElement(name = "X509v3Extension")
    protected X509V3Extension x509V3Extension;
    @XmlElement(name = "BasicRequestAttribute")
    protected BasicRequestAttribute basicRequestAttribute;
    protected CSRAttribute.AnyAttribute anyAttribute;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the x509V3Extension property.
     * 
     * @return
     *     possible object is
     *     {@link X509V3Extension }
     *     
     */
    public X509V3Extension getX509V3Extension() {
        return x509V3Extension;
    }

    /**
     * Sets the value of the x509V3Extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link X509V3Extension }
     *     
     */
    public void setX509V3Extension(X509V3Extension value) {
        this.x509V3Extension = value;
    }

    /**
     * Gets the value of the basicRequestAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link BasicRequestAttribute }
     *     
     */
    public BasicRequestAttribute getBasicRequestAttribute() {
        return basicRequestAttribute;
    }

    /**
     * Sets the value of the basicRequestAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicRequestAttribute }
     *     
     */
    public void setBasicRequestAttribute(BasicRequestAttribute value) {
        this.basicRequestAttribute = value;
    }

    /**
     * Gets the value of the anyAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link CSRAttribute.AnyAttribute }
     *     
     */
    public CSRAttribute.AnyAttribute getAnyAttribute() {
        return anyAttribute;
    }

    /**
     * Sets the value of the anyAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSRAttribute.AnyAttribute }
     *     
     */
    public void setAnyAttribute(CSRAttribute.AnyAttribute value) {
        this.anyAttribute = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class AnyAttribute {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

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
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
        }

    }

}
