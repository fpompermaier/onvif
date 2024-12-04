
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.onvif.ver10.schema.RelayOutputSettings;


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
 *         &lt;element name="RelayOutputToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="Properties" type="{http://www.onvif.org/ver10/schema}RelayOutputSettings"/&gt;
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
    "relayOutputToken",
    "properties"
})
@XmlRootElement(name = "SetRelayOutputSettings")
public class SetRelayOutputSettings {

    @XmlElement(name = "RelayOutputToken", required = true)
    protected String relayOutputToken;
    @XmlElement(name = "Properties", required = true)
    protected RelayOutputSettings properties;

    /**
     * Gets the value of the relayOutputToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelayOutputToken() {
        return relayOutputToken;
    }

    /**
     * Sets the value of the relayOutputToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelayOutputToken(String value) {
        this.relayOutputToken = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link RelayOutputSettings }
     *     
     */
    public RelayOutputSettings getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayOutputSettings }
     *     
     */
    public void setProperties(RelayOutputSettings value) {
        this.properties = value;
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
