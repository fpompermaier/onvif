
package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SearchState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Queued"/&gt;
 *     &lt;enumeration value="Searching"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchState")
@XmlEnum
public enum SearchState {


    /**
     * The search is queued and not yet started.
     * 
     */
    @XmlEnumValue("Queued")
    QUEUED("Queued"),

    /**
     * The search is underway and not yet completed.
     * 
     */
    @XmlEnumValue("Searching")
    SEARCHING("Searching"),

    /**
     * The search has been completed and no new results will be found.
     *           
     * 
     */
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),

    /**
     * The state of the search is unknown. (This is not a valid response from
     *             GetSearchState.)
     *           
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SearchState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchState fromValue(String v) {
        for (SearchState c: SearchState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
