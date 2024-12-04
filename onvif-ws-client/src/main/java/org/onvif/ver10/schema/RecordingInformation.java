
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * <p>Java class for RecordingInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordingInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecordingToken" type="{http://www.onvif.org/ver10/schema}RecordingReference"/&gt;
 *         &lt;element name="Source" type="{http://www.onvif.org/ver10/schema}RecordingSourceInformation"/&gt;
 *         &lt;element name="EarliestRecording" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LatestRecording" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Content" type="{http://www.onvif.org/ver10/schema}Description"/&gt;
 *         &lt;element name="Track" type="{http://www.onvif.org/ver10/schema}TrackInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RecordingStatus" type="{http://www.onvif.org/ver10/schema}RecordingStatus"/&gt;
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
@XmlType(name = "RecordingInformation", propOrder = {
    "recordingToken",
    "source",
    "earliestRecording",
    "latestRecording",
    "content",
    "track",
    "recordingStatus",
    "any"
})
public class RecordingInformation {

    @XmlElement(name = "RecordingToken", required = true)
    protected String recordingToken;
    @XmlElement(name = "Source", required = true)
    protected RecordingSourceInformation source;
    @XmlElement(name = "EarliestRecording")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestRecording;
    @XmlElement(name = "LatestRecording")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestRecording;
    @XmlElement(name = "Content", required = true)
    protected String content;
    @XmlElement(name = "Track")
    protected List<TrackInformation> track;
    @XmlElement(name = "RecordingStatus", required = true)
    @XmlSchemaType(name = "string")
    protected RecordingStatus recordingStatus;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the recordingToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordingToken() {
        return recordingToken;
    }

    /**
     * Sets the value of the recordingToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordingToken(String value) {
        this.recordingToken = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link RecordingSourceInformation }
     *     
     */
    public RecordingSourceInformation getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingSourceInformation }
     *     
     */
    public void setSource(RecordingSourceInformation value) {
        this.source = value;
    }

    /**
     * Gets the value of the earliestRecording property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestRecording() {
        return earliestRecording;
    }

    /**
     * Sets the value of the earliestRecording property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestRecording(XMLGregorianCalendar value) {
        this.earliestRecording = value;
    }

    /**
     * Gets the value of the latestRecording property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestRecording() {
        return latestRecording;
    }

    /**
     * Sets the value of the latestRecording property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestRecording(XMLGregorianCalendar value) {
        this.latestRecording = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the track property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the track property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackInformation }
     * 
     * 
     */
    public List<TrackInformation> getTrack() {
        if (track == null) {
            track = new ArrayList<TrackInformation>();
        }
        return this.track;
    }

    /**
     * Gets the value of the recordingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecordingStatus }
     *     
     */
    public RecordingStatus getRecordingStatus() {
        return recordingStatus;
    }

    /**
     * Sets the value of the recordingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingStatus }
     *     
     */
    public void setRecordingStatus(RecordingStatus value) {
        this.recordingStatus = value;
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
