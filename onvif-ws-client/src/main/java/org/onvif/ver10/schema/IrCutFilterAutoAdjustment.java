
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for IrCutFilterAutoAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IrCutFilterAutoAdjustment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BoundaryType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BoundaryOffset" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ResponseTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}IrCutFilterAutoAdjustmentExtension" minOccurs="0"/&gt;
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
@XmlType(name = "IrCutFilterAutoAdjustment", propOrder = {
    "boundaryType",
    "boundaryOffset",
    "responseTime",
    "extension"
})
public class IrCutFilterAutoAdjustment {

    @XmlElement(name = "BoundaryType", required = true)
    protected String boundaryType;
    @XmlElement(name = "BoundaryOffset")
    protected Float boundaryOffset;
    @XmlElement(name = "ResponseTime")
    protected Duration responseTime;
    @XmlElement(name = "Extension")
    protected IrCutFilterAutoAdjustmentExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the boundaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoundaryType() {
        return boundaryType;
    }

    /**
     * Sets the value of the boundaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoundaryType(String value) {
        this.boundaryType = value;
    }

    /**
     * Gets the value of the boundaryOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBoundaryOffset() {
        return boundaryOffset;
    }

    /**
     * Sets the value of the boundaryOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBoundaryOffset(Float value) {
        this.boundaryOffset = value;
    }

    /**
     * Gets the value of the responseTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getResponseTime() {
        return responseTime;
    }

    /**
     * Sets the value of the responseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setResponseTime(Duration value) {
        this.responseTime = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link IrCutFilterAutoAdjustmentExtension }
     *     
     */
    public IrCutFilterAutoAdjustmentExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link IrCutFilterAutoAdjustmentExtension }
     *     
     */
    public void setExtension(IrCutFilterAutoAdjustmentExtension value) {
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
