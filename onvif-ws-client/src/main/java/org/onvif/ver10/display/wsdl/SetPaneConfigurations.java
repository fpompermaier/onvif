
package org.onvif.ver10.display.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.onvif.ver10.schema.PaneConfiguration;


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
 *         &lt;element name="VideoOutput" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/&gt;
 *         &lt;element name="PaneConfiguration" type="{http://www.onvif.org/ver10/schema}PaneConfiguration" maxOccurs="unbounded"/&gt;
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
    "videoOutput",
    "paneConfiguration"
})
@XmlRootElement(name = "SetPaneConfigurations")
public class SetPaneConfigurations {

    @XmlElement(name = "VideoOutput", required = true)
    protected String videoOutput;
    @XmlElement(name = "PaneConfiguration", required = true)
    protected List<PaneConfiguration> paneConfiguration;

    /**
     * Gets the value of the videoOutput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoOutput() {
        return videoOutput;
    }

    /**
     * Sets the value of the videoOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoOutput(String value) {
        this.videoOutput = value;
    }

    /**
     * Gets the value of the paneConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the paneConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaneConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaneConfiguration }
     * 
     * 
     */
    public List<PaneConfiguration> getPaneConfiguration() {
        if (paneConfiguration == null) {
            paneConfiguration = new ArrayList<PaneConfiguration>();
        }
        return this.paneConfiguration;
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
