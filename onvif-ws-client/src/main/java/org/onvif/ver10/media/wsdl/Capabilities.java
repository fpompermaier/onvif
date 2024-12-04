
package org.onvif.ver10.media.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * <p>Java class for Capabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Capabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProfileCapabilities" type="{http://www.onvif.org/ver10/media/wsdl}ProfileCapabilities"/&gt;
 *         &lt;element name="StreamingCapabilities" type="{http://www.onvif.org/ver10/media/wsdl}StreamingCapabilities"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SnapshotUri" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Rotation" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="VideoSourceMode" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OSD" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="EXICompression" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities", propOrder = {
    "profileCapabilities",
    "streamingCapabilities",
    "any"
})
public class Capabilities {

    @XmlElement(name = "ProfileCapabilities", required = true)
    protected ProfileCapabilities profileCapabilities;
    @XmlElement(name = "StreamingCapabilities", required = true)
    protected StreamingCapabilities streamingCapabilities;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "SnapshotUri")
    protected Boolean snapshotUri;
    @XmlAttribute(name = "Rotation")
    protected Boolean rotation;
    @XmlAttribute(name = "VideoSourceMode")
    protected Boolean videoSourceMode;
    @XmlAttribute(name = "OSD")
    protected Boolean osd;
    @XmlAttribute(name = "EXICompression")
    protected Boolean exiCompression;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the profileCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileCapabilities }
     *     
     */
    public ProfileCapabilities getProfileCapabilities() {
        return profileCapabilities;
    }

    /**
     * Sets the value of the profileCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileCapabilities }
     *     
     */
    public void setProfileCapabilities(ProfileCapabilities value) {
        this.profileCapabilities = value;
    }

    /**
     * Gets the value of the streamingCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link StreamingCapabilities }
     *     
     */
    public StreamingCapabilities getStreamingCapabilities() {
        return streamingCapabilities;
    }

    /**
     * Sets the value of the streamingCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamingCapabilities }
     *     
     */
    public void setStreamingCapabilities(StreamingCapabilities value) {
        this.streamingCapabilities = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the snapshotUri property.
     * This getter has been renamed from isSnapshotUri() to getSnapshotUri() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSnapshotUri() {
        return snapshotUri;
    }

    /**
     * Sets the value of the snapshotUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnapshotUri(Boolean value) {
        this.snapshotUri = value;
    }

    /**
     * Gets the value of the rotation property.
     * This getter has been renamed from isRotation() to getRotation() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRotation() {
        return rotation;
    }

    /**
     * Sets the value of the rotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRotation(Boolean value) {
        this.rotation = value;
    }

    /**
     * Gets the value of the videoSourceMode property.
     * This getter has been renamed from isVideoSourceMode() to getVideoSourceMode() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getVideoSourceMode() {
        return videoSourceMode;
    }

    /**
     * Sets the value of the videoSourceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVideoSourceMode(Boolean value) {
        this.videoSourceMode = value;
    }

    /**
     * Gets the value of the osd property.
     * This getter has been renamed from isOSD() to getOSD() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOSD() {
        return osd;
    }

    /**
     * Sets the value of the osd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOSD(Boolean value) {
        this.osd = value;
    }

    /**
     * Gets the value of the exiCompression property.
     * This getter has been renamed from isEXICompression() to getEXICompression() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEXICompression() {
        return exiCompression;
    }

    /**
     * Sets the value of the exiCompression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEXICompression(Boolean value) {
        this.exiCompression = value;
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
