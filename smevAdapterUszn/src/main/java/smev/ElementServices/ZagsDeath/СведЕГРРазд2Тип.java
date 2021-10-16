
package smev.ElementServices.ZagsDeath;

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
 *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
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
 *                           &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                             &lt;enumeration value="1"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                       &lt;element name="КодВидУвед" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-5"/>
 *                     &lt;/choice>
 *                     &lt;choice>
 *                       &lt;element name="ПрДатаУвед">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
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
 *                               &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ОрганЗАГСТип"/>
 *                               &lt;choice>
 *                                 &lt;element name="ПрФИООтв">
 *                                   &lt;simpleType>
 *                                     &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                       &lt;enumeration value="1"/>
 *                                     &lt;/restriction>
 *                                   &lt;/simpleType>
 *                                 &lt;/element>
 *                                 &lt;element name="ФИООтв" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ФИОПрТип"/>
 *                               &lt;/choice>
 *                             &lt;/sequence>
 *                             &lt;attribute name="ДатаПринят" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                             &lt;attribute name="ДолжнОтв" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-255" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="СпоcПод" use="required">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                         &lt;enumeration value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="КолЛистДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}number-3" />
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
 *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                           &lt;enumeration value="1"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="КодОКСМ" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ОКСМТип"/>
 *                   &lt;/choice>
 *                   &lt;element name="НаимСтраны" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-255"/>
 *                   &lt;element name="РеквизИнДок">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="ПрНаимДокТекст">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                     &lt;enumeration value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="НаимДокТекст" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-255"/>
 *                             &lt;/choice>
 *                             &lt;choice>
 *                               &lt;element name="ПрНомер">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                     &lt;enumeration value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="Номер" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-100"/>
 *                             &lt;/choice>
 *                             &lt;choice>
 *                               &lt;element name="ПрДата">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                     &lt;enumeration value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="ДатаКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                               &lt;element name="ДатаДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ДатаДокТип"/>
 *                             &lt;/choice>
 *                             &lt;choice>
 *                               &lt;element name="ПрНаимОрган">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                     &lt;enumeration value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="НаимОрган" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500"/>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ТипДок" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-5" />
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
 *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                     &lt;enumeration value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="СвПодпТекст" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-255"/>
 *                             &lt;/choice>
 *                             &lt;choice>
 *                               &lt;element name="ПрЗасвидДок">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                     &lt;enumeration value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="ЗасвидДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ЗасвидТип"/>
 *                             &lt;/choice>
 *                             &lt;choice>
 *                               &lt;element name="ПрЗасвидПеревод">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                     &lt;enumeration value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="ЗасвидПеревод" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ЗасвидТип"/>
 *                             &lt;/choice>
 *                             &lt;choice>
 *                               &lt;element name="СвОтказЛегализ">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
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
 *                                               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                                 &lt;enumeration value="1"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="ОрганЛегал" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500"/>
 *                                         &lt;/choice>
 *                                         &lt;choice>
 *                                           &lt;element name="ПрДатаЛегал">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                                 &lt;enumeration value="1"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="ДатаЛегал" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         &lt;/choice>
 *                                         &lt;choice>
 *                                           &lt;element name="ПрНомерЛегал">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                                 &lt;enumeration value="1"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="НомерЛегал" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-25"/>
 *                                         &lt;/choice>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                           &lt;attribute name="КолЛистДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}number-3" />
 *                           &lt;attribute name="СвОттискПеч" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                 &lt;enumeration value="1"/>
 *                                 &lt;enumeration value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="СвЛегал" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
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
@XmlType(name = "СведЕГРРазд2Тип", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1", propOrder = {
    "прСвУведомл",
    "свУведомл",
    "свДокИн"
})
public class СведЕГРРазд2Тип {

