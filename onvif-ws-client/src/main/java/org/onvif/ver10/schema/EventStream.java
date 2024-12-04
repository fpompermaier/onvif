
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.oasis_open.docs.wsn.b_2.NotificationMessageHolderType;


/**
 * <p>Java class for EventStream complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventStream"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/wsn/b-2}NotificationMessage"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}EventStreamExtension"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventStream", propOrder = {
    "notificationMessageOrExtension"
})
public class EventStream {

    @XmlElements({
        @XmlElement(name = "NotificationMessage", namespace = "http://docs.oasis-open.org/wsn/b-2", type = NotificationMessageHolderType.class),
        @XmlElement(name = "Extension", type = EventStreamExtension.class)
    })
    protected List<java.lang.Object> notificationMessageOrExtension;

    /**
     * Gets the value of the notificationMessageOrExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the notificationMessageOrExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationMessageOrExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationMessageHolderType }
     * {@link EventStreamExtension }
     * 
     * 
     */
    public List<java.lang.Object> getNotificationMessageOrExtension() {
        if (notificationMessageOrExtension == null) {
            notificationMessageOrExtension = new ArrayList<java.lang.Object>();
        }
        return this.notificationMessageOrExtension;
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
