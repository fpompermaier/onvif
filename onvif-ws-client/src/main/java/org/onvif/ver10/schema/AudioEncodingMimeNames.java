
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioEncodingMimeNames.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AudioEncodingMimeNames"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PCMU"/&gt;
 *     &lt;enumeration value="G726"/&gt;
 *     &lt;enumeration value="MP4A-LATM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AudioEncodingMimeNames")
@XmlEnum
public enum AudioEncodingMimeNames {

    PCMU("PCMU"),
    @XmlEnumValue("G726")
    G_726("G726"),
    @XmlEnumValue("MP4A-LATM")
    MP_4_A_LATM("MP4A-LATM");
    private final String value;

    AudioEncodingMimeNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudioEncodingMimeNames fromValue(String v) {
        for (AudioEncodingMimeNames c: AudioEncodingMimeNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
