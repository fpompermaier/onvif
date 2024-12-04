
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
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * <p>Java class for PTZPresetTourPresetDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PTZPresetTourPresetDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="PresetToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *           &lt;element name="Home" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *           &lt;element name="PTZPosition" type="{http://www.onvif.org/ver10/schema}PTZVector"/&gt;
 *           &lt;element name="TypeExtension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourTypeExtension"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "PTZPresetTourPresetDetail", propOrder = {
    "presetToken",
    "home",
    "ptzPosition",
    "typeExtension",
    "any"
})
public class PTZPresetTourPresetDetail {

    @XmlElement(name = "PresetToken")
    protected String presetToken;
    @XmlElement(name = "Home")
    protected Boolean home;
    @XmlElement(name = "PTZPosition")
    protected PTZVector ptzPosition;
    @XmlElement(name = "TypeExtension")
    protected PTZPresetTourTypeExtension typeExtension;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the presetToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresetToken() {
        return presetToken;
    }

    /**
     * Sets the value of the presetToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresetToken(String value) {
        this.presetToken = value;
    }

    /**
     * Gets the value of the home property.
     * This getter has been renamed from isHome() to getHome() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHome() {
        return home;
    }

    /**
     * Sets the value of the home property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHome(Boolean value) {
        this.home = value;
    }

    /**
     * Gets the value of the ptzPosition property.
     * 
     * @return
     *     possible object is
     *     {@link PTZVector }
     *     
     */
    public PTZVector getPTZPosition() {
        return ptzPosition;
    }

    /**
     * Sets the value of the ptzPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZVector }
     *     
     */
    public void setPTZPosition(PTZVector value) {
        this.ptzPosition = value;
    }

    /**
     * Gets the value of the typeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourTypeExtension }
     *     
     */
    public PTZPresetTourTypeExtension getTypeExtension() {
        return typeExtension;
    }

    /**
     * Sets the value of the typeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourTypeExtension }
     *     
     */
    public void setTypeExtension(PTZPresetTourTypeExtension value) {
        this.typeExtension = value;
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
