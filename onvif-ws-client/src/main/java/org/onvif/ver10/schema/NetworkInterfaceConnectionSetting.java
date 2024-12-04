
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for NetworkInterfaceConnectionSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkInterfaceConnectionSetting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoNegotiation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Duplex" type="{http://www.onvif.org/ver10/schema}Duplex"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterfaceConnectionSetting", propOrder = {
    "autoNegotiation",
    "speed",
    "duplex"
})
public class NetworkInterfaceConnectionSetting {

    @XmlElement(name = "AutoNegotiation")
    protected boolean autoNegotiation;
    @XmlElement(name = "Speed")
    protected int speed;
    @XmlElement(name = "Duplex", required = true)
    @XmlSchemaType(name = "string")
    protected Duplex duplex;

    /**
     * Gets the value of the autoNegotiation property.
     * This getter has been renamed from isAutoNegotiation() to getAutoNegotiation() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getAutoNegotiation() {
        return autoNegotiation;
    }

    /**
     * Sets the value of the autoNegotiation property.
     * 
     */
    public void setAutoNegotiation(boolean value) {
        this.autoNegotiation = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     */
    public void setSpeed(int value) {
        this.speed = value;
    }

    /**
     * Gets the value of the duplex property.
     * 
     * @return
     *     possible object is
     *     {@link Duplex }
     *     
     */
    public Duplex getDuplex() {
        return duplex;
    }

    /**
     * Sets the value of the duplex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duplex }
     *     
     */
    public void setDuplex(Duplex value) {
        this.duplex = value;
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
