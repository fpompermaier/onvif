
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoEncodingProfiles.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VideoEncodingProfiles"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Simple"/&gt;
 *     &lt;enumeration value="AdvancedSimple"/&gt;
 *     &lt;enumeration value="Baseline"/&gt;
 *     &lt;enumeration value="Main"/&gt;
 *     &lt;enumeration value="Main10"/&gt;
 *     &lt;enumeration value="Extended"/&gt;
 *     &lt;enumeration value="High"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VideoEncodingProfiles")
@XmlEnum
public enum VideoEncodingProfiles {

    @XmlEnumValue("Simple")
    SIMPLE("Simple"),
    @XmlEnumValue("AdvancedSimple")
    ADVANCED_SIMPLE("AdvancedSimple"),
    @XmlEnumValue("Baseline")
    BASELINE("Baseline"),
    @XmlEnumValue("Main")
    MAIN("Main"),
    @XmlEnumValue("Main10")
    MAIN_10("Main10"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended"),
    @XmlEnumValue("High")
    HIGH("High");
    private final String value;

    VideoEncodingProfiles(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoEncodingProfiles fromValue(String v) {
        for (VideoEncodingProfiles c: VideoEncodingProfiles.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
