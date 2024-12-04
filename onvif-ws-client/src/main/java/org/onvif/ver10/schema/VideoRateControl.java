
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for VideoRateControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoRateControl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FrameRateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EncodingInterval" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BitrateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoRateControl", propOrder = {
    "frameRateLimit",
    "encodingInterval",
    "bitrateLimit"
})
public class VideoRateControl {

    @XmlElement(name = "FrameRateLimit")
    protected int frameRateLimit;
    @XmlElement(name = "EncodingInterval")
    protected int encodingInterval;
    @XmlElement(name = "BitrateLimit")
    protected int bitrateLimit;

    /**
     * Gets the value of the frameRateLimit property.
     * 
     */
    public int getFrameRateLimit() {
        return frameRateLimit;
    }

    /**
     * Sets the value of the frameRateLimit property.
     * 
     */
    public void setFrameRateLimit(int value) {
        this.frameRateLimit = value;
    }

    /**
     * Gets the value of the encodingInterval property.
     * 
     */
    public int getEncodingInterval() {
        return encodingInterval;
    }

    /**
     * Sets the value of the encodingInterval property.
     * 
     */
    public void setEncodingInterval(int value) {
        this.encodingInterval = value;
    }

    /**
     * Gets the value of the bitrateLimit property.
     * 
     */
    public int getBitrateLimit() {
        return bitrateLimit;
    }

    /**
     * Sets the value of the bitrateLimit property.
     * 
     */
    public void setBitrateLimit(int value) {
        this.bitrateLimit = value;
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
