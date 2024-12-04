
package org.onvif.ver10.accessrules.wsdl;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="NextStartReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccessProfileInfo" type="{http://www.onvif.org/ver10/accessrules/wsdl}AccessProfileInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "nextStartReference",
    "accessProfileInfo"
})
@XmlRootElement(name = "GetAccessProfileInfoListResponse")
public class GetAccessProfileInfoListResponse {

    @XmlElement(name = "NextStartReference")
    protected String nextStartReference;
    @XmlElement(name = "AccessProfileInfo")
    protected List<AccessProfileInfo> accessProfileInfo;

    /**
     * Gets the value of the nextStartReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextStartReference() {
        return nextStartReference;
    }

    /**
     * Sets the value of the nextStartReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextStartReference(String value) {
        this.nextStartReference = value;
    }

    /**
     * Gets the value of the accessProfileInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accessProfileInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessProfileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessProfileInfo }
     * 
     * 
     */
    public List<AccessProfileInfo> getAccessProfileInfo() {
        if (accessProfileInfo == null) {
            accessProfileInfo = new ArrayList<AccessProfileInfo>();
        }
        return this.accessProfileInfo;
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
