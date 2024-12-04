
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * <p>Java class for IPv6Configuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPv6Configuration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptRouterAdvert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DHCP" type="{http://www.onvif.org/ver10/schema}IPv6DHCPConfiguration"/&gt;
 *         &lt;element name="Manual" type="{http://www.onvif.org/ver10/schema}PrefixedIPv6Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LinkLocal" type="{http://www.onvif.org/ver10/schema}PrefixedIPv6Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FromDHCP" type="{http://www.onvif.org/ver10/schema}PrefixedIPv6Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FromRA" type="{http://www.onvif.org/ver10/schema}PrefixedIPv6Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}IPv6ConfigurationExtension" minOccurs="0"/&gt;
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
@XmlType(name = "IPv6Configuration", propOrder = {
    "acceptRouterAdvert",
    "dhcp",
    "manual",
    "linkLocal",
    "fromDHCP",
    "fromRA",
    "extension"
})
public class IPv6Configuration {

    @XmlElement(name = "AcceptRouterAdvert")
    protected Boolean acceptRouterAdvert;
    @XmlElement(name = "DHCP", required = true)
    @XmlSchemaType(name = "string")
    protected IPv6DHCPConfiguration dhcp;
    @XmlElement(name = "Manual")
    protected List<PrefixedIPv6Address> manual;
    @XmlElement(name = "LinkLocal")
    protected List<PrefixedIPv6Address> linkLocal;
    @XmlElement(name = "FromDHCP")
    protected List<PrefixedIPv6Address> fromDHCP;
    @XmlElement(name = "FromRA")
    protected List<PrefixedIPv6Address> fromRA;
    @XmlElement(name = "Extension")
    protected IPv6ConfigurationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the acceptRouterAdvert property.
     * This getter has been renamed from isAcceptRouterAdvert() to getAcceptRouterAdvert() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAcceptRouterAdvert() {
        return acceptRouterAdvert;
    }

    /**
     * Sets the value of the acceptRouterAdvert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptRouterAdvert(Boolean value) {
        this.acceptRouterAdvert = value;
    }

    /**
     * Gets the value of the dhcp property.
     * 
     * @return
     *     possible object is
     *     {@link IPv6DHCPConfiguration }
     *     
     */
    public IPv6DHCPConfiguration getDHCP() {
        return dhcp;
    }

    /**
     * Sets the value of the dhcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv6DHCPConfiguration }
     *     
     */
    public void setDHCP(IPv6DHCPConfiguration value) {
        this.dhcp = value;
    }

    /**
     * Gets the value of the manual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the manual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefixedIPv6Address }
     * 
     * 
     */
    public List<PrefixedIPv6Address> getManual() {
        if (manual == null) {
            manual = new ArrayList<PrefixedIPv6Address>();
        }
        return this.manual;
    }

    /**
     * Gets the value of the linkLocal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the linkLocal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkLocal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefixedIPv6Address }
     * 
     * 
     */
    public List<PrefixedIPv6Address> getLinkLocal() {
        if (linkLocal == null) {
            linkLocal = new ArrayList<PrefixedIPv6Address>();
        }
        return this.linkLocal;
    }

    /**
     * Gets the value of the fromDHCP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fromDHCP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromDHCP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefixedIPv6Address }
     * 
     * 
     */
    public List<PrefixedIPv6Address> getFromDHCP() {
        if (fromDHCP == null) {
            fromDHCP = new ArrayList<PrefixedIPv6Address>();
        }
        return this.fromDHCP;
    }

    /**
     * Gets the value of the fromRA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fromRA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromRA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefixedIPv6Address }
     * 
     * 
     */
    public List<PrefixedIPv6Address> getFromRA() {
        if (fromRA == null) {
            fromRA = new ArrayList<PrefixedIPv6Address>();
        }
        return this.fromRA;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link IPv6ConfigurationExtension }
     *     
     */
    public IPv6ConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv6ConfigurationExtension }
     *     
     */
    public void setExtension(IPv6ConfigurationExtension value) {
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
