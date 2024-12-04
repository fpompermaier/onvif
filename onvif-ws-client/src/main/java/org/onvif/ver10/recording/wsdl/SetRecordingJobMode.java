
package org.onvif.ver10.recording.wsdl;

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
 *         &lt;element name="JobToken" type="{http://www.onvif.org/ver10/schema}RecordingJobReference"/&gt;
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}RecordingJobMode"/&gt;
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
    "jobToken",
    "mode"
})
@XmlRootElement(name = "SetRecordingJobMode")
public class SetRecordingJobMode {

    @XmlElement(name = "JobToken", required = true)
    protected String jobToken;
    @XmlElement(name = "Mode", required = true)
    protected String mode;

    /**
     * Gets the value of the jobToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobToken() {
        return jobToken;
    }

    /**
     * Sets the value of the jobToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobToken(String value) {
        this.jobToken = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
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
