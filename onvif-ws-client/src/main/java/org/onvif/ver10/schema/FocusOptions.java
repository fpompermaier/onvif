
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
 * <p>Java class for FocusOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FocusOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoFocusModes" type="{http://www.onvif.org/ver10/schema}AutoFocusMode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DefaultSpeed" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="NearLimit" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="FarLimit" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FocusOptions", propOrder = {
    "autoFocusModes",
    "defaultSpeed",
    "nearLimit",
    "farLimit"
})
public class FocusOptions {

    @XmlElement(name = "AutoFocusModes")
    @XmlSchemaType(name = "string")
    protected List<AutoFocusMode> autoFocusModes;
    @XmlElement(name = "DefaultSpeed", required = true)
    protected FloatRange defaultSpeed;
    @XmlElement(name = "NearLimit", required = true)
    protected FloatRange nearLimit;
    @XmlElement(name = "FarLimit", required = true)
    protected FloatRange farLimit;

    /**
     * Gets the value of the autoFocusModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the autoFocusModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoFocusModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoFocusMode }
     * 
     * 
     */
    public List<AutoFocusMode> getAutoFocusModes() {
        if (autoFocusModes == null) {
            autoFocusModes = new ArrayList<AutoFocusMode>();
        }
        return this.autoFocusModes;
    }

    /**
     * Gets the value of the defaultSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getDefaultSpeed() {
        return defaultSpeed;
    }

    /**
     * Sets the value of the defaultSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setDefaultSpeed(FloatRange value) {
        this.defaultSpeed = value;
    }

    /**
     * Gets the value of the nearLimit property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getNearLimit() {
        return nearLimit;
    }

    /**
     * Sets the value of the nearLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setNearLimit(FloatRange value) {
        this.nearLimit = value;
    }

    /**
     * Gets the value of the farLimit property.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getFarLimit() {
        return farLimit;
    }

    /**
     * Sets the value of the farLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setFarLimit(FloatRange value) {
        this.farLimit = value;
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
