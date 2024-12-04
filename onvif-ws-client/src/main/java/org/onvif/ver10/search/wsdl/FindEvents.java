
package org.onvif.ver10.search.wsdl;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.onvif.ver10.schema.EventFilter;
import org.onvif.ver10.schema.SearchScope;


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
 *         &lt;element name="StartPoint" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndPoint" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Scope" type="{http://www.onvif.org/ver10/schema}SearchScope"/&gt;
 *         &lt;element name="SearchFilter" type="{http://www.onvif.org/ver10/schema}EventFilter"/&gt;
 *         &lt;element name="IncludeStartState" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MaxMatches" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="KeepAliveTime" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
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
    "startPoint",
    "endPoint",
    "scope",
    "searchFilter",
    "includeStartState",
    "maxMatches",
    "keepAliveTime"
})
@XmlRootElement(name = "FindEvents")
public class FindEvents {

    @XmlElement(name = "StartPoint", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startPoint;
    @XmlElement(name = "EndPoint")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endPoint;
    @XmlElement(name = "Scope", required = true)
    protected SearchScope scope;
    @XmlElement(name = "SearchFilter", required = true)
    protected EventFilter searchFilter;
    @XmlElement(name = "IncludeStartState")
    protected boolean includeStartState;
    @XmlElement(name = "MaxMatches")
    protected Integer maxMatches;
    @XmlElement(name = "KeepAliveTime", required = true)
    protected Duration keepAliveTime;

    /**
     * Gets the value of the startPoint property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartPoint() {
        return startPoint;
    }

    /**
     * Sets the value of the startPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartPoint(XMLGregorianCalendar value) {
        this.startPoint = value;
    }

    /**
     * Gets the value of the endPoint property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndPoint() {
        return endPoint;
    }

    /**
     * Sets the value of the endPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndPoint(XMLGregorianCalendar value) {
        this.endPoint = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link SearchScope }
     *     
     */
    public SearchScope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchScope }
     *     
     */
    public void setScope(SearchScope value) {
        this.scope = value;
    }

    /**
     * Gets the value of the searchFilter property.
     * 
     * @return
     *     possible object is
     *     {@link EventFilter }
     *     
     */
    public EventFilter getSearchFilter() {
        return searchFilter;
    }

    /**
     * Sets the value of the searchFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFilter }
     *     
     */
    public void setSearchFilter(EventFilter value) {
        this.searchFilter = value;
    }

    /**
     * Gets the value of the includeStartState property.
     * This getter has been renamed from isIncludeStartState() to getIncludeStartState() by cxf-xjc-boolean plugin.
     * 
     */
    public boolean getIncludeStartState() {
        return includeStartState;
    }

    /**
     * Sets the value of the includeStartState property.
     * 
     */
    public void setIncludeStartState(boolean value) {
        this.includeStartState = value;
    }

    /**
     * Gets the value of the maxMatches property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxMatches() {
        return maxMatches;
    }

    /**
     * Sets the value of the maxMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxMatches(Integer value) {
        this.maxMatches = value;
    }

    /**
     * Gets the value of the keepAliveTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getKeepAliveTime() {
        return keepAliveTime;
    }

    /**
     * Sets the value of the keepAliveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setKeepAliveTime(Duration value) {
        this.keepAliveTime = value;
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
