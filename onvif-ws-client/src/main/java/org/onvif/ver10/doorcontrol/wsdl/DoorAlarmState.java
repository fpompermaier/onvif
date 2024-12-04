
package org.onvif.ver10.doorcontrol.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoorAlarmState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DoorAlarmState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="DoorForcedOpen"/&gt;
 *     &lt;enumeration value="DoorOpenTooLong"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DoorAlarmState")
@XmlEnum
public enum DoorAlarmState {


    /**
     * No alarm.
     * 
     */
    @XmlEnumValue("Normal")
    NORMAL("Normal"),

    /**
     * Door is forced open.
     * 
     */
    @XmlEnumValue("DoorForcedOpen")
    DOOR_FORCED_OPEN("DoorForcedOpen"),

    /**
     * Door is held open too long.
     * 
     */
    @XmlEnumValue("DoorOpenTooLong")
    DOOR_OPEN_TOO_LONG("DoorOpenTooLong");
    private final String value;

    DoorAlarmState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DoorAlarmState fromValue(String v) {
        for (DoorAlarmState c: DoorAlarmState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
