
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StreamType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="StreamType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RTP-Unicast"/&gt;
 *     &lt;enumeration value="RTP-Multicast"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StreamType")
@XmlEnum
public enum StreamType {

    @XmlEnumValue("RTP-Unicast")
    RTP_UNICAST("RTP-Unicast"),
    @XmlEnumValue("RTP-Multicast")
    RTP_MULTICAST("RTP-Multicast");
    private final String value;

    StreamType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StreamType fromValue(String v) {
        for (StreamType c: StreamType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
