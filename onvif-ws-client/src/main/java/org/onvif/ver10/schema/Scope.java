
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for Scope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Scope"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScopeDef" type="{http://www.onvif.org/ver10/schema}ScopeDefinition"/&gt;
 *         &lt;element name="ScopeItem" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scope", propOrder = {
    "scopeDef",
    "scopeItem"
})
public class Scope {

    @XmlElement(name = "ScopeDef", required = true)
    @XmlSchemaType(name = "string")
    protected ScopeDefinition scopeDef;
    @XmlElement(name = "ScopeItem", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String scopeItem;

    /**
     * Gets the value of the scopeDef property.
     * 
     * @return
     *     possible object is
     *     {@link ScopeDefinition }
     *     
     */
    public ScopeDefinition getScopeDef() {
        return scopeDef;
    }

    /**
     * Sets the value of the scopeDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeDefinition }
     *     
     */
    public void setScopeDef(ScopeDefinition value) {
        this.scopeDef = value;
    }

    /**
     * Gets the value of the scopeItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeItem() {
        return scopeItem;
    }

    /**
     * Sets the value of the scopeItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeItem(String value) {
        this.scopeItem = value;
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
