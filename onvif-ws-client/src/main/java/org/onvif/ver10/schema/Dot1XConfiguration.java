
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * <p>Java class for Dot1XConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dot1XConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dot1XConfigurationToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AnonymousID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EAPMethod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CACertificateID" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EAPMethodConfiguration" type="{http://www.onvif.org/ver10/schema}EAPMethodConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}Dot1XConfigurationExtension" minOccurs="0"/&gt;
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
@XmlType(name = "Dot1XConfiguration", propOrder = {
    "dot1XConfigurationToken",
    "identity",
    "anonymousID",
    "eapMethod",
    "caCertificateID",
    "eapMethodConfiguration",
    "extension"
})
public class Dot1XConfiguration {

    @XmlElement(name = "Dot1XConfigurationToken", required = true)
    protected String dot1XConfigurationToken;
    @XmlElement(name = "Identity", required = true)
    protected String identity;
    @XmlElement(name = "AnonymousID")
    protected String anonymousID;
    @XmlElement(name = "EAPMethod")
    protected int eapMethod;
    @XmlElement(name = "CACertificateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> caCertificateID;
    @XmlElement(name = "EAPMethodConfiguration")
    protected EAPMethodConfiguration eapMethodConfiguration;
    @XmlElement(name = "Extension")
    protected Dot1XConfigurationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the dot1XConfigurationToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDot1XConfigurationToken() {
        return dot1XConfigurationToken;
    }

    /**
     * Sets the value of the dot1XConfigurationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDot1XConfigurationToken(String value) {
        this.dot1XConfigurationToken = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentity(String value) {
        this.identity = value;
    }

    /**
     * Gets the value of the anonymousID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnonymousID() {
        return anonymousID;
    }

    /**
     * Sets the value of the anonymousID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnonymousID(String value) {
        this.anonymousID = value;
    }

    /**
     * Gets the value of the eapMethod property.
     * 
     */
    public int getEAPMethod() {
        return eapMethod;
    }

    /**
     * Sets the value of the eapMethod property.
     * 
     */
    public void setEAPMethod(int value) {
        this.eapMethod = value;
    }

    /**
     * Gets the value of the caCertificateID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the caCertificateID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCACertificateID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCACertificateID() {
        if (caCertificateID == null) {
            caCertificateID = new ArrayList<String>();
        }
        return this.caCertificateID;
    }

    /**
     * Gets the value of the eapMethodConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link EAPMethodConfiguration }
     *     
     */
    public EAPMethodConfiguration getEAPMethodConfiguration() {
        return eapMethodConfiguration;
    }

    /**
     * Sets the value of the eapMethodConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link EAPMethodConfiguration }
     *     
     */
    public void setEAPMethodConfiguration(EAPMethodConfiguration value) {
        this.eapMethodConfiguration = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link Dot1XConfigurationExtension }
     *     
     */
    public Dot1XConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dot1XConfigurationExtension }
     *     
     */
    public void setExtension(Dot1XConfigurationExtension value) {
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
