
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscoveryMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DiscoveryMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Discoverable"/&gt;
 *     &lt;enumeration value="NonDiscoverable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DiscoveryMode")
@XmlEnum
public enum DiscoveryMode {

    @XmlEnumValue("Discoverable")
    DISCOVERABLE("Discoverable"),
    @XmlEnumValue("NonDiscoverable")
    NON_DISCOVERABLE("NonDiscoverable");
    private final String value;

    DiscoveryMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiscoveryMode fromValue(String v) {
        for (DiscoveryMode c: DiscoveryMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
