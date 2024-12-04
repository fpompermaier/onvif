
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for PTZSpaces complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PTZSpaces"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AbsolutePanTiltPositionSpace" type="{http://www.onvif.org/ver10/schema}Space2DDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AbsoluteZoomPositionSpace" type="{http://www.onvif.org/ver10/schema}Space1DDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RelativePanTiltTranslationSpace" type="{http://www.onvif.org/ver10/schema}Space2DDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RelativeZoomTranslationSpace" type="{http://www.onvif.org/ver10/schema}Space1DDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContinuousPanTiltVelocitySpace" type="{http://www.onvif.org/ver10/schema}Space2DDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContinuousZoomVelocitySpace" type="{http://www.onvif.org/ver10/schema}Space1DDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PanTiltSpeedSpace" type="{http://www.onvif.org/ver10/schema}Space1DDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ZoomSpeedSpace" type="{http://www.onvif.org/ver10/schema}Space1DDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZSpacesExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZSpaces", propOrder = {
    "absolutePanTiltPositionSpace",
    "absoluteZoomPositionSpace",
    "relativePanTiltTranslationSpace",
    "relativeZoomTranslationSpace",
    "continuousPanTiltVelocitySpace",
    "continuousZoomVelocitySpace",
    "panTiltSpeedSpace",
    "zoomSpeedSpace",
    "extension"
})
public class PTZSpaces {

    @XmlElement(name = "AbsolutePanTiltPositionSpace")
    protected List<Space2DDescription> absolutePanTiltPositionSpace;
    @XmlElement(name = "AbsoluteZoomPositionSpace")
    protected List<Space1DDescription> absoluteZoomPositionSpace;
    @XmlElement(name = "RelativePanTiltTranslationSpace")
    protected List<Space2DDescription> relativePanTiltTranslationSpace;
    @XmlElement(name = "RelativeZoomTranslationSpace")
    protected List<Space1DDescription> relativeZoomTranslationSpace;
    @XmlElement(name = "ContinuousPanTiltVelocitySpace")
    protected List<Space2DDescription> continuousPanTiltVelocitySpace;
    @XmlElement(name = "ContinuousZoomVelocitySpace")
    protected List<Space1DDescription> continuousZoomVelocitySpace;
    @XmlElement(name = "PanTiltSpeedSpace")
    protected List<Space1DDescription> panTiltSpeedSpace;
    @XmlElement(name = "ZoomSpeedSpace")
    protected List<Space1DDescription> zoomSpeedSpace;
    @XmlElement(name = "Extension")
    protected PTZSpacesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the absolutePanTiltPositionSpace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the absolutePanTiltPositionSpace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbsolutePanTiltPositionSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space2DDescription }
     * 
     * 
     */
    public List<Space2DDescription> getAbsolutePanTiltPositionSpace() {
        if (absolutePanTiltPositionSpace == null) {
            absolutePanTiltPositionSpace = new ArrayList<Space2DDescription>();
        }
        return this.absolutePanTiltPositionSpace;
    }

    /**
     * Gets the value of the absoluteZoomPositionSpace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the absoluteZoomPositionSpace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbsoluteZoomPositionSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space1DDescription }
     * 
     * 
     */
    public List<Space1DDescription> getAbsoluteZoomPositionSpace() {
        if (absoluteZoomPositionSpace == null) {
            absoluteZoomPositionSpace = new ArrayList<Space1DDescription>();
        }
        return this.absoluteZoomPositionSpace;
    }

    /**
     * Gets the value of the relativePanTiltTranslationSpace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the relativePanTiltTranslationSpace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelativePanTiltTranslationSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space2DDescription }
     * 
     * 
     */
    public List<Space2DDescription> getRelativePanTiltTranslationSpace() {
        if (relativePanTiltTranslationSpace == null) {
            relativePanTiltTranslationSpace = new ArrayList<Space2DDescription>();
        }
        return this.relativePanTiltTranslationSpace;
    }

    /**
     * Gets the value of the relativeZoomTranslationSpace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the relativeZoomTranslationSpace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelativeZoomTranslationSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space1DDescription }
     * 
     * 
     */
    public List<Space1DDescription> getRelativeZoomTranslationSpace() {
        if (relativeZoomTranslationSpace == null) {
            relativeZoomTranslationSpace = new ArrayList<Space1DDescription>();
        }
        return this.relativeZoomTranslationSpace;
    }

    /**
     * Gets the value of the continuousPanTiltVelocitySpace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the continuousPanTiltVelocitySpace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContinuousPanTiltVelocitySpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space2DDescription }
     * 
     * 
     */
    public List<Space2DDescription> getContinuousPanTiltVelocitySpace() {
        if (continuousPanTiltVelocitySpace == null) {
            continuousPanTiltVelocitySpace = new ArrayList<Space2DDescription>();
        }
        return this.continuousPanTiltVelocitySpace;
    }

    /**
     * Gets the value of the continuousZoomVelocitySpace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the continuousZoomVelocitySpace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContinuousZoomVelocitySpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space1DDescription }
     * 
     * 
     */
    public List<Space1DDescription> getContinuousZoomVelocitySpace() {
        if (continuousZoomVelocitySpace == null) {
            continuousZoomVelocitySpace = new ArrayList<Space1DDescription>();
        }
        return this.continuousZoomVelocitySpace;
    }

    /**
     * Gets the value of the panTiltSpeedSpace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the panTiltSpeedSpace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPanTiltSpeedSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space1DDescription }
     * 
     * 
     */
    public List<Space1DDescription> getPanTiltSpeedSpace() {
        if (panTiltSpeedSpace == null) {
            panTiltSpeedSpace = new ArrayList<Space1DDescription>();
        }
        return this.panTiltSpeedSpace;
    }

    /**
     * Gets the value of the zoomSpeedSpace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the zoomSpeedSpace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZoomSpeedSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space1DDescription }
     * 
     * 
     */
    public List<Space1DDescription> getZoomSpeedSpace() {
        if (zoomSpeedSpace == null) {
            zoomSpeedSpace = new ArrayList<Space1DDescription>();
        }
        return this.zoomSpeedSpace;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link PTZSpacesExtension }
     *     
     */
    public PTZSpacesExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTZSpacesExtension }
     *     
     */
    public void setExtension(PTZSpacesExtension value) {
        this.extension = value;
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
