
package org.onvif.ver10.advancedsecurity.wsdl;

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
 * An X.509v3 extension field as specified in RFC 5280
 * 
 * <p>Java class for X509v3Extension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="X509v3Extension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="extnOID" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DotDecimalOID"/&gt;
 *         &lt;element name="critical" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="extnValue" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}Base64DERencodedASN1Value"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "X509v3Extension", propOrder = {
    "extnOID",
    "critical",
    "extnValue",
    "any"
})
public class X509V3Extension {

    @XmlElement(required = true)
    protected String extnOID;
    @XmlElement(defaultValue = "false")
    protected boolean critical;
    @XmlElement(required = true)
    protected byte[] extnValue;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the extnOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtnOID() {
        return extnOID;
    }

    /**
     * Sets the value of the extnOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtnOID(String value) {
        this.extnOID = value;
    }

    /**
     * Gets the value of the critical property.
     * This getter has been renamed from isCritical() to getCritical() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getCritical() {
        return critical;
    }

    /**
     * Sets the value of the critical property.
     * 
     */
    public void setCritical(boolean value) {
        this.critical = value;
    }

    /**
     * Gets the value of the extnValue property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getExtnValue() {
        return extnValue;
    }

    /**
     * Sets the value of the extnValue property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setExtnValue(byte[] value) {
        this.extnValue = value;
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
