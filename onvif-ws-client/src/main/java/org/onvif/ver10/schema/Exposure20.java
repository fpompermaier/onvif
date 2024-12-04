
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * Type describing the exposure settings.
 * 
 * <p>Java class for Exposure20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Exposure20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}ExposureMode"/&gt;
 *         &lt;element name="Priority" type="{http://www.onvif.org/ver10/schema}ExposurePriority" minOccurs="0"/&gt;
 *         &lt;element name="Window" type="{http://www.onvif.org/ver10/schema}Rectangle" minOccurs="0"/&gt;
 *         &lt;element name="MinExposureTime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="MaxExposureTime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="MinGain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="MaxGain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="MinIris" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="MaxIris" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ExposureTime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Gain" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Iris" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exposure20", propOrder = {
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
public class Exposure20 {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected ExposureMode mode;
    @XmlElement(name = "Priority")
    @XmlSchemaType(name = "string")
    protected ExposurePriority priority;
    @XmlElement(name = "Window")
    protected Rectangle window;
    @XmlElement(name = "MinExposureTime")
    protected Float minExposureTime;
    @XmlElement(name = "MaxExposureTime")
    protected Float maxExposureTime;
    @XmlElement(name = "MinGain")
    protected Float minGain;
    @XmlElement(name = "MaxGain")
    protected Float maxGain;
    @XmlElement(name = "MinIris")
    protected Float minIris;
    @XmlElement(name = "MaxIris")
    protected Float maxIris;
    @XmlElement(name = "ExposureTime")
    protected Float exposureTime;
    @XmlElement(name = "Gain")
    protected Float gain;
    @XmlElement(name = "Iris")
    protected Float iris;

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
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinExposureTime() {
        return minExposureTime;
    }

    /**
     * Sets the value of the minExposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinExposureTime(Float value) {
        this.minExposureTime = value;
    }

    /**
     * Gets the value of the maxExposureTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxExposureTime() {
        return maxExposureTime;
    }

    /**
     * Sets the value of the maxExposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxExposureTime(Float value) {
        this.maxExposureTime = value;
    }

    /**
     * Gets the value of the minGain property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinGain() {
        return minGain;
    }

    /**
     * Sets the value of the minGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinGain(Float value) {
        this.minGain = value;
    }

    /**
     * Gets the value of the maxGain property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxGain() {
        return maxGain;
    }

    /**
     * Sets the value of the maxGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxGain(Float value) {
        this.maxGain = value;
    }

    /**
     * Gets the value of the minIris property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinIris() {
        return minIris;
    }

    /**
     * Sets the value of the minIris property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinIris(Float value) {
        this.minIris = value;
    }

    /**
     * Gets the value of the maxIris property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxIris() {
        return maxIris;
    }

    /**
     * Sets the value of the maxIris property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxIris(Float value) {
        this.maxIris = value;
    }

    /**
     * Gets the value of the exposureTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getExposureTime() {
        return exposureTime;
    }

    /**
     * Sets the value of the exposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setExposureTime(Float value) {
        this.exposureTime = value;
    }

    /**
     * Gets the value of the gain property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGain() {
        return gain;
    }

    /**
     * Sets the value of the gain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGain(Float value) {
        this.gain = value;
    }

    /**
     * Gets the value of the iris property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getIris() {
        return iris;
    }

    /**
     * Sets the value of the iris property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setIris(Float value) {
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
