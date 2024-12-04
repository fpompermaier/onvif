
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mpeg4Profile.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Mpeg4Profile"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SP"/&gt;
 *     &lt;enumeration value="ASP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Mpeg4Profile")
@XmlEnum
public enum Mpeg4Profile {

    SP,
    ASP;

    public String value() {
        return name();
    }

    public static Mpeg4Profile fromValue(String v) {
        return valueOf(v);
    }

}
