
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemLogType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SystemLogType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="System"/&gt;
 *     &lt;enumeration value="Access"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SystemLogType")
@XmlEnum
public enum SystemLogType {


    /**
     * Indicates that a system log is requested.
     * 
     */
    @XmlEnumValue("System")
    SYSTEM("System"),

    /**
     * Indicates that a access log is requested.
     * 
     */
    @XmlEnumValue("Access")
    ACCESS("Access");
    private final String value;

    SystemLogType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemLogType fromValue(String v) {
        for (SystemLogType c: SystemLogType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
