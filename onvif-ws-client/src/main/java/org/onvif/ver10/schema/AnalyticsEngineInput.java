
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
 * <p>Java class for AnalyticsEngineInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalyticsEngineInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SourceIdentification" type="{http://www.onvif.org/ver10/schema}SourceIdentification"/&gt;
 *         &lt;element name="VideoInput" type="{http://www.onvif.org/ver10/schema}VideoEncoderConfiguration"/&gt;
 *         &lt;element name="MetadataInput" type="{http://www.onvif.org/ver10/schema}MetadataInput"/&gt;
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
@XmlType(name = "AnalyticsEngineInput", propOrder = {
    "sourceIdentification",
    "videoInput",
    "metadataInput",
    "any"
})
public class AnalyticsEngineInput
    extends ConfigurationEntity
{

    @XmlElement(name = "SourceIdentification", required = true)
    protected SourceIdentification sourceIdentification;
    @XmlElement(name = "VideoInput", required = true)
    protected VideoEncoderConfiguration videoInput;
    @XmlElement(name = "MetadataInput", required = true)
    protected MetadataInput metadataInput;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the sourceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link SourceIdentification }
     *     
     */
    public SourceIdentification getSourceIdentification() {
        return sourceIdentification;
    }

    /**
     * Sets the value of the sourceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceIdentification }
     *     
     */
    public void setSourceIdentification(SourceIdentification value) {
        this.sourceIdentification = value;
    }

    /**
     * Gets the value of the videoInput property.
     * 
     * @return
     *     possible object is
     *     {@link VideoEncoderConfiguration }
     *     
     */
    public VideoEncoderConfiguration getVideoInput() {
        return videoInput;
    }

    /**
     * Sets the value of the videoInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoEncoderConfiguration }
     *     
     */
    public void setVideoInput(VideoEncoderConfiguration value) {
        this.videoInput = value;
    }

    /**
     * Gets the value of the metadataInput property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataInput }
     *     
     */
    public MetadataInput getMetadataInput() {
        return metadataInput;
    }

    /**
     * Sets the value of the metadataInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataInput }
     *     
     */
    public void setMetadataInput(MetadataInput value) {
        this.metadataInput = value;
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
