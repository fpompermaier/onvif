
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BacklightCompensationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BacklightCompensationMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OFF"/&gt;
 *     &lt;enumeration value="ON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BacklightCompensationMode")
@XmlEnum
public enum BacklightCompensationMode {


    /**
     * Backlight compensation is disabled.
     * 
     */
    OFF,

    /**
     * Backlight compensation is enabled.
     * 
     */
    ON;

    public String value() {
        return name();
    }

    public static BacklightCompensationMode fromValue(String v) {
        return valueOf(v);
    }

}
