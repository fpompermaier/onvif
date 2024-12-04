
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
 * <p>Java class for ObjectTree complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectTree"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rename" type="{http://www.onvif.org/ver10/schema}Rename" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Split" type="{http://www.onvif.org/ver10/schema}Split" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Merge" type="{http://www.onvif.org/ver10/schema}Merge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Delete" type="{http://www.onvif.org/ver10/schema}ObjectId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ObjectTreeExtension" minOccurs="0"/&gt;
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
@XmlType(name = "ObjectTree", propOrder = {
    "rename",
    "split",
    "merge",
    "delete",
    "extension"
})
public class ObjectTree {

    @XmlElement(name = "Rename")
    protected List<Rename> rename;
    @XmlElement(name = "Split")
    protected List<Split> split;
    @XmlElement(name = "Merge")
    protected List<Merge> merge;
    @XmlElement(name = "Delete")
    protected List<ObjectId> delete;
    @XmlElement(name = "Extension")
    protected ObjectTreeExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the rename property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rename property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRename().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rename }
     * 
     * 
     */
    public List<Rename> getRename() {
        if (rename == null) {
            rename = new ArrayList<Rename>();
        }
        return this.rename;
    }

    /**
     * Gets the value of the split property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the split property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Split }
     * 
     * 
     */
    public List<Split> getSplit() {
        if (split == null) {
            split = new ArrayList<Split>();
        }
        return this.split;
    }

    /**
     * Gets the value of the merge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the merge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMerge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Merge }
     * 
     * 
     */
    public List<Merge> getMerge() {
        if (merge == null) {
            merge = new ArrayList<Merge>();
        }
        return this.merge;
    }

    /**
     * Gets the value of the delete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the delete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectId }
     * 
     * 
     */
    public List<ObjectId> getDelete() {
        if (delete == null) {
            delete = new ArrayList<ObjectId>();
        }
        return this.delete;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectTreeExtension }
     *     
     */
    public ObjectTreeExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectTreeExtension }
     *     
     */
    public void setExtension(ObjectTreeExtension value) {
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
