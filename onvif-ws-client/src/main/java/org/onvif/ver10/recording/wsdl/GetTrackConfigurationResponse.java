
package org.onvif.ver10.recording.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.onvif.ver10.schema.TrackConfiguration;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackConfiguration" type="{http://www.onvif.org/ver10/schema}TrackConfiguration"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "trackConfiguration"
})
@XmlRootElement(name = "GetTrackConfigurationResponse")
public class GetTrackConfigurationResponse {

    @XmlElement(name = "TrackConfiguration", required = true)
    protected TrackConfiguration trackConfiguration;

    /**
     * Gets the value of the trackConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link TrackConfiguration }
     *     
     */
    public TrackConfiguration getTrackConfiguration() {
        return trackConfiguration;
    }

    /**
     * Sets the value of the trackConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackConfiguration }
     *     
     */
    public void setTrackConfiguration(TrackConfiguration value) {
        this.trackConfiguration = value;
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
