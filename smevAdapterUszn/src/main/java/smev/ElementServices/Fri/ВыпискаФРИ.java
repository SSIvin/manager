
package smev.ElementServices.Fri;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="Идентификатор" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ТипВыписки" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="FIXED"/>
 *               &lt;enumeration value="FLEXIBLE"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ВремяФормирования" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Потребитель" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ПерсональныеДанные">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СНИЛС">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[0-9]{3}-[0-9]{3}-[0-9]{3}\s[0-9]{2}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Фамилия" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Имя" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Отчество" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ДатаРождения" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="Пол">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="F"/>
 *                         &lt;enumeration value="M"/>
 *                         &lt;enumeration value=""/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ДатаРегистрации" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="АктуальныеСведенияОбИнвалидности">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ДатаС" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="ДатаПо" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="НомерАктаМСЭ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ДатаАктаМСЭ" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="СерияСправкиМСЭ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="НомерСправкиМСЭ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ДатаСправкиМСЭ" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="ПервичнаяИнвалидность" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="ДатаПервичногоОсвидетельствования" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="ОчередноеОсвидетельствование" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="ГруппаИнвалидности" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="Ребенок" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="ИнвалидПоЗрению" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="КодПричиныИнвалидности" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="НаименованиеПричиныИнвалидности" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ВсеДокументы">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Документ" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="РеквизитыДокумента">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Ключ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="РодительскийДокумент" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Источник">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Номер" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Дата" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="СрокДействия" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="ДатаРегистрации" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                       &lt;element name="ТипДокумента">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="КодВерсия" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ДокументОснование" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;element name="ДокументИсполнение" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ВсеСведения">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Запись" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ИдентификаторОбъекта" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                                 &lt;element name="Ключ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Родитель" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Категория">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Назначение" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ВсеАтрибуты">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Атрибут" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="ТипДанных" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="Значение" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
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
@XmlType(name = "", propOrder = {
    "идентификатор",
    "типВыписки",
    "времяФормирования",
    "потребитель",
    "персональныеДанные",
    "всеДокументы"
})
@XmlRootElement(name = "ВыпискаФРИ", namespace = "http://fri.pfr.ru")
public class ВыпискаФРИ {

    @XmlElement(name = "Идентификатор", namespace = "http://fri.pfr.ru")
    protected String идентификатор;
    @XmlElement(name = "ТипВыписки", namespace = "http://fri.pfr.ru")
    protected String типВыписки;
    @XmlElement(name = "ВремяФормирования", namespace = "http://fri.pfr.ru")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar времяФормирования;
    @XmlElement(name = "Потребитель", namespace = "http://fri.pfr.ru")
    protected String потребитель;
    @XmlElement(name = "ПерсональныеДанные", namespace = "http://fri.pfr.ru", required = true)
    protected ВыпискаФРИ.ПерсональныеДанные персональныеДанные;
    @XmlElement(name = "ВсеДокументы", namespace = "http://fri.pfr.ru", required = true)
    protected ВыпискаФРИ.ВсеДокументы всеДокументы;

    /**
     * Gets the value of the идентификатор property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getИдентификатор() {
        return идентификатор;
    }

    /**
     * Sets the value of the идентификатор property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setИдентификатор(String value) {
        this.идентификатор = value;
    }

    /**
     * Gets the value of the типВыписки property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getТипВыписки() {
        return типВыписки;
    }

    /**
     * Sets the value of the типВыписки property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setТипВыписки(String value) {
        this.типВыписки = value;
    }

    /**
     * Gets the value of the времяФормирования property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getВремяФормирования() {
        return времяФормирования;
    }

    /**
     * Sets the value of the времяФормирования property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setВремяФормирования(XMLGregorianCalendar value) {
        this.времяФормирования = value;
    }

    /**
     * Gets the value of the потребитель property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getПотребитель() {
        return потребитель;
    }

    /**
     * Sets the value of the потребитель property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setПотребитель(String value) {
        this.потребитель = value;
    }

    /**
     * Gets the value of the персональныеДанные property.
     *
     * @return
     *     possible object is
     *     {@link ВыпискаФРИ.ПерсональныеДанные }
     *
     */
    public ВыпискаФРИ.ПерсональныеДанные getПерсональныеДанные() {
        return персональныеДанные;
    }

    /**
     * Sets the value of the персональныеДанные property.
     *
     * @param value
     *     allowed object is
     *     {@link ВыпискаФРИ.ПерсональныеДанные }
     *
     */
    public void setПерсональныеДанные(ВыпискаФРИ.ПерсональныеДанные value) {
        this.персональныеДанные = value;
    }

