
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
 * <p>Java class for WhiteBalance20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WhiteBalance20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}WhiteBalanceMode"/&gt;
 *         &lt;element name="CrGain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="CbGain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}WhiteBalance20Extension" minOccurs="0"/&gt;
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
@XmlType(name = "WhiteBalance20", propOrder = {
    "mode",
    "crGain",
    "cbGain",
    "extension"
})
public class WhiteBalance20 {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected WhiteBalanceMode mode;
    @XmlElement(name = "CrGain")
    protected Float crGain;
    @XmlElement(name = "CbGain")
    protected Float cbGain;
    @XmlElement(name = "Extension")
    protected WhiteBalance20Extension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link WhiteBalanceMode }
     *     
     */
    public WhiteBalanceMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteBalanceMode }
     *     
     */
    public void setMode(WhiteBalanceMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the crGain property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCrGain() {
        return crGain;
    }

    /**
     * Sets the value of the crGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCrGain(Float value) {
        this.crGain = value;
    }

    /**
     * Gets the value of the cbGain property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCbGain() {
        return cbGain;
    }

    /**
     * Sets the value of the cbGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCbGain(Float value) {
        this.cbGain = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link WhiteBalance20Extension }
     *     
     */
    public WhiteBalance20Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteBalance20Extension }
     *     
     */
    public void setExtension(WhiteBalance20Extension value) {
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
