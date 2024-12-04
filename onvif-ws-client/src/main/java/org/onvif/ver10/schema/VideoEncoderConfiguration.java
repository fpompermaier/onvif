
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * <p>Java class for VideoEncoderConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoEncoderConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Encoding" type="{http://www.onvif.org/ver10/schema}VideoEncoding"/&gt;
 *         &lt;element name="Resolution" type="{http://www.onvif.org/ver10/schema}VideoResolution"/&gt;
 *         &lt;element name="Quality" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="RateControl" type="{http://www.onvif.org/ver10/schema}VideoRateControl" minOccurs="0"/&gt;
 *         &lt;element name="MPEG4" type="{http://www.onvif.org/ver10/schema}Mpeg4Configuration" minOccurs="0"/&gt;
 *         &lt;element name="H264" type="{http://www.onvif.org/ver10/schema}H264Configuration" minOccurs="0"/&gt;
 *         &lt;element name="Multicast" type="{http://www.onvif.org/ver10/schema}MulticastConfiguration"/&gt;
 *         &lt;element name="SessionTimeout" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "VideoEncoderConfiguration", propOrder = {
    "encoding",
    "resolution",
    "quality",
    "rateControl",
    "mpeg4",
    "h264",
    "multicast",
    "sessionTimeout",
    "any"
})
public class VideoEncoderConfiguration
    extends ConfigurationEntity
{

    @XmlElement(name = "Encoding", required = true)
    @XmlSchemaType(name = "string")
    protected VideoEncoding encoding;
    @XmlElement(name = "Resolution", required = true)
    protected VideoResolution resolution;
    @XmlElement(name = "Quality")
    protected float quality;
    @XmlElement(name = "RateControl")
    protected VideoRateControl rateControl;
    @XmlElement(name = "MPEG4")
    protected Mpeg4Configuration mpeg4;
    @XmlElement(name = "H264")
    protected H264Configuration h264;
    @XmlElement(name = "Multicast", required = true)
    protected MulticastConfiguration multicast;
    @XmlElement(name = "SessionTimeout", required = true)
    protected Duration sessionTimeout;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link VideoEncoding }
     *     
     */
    public VideoEncoding getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoEncoding }
     *     
     */
    public void setEncoding(VideoEncoding value) {
        this.encoding = value;
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
     * Gets the value of the quality property.
     * 
     */
    public float getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     */
    public void setQuality(float value) {
        this.quality = value;
    }

    /**
     * Gets the value of the rateControl property.
     * 
     * @return
     *     possible object is
     *     {@link VideoRateControl }
     *     
     */
    public VideoRateControl getRateControl() {
        return rateControl;
    }

    /**
     * Sets the value of the rateControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoRateControl }
     *     
     */
    public void setRateControl(VideoRateControl value) {
        this.rateControl = value;
    }

    /**
     * Gets the value of the mpeg4 property.
     * 
     * @return
     *     possible object is
     *     {@link Mpeg4Configuration }
     *     
     */
    public Mpeg4Configuration getMPEG4() {
        return mpeg4;
    }

    /**
     * Sets the value of the mpeg4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mpeg4Configuration }
     *     
     */
    public void setMPEG4(Mpeg4Configuration value) {
        this.mpeg4 = value;
    }

    /**
     * Gets the value of the h264 property.
     * 
     * @return
     *     possible object is
     *     {@link H264Configuration }
     *     
     */
    public H264Configuration getH264() {
        return h264;
    }

    /**
     * Sets the value of the h264 property.
     * 
     * @param value
     *     allowed object is
     *     {@link H264Configuration }
     *     
     */
    public void setH264(H264Configuration value) {
        this.h264 = value;
    }

    /**
     * Gets the value of the multicast property.
     * 
     * @return
     *     possible object is
     *     {@link MulticastConfiguration }
     *     
     */
    public MulticastConfiguration getMulticast() {
        return multicast;
    }

    /**
     * Sets the value of the multicast property.
     * 
     * @param value
     *     allowed object is
     *     {@link MulticastConfiguration }
     *     
     */
    public void setMulticast(MulticastConfiguration value) {
        this.multicast = value;
    }

    /**
     * Gets the value of the sessionTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSessionTimeout() {
        return sessionTimeout;
    }

    /**
     * Sets the value of the sessionTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSessionTimeout(Duration value) {
        this.sessionTimeout = value;
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
     * {@link java.lang.Object }
     * {@link Element }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
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
