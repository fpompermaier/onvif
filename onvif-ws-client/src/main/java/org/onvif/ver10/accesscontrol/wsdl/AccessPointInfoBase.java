
package org.onvif.ver10.accesscontrol.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.onvif.ver10.pacs.DataEntity;


/**
 * 
 *             Used as extension base for AccessPointInfo.
 *           
 * 
 * <p>Java class for AccessPointInfoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessPointInfoBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.onvif.org/ver10/pacs}DataEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.onvif.org/ver10/pacs}Name"/&gt;
 *         &lt;element name="Description" type="{http://www.onvif.org/ver10/pacs}Description" minOccurs="0"/&gt;
 *         &lt;element name="AreaFrom" type="{http://www.onvif.org/ver10/pacs}ReferenceToken" minOccurs="0"/&gt;
 *         &lt;element name="AreaTo" type="{http://www.onvif.org/ver10/pacs}ReferenceToken" minOccurs="0"/&gt;
 *         &lt;element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/&gt;
 *         &lt;element name="Entity" type="{http://www.onvif.org/ver10/pacs}ReferenceToken"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessPointInfoBase", propOrder = {
    "name",
    "description",
    "areaFrom",
    "areaTo",
    "entityType",
    "entity"
})
@XmlSeeAlso({
    AccessPointInfo.class
})
public class AccessPointInfoBase
    extends DataEntity
{

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "AreaFrom")
    protected String areaFrom;
    @XmlElement(name = "AreaTo")
    protected String areaTo;
    @XmlElement(name = "EntityType")
    protected QName entityType;
    @XmlElement(name = "Entity", required = true)
    protected String entity;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the areaFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaFrom() {
        return areaFrom;
    }

    /**
     * Sets the value of the areaFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaFrom(String value) {
        this.areaFrom = value;
    }

    /**
     * Gets the value of the areaTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaTo() {
        return areaTo;
    }

    /**
     * Sets the value of the areaTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaTo(String value) {
        this.areaTo = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setEntityType(QName value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntity(String value) {
        this.entity = value;
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
