
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkProtocolType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NetworkProtocolType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HTTP"/&gt;
 *     &lt;enumeration value="HTTPS"/&gt;
 *     &lt;enumeration value="RTSP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NetworkProtocolType")
@XmlEnum
public enum NetworkProtocolType {

    HTTP,
    HTTPS,
    RTSP;

    public String value() {
        return name();
    }

    public static NetworkProtocolType fromValue(String v) {
        return valueOf(v);
    }

}
