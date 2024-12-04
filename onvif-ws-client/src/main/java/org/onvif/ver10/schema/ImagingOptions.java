
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * <p>Java class for ImagingOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImagingOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BacklightCompensation" type="{http://www.onvif.org/ver10/schema}BacklightCompensationOptions"/&gt;
 *         &lt;element name="Brightness" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="ColorSaturation" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="Contrast" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="Exposure" type="{http://www.onvif.org/ver10/schema}ExposureOptions"/&gt;
 *         &lt;element name="Focus" type="{http://www.onvif.org/ver10/schema}FocusOptions"/&gt;
 *         &lt;element name="IrCutFilterModes" type="{http://www.onvif.org/ver10/schema}IrCutFilterMode" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Sharpness" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="WideDynamicRange" type="{http://www.onvif.org/ver10/schema}WideDynamicRangeOptions"/&gt;
 *         &lt;element name="WhiteBalance" type="{http://www.onvif.org/ver10/schema}WhiteBalanceOptions"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ImagingOptions", propOrder = {
    "backlightCompensation",
    "brightness",
    "colorSaturation",
    "contrast",
    "exposure",
    "focus",
    "irCutFilterModes",
    "sharpness",
    "wideDynamicRange",
    "whiteBalance",
    "any"
})
public class ImagingOptions {

    @XmlElement(name = "BacklightCompensation", required = true)
    protected BacklightCompensationOptions backlightCompensation;
    @XmlElement(name = "Brightness", required = true)
    protected FloatRange brightness;
    @XmlElement(name = "ColorSaturation", required = true)
    protected FloatRange colorSaturation;
    @XmlElement(name = "Contrast", required = true)
    protected FloatRange contrast;
    @XmlElement(name = "Exposure", required = true)
    protected ExposureOptions exposure;
    @XmlElement(name = "Focus", required = true)
    protected FocusOptions focus;
    @XmlElement(name = "IrCutFilterModes", required = true)
    @XmlSchemaType(name = "string")
    protected List<IrCutFilterMode> irCutFilterModes;
    @XmlElement(name = "Sharpness", required = true)
    protected FloatRange sharpness;
    @XmlElement(name = "WideDynamicRange", required = true)
    protected WideDynamicRangeOptions wideDynamicRange;
    @XmlElement(name = "WhiteBalance", required = true)
    protected WhiteBalanceOptions whiteBalance;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the backlightCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link BacklightCompensationOptions }
     *     
     */
    public BacklightCompensationOptions getBacklightCompensation() {
        return backlightCompensation;
    }

    /**
     * Sets the value of the backlightCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BacklightCompensationOptions }
     *     
     */
    public void setBacklightCompensation(BacklightCompensationOptions value) {
        this.backlightCompensation = value;
    }

    /**
     * Gets the value of the brightness property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getBrightness() {
        return brightness;
    }

    /**
     * Sets the value of the brightness property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setBrightness(FloatRange value) {
        this.brightness = value;
    }

    /**
     * Gets the value of the colorSaturation property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getColorSaturation() {
        return colorSaturation;
    }

    /**
     * Sets the value of the colorSaturation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setColorSaturation(FloatRange value) {
        this.colorSaturation = value;
    }

    /**
     * Gets the value of the contrast property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getContrast() {
        return contrast;
    }

    /**
     * Sets the value of the contrast property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setContrast(FloatRange value) {
        this.contrast = value;
    }

    /**
     * Gets the value of the exposure property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureOptions }
     *     
     */
    public ExposureOptions getExposure() {
        return exposure;
    }

    /**
     * Sets the value of the exposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureOptions }
     *     
     */
    public void setExposure(ExposureOptions value) {
        this.exposure = value;
    }

    /**
     * Gets the value of the focus property.
     * 
     * @return
     *     possible object is
     *     {@link FocusOptions }
     *     
     */
    public FocusOptions getFocus() {
        return focus;
    }

    /**
     * Sets the value of the focus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FocusOptions }
     *     
     */
    public void setFocus(FocusOptions value) {
        this.focus = value;
    }

    /**
     * Gets the value of the irCutFilterModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the irCutFilterModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIrCutFilterModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IrCutFilterMode }
     * 
     * 
     */
    public List<IrCutFilterMode> getIrCutFilterModes() {
        if (irCutFilterModes == null) {
            irCutFilterModes = new ArrayList<IrCutFilterMode>();
        }
        return this.irCutFilterModes;
    }

    /**
     * Gets the value of the sharpness property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getSharpness() {
        return sharpness;
    }

    /**
     * Sets the value of the sharpness property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setSharpness(FloatRange value) {
        this.sharpness = value;
    }

    /**
     * Gets the value of the wideDynamicRange property.
     * 
     * @return
     *     possible object is
     *     {@link WideDynamicRangeOptions }
     *     
     */
    public WideDynamicRangeOptions getWideDynamicRange() {
        return wideDynamicRange;
    }

    /**
     * Sets the value of the wideDynamicRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link WideDynamicRangeOptions }
     *     
     */
    public void setWideDynamicRange(WideDynamicRangeOptions value) {
        this.wideDynamicRange = value;
    }

    /**
     * Gets the value of the whiteBalance property.
     * 
     * @return
     *     possible object is
     *     {@link WhiteBalanceOptions }
     *     
     */
    public WhiteBalanceOptions getWhiteBalance() {
        return whiteBalance;
    }

    /**
     * Sets the value of the whiteBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteBalanceOptions }
     *     
     */
    public void setWhiteBalance(WhiteBalanceOptions value) {
        this.whiteBalance = value;
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
