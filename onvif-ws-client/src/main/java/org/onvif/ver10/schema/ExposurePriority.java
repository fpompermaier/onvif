
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExposurePriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ExposurePriority"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LowNoise"/&gt;
 *     &lt;enumeration value="FrameRate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExposurePriority")
@XmlEnum
public enum ExposurePriority {

    @XmlEnumValue("LowNoise")
    LOW_NOISE("LowNoise"),
    @XmlEnumValue("FrameRate")
    FRAME_RATE("FrameRate");
    private final String value;

    ExposurePriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExposurePriority fromValue(String v) {
        for (ExposurePriority c: ExposurePriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
