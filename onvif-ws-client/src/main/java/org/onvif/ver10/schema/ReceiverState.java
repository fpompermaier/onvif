
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiverState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReceiverState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotConnected"/&gt;
 *     &lt;enumeration value="Connecting"/&gt;
 *     &lt;enumeration value="Connected"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReceiverState")
@XmlEnum
public enum ReceiverState {


    /**
     * The receiver is not connected.
     * 
     */
    @XmlEnumValue("NotConnected")
    NOT_CONNECTED("NotConnected"),

    /**
     * The receiver is attempting to connect.
     * 
     */
    @XmlEnumValue("Connecting")
    CONNECTING("Connecting"),

    /**
     * The receiver is connected.
     * 
     */
    @XmlEnumValue("Connected")
    CONNECTED("Connected"),

    /**
     * This case should never happen.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ReceiverState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReceiverState fromValue(String v) {
        for (ReceiverState c: ReceiverState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
