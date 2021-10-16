
package smev.ElementServices.ZagsBrakZak;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Супруг
 *
 * <p>Java class for СупругТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="СупругТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ПрФамилияДо">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ФамилияДо" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-60"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрФамилияПосле">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ФамилияПосле" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-60"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрИмя">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="Имя" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-60"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрОтчество">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="Отчество" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-60"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрГражданство">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ГраждТекст" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-255"/>
 *           &lt;element name="ГраждОКСМ" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ОКСМТип"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрДатаРожд">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрМестоРожден">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}МестоТип"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрАдрМЖ">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="АдрМЖ" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}АдрМЖТип"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрУдЛичнФЛ">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}УдЛичнФЛПрТип"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СНИЛСТип" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "СупругТип", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0", propOrder = {
    "прФамилияДо",
    "фамилияДо",
    "прФамилияПосле",
    "фамилияПосле",
    "прИмя",
    "имя",
    "прОтчество",
    "отчество",
    "прГражданство",
    "граждТекст",
    "граждОКСМ",
    "прДатаРожд",
    "датаРождКаленд",
    "датаРождДок",
    "прМестоРожден",
    "местоРожден",
    "прАдрМЖ",
    "адрМЖ",
    "прУдЛичнФЛ",
    "удЛичнФЛ"
})
@Data
public class СупругТип {

    @XmlElement(name = "ПрФамилияДо", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прФамилияДо;
    @XmlElement(name = "ФамилияДо", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String фамилияДо;
    @XmlElement(name = "ПрФамилияПосле", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прФамилияПосле;
    @XmlElement(name = "ФамилияПосле", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String фамилияПосле;
    @XmlElement(name = "ПрИмя", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прИмя;
    @XmlElement(name = "Имя", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String имя;
    @XmlElement(name = "ПрОтчество", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прОтчество;
    @XmlElement(name = "Отчество", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String отчество;
    @XmlElement(name = "ПрГражданство", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прГражданство;
    @XmlElement(name = "ГраждТекст", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String граждТекст;
    @XmlElement(name = "ГраждОКСМ", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String граждОКСМ;
    @XmlElement(name = "ПрДатаРожд", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прДатаРожд;
    @XmlElement(name = "ДатаРождКаленд", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаРождКаленд;
    @XmlElement(name = "ДатаРождДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected ДатаДокТип датаРождДок;
    @XmlElement(name = "ПрМестоРожден", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прМестоРожден;
    @XmlElement(name = "МестоРожден", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected МестоТип местоРожден;
    @XmlElement(name = "ПрАдрМЖ", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прАдрМЖ;
    @XmlElement(name = "АдрМЖ", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected АдрМЖТип адрМЖ;
    @XmlElement(name = "ПрУдЛичнФЛ", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прУдЛичнФЛ;
    @XmlElement(name = "УдЛичнФЛ", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected УдЛичнФЛПрТип удЛичнФЛ;
    @XmlAttribute(name = "СНИЛС")
    protected String снилс;

}
