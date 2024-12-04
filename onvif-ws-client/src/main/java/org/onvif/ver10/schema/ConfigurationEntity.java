
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * Base type defining the common properties of a configuration.
 *       
 * 
 * <p>Java class for ConfigurationEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.onvif.org/ver10/schema}Name"/&gt;
 *         &lt;element name="UseCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationEntity", propOrder = {
    "name",
    "useCount"
})
@XmlSeeAlso({
    VideoSourceConfiguration.class,
    AudioSourceConfiguration.class,
    VideoEncoderConfiguration.class,
    AudioEncoderConfiguration.class,
    VideoAnalyticsConfiguration.class,
    PTZConfiguration.class,
    MetadataConfiguration.class,
    AudioOutputConfiguration.class,
    AudioDecoderConfiguration.class,
    VideoEncoder2Configuration.class,
    AudioEncoder2Configuration.class,
    VideoOutputConfiguration.class,
    AnalyticsEngine.class,
    AnalyticsEngineInput.class,
    AnalyticsEngineControl.class
})
public class ConfigurationEntity {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "UseCount")
    protected int useCount;
    @XmlAttribute(name = "token", required = true)
    protected String token;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the useCount property.
     * 
     */
    public int getUseCount() {
        return useCount;
    }

    /**
     * Sets the value of the useCount property.
     * 
     */
    public void setUseCount(int value) {
        this.useCount = value;
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
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
