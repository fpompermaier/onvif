
package org.onvif.ver10.accesscontrol.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Decision.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Decision"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Granted"/&gt;
 *     &lt;enumeration value="Denied"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Decision")
@XmlEnum
public enum Decision {


    /**
     * The decision is to grant access.
     * 
     */
    @XmlEnumValue("Granted")
    GRANTED("Granted"),

    /**
     * The decision is to deny access.
     * 
     */
    @XmlEnumValue("Denied")
    DENIED("Denied");
    private final String value;

    Decision(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Decision fromValue(String v) {
        for (Decision c: Decision.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
