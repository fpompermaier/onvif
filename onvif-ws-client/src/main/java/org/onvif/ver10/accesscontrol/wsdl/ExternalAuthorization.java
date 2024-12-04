
package org.onvif.ver10.accesscontrol.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
 *         &lt;element name="AccessPointToken" type="{http://www.onvif.org/ver10/pacs}ReferenceToken"/&gt;
 *         &lt;element name="CredentialToken" type="{http://www.onvif.org/ver10/pacs}ReferenceToken" minOccurs="0"/&gt;
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Decision" type="{http://www.onvif.org/ver10/accesscontrol/wsdl}Decision"/&gt;
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
    "accessPointToken",
    "credentialToken",
    "reason",
    "decision"
})
@XmlRootElement(name = "ExternalAuthorization")
public class ExternalAuthorization {

    @XmlElement(name = "AccessPointToken", required = true)
    protected String accessPointToken;
    @XmlElement(name = "CredentialToken")
    protected String credentialToken;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "Decision", required = true)
    @XmlSchemaType(name = "string")
    protected Decision decision;

    /**
     * Gets the value of the accessPointToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessPointToken() {
        return accessPointToken;
    }

    /**
     * Sets the value of the accessPointToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessPointToken(String value) {
        this.accessPointToken = value;
    }

    /**
     * Gets the value of the credentialToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialToken() {
        return credentialToken;
    }

    /**
     * Sets the value of the credentialToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialToken(String value) {
        this.credentialToken = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the decision property.
     * 
     * @return
     *     possible object is
     *     {@link Decision }
     *     
     */
    public Decision getDecision() {
        return decision;
    }

    /**
     * Sets the value of the decision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decision }
     *     
     */
    public void setDecision(Decision value) {
        this.decision = value;
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
