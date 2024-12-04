
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for Exposure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Exposure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}ExposureMode"/&gt;
 *         &lt;element name="Priority" type="{http://www.onvif.org/ver10/schema}ExposurePriority"/&gt;
 *         &lt;element name="Window" type="{http://www.onvif.org/ver10/schema}Rectangle"/&gt;
 *         &lt;element name="MinExposureTime" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MaxExposureTime" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MinGain" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MaxGain" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MinIris" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="MaxIris" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="ExposureTime" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Gain" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Iris" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exposure", propOrder = {
    "mode",
    "priority",
    "window",
    "minExposureTime",
    "maxExposureTime",
    "minGain",
    "maxGain",
    "minIris",
    "maxIris",
    "exposureTime",
    "gain",
    "iris"
})
public class Exposure {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected ExposureMode mode;
    @XmlElement(name = "Priority", required = true)
    @XmlSchemaType(name = "string")
    protected ExposurePriority priority;
    @XmlElement(name = "Window", required = true)
    protected Rectangle window;
    @XmlElement(name = "MinExposureTime")
    protected float minExposureTime;
    @XmlElement(name = "MaxExposureTime")
    protected float maxExposureTime;
    @XmlElement(name = "MinGain")
    protected float minGain;
    @XmlElement(name = "MaxGain")
    protected float maxGain;
    @XmlElement(name = "MinIris")
    protected float minIris;
    @XmlElement(name = "MaxIris")
    protected float maxIris;
    @XmlElement(name = "ExposureTime")
    protected float exposureTime;
    @XmlElement(name = "Gain")
    protected float gain;
    @XmlElement(name = "Iris")
    protected float iris;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureMode }
     *     
     */
    public ExposureMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureMode }
     *     
     */
    public void setMode(ExposureMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link ExposurePriority }
     *     
     */
    public ExposurePriority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposurePriority }
     *     
     */
    public void setPriority(ExposurePriority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the window property.
     * 
     * @return
     *     possible object is
     *     {@link Rectangle }
     *     
     */
    public Rectangle getWindow() {
        return window;
    }

    /**
     * Sets the value of the window property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rectangle }
     *     
     */
    public void setWindow(Rectangle value) {
        this.window = value;
    }

    /**
     * Gets the value of the minExposureTime property.
     * 
     */
    public float getMinExposureTime() {
        return minExposureTime;
    }

    /**
     * Sets the value of the minExposureTime property.
     * 
     */
    public void setMinExposureTime(float value) {
        this.minExposureTime = value;
    }

    /**
     * Gets the value of the maxExposureTime property.
     * 
     */
    public float getMaxExposureTime() {
        return maxExposureTime;
    }

    /**
     * Sets the value of the maxExposureTime property.
     * 
     */
    public void setMaxExposureTime(float value) {
        this.maxExposureTime = value;
    }

    /**
     * Gets the value of the minGain property.
     * 
     */
    public float getMinGain() {
        return minGain;
    }

    /**
     * Sets the value of the minGain property.
     * 
     */
    public void setMinGain(float value) {
        this.minGain = value;
    }

    /**
     * Gets the value of the maxGain property.
     * 
     */
    public float getMaxGain() {
        return maxGain;
    }

    /**
     * Sets the value of the maxGain property.
     * 
     */
    public void setMaxGain(float value) {
        this.maxGain = value;
    }

    /**
     * Gets the value of the minIris property.
     * 
     */
    public float getMinIris() {
        return minIris;
    }

    /**
     * Sets the value of the minIris property.
     * 
     */
    public void setMinIris(float value) {
        this.minIris = value;
    }

    /**
     * Gets the value of the maxIris property.
     * 
     */
    public float getMaxIris() {
        return maxIris;
    }

    /**
     * Sets the value of the maxIris property.
     * 
     */
    public void setMaxIris(float value) {
        this.maxIris = value;
    }

    /**
     * Gets the value of the exposureTime property.
     * 
     */
    public float getExposureTime() {
        return exposureTime;
    }

    /**
     * Sets the value of the exposureTime property.
     * 
     */
    public void setExposureTime(float value) {
        this.exposureTime = value;
    }

    /**
     * Gets the value of the gain property.
     * 
     */
    public float getGain() {
        return gain;
    }

    /**
     * Sets the value of the gain property.
     * 
     */
    public void setGain(float value) {
        this.gain = value;
    }

    /**
     * Gets the value of the iris property.
     * 
     */
    public float getIris() {
        return iris;
    }

    /**
     * Sets the value of the iris property.
     * 
     */
    public void setIris(float value) {
        this.iris = value;
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
