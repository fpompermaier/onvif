
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
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * <p>Java class for PTZConfigurationOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PTZConfigurationOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Spaces" type="{http://www.onvif.org/ver10/schema}PTZSpaces"/&gt;
 *         &lt;element name="PTZTimeout" type="{http://www.onvif.org/ver10/schema}DurationRange"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PTControlDirection" type="{http://www.onvif.org/ver10/schema}PTControlDirectionOptions" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZConfigurationOptions2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PTZRamps" type="{http://www.onvif.org/ver10/schema}IntAttrList" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZConfigurationOptions", propOrder = {
    "spaces",
    "ptzTimeout",
    "any",
    "ptControlDirection",
    "extension"
})
public class PTZConfigurationOptions {

    @XmlElement(name = "Spaces", required = true)
    protected PTZSpaces spaces;
    @XmlElement(name = "PTZTimeout", required = true)
    protected DurationRange ptzTimeout;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "PTControlDirection")
    protected PTControlDirectionOptions ptControlDirection;
    @XmlElement(name = "Extension")
    protected PTZConfigurationOptions2 extension;
    @XmlAttribute(name = "PTZRamps")
    protected List<Integer> ptzRamps;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the spaces property.
     * 
     * @return
     *     possible object is
     *     {@link PTZSpaces }
     *     
     */
    public PTZSpaces getSpaces() {
        return spaces;
    }

    /**
     * Sets the value of the spaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpaces }
     *     
     */
    public void setSpaces(PTZSpaces value) {
        this.spaces = value;
    }

    /**
     * Gets the value of the ptzTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link DurationRange }
     *     
     */
    public DurationRange getPTZTimeout() {
        return ptzTimeout;
    }

    /**
     * Sets the value of the ptzTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationRange }
     *     
     */
    public void setPTZTimeout(DurationRange value) {
        this.ptzTimeout = value;
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
     * Gets the value of the ptControlDirection property.
     * 
     * @return
     *     possible object is
     *     {@link PTControlDirectionOptions }
     *     
     */
    public PTControlDirectionOptions getPTControlDirection() {
        return ptControlDirection;
    }

    /**
     * Sets the value of the ptControlDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTControlDirectionOptions }
     *     
     */
    public void setPTControlDirection(PTControlDirectionOptions value) {
        this.ptControlDirection = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PTZConfigurationOptions2 }
     *     
     */
    public PTZConfigurationOptions2 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZConfigurationOptions2 }
     *     
     */
    public void setExtension(PTZConfigurationOptions2 value) {
        this.extension = value;
    }

    /**
     * Gets the value of the ptzRamps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ptzRamps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPTZRamps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getPTZRamps() {
        if (ptzRamps == null) {
            ptzRamps = new ArrayList<Integer>();
        }
        return this.ptzRamps;
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
