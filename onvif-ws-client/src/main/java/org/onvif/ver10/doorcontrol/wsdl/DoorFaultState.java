
package org.onvif.ver10.doorcontrol.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoorFaultState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DoorFaultState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="NotInFault"/&gt;
 *     &lt;enumeration value="FaultDetected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DoorFaultState")
@XmlEnum
public enum DoorFaultState {


    /**
     * Fault state is unknown.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * No fault is detected.
     * 
     */
    @XmlEnumValue("NotInFault")
    NOT_IN_FAULT("NotInFault"),

    /**
     * Fault is detected.
     * 
     */
    @XmlEnumValue("FaultDetected")
    FAULT_DETECTED("FaultDetected");
    private final String value;

    DoorFaultState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DoorFaultState fromValue(String v) {
        for (DoorFaultState c: DoorFaultState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
