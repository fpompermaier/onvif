
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoEncoding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VideoEncoding"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="JPEG"/&gt;
 *     &lt;enumeration value="MPEG4"/&gt;
 *     &lt;enumeration value="H264"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VideoEncoding")
@XmlEnum
public enum VideoEncoding {

    JPEG("JPEG"),
    @XmlEnumValue("MPEG4")
    MPEG_4("MPEG4"),
    @XmlEnumValue("H264")
    H_264("H264");
    private final String value;

    VideoEncoding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoEncoding fromValue(String v) {
        for (VideoEncoding c: VideoEncoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
