
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UserLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Administrator"/&gt;
 *     &lt;enumeration value="Operator"/&gt;
 *     &lt;enumeration value="User"/&gt;
 *     &lt;enumeration value="Anonymous"/&gt;
 *     &lt;enumeration value="Extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UserLevel")
@XmlEnum
public enum UserLevel {

    @XmlEnumValue("Administrator")
    ADMINISTRATOR("Administrator"),
    @XmlEnumValue("Operator")
    OPERATOR("Operator"),
    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Anonymous")
    ANONYMOUS("Anonymous"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    UserLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserLevel fromValue(String v) {
        for (UserLevel c: UserLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
