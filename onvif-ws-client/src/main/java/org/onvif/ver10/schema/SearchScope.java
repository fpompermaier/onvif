
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
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * A structure for defining a limited scope when searching in recorded data.
 *       
 * 
 * <p>Java class for SearchScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchScope"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncludedSources" type="{http://www.onvif.org/ver10/schema}SourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IncludedRecordings" type="{http://www.onvif.org/ver10/schema}RecordingReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RecordingInformationFilter" type="{http://www.onvif.org/ver10/schema}XPathExpression" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}SearchScopeExtension" minOccurs="0"/&gt;
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
@XmlType(name = "SearchScope", propOrder = {
    "includedSources",
    "includedRecordings",
    "recordingInformationFilter",
    "extension"
})
public class SearchScope {

    @XmlElement(name = "IncludedSources")
    protected List<SourceReference> includedSources;
    @XmlElement(name = "IncludedRecordings")
    protected List<String> includedRecordings;
    @XmlElement(name = "RecordingInformationFilter")
    protected String recordingInformationFilter;
    @XmlElement(name = "Extension")
    protected SearchScopeExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the includedSources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the includedSources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceReference }
     * 
     * 
     */
    public List<SourceReference> getIncludedSources() {
        if (includedSources == null) {
            includedSources = new ArrayList<SourceReference>();
        }
        return this.includedSources;
    }

    /**
     * Gets the value of the includedRecordings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the includedRecordings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedRecordings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludedRecordings() {
        if (includedRecordings == null) {
            includedRecordings = new ArrayList<String>();
        }
        return this.includedRecordings;
    }

    /**
     * Gets the value of the recordingInformationFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordingInformationFilter() {
        return recordingInformationFilter;
    }

    /**
     * Sets the value of the recordingInformationFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordingInformationFilter(String value) {
        this.recordingInformationFilter = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link SearchScopeExtension }
     *     
     */
    public SearchScopeExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchScopeExtension }
     *     
     */
    public void setExtension(SearchScopeExtension value) {
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
