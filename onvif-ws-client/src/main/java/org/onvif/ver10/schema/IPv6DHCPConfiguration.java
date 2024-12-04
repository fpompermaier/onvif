
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPv6DHCPConfiguration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="IPv6DHCPConfiguration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="Stateful"/&gt;
 *     &lt;enumeration value="Stateless"/&gt;
 *     &lt;enumeration value="Off"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IPv6DHCPConfiguration")
@XmlEnum
public enum IPv6DHCPConfiguration {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Stateful")
    STATEFUL("Stateful"),
    @XmlEnumValue("Stateless")
    STATELESS("Stateless"),
    @XmlEnumValue("Off")
    OFF("Off");
    private final String value;

    IPv6DHCPConfiguration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IPv6DHCPConfiguration fromValue(String v) {
        for (IPv6DHCPConfiguration c: IPv6DHCPConfiguration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
