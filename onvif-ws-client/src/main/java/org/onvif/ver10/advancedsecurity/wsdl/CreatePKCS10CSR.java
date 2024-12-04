
package org.onvif.ver10.advancedsecurity.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


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
 *         &lt;element name="Subject" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DistinguishedName"/&gt;
 *         &lt;element name="KeyID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}KeyID"/&gt;
 *         &lt;element name="CSRAttribute" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CSRAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SignatureAlgorithm" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}AlgorithmIdentifier"/&gt;
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
    "subject",
    "keyID",
    "csrAttribute",
    "signatureAlgorithm"
})
@XmlRootElement(name = "CreatePKCS10CSR")
public class CreatePKCS10CSR {

    @XmlElement(name = "Subject", required = true)
    protected DistinguishedName subject;
    @XmlElement(name = "KeyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String keyID;
    @XmlElement(name = "CSRAttribute")
    protected List<CSRAttribute> csrAttribute;
    @XmlElement(name = "SignatureAlgorithm", required = true)
    protected AlgorithmIdentifier signatureAlgorithm;

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link DistinguishedName }
     *     
     */
    public DistinguishedName getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinguishedName }
     *     
     */
    public void setSubject(DistinguishedName value) {
        this.subject = value;
    }

    /**
     * Gets the value of the keyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyID() {
        return keyID;
    }

    /**
     * Sets the value of the keyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyID(String value) {
        this.keyID = value;
    }

    /**
     * Gets the value of the csrAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the csrAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCSRAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CSRAttribute }
     * 
     * 
     */
    public List<CSRAttribute> getCSRAttribute() {
        if (csrAttribute == null) {
            csrAttribute = new ArrayList<CSRAttribute>();
        }
        return this.csrAttribute;
    }

    /**
     * Gets the value of the signatureAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentifier }
     *     
     */
    public AlgorithmIdentifier getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * Sets the value of the signatureAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentifier }
     *     
     */
    public void setSignatureAlgorithm(AlgorithmIdentifier value) {
        this.signatureAlgorithm = value;
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
