
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoEncodingMimeNames.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VideoEncodingMimeNames"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="JPEG"/&gt;
 *     &lt;enumeration value="MPV4-ES"/&gt;
 *     &lt;enumeration value="H264"/&gt;
 *     &lt;enumeration value="H265"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VideoEncodingMimeNames")
@XmlEnum
public enum VideoEncodingMimeNames {

    JPEG("JPEG"),
    @XmlEnumValue("MPV4-ES")
    MPV_4_ES("MPV4-ES"),
    @XmlEnumValue("H264")
    H_264("H264"),
    @XmlEnumValue("H265")
    H_265("H265");
    private final String value;

    VideoEncodingMimeNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoEncodingMimeNames fromValue(String v) {
        for (VideoEncodingMimeNames c: VideoEncodingMimeNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
