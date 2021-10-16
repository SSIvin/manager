
package smev.ElementServices.GisJKH;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseStatusType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_SENT"/>
 *     &lt;enumeration value="SENT"/>
 *     &lt;enumeration value="AUTO_GENERATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ResponseStatusType", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
@XmlEnum
public enum ResponseStatusType {

    NOT_SENT,
    SENT,
    AUTO_GENERATED;

    public String value() {
        return name();
    }

    public static ResponseStatusType fromValue(String v) {
        return valueOf(v);
    }

}
