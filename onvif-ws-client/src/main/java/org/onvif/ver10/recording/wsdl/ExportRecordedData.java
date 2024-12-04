
package org.onvif.ver10.recording.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.onvif.ver10.schema.SearchScope;
import org.onvif.ver10.schema.StorageReferencePath;


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
 *         &lt;element name="SearchScope" type="{http://www.onvif.org/ver10/schema}SearchScope"/&gt;
 *         &lt;element name="FileFormat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StorageDestination" type="{http://www.onvif.org/ver10/schema}StorageReferencePath"/&gt;
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
    "searchScope",
    "fileFormat",
    "storageDestination"
})
@XmlRootElement(name = "ExportRecordedData")
public class ExportRecordedData {

    @XmlElement(name = "SearchScope", required = true)
    protected SearchScope searchScope;
    @XmlElement(name = "FileFormat", required = true)
    protected String fileFormat;
    @XmlElement(name = "StorageDestination", required = true)
    protected StorageReferencePath storageDestination;

    /**
     * Gets the value of the searchScope property.
     * 
     * @return
     *     possible object is
     *     {@link SearchScope }
     *     
     */
    public SearchScope getSearchScope() {
        return searchScope;
    }

    /**
     * Sets the value of the searchScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchScope }
     *     
     */
    public void setSearchScope(SearchScope value) {
        this.searchScope = value;
    }

    /**
     * Gets the value of the fileFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileFormat() {
        return fileFormat;
    }

    /**
     * Sets the value of the fileFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileFormat(String value) {
        this.fileFormat = value;
    }

    /**
     * Gets the value of the storageDestination property.
     * 
     * @return
     *     possible object is
     *     {@link StorageReferencePath }
     *     
     */
    public StorageReferencePath getStorageDestination() {
        return storageDestination;
    }

    /**
     * Sets the value of the storageDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageReferencePath }
     *     
     */
    public void setStorageDestination(StorageReferencePath value) {
        this.storageDestination = value;
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
