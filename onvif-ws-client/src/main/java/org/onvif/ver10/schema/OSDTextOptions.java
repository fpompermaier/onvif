
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for OSDTextOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OSDTextOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="FontSizeRange" type="{http://www.onvif.org/ver10/schema}IntRange" minOccurs="0"/&gt;
 *         &lt;element name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FontColor" type="{http://www.onvif.org/ver10/schema}OSDColorOptions" minOccurs="0"/&gt;
 *         &lt;element name="BackgroundColor" type="{http://www.onvif.org/ver10/schema}OSDColorOptions" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}OSDTextOptionsExtension" minOccurs="0"/&gt;
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
@XmlType(name = "OSDTextOptions", propOrder = {
    "type",
    "fontSizeRange",
    "dateFormat",
    "timeFormat",
    "fontColor",
    "backgroundColor",
    "extension"
})
public class OSDTextOptions {

    @XmlElement(name = "Type", required = true)
    protected List<String> type;
    @XmlElement(name = "FontSizeRange")
    protected IntRange fontSizeRange;
    @XmlElement(name = "DateFormat")
    protected List<String> dateFormat;
    @XmlElement(name = "TimeFormat")
    protected List<String> timeFormat;
    @XmlElement(name = "FontColor")
    protected OSDColorOptions fontColor;
    @XmlElement(name = "BackgroundColor")
    protected OSDColorOptions backgroundColor;
    @XmlElement(name = "Extension")
    protected OSDTextOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getType() {
        if (type == null) {
            type = new ArrayList<String>();
        }
        return this.type;
    }

    /**
     * Gets the value of the fontSizeRange property.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getFontSizeRange() {
        return fontSizeRange;
    }

    /**
     * Sets the value of the fontSizeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setFontSizeRange(IntRange value) {
        this.fontSizeRange = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dateFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDateFormat() {
        if (dateFormat == null) {
            dateFormat = new ArrayList<String>();
        }
        return this.dateFormat;
    }

    /**
     * Gets the value of the timeFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the timeFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTimeFormat() {
        if (timeFormat == null) {
            timeFormat = new ArrayList<String>();
        }
        return this.timeFormat;
    }

    /**
     * Gets the value of the fontColor property.
     * 
     * @return
     *     possible object is
     *     {@link OSDColorOptions }
     *     
     */
    public OSDColorOptions getFontColor() {
        return fontColor;
    }

    /**
     * Sets the value of the fontColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDColorOptions }
     *     
     */
    public void setFontColor(OSDColorOptions value) {
        this.fontColor = value;
    }

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link OSDColorOptions }
     *     
     */
    public OSDColorOptions getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDColorOptions }
     *     
     */
    public void setBackgroundColor(OSDColorOptions value) {
        this.backgroundColor = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link OSDTextOptionsExtension }
     *     
     */
    public OSDTextOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDTextOptionsExtension }
     *     
     */
    public void setExtension(OSDTextOptionsExtension value) {
        this.extension = value;
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
