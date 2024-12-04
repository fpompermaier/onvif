
package org.onvif.ver10.accesscontrol.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DenyReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DenyReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CredentialNotEnabled"/&gt;
 *     &lt;enumeration value="CredentialNotActive"/&gt;
 *     &lt;enumeration value="CredentialExpired"/&gt;
 *     &lt;enumeration value="InvalidPIN"/&gt;
 *     &lt;enumeration value="NotPermittedAtThisTime"/&gt;
 *     &lt;enumeration value="Unauthorized"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DenyReason")
@XmlEnum
public enum DenyReason {


    /**
     * The device shall provide the following event, whenever a valid
     *                 credential is not enabled or has been disabled (e.g., due to credential being lost
     *                 etc.) to prevent unauthorized entry.
     *               
     * 
     */
    @XmlEnumValue("CredentialNotEnabled")
    CREDENTIAL_NOT_ENABLED("CredentialNotEnabled"),

    /**
     * The device shall provide the following event, whenever a valid
     *                 credential is presented though it is not active yet;: e.g, the credential was
     *                 presented before the start date.
     *               
     * 
     */
    @XmlEnumValue("CredentialNotActive")
    CREDENTIAL_NOT_ACTIVE("CredentialNotActive"),

    /**
     * The device shall provide the following event, whenever a valid
     *                 credential was presented after its expiry date.
     *               
     * 
     */
    @XmlEnumValue("CredentialExpired")
    CREDENTIAL_EXPIRED("CredentialExpired"),

    /**
     * The device shall provide the following event, whenever an entered
     *                 PIN code does not match the credential.
     *               
     * 
     */
    @XmlEnumValue("InvalidPIN")
    INVALID_PIN("InvalidPIN"),

    /**
     * The device shall provide the following event, whenever a valid
     *                 credential is denied access to the requested AccessPoint because the credential is
     *                 not permitted at the moment.
     *               
     * 
     */
    @XmlEnumValue("NotPermittedAtThisTime")
    NOT_PERMITTED_AT_THIS_TIME("NotPermittedAtThisTime"),

    /**
     * The device shall provide the following event, whenever the presented
     *                 credential is not authorized.
     *               
     * 
     */
    @XmlEnumValue("Unauthorized")
    UNAUTHORIZED("Unauthorized"),

    /**
     * The device shall provide the following event, whenever the request
     *                 is denied and no other specific event matches it or is supported by the service.
     *               
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DenyReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DenyReason fromValue(String v) {
        for (DenyReason c: DenyReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
