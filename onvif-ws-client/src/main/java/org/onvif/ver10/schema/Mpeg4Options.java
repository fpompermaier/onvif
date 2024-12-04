
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for Mpeg4Options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mpeg4Options"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResolutionsAvailable" type="{http://www.onvif.org/ver10/schema}VideoResolution" maxOccurs="unbounded"/&gt;
 *         &lt;element name="GovLengthRange" type="{http://www.onvif.org/ver10/schema}IntRange"/&gt;
 *         &lt;element name="FrameRateRange" type="{http://www.onvif.org/ver10/schema}IntRange"/&gt;
 *         &lt;element name="EncodingIntervalRange" type="{http://www.onvif.org/ver10/schema}IntRange"/&gt;
 *         &lt;element name="Mpeg4ProfilesSupported" type="{http://www.onvif.org/ver10/schema}Mpeg4Profile" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mpeg4Options", propOrder = {
    "resolutionsAvailable",
    "govLengthRange",
    "frameRateRange",
    "encodingIntervalRange",
    "mpeg4ProfilesSupported"
})
@XmlSeeAlso({
    Mpeg4Options2 .class
})
public class Mpeg4Options {

    @XmlElement(name = "ResolutionsAvailable", required = true)
    protected List<VideoResolution> resolutionsAvailable;
    @XmlElement(name = "GovLengthRange", required = true)
    protected IntRange govLengthRange;
    @XmlElement(name = "FrameRateRange", required = true)
    protected IntRange frameRateRange;
    @XmlElement(name = "EncodingIntervalRange", required = true)
    protected IntRange encodingIntervalRange;
    @XmlElement(name = "Mpeg4ProfilesSupported", required = true)
    @XmlSchemaType(name = "string")
    protected List<Mpeg4Profile> mpeg4ProfilesSupported;

    /**
     * Gets the value of the resolutionsAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the resolutionsAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolutionsAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoResolution }
     * 
     * 
     */
    public List<VideoResolution> getResolutionsAvailable() {
        if (resolutionsAvailable == null) {
            resolutionsAvailable = new ArrayList<VideoResolution>();
        }
        return this.resolutionsAvailable;
    }

    /**
     * Gets the value of the govLengthRange property.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getGovLengthRange() {
        return govLengthRange;
    }

    /**
     * Sets the value of the govLengthRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setGovLengthRange(IntRange value) {
        this.govLengthRange = value;
    }

    /**
     * Gets the value of the frameRateRange property.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getFrameRateRange() {
        return frameRateRange;
    }

    /**
     * Sets the value of the frameRateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setFrameRateRange(IntRange value) {
        this.frameRateRange = value;
    }

    /**
     * Gets the value of the encodingIntervalRange property.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getEncodingIntervalRange() {
        return encodingIntervalRange;
    }

    /**
     * Sets the value of the encodingIntervalRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setEncodingIntervalRange(IntRange value) {
        this.encodingIntervalRange = value;
    }

    /**
     * Gets the value of the mpeg4ProfilesSupported property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mpeg4ProfilesSupported property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMpeg4ProfilesSupported().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mpeg4Profile }
     * 
     * 
     */
    public List<Mpeg4Profile> getMpeg4ProfilesSupported() {
        if (mpeg4ProfilesSupported == null) {
            mpeg4ProfilesSupported = new ArrayList<Mpeg4Profile>();
        }
        return this.mpeg4ProfilesSupported;
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
