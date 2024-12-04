
package org.onvif.ver10.device.wsdl;

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="UploadUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="ExpectedDownTime" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
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
    "uploadUri",
    "expectedDownTime"
})
@XmlRootElement(name = "StartSystemRestoreResponse")
public class StartSystemRestoreResponse {

    @XmlElement(name = "UploadUri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uploadUri;
    @XmlElement(name = "ExpectedDownTime", required = true)
    protected Duration expectedDownTime;

    /**
     * Gets the value of the uploadUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadUri() {
        return uploadUri;
    }

    /**
     * Sets the value of the uploadUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadUri(String value) {
        this.uploadUri = value;
    }

    /**
     * Gets the value of the expectedDownTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExpectedDownTime() {
        return expectedDownTime;
    }

    /**
     * Sets the value of the expectedDownTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExpectedDownTime(Duration value) {
        this.expectedDownTime = value;
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
