
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for MoveOptions20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoveOptions20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Absolute" type="{http://www.onvif.org/ver10/schema}AbsoluteFocusOptions" minOccurs="0"/&gt;
 *         &lt;element name="Relative" type="{http://www.onvif.org/ver10/schema}RelativeFocusOptions20" minOccurs="0"/&gt;
 *         &lt;element name="Continuous" type="{http://www.onvif.org/ver10/schema}ContinuousFocusOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveOptions20", propOrder = {
    "absolute",
    "relative",
    "continuous"
})
public class MoveOptions20 {

    @XmlElement(name = "Absolute")
    protected AbsoluteFocusOptions absolute;
    @XmlElement(name = "Relative")
    protected RelativeFocusOptions20 relative;
    @XmlElement(name = "Continuous")
    protected ContinuousFocusOptions continuous;

    /**
     * Gets the value of the absolute property.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteFocusOptions }
     *     
     */
    public AbsoluteFocusOptions getAbsolute() {
        return absolute;
    }

    /**
     * Sets the value of the absolute property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteFocusOptions }
     *     
     */
    public void setAbsolute(AbsoluteFocusOptions value) {
        this.absolute = value;
    }

    /**
     * Gets the value of the relative property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeFocusOptions20 }
     *     
     */
    public RelativeFocusOptions20 getRelative() {
        return relative;
    }

    /**
     * Sets the value of the relative property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeFocusOptions20 }
     *     
     */
    public void setRelative(RelativeFocusOptions20 value) {
        this.relative = value;
    }

    /**
     * Gets the value of the continuous property.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousFocusOptions }
     *     
     */
    public ContinuousFocusOptions getContinuous() {
        return continuous;
    }

    /**
     * Sets the value of the continuous property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousFocusOptions }
     *     
     */
    public void setContinuous(ContinuousFocusOptions value) {
        this.continuous = value;
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
