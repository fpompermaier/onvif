
package org.onvif.ver10.media.wsdl;

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
 *         &lt;element name="TotalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="JPEG" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="H264" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MPEG4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "totalNumber",
    "jpeg",
    "h264",
    "mpeg4"
})
@XmlRootElement(name = "GetGuaranteedNumberOfVideoEncoderInstancesResponse")
public class GetGuaranteedNumberOfVideoEncoderInstancesResponse {

    @XmlElement(name = "TotalNumber")
    protected int totalNumber;
    @XmlElement(name = "JPEG")
    protected Integer jpeg;
    @XmlElement(name = "H264")
    protected Integer h264;
    @XmlElement(name = "MPEG4")
    protected Integer mpeg4;

    /**
     * Gets the value of the totalNumber property.
     * 
     */
    public int getTotalNumber() {
        return totalNumber;
    }

    /**
     * Sets the value of the totalNumber property.
     * 
     */
    public void setTotalNumber(int value) {
        this.totalNumber = value;
    }

    /**
     * Gets the value of the jpeg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJPEG() {
        return jpeg;
    }

    /**
     * Sets the value of the jpeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJPEG(Integer value) {
        this.jpeg = value;
    }

    /**
     * Gets the value of the h264 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getH264() {
        return h264;
    }

    /**
     * Sets the value of the h264 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setH264(Integer value) {
        this.h264 = value;
    }

    /**
     * Gets the value of the mpeg4 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPEG4() {
        return mpeg4;
    }

    /**
     * Sets the value of the mpeg4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPEG4(Integer value) {
        this.mpeg4 = value;
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
