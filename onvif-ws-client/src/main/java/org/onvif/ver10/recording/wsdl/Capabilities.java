
package org.onvif.ver10.recording.wsdl;

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
 * <p>Java class for Capabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Capabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DynamicRecordings" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DynamicTracks" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Encoding" type="{http://www.onvif.org/ver10/recording/wsdl}EncodingTypes" /&gt;
 *       &lt;attribute name="MaxRate" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="MaxTotalRate" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="MaxRecordings" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="MaxRecordingJobs" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Options" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MetadataRecording" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SupportedExportFileFormats" type="{http://www.onvif.org/ver10/schema}StringAttrList" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities", propOrder = {
    "any"
})
public class Capabilities {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "DynamicRecordings")
    protected Boolean dynamicRecordings;
    @XmlAttribute(name = "DynamicTracks")
    protected Boolean dynamicTracks;
    @XmlAttribute(name = "Encoding")
    protected List<String> encoding;
    @XmlAttribute(name = "MaxRate")
    protected Float maxRate;
    @XmlAttribute(name = "MaxTotalRate")
    protected Float maxTotalRate;
    @XmlAttribute(name = "MaxRecordings")
    protected Float maxRecordings;
    @XmlAttribute(name = "MaxRecordingJobs")
    protected Integer maxRecordingJobs;
    @XmlAttribute(name = "Options")
    protected Boolean options;
    @XmlAttribute(name = "MetadataRecording")
    protected Boolean metadataRecording;
    @XmlAttribute(name = "SupportedExportFileFormats")
    protected List<String> supportedExportFileFormats;
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
     * Gets the value of the dynamicRecordings property.
     * This getter has been renamed from isDynamicRecordings() to getDynamicRecordings() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDynamicRecordings() {
        return dynamicRecordings;
    }

    /**
     * Sets the value of the dynamicRecordings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamicRecordings(Boolean value) {
        this.dynamicRecordings = value;
    }

    /**
     * Gets the value of the dynamicTracks property.
     * This getter has been renamed from isDynamicTracks() to getDynamicTracks() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDynamicTracks() {
        return dynamicTracks;
    }

    /**
     * Sets the value of the dynamicTracks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamicTracks(Boolean value) {
        this.dynamicTracks = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the encoding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncoding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEncoding() {
        if (encoding == null) {
            encoding = new ArrayList<String>();
        }
        return this.encoding;
    }

    /**
     * Gets the value of the maxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxRate() {
        return maxRate;
    }

    /**
     * Sets the value of the maxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxRate(Float value) {
        this.maxRate = value;
    }

    /**
     * Gets the value of the maxTotalRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxTotalRate() {
        return maxTotalRate;
    }

    /**
     * Sets the value of the maxTotalRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxTotalRate(Float value) {
        this.maxTotalRate = value;
    }

    /**
     * Gets the value of the maxRecordings property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxRecordings() {
        return maxRecordings;
    }

    /**
     * Sets the value of the maxRecordings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxRecordings(Float value) {
        this.maxRecordings = value;
    }

    /**
     * Gets the value of the maxRecordingJobs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRecordingJobs() {
        return maxRecordingJobs;
    }

    /**
     * Sets the value of the maxRecordingJobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRecordingJobs(Integer value) {
        this.maxRecordingJobs = value;
    }

    /**
     * Gets the value of the options property.
     * This getter has been renamed from isOptions() to getOptions() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptions(Boolean value) {
        this.options = value;
    }

    /**
     * Gets the value of the metadataRecording property.
     * This getter has been renamed from isMetadataRecording() to getMetadataRecording() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMetadataRecording() {
        return metadataRecording;
    }

    /**
     * Sets the value of the metadataRecording property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMetadataRecording(Boolean value) {
        this.metadataRecording = value;
    }

    /**
     * Gets the value of the supportedExportFileFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the supportedExportFileFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedExportFileFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedExportFileFormats() {
        if (supportedExportFileFormats == null) {
            supportedExportFileFormats = new ArrayList<String>();
        }
        return this.supportedExportFileFormats;
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
