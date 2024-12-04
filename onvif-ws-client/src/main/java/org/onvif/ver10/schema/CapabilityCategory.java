
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapabilityCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CapabilityCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Analytics"/&gt;
 *     &lt;enumeration value="Device"/&gt;
 *     &lt;enumeration value="Events"/&gt;
 *     &lt;enumeration value="Imaging"/&gt;
 *     &lt;enumeration value="Media"/&gt;
 *     &lt;enumeration value="PTZ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CapabilityCategory")
@XmlEnum
public enum CapabilityCategory {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Analytics")
    ANALYTICS("Analytics"),
    @XmlEnumValue("Device")
    DEVICE("Device"),
    @XmlEnumValue("Events")
    EVENTS("Events"),
    @XmlEnumValue("Imaging")
    IMAGING("Imaging"),
    @XmlEnumValue("Media")
    MEDIA("Media"),
    PTZ("PTZ");
    private final String value;

    CapabilityCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CapabilityCategory fromValue(String v) {
        for (CapabilityCategory c: CapabilityCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
