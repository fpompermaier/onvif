
package org.onvif.ver10.accessrules.wsdl;

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
 *             The service capabilities reflect optional functionality of a service. The information is
 *             static
 *             and does not change during device operation. The following capabilities are available:
 *           
 * 
 * <p>Java class for ServiceCapabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MaxLimit" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MaxAccessProfiles" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MaxAccessPoliciesPerAccessProfile" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MultipleSchedulesPerAccessPointSupported" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCapabilities", propOrder = {
    "any"
})
public class ServiceCapabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "MaxLimit", required = true)
    protected long maxLimit;
    @XmlAttribute(name = "MaxAccessProfiles", required = true)
    protected long maxAccessProfiles;
    @XmlAttribute(name = "MaxAccessPoliciesPerAccessProfile", required = true)
    protected long maxAccessPoliciesPerAccessProfile;
    @XmlAttribute(name = "MultipleSchedulesPerAccessPointSupported", required = true)
    protected boolean multipleSchedulesPerAccessPointSupported;
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
     * Gets the value of the maxLimit property.
     * 
     */
    public long getMaxLimit() {
        return maxLimit;
    }

    /**
     * Sets the value of the maxLimit property.
     * 
     */
    public void setMaxLimit(long value) {
        this.maxLimit = value;
    }

    /**
     * Gets the value of the maxAccessProfiles property.
     * 
     */
    public long getMaxAccessProfiles() {
        return maxAccessProfiles;
    }

    /**
     * Sets the value of the maxAccessProfiles property.
     * 
     */
    public void setMaxAccessProfiles(long value) {
        this.maxAccessProfiles = value;
    }

    /**
     * Gets the value of the maxAccessPoliciesPerAccessProfile property.
     * 
     */
    public long getMaxAccessPoliciesPerAccessProfile() {
        return maxAccessPoliciesPerAccessProfile;
    }

    /**
     * Sets the value of the maxAccessPoliciesPerAccessProfile property.
     * 
     */
    public void setMaxAccessPoliciesPerAccessProfile(long value) {
        this.maxAccessPoliciesPerAccessProfile = value;
    }

    /**
     * Gets the value of the multipleSchedulesPerAccessPointSupported property.
     * This getter has been renamed from isMultipleSchedulesPerAccessPointSupported() to getMultipleSchedulesPerAccessPointSupported() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getMultipleSchedulesPerAccessPointSupported() {
        return multipleSchedulesPerAccessPointSupported;
    }

    /**
     * Sets the value of the multipleSchedulesPerAccessPointSupported property.
     * 
     */
    public void setMultipleSchedulesPerAccessPointSupported(boolean value) {
        this.multipleSchedulesPerAccessPointSupported = value;
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
