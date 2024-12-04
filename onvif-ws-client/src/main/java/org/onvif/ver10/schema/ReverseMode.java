
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReverseMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReverseMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OFF"/&gt;
 *     &lt;enumeration value="ON"/&gt;
 *     &lt;enumeration value="AUTO"/&gt;
 *     &lt;enumeration value="Extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReverseMode")
@XmlEnum
public enum ReverseMode {

    OFF("OFF"),
    ON("ON"),
    AUTO("AUTO"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    ReverseMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReverseMode fromValue(String v) {
        for (ReverseMode c: ReverseMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
