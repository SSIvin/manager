
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DApartment.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DApartment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="кв"/>
 *     &lt;enumeration value="бокс"/>
 *     &lt;enumeration value="ком"/>
 *     &lt;enumeration value="пом"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "DApartment", namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
@XmlEnum
public enum DApartment {


    /**
     * Квартира
     *
     */
    @XmlEnumValue("кв")
    КВ("кв"),

    /**
     * Бокс
     *
     */
    @XmlEnumValue("бокс")
    БОКС("бокс"),

    /**
     * Комната
     *
     */
    @XmlEnumValue("ком")
    КОМ("ком"),

    /**
     * Помещение
     *
     */
    @XmlEnumValue("пом")
    ПОМ("пом");
    private final String value;

    DApartment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DApartment fromValue(String v) {
        for (DApartment c: DApartment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
