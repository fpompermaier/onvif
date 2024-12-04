
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for FocusMove complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FocusMove"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Absolute" type="{http://www.onvif.org/ver10/schema}AbsoluteFocus" minOccurs="0"/&gt;
 *         &lt;element name="Relative" type="{http://www.onvif.org/ver10/schema}RelativeFocus" minOccurs="0"/&gt;
 *         &lt;element name="Continuous" type="{http://www.onvif.org/ver10/schema}ContinuousFocus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FocusMove", propOrder = {
    "absolute",
    "relative",
    "continuous"
})
public class FocusMove {

    @XmlElement(name = "Absolute")
    protected AbsoluteFocus absolute;
    @XmlElement(name = "Relative")
    protected RelativeFocus relative;
    @XmlElement(name = "Continuous")
    protected ContinuousFocus continuous;

    /**
     * Gets the value of the absolute property.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteFocus }
     *     
     */
    public AbsoluteFocus getAbsolute() {
        return absolute;
    }

    /**
     * Sets the value of the absolute property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteFocus }
     *     
     */
    public void setAbsolute(AbsoluteFocus value) {
        this.absolute = value;
    }

    /**
     * Gets the value of the relative property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeFocus }
     *     
     */
    public RelativeFocus getRelative() {
        return relative;
    }

    /**
     * Sets the value of the relative property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeFocus }
     *     
     */
    public void setRelative(RelativeFocus value) {
        this.relative = value;
    }

    /**
     * Gets the value of the continuous property.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousFocus }
     *     
     */
    public ContinuousFocus getContinuous() {
        return continuous;
    }

    /**
     * Sets the value of the continuous property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousFocus }
     *     
     */
    public void setContinuous(ContinuousFocus value) {
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
