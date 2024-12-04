
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioEncoding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AudioEncoding"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="G711"/&gt;
 *     &lt;enumeration value="G726"/&gt;
 *     &lt;enumeration value="AAC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AudioEncoding")
@XmlEnum
public enum AudioEncoding {

    @XmlEnumValue("G711")
    G_711("G711"),
    @XmlEnumValue("G726")
    G_726("G726"),
    AAC("AAC");
    private final String value;

    AudioEncoding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudioEncoding fromValue(String v) {
        for (AudioEncoding c: AudioEncoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
