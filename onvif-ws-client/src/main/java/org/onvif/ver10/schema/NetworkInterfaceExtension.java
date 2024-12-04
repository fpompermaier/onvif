
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * <p>Java class for NetworkInterfaceExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkInterfaceExtension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InterfaceType" type="{http://www.onvif.org/ver10/schema}IANA-IfTypes"/&gt;
 *         &lt;element name="Dot3" type="{http://www.onvif.org/ver10/schema}Dot3Configuration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Dot11" type="{http://www.onvif.org/ver10/schema}Dot11Configuration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceExtension2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterfaceExtension", propOrder = {
    "any",
    "interfaceType",
    "dot3",
    "dot11",
    "extension"
})
public class NetworkInterfaceExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "InterfaceType")
    protected int interfaceType;
    @XmlElement(name = "Dot3")
    protected List<Dot3Configuration> dot3;
    @XmlElement(name = "Dot11")
    protected List<Dot11Configuration> dot11;
    @XmlElement(name = "Extension")
    protected NetworkInterfaceExtension2 extension;

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * {@link Element }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the interfaceType property.
     * 
     */
    public int getInterfaceType() {
        return interfaceType;
    }

    /**
     * Sets the value of the interfaceType property.
     * 
     */
    public void setInterfaceType(int value) {
        this.interfaceType = value;
    }

    /**
     * Gets the value of the dot3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dot3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDot3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dot3Configuration }
     * 
     * 
     */
    public List<Dot3Configuration> getDot3() {
        if (dot3 == null) {
            dot3 = new ArrayList<Dot3Configuration>();
        }
        return this.dot3;
    }

    /**
     * Gets the value of the dot11 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dot11 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDot11().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dot11Configuration }
     * 
     * 
     */
    public List<Dot11Configuration> getDot11() {
        if (dot11 == null) {
            dot11 = new ArrayList<Dot11Configuration>();
        }
        return this.dot11;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkInterfaceExtension2 }
     *     
     */
    public NetworkInterfaceExtension2 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkInterfaceExtension2 }
     *     
     */
    public void setExtension(NetworkInterfaceExtension2 value) {
        this.extension = value;
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
