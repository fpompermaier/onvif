
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for CertificateInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertificateID" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="IssuerDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubjectDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KeyUsage" type="{http://www.onvif.org/ver10/schema}CertificateUsage" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedKeyUsage" type="{http://www.onvif.org/ver10/schema}CertificateUsage" minOccurs="0"/&gt;
 *         &lt;element name="KeyLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SignatureAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Validity" type="{http://www.onvif.org/ver10/schema}DateTimeRange" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}CertificateInformationExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateInformation", propOrder = {
    "certificateID",
    "issuerDN",
    "subjectDN",
    "keyUsage",
    "extendedKeyUsage",
    "keyLength",
    "version",
    "serialNum",
    "signatureAlgorithm",
    "validity",
    "extension"
})
public class CertificateInformation {

    @XmlElement(name = "CertificateID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String certificateID;
    @XmlElement(name = "IssuerDN")
    protected String issuerDN;
    @XmlElement(name = "SubjectDN")
    protected String subjectDN;
    @XmlElement(name = "KeyUsage")
    protected CertificateUsage keyUsage;
    @XmlElement(name = "ExtendedKeyUsage")
    protected CertificateUsage extendedKeyUsage;
    @XmlElement(name = "KeyLength")
    protected Integer keyLength;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "SerialNum")
    protected String serialNum;
    @XmlElement(name = "SignatureAlgorithm")
    protected String signatureAlgorithm;
    @XmlElement(name = "Validity")
    protected DateTimeRange validity;
    @XmlElement(name = "Extension")
    protected CertificateInformationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the certificateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateID() {
        return certificateID;
    }

    /**
     * Sets the value of the certificateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateID(String value) {
        this.certificateID = value;
    }

    /**
     * Gets the value of the issuerDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerDN() {
        return issuerDN;
    }

    /**
     * Sets the value of the issuerDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerDN(String value) {
        this.issuerDN = value;
    }

    /**
     * Gets the value of the subjectDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectDN() {
        return subjectDN;
    }

    /**
     * Sets the value of the subjectDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectDN(String value) {
        this.subjectDN = value;
    }

    /**
     * Gets the value of the keyUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateUsage }
     *     
     */
    public CertificateUsage getKeyUsage() {
        return keyUsage;
    }

    /**
     * Sets the value of the keyUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateUsage }
     *     
     */
    public void setKeyUsage(CertificateUsage value) {
        this.keyUsage = value;
    }

    /**
     * Gets the value of the extendedKeyUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateUsage }
     *     
     */
    public CertificateUsage getExtendedKeyUsage() {
        return extendedKeyUsage;
    }

    /**
     * Sets the value of the extendedKeyUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateUsage }
     *     
     */
    public void setExtendedKeyUsage(CertificateUsage value) {
        this.extendedKeyUsage = value;
    }

    /**
     * Gets the value of the keyLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKeyLength() {
        return keyLength;
    }

    /**
     * Sets the value of the keyLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKeyLength(Integer value) {
        this.keyLength = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the serialNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNum() {
        return serialNum;
    }

    /**
     * Sets the value of the serialNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNum(String value) {
        this.serialNum = value;
    }

    /**
     * Gets the value of the signatureAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * Sets the value of the signatureAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureAlgorithm(String value) {
        this.signatureAlgorithm = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRange }
     *     
     */
    public DateTimeRange getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRange }
     *     
     */
    public void setValidity(DateTimeRange value) {
        this.validity = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateInformationExtension }
     *     
     */
    public CertificateInformationExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateInformationExtension }
     *     
     */
    public void setExtension(CertificateInformationExtension value) {
        this.extension = value;
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
