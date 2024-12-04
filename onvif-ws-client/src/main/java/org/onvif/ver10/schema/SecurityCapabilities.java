
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * <p>Java class for SecurityCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TLS1.1" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="TLS1.2" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OnboardKeyGeneration" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AccessPolicyConfig" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="X.509Token" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SAMLToken" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="KerberosToken" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RELToken" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}SecurityCapabilitiesExtension" minOccurs="0"/&gt;
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
@XmlType(name = "SecurityCapabilities", propOrder = {
    "tls11",
    "tls12",
    "onboardKeyGeneration",
    "accessPolicyConfig",
    "x509Token",
    "samlToken",
    "kerberosToken",
    "relToken",
    "any",
    "extension"
})
public class SecurityCapabilities {

    @XmlElement(name = "TLS1.1")
    protected boolean tls11;
    @XmlElement(name = "TLS1.2")
    protected boolean tls12;
    @XmlElement(name = "OnboardKeyGeneration")
    protected boolean onboardKeyGeneration;
    @XmlElement(name = "AccessPolicyConfig")
    protected boolean accessPolicyConfig;
    @XmlElement(name = "X.509Token")
    protected boolean x509Token;
    @XmlElement(name = "SAMLToken")
    protected boolean samlToken;
    @XmlElement(name = "KerberosToken")
    protected boolean kerberosToken;
    @XmlElement(name = "RELToken")
    protected boolean relToken;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "Extension")
    protected SecurityCapabilitiesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the tls11 property.
     * This getter has been renamed from isTLS11() to getTLS11() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getTLS11() {
        return tls11;
    }

    /**
     * Sets the value of the tls11 property.
     * 
     */
    public void setTLS11(boolean value) {
        this.tls11 = value;
    }

    /**
     * Gets the value of the tls12 property.
     * This getter has been renamed from isTLS12() to getTLS12() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getTLS12() {
        return tls12;
    }

    /**
     * Sets the value of the tls12 property.
     * 
     */
    public void setTLS12(boolean value) {
        this.tls12 = value;
    }

    /**
     * Gets the value of the onboardKeyGeneration property.
     * This getter has been renamed from isOnboardKeyGeneration() to getOnboardKeyGeneration() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getOnboardKeyGeneration() {
        return onboardKeyGeneration;
    }

    /**
     * Sets the value of the onboardKeyGeneration property.
     * 
     */
    public void setOnboardKeyGeneration(boolean value) {
        this.onboardKeyGeneration = value;
    }

    /**
     * Gets the value of the accessPolicyConfig property.
     * This getter has been renamed from isAccessPolicyConfig() to getAccessPolicyConfig() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getAccessPolicyConfig() {
        return accessPolicyConfig;
    }

    /**
     * Sets the value of the accessPolicyConfig property.
     * 
     */
    public void setAccessPolicyConfig(boolean value) {
        this.accessPolicyConfig = value;
    }

    /**
     * Gets the value of the x509Token property.
     * This getter has been renamed from isX509Token() to getX509Token() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getX509Token() {
        return x509Token;
    }

    /**
     * Sets the value of the x509Token property.
     * 
     */
    public void setX509Token(boolean value) {
        this.x509Token = value;
    }

    /**
     * Gets the value of the samlToken property.
     * This getter has been renamed from isSAMLToken() to getSAMLToken() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getSAMLToken() {
        return samlToken;
    }

    /**
     * Sets the value of the samlToken property.
     * 
     */
    public void setSAMLToken(boolean value) {
        this.samlToken = value;
    }

    /**
     * Gets the value of the kerberosToken property.
     * This getter has been renamed from isKerberosToken() to getKerberosToken() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getKerberosToken() {
        return kerberosToken;
    }

    /**
     * Sets the value of the kerberosToken property.
     * 
     */
    public void setKerberosToken(boolean value) {
        this.kerberosToken = value;
    }

    /**
     * Gets the value of the relToken property.
     * This getter has been renamed from isRELToken() to getRELToken() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getRELToken() {
        return relToken;
    }

    /**
     * Sets the value of the relToken property.
     * 
     */
    public void setRELToken(boolean value) {
        this.relToken = value;
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
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCapabilitiesExtension }
     *     
     */
    public SecurityCapabilitiesExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCapabilitiesExtension }
     *     
     */
    public void setExtension(SecurityCapabilitiesExtension value) {
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
