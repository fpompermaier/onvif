
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicDNSType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DynamicDNSType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NoUpdate"/&gt;
 *     &lt;enumeration value="ClientUpdates"/&gt;
 *     &lt;enumeration value="ServerUpdates"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DynamicDNSType")
@XmlEnum
public enum DynamicDNSType {

    @XmlEnumValue("NoUpdate")
    NO_UPDATE("NoUpdate"),
    @XmlEnumValue("ClientUpdates")
    CLIENT_UPDATES("ClientUpdates"),
    @XmlEnumValue("ServerUpdates")
    SERVER_UPDATES("ServerUpdates");
    private final String value;

    DynamicDNSType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DynamicDNSType fromValue(String v) {
        for (DynamicDNSType c: DynamicDNSType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
