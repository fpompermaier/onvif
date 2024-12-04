
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.onvif.ver10.schema.IPAddressFilter;


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
 *         &lt;element name="IPAddressFilter" type="{http://www.onvif.org/ver10/schema}IPAddressFilter"/&gt;
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
    "ipAddressFilter"
})
@XmlRootElement(name = "SetIPAddressFilter")
public class SetIPAddressFilter {

    @XmlElement(name = "IPAddressFilter", required = true)
    protected IPAddressFilter ipAddressFilter;

    /**
     * Gets the value of the ipAddressFilter property.
     * 
     * @return
     *     possible object is
     *     {@link IPAddressFilter }
     *     
     */
    public IPAddressFilter getIPAddressFilter() {
        return ipAddressFilter;
    }

    /**
     * Sets the value of the ipAddressFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPAddressFilter }
     *     
     */
    public void setIPAddressFilter(IPAddressFilter value) {
        this.ipAddressFilter = value;
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
