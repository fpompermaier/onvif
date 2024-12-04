
package org.onvif.ver10.advancedsecurity.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
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
 *         &lt;element name="OldCertPathValidationPolicyID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertPathValidationPolicyID"/&gt;
 *         &lt;element name="NewCertPathValidationPolicyID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}CertPathValidationPolicyID"/&gt;
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
    "oldCertPathValidationPolicyID",
    "newCertPathValidationPolicyID"
})
@XmlRootElement(name = "ReplaceCertPathValidationPolicyAssignment")
public class ReplaceCertPathValidationPolicyAssignment {

    @XmlElement(name = "OldCertPathValidationPolicyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String oldCertPathValidationPolicyID;
    @XmlElement(name = "NewCertPathValidationPolicyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String newCertPathValidationPolicyID;

    /**
     * Gets the value of the oldCertPathValidationPolicyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldCertPathValidationPolicyID() {
        return oldCertPathValidationPolicyID;
    }

    /**
     * Sets the value of the oldCertPathValidationPolicyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldCertPathValidationPolicyID(String value) {
        this.oldCertPathValidationPolicyID = value;
    }

    /**
     * Gets the value of the newCertPathValidationPolicyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCertPathValidationPolicyID() {
        return newCertPathValidationPolicyID;
    }

    /**
     * Sets the value of the newCertPathValidationPolicyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCertPathValidationPolicyID(String value) {
        this.newCertPathValidationPolicyID = value;
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
