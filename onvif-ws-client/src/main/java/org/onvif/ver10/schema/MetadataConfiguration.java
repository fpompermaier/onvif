
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * <p>Java class for MetadataConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PTZStatus" type="{http://www.onvif.org/ver10/schema}PTZFilter" minOccurs="0"/&gt;
 *         &lt;element name="Events" type="{http://www.onvif.org/ver10/schema}EventSubscription" minOccurs="0"/&gt;
 *         &lt;element name="Analytics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Multicast" type="{http://www.onvif.org/ver10/schema}MulticastConfiguration"/&gt;
 *         &lt;element name="SessionTimeout" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AnalyticsEngineConfiguration" type="{http://www.onvif.org/ver10/schema}AnalyticsEngineConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}MetadataConfigurationExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CompressionType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataConfiguration", propOrder = {
    "ptzStatus",
    "events",
    "analytics",
    "multicast",
    "sessionTimeout",
    "any",
    "analyticsEngineConfiguration",
    "extension"
})
public class MetadataConfiguration
    extends ConfigurationEntity
{

    @XmlElement(name = "PTZStatus")
    protected PTZFilter ptzStatus;
    @XmlElement(name = "Events")
    protected EventSubscription events;
    @XmlElement(name = "Analytics")
    protected Boolean analytics;
    @XmlElement(name = "Multicast", required = true)
    protected MulticastConfiguration multicast;
    @XmlElement(name = "SessionTimeout", required = true)
    protected Duration sessionTimeout;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "AnalyticsEngineConfiguration")
    protected AnalyticsEngineConfiguration analyticsEngineConfiguration;
    @XmlElement(name = "Extension")
    protected MetadataConfigurationExtension extension;
    @XmlAttribute(name = "CompressionType")
    protected String compressionType;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the ptzStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PTZFilter }
     *     
     */
    public PTZFilter getPTZStatus() {
        return ptzStatus;
    }

    /**
     * Sets the value of the ptzStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZFilter }
     *     
     */
    public void setPTZStatus(PTZFilter value) {
        this.ptzStatus = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link EventSubscription }
     *     
     */
    public EventSubscription getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventSubscription }
     *     
     */
    public void setEvents(EventSubscription value) {
        this.events = value;
    }

    /**
     * Gets the value of the analytics property.
     * This getter has been renamed from isAnalytics() to getAnalytics() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAnalytics() {
        return analytics;
    }

    /**
     * Sets the value of the analytics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnalytics(Boolean value) {
        this.analytics = value;
    }

    /**
     * Gets the value of the multicast property.
     * 
     * @return
     *     possible object is
     *     {@link MulticastConfiguration }
     *     
     */
    public MulticastConfiguration getMulticast() {
        return multicast;
    }

    /**
     * Sets the value of the multicast property.
     * 
     * @param value
     *     allowed object is
     *     {@link MulticastConfiguration }
     *     
     */
    public void setMulticast(MulticastConfiguration value) {
        this.multicast = value;
    }

    /**
     * Gets the value of the sessionTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSessionTimeout() {
        return sessionTimeout;
    }

    /**
     * Sets the value of the sessionTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSessionTimeout(Duration value) {
        this.sessionTimeout = value;
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
     * Gets the value of the analyticsEngineConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link AnalyticsEngineConfiguration }
     *     
     */
    public AnalyticsEngineConfiguration getAnalyticsEngineConfiguration() {
        return analyticsEngineConfiguration;
    }

    /**
     * Sets the value of the analyticsEngineConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalyticsEngineConfiguration }
     *     
     */
    public void setAnalyticsEngineConfiguration(AnalyticsEngineConfiguration value) {
        this.analyticsEngineConfiguration = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataConfigurationExtension }
     *     
     */
    public MetadataConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataConfigurationExtension }
     *     
     */
    public void setExtension(MetadataConfigurationExtension value) {
        this.extension = value;
    }

    /**
     * Gets the value of the compressionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompressionType() {
        return compressionType;
    }

    /**
     * Sets the value of the compressionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompressionType(String value) {
        this.compressionType = value;
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
