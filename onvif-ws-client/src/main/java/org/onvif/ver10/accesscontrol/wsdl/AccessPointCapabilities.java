
package org.onvif.ver10.accesscontrol.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * 
 *             The AccessPoint capabilities reflect optional functionality of a particular physical
 *             entity.
 *             Different AccessPoint instances may have different set of capabilities. This information
 *             may
 *             change during device operation, e.g. if hardware settings are changed.
 *             The following capabilities are available:
 *           
 * 
 * <p>Java class for AccessPointCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessPointCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DisableAccessPoint" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Duress" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AnonymousAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AccessTaken" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ExternalAuthorization" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessPointCapabilities", propOrder = {
    "any"
})
public class AccessPointCapabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "DisableAccessPoint", required = true)
    protected boolean disableAccessPoint;
    @XmlAttribute(name = "Duress")
    protected Boolean duress;
    @XmlAttribute(name = "AnonymousAccess")
    protected Boolean anonymousAccess;
    @XmlAttribute(name = "AccessTaken")
    protected Boolean accessTaken;
    @XmlAttribute(name = "ExternalAuthorization")
    protected Boolean externalAuthorization;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the disableAccessPoint property.
     * This getter has been renamed from isDisableAccessPoint() to getDisableAccessPoint() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getDisableAccessPoint() {
        return disableAccessPoint;
    }

    /**
     * Sets the value of the disableAccessPoint property.
     * 
     */
    public void setDisableAccessPoint(boolean value) {
        this.disableAccessPoint = value;
    }

    /**
     * Gets the value of the duress property.
     * This getter has been renamed from isDuress() to getDuress() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDuress() {
        return duress;
    }

    /**
     * Sets the value of the duress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuress(Boolean value) {
        this.duress = value;
    }

    /**
     * Gets the value of the anonymousAccess property.
     * This getter has been renamed from isAnonymousAccess() to getAnonymousAccess() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAnonymousAccess() {
        return anonymousAccess;
    }

    /**
     * Sets the value of the anonymousAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnonymousAccess(Boolean value) {
        this.anonymousAccess = value;
    }

    /**
     * Gets the value of the accessTaken property.
     * This getter has been renamed from isAccessTaken() to getAccessTaken() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAccessTaken() {
        return accessTaken;
    }

    /**
     * Sets the value of the accessTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessTaken(Boolean value) {
        this.accessTaken = value;
    }

    /**
     * Gets the value of the externalAuthorization property.
     * This getter has been renamed from isExternalAuthorization() to getExternalAuthorization() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExternalAuthorization() {
        return externalAuthorization;
    }

    /**
     * Sets the value of the externalAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalAuthorization(Boolean value) {
        this.externalAuthorization = value;
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
