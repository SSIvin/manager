
package smev.ElementServices.ZagsBrakZak;

import lombok.Data;
import smev.ElementServices.Egisso.Death.ФИОПрТип;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о внесении в ЕГР ЗАГС сведений о документе компетентного органа иностранного государства (Раздел 2)
 *
 * <p>Java class for СведЕГРРазд2Тип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="СведЕГРРазд2Тип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ПрСвУведомл">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="СвУведомл">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;choice>
 *                       &lt;element name="ПрКодВидУвед">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                             &lt;enumeration value="1"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                       &lt;element name="КодВидУвед" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-5"/>
 *                     &lt;/choice>
 *                     &lt;choice>
 *                       &lt;element name="ПрДатаУвед">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                             &lt;enumeration value="1"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                       &lt;element name="ДатаУвед" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     &lt;/choice>
 *                     &lt;element name="СведЗАГСУвед">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ОрганЗАГСТип"/>
 *                               &lt;choice>
 *                                 &lt;element name="ПрФИООтв">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                                       &lt;enumeration value="1"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="ФИООтв" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ФИОПрТип"/>
 *                               &lt;/choice>
 *                             &lt;/sequence>
 *                             &lt;attribute name="ДатаПринят" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                             &lt;attribute name="ДолжнОтв" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-255" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="СпоcПод" use="required">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                         &lt;enumeration value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="КолЛистДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}number-3" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="СвДокИн">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="ПрКодОКСМ">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                           &lt;enumeration value="1"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="КодОКСМ" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ОКСМТип"/>
 *                   &lt;/choice>
 *                   &lt;element name="НаимСтраны" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-255"/>
 *                   &lt;element name="РеквизИнДок">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="ПрНаимДокТекст">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                                     &lt;enumeration value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="НаимДокТекст" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-255"/>
 *                             &lt;/choice>
 *                             &lt;choice>
 *                               &lt;element name="ПрНомер">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                                     &lt;enumeration value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="Номер" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-100"/>
 *                             &lt;/choice>
 *                             &lt;choice>
 *                               &lt;element name="ПрДата">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                                     &lt;enumeration value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="ДатаКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                               &lt;element name="ДатаДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
 *                             &lt;/choice>
 *                             &lt;choice>
 *                               &lt;element name="ПрНаимОрган">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                                     &lt;enumeration value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="НаимОрган" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-500"/>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ТипДок" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-5" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ЮрЗначДок">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="ПрПодпИн">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                                     &lt;enumeration value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="СвПодпТекст" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-255"/>
 *                             &lt;/choice>
 *                             &lt;choice>
 *                               &lt;element name="ПрЗасвидДок">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                                     &lt;enumeration value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="ЗасвидДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ЗасвидТип"/>
 *                             &lt;/choice>
 *                             &lt;choice>
 *                               &lt;element name="ПрЗасвидПеревод">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                                     &lt;enumeration value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="ЗасвидПеревод" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ЗасвидТип"/>
 *                             &lt;/choice>
 *                             &lt;choice>
 *                               &lt;element name="СвОтказЛегализ">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                                     &lt;enumeration value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="Легализация">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;choice>
 *                                           &lt;element name="ПрОрганЛегал">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                                                 &lt;enumeration value="1"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="ОрганЛегал" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-500"/>
 *                                         &lt;/choice>
 *                                         &lt;choice>
 *                                           &lt;element name="ПрДатаЛегал">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                                                 &lt;enumeration value="1"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="ДатаЛегал" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         &lt;/choice>
 *                                         &lt;choice>
 *                                           &lt;element name="ПрНомерЛегал">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                                                 &lt;enumeration value="1"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="НомерЛегал" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-25"/>
 *                                         &lt;/choice>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                           &lt;attribute name="КолЛистДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}number-3" />
 *                           &lt;attribute name="СвОттискПеч" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                                 &lt;enumeration value="1"/>
 *                                 &lt;enumeration value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="СвЛегал" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                                 &lt;enumeration value="1"/>
 *                                 &lt;enumeration value="2"/>
 *                                 &lt;enumeration value="3"/>
 *                                 &lt;enumeration value="4"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "СведЕГРРазд2Тип", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0", propOrder = {
    "прСвУведомл",
    "свУведомл",
    "свДокИн"
})
@Data
public class СведЕГРРазд2Тип {

