
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
 * <p>Java class for ShapeDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShapeDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BoundingBox" type="{http://www.onvif.org/ver10/schema}Rectangle"/&gt;
 *         &lt;element name="CenterOfGravity" type="{http://www.onvif.org/ver10/schema}Vector"/&gt;
 *         &lt;element name="Polygon" type="{http://www.onvif.org/ver10/schema}Polygon" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ShapeDescriptorExtension" minOccurs="0"/&gt;
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
@XmlType(name = "ShapeDescriptor", propOrder = {
    "boundingBox",
    "centerOfGravity",
    "polygon",
    "extension"
})
public class ShapeDescriptor {

    @XmlElement(name = "BoundingBox", required = true)
    protected Rectangle boundingBox;
    @XmlElement(name = "CenterOfGravity", required = true)
    protected Vector centerOfGravity;
    @XmlElement(name = "Polygon")
    protected List<Polygon> polygon;
    @XmlElement(name = "Extension")
    protected ShapeDescriptorExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the boundingBox property.
     * 
     * @return
     *     possible object is
     *     {@link Rectangle }
     *     
     */
    public Rectangle getBoundingBox() {
        return boundingBox;
    }

    /**
     * Sets the value of the boundingBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rectangle }
     *     
     */
    public void setBoundingBox(Rectangle value) {
        this.boundingBox = value;
    }

    /**
     * Gets the value of the centerOfGravity property.
     * 
     * @return
     *     possible object is
     *     {@link Vector }
     *     
     */
    public Vector getCenterOfGravity() {
        return centerOfGravity;
    }

    /**
     * Sets the value of the centerOfGravity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector }
     *     
     */
    public void setCenterOfGravity(Vector value) {
        this.centerOfGravity = value;
    }

    /**
     * Gets the value of the polygon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the polygon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolygon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Polygon }
     * 
     * 
     */
    public List<Polygon> getPolygon() {
        if (polygon == null) {
            polygon = new ArrayList<Polygon>();
        }
        return this.polygon;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ShapeDescriptorExtension }
     *     
     */
    public ShapeDescriptorExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShapeDescriptorExtension }
     *     
     */
    public void setExtension(ShapeDescriptorExtension value) {
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