    /**
     * Gets the value of the всеДокументы property.
     *
     * @return
     *     possible object is
     *     {@link ВыпискаФРИ.ВсеДокументы }
     *
     */
    public ВыпискаФРИ.ВсеДокументы getВсеДокументы() {
        return всеДокументы;
    }

    /**
     * Sets the value of the всеДокументы property.
     *
     * @param value
     *     allowed object is
     *     {@link ВыпискаФРИ.ВсеДокументы }
     *
     */
    public void setВсеДокументы(ВыпискаФРИ.ВсеДокументы value) {
        this.всеДокументы = value;
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
     *         &lt;element name="Документ" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="РеквизитыДокумента">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Ключ" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="РодительскийДокумент" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Источник">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Номер" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Дата" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="СрокДействия" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="ДатаРегистрации" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                             &lt;element name="ТипДокумента">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="КодВерсия" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ДокументОснование" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             &lt;element name="ДокументИсполнение" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ВсеСведения">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Запись" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ИдентификаторОбъекта" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                                       &lt;element name="Ключ" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Родитель" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Категория">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Назначение" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="ВсеАтрибуты">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Атрибут" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="ТипДанных" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="Значение" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
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
    @XmlType(name = "", propOrder = {
        "документ"
    })
    public static class ВсеДокументы {

        @XmlElement(name = "Документ", namespace = "http://fri.pfr.ru")
        protected List<Документ> документ;

        /**
         * Gets the value of the файл property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the файл property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getФайл().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ВыпискаФРИ.ВсеДокументы.Документ }
         *
         *
         */
        public List<Документ> getДокумент() {
            if (документ == null) {
                документ = new ArrayList<Документ>();
            }
            return this.документ;
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
         *         &lt;element name="РеквизитыДокумента">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Ключ" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="РодительскийДокумент" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Источник">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Номер" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Дата" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="СрокДействия" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="ДатаРегистрации" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                   &lt;element name="ТипДокумента">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="КодВерсия" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ДокументОснование" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   &lt;element name="ДокументИсполнение" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ВсеСведения">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Запись" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ИдентификаторОбъекта" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                             &lt;element name="Ключ" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Родитель" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Категория">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Назначение" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="ВсеАтрибуты">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Атрибут" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="ТипДанных" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="Значение" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
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
        @XmlType(name = "", propOrder = {
            "реквизитыДокумента",
            "всеСведения"
        })
        public static class Документ {

            @XmlElement(name = "РеквизитыДокумента", namespace = "http://fri.pfr.ru", required = true)
            protected ВыпискаФРИ.ВсеДокументы.Документ.РеквизитыДокумента реквизитыДокумента;
            @XmlElement(name = "ВсеСведения", namespace = "http://fri.pfr.ru", required = true)
            protected ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения всеСведения;

            /**
             * Gets the value of the реквизитыДокумента property.
             *
             * @return
             *     possible object is
             *     {@link ВыпискаФРИ.ВсеДокументы.Документ.РеквизитыДокумента }
             *
             */
            public ВыпискаФРИ.ВсеДокументы.Документ.РеквизитыДокумента getРеквизитыДокумента() {
                return реквизитыДокумента;
            }

            /**
             * Sets the value of the реквизитыДокумента property.
             *
             * @param value
             *     allowed object is
             *     {@link ВыпискаФРИ.ВсеДокументы.Документ.РеквизитыДокумента }
             *
             */
            public void setРеквизитыДокумента(ВыпискаФРИ.ВсеДокументы.Документ.РеквизитыДокумента value) {
                this.реквизитыДокумента = value;
            }

            /**
             * Gets the value of the всеСведения property.
             *
             * @return
             *     possible object is
             *     {@link ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения }
             *
             */
            public ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения getВсеСведения() {
                return всеСведения;
            }

            /**
             * Sets the value of the всеСведения property.
             *
             * @param value
             *     allowed object is
             *     {@link ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения }
             *
             */
            public void setВсеСведения(ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения value) {
                this.всеСведения = value;
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
             *         &lt;element name="Запись" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ИдентификаторОбъекта" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *                   &lt;element name="Ключ" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Родитель" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Категория">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Назначение" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="ВсеАтрибуты">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Атрибут" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="ТипДанных" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="Значение" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
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
            @XmlType(name = "", propOrder = {
                "запись"
            })
            public static class ВсеСведения {

                @XmlElement(name = "Запись", namespace = "http://fri.pfr.ru")
                protected List<Запись> запись;

                /**
                 * Gets the value of the запись property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the запись property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getЗапись().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись }
                 *
                 *
                 */
                public List<Запись> getЗапись() {
                    if (запись == null) {
                        запись = new ArrayList<Запись>();
                    }
                    return this.запись;
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
                 *         &lt;element name="ИдентификаторОбъекта" type="{http://www.w3.org/2001/XMLSchema}long"/>
                 *         &lt;element name="Ключ" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Родитель" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Категория">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Назначение" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="ВсеАтрибуты">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Атрибут" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="ТипДанных" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="Значение" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                           &lt;/sequence>
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
                @XmlType(name = "", propOrder = {
                    "идентификаторОбъекта",
                    "ключ",
                    "родитель",
                    "категория",
                    "всеАтрибуты"
                })
                public static class Запись {

                    @XmlElement(name = "ИдентификаторОбъекта", namespace = "http://fri.pfr.ru")
                    protected long идентификаторОбъекта;
                    @XmlElement(name = "Ключ", namespace = "http://fri.pfr.ru", required = true)
                    protected String ключ;
                    @XmlElement(name = "Родитель", namespace = "http://fri.pfr.ru", required = true)
                    protected String родитель;
                    @XmlElement(name = "Категория", namespace = "http://fri.pfr.ru", required = true)
                    protected ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись.Категория категория;
                    @XmlElement(name = "ВсеАтрибуты", namespace = "http://fri.pfr.ru", required = true)
                    protected ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись.ВсеАтрибуты всеАтрибуты;

                    /**
                     * Gets the value of the идентификаторОбъекта property.
                     *
                     */
                    public long getИдентификаторОбъекта() {
                        return идентификаторОбъекта;
                    }

                    /**
                     * Sets the value of the идентификаторОбъекта property.
                     *
                     */
                    public void setИдентификаторОбъекта(long value) {
                        this.идентификаторОбъекта = value;
                    }

                    /**
                     * Gets the value of the ключ property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getКлюч() {
                        return ключ;
                    }

                    /**
                     * Sets the value of the ключ property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setКлюч(String value) {
                        this.ключ = value;
                    }

                    /**
                     * Gets the value of the родитель property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getРодитель() {
                        return родитель;
                    }

                    /**
                     * Sets the value of the родитель property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setРодитель(String value) {
                        this.родитель = value;
                    }

                    /**
                     * Gets the value of the категория property.
                     *
                     * @return
                     *     possible object is
                     *     {@link ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись.Категория }
                     *
                     */
                    public ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись.Категория getКатегория() {
                        return категория;
                    }

                    /**
                     * Sets the value of the категория property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись.Категория }
                     *
                     */
                    public void setКатегория(ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись.Категория value) {
                        this.категория = value;
                    }

                    /**
                     * Gets the value of the всеАтрибуты property.
                     *
                     * @return
                     *     possible object is
                     *     {@link ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись.ВсеАтрибуты }
                     *
                     */
                    public ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись.ВсеАтрибуты getВсеАтрибуты() {
                        return всеАтрибуты;
                    }

                    /**
                     * Sets the value of the всеАтрибуты property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись.ВсеАтрибуты }
                     *
                     */
                    public void setВсеАтрибуты(ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись.ВсеАтрибуты value) {
                        this.всеАтрибуты = value;
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
                     *         &lt;element name="Атрибут" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="ТипДанных" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="Значение" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    @XmlType(name = "", propOrder = {
                        "атрибут"
                    })
                    public static class ВсеАтрибуты {

                        @XmlElement(name = "Атрибут", namespace = "http://fri.pfr.ru")
                        protected List<Атрибут> атрибут;

                        /**
                         * Gets the value of the атрибут property.
                         *
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the атрибут property.
                         *
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getАтрибут().add(newItem);
                         * </pre>
                         *
                         *
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись.ВсеАтрибуты.Атрибут }
                         *
                         *
                         */
                        public List<Атрибут> getАтрибут() {
                            if (атрибут == null) {
                                атрибут = new ArrayList<Атрибут>();
                            }
                            return this.атрибут;
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
                         *         &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="ТипДанных" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="Значение" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                            "код",
                            "наименование",
                            "типДанных",
                            "значение"
                        })
                        public static class Атрибут {

                            @XmlElement(name = "Код", namespace = "http://fri.pfr.ru", required = true)
                            protected String код;
                            @XmlElement(name = "Наименование", namespace = "http://fri.pfr.ru", required = true)
                            protected String наименование;
                            @XmlElement(name = "ТипДанных", namespace = "http://fri.pfr.ru", required = true)
                            protected String типДанных;
                            @XmlElement(name = "Значение", namespace = "http://fri.pfr.ru", required = true)
                            protected String значение;

                            /**
                             * Gets the value of the код property.
                             *
                             * @return
                             *     possible object is
                             *     {@link String }
                             *
                             */
                            public String getКод() {
                                return код;
                            }

                            /**
                             * Sets the value of the код property.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *
                             */
                            public void setКод(String value) {
                                this.код = value;
                            }

                            /**
                             * Gets the value of the наименование property.
                             *
                             * @return
                             *     possible object is
                             *     {@link String }
                             *
                             */
                            public String getНаименование() {
                                return наименование;
                            }

                            /**
                             * Sets the value of the наименование property.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *
                             */
                            public void setНаименование(String value) {
                                this.наименование = value;
                            }

                            /**
                             * Gets the value of the типДанных property.
                             *
                             * @return
                             *     possible object is
                             *     {@link String }
                             *
                             */
                            public String getТипДанных() {
                                return типДанных;
                            }

                            /**
                             * Sets the value of the типДанных property.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *
                             */
                            public void setТипДанных(String value) {
                                this.типДанных = value;
                            }

                            /**
                             * Gets the value of the значение property.
                             *
                             * @return
                             *     possible object is
                             *     {@link String }
                             *
                             */
                            public String getЗначение() {
                                return значение;
                            }

                            /**
                             * Sets the value of the значение property.
                             *
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *
                             */
                            public void setЗначение(String value) {
                                this.значение = value;
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
                     *         &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Назначение" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                        "код",
                        "наименование",
                        "назначение"
                    })
                    public static class Категория {

                        @XmlElement(name = "Код", namespace = "http://fri.pfr.ru", required = true)
                        protected String код;
                        @XmlElement(name = "Наименование", namespace = "http://fri.pfr.ru", required = true)
                        protected String наименование;
                        @XmlElement(name = "Назначение", namespace = "http://fri.pfr.ru", required = true, nillable = true)
                        protected String назначение;

                        /**
                         * Gets the value of the код property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getКод() {
                            return код;
                        }

                        /**
                         * Sets the value of the код property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setКод(String value) {
                            this.код = value;
                        }

                        /**
                         * Gets the value of the наименование property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getНаименование() {
                            return наименование;
                        }

                        /**
                         * Sets the value of the наименование property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setНаименование(String value) {
                            this.наименование = value;
                        }

                        /**
                         * Gets the value of the назначение property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getНазначение() {
                            return назначение;
                        }

                        /**
                         * Sets the value of the назначение property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setНазначение(String value) {
                            this.назначение = value;
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
             *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Ключ" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="РодительскийДокумент" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Источник">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Номер" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Дата" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="СрокДействия" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="ДатаРегистрации" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *         &lt;element name="ТипДокумента">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="КодВерсия" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ДокументОснование" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         &lt;element name="ДокументИсполнение" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
                "id",
                "ключ",
                "родительскийДокумент",
                "источник",
                "номер",
                "дата",
                "срокДействия",
                "датаРегистрации",
                "типДокумента",
                "документОснование",
                "документИсполнение"
            })
            public static class РеквизитыДокумента {

                @XmlElement(name = "ID", namespace = "http://fri.pfr.ru", required = true)
                protected String id;
                @XmlElement(name = "Ключ", namespace = "http://fri.pfr.ru", required = true)
                protected String ключ;
                @XmlElement(name = "РодительскийДокумент", namespace = "http://fri.pfr.ru", required = true)
                protected String родительскийДокумент;
                @XmlElement(name = "Источник", namespace = "http://fri.pfr.ru", required = true)
                protected ВыпискаФРИ.ВсеДокументы.Документ.РеквизитыДокумента.Источник источник;
                @XmlElement(name = "Номер", namespace = "http://fri.pfr.ru", required = true)
                protected String номер;
                @XmlElement(name = "Дата", namespace = "http://fri.pfr.ru", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar дата;
                @XmlElement(name = "СрокДействия", namespace = "http://fri.pfr.ru", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar срокДействия;
                @XmlElement(name = "ДатаРегистрации", namespace = "http://fri.pfr.ru", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar датаРегистрации;
                @XmlElement(name = "ТипДокумента", namespace = "http://fri.pfr.ru", required = true)
                protected ВыпискаФРИ.ВсеДокументы.Документ.РеквизитыДокумента.ТипДокумента типДокумента;
                @XmlElement(name = "ДокументОснование", namespace = "http://fri.pfr.ru")
                protected boolean документОснование;
                @XmlElement(name = "ДокументИсполнение", namespace = "http://fri.pfr.ru")
                protected boolean документИсполнение;

                /**
                 * Gets the value of the id property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getID() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setID(String value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the ключ property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getКлюч() {
                    return ключ;
                }

                /**
                 * Sets the value of the ключ property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setКлюч(String value) {
                    this.ключ = value;
                }

                /**
                 * Gets the value of the родительскийДокумент property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getРодительскийДокумент() {
                    return родительскийДокумент;
                }

                /**
                 * Sets the value of the родительскийДокумент property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setРодительскийДокумент(String value) {
                    this.родительскийДокумент = value;
                }

                /**
                 * Gets the value of the источник property.
                 *
                 * @return
                 *     possible object is
                 *     {@link ВыпискаФРИ.ВсеДокументы.Документ.РеквизитыДокумента.Источник }
                 *
                 */
                public ВыпискаФРИ.ВсеДокументы.Документ.РеквизитыДокумента.Источник getИсточник() {
                    return источник;
                }

                /**
                 * Sets the value of the источник property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ВыпискаФРИ.ВсеДокументы.Документ.РеквизитыДокумента.Источник }
                 *
                 */
                public void setИсточник(ВыпискаФРИ.ВсеДокументы.Документ.РеквизитыДокумента.Источник value) {
                    this.источник = value;
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
                 * Gets the value of the дата property.
                 *
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getДата() {
                    return дата;
                }

                /**
                 * Sets the value of the дата property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public void setДата(XMLGregorianCalendar value) {
                    this.дата = value;
                }

                /**
                 * Gets the value of the срокДействия property.
                 *
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getСрокДействия() {
                    return срокДействия;
                }

                /**
                 * Sets the value of the срокДействия property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public void setСрокДействия(XMLGregorianCalendar value) {
                    this.срокДействия = value;
                }

                /**
                 * Gets the value of the датаРегистрации property.
                 *
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getДатаРегистрации() {
                    return датаРегистрации;
                }

                /**
                 * Sets the value of the датаРегистрации property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public void setДатаРегистрации(XMLGregorianCalendar value) {
                    this.датаРегистрации = value;
                }

                /**
                 * Gets the value of the типДокумента property.
                 *
                 * @return
                 *     possible object is
                 *     {@link ВыпискаФРИ.ВсеДокументы.Документ.РеквизитыДокумента.ТипДокумента }
                 *
                 */
                public ВыпискаФРИ.ВсеДокументы.Документ.РеквизитыДокумента.ТипДокумента getТипДокумента() {
                    return типДокумента;
                }

                /**
                 * Sets the value of the типДокумента property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ВыпискаФРИ.ВсеДокументы.Документ.РеквизитыДокумента.ТипДокумента }
                 *
                 */
                public void setТипДокумента(ВыпискаФРИ.ВсеДокументы.Документ.РеквизитыДокумента.ТипДокумента value) {
                    this.типДокумента = value;
                }

                /**
                 * Gets the value of the документОснование property.
                 *
                 */
                public boolean isДокументОснование() {
                    return документОснование;
                }

                /**
                 * Sets the value of the документОснование property.
                 *
                 */
                public void setДокументОснование(boolean value) {
                    this.документОснование = value;
                }

                /**
                 * Gets the value of the документИсполнение property.
                 *
                 */
                public boolean isДокументИсполнение() {
                    return документИсполнение;
                }

                /**
                 * Sets the value of the документИсполнение property.
                 *
                 */
                public void setДокументИсполнение(boolean value) {
                    this.документИсполнение = value;
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
                 *         &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "код",
                    "наименование"
                })
                public static class Источник {

                    @XmlElement(name = "Код", namespace = "http://fri.pfr.ru", required = true)
                    protected String код;
                    @XmlElement(name = "Наименование", namespace = "http://fri.pfr.ru", required = true)
                    protected String наименование;

                    /**
                     * Gets the value of the код property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getКод() {
                        return код;
                    }

                    /**
                     * Sets the value of the код property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setКод(String value) {
                        this.код = value;
                    }

                    /**
                     * Gets the value of the наименование property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getНаименование() {
                        return наименование;
                    }

                    /**
                     * Sets the value of the наименование property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setНаименование(String value) {
                        this.наименование = value;
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
                 *         &lt;element name="КодВерсия" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Код" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Наименование" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "кодВерсия",
                    "код",
                    "наименование"
                })
                public static class ТипДокумента {

                    @XmlElement(name = "КодВерсия", namespace = "http://fri.pfr.ru", required = true)
                    protected String кодВерсия;
                    @XmlElement(name = "Код", namespace = "http://fri.pfr.ru", required = true)
                    protected String код;
                    @XmlElement(name = "Наименование", namespace = "http://fri.pfr.ru", required = true)
                    protected String наименование;

                    /**
                     * Gets the value of the кодВерсия property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getКодВерсия() {
                        return кодВерсия;
                    }

                    /**
                     * Sets the value of the кодВерсия property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setКодВерсия(String value) {
                        this.кодВерсия = value;
                    }

                    /**
                     * Gets the value of the код property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getКод() {
                        return код;
                    }

                    /**
                     * Sets the value of the код property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setКод(String value) {
                        this.код = value;
                    }

                    /**
                     * Gets the value of the наименование property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getНаименование() {
                        return наименование;
                    }

                    /**
                     * Sets the value of the наименование property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setНаименование(String value) {
                        this.наименование = value;
                    }

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
     *         &lt;element name="СНИЛС">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="[0-9]{3}-[0-9]{3}-[0-9]{3}\s[0-9]{2}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Фамилия" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Имя" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Отчество" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ДатаРождения" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="Пол">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="F"/>
     *               &lt;enumeration value="M"/>
     *               &lt;enumeration value=""/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ДатаРегистрации" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="АктуальныеСведенияОбИнвалидности">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ДатаС" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="ДатаПо" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="НомерАктаМСЭ" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ДатаАктаМСЭ" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="СерияСправкиМСЭ" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="НомерСправкиМСЭ" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ДатаСправкиМСЭ" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="ПервичнаяИнвалидность" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="ДатаПервичногоОсвидетельствования" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="ОчередноеОсвидетельствование" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="ГруппаИнвалидности" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="Ребенок" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="ИнвалидПоЗрению" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="КодПричиныИнвалидности" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="НаименованиеПричиныИнвалидности" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    @XmlType(name = "", propOrder = {
        "снилс",
        "фамилия",
        "имя",
        "отчество",
        "датаРождения",
        "пол",
        "датаРегистрации",
        "актуальныеСведенияОбИнвалидности"
    })
    public static class ПерсональныеДанные {

        @XmlElement(name = "СНИЛС", namespace = "http://fri.pfr.ru", required = true)
        protected String снилс;
        @XmlElement(name = "Фамилия", namespace = "http://fri.pfr.ru", required = true)
        protected String фамилия;
        @XmlElement(name = "Имя", namespace = "http://fri.pfr.ru", required = true)
        protected String имя;
        @XmlElement(name = "Отчество", namespace = "http://fri.pfr.ru", required = true)
        protected String отчество;
        @XmlElement(name = "ДатаРождения", namespace = "http://fri.pfr.ru", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаРождения;
        @XmlElement(name = "Пол", namespace = "http://fri.pfr.ru", required = true)
        protected String пол;
        @XmlElement(name = "ДатаРегистрации", namespace = "http://fri.pfr.ru", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar датаРегистрации;
        @XmlElement(name = "АктуальныеСведенияОбИнвалидности", namespace = "http://fri.pfr.ru", required = true)
        protected ВыпискаФРИ.ПерсональныеДанные.АктуальныеСведенияОбИнвалидности актуальныеСведенияОбИнвалидности;

        /**
         * Gets the value of the снилс property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getСНИЛС() {
            return снилс;
        }

        /**
         * Sets the value of the снилс property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setСНИЛС(String value) {
            this.снилс = value;
        }

        /**
         * Gets the value of the фамилия property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getФамилия() {
            return фамилия;
        }

        /**
         * Sets the value of the фамилия property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setФамилия(String value) {
            this.фамилия = value;
        }

        /**
         * Gets the value of the имя property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getИмя() {
            return имя;
        }

        /**
         * Sets the value of the имя property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setИмя(String value) {
            this.имя = value;
        }

        /**
         * Gets the value of the отчество property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getОтчество() {
            return отчество;
        }

        /**
         * Sets the value of the отчество property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setОтчество(String value) {
            this.отчество = value;
        }

        /**
         * Gets the value of the датаРождения property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getДатаРождения() {
            return датаРождения;
        }

        /**
         * Sets the value of the датаРождения property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setДатаРождения(XMLGregorianCalendar value) {
            this.датаРождения = value;
        }

        /**
         * Gets the value of the пол property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getПол() {
            return пол;
        }

        /**
         * Sets the value of the пол property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setПол(String value) {
            this.пол = value;
        }

        /**
         * Gets the value of the датаРегистрации property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getДатаРегистрации() {
            return датаРегистрации;
        }

        /**
         * Sets the value of the датаРегистрации property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setДатаРегистрации(XMLGregorianCalendar value) {
            this.датаРегистрации = value;
        }

        /**
         * Gets the value of the актуальныеСведенияОбИнвалидности property.
         *
         * @return
         *     possible object is
         *     {@link ВыпискаФРИ.ПерсональныеДанные.АктуальныеСведенияОбИнвалидности }
         *
         */
        public ВыпискаФРИ.ПерсональныеДанные.АктуальныеСведенияОбИнвалидности getАктуальныеСведенияОбИнвалидности() {
            return актуальныеСведенияОбИнвалидности;
        }

        /**
         * Sets the value of the актуальныеСведенияОбИнвалидности property.
         *
         * @param value
         *     allowed object is
         *     {@link ВыпискаФРИ.ПерсональныеДанные.АктуальныеСведенияОбИнвалидности }
         *
         */
        public void setАктуальныеСведенияОбИнвалидности(ВыпискаФРИ.ПерсональныеДанные.АктуальныеСведенияОбИнвалидности value) {
            this.актуальныеСведенияОбИнвалидности = value;
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
         *         &lt;element name="ДатаС" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="ДатаПо" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="НомерАктаМСЭ" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ДатаАктаМСЭ" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="СерияСправкиМСЭ" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="НомерСправкиМСЭ" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ДатаСправкиМСЭ" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="ПервичнаяИнвалидность" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="ДатаПервичногоОсвидетельствования" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="ОчередноеОсвидетельствование" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="ГруппаИнвалидности" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="Ребенок" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="ИнвалидПоЗрению" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="КодПричиныИнвалидности" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="НаименованиеПричиныИнвалидности" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "датаС",
            "датаПо",
            "номерАктаМСЭ",
            "датаАктаМСЭ",
            "серияСправкиМСЭ",
            "номерСправкиМСЭ",
            "датаСправкиМСЭ",
            "первичнаяИнвалидность",
            "датаПервичногоОсвидетельствования",
            "очередноеОсвидетельствование",
            "группаИнвалидности",
            "ребенок",
            "инвалидПоЗрению",
            "кодПричиныИнвалидности",
            "наименованиеПричиныИнвалидности"
        })
        public static class АктуальныеСведенияОбИнвалидности {

            @XmlElement(name = "ДатаС", namespace = "http://fri.pfr.ru", required = true, nillable = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаС;
            @XmlElement(name = "ДатаПо", namespace = "http://fri.pfr.ru", required = true, nillable = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаПо;
            @XmlElement(name = "НомерАктаМСЭ", namespace = "http://fri.pfr.ru", required = true, nillable = true)
            protected String номерАктаМСЭ;
            @XmlElement(name = "ДатаАктаМСЭ", namespace = "http://fri.pfr.ru", required = true, nillable = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаАктаМСЭ;
            @XmlElement(name = "СерияСправкиМСЭ", namespace = "http://fri.pfr.ru", required = true, nillable = true)
            protected String серияСправкиМСЭ;
            @XmlElement(name = "НомерСправкиМСЭ", namespace = "http://fri.pfr.ru", required = true, nillable = true)
            protected String номерСправкиМСЭ;
            @XmlElement(name = "ДатаСправкиМСЭ", namespace = "http://fri.pfr.ru", required = true, nillable = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаСправкиМСЭ;
            @XmlElement(name = "ПервичнаяИнвалидность", namespace = "http://fri.pfr.ru", required = true, type = Boolean.class, nillable = true)
            protected Boolean первичнаяИнвалидность;
            @XmlElement(name = "ДатаПервичногоОсвидетельствования", namespace = "http://fri.pfr.ru", required = true, nillable = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаПервичногоОсвидетельствования;
            @XmlElement(name = "ОчередноеОсвидетельствование", namespace = "http://fri.pfr.ru", required = true, nillable = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar очередноеОсвидетельствование;
            @XmlElement(name = "ГруппаИнвалидности", namespace = "http://fri.pfr.ru", required = true, nillable = true)
            protected BigInteger группаИнвалидности;
            @XmlElement(name = "Ребенок", namespace = "http://fri.pfr.ru", required = true, type = Boolean.class, nillable = true)
            protected Boolean ребенок;
            @XmlElement(name = "ИнвалидПоЗрению", namespace = "http://fri.pfr.ru", required = true, type = Boolean.class, nillable = true)
            protected Boolean инвалидПоЗрению;
            @XmlElement(name = "КодПричиныИнвалидности", namespace = "http://fri.pfr.ru", required = true, type = Long.class, nillable = true)
            protected Long кодПричиныИнвалидности;
            @XmlElement(name = "НаименованиеПричиныИнвалидности", namespace = "http://fri.pfr.ru", required = true, nillable = true)
            protected String наименованиеПричиныИнвалидности;

            /**
             * Gets the value of the датаС property.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getДатаС() {
                return датаС;
            }

            /**
             * Sets the value of the датаС property.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setДатаС(XMLGregorianCalendar value) {
                this.датаС = value;
            }

            /**
             * Gets the value of the датаПо property.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getДатаПо() {
                return датаПо;
            }

            /**
             * Sets the value of the датаПо property.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setДатаПо(XMLGregorianCalendar value) {
                this.датаПо = value;
            }

            /**
             * Gets the value of the номерАктаМСЭ property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getНомерАктаМСЭ() {
                return номерАктаМСЭ;
            }

            /**
             * Sets the value of the номерАктаМСЭ property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setНомерАктаМСЭ(String value) {
                this.номерАктаМСЭ = value;
            }

            /**
             * Gets the value of the датаАктаМСЭ property.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getДатаАктаМСЭ() {
                return датаАктаМСЭ;
            }

            /**
             * Sets the value of the датаАктаМСЭ property.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setДатаАктаМСЭ(XMLGregorianCalendar value) {
                this.датаАктаМСЭ = value;
            }

            /**
             * Gets the value of the серияСправкиМСЭ property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getСерияСправкиМСЭ() {
                return серияСправкиМСЭ;
            }

            /**
             * Sets the value of the серияСправкиМСЭ property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setСерияСправкиМСЭ(String value) {
                this.серияСправкиМСЭ = value;
            }

            /**
             * Gets the value of the номерСправкиМСЭ property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getНомерСправкиМСЭ() {
                return номерСправкиМСЭ;
            }

            /**
             * Sets the value of the номерСправкиМСЭ property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setНомерСправкиМСЭ(String value) {
                this.номерСправкиМСЭ = value;
            }

            /**
             * Gets the value of the датаСправкиМСЭ property.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getДатаСправкиМСЭ() {
                return датаСправкиМСЭ;
            }

            /**
             * Sets the value of the датаСправкиМСЭ property.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setДатаСправкиМСЭ(XMLGregorianCalendar value) {
                this.датаСправкиМСЭ = value;
            }

            /**
             * Gets the value of the первичнаяИнвалидность property.
             *
             * @return
             *     possible object is
             *     {@link Boolean }
             *
             */
            public Boolean isПервичнаяИнвалидность() {
                return первичнаяИнвалидность;
            }

            /**
             * Sets the value of the первичнаяИнвалидность property.
             *
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *
             */
            public void setПервичнаяИнвалидность(Boolean value) {
                this.первичнаяИнвалидность = value;
            }

            /**
             * Gets the value of the датаПервичногоОсвидетельствования property.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getДатаПервичногоОсвидетельствования() {
                return датаПервичногоОсвидетельствования;
            }

            /**
             * Sets the value of the датаПервичногоОсвидетельствования property.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setДатаПервичногоОсвидетельствования(XMLGregorianCalendar value) {
                this.датаПервичногоОсвидетельствования = value;
            }

            /**
             * Gets the value of the очередноеОсвидетельствование property.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getОчередноеОсвидетельствование() {
                return очередноеОсвидетельствование;
            }

            /**
             * Sets the value of the очередноеОсвидетельствование property.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setОчередноеОсвидетельствование(XMLGregorianCalendar value) {
                this.очередноеОсвидетельствование = value;
            }

            /**
             * Gets the value of the группаИнвалидности property.
             *
             * @return
             *     possible object is
             *     {@link BigInteger }
             *
             */
            public BigInteger getГруппаИнвалидности() {
                return группаИнвалидности;
            }

            /**
             * Sets the value of the группаИнвалидности property.
             *
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *
             */
            public void setГруппаИнвалидности(BigInteger value) {
                this.группаИнвалидности = value;
            }

            /**
             * Gets the value of the ребенок property.
             *
             * @return
             *     possible object is
             *     {@link Boolean }
             *
             */
            public Boolean isРебенок() {
                return ребенок;
            }

            /**
             * Sets the value of the ребенок property.
             *
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *
             */
            public void setРебенок(Boolean value) {
                this.ребенок = value;
            }

            /**
             * Gets the value of the инвалидПоЗрению property.
             *
             * @return
             *     possible object is
             *     {@link Boolean }
             *
             */
            public Boolean isИнвалидПоЗрению() {
                return инвалидПоЗрению;
            }

            /**
             * Sets the value of the инвалидПоЗрению property.
             *
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *
             */
            public void setИнвалидПоЗрению(Boolean value) {
                this.инвалидПоЗрению = value;
            }

            /**
             * Gets the value of the кодПричиныИнвалидности property.
             *
             * @return
             *     possible object is
             *     {@link Long }
             *
             */
            public Long getКодПричиныИнвалидности() {
                return кодПричиныИнвалидности;
            }

            /**
             * Sets the value of the кодПричиныИнвалидности property.
             *
             * @param value
             *     allowed object is
             *     {@link Long }
             *
             */
            public void setКодПричиныИнвалидности(Long value) {
                this.кодПричиныИнвалидности = value;
            }

            /**
             * Gets the value of the наименованиеПричиныИнвалидности property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getНаименованиеПричиныИнвалидности() {
                return наименованиеПричиныИнвалидности;
            }

            /**
             * Sets the value of the наименованиеПричиныИнвалидности property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setНаименованиеПричиныИнвалидности(String value) {
                this.наименованиеПричиныИнвалидности = value;
            }

        }

    }

}
