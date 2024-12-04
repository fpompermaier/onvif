
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for DeviceCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="Network" type="{http://www.onvif.org/ver10/schema}NetworkCapabilities" minOccurs="0"/&gt;
 *         &lt;element name="System" type="{http://www.onvif.org/ver10/schema}SystemCapabilities" minOccurs="0"/&gt;
 *         &lt;element name="IO" type="{http://www.onvif.org/ver10/schema}IOCapabilities" minOccurs="0"/&gt;
 *         &lt;element name="Security" type="{http://www.onvif.org/ver10/schema}SecurityCapabilities" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}DeviceCapabilitiesExtension" minOccurs="0"/&gt;
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
@XmlType(name = "DeviceCapabilities", propOrder = {
    "xAddr",
    "network",
    "system",
    "io",
    "security",
    "extension"
})
public class DeviceCapabilities {

    @XmlElement(name = "XAddr", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String xAddr;
    @XmlElement(name = "Network")
    protected NetworkCapabilities network;
    @XmlElement(name = "System")
    protected SystemCapabilities system;
    @XmlElement(name = "IO")
    protected IOCapabilities io;
    @XmlElement(name = "Security")
    protected SecurityCapabilities security;
    @XmlElement(name = "Extension")
    protected DeviceCapabilitiesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the xAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXAddr() {
        return xAddr;
    }

    /**
     * Sets the value of the xAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXAddr(String value) {
        this.xAddr = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkCapabilities }
     *     
     */
    public NetworkCapabilities getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkCapabilities }
     *     
     */
    public void setNetwork(NetworkCapabilities value) {
        this.network = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link SystemCapabilities }
     *     
     */
    public SystemCapabilities getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemCapabilities }
     *     
     */
    public void setSystem(SystemCapabilities value) {
        this.system = value;
    }

    /**
     * Gets the value of the io property.
     * 
     * @return
     *     possible object is
     *     {@link IOCapabilities }
     *     
     */
    public IOCapabilities getIO() {
        return io;
    }

    /**
     * Sets the value of the io property.
     * 
     * @param value
     *     allowed object is
     *     {@link IOCapabilities }
     *     
     */
    public void setIO(IOCapabilities value) {
        this.io = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCapabilities }
     *     
     */
    public SecurityCapabilities getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCapabilities }
     *     
     */
    public void setSecurity(SecurityCapabilities value) {
        this.security = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceCapabilitiesExtension }
     *     
     */
    public DeviceCapabilitiesExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCapabilitiesExtension }
     *     
     */
    public void setExtension(DeviceCapabilitiesExtension value) {
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
