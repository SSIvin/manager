
package smev.ElementServices.GisJKH;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestStatusType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="PROCESSING"/>
 *     &lt;enumeration value="SENT"/>
 *     &lt;enumeration value="PROCESSED"/>
 *     &lt;enumeration value="REVOKED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "RequestStatusType", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
@XmlEnum
public enum RequestStatusType {

    DRAFT,
    PROCESSING,
    SENT,
    PROCESSED,
    REVOKED;

    public String value() {
        return name();
    }

    public static RequestStatusType fromValue(String v) {
        return valueOf(v);
    }

}
