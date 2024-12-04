
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
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for MetadataStream complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataStream"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="VideoAnalytics" type="{http://www.onvif.org/ver10/schema}VideoAnalyticsStream"/&gt;
 *           &lt;element name="PTZ" type="{http://www.onvif.org/ver10/schema}PTZStream"/&gt;
 *           &lt;element name="Event" type="{http://www.onvif.org/ver10/schema}EventStream"/&gt;
 *           &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}MetadataStreamExtension"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "MetadataStream", propOrder = {
    "videoAnalyticsOrPTZOrEvent"
})
public class MetadataStream {

    @XmlElements({
        @XmlElement(name = "VideoAnalytics", type = VideoAnalyticsStream.class),
        @XmlElement(name = "PTZ", type = PTZStream.class),
        @XmlElement(name = "Event", type = EventStream.class),
        @XmlElement(name = "Extension", type = MetadataStreamExtension.class)
    })
    protected List<java.lang.Object> videoAnalyticsOrPTZOrEvent;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the videoAnalyticsOrPTZOrEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the videoAnalyticsOrPTZOrEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoAnalyticsOrPTZOrEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventStream }
     * {@link MetadataStreamExtension }
     * {@link PTZStream }
     * {@link VideoAnalyticsStream }
     * 
     * 
     */
    public List<java.lang.Object> getVideoAnalyticsOrPTZOrEvent() {
        if (videoAnalyticsOrPTZOrEvent == null) {
            videoAnalyticsOrPTZOrEvent = new ArrayList<java.lang.Object>();
        }
        return this.videoAnalyticsOrPTZOrEvent;
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
