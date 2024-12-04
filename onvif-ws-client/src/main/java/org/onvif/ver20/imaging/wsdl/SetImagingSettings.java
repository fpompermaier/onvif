
package org.onvif.ver20.imaging.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.onvif.ver10.schema.ImagingSettings20;


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
 *         &lt;element name="VideoSourceToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="ImagingSettings" type="{http://www.onvif.org/ver10/schema}ImagingSettings20"/&gt;
 *         &lt;element name="ForcePersistence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "videoSourceToken",
    "imagingSettings",
    "forcePersistence"
})
@XmlRootElement(name = "SetImagingSettings")
public class SetImagingSettings {

    @XmlElement(name = "VideoSourceToken", required = true)
    protected String videoSourceToken;
    @XmlElement(name = "ImagingSettings", required = true)
    protected ImagingSettings20 imagingSettings;
    @XmlElement(name = "ForcePersistence")
    protected Boolean forcePersistence;

    /**
     * Gets the value of the videoSourceToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoSourceToken() {
        return videoSourceToken;
    }

    /**
     * Sets the value of the videoSourceToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoSourceToken(String value) {
        this.videoSourceToken = value;
    }

    /**
     * Gets the value of the imagingSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ImagingSettings20 }
     *     
     */
    public ImagingSettings20 getImagingSettings() {
        return imagingSettings;
    }

    /**
     * Sets the value of the imagingSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingSettings20 }
     *     
     */
    public void setImagingSettings(ImagingSettings20 value) {
        this.imagingSettings = value;
    }

    /**
     * Gets the value of the forcePersistence property.
     * This getter has been renamed from isForcePersistence() to getForcePersistence() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getForcePersistence() {
        return forcePersistence;
    }

    /**
     * Sets the value of the forcePersistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcePersistence(Boolean value) {
        this.forcePersistence = value;
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
