
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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.w3c.dom.Element;


/**
 * <p>Java class for AnalyticsEngineControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalyticsEngineControl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.onvif.org/ver10/schema}ConfigurationEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EngineToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="EngineConfigToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="InputToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ReceiverToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Multicast" type="{http://www.onvif.org/ver10/schema}MulticastConfiguration" minOccurs="0"/&gt;
 *         &lt;element name="Subscription" type="{http://www.onvif.org/ver10/schema}Config"/&gt;
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}ModeOfOperation"/&gt;
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
@XmlType(name = "AnalyticsEngineControl", propOrder = {
    "engineToken",
    "engineConfigToken",
    "inputToken",
    "receiverToken",
    "multicast",
    "subscription",
    "mode",
    "any"
})
public class AnalyticsEngineControl
    extends ConfigurationEntity
{

    @XmlElement(name = "EngineToken", required = true)
    protected String engineToken;
    @XmlElement(name = "EngineConfigToken", required = true)
    protected String engineConfigToken;
    @XmlElement(name = "InputToken", required = true)
    protected List<String> inputToken;
    @XmlElement(name = "ReceiverToken", required = true)
    protected List<String> receiverToken;
    @XmlElement(name = "Multicast")
    protected MulticastConfiguration multicast;
    @XmlElement(name = "Subscription", required = true)
    protected Config subscription;
    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected ModeOfOperation mode;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the engineToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineToken() {
        return engineToken;
    }

    /**
     * Sets the value of the engineToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineToken(String value) {
        this.engineToken = value;
    }

    /**
     * Gets the value of the engineConfigToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineConfigToken() {
        return engineConfigToken;
    }

    /**
     * Sets the value of the engineConfigToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineConfigToken(String value) {
        this.engineConfigToken = value;
    }

    /**
     * Gets the value of the inputToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the inputToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInputToken() {
        if (inputToken == null) {
            inputToken = new ArrayList<String>();
        }
        return this.inputToken;
    }

    /**
     * Gets the value of the receiverToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the receiverToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiverToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReceiverToken() {
        if (receiverToken == null) {
            receiverToken = new ArrayList<String>();
        }
        return this.receiverToken;
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
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link Config }
     *     
     */
    public Config getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Config }
     *     
     */
    public void setSubscription(Config value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link ModeOfOperation }
     *     
     */
    public ModeOfOperation getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModeOfOperation }
     *     
     */
    public void setMode(ModeOfOperation value) {
        this.mode = value;
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
