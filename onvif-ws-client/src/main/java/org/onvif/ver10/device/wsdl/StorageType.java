
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="StorageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NFS"/&gt;
 *     &lt;enumeration value="CIFS"/&gt;
 *     &lt;enumeration value="CDMI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StorageType")
@XmlEnum
public enum StorageType {


    /**
     * NFS protocol
     * 
     */
    NFS,

    /**
     * CIFS protocol
     * 
     */
    CIFS,

    /**
     * CDMI protocol
     * 
     */
    CDMI;

    public String value() {
        return name();
    }

    public static StorageType fromValue(String v) {
        return valueOf(v);
    }

}
