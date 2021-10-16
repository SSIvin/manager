
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SGender.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SGender">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="male"/>
 *     &lt;enumeration value="female"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "SGender", namespace = "http://rosreestr.ru/services/v0.1/commons/Commons")
@XmlEnum
public enum SGender {


    /**
     * Мужской
     *
     */
    @XmlEnumValue("male")
    MALE("male"),

    /**
     * Женский
     *
     */
    @XmlEnumValue("female")
    FEMALE("female");
    private final String value;

    SGender(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SGender fromValue(String v) {
        for (SGender c: SGender.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
