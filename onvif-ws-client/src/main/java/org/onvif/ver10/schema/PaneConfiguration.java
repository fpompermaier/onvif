
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
 * Configuration of the streaming and coding settings of a Video window.
 *       
 * 
 * <p>Java class for PaneConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaneConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaneName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AudioOutputToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/&gt;
 *         &lt;element name="AudioSourceToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/&gt;
 *         &lt;element name="AudioEncoderConfiguration" type="{http://www.onvif.org/ver10/schema}AudioEncoderConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="ReceiverToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/&gt;
 *         &lt;element name="Token" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
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
@XmlType(name = "PaneConfiguration", propOrder = {
    "paneName",
    "audioOutputToken",
    "audioSourceToken",
    "audioEncoderConfiguration",
    "receiverToken",
    "token",
    "any"
})
public class PaneConfiguration {

    @XmlElement(name = "PaneName")
    protected String paneName;
    @XmlElement(name = "AudioOutputToken")
    protected String audioOutputToken;
    @XmlElement(name = "AudioSourceToken")
    protected String audioSourceToken;
    @XmlElement(name = "AudioEncoderConfiguration")
    protected AudioEncoderConfiguration audioEncoderConfiguration;
    @XmlElement(name = "ReceiverToken")
    protected String receiverToken;
    @XmlElement(name = "Token", required = true)
    protected String token;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the paneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaneName() {
        return paneName;
    }

    /**
     * Sets the value of the paneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaneName(String value) {
        this.paneName = value;
    }

    /**
     * Gets the value of the audioOutputToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioOutputToken() {
        return audioOutputToken;
    }

    /**
     * Sets the value of the audioOutputToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioOutputToken(String value) {
        this.audioOutputToken = value;
    }

    /**
     * Gets the value of the audioSourceToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioSourceToken() {
        return audioSourceToken;
    }

    /**
     * Sets the value of the audioSourceToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioSourceToken(String value) {
        this.audioSourceToken = value;
    }

    /**
     * Gets the value of the audioEncoderConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link AudioEncoderConfiguration }
     *     
     */
    public AudioEncoderConfiguration getAudioEncoderConfiguration() {
        return audioEncoderConfiguration;
    }

    /**
     * Sets the value of the audioEncoderConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioEncoderConfiguration }
     *     
     */
    public void setAudioEncoderConfiguration(AudioEncoderConfiguration value) {
        this.audioEncoderConfiguration = value;
    }

    /**
     * Gets the value of the receiverToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverToken() {
        return receiverToken;
    }

    /**
     * Sets the value of the receiverToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverToken(String value) {
        this.receiverToken = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
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
