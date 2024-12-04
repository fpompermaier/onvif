
package org.onvif.ver10.recording.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.onvif.ver10.schema.ArrayOfFileProgress;
import org.w3c.dom.Element;


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
 *         &lt;element name="Progress" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="FileProgressStatus" type="{http://www.onvif.org/ver10/schema}ArrayOfFileProgress"/&gt;
 *         &lt;any processContents='lax'/&gt;
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
    "progress",
    "fileProgressStatus",
    "any"
})
@XmlRootElement(name = "StopExportRecordedDataResponse")
public class StopExportRecordedDataResponse {

    @XmlElement(name = "Progress")
    protected float progress;
    @XmlElement(name = "FileProgressStatus", required = true)
    protected ArrayOfFileProgress fileProgressStatus;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the progress property.
     * 
     */
    public float getProgress() {
        return progress;
    }

    /**
     * Sets the value of the progress property.
     * 
     */
    public void setProgress(float value) {
        this.progress = value;
    }

    /**
     * Gets the value of the fileProgressStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFileProgress }
     *     
     */
    public ArrayOfFileProgress getFileProgressStatus() {
        return fileProgressStatus;
    }

    /**
     * Sets the value of the fileProgressStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFileProgress }
     *     
     */
    public void setFileProgressStatus(ArrayOfFileProgress value) {
        this.fileProgressStatus = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
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
