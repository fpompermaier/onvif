
package org.onvif.ver10.advancedsecurity.wsdl;

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
 *         &lt;element name="CertWithPrivateKey" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}Base64DERencodedASN1Value"/&gt;
 *         &lt;element name="CertificationPathAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KeyAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IgnoreAdditionalCertificates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IntegrityPassphraseID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}PassphraseID" minOccurs="0"/&gt;
 *         &lt;element name="EncryptionPassphraseID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}PassphraseID" minOccurs="0"/&gt;
 *         &lt;element name="Passphrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "certWithPrivateKey",
    "certificationPathAlias",
    "keyAlias",
    "ignoreAdditionalCertificates",
    "integrityPassphraseID",
    "encryptionPassphraseID",
    "passphrase"
})
@XmlRootElement(name = "UploadCertificateWithPrivateKeyInPKCS12")
public class UploadCertificateWithPrivateKeyInPKCS12 {

    @XmlElement(name = "CertWithPrivateKey", required = true)
    protected byte[] certWithPrivateKey;
    @XmlElement(name = "CertificationPathAlias")
    protected String certificationPathAlias;
    @XmlElement(name = "KeyAlias")
    protected String keyAlias;
    @XmlElement(name = "IgnoreAdditionalCertificates", defaultValue = "false")
    protected Boolean ignoreAdditionalCertificates;
    @XmlElement(name = "IntegrityPassphraseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String integrityPassphraseID;
    @XmlElement(name = "EncryptionPassphraseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String encryptionPassphraseID;
    @XmlElement(name = "Passphrase")
    protected String passphrase;

    /**
     * Gets the value of the certWithPrivateKey property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCertWithPrivateKey() {
        return certWithPrivateKey;
    }

    /**
     * Sets the value of the certWithPrivateKey property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCertWithPrivateKey(byte[] value) {
        this.certWithPrivateKey = value;
    }

    /**
     * Gets the value of the certificationPathAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationPathAlias() {
        return certificationPathAlias;
    }

    /**
     * Sets the value of the certificationPathAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationPathAlias(String value) {
        this.certificationPathAlias = value;
    }

    /**
     * Gets the value of the keyAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyAlias() {
        return keyAlias;
    }

    /**
     * Sets the value of the keyAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyAlias(String value) {
        this.keyAlias = value;
    }

    /**
     * Gets the value of the ignoreAdditionalCertificates property.
     * This getter has been renamed from isIgnoreAdditionalCertificates() to getIgnoreAdditionalCertificates() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIgnoreAdditionalCertificates() {
        return ignoreAdditionalCertificates;
    }

    /**
     * Sets the value of the ignoreAdditionalCertificates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreAdditionalCertificates(Boolean value) {
        this.ignoreAdditionalCertificates = value;
    }

    /**
     * Gets the value of the integrityPassphraseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegrityPassphraseID() {
        return integrityPassphraseID;
    }

    /**
     * Sets the value of the integrityPassphraseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegrityPassphraseID(String value) {
        this.integrityPassphraseID = value;
    }

    /**
     * Gets the value of the encryptionPassphraseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionPassphraseID() {
        return encryptionPassphraseID;
    }

    /**
     * Sets the value of the encryptionPassphraseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionPassphraseID(String value) {
        this.encryptionPassphraseID = value;
    }

    /**
     * Gets the value of the passphrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassphrase() {
        return passphrase;
    }

    /**
     * Sets the value of the passphrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassphrase(String value) {
        this.passphrase = value;
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
