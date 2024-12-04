
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DigitalIdleState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DigitalIdleState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="closed"/&gt;
 *     &lt;enumeration value="open"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DigitalIdleState")
@XmlEnum
public enum DigitalIdleState {

    @XmlEnumValue("closed")
    CLOSED("closed"),
    @XmlEnumValue("open")
    OPEN("open");
    private final String value;

    DigitalIdleState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DigitalIdleState fromValue(String v) {
        for (DigitalIdleState c: DigitalIdleState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
