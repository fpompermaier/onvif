
package org.onvif.ver10.deviceio.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


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
 *         &lt;element name="SerialPortConfiguration" type="{http://www.onvif.org/ver10/deviceIO/wsdl}SerialPortConfiguration"/&gt;
 *         &lt;element name="ForcePersistance" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "serialPortConfiguration",
    "forcePersistance"
})
@XmlRootElement(name = "SetSerialPortConfiguration")
public class SetSerialPortConfiguration {

    @XmlElement(name = "SerialPortConfiguration", required = true)
    protected SerialPortConfiguration serialPortConfiguration;
    @XmlElement(name = "ForcePersistance")
    protected boolean forcePersistance;

    /**
     * Gets the value of the serialPortConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link SerialPortConfiguration }
     *     
     */
    public SerialPortConfiguration getSerialPortConfiguration() {
        return serialPortConfiguration;
    }

    /**
     * Sets the value of the serialPortConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialPortConfiguration }
     *     
     */
    public void setSerialPortConfiguration(SerialPortConfiguration value) {
        this.serialPortConfiguration = value;
    }

    /**
     * Gets the value of the forcePersistance property.
     * This getter has been renamed from isForcePersistance() to getForcePersistance() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getForcePersistance() {
        return forcePersistance;
    }

    /**
     * Sets the value of the forcePersistance property.
     * 
     */
    public void setForcePersistance(boolean value) {
        this.forcePersistance = value;
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
