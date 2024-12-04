
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
 * <p>Java class for SecurityCapabilitiesExtension2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityCapabilitiesExtension2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dot1X" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SupportedEAPMethod" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RemoteUserHandling" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;any processContents='lax' namespace='http://www.onvif.org/ver10/schema' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCapabilitiesExtension2", propOrder = {
    "dot1X",
    "supportedEAPMethod",
    "remoteUserHandling",
    "any"
})
public class SecurityCapabilitiesExtension2 {

    @XmlElement(name = "Dot1X")
    protected boolean dot1X;
    @XmlElement(name = "SupportedEAPMethod", type = Integer.class)
    protected List<Integer> supportedEAPMethod;
    @XmlElement(name = "RemoteUserHandling")
    protected boolean remoteUserHandling;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    /**
     * Gets the value of the dot1X property.
     * This getter has been renamed from isDot1X() to getDot1X() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getDot1X() {
        return dot1X;
    }

    /**
     * Sets the value of the dot1X property.
     * 
     */
    public void setDot1X(boolean value) {
        this.dot1X = value;
    }

    /**
     * Gets the value of the supportedEAPMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the supportedEAPMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedEAPMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSupportedEAPMethod() {
        if (supportedEAPMethod == null) {
            supportedEAPMethod = new ArrayList<Integer>();
        }
        return this.supportedEAPMethod;
    }

    /**
     * Gets the value of the remoteUserHandling property.
     * This getter has been renamed from isRemoteUserHandling() to getRemoteUserHandling() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getRemoteUserHandling() {
        return remoteUserHandling;
    }

    /**
     * Sets the value of the remoteUserHandling property.
     * 
     */
    public void setRemoteUserHandling(boolean value) {
        this.remoteUserHandling = value;
    }

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
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
