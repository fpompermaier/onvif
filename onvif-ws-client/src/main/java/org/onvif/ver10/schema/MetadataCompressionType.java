
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetadataCompressionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MetadataCompressionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="GZIP"/&gt;
 *     &lt;enumeration value="EXI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MetadataCompressionType")
@XmlEnum
public enum MetadataCompressionType {

    @XmlEnumValue("None")
    NONE("None"),
    GZIP("GZIP"),
    EXI("EXI");
    private final String value;

    MetadataCompressionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MetadataCompressionType fromValue(String v) {
        for (MetadataCompressionType c: MetadataCompressionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
