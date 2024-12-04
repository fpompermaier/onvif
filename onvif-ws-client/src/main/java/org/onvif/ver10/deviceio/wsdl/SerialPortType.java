
package org.onvif.ver10.deviceio.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SerialPortType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SerialPortType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RS232"/&gt;
 *     &lt;enumeration value="RS422HalfDuplex"/&gt;
 *     &lt;enumeration value="RS422FullDuplex"/&gt;
 *     &lt;enumeration value="RS485HalfDuplex"/&gt;
 *     &lt;enumeration value="RS485FullDuplex"/&gt;
 *     &lt;enumeration value="Generic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SerialPortType")
@XmlEnum
public enum SerialPortType {

    @XmlEnumValue("RS232")
    RS_232("RS232"),
    @XmlEnumValue("RS422HalfDuplex")
    RS_422_HALF_DUPLEX("RS422HalfDuplex"),
    @XmlEnumValue("RS422FullDuplex")
    RS_422_FULL_DUPLEX("RS422FullDuplex"),
    @XmlEnumValue("RS485HalfDuplex")
    RS_485_HALF_DUPLEX("RS485HalfDuplex"),
    @XmlEnumValue("RS485FullDuplex")
    RS_485_FULL_DUPLEX("RS485FullDuplex"),
    @XmlEnumValue("Generic")
    GENERIC("Generic");
    private final String value;

    SerialPortType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SerialPortType fromValue(String v) {
        for (SerialPortType c: SerialPortType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
