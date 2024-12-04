
package org.onvif.ver10.doorcontrol.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoorPhysicalState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DoorPhysicalState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Open"/&gt;
 *     &lt;enumeration value="Closed"/&gt;
 *     &lt;enumeration value="Fault"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DoorPhysicalState")
@XmlEnum
public enum DoorPhysicalState {


    /**
     * Value is currently unknown (possibly due to initialization or
     *                 monitors not giving a conclusive result).
     *               
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * Door is open.
     * 
     */
    @XmlEnumValue("Open")
    OPEN("Open"),

    /**
     * Door is closed.
     * 
     */
    @XmlEnumValue("Closed")
    CLOSED("Closed"),

    /**
     * Door monitor fault is detected.
     * 
     */
    @XmlEnumValue("Fault")
    FAULT("Fault");
    private final String value;

    DoorPhysicalState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DoorPhysicalState fromValue(String v) {
        for (DoorPhysicalState c: DoorPhysicalState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
