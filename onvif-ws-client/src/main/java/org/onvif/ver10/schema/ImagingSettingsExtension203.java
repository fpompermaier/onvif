
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for ImagingSettingsExtension203 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImagingSettingsExtension203"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ToneCompensation" type="{http://www.onvif.org/ver10/schema}ToneCompensation" minOccurs="0"/&gt;
 *         &lt;element name="Defogging" type="{http://www.onvif.org/ver10/schema}Defogging" minOccurs="0"/&gt;
 *         &lt;element name="NoiseReduction" type="{http://www.onvif.org/ver10/schema}NoiseReduction" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingSettingsExtension204" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingSettingsExtension203", propOrder = {
    "toneCompensation",
    "defogging",
    "noiseReduction",
    "extension"
})
public class ImagingSettingsExtension203 {

    @XmlElement(name = "ToneCompensation")
    protected ToneCompensation toneCompensation;
    @XmlElement(name = "Defogging")
    protected Defogging defogging;
    @XmlElement(name = "NoiseReduction")
    protected NoiseReduction noiseReduction;
    @XmlElement(name = "Extension")
    protected ImagingSettingsExtension204 extension;

    /**
     * Gets the value of the toneCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link ToneCompensation }
     *     
     */
    public ToneCompensation getToneCompensation() {
        return toneCompensation;
    }

    /**
     * Sets the value of the toneCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToneCompensation }
     *     
     */
    public void setToneCompensation(ToneCompensation value) {
        this.toneCompensation = value;
    }

    /**
     * Gets the value of the defogging property.
     * 
     * @return
     *     possible object is
     *     {@link Defogging }
     *     
     */
    public Defogging getDefogging() {
        return defogging;
    }

    /**
     * Sets the value of the defogging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Defogging }
     *     
     */
    public void setDefogging(Defogging value) {
        this.defogging = value;
    }

    /**
     * Gets the value of the noiseReduction property.
     * 
     * @return
     *     possible object is
     *     {@link NoiseReduction }
     *     
     */
    public NoiseReduction getNoiseReduction() {
        return noiseReduction;
    }

    /**
     * Sets the value of the noiseReduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoiseReduction }
     *     
     */
    public void setNoiseReduction(NoiseReduction value) {
        this.noiseReduction = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ImagingSettingsExtension204 }
     *     
     */
    public ImagingSettingsExtension204 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingSettingsExtension204 }
     *     
     */
    public void setExtension(ImagingSettingsExtension204 value) {
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
