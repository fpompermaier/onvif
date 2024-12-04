
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for AudioDecoderConfigurationOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioDecoderConfigurationOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AACDecOptions" type="{http://www.onvif.org/ver10/schema}AACDecOptions" minOccurs="0"/&gt;
 *         &lt;element name="G711DecOptions" type="{http://www.onvif.org/ver10/schema}G711DecOptions" minOccurs="0"/&gt;
 *         &lt;element name="G726DecOptions" type="{http://www.onvif.org/ver10/schema}G726DecOptions" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}AudioDecoderConfigurationOptionsExtension" minOccurs="0"/&gt;
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
@XmlType(name = "AudioDecoderConfigurationOptions", propOrder = {
    "aacDecOptions",
    "g711DecOptions",
    "g726DecOptions",
    "extension"
})
public class AudioDecoderConfigurationOptions {

    @XmlElement(name = "AACDecOptions")
    protected AACDecOptions aacDecOptions;
    @XmlElement(name = "G711DecOptions")
    protected G711DecOptions g711DecOptions;
    @XmlElement(name = "G726DecOptions")
    protected G726DecOptions g726DecOptions;
    @XmlElement(name = "Extension")
    protected AudioDecoderConfigurationOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the aacDecOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AACDecOptions }
     *     
     */
    public AACDecOptions getAACDecOptions() {
        return aacDecOptions;
    }

    /**
     * Sets the value of the aacDecOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AACDecOptions }
     *     
     */
    public void setAACDecOptions(AACDecOptions value) {
        this.aacDecOptions = value;
    }

    /**
     * Gets the value of the g711DecOptions property.
     * 
     * @return
     *     possible object is
     *     {@link G711DecOptions }
     *     
     */
    public G711DecOptions getG711DecOptions() {
        return g711DecOptions;
    }

    /**
     * Sets the value of the g711DecOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link G711DecOptions }
     *     
     */
    public void setG711DecOptions(G711DecOptions value) {
        this.g711DecOptions = value;
    }

    /**
     * Gets the value of the g726DecOptions property.
     * 
     * @return
     *     possible object is
     *     {@link G726DecOptions }
     *     
     */
    public G726DecOptions getG726DecOptions() {
        return g726DecOptions;
    }

    /**
     * Sets the value of the g726DecOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link G726DecOptions }
     *     
     */
    public void setG726DecOptions(G726DecOptions value) {
        this.g726DecOptions = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link AudioDecoderConfigurationOptionsExtension }
     *     
     */
    public AudioDecoderConfigurationOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioDecoderConfigurationOptionsExtension }
     *     
     */
    public void setExtension(AudioDecoderConfigurationOptionsExtension value) {
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
