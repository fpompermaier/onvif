
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * <p>Java class for VideoEncoderOptionsExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoEncoderOptionsExtension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JPEG" type="{http://www.onvif.org/ver10/schema}JpegOptions2" minOccurs="0"/&gt;
 *         &lt;element name="MPEG4" type="{http://www.onvif.org/ver10/schema}Mpeg4Options2" minOccurs="0"/&gt;
 *         &lt;element name="H264" type="{http://www.onvif.org/ver10/schema}H264Options2" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoEncoderOptionsExtension2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoEncoderOptionsExtension", propOrder = {
    "any",
    "jpeg",
    "mpeg4",
    "h264",
    "extension"
})
public class VideoEncoderOptionsExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "JPEG")
    protected JpegOptions2 jpeg;
    @XmlElement(name = "MPEG4")
    protected Mpeg4Options2 mpeg4;
    @XmlElement(name = "H264")
    protected H264Options2 h264;
    @XmlElement(name = "Extension")
    protected VideoEncoderOptionsExtension2 extension;

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
     * Gets the value of the jpeg property.
     * 
     * @return
     *     possible object is
     *     {@link JpegOptions2 }
     *     
     */
    public JpegOptions2 getJPEG() {
        return jpeg;
    }

    /**
     * Sets the value of the jpeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JpegOptions2 }
     *     
     */
    public void setJPEG(JpegOptions2 value) {
        this.jpeg = value;
    }

    /**
     * Gets the value of the mpeg4 property.
     * 
     * @return
     *     possible object is
     *     {@link Mpeg4Options2 }
     *     
     */
    public Mpeg4Options2 getMPEG4() {
        return mpeg4;
    }

    /**
     * Sets the value of the mpeg4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mpeg4Options2 }
     *     
     */
    public void setMPEG4(Mpeg4Options2 value) {
        this.mpeg4 = value;
    }

    /**
     * Gets the value of the h264 property.
     * 
     * @return
     *     possible object is
     *     {@link H264Options2 }
     *     
     */
    public H264Options2 getH264() {
        return h264;
    }

    /**
     * Sets the value of the h264 property.
     * 
     * @param value
     *     allowed object is
     *     {@link H264Options2 }
     *     
     */
    public void setH264(H264Options2 value) {
        this.h264 = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link VideoEncoderOptionsExtension2 }
     *     
     */
    public VideoEncoderOptionsExtension2 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoEncoderOptionsExtension2 }
     *     
     */
    public void setExtension(VideoEncoderOptionsExtension2 value) {
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
