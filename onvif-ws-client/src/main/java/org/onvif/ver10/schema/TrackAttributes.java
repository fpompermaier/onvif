
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
 * <p>Java class for TrackAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackInformation" type="{http://www.onvif.org/ver10/schema}TrackInformation"/&gt;
 *         &lt;element name="VideoAttributes" type="{http://www.onvif.org/ver10/schema}VideoAttributes" minOccurs="0"/&gt;
 *         &lt;element name="AudioAttributes" type="{http://www.onvif.org/ver10/schema}AudioAttributes" minOccurs="0"/&gt;
 *         &lt;element name="MetadataAttributes" type="{http://www.onvif.org/ver10/schema}MetadataAttributes" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}TrackAttributesExtension" minOccurs="0"/&gt;
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
@XmlType(name = "TrackAttributes", propOrder = {
    "trackInformation",
    "videoAttributes",
    "audioAttributes",
    "metadataAttributes",
    "extension"
})
public class TrackAttributes {

    @XmlElement(name = "TrackInformation", required = true)
    protected TrackInformation trackInformation;
    @XmlElement(name = "VideoAttributes")
    protected VideoAttributes videoAttributes;
    @XmlElement(name = "AudioAttributes")
    protected AudioAttributes audioAttributes;
    @XmlElement(name = "MetadataAttributes")
    protected MetadataAttributes metadataAttributes;
    @XmlElement(name = "Extension")
    protected TrackAttributesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the trackInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TrackInformation }
     *     
     */
    public TrackInformation getTrackInformation() {
        return trackInformation;
    }

    /**
     * Sets the value of the trackInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackInformation }
     *     
     */
    public void setTrackInformation(TrackInformation value) {
        this.trackInformation = value;
    }

    /**
     * Gets the value of the videoAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link VideoAttributes }
     *     
     */
    public VideoAttributes getVideoAttributes() {
        return videoAttributes;
    }

    /**
     * Sets the value of the videoAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoAttributes }
     *     
     */
    public void setVideoAttributes(VideoAttributes value) {
        this.videoAttributes = value;
    }

    /**
     * Gets the value of the audioAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link AudioAttributes }
     *     
     */
    public AudioAttributes getAudioAttributes() {
        return audioAttributes;
    }

    /**
     * Sets the value of the audioAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioAttributes }
     *     
     */
    public void setAudioAttributes(AudioAttributes value) {
        this.audioAttributes = value;
    }

    /**
     * Gets the value of the metadataAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataAttributes }
     *     
     */
    public MetadataAttributes getMetadataAttributes() {
        return metadataAttributes;
    }

    /**
     * Sets the value of the metadataAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataAttributes }
     *     
     */
    public void setMetadataAttributes(MetadataAttributes value) {
        this.metadataAttributes = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link TrackAttributesExtension }
     *     
     */
    public TrackAttributesExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackAttributesExtension }
     *     
     */
    public void setExtension(TrackAttributesExtension value) {
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
