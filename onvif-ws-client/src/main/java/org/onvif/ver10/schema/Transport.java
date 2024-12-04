
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for Transport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Protocol" type="{http://www.onvif.org/ver10/schema}TransportProtocol"/&gt;
 *         &lt;element name="Tunnel" type="{http://www.onvif.org/ver10/schema}Transport" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transport", propOrder = {
    "protocol",
    "tunnel"
})
public class Transport {

    @XmlElement(name = "Protocol", required = true)
    @XmlSchemaType(name = "string")
    protected TransportProtocol protocol;
    @XmlElement(name = "Tunnel")
    protected Transport tunnel;

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link TransportProtocol }
     *     
     */
    public TransportProtocol getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportProtocol }
     *     
     */
    public void setProtocol(TransportProtocol value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the tunnel property.
     * 
     * @return
     *     possible object is
     *     {@link Transport }
     *     
     */
    public Transport getTunnel() {
        return tunnel;
    }

    /**
     * Sets the value of the tunnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transport }
     *     
     */
    public void setTunnel(Transport value) {
        this.tunnel = value;
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
