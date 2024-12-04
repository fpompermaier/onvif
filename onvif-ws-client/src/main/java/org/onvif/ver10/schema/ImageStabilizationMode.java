
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageStabilizationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ImageStabilizationMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OFF"/&gt;
 *     &lt;enumeration value="ON"/&gt;
 *     &lt;enumeration value="AUTO"/&gt;
 *     &lt;enumeration value="Extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImageStabilizationMode")
@XmlEnum
public enum ImageStabilizationMode {

    OFF("OFF"),
    ON("ON"),
    AUTO("AUTO"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    ImageStabilizationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImageStabilizationMode fromValue(String v) {
        for (ImageStabilizationMode c: ImageStabilizationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
