
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
 * <p>Java class for LensDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LensDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Offset" type="{http://www.onvif.org/ver10/schema}LensOffset"/&gt;
 *         &lt;element name="Projection" type="{http://www.onvif.org/ver10/schema}LensProjection" maxOccurs="unbounded"/&gt;
 *         &lt;element name="XFactor" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FocalLength" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LensDescription", propOrder = {
    "offset",
    "projection",
    "xFactor",
    "any"
})
public class LensDescription {

    @XmlElement(name = "Offset", required = true)
    protected LensOffset offset;
    @XmlElement(name = "Projection", required = true)
    protected List<LensProjection> projection;
    @XmlElement(name = "XFactor")
    protected float xFactor;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAttribute(name = "FocalLength")
    protected Float focalLength;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link LensOffset }
     *     
     */
    public LensOffset getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link LensOffset }
     *     
     */
    public void setOffset(LensOffset value) {
        this.offset = value;
    }

    /**
     * Gets the value of the projection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the projection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LensProjection }
     * 
     * 
     */
    public List<LensProjection> getProjection() {
        if (projection == null) {
            projection = new ArrayList<LensProjection>();
        }
        return this.projection;
    }

    /**
     * Gets the value of the xFactor property.
     * 
     */
    public float getXFactor() {
        return xFactor;
    }

    /**
     * Sets the value of the xFactor property.
     * 
     */
    public void setXFactor(float value) {
        this.xFactor = value;
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
     * Gets the value of the focalLength property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFocalLength() {
        return focalLength;
    }

    /**
     * Sets the value of the focalLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFocalLength(Float value) {
        this.focalLength = value;
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
