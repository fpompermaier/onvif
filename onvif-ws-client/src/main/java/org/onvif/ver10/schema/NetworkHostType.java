
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkHostType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NetworkHostType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IPv4"/&gt;
 *     &lt;enumeration value="IPv6"/&gt;
 *     &lt;enumeration value="DNS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetworkHostType")
@XmlEnum
public enum NetworkHostType {

    @XmlEnumValue("IPv4")
    I_PV_4("IPv4"),
    @XmlEnumValue("IPv6")
    I_PV_6("IPv6"),
    DNS("DNS");
    private final String value;

    NetworkHostType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkHostType fromValue(String v) {
        for (NetworkHostType c: NetworkHostType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
