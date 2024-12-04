
package org.onvif.ver10.doorcontrol.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoorTamperState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DoorTamperState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="NotInTamper"/&gt;
 *     &lt;enumeration value="TamperDetected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DoorTamperState")
@XmlEnum
public enum DoorTamperState {


    /**
     * Value is currently not known.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * No tampering is detected.
     * 
     */
    @XmlEnumValue("NotInTamper")
    NOT_IN_TAMPER("NotInTamper"),

    /**
     * Tampering is detected.
     * 
     */
    @XmlEnumValue("TamperDetected")
    TAMPER_DETECTED("TamperDetected");
    private final String value;

    DoorTamperState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DoorTamperState fromValue(String v) {
        for (DoorTamperState c: DoorTamperState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
