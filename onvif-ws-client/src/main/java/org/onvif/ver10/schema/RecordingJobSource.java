
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
 * <p>Java class for RecordingJobSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordingJobSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourceToken" type="{http://www.onvif.org/ver10/schema}SourceReference" minOccurs="0"/&gt;
 *         &lt;element name="AutoCreateReceiver" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Tracks" type="{http://www.onvif.org/ver10/schema}RecordingJobTrack" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}RecordingJobSourceExtension" minOccurs="0"/&gt;
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
@XmlType(name = "RecordingJobSource", propOrder = {
    "sourceToken",
    "autoCreateReceiver",
    "tracks",
    "extension"
})
public class RecordingJobSource {

    @XmlElement(name = "SourceToken")
    protected SourceReference sourceToken;
    @XmlElement(name = "AutoCreateReceiver")
    protected Boolean autoCreateReceiver;
    @XmlElement(name = "Tracks")
    protected List<RecordingJobTrack> tracks;
    @XmlElement(name = "Extension")
    protected RecordingJobSourceExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the sourceToken property.
     * 
     * @return
     *     possible object is
     *     {@link SourceReference }
     *     
     */
    public SourceReference getSourceToken() {
        return sourceToken;
    }

    /**
     * Sets the value of the sourceToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceReference }
     *     
     */
    public void setSourceToken(SourceReference value) {
        this.sourceToken = value;
    }

    /**
     * Gets the value of the autoCreateReceiver property.
     * This getter has been renamed from isAutoCreateReceiver() to getAutoCreateReceiver() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutoCreateReceiver() {
        return autoCreateReceiver;
    }

    /**
     * Sets the value of the autoCreateReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoCreateReceiver(Boolean value) {
        this.autoCreateReceiver = value;
    }

    /**
     * Gets the value of the tracks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tracks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordingJobTrack }
     * 
     * 
     */
    public List<RecordingJobTrack> getTracks() {
        if (tracks == null) {
            tracks = new ArrayList<RecordingJobTrack>();
        }
        return this.tracks;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link RecordingJobSourceExtension }
     *     
     */
    public RecordingJobSourceExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingJobSourceExtension }
     *     
     */
    public void setExtension(RecordingJobSourceExtension value) {
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
