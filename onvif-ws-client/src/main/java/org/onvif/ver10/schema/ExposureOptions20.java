
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for ExposureOptions20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExposureOptions20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}ExposureMode" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Priority" type="{http://www.onvif.org/ver10/schema}ExposurePriority" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MinExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/&gt;
 *         &lt;element name="MaxExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/&gt;
 *         &lt;element name="MinGain" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/&gt;
 *         &lt;element name="MaxGain" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/&gt;
 *         &lt;element name="MinIris" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/&gt;
 *         &lt;element name="MaxIris" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/&gt;
 *         &lt;element name="ExposureTime" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/&gt;
 *         &lt;element name="Gain" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/&gt;
 *         &lt;element name="Iris" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExposureOptions20", propOrder = {
    "mode",
    "priority",
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
public class ExposureOptions20 {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected List<ExposureMode> mode;
    @XmlElement(name = "Priority")
    @XmlSchemaType(name = "string")
    protected List<ExposurePriority> priority;
    @XmlElement(name = "MinExposureTime")
    protected FloatRange minExposureTime;
    @XmlElement(name = "MaxExposureTime")
    protected FloatRange maxExposureTime;
    @XmlElement(name = "MinGain")
    protected FloatRange minGain;
    @XmlElement(name = "MaxGain")
    protected FloatRange maxGain;
    @XmlElement(name = "MinIris")
    protected FloatRange minIris;
    @XmlElement(name = "MaxIris")
    protected FloatRange maxIris;
    @XmlElement(name = "ExposureTime")
    protected FloatRange exposureTime;
    @XmlElement(name = "Gain")
    protected FloatRange gain;
    @XmlElement(name = "Iris")
    protected FloatRange iris;

    /**
     * Gets the value of the mode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExposureMode }
     * 
     * 
     */
    public List<ExposureMode> getMode() {
        if (mode == null) {
            mode = new ArrayList<ExposureMode>();
        }
        return this.mode;
    }

    /**
     * Gets the value of the priority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the priority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExposurePriority }
     * 
     * 
     */
    public List<ExposurePriority> getPriority() {
        if (priority == null) {
            priority = new ArrayList<ExposurePriority>();
        }
        return this.priority;
    }

    /**
     * Gets the value of the minExposureTime property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMinExposureTime() {
        return minExposureTime;
    }

    /**
     * Sets the value of the minExposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMinExposureTime(FloatRange value) {
        this.minExposureTime = value;
    }

    /**
     * Gets the value of the maxExposureTime property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMaxExposureTime() {
        return maxExposureTime;
    }

    /**
     * Sets the value of the maxExposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMaxExposureTime(FloatRange value) {
        this.maxExposureTime = value;
    }

    /**
     * Gets the value of the minGain property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMinGain() {
        return minGain;
    }

    /**
     * Sets the value of the minGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMinGain(FloatRange value) {
        this.minGain = value;
    }

    /**
     * Gets the value of the maxGain property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMaxGain() {
        return maxGain;
    }

    /**
     * Sets the value of the maxGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMaxGain(FloatRange value) {
        this.maxGain = value;
    }

    /**
     * Gets the value of the minIris property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMinIris() {
        return minIris;
    }

    /**
     * Sets the value of the minIris property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMinIris(FloatRange value) {
        this.minIris = value;
    }

    /**
     * Gets the value of the maxIris property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getMaxIris() {
        return maxIris;
    }

    /**
     * Sets the value of the maxIris property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setMaxIris(FloatRange value) {
        this.maxIris = value;
    }

    /**
     * Gets the value of the exposureTime property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getExposureTime() {
        return exposureTime;
    }

    /**
     * Sets the value of the exposureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setExposureTime(FloatRange value) {
        this.exposureTime = value;
    }

    /**
     * Gets the value of the gain property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getGain() {
        return gain;
    }

    /**
     * Sets the value of the gain property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setGain(FloatRange value) {
        this.gain = value;
    }

    /**
     * Gets the value of the iris property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getIris() {
        return iris;
    }

    /**
     * Sets the value of the iris property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setIris(FloatRange value) {
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
