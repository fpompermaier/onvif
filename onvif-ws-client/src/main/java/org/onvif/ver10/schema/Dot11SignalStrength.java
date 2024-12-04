
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dot11SignalStrength.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Dot11SignalStrength"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Very Bad"/&gt;
 *     &lt;enumeration value="Bad"/&gt;
 *     &lt;enumeration value="Good"/&gt;
 *     &lt;enumeration value="Very Good"/&gt;
 *     &lt;enumeration value="Extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Dot11SignalStrength")
@XmlEnum
public enum Dot11SignalStrength {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Very Bad")
    VERY_BAD("Very Bad"),
    @XmlEnumValue("Bad")
    BAD("Bad"),
    @XmlEnumValue("Good")
    GOOD("Good"),
    @XmlEnumValue("Very Good")
    VERY_GOOD("Very Good"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    Dot11SignalStrength(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Dot11SignalStrength fromValue(String v) {
        for (Dot11SignalStrength c: Dot11SignalStrength.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
