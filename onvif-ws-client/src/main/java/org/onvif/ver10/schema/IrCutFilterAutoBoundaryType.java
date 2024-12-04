
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IrCutFilterAutoBoundaryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="IrCutFilterAutoBoundaryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Common"/&gt;
 *     &lt;enumeration value="ToOn"/&gt;
 *     &lt;enumeration value="ToOff"/&gt;
 *     &lt;enumeration value="Extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IrCutFilterAutoBoundaryType")
@XmlEnum
public enum IrCutFilterAutoBoundaryType {

    @XmlEnumValue("Common")
    COMMON("Common"),
    @XmlEnumValue("ToOn")
    TO_ON("ToOn"),
    @XmlEnumValue("ToOff")
    TO_OFF("ToOff"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    IrCutFilterAutoBoundaryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IrCutFilterAutoBoundaryType fromValue(String v) {
        for (IrCutFilterAutoBoundaryType c: IrCutFilterAutoBoundaryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
