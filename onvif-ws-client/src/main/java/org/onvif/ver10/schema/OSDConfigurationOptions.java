
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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for OSDConfigurationOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OSDConfigurationOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaximumNumberOfOSDs" type="{http://www.onvif.org/ver10/schema}MaximumNumberOfOSDs"/&gt;
 *         &lt;element name="Type" type="{http://www.onvif.org/ver10/schema}OSDType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PositionOption" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TextOption" type="{http://www.onvif.org/ver10/schema}OSDTextOptions" minOccurs="0"/&gt;
 *         &lt;element name="ImageOption" type="{http://www.onvif.org/ver10/schema}OSDImgOptions" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}OSDConfigurationOptionsExtension" minOccurs="0"/&gt;
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
@XmlType(name = "OSDConfigurationOptions", propOrder = {
    "maximumNumberOfOSDs",
    "type",
    "positionOption",
    "textOption",
    "imageOption",
    "extension"
})
public class OSDConfigurationOptions {

    @XmlElement(name = "MaximumNumberOfOSDs", required = true)
    protected MaximumNumberOfOSDs maximumNumberOfOSDs;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected List<OSDType> type;
    @XmlElement(name = "PositionOption", required = true)
    protected List<String> positionOption;
    @XmlElement(name = "TextOption")
    protected OSDTextOptions textOption;
    @XmlElement(name = "ImageOption")
    protected OSDImgOptions imageOption;
    @XmlElement(name = "Extension")
    protected OSDConfigurationOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the maximumNumberOfOSDs property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumNumberOfOSDs }
     *     
     */
    public MaximumNumberOfOSDs getMaximumNumberOfOSDs() {
        return maximumNumberOfOSDs;
    }

    /**
     * Sets the value of the maximumNumberOfOSDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumNumberOfOSDs }
     *     
     */
    public void setMaximumNumberOfOSDs(MaximumNumberOfOSDs value) {
        this.maximumNumberOfOSDs = value;
    }

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
     * {@link OSDType }
     * 
     * 
     */
    public List<OSDType> getType() {
        if (type == null) {
            type = new ArrayList<OSDType>();
        }
        return this.type;
    }

    /**
     * Gets the value of the positionOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the positionOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPositionOption() {
        if (positionOption == null) {
            positionOption = new ArrayList<String>();
        }
        return this.positionOption;
    }

    /**
     * Gets the value of the textOption property.
     * 
     * @return
     *     possible object is
     *     {@link OSDTextOptions }
     *     
     */
    public OSDTextOptions getTextOption() {
        return textOption;
    }

    /**
     * Sets the value of the textOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDTextOptions }
     *     
     */
    public void setTextOption(OSDTextOptions value) {
        this.textOption = value;
    }

    /**
     * Gets the value of the imageOption property.
     * 
     * @return
     *     possible object is
     *     {@link OSDImgOptions }
     *     
     */
    public OSDImgOptions getImageOption() {
        return imageOption;
    }

    /**
     * Sets the value of the imageOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDImgOptions }
     *     
     */
    public void setImageOption(OSDImgOptions value) {
        this.imageOption = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link OSDConfigurationOptionsExtension }
     *     
     */
    public OSDConfigurationOptionsExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDConfigurationOptionsExtension }
     *     
     */
    public void setExtension(OSDConfigurationOptionsExtension value) {
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
