
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for NetworkInterfaceSetConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkInterfaceSetConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Link" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceConnectionSetting" minOccurs="0"/&gt;
 *         &lt;element name="MTU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IPv4" type="{http://www.onvif.org/ver10/schema}IPv4NetworkInterfaceSetConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="IPv6" type="{http://www.onvif.org/ver10/schema}IPv6NetworkInterfaceSetConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceSetConfigurationExtension" minOccurs="0"/&gt;
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
@XmlType(name = "NetworkInterfaceSetConfiguration", propOrder = {
    "enabled",
    "link",
    "mtu",
    "iPv4",
    "iPv6",
    "extension"
})
public class NetworkInterfaceSetConfiguration {

    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "Link")
    protected NetworkInterfaceConnectionSetting link;
    @XmlElement(name = "MTU")
    protected Integer mtu;
    @XmlElement(name = "IPv4")
    protected IPv4NetworkInterfaceSetConfiguration iPv4;
    @XmlElement(name = "IPv6")
    protected IPv6NetworkInterfaceSetConfiguration iPv6;
    @XmlElement(name = "Extension")
    protected NetworkInterfaceSetConfigurationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the enabled property.
     * This getter has been renamed from isEnabled() to getEnabled() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceConnectionSetting }
     *     
     */
    public NetworkInterfaceConnectionSetting getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceConnectionSetting }
     *     
     */
    public void setLink(NetworkInterfaceConnectionSetting value) {
        this.link = value;
    }

    /**
     * Gets the value of the mtu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTU() {
        return mtu;
    }

    /**
     * Sets the value of the mtu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTU(Integer value) {
        this.mtu = value;
    }

    /**
     * Gets the value of the iPv4 property.
     * 
     * @return
     *     possible object is
     *     {@link IPv4NetworkInterfaceSetConfiguration }
     *     
     */
    public IPv4NetworkInterfaceSetConfiguration getIPv4() {
        return iPv4;
    }

    /**
     * Sets the value of the iPv4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv4NetworkInterfaceSetConfiguration }
     *     
     */
    public void setIPv4(IPv4NetworkInterfaceSetConfiguration value) {
        this.iPv4 = value;
    }

    /**
     * Gets the value of the iPv6 property.
     * 
     * @return
     *     possible object is
     *     {@link IPv6NetworkInterfaceSetConfiguration }
     *     
     */
    public IPv6NetworkInterfaceSetConfiguration getIPv6() {
        return iPv6;
    }

    /**
     * Sets the value of the iPv6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv6NetworkInterfaceSetConfiguration }
     *     
     */
    public void setIPv6(IPv6NetworkInterfaceSetConfiguration value) {
        this.iPv6 = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceSetConfigurationExtension }
     *     
     */
    public NetworkInterfaceSetConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceSetConfigurationExtension }
     *     
     */
    public void setExtension(NetworkInterfaceSetConfigurationExtension value) {
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
