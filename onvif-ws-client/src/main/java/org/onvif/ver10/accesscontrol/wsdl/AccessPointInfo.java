
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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * 
 *             The AccessPointInfo structure contains basic information about an AccessPoint instance.
 *             An AccessPoint defines an entity a Credential can be granted or denied access to. The
 *             AccessPointInfo provides basic information on how access is controlled in one direction
 *             for a
 *             door (from which area to which area).
 *             </p><p>
 *             door is the typical device involved, but other type of
 *             devices may be supported as well.
 *             Multiple AccessPoints may cover the same Door.
 *             A typical case is one AccessPoint for entry and another for exit, both referencing
 *             the same Door.
 *             </p><p>
 * 
 *             An ONVIF compliant device shall provide the following fields for each AccessPoint
 *             instance:
 *           
 * 
 * <p>Java class for AccessPointInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessPointInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.onvif.org/ver10/accesscontrol/wsdl}AccessPointInfoBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Capabilities" type="{http://www.onvif.org/ver10/accesscontrol/wsdl}AccessPointCapabilities"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessPointInfo", propOrder = {
    "capabilities",
    "any"
})
public class AccessPointInfo
    extends AccessPointInfoBase
{

    @XmlElement(name = "Capabilities", required = true)
    protected AccessPointCapabilities capabilities;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the capabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AccessPointCapabilities }
     *     
     */
    public AccessPointCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessPointCapabilities }
     *     
     */
    public void setCapabilities(AccessPointCapabilities value) {
        this.capabilities = value;
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
