
package org.onvif.ver10.events.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.oasis_open.docs.wsn.t_1.TopicSetType;


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
 *         &lt;element name="TopicNamespaceLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/wsn/b-2}FixedTopicSet"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/wsn/t-1}TopicSet"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/wsn/b-2}TopicExpressionDialect" maxOccurs="unbounded"/&gt;
 *         &lt;element name="MessageContentFilterDialect" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ProducerPropertiesFilterDialect" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MessageContentSchemaLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/&gt;
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "topicNamespaceLocation",
    "fixedTopicSet",
    "topicSet",
    "topicExpressionDialect",
    "messageContentFilterDialect",
    "producerPropertiesFilterDialect",
    "messageContentSchemaLocation",
    "any"
})
@XmlRootElement(name = "GetEventPropertiesResponse")
public class GetEventPropertiesResponse {

    @XmlElement(name = "TopicNamespaceLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> topicNamespaceLocation;
    @XmlElement(name = "FixedTopicSet", namespace = "http://docs.oasis-open.org/wsn/b-2", defaultValue = "true")
    protected boolean fixedTopicSet;
    @XmlElement(name = "TopicSet", namespace = "http://docs.oasis-open.org/wsn/t-1", required = true)
    protected TopicSetType topicSet;
    @XmlElement(name = "TopicExpressionDialect", namespace = "http://docs.oasis-open.org/wsn/b-2", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> topicExpressionDialect;
    @XmlElement(name = "MessageContentFilterDialect", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> messageContentFilterDialect;
    @XmlElement(name = "ProducerPropertiesFilterDialect")
    @XmlSchemaType(name = "anyURI")
    protected List<String> producerPropertiesFilterDialect;
    @XmlElement(name = "MessageContentSchemaLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> messageContentSchemaLocation;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the topicNamespaceLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the topicNamespaceLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopicNamespaceLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTopicNamespaceLocation() {
        if (topicNamespaceLocation == null) {
            topicNamespaceLocation = new ArrayList<String>();
        }
        return this.topicNamespaceLocation;
    }

    /**
     * True when topicset is fixed for all times.
     * This getter has been renamed from isFixedTopicSet() to getFixedTopicSet() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getFixedTopicSet() {
        return fixedTopicSet;
    }

    /**
     * Sets the value of the fixedTopicSet property.
     * 
     */
    public void setFixedTopicSet(boolean value) {
        this.fixedTopicSet = value;
    }

    /**
     * Set of topics supported.
     * 
     * @return
     *     possible object is
     *     {@link TopicSetType }
     *     
     */
    public TopicSetType getTopicSet() {
        return topicSet;
    }

    /**
     * Sets the value of the topicSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicSetType }
     *     
     */
    public void setTopicSet(TopicSetType value) {
        this.topicSet = value;
    }

    /**
     * 
     *                   Defines the XPath expression syntax supported for matching topic expressions.
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     *                   The following TopicExpressionDialects are mandatory for an ONVIF compliant device
     *                   :
     *                   
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="disc"&gt;&lt;li&gt;http://docs.oasis-open.org/wsn/t-1/TopicExpression/Concrete&lt;/li&gt;&lt;li&gt;http://www.onvif.org/ver10/tev/topicExpression/ConcreteSet.&lt;/li&gt;&lt;/ul&gt;
     * </pre>
     * Gets the value of the topicExpressionDialect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the topicExpressionDialect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopicExpressionDialect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTopicExpressionDialect() {
        if (topicExpressionDialect == null) {
            topicExpressionDialect = new ArrayList<String>();
        }
        return this.topicExpressionDialect;
    }

    /**
     * Gets the value of the messageContentFilterDialect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the messageContentFilterDialect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageContentFilterDialect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMessageContentFilterDialect() {
        if (messageContentFilterDialect == null) {
            messageContentFilterDialect = new ArrayList<String>();
        }
        return this.messageContentFilterDialect;
    }

    /**
     * Gets the value of the producerPropertiesFilterDialect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the producerPropertiesFilterDialect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducerPropertiesFilterDialect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProducerPropertiesFilterDialect() {
        if (producerPropertiesFilterDialect == null) {
            producerPropertiesFilterDialect = new ArrayList<String>();
        }
        return this.producerPropertiesFilterDialect;
    }

    /**
     * Gets the value of the messageContentSchemaLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the messageContentSchemaLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageContentSchemaLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMessageContentSchemaLocation() {
        if (messageContentSchemaLocation == null) {
            messageContentSchemaLocation = new ArrayList<String>();
        }
        return this.messageContentSchemaLocation;
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
     * {@link Object }
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