    @XmlElement(name = "ПрСвУведомл", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
    protected String прСвУведомл;
    @XmlElement(name = "СвУведомл", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
    protected СведЕГРРазд2Тип.СвУведомл свУведомл;
    @XmlElement(name = "СвДокИн", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1", required = true)
    protected СведЕГРРазд2Тип.СвДокИн свДокИн;

    /**
     * Gets the value of the прСвУведомл property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПрСвУведомл() {
        return прСвУведомл;
    }

    /**
     * Sets the value of the прСвУведомл property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПрСвУведомл(String value) {
        this.прСвУведомл = value;
    }

    /**
     * Gets the value of the свУведомл property.
     *
     * @return
     *     possible object is
     *     {@link СведЕГРРазд2Тип.СвУведомл }
     *
     */
    public СведЕГРРазд2Тип.СвУведомл getСвУведомл() {
        return свУведомл;
    }

    /**
     * Sets the value of the свУведомл property.
     *
     * @param value
     *     allowed object is
     *     {@link СведЕГРРазд2Тип.СвУведомл }
     *
     */
    public void setСвУведомл(СведЕГРРазд2Тип.СвУведомл value) {
        this.свУведомл = value;
    }

    /**
     * Gets the value of the свДокИн property.
     *
     * @return
     *     possible object is
     *     {@link СведЕГРРазд2Тип.СвДокИн }
     *
     */
    public СведЕГРРазд2Тип.СвДокИн getСвДокИн() {
        return свДокИн;
    }

    /**
     * Sets the value of the свДокИн property.
     *
     * @param value
     *     allowed object is
     *     {@link СведЕГРРазд2Тип.СвДокИн }
     *
     */
    public void setСвДокИн(СведЕГРРазд2Тип.СвДокИн value) {
        this.свДокИн = value;
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
     *           &lt;element name="ПрКодОКСМ">
     *             &lt;simpleType>
     *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                 &lt;enumeration value="1"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;element name="КодОКСМ" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ОКСМТип"/>
     *         &lt;/choice>
     *         &lt;element name="НаимСтраны" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-255"/>
     *         &lt;element name="РеквизИнДок">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="ПрНаимДокТекст">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="НаимДокТекст" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-255"/>
     *                   &lt;/choice>
     *                   &lt;choice>
     *                     &lt;element name="ПрНомер">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="Номер" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-100"/>
     *                   &lt;/choice>
     *                   &lt;choice>
     *                     &lt;element name="ПрДата">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="ДатаКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                     &lt;element name="ДатаДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ДатаДокТип"/>
     *                   &lt;/choice>
     *                   &lt;choice>
     *                     &lt;element name="ПрНаимОрган">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="НаимОрган" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500"/>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ТипДок" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-5" />
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
     *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="СвПодпТекст" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-255"/>
     *                   &lt;/choice>
     *                   &lt;choice>
     *                     &lt;element name="ПрЗасвидДок">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="ЗасвидДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ЗасвидТип"/>
     *                   &lt;/choice>
     *                   &lt;choice>
     *                     &lt;element name="ПрЗасвидПеревод">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="ЗасвидПеревод" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ЗасвидТип"/>
     *                   &lt;/choice>
     *                   &lt;choice>
     *                     &lt;element name="СвОтказЛегализ">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
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
     *                                     &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                                       &lt;enumeration value="1"/>
     *                                     &lt;/restriction>
     *                                   &lt;/simpleType>
     *                                 &lt;/element>
     *                                 &lt;element name="ОрганЛегал" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500"/>
     *                               &lt;/choice>
     *                               &lt;choice>
     *                                 &lt;element name="ПрДатаЛегал">
     *                                   &lt;simpleType>
     *                                     &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                                       &lt;enumeration value="1"/>
     *                                     &lt;/restriction>
     *                                   &lt;/simpleType>
     *                                 &lt;/element>
     *                                 &lt;element name="ДатаЛегал" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               &lt;/choice>
     *                               &lt;choice>
     *                                 &lt;element name="ПрНомерЛегал">
     *                                   &lt;simpleType>
     *                                     &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                                       &lt;enumeration value="1"/>
     *                                     &lt;/restriction>
     *                                   &lt;/simpleType>
     *                                 &lt;/element>
     *                                 &lt;element name="НомерЛегал" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-25"/>
     *                               &lt;/choice>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *                 &lt;attribute name="КолЛистДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}number-3" />
     *                 &lt;attribute name="СвОттискПеч" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                       &lt;enumeration value="1"/>
     *                       &lt;enumeration value="2"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="СвЛегал" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
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
    public static class СвДокИн {

        @XmlElement(name = "ПрКодОКСМ", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
        protected String прКодОКСМ;
        @XmlElement(name = "КодОКСМ", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
        protected String кодОКСМ;
        @XmlElement(name = "НаимСтраны", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1", required = true)
        protected String наимСтраны;
        @XmlElement(name = "РеквизИнДок", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1", required = true)
        protected СведЕГРРазд2Тип.СвДокИн.РеквизИнДок реквизИнДок;
        @XmlElement(name = "ЮрЗначДок", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1", required = true)
        protected СведЕГРРазд2Тип.СвДокИн.ЮрЗначДок юрЗначДок;

        /**
         * Gets the value of the прКодОКСМ property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getПрКодОКСМ() {
            return прКодОКСМ;
        }

        /**
         * Sets the value of the прКодОКСМ property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setПрКодОКСМ(String value) {
            this.прКодОКСМ = value;
        }

        /**
         * Gets the value of the кодОКСМ property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getКодОКСМ() {
            return кодОКСМ;
        }

        /**
         * Sets the value of the кодОКСМ property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setКодОКСМ(String value) {
            this.кодОКСМ = value;
        }

        /**
         * Gets the value of the наимСтраны property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getНаимСтраны() {
            return наимСтраны;
        }

        /**
         * Sets the value of the наимСтраны property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setНаимСтраны(String value) {
            this.наимСтраны = value;
        }

        /**
         * Gets the value of the реквизИнДок property.
         *
         * @return
         *     possible object is
         *     {@link СведЕГРРазд2Тип.СвДокИн.РеквизИнДок }
         *
         */
        public СведЕГРРазд2Тип.СвДокИн.РеквизИнДок getРеквизИнДок() {
            return реквизИнДок;
        }

        /**
         * Sets the value of the реквизИнДок property.
         *
         * @param value
         *     allowed object is
         *     {@link СведЕГРРазд2Тип.СвДокИн.РеквизИнДок }
         *
         */
        public void setРеквизИнДок(СведЕГРРазд2Тип.СвДокИн.РеквизИнДок value) {
            this.реквизИнДок = value;
        }

        /**
         * Gets the value of the юрЗначДок property.
         *
         * @return
         *     possible object is
         *     {@link СведЕГРРазд2Тип.СвДокИн.ЮрЗначДок }
         *
         */
        public СведЕГРРазд2Тип.СвДокИн.ЮрЗначДок getЮрЗначДок() {
            return юрЗначДок;
        }

        /**
         * Sets the value of the юрЗначДок property.
         *
         * @param value
         *     allowed object is
         *     {@link СведЕГРРазд2Тип.СвДокИн.ЮрЗначДок }
         *
         */
        public void setЮрЗначДок(СведЕГРРазд2Тип.СвДокИн.ЮрЗначДок value) {
            this.юрЗначДок = value;
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
         *           &lt;element name="ПрНаимДокТекст">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="НаимДокТекст" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-255"/>
         *         &lt;/choice>
         *         &lt;choice>
         *           &lt;element name="ПрНомер">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="Номер" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-100"/>
         *         &lt;/choice>
         *         &lt;choice>
         *           &lt;element name="ПрДата">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="ДатаКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *           &lt;element name="ДатаДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ДатаДокТип"/>
         *         &lt;/choice>
         *         &lt;choice>
         *           &lt;element name="ПрНаимОрган">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="НаимОрган" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500"/>
         *         &lt;/choice>
         *       &lt;/sequence>
         *       &lt;attribute name="ТипДок" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-5" />
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
        public static class РеквизИнДок {

            @XmlElement(name = "ПрНаимДокТекст", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected String прНаимДокТекст;
            @XmlElement(name = "НаимДокТекст", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected String наимДокТекст;
            @XmlElement(name = "ПрНомер", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected String прНомер;
            @XmlElement(name = "Номер", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected String номер;
            @XmlElement(name = "ПрДата", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected String прДата;
            @XmlElement(name = "ДатаКаленд", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаКаленд;
            @XmlElement(name = "ДатаДок", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected ДатаДокТип датаДок;
            @XmlElement(name = "ПрНаимОрган", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected String прНаимОрган;
            @XmlElement(name = "НаимОрган", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected String наимОрган;
            @XmlAttribute(name = "ТипДок", required = true)
            protected String типДок;

            /**
             * Gets the value of the прНаимДокТекст property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getПрНаимДокТекст() {
                return прНаимДокТекст;
            }

            /**
             * Sets the value of the прНаимДокТекст property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setПрНаимДокТекст(String value) {
                this.прНаимДокТекст = value;
            }

            /**
             * Gets the value of the наимДокТекст property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getНаимДокТекст() {
                return наимДокТекст;
            }

            /**
             * Sets the value of the наимДокТекст property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setНаимДокТекст(String value) {
                this.наимДокТекст = value;
            }

            /**
             * Gets the value of the прНомер property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getПрНомер() {
                return прНомер;
            }

            /**
             * Sets the value of the прНомер property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setПрНомер(String value) {
                this.прНомер = value;
            }

            /**
             * Gets the value of the номер property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getНомер() {
                return номер;
            }

            /**
             * Sets the value of the номер property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setНомер(String value) {
                this.номер = value;
            }

            /**
             * Gets the value of the прДата property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getПрДата() {
                return прДата;
            }

            /**
             * Sets the value of the прДата property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setПрДата(String value) {
                this.прДата = value;
            }

            /**
             * Gets the value of the датаКаленд property.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getДатаКаленд() {
                return датаКаленд;
            }

            /**
             * Sets the value of the датаКаленд property.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setДатаКаленд(XMLGregorianCalendar value) {
                this.датаКаленд = value;
            }

            /**
             * Gets the value of the датаДок property.
             *
             * @return
             *     possible object is
             *     {@link ДатаДокТип }
             *
             */
            public ДатаДокТип getДатаДок() {
                return датаДок;
            }

            /**
             * Sets the value of the датаДок property.
             *
             * @param value
             *     allowed object is
             *     {@link ДатаДокТип }
             *
             */
            public void setДатаДок(ДатаДокТип value) {
                this.датаДок = value;
            }

            /**
             * Gets the value of the прНаимОрган property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getПрНаимОрган() {
                return прНаимОрган;
            }

            /**
             * Sets the value of the прНаимОрган property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setПрНаимОрган(String value) {
                this.прНаимОрган = value;
            }

            /**
             * Gets the value of the наимОрган property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getНаимОрган() {
                return наимОрган;
            }

            /**
             * Sets the value of the наимОрган property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setНаимОрган(String value) {
                this.наимОрган = value;
            }

            /**
             * Gets the value of the типДок property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getТипДок() {
                return типДок;
            }

            /**
             * Sets the value of the типДок property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setТипДок(String value) {
                this.типДок = value;
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
         *           &lt;element name="ПрПодпИн">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="СвПодпТекст" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-255"/>
         *         &lt;/choice>
         *         &lt;choice>
         *           &lt;element name="ПрЗасвидДок">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="ЗасвидДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ЗасвидТип"/>
         *         &lt;/choice>
         *         &lt;choice>
         *           &lt;element name="ПрЗасвидПеревод">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="ЗасвидПеревод" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ЗасвидТип"/>
         *         &lt;/choice>
         *         &lt;choice>
         *           &lt;element name="СвОтказЛегализ">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
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
         *                           &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                             &lt;enumeration value="1"/>
         *                           &lt;/restriction>
         *                         &lt;/simpleType>
         *                       &lt;/element>
         *                       &lt;element name="ОрганЛегал" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500"/>
         *                     &lt;/choice>
         *                     &lt;choice>
         *                       &lt;element name="ПрДатаЛегал">
         *                         &lt;simpleType>
         *                           &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                             &lt;enumeration value="1"/>
         *                           &lt;/restriction>
         *                         &lt;/simpleType>
         *                       &lt;/element>
         *                       &lt;element name="ДатаЛегал" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                     &lt;/choice>
         *                     &lt;choice>
         *                       &lt;element name="ПрНомерЛегал">
         *                         &lt;simpleType>
         *                           &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                             &lt;enumeration value="1"/>
         *                           &lt;/restriction>
         *                         &lt;/simpleType>
         *                       &lt;/element>
         *                       &lt;element name="НомерЛегал" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-25"/>
         *                     &lt;/choice>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/choice>
         *       &lt;/sequence>
         *       &lt;attribute name="КолЛистДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}number-3" />
         *       &lt;attribute name="СвОттискПеч" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *             &lt;enumeration value="1"/>
         *             &lt;enumeration value="2"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="СвЛегал" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
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
        public static class ЮрЗначДок {

            @XmlElement(name = "ПрПодпИн", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected String прПодпИн;
            @XmlElement(name = "СвПодпТекст", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected String свПодпТекст;
            @XmlElement(name = "ПрЗасвидДок", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected String прЗасвидДок;
            @XmlElement(name = "ЗасвидДок", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected ЗасвидТип засвидДок;
            @XmlElement(name = "ПрЗасвидПеревод", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected String прЗасвидПеревод;
            @XmlElement(name = "ЗасвидПеревод", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected ЗасвидТип засвидПеревод;
            @XmlElement(name = "СвОтказЛегализ", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected String свОтказЛегализ;
            @XmlElement(name = "Легализация", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected СведЕГРРазд2Тип.СвДокИн.ЮрЗначДок.Легализация легализация;
            @XmlAttribute(name = "КолЛистДок")
            protected BigInteger колЛистДок;
            @XmlAttribute(name = "СвОттискПеч", required = true)
            protected String свОттискПеч;
            @XmlAttribute(name = "СвЛегал", required = true)
            protected String свЛегал;

            /**
             * Gets the value of the прПодпИн property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getПрПодпИн() {
                return прПодпИн;
            }

            /**
             * Sets the value of the прПодпИн property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setПрПодпИн(String value) {
                this.прПодпИн = value;
            }

            /**
             * Gets the value of the свПодпТекст property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getСвПодпТекст() {
                return свПодпТекст;
            }

            /**
             * Sets the value of the свПодпТекст property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setСвПодпТекст(String value) {
                this.свПодпТекст = value;
            }

            /**
             * Gets the value of the прЗасвидДок property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getПрЗасвидДок() {
                return прЗасвидДок;
            }

            /**
             * Sets the value of the прЗасвидДок property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setПрЗасвидДок(String value) {
                this.прЗасвидДок = value;
            }

            /**
             * Gets the value of the засвидДок property.
             *
             * @return
             *     possible object is
             *     {@link ЗасвидТип }
             *
             */
            public ЗасвидТип getЗасвидДок() {
                return засвидДок;
            }

            /**
             * Sets the value of the засвидДок property.
             *
             * @param value
             *     allowed object is
             *     {@link ЗасвидТип }
             *
             */
            public void setЗасвидДок(ЗасвидТип value) {
                this.засвидДок = value;
            }

            /**
             * Gets the value of the прЗасвидПеревод property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getПрЗасвидПеревод() {
                return прЗасвидПеревод;
            }

            /**
             * Sets the value of the прЗасвидПеревод property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setПрЗасвидПеревод(String value) {
                this.прЗасвидПеревод = value;
            }

            /**
             * Gets the value of the засвидПеревод property.
             *
             * @return
             *     possible object is
             *     {@link ЗасвидТип }
             *
             */
            public ЗасвидТип getЗасвидПеревод() {
                return засвидПеревод;
            }

            /**
             * Sets the value of the засвидПеревод property.
             *
             * @param value
             *     allowed object is
             *     {@link ЗасвидТип }
             *
             */
            public void setЗасвидПеревод(ЗасвидТип value) {
                this.засвидПеревод = value;
            }

            /**
             * Gets the value of the свОтказЛегализ property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getСвОтказЛегализ() {
                return свОтказЛегализ;
            }

            /**
             * Sets the value of the свОтказЛегализ property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setСвОтказЛегализ(String value) {
                this.свОтказЛегализ = value;
            }

            /**
             * Gets the value of the легализация property.
             *
             * @return
             *     possible object is
             *     {@link СведЕГРРазд2Тип.СвДокИн.ЮрЗначДок.Легализация }
             *
             */
            public СведЕГРРазд2Тип.СвДокИн.ЮрЗначДок.Легализация getЛегализация() {
                return легализация;
            }

            /**
             * Sets the value of the легализация property.
             *
             * @param value
             *     allowed object is
             *     {@link СведЕГРРазд2Тип.СвДокИн.ЮрЗначДок.Легализация }
             *
             */
            public void setЛегализация(СведЕГРРазд2Тип.СвДокИн.ЮрЗначДок.Легализация value) {
                this.легализация = value;
            }

            /**
             * Gets the value of the колЛистДок property.
             *
             * @return
             *     possible object is
             *     {@link BigInteger }
             *
             */
            public BigInteger getКолЛистДок() {
                return колЛистДок;
            }

            /**
             * Sets the value of the колЛистДок property.
             *
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *
             */
            public void setКолЛистДок(BigInteger value) {
                this.колЛистДок = value;
            }

            /**
             * Gets the value of the свОттискПеч property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getСвОттискПеч() {
                return свОттискПеч;
            }

            /**
             * Sets the value of the свОттискПеч property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setСвОттискПеч(String value) {
                this.свОттискПеч = value;
            }

            /**
             * Gets the value of the свЛегал property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getСвЛегал() {
                return свЛегал;
            }

            /**
             * Sets the value of the свЛегал property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setСвЛегал(String value) {
                this.свЛегал = value;
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
             *           &lt;element name="ПрОрганЛегал">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="ОрганЛегал" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрДатаЛегал">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="ДатаЛегал" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрНомерЛегал">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="НомерЛегал" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-25"/>
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

                @XmlElement(name = "ПрОрганЛегал", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
                protected String прОрганЛегал;
                @XmlElement(name = "ОрганЛегал", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
                protected String органЛегал;
                @XmlElement(name = "ПрДатаЛегал", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
                protected String прДатаЛегал;
                @XmlElement(name = "ДатаЛегал", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar датаЛегал;
                @XmlElement(name = "ПрНомерЛегал", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
                protected String прНомерЛегал;
                @XmlElement(name = "НомерЛегал", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
                protected String номерЛегал;

                /**
                 * Gets the value of the прОрганЛегал property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрОрганЛегал() {
                    return прОрганЛегал;
                }

                /**
                 * Sets the value of the прОрганЛегал property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрОрганЛегал(String value) {
                    this.прОрганЛегал = value;
                }

                /**
                 * Gets the value of the органЛегал property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getОрганЛегал() {
                    return органЛегал;
                }

                /**
                 * Sets the value of the органЛегал property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setОрганЛегал(String value) {
                    this.органЛегал = value;
                }

                /**
                 * Gets the value of the прДатаЛегал property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрДатаЛегал() {
                    return прДатаЛегал;
                }

                /**
                 * Sets the value of the прДатаЛегал property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрДатаЛегал(String value) {
                    this.прДатаЛегал = value;
                }

                /**
                 * Gets the value of the датаЛегал property.
                 *
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getДатаЛегал() {
                    return датаЛегал;
                }

                /**
                 * Sets the value of the датаЛегал property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public void setДатаЛегал(XMLGregorianCalendar value) {
                    this.датаЛегал = value;
                }

                /**
                 * Gets the value of the прНомерЛегал property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрНомерЛегал() {
                    return прНомерЛегал;
                }

                /**
                 * Sets the value of the прНомерЛегал property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрНомерЛегал(String value) {
                    this.прНомерЛегал = value;
                }

                /**
                 * Gets the value of the номерЛегал property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getНомерЛегал() {
                    return номерЛегал;
                }

                /**
                 * Sets the value of the номерЛегал property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setНомерЛегал(String value) {
                    this.номерЛегал = value;
                }

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
     *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                 &lt;enumeration value="1"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;element name="КодВидУвед" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-5"/>
     *         &lt;/choice>
     *         &lt;choice>
     *           &lt;element name="ПрДатаУвед">
     *             &lt;simpleType>
     *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
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
     *                   &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ОрганЗАГСТип"/>
     *                   &lt;choice>
     *                     &lt;element name="ПрФИООтв">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="ФИООтв" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ФИОПрТип"/>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ДатаПринят" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="ДолжнОтв" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-255" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="СпоcПод" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *             &lt;enumeration value="1"/>
     *             &lt;enumeration value="2"/>
     *             &lt;enumeration value="3"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="КолЛистДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}number-3" />
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
    public static class СвУведомл {

        @XmlElement(name = "ПрКодВидУвед", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
        protected String прКодВидУвед;
        @XmlElement(name = "КодВидУвед", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
        protected String кодВидУвед;
        @XmlElement(name = "ПрДатаУвед", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
        protected String прДатаУвед;
        @XmlElement(name = "ДатаУвед", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаУвед;
        @XmlElement(name = "СведЗАГСУвед", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1", required = true)
        protected СведЕГРРазд2Тип.СвУведомл.СведЗАГСУвед сведЗАГСУвед;
        @XmlAttribute(name = "СпоcПод", required = true)
        protected String споcПод;
        @XmlAttribute(name = "КолЛистДок")
        protected BigInteger колЛистДок;

        /**
         * Gets the value of the прКодВидУвед property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getПрКодВидУвед() {
            return прКодВидУвед;
        }

        /**
         * Sets the value of the прКодВидУвед property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setПрКодВидУвед(String value) {
            this.прКодВидУвед = value;
        }

        /**
         * Gets the value of the кодВидУвед property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getКодВидУвед() {
            return кодВидУвед;
        }

        /**
         * Sets the value of the кодВидУвед property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setКодВидУвед(String value) {
            this.кодВидУвед = value;
        }

        /**
         * Gets the value of the прДатаУвед property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getПрДатаУвед() {
            return прДатаУвед;
        }

        /**
         * Sets the value of the прДатаУвед property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setПрДатаУвед(String value) {
            this.прДатаУвед = value;
        }

        /**
         * Gets the value of the датаУвед property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getДатаУвед() {
            return датаУвед;
        }

        /**
         * Sets the value of the датаУвед property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setДатаУвед(XMLGregorianCalendar value) {
            this.датаУвед = value;
        }

        /**
         * Gets the value of the сведЗАГСУвед property.
         *
         * @return
         *     possible object is
         *     {@link СведЕГРРазд2Тип.СвУведомл.СведЗАГСУвед }
         *
         */
        public СведЕГРРазд2Тип.СвУведомл.СведЗАГСУвед getСведЗАГСУвед() {
            return сведЗАГСУвед;
        }

        /**
         * Sets the value of the сведЗАГСУвед property.
         *
         * @param value
         *     allowed object is
         *     {@link СведЕГРРазд2Тип.СвУведомл.СведЗАГСУвед }
         *
         */
        public void setСведЗАГСУвед(СведЕГРРазд2Тип.СвУведомл.СведЗАГСУвед value) {
            this.сведЗАГСУвед = value;
        }

        /**
         * Gets the value of the споcПод property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getСпоcПод() {
            return споcПод;
        }

        /**
         * Sets the value of the споcПод property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setСпоcПод(String value) {
            this.споcПод = value;
        }

        /**
         * Gets the value of the колЛистДок property.
         *
         * @return
         *     possible object is
         *     {@link BigInteger }
         *
         */
        public BigInteger getКолЛистДок() {
            return колЛистДок;
        }

        /**
         * Sets the value of the колЛистДок property.
         *
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *
         */
        public void setКолЛистДок(BigInteger value) {
            this.колЛистДок = value;
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
         *         &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ОрганЗАГСТип"/>
         *         &lt;choice>
         *           &lt;element name="ПрФИООтв">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="ФИООтв" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ФИОПрТип"/>
         *         &lt;/choice>
         *       &lt;/sequence>
         *       &lt;attribute name="ДатаПринят" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="ДолжнОтв" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-255" />
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
        public static class СведЗАГСУвед {

            @XmlElement(name = "ОрганЗАГС", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1", required = true)
            protected ОрганЗАГСТип органЗАГС;
            @XmlElement(name = "ПрФИООтв", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected String прФИООтв;
            @XmlElement(name = "ФИООтв", namespace = "urn://x-artefacts-zags-fatalinf/types/4.0.1")
            protected ФИОПрТип фиоОтв;
            @XmlAttribute(name = "ДатаПринят", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаПринят;
            @XmlAttribute(name = "ДолжнОтв")
            protected String должнОтв;

            /**
             * Gets the value of the органЗАГС property.
             *
             * @return
             *     possible object is
             *     {@link ОрганЗАГСТип }
             *
             */
            public ОрганЗАГСТип getОрганЗАГС() {
                return органЗАГС;
            }

            /**
             * Sets the value of the органЗАГС property.
             *
             * @param value
             *     allowed object is
             *     {@link ОрганЗАГСТип }
             *
             */
            public void setОрганЗАГС(ОрганЗАГСТип value) {
                this.органЗАГС = value;
            }

            /**
             * Gets the value of the прФИООтв property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getПрФИООтв() {
                return прФИООтв;
            }

            /**
             * Sets the value of the прФИООтв property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setПрФИООтв(String value) {
                this.прФИООтв = value;
            }

            /**
             * Gets the value of the фиоОтв property.
             *
             * @return
             *     possible object is
             *     {@link ФИОПрТип }
             *
             */
            public ФИОПрТип getФИООтв() {
                return фиоОтв;
            }

            /**
             * Sets the value of the фиоОтв property.
             *
             * @param value
             *     allowed object is
             *     {@link ФИОПрТип }
             *
             */
            public void setФИООтв(ФИОПрТип value) {
                this.фиоОтв = value;
            }

            /**
             * Gets the value of the датаПринят property.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getДатаПринят() {
                return датаПринят;
            }

            /**
             * Sets the value of the датаПринят property.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setДатаПринят(XMLGregorianCalendar value) {
                this.датаПринят = value;
            }

            /**
             * Gets the value of the должнОтв property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getДолжнОтв() {
                return должнОтв;
            }

            /**
             * Sets the value of the должнОтв property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setДолжнОтв(String value) {
                this.должнОтв = value;
            }

        }

    }

}
