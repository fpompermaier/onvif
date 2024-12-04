
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
 * <p>Java class for MetadataAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CanContainPTZ" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanContainAnalytics" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CanContainNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;any processContents='lax' namespace='http://www.onvif.org/ver10/schema' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PtzSpaces" type="{http://www.onvif.org/ver10/schema}StringAttrList" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataAttributes", propOrder = {
    "canContainPTZ",
    "canContainAnalytics",
    "canContainNotifications",
    "any"
})
public class MetadataAttributes {

    @XmlElement(name = "CanContainPTZ")
    protected boolean canContainPTZ;
    @XmlElement(name = "CanContainAnalytics")
    protected boolean canContainAnalytics;
    @XmlElement(name = "CanContainNotifications")
    protected boolean canContainNotifications;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAttribute(name = "PtzSpaces")
    protected List<String> ptzSpaces;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the canContainPTZ property.
     * This getter has been renamed from isCanContainPTZ() to getCanContainPTZ() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getCanContainPTZ() {
        return canContainPTZ;
    }

    /**
     * Sets the value of the canContainPTZ property.
     * 
     */
    public void setCanContainPTZ(boolean value) {
        this.canContainPTZ = value;
    }

    /**
     * Gets the value of the canContainAnalytics property.
     * This getter has been renamed from isCanContainAnalytics() to getCanContainAnalytics() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getCanContainAnalytics() {
        return canContainAnalytics;
    }

    /**
     * Sets the value of the canContainAnalytics property.
     * 
     */
    public void setCanContainAnalytics(boolean value) {
        this.canContainAnalytics = value;
    }

    /**
     * Gets the value of the canContainNotifications property.
     * This getter has been renamed from isCanContainNotifications() to getCanContainNotifications() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getCanContainNotifications() {
        return canContainNotifications;
    }

    /**
     * Sets the value of the canContainNotifications property.
     * 
     */
    public void setCanContainNotifications(boolean value) {
        this.canContainNotifications = value;
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
     * Gets the value of the ptzSpaces property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ptzSpaces property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtzSpaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPtzSpaces() {
        if (ptzSpaces == null) {
            ptzSpaces = new ArrayList<String>();
        }
        return this.ptzSpaces;
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
