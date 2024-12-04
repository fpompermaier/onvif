
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for ImagingOptions20Extension3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImagingOptions20Extension3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ToneCompensationOptions" type="{http://www.onvif.org/ver10/schema}ToneCompensationOptions" minOccurs="0"/&gt;
 *         &lt;element name="DefoggingOptions" type="{http://www.onvif.org/ver10/schema}DefoggingOptions" minOccurs="0"/&gt;
 *         &lt;element name="NoiseReductionOptions" type="{http://www.onvif.org/ver10/schema}NoiseReductionOptions" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingOptions20Extension4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingOptions20Extension3", propOrder = {
    "toneCompensationOptions",
    "defoggingOptions",
    "noiseReductionOptions",
    "extension"
})
public class ImagingOptions20Extension3 {

    @XmlElement(name = "ToneCompensationOptions")
    protected ToneCompensationOptions toneCompensationOptions;
    @XmlElement(name = "DefoggingOptions")
    protected DefoggingOptions defoggingOptions;
    @XmlElement(name = "NoiseReductionOptions")
    protected NoiseReductionOptions noiseReductionOptions;
    @XmlElement(name = "Extension")
    protected ImagingOptions20Extension4 extension;

    /**
     * Gets the value of the toneCompensationOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ToneCompensationOptions }
     *     
     */
    public ToneCompensationOptions getToneCompensationOptions() {
        return toneCompensationOptions;
    }

    /**
     * Sets the value of the toneCompensationOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToneCompensationOptions }
     *     
     */
    public void setToneCompensationOptions(ToneCompensationOptions value) {
        this.toneCompensationOptions = value;
    }

    /**
     * Gets the value of the defoggingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DefoggingOptions }
     *     
     */
    public DefoggingOptions getDefoggingOptions() {
        return defoggingOptions;
    }

    /**
     * Sets the value of the defoggingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefoggingOptions }
     *     
     */
    public void setDefoggingOptions(DefoggingOptions value) {
        this.defoggingOptions = value;
    }

    /**
     * Gets the value of the noiseReductionOptions property.
     * 
     * @return
     *     possible object is
     *     {@link NoiseReductionOptions }
     *     
     */
    public NoiseReductionOptions getNoiseReductionOptions() {
        return noiseReductionOptions;
    }

    /**
     * Sets the value of the noiseReductionOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoiseReductionOptions }
     *     
     */
    public void setNoiseReductionOptions(NoiseReductionOptions value) {
        this.noiseReductionOptions = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ImagingOptions20Extension4 }
     *     
     */
    public ImagingOptions20Extension4 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingOptions20Extension4 }
     *     
     */
    public void setExtension(ImagingOptions20Extension4 value) {
        this.extension = value;
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
