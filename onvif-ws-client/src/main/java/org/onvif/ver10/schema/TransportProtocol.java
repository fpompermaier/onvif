
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportProtocol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TransportProtocol"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UDP"/&gt;
 *     &lt;enumeration value="TCP"/&gt;
 *     &lt;enumeration value="RTSP"/&gt;
 *     &lt;enumeration value="HTTP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransportProtocol")
@XmlEnum
public enum TransportProtocol {

    UDP,
    TCP,
    RTSP,
    HTTP;

    public String value() {
        return name();
    }

    public static TransportProtocol fromValue(String v) {
        return valueOf(v);
    }

}
