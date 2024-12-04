
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
 * Representation of a physical video input.
 * 
 * <p>Java class for VideoSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}DeviceEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Framerate" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Resolution" type="{http://www.onvif.org/ver10/schema}VideoResolution"/&gt;
 *         &lt;element name="Imaging" type="{http://www.onvif.org/ver10/schema}ImagingSettings" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoSourceExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSource", propOrder = {
    "framerate",
    "resolution",
    "imaging",
    "extension"
})
public class VideoSource
    extends DeviceEntity
{

    @XmlElement(name = "Framerate")
    protected float framerate;
    @XmlElement(name = "Resolution", required = true)
    protected VideoResolution resolution;
    @XmlElement(name = "Imaging")
    protected ImagingSettings imaging;
    @XmlElement(name = "Extension")
    protected VideoSourceExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the framerate property.
     * 
     */
    public float getFramerate() {
        return framerate;
    }

    /**
     * Sets the value of the framerate property.
     * 
     */
    public void setFramerate(float value) {
        this.framerate = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link VideoResolution }
     *     
     */
    public VideoResolution getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoResolution }
     *     
     */
    public void setResolution(VideoResolution value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the imaging property.
     * 
     * @return
     *     possible object is
     *     {@link ImagingSettings }
     *     
     */
    public ImagingSettings getImaging() {
        return imaging;
    }

    /**
     * Sets the value of the imaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagingSettings }
     *     
     */
    public void setImaging(ImagingSettings value) {
        this.imaging = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link VideoSourceExtension }
     *     
     */
    public VideoSourceExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSourceExtension }
     *     
     */
    public void setExtension(VideoSourceExtension value) {
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
