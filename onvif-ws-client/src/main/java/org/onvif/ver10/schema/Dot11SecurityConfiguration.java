
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for Dot11SecurityConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dot11SecurityConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}Dot11SecurityMode"/&gt;
 *         &lt;element name="Algorithm" type="{http://www.onvif.org/ver10/schema}Dot11Cipher" minOccurs="0"/&gt;
 *         &lt;element name="PSK" type="{http://www.onvif.org/ver10/schema}Dot11PSKSet" minOccurs="0"/&gt;
 *         &lt;element name="Dot1X" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}Dot11SecurityConfigurationExtension" minOccurs="0"/&gt;
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
@XmlType(name = "Dot11SecurityConfiguration", propOrder = {
    "mode",
    "algorithm",
    "psk",
    "dot1X",
    "extension"
})
public class Dot11SecurityConfiguration {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected Dot11SecurityMode mode;
    @XmlElement(name = "Algorithm")
    @XmlSchemaType(name = "string")
    protected Dot11Cipher algorithm;
    @XmlElement(name = "PSK")
    protected Dot11PSKSet psk;
    @XmlElement(name = "Dot1X")
    protected String dot1X;
    @XmlElement(name = "Extension")
    protected Dot11SecurityConfigurationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link Dot11SecurityMode }
     *     
     */
    public Dot11SecurityMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dot11SecurityMode }
     *     
     */
    public void setMode(Dot11SecurityMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the algorithm property.
     * 
     * @return
     *     possible object is
     *     {@link Dot11Cipher }
     *     
     */
    public Dot11Cipher getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets the value of the algorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dot11Cipher }
     *     
     */
    public void setAlgorithm(Dot11Cipher value) {
        this.algorithm = value;
    }

    /**
     * Gets the value of the psk property.
     * 
     * @return
     *     possible object is
     *     {@link Dot11PSKSet }
     *     
     */
    public Dot11PSKSet getPSK() {
        return psk;
    }

    /**
     * Sets the value of the psk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dot11PSKSet }
     *     
     */
    public void setPSK(Dot11PSKSet value) {
        this.psk = value;
    }

    /**
     * Gets the value of the dot1X property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDot1X() {
        return dot1X;
    }

    /**
     * Sets the value of the dot1X property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDot1X(String value) {
        this.dot1X = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link Dot11SecurityConfigurationExtension }
     *     
     */
    public Dot11SecurityConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dot11SecurityConfigurationExtension }
     *     
     */
    public void setExtension(Dot11SecurityConfigurationExtension value) {
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
