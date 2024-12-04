
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
 * <p>Java class for PTZPresetTourSpot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PTZPresetTourSpot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PresetDetail" type="{http://www.onvif.org/ver10/schema}PTZPresetTourPresetDetail"/&gt;
 *         &lt;element name="Speed" type="{http://www.onvif.org/ver10/schema}PTZSpeed" minOccurs="0"/&gt;
 *         &lt;element name="StayTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourSpotExtension" minOccurs="0"/&gt;
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
@XmlType(name = "PTZPresetTourSpot", propOrder = {
    "presetDetail",
    "speed",
    "stayTime",
    "extension"
})
public class PTZPresetTourSpot {

    @XmlElement(name = "PresetDetail", required = true)
    protected PTZPresetTourPresetDetail presetDetail;
    @XmlElement(name = "Speed")
    protected PTZSpeed speed;
    @XmlElement(name = "StayTime")
    protected Duration stayTime;
    @XmlElement(name = "Extension")
    protected PTZPresetTourSpotExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the presetDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourPresetDetail }
     *     
     */
    public PTZPresetTourPresetDetail getPresetDetail() {
        return presetDetail;
    }

    /**
     * Sets the value of the presetDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourPresetDetail }
     *     
     */
    public void setPresetDetail(PTZPresetTourPresetDetail value) {
        this.presetDetail = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link PTZSpeed }
     *     
     */
    public PTZSpeed getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpeed }
     *     
     */
    public void setSpeed(PTZSpeed value) {
        this.speed = value;
    }

    /**
     * Gets the value of the stayTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStayTime() {
        return stayTime;
    }

    /**
     * Sets the value of the stayTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setStayTime(Duration value) {
        this.stayTime = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourSpotExtension }
     *     
     */
    public PTZPresetTourSpotExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourSpotExtension }
     *     
     */
    public void setExtension(PTZPresetTourSpotExtension value) {
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