    @XmlElement(name = "ПрСвУведомл", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected String прСвУведомл;
    @XmlElement(name = "СвУведомл", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
    protected СведЕГРРазд2Тип.СвУведомл свУведомл;
    @XmlElement(name = "СвДокИн", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0", required = true)
    protected СведЕГРРазд2Тип.СвДокИн свДокИн;



    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element name="ПрКодОКСМ">
     *             &lt;simpleType>
     *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                 &lt;enumeration value="1"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;element name="КодОКСМ" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ОКСМТип"/>
     *         &lt;/choice>
     *         &lt;element name="НаимСтраны" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-255"/>
     *         &lt;element name="РеквизИнДок">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="ПрНаимДокТекст">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="НаимДокТекст" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-255"/>
     *                   &lt;/choice>
     *                   &lt;choice>
     *                     &lt;element name="ПрНомер">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="Номер" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-100"/>
     *                   &lt;/choice>
     *                   &lt;choice>
     *                     &lt;element name="ПрДата">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="ДатаКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                     &lt;element name="ДатаДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
     *                   &lt;/choice>
     *                   &lt;choice>
     *                     &lt;element name="ПрНаимОрган">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="НаимОрган" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-500"/>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ТипДок" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-5" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ЮрЗначДок">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="ПрПодпИн">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="СвПодпТекст" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-255"/>
     *                   &lt;/choice>
     *                   &lt;choice>
     *                     &lt;element name="ПрЗасвидДок">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="ЗасвидДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ЗасвидТип"/>
     *                   &lt;/choice>
     *                   &lt;choice>
     *                     &lt;element name="ПрЗасвидПеревод">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="ЗасвидПеревод" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ЗасвидТип"/>
     *                   &lt;/choice>
     *                   &lt;choice>
     *                     &lt;element name="СвОтказЛегализ">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="Легализация">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;choice>
     *                                 &lt;element name="ПрОрганЛегал">
     *                                   &lt;simpleType>
     *                                     &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                                       &lt;enumeration value="1"/>
     *                                     &lt;/restriction>
     *                                   &lt;/simpleType>
     *                                 &lt;/element>
     *                                 &lt;element name="ОрганЛегал" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-500"/>
     *                               &lt;/choice>
     *                               &lt;choice>
     *                                 &lt;element name="ПрДатаЛегал">
     *                                   &lt;simpleType>
     *                                     &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                                       &lt;enumeration value="1"/>
     *                                     &lt;/restriction>
     *                                   &lt;/simpleType>
     *                                 &lt;/element>
     *                                 &lt;element name="ДатаЛегал" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               &lt;/choice>
     *                               &lt;choice>
     *                                 &lt;element name="ПрНомерЛегал">
     *                                   &lt;simpleType>
     *                                     &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                                       &lt;enumeration value="1"/>
     *                                     &lt;/restriction>
     *                                   &lt;/simpleType>
     *                                 &lt;/element>
     *                                 &lt;element name="НомерЛегал" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-25"/>
     *                               &lt;/choice>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *                 &lt;attribute name="КолЛистДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}number-3" />
     *                 &lt;attribute name="СвОттискПеч" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                       &lt;enumeration value="1"/>
     *                       &lt;enumeration value="2"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="СвЛегал" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                       &lt;enumeration value="1"/>
     *                       &lt;enumeration value="2"/>
     *                       &lt;enumeration value="3"/>
     *                       &lt;enumeration value="4"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "прКодОКСМ",
        "кодОКСМ",
        "наимСтраны",
        "реквизИнДок",
        "юрЗначДок"
    })
    @Data
    public static class СвДокИн {

        @XmlElement(name = "ПрКодОКСМ", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
        protected String прКодОКСМ;
        @XmlElement(name = "КодОКСМ", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
        protected String кодОКСМ;
        @XmlElement(name = "НаимСтраны", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0", required = true)
        protected String наимСтраны;
        @XmlElement(name = "РеквизИнДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0", required = true)
        protected СведЕГРРазд2Тип.СвДокИн.РеквизИнДок реквизИнДок;
        @XmlElement(name = "ЮрЗначДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0", required = true)
        protected СведЕГРРазд2Тип.СвДокИн.ЮрЗначДок юрЗначДок;



        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;choice>
         *           &lt;element name="ПрНаимДокТекст">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="НаимДокТекст" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-255"/>
         *         &lt;/choice>
         *         &lt;choice>
         *           &lt;element name="ПрНомер">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="Номер" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-100"/>
         *         &lt;/choice>
         *         &lt;choice>
         *           &lt;element name="ПрДата">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="ДатаКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *           &lt;element name="ДатаДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
         *         &lt;/choice>
         *         &lt;choice>
         *           &lt;element name="ПрНаимОрган">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="НаимОрган" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-500"/>
         *         &lt;/choice>
         *       &lt;/sequence>
         *       &lt;attribute name="ТипДок" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-5" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "прНаимДокТекст",
            "наимДокТекст",
            "прНомер",
            "номер",
            "прДата",
            "датаКаленд",
            "датаДок",
            "прНаимОрган",
            "наимОрган"
        })
        @Data
        public static class РеквизИнДок {

            @XmlElement(name = "ПрНаимДокТекст", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected String прНаимДокТекст;
            @XmlElement(name = "НаимДокТекст", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected String наимДокТекст;
            @XmlElement(name = "ПрНомер", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected String прНомер;
            @XmlElement(name = "Номер", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected String номер;
            @XmlElement(name = "ПрДата", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected String прДата;
            @XmlElement(name = "ДатаКаленд", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаКаленд;
            @XmlElement(name = "ДатаДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected ДатаДокТип датаДок;
            @XmlElement(name = "ПрНаимОрган", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected String прНаимОрган;
            @XmlElement(name = "НаимОрган", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected String наимОрган;
            @XmlAttribute(name = "ТипДок", required = true)
            protected String типДок;


        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;choice>
         *           &lt;element name="ПрПодпИн">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="СвПодпТекст" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-255"/>
         *         &lt;/choice>
         *         &lt;choice>
         *           &lt;element name="ПрЗасвидДок">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="ЗасвидДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ЗасвидТип"/>
         *         &lt;/choice>
         *         &lt;choice>
         *           &lt;element name="ПрЗасвидПеревод">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="ЗасвидПеревод" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ЗасвидТип"/>
         *         &lt;/choice>
         *         &lt;choice>
         *           &lt;element name="СвОтказЛегализ">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="Легализация">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;choice>
         *                       &lt;element name="ПрОрганЛегал">
         *                         &lt;simpleType>
         *                           &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
         *                             &lt;enumeration value="1"/>
         *                           &lt;/restriction>
         *                         &lt;/simpleType>
         *                       &lt;/element>
         *                       &lt;element name="ОрганЛегал" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-500"/>
         *                     &lt;/choice>
         *                     &lt;choice>
         *                       &lt;element name="ПрДатаЛегал">
         *                         &lt;simpleType>
         *                           &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
         *                             &lt;enumeration value="1"/>
         *                           &lt;/restriction>
         *                         &lt;/simpleType>
         *                       &lt;/element>
         *                       &lt;element name="ДатаЛегал" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                     &lt;/choice>
         *                     &lt;choice>
         *                       &lt;element name="ПрНомерЛегал">
         *                         &lt;simpleType>
         *                           &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
         *                             &lt;enumeration value="1"/>
         *                           &lt;/restriction>
         *                         &lt;/simpleType>
         *                       &lt;/element>
         *                       &lt;element name="НомерЛегал" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-25"/>
         *                     &lt;/choice>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/choice>
         *       &lt;/sequence>
         *       &lt;attribute name="КолЛистДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}number-3" />
         *       &lt;attribute name="СвОттискПеч" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
         *             &lt;enumeration value="1"/>
         *             &lt;enumeration value="2"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="СвЛегал" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
         *             &lt;enumeration value="1"/>
         *             &lt;enumeration value="2"/>
         *             &lt;enumeration value="3"/>
         *             &lt;enumeration value="4"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "прПодпИн",
            "свПодпТекст",
            "прЗасвидДок",
            "засвидДок",
            "прЗасвидПеревод",
            "засвидПеревод",
            "свОтказЛегализ",
            "легализация"
        })
        @Data
        public static class ЮрЗначДок {

            @XmlElement(name = "ПрПодпИн", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected String прПодпИн;
            @XmlElement(name = "СвПодпТекст", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected String свПодпТекст;
            @XmlElement(name = "ПрЗасвидДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected String прЗасвидДок;
            @XmlElement(name = "ЗасвидДок", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected ЗасвидТип засвидДок;
            @XmlElement(name = "ПрЗасвидПеревод", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected String прЗасвидПеревод;
            @XmlElement(name = "ЗасвидПеревод", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected ЗасвидТип засвидПеревод;
            @XmlElement(name = "СвОтказЛегализ", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected String свОтказЛегализ;
            @XmlElement(name = "Легализация", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected СведЕГРРазд2Тип.СвДокИн.ЮрЗначДок.Легализация легализация;
            @XmlAttribute(name = "КолЛистДок")
            protected BigInteger колЛистДок;
            @XmlAttribute(name = "СвОттискПеч", required = true)
            protected String свОттискПеч;
            @XmlAttribute(name = "СвЛегал", required = true)
            protected String свЛегал;



            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;choice>
             *           &lt;element name="ПрОрганЛегал">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="ОрганЛегал" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-500"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрДатаЛегал">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="ДатаЛегал" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрНомерЛегал">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="НомерЛегал" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-25"/>
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
            @XmlType(name = "", propOrder = {
                "прОрганЛегал",
                "органЛегал",
                "прДатаЛегал",
                "датаЛегал",
                "прНомерЛегал",
                "номерЛегал"
            })
            public static class Легализация {

                @XmlElement(name = "ПрОрганЛегал", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
                protected String прОрганЛегал;
                @XmlElement(name = "ОрганЛегал", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
                protected String органЛегал;
                @XmlElement(name = "ПрДатаЛегал", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
                protected String прДатаЛегал;
                @XmlElement(name = "ДатаЛегал", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar датаЛегал;
                @XmlElement(name = "ПрНомерЛегал", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
                protected String прНомерЛегал;
                @XmlElement(name = "НомерЛегал", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
                protected String номерЛегал;


            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element name="ПрКодВидУвед">
     *             &lt;simpleType>
     *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                 &lt;enumeration value="1"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;element name="КодВидУвед" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-5"/>
     *         &lt;/choice>
     *         &lt;choice>
     *           &lt;element name="ПрДатаУвед">
     *             &lt;simpleType>
     *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                 &lt;enumeration value="1"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;element name="ДатаУвед" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;/choice>
     *         &lt;element name="СведЗАГСУвед">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ОрганЗАГСТип"/>
     *                   &lt;choice>
     *                     &lt;element name="ПрФИООтв">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="ФИООтв" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ФИОПрТип"/>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ДатаПринят" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="ДолжнОтв" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-255" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="СпоcПод" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *             &lt;enumeration value="1"/>
     *             &lt;enumeration value="2"/>
     *             &lt;enumeration value="3"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="КолЛистДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}number-3" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "прКодВидУвед",
        "кодВидУвед",
        "прДатаУвед",
        "датаУвед",
        "сведЗАГСУвед"
    })
    @Data
    public static class СвУведомл {

        @XmlElement(name = "ПрКодВидУвед", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
        protected String прКодВидУвед;
        @XmlElement(name = "КодВидУвед", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
        protected String кодВидУвед;
        @XmlElement(name = "ПрДатаУвед", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
        protected String прДатаУвед;
        @XmlElement(name = "ДатаУвед", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаУвед;
        @XmlElement(name = "СведЗАГСУвед", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0", required = true)
        protected СведЕГРРазд2Тип.СвУведомл.СведЗАГСУвед сведЗАГСУвед;
        @XmlAttribute(name = "СпоcПод", required = true)
        protected String споcПод;
        @XmlAttribute(name = "КолЛистДок")
        protected BigInteger колЛистДок;



        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ОрганЗАГСТип"/>
         *         &lt;choice>
         *           &lt;element name="ПрФИООтв">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="ФИООтв" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ФИОПрТип"/>
         *         &lt;/choice>
         *       &lt;/sequence>
         *       &lt;attribute name="ДатаПринят" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="ДолжнОтв" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-255" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "органЗАГС",
            "прФИООтв",
            "фиоОтв"
        })
        @Data
        public static class СведЗАГСУвед {

            @XmlElement(name = "ОрганЗАГС", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0", required = true)
            protected ОрганЗАГСТип органЗАГС;
            @XmlElement(name = "ПрФИООтв", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected String прФИООтв;
            @XmlElement(name = "ФИООтв", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
            protected ФИОПрТип фиоОтв;
            @XmlAttribute(name = "ДатаПринят", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаПринят;
            @XmlAttribute(name = "ДолжнОтв")
            protected String должнОтв;


        }

    }

}
