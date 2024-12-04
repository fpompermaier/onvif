
package org.onvif.ver10.advancedsecurity.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * <p>Java class for CertPathValidationParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertPathValidationParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequireTLSWWWClientAuthExtendedKeyUsage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UseDeltaCRLs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="anyParameters" minOccurs="0"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertPathValidationParameters", propOrder = {
    "requireTLSWWWClientAuthExtendedKeyUsage",
    "useDeltaCRLs",
    "anyParameters"
})
public class CertPathValidationParameters {

    @XmlElement(name = "RequireTLSWWWClientAuthExtendedKeyUsage", defaultValue = "false")
    protected Boolean requireTLSWWWClientAuthExtendedKeyUsage;
    @XmlElement(name = "UseDeltaCRLs", defaultValue = "false")
    protected Boolean useDeltaCRLs;
    protected CertPathValidationParameters.AnyParameters anyParameters;

    /**
     * Gets the value of the requireTLSWWWClientAuthExtendedKeyUsage property.
     * This getter has been renamed from isRequireTLSWWWClientAuthExtendedKeyUsage() to getRequireTLSWWWClientAuthExtendedKeyUsage() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRequireTLSWWWClientAuthExtendedKeyUsage() {
        return requireTLSWWWClientAuthExtendedKeyUsage;
    }

    /**
     * Sets the value of the requireTLSWWWClientAuthExtendedKeyUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireTLSWWWClientAuthExtendedKeyUsage(Boolean value) {
        this.requireTLSWWWClientAuthExtendedKeyUsage = value;
    }

    /**
     * Gets the value of the useDeltaCRLs property.
     * This getter has been renamed from isUseDeltaCRLs() to getUseDeltaCRLs() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseDeltaCRLs() {
        return useDeltaCRLs;
    }

    /**
     * Sets the value of the useDeltaCRLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDeltaCRLs(Boolean value) {
        this.useDeltaCRLs = value;
    }

    /**
     * Gets the value of the anyParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CertPathValidationParameters.AnyParameters }
     *     
     */
    public CertPathValidationParameters.AnyParameters getAnyParameters() {
        return anyParameters;
    }

    /**
     * Sets the value of the anyParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertPathValidationParameters.AnyParameters }
     *     
     */
    public void setAnyParameters(CertPathValidationParameters.AnyParameters value) {
        this.anyParameters = value;
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
    public static class AnyParameters {

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
