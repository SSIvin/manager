
package smev.ElementServices.ZagsBrakZak;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Фамилия, имя, отчество физического лица (с признаком отсутствия)
 *
 * <p>Java class for ФИОПрТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ФИОПрТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Фамилия" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-60"/>
 *           &lt;element name="ПрФамилия">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="Имя" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-60"/>
 *           &lt;element name="ПрИмя">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="Отчество" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-60"/>
 *           &lt;element name="ПрОтчество">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ФИОПрТип", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0", propOrder = {
    "фамилия",
    "прФамилия",
    "имя",
    "прИмя",
    "отчество",
    "прОтчество"
})
@Data
public class ФИОПрТип {

    @XmlElement(name = "Фамилия", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String фамилия;
    @XmlElement(name = "ПрФамилия", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прФамилия;
    @XmlElement(name = "Имя", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String имя;
    @XmlElement(name = "ПрИмя", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прИмя;
    @XmlElement(name = "Отчество", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String отчество;
    @XmlElement(name = "ПрОтчество", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прОтчество;

}
