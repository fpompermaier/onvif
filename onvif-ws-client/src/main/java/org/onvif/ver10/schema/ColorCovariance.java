
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for ColorCovariance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColorCovariance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="XX" use="required" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="YY" use="required" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="ZZ" use="required" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="XY" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="XZ" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="YZ" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="Colorspace" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorCovariance")
public class ColorCovariance {

    @XmlAttribute(name = "XX", required = true)
    protected float xx;
    @XmlAttribute(name = "YY", required = true)
    protected float yy;
    @XmlAttribute(name = "ZZ", required = true)
    protected float zz;
    @XmlAttribute(name = "XY")
    protected Float xy;
    @XmlAttribute(name = "XZ")
    protected Float xz;
    @XmlAttribute(name = "YZ")
    protected Float yz;
    @XmlAttribute(name = "Colorspace")
    @XmlSchemaType(name = "anyURI")
    protected String colorspace;

    /**
     * Gets the value of the xx property.
     * 
     */
    public float getXX() {
        return xx;
    }

    /**
     * Sets the value of the xx property.
     * 
     */
    public void setXX(float value) {
        this.xx = value;
    }

    /**
     * Gets the value of the yy property.
     * 
     */
    public float getYY() {
        return yy;
    }

    /**
     * Sets the value of the yy property.
     * 
     */
    public void setYY(float value) {
        this.yy = value;
    }

    /**
     * Gets the value of the zz property.
     * 
     */
    public float getZZ() {
        return zz;
    }

    /**
     * Sets the value of the zz property.
     * 
     */
    public void setZZ(float value) {
        this.zz = value;
    }

    /**
     * Gets the value of the xy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getXY() {
        return xy;
    }

    /**
     * Sets the value of the xy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setXY(Float value) {
        this.xy = value;
    }

    /**
     * Gets the value of the xz property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getXZ() {
        return xz;
    }

    /**
     * Sets the value of the xz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setXZ(Float value) {
        this.xz = value;
    }

    /**
     * Gets the value of the yz property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getYZ() {
        return yz;
    }

    /**
     * Sets the value of the yz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setYZ(Float value) {
        this.yz = value;
    }

    /**
     * Gets the value of the colorspace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorspace() {
        return colorspace;
    }

    /**
     * Sets the value of the colorspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorspace(String value) {
        this.colorspace = value;
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
