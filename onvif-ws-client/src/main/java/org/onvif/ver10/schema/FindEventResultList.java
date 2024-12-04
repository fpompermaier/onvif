
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for FindEventResultList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindEventResultList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchState" type="{http://www.onvif.org/ver10/schema}SearchState"/&gt;
 *         &lt;element name="Result" type="{http://www.onvif.org/ver10/schema}FindEventResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindEventResultList", propOrder = {
    "searchState",
    "result"
})
public class FindEventResultList {

    @XmlElement(name = "SearchState", required = true)
    @XmlSchemaType(name = "string")
    protected SearchState searchState;
    @XmlElement(name = "Result")
    protected List<FindEventResult> result;

    /**
     * Gets the value of the searchState property.
     * 
     * @return
     *     possible object is
     *     {@link SearchState }
     *     
     */
    public SearchState getSearchState() {
        return searchState;
    }

    /**
     * Sets the value of the searchState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchState }
     *     
     */
    public void setSearchState(SearchState value) {
        this.searchState = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FindEventResult }
     * 
     * 
     */
    public List<FindEventResult> getResult() {
        if (result == null) {
            result = new ArrayList<FindEventResult>();
        }
        return this.result;
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
