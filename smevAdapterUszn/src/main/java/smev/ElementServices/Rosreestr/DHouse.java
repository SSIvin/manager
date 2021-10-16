
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DHouse.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DHouse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="д"/>
 *     &lt;enumeration value="к"/>
 *     &lt;enumeration value="стр"/>
 *     &lt;enumeration value="срж"/>
 *     &lt;enumeration value="влд"/>
 *     &lt;enumeration value="двлд"/>
 *     &lt;enumeration value="ГСК"/>
 *     &lt;enumeration value="гараж"/>
 *     &lt;enumeration value="казарма"/>
 *     &lt;enumeration value="уч-к"/>
 *     &lt;enumeration value="бокс"/>
 *     &lt;enumeration value="в/ч"/>
 *     &lt;enumeration value="блок"/>
 *     &lt;enumeration value="литера"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "DHouse", namespace = "http://rosreestr.ru/services/v0.1/commons/directories/house")
@XmlEnum
public enum DHouse {


    /**
     * Дом
     *
     */
    @XmlEnumValue("д")
    Д("д"),

    /**
     * Корпус
     *
     */
    @XmlEnumValue("к")
    К("к"),

    /**
     * Строение
     *
     */
    @XmlEnumValue("стр")
    СТР("стр"),

    /**
     * Сооружение
     *
     */
    @XmlEnumValue("срж")
    СРЖ("срж"),

    /**
     * Владение
     *
     */
    @XmlEnumValue("влд")
    ВЛД("влд"),

    /**
     * Домовладение
     *
     */
    @XmlEnumValue("двлд")
    ДВЛД("двлд"),

    /**
     * Гаражно-строительный кооператив
     *
     */
    ГСК("ГСК"),

    /**
     * Гараж
     *
     */
    @XmlEnumValue("гараж")
    ГАРАЖ("гараж"),

    /**
     * Казарма
     *
     */
    @XmlEnumValue("казарма")
    КАЗАРМА("казарма"),

    /**
     * Участок
     *
     */
    @XmlEnumValue("уч-к")
    УЧ_К("уч-к"),

    /**
     * Бокс
     *
     */
    @XmlEnumValue("бокс")
    БОКС("бокс"),

    /**
     * Военная часть
     *
     */
    @XmlEnumValue("в/ч")
    В_Ч("в/ч"),

    /**
     * Блок
     *
     */
    @XmlEnumValue("блок")
    БЛОК("блок"),

    /**
     * Литера
     *
     */
    @XmlEnumValue("литера")
    ЛИТЕРА("литера");
    private final String value;

    DHouse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DHouse fromValue(String v) {
        for (DHouse c: DHouse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
