
package org.onvif.ver10.advancedsecurity.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="KeyStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ok"/&gt;
 *     &lt;enumeration value="generating"/&gt;
 *     &lt;enumeration value="corrupt"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KeyStatus")
@XmlEnum
public enum KeyStatus {


    /**
     * Key is ready for use
     * 
     */
    @XmlEnumValue("ok")
    OK("ok"),

    /**
     * Key is being generated
     * 
     */
    @XmlEnumValue("generating")
    GENERATING("generating"),

    /**
     * Key has not been successfully generated and cannot be used.
     *               
     * 
     */
    @XmlEnumValue("corrupt")
    CORRUPT("corrupt");
    private final String value;

    KeyStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeyStatus fromValue(String v) {
        for (KeyStatus c: KeyStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
