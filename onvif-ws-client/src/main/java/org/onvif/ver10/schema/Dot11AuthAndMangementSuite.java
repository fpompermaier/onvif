
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dot11AuthAndMangementSuite.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Dot11AuthAndMangementSuite"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Dot1X"/&gt;
 *     &lt;enumeration value="PSK"/&gt;
 *     &lt;enumeration value="Extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Dot11AuthAndMangementSuite")
@XmlEnum
public enum Dot11AuthAndMangementSuite {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Dot1X")
    DOT_1_X("Dot1X"),
    PSK("PSK"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    Dot11AuthAndMangementSuite(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Dot11AuthAndMangementSuite fromValue(String v) {
        for (Dot11AuthAndMangementSuite c: Dot11AuthAndMangementSuite.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
