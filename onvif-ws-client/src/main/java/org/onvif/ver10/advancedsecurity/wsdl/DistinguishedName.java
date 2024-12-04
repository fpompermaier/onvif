
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
 * <p>Java class for DistinguishedName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistinguishedName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Country" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Organization" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationalUnit" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DistinguishedNameQualifier" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StateOrProvinceName" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CommonName" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Locality" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Surname" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Initials" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Pseudonym" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GenerationQualifier" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GenericAttribute" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}DNAttributeTypeAndValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MultiValuedRDN" type="{http://www.onvif.org/ver10/advancedsecurity/wsdl}MultiValuedRDN" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="anyAttribute" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "DistinguishedName", propOrder = {
    "country",
    "organization",
    "organizationalUnit",
    "distinguishedNameQualifier",
    "stateOrProvinceName",
    "commonName",
    "serialNumber",
    "locality",
    "title",
    "surname",
    "givenName",
    "initials",
    "pseudonym",
    "generationQualifier",
    "genericAttribute",
    "multiValuedRDN",
    "anyAttribute"
})
public class DistinguishedName {

    @XmlElement(name = "Country")
    protected List<String> country;
    @XmlElement(name = "Organization")
    protected List<String> organization;
    @XmlElement(name = "OrganizationalUnit")
    protected List<String> organizationalUnit;
    @XmlElement(name = "DistinguishedNameQualifier")
    protected List<String> distinguishedNameQualifier;
    @XmlElement(name = "StateOrProvinceName")
    protected List<String> stateOrProvinceName;
    @XmlElement(name = "CommonName")
    protected List<String> commonName;
    @XmlElement(name = "SerialNumber")
    protected List<String> serialNumber;
    @XmlElement(name = "Locality")
    protected List<String> locality;
    @XmlElement(name = "Title")
    protected List<String> title;
    @XmlElement(name = "Surname")
    protected List<String> surname;
    @XmlElement(name = "GivenName")
    protected List<String> givenName;
    @XmlElement(name = "Initials")
    protected List<String> initials;
    @XmlElement(name = "Pseudonym")
    protected List<String> pseudonym;
    @XmlElement(name = "GenerationQualifier")
    protected List<String> generationQualifier;
    @XmlElement(name = "GenericAttribute")
    protected List<DNAttributeTypeAndValue> genericAttribute;
    @XmlElement(name = "MultiValuedRDN")
    protected List<MultiValuedRDN> multiValuedRDN;
    protected DistinguishedName.AnyAttribute anyAttribute;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the country property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the country property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountry() {
        if (country == null) {
            country = new ArrayList<String>();
        }
        return this.country;
    }

    /**
     * Gets the value of the organization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the organization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrganization() {
        if (organization == null) {
            organization = new ArrayList<String>();
        }
        return this.organization;
    }

    /**
     * Gets the value of the organizationalUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the organizationalUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationalUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrganizationalUnit() {
        if (organizationalUnit == null) {
            organizationalUnit = new ArrayList<String>();
        }
        return this.organizationalUnit;
    }

    /**
     * Gets the value of the distinguishedNameQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the distinguishedNameQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistinguishedNameQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDistinguishedNameQualifier() {
        if (distinguishedNameQualifier == null) {
            distinguishedNameQualifier = new ArrayList<String>();
        }
        return this.distinguishedNameQualifier;
    }

    /**
     * Gets the value of the stateOrProvinceName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the stateOrProvinceName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateOrProvinceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStateOrProvinceName() {
        if (stateOrProvinceName == null) {
            stateOrProvinceName = new ArrayList<String>();
        }
        return this.stateOrProvinceName;
    }

    /**
     * Gets the value of the commonName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the commonName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommonName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCommonName() {
        if (commonName == null) {
            commonName = new ArrayList<String>();
        }
        return this.commonName;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSerialNumber() {
        if (serialNumber == null) {
            serialNumber = new ArrayList<String>();
        }
        return this.serialNumber;
    }

    /**
     * Gets the value of the locality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the locality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocality() {
        if (locality == null) {
            locality = new ArrayList<String>();
        }
        return this.locality;
    }

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTitle() {
        if (title == null) {
            title = new ArrayList<String>();
        }
        return this.title;
    }

    /**
     * Gets the value of the surname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the surname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurname().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSurname() {
        if (surname == null) {
            surname = new ArrayList<String>();
        }
        return this.surname;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the givenName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGivenName() {
        if (givenName == null) {
            givenName = new ArrayList<String>();
        }
        return this.givenName;
    }

    /**
     * Gets the value of the initials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the initials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInitials() {
        if (initials == null) {
            initials = new ArrayList<String>();
        }
        return this.initials;
    }

    /**
     * Gets the value of the pseudonym property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pseudonym property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPseudonym().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPseudonym() {
        if (pseudonym == null) {
            pseudonym = new ArrayList<String>();
        }
        return this.pseudonym;
    }

    /**
     * Gets the value of the generationQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the generationQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenerationQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGenerationQualifier() {
        if (generationQualifier == null) {
            generationQualifier = new ArrayList<String>();
        }
        return this.generationQualifier;
    }

    /**
     * Gets the value of the genericAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the genericAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenericAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNAttributeTypeAndValue }
     * 
     * 
     */
    public List<DNAttributeTypeAndValue> getGenericAttribute() {
        if (genericAttribute == null) {
            genericAttribute = new ArrayList<DNAttributeTypeAndValue>();
        }
        return this.genericAttribute;
    }

    /**
     * Gets the value of the multiValuedRDN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the multiValuedRDN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiValuedRDN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiValuedRDN }
     * 
     * 
     */
    public List<MultiValuedRDN> getMultiValuedRDN() {
        if (multiValuedRDN == null) {
            multiValuedRDN = new ArrayList<MultiValuedRDN>();
        }
        return this.multiValuedRDN;
    }

    /**
     * Gets the value of the anyAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link DistinguishedName.AnyAttribute }
     *     
     */
    public DistinguishedName.AnyAttribute getAnyAttribute() {
        return anyAttribute;
    }

    /**
     * Sets the value of the anyAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinguishedName.AnyAttribute }
     *     
     */
    public void setAnyAttribute(DistinguishedName.AnyAttribute value) {
        this.anyAttribute = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class AnyAttribute {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

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
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
        }

    }

}
