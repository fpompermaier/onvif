
package org.onvif.ver10.deviceio.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParityBit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParityBit"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Even"/&gt;
 *     &lt;enumeration value="Odd"/&gt;
 *     &lt;enumeration value="Mark"/&gt;
 *     &lt;enumeration value="Space"/&gt;
 *     &lt;enumeration value="Extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParityBit")
@XmlEnum
public enum ParityBit {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Even")
    EVEN("Even"),
    @XmlEnumValue("Odd")
    ODD("Odd"),
    @XmlEnumValue("Mark")
    MARK("Mark"),
    @XmlEnumValue("Space")
    SPACE("Space"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    ParityBit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParityBit fromValue(String v) {
        for (ParityBit c: ParityBit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
