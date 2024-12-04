
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.onvif.ver10.schema.NetworkInterfaceSetConfiguration;


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
 *         &lt;element name="InterfaceToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="NetworkInterface" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceSetConfiguration"/&gt;
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
    "interfaceToken",
    "networkInterface"
})
@XmlRootElement(name = "SetNetworkInterfaces")
public class SetNetworkInterfaces {

    @XmlElement(name = "InterfaceToken", required = true)
    protected String interfaceToken;
    @XmlElement(name = "NetworkInterface", required = true)
    protected NetworkInterfaceSetConfiguration networkInterface;

    /**
     * Gets the value of the interfaceToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceToken() {
        return interfaceToken;
    }

    /**
     * Sets the value of the interfaceToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceToken(String value) {
        this.interfaceToken = value;
    }

    /**
     * Gets the value of the networkInterface property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceSetConfiguration }
     *     
     */
    public NetworkInterfaceSetConfiguration getNetworkInterface() {
        return networkInterface;
    }

    /**
     * Sets the value of the networkInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceSetConfiguration }
     *     
     */
    public void setNetworkInterface(NetworkInterfaceSetConfiguration value) {
        this.networkInterface = value;
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
