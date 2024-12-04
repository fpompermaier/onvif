
package org.onvif.ver10.doorcontrol.wsdl;

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


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
 *         &lt;element name="Token" type="{http://www.onvif.org/ver10/pacs}ReferenceToken"/&gt;
 *         &lt;element name="UseExtendedTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AccessTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="OpenTooLongTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreAlarmTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/doorcontrol/wsdl}AccessDoorExtension" minOccurs="0"/&gt;
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
    "token",
    "useExtendedTime",
    "accessTime",
    "openTooLongTime",
    "preAlarmTime",
    "extension"
})
@XmlRootElement(name = "AccessDoor")
public class AccessDoor {

    @XmlElement(name = "Token", required = true)
    protected String token;
    @XmlElement(name = "UseExtendedTime")
    protected Boolean useExtendedTime;
    @XmlElement(name = "AccessTime")
    protected Duration accessTime;
    @XmlElement(name = "OpenTooLongTime")
    protected Duration openTooLongTime;
    @XmlElement(name = "PreAlarmTime")
    protected Duration preAlarmTime;
    @XmlElement(name = "Extension")
    protected AccessDoorExtension extension;

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
     * Gets the value of the useExtendedTime property.
     * This getter has been renamed from isUseExtendedTime() to getUseExtendedTime() by cxf-xjc-boolean plugin.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseExtendedTime() {
        return useExtendedTime;
    }

    /**
     * Sets the value of the useExtendedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseExtendedTime(Boolean value) {
        this.useExtendedTime = value;
    }

    /**
     * Gets the value of the accessTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAccessTime() {
        return accessTime;
    }

    /**
     * Sets the value of the accessTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAccessTime(Duration value) {
        this.accessTime = value;
    }

    /**
     * Gets the value of the openTooLongTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOpenTooLongTime() {
        return openTooLongTime;
    }

    /**
     * Sets the value of the openTooLongTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOpenTooLongTime(Duration value) {
        this.openTooLongTime = value;
    }

    /**
     * Gets the value of the preAlarmTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreAlarmTime() {
        return preAlarmTime;
    }

    /**
     * Sets the value of the preAlarmTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreAlarmTime(Duration value) {
        this.preAlarmTime = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link AccessDoorExtension }
     *     
     */
    public AccessDoorExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessDoorExtension }
     *     
     */
    public void setExtension(AccessDoorExtension value) {
        this.extension = value;
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
