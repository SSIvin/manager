
package smev.ElementServices.GisJKH;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROVIDED"/>
 *     &lt;enumeration value="AUTO_GENERATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ResponseType", namespace = "urn:dom.gosuslugi.ru/debt-responses/1.0.0")
@XmlEnum
public enum ResponseType {

    PROVIDED,
    AUTO_GENERATED;

    public String value() {
        return name();
    }

    public static ResponseType fromValue(String v) {
        return valueOf(v);
    }

}
