
package smev.ElementServices.ZagsRojd;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="СведОтветАГС" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СведРегРожд" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ДатаДокТип"/>
 *                               &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;/choice>
 *                             &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ОрганЗАГСТип"/>
 *                             &lt;element name="СвидетРожд" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ПрдСведРег">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрСчетМатер">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="СчетМатер" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2"/>
 *                                       &lt;/choice>
 *                                       &lt;element name="СведРоды" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ЧислоРодДетей" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2"/>
 *                                                 &lt;choice>
 *                                                   &lt;element name="ПрСчет">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                                                         &lt;enumeration value="1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="Счет" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2"/>
 *                                                 &lt;/choice>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="СведРодившемся">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;choice>
 *                                                   &lt;element name="ПрЖивМертв">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                                                         &lt;enumeration value="1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="ЖивМертв">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                                                         &lt;enumeration value="0"/>
 *                                                         &lt;enumeration value="1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/choice>
 *                                                 &lt;choice>
 *                                                   &lt;element name="ПрПол">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                                                         &lt;enumeration value="1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="Пол">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                                                         &lt;enumeration value="1"/>
 *                                                         &lt;enumeration value="2"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/choice>
 *                                                 &lt;element name="ФИОРожд" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ФИОПрТип"/>
 *                                                 &lt;choice>
 *                                                   &lt;element name="ПрДатаРожд">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                                                         &lt;enumeration value="1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                   &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ДатаДокТип"/>
 *                                                 &lt;/choice>
 *                                                 &lt;choice>
 *                                                   &lt;element name="ПрМестоРожден">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                                                         &lt;enumeration value="1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}МестоТип"/>
 *                                                 &lt;/choice>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СНИЛСТип" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрМать">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="СведМать" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведРодитТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрОтец">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="СведОтец" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведРодитТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрСведДокОснОтец">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="СведДокОснОтец" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведДокОснТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрСведДокРод">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="СведДокРод" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведДокТип"/>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведЕГРРазд2Тип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="РазделЕГР" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                                 &lt;enumeration value="1"/>
 *                                 &lt;enumeration value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-21" />
 *                           &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-10" />
 *                           &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1_3" />
 *                           &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-4" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ИдДок" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-36" />
 *                 &lt;attribute name="РезОбраб" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
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
 *       &lt;attribute name="ИдЗапрос" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ИдЗапросТип" />
 *       &lt;attribute name="ДатаСвед" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="КолДок" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2" />
 *       &lt;attribute name="ТипАГСЗапрос" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-2">
 *             &lt;enumeration value="01"/>
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
    "сведОтветАГС"
})
@XmlRootElement(name = "ROGDINFResponse", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
public class ROGDINFResponse {

    @XmlElement(name = "СведОтветАГС", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1", required = true)
    protected List<ROGDINFResponse.СведОтветАГС> сведОтветАГС;
    @XmlAttribute(name = "ИдЗапрос", required = true)
    protected String идЗапрос;
    @XmlAttribute(name = "ДатаСвед", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаСвед;
    @XmlAttribute(name = "КолДок", required = true)
    protected BigInteger колДок;
    @XmlAttribute(name = "ТипАГСЗапрос", required = true)
    protected String типАГСЗапрос;

    /**
     * Gets the value of the сведОтветАГС property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the сведОтветАГС property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСведОтветАГС().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ROGDINFResponse.СведОтветАГС }
     *
     *
     */
    public List<ROGDINFResponse.СведОтветАГС> getСведОтветАГС() {
        if (сведОтветАГС == null) {
            сведОтветАГС = new ArrayList<ROGDINFResponse.СведОтветАГС>();
        }
        return this.сведОтветАГС;
    }

    /**
     * Gets the value of the идЗапрос property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getИдЗапрос() {
        return идЗапрос;
    }

    /**
     * Sets the value of the идЗапрос property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setИдЗапрос(String value) {
        this.идЗапрос = value;
    }

    /**
     * Gets the value of the датаСвед property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getДатаСвед() {
        return датаСвед;
    }

    /**
     * Sets the value of the датаСвед property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setДатаСвед(XMLGregorianCalendar value) {
        this.датаСвед = value;
    }

    /**
     * Gets the value of the колДок property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getКолДок() {
        return колДок;
    }

    /**
     * Sets the value of the колДок property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setКолДок(BigInteger value) {
        this.колДок = value;
    }

    /**
     * Gets the value of the типАГСЗапрос property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getТипАГСЗапрос() {
        return типАГСЗапрос;
    }

    /**
     * Sets the value of the типАГСЗапрос property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setТипАГСЗапрос(String value) {
        this.типАГСЗапрос = value;
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
     *         &lt;element name="СведРегРожд" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ДатаДокТип"/>
     *                     &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;/choice>
     *                   &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ОрганЗАГСТип"/>
     *                   &lt;element name="СвидетРожд" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ПрдСведРег">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="ПрСчетМатер">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="СчетМатер" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2"/>
     *                             &lt;/choice>
     *                             &lt;element name="СведРоды" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ЧислоРодДетей" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2"/>
     *                                       &lt;choice>
     *                                         &lt;element name="ПрСчет">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
     *                                               &lt;enumeration value="1"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="Счет" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2"/>
     *                                       &lt;/choice>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="СведРодившемся">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;choice>
     *                                         &lt;element name="ПрЖивМертв">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
     *                                               &lt;enumeration value="1"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="ЖивМертв">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
     *                                               &lt;enumeration value="0"/>
     *                                               &lt;enumeration value="1"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                       &lt;/choice>
     *                                       &lt;choice>
     *                                         &lt;element name="ПрПол">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
     *                                               &lt;enumeration value="1"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="Пол">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
     *                                               &lt;enumeration value="1"/>
     *                                               &lt;enumeration value="2"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                       &lt;/choice>
     *                                       &lt;element name="ФИОРожд" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ФИОПрТип"/>
     *                                       &lt;choice>
     *                                         &lt;element name="ПрДатаРожд">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
     *                                               &lt;enumeration value="1"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                         &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ДатаДокТип"/>
     *                                       &lt;/choice>
     *                                       &lt;choice>
     *                                         &lt;element name="ПрМестоРожден">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
     *                                               &lt;enumeration value="1"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}МестоТип"/>
     *                                       &lt;/choice>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СНИЛСТип" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;choice>
     *                               &lt;element name="ПрМать">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="СведМать" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведРодитТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрОтец">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="СведОтец" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведРодитТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрСведДокОснОтец">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="СведДокОснОтец" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведДокОснТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрСведДокРод">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="СведДокРод" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведДокТип"/>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведЕГРРазд2Тип" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="РазделЕГР" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
     *                       &lt;enumeration value="1"/>
     *                       &lt;enumeration value="2"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-21" />
     *                 &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-10" />
     *                 &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1_3" />
     *                 &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-4" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ИдДок" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-36" />
     *       &lt;attribute name="РезОбраб" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
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
        "сведРегРожд"
    })
    public static class СведОтветАГС {

        @XmlElement(name = "СведРегРожд", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
        protected List<ROGDINFResponse.СведОтветАГС.СведРегРожд> сведРегРожд;
        @XmlAttribute(name = "ИдДок", required = true)
        protected String идДок;
        @XmlAttribute(name = "РезОбраб", required = true)
        protected String резОбраб;

        /**
         * Gets the value of the сведРегРожд property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the сведРегРожд property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getСведРегРожд().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ROGDINFResponse.СведОтветАГС.СведРегРожд }
         *
         *
         */
        public List<ROGDINFResponse.СведОтветАГС.СведРегРожд> getСведРегРожд() {
            if (сведРегРожд == null) {
                сведРегРожд = new ArrayList<ROGDINFResponse.СведОтветАГС.СведРегРожд>();
            }
            return this.сведРегРожд;
        }

        /**
         * Gets the value of the идДок property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getИдДок() {
            return идДок;
        }

        /**
         * Sets the value of the идДок property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setИдДок(String value) {
            this.идДок = value;
        }

        /**
         * Gets the value of the резОбраб property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getРезОбраб() {
            return резОбраб;
        }

        /**
         * Sets the value of the резОбраб property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setРезОбраб(String value) {
            this.резОбраб = value;
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
         *           &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ДатаДокТип"/>
         *           &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;/choice>
         *         &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ОрганЗАГСТип"/>
         *         &lt;element name="СвидетРожд" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ПрдСведРег">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="ПрСчетМатер">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="СчетМатер" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2"/>
         *                   &lt;/choice>
         *                   &lt;element name="СведРоды" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ЧислоРодДетей" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2"/>
         *                             &lt;choice>
         *                               &lt;element name="ПрСчет">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
         *                                     &lt;enumeration value="1"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="Счет" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2"/>
         *                             &lt;/choice>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="СведРодившемся">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;choice>
         *                               &lt;element name="ПрЖивМертв">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
         *                                     &lt;enumeration value="1"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="ЖивМертв">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
         *                                     &lt;enumeration value="0"/>
         *                                     &lt;enumeration value="1"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                             &lt;/choice>
         *                             &lt;choice>
         *                               &lt;element name="ПрПол">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
         *                                     &lt;enumeration value="1"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="Пол">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
         *                                     &lt;enumeration value="1"/>
         *                                     &lt;enumeration value="2"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                             &lt;/choice>
         *                             &lt;element name="ФИОРожд" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ФИОПрТип"/>
         *                             &lt;choice>
         *                               &lt;element name="ПрДатаРожд">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
         *                                     &lt;enumeration value="1"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                               &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ДатаДокТип"/>
         *                             &lt;/choice>
         *                             &lt;choice>
         *                               &lt;element name="ПрМестоРожден">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
         *                                     &lt;enumeration value="1"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}МестоТип"/>
         *                             &lt;/choice>
         *                           &lt;/sequence>
         *                           &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СНИЛСТип" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;choice>
         *                     &lt;element name="ПрМать">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="СведМать" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведРодитТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрОтец">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="СведОтец" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведРодитТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрСведДокОснОтец">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="СведДокОснОтец" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведДокОснТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрСведДокРод">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="СведДокРод" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведДокТип"/>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведЕГРРазд2Тип" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="РазделЕГР" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
         *             &lt;enumeration value="1"/>
         *             &lt;enumeration value="2"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-21" />
         *       &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-10" />
         *       &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1_3" />
         *       &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-4" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "датаЗаписДок",
            "датаЗапис",
            "органЗАГС",
            "свидетРожд",
            "прдСведРег",
            "сВедЕГРРазд2"
        })
        public static class СведРегРожд {

            @XmlElement(name = "ДатаЗаписДок", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
            protected ДатаДокТип датаЗаписДок;
            @XmlElement(name = "ДатаЗапис", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаЗапис;
            @XmlElement(name = "ОрганЗАГС", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1", required = true)
            protected ОрганЗАГСТип органЗАГС;
            @XmlElement(name = "СвидетРожд", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
            protected List<СведСвидетТип> свидетРожд;
            @XmlElement(name = "ПрдСведРег", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1", required = true)
            protected ROGDINFResponse.СведОтветАГС.СведРегРожд.ПрдСведРег прдСведРег;
            @XmlElement(name = "СВедЕГРРазд2", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
            protected СведЕГРРазд2Тип сВедЕГРРазд2;
            @XmlAttribute(name = "РазделЕГР", required = true)
            protected String разделЕГР;
            @XmlAttribute(name = "НомерЗаписЕГР", required = true)
            protected String номерЗаписЕГР;
            @XmlAttribute(name = "НомАГССвид")
            protected String номАГССвид;
            @XmlAttribute(name = "НомерВерс", required = true)
            protected String номерВерс;
            @XmlAttribute(name = "ДатаВерс", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаВерс;
            @XmlAttribute(name = "КодСостСтат", required = true)
            protected String кодСостСтат;

            /**
             * Gets the value of the датаЗаписДок property.
             *
             * @return
             *     possible object is
             *     {@link ДатаДокТип }
             *
             */
            public ДатаДокТип getДатаЗаписДок() {
                return датаЗаписДок;
            }

            /**
             * Sets the value of the датаЗаписДок property.
             *
             * @param value
             *     allowed object is
             *     {@link ДатаДокТип }
             *
             */
            public void setДатаЗаписДок(ДатаДокТип value) {
                this.датаЗаписДок = value;
            }

            /**
             * Gets the value of the датаЗапис property.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getДатаЗапис() {
                return датаЗапис;
            }

            /**
             * Sets the value of the датаЗапис property.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setДатаЗапис(XMLGregorianCalendar value) {
                this.датаЗапис = value;
            }

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
             * Gets the value of the свидетРожд property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the свидетРожд property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getСвидетРожд().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link СведСвидетТип }
             *
             *
             */
            public List<СведСвидетТип> getСвидетРожд() {
                if (свидетРожд == null) {
                    свидетРожд = new ArrayList<СведСвидетТип>();
                }
                return this.свидетРожд;
            }

            /**
             * Gets the value of the прдСведРег property.
             *
             * @return
             *     possible object is
             *     {@link ROGDINFResponse.СведОтветАГС.СведРегРожд.ПрдСведРег }
             *
             */
            public ROGDINFResponse.СведОтветАГС.СведРегРожд.ПрдСведРег getПрдСведРег() {
                return прдСведРег;
            }

            /**
             * Sets the value of the прдСведРег property.
             *
             * @param value
             *     allowed object is
             *     {@link ROGDINFResponse.СведОтветАГС.СведРегРожд.ПрдСведРег }
             *
             */
            public void setПрдСведРег(ROGDINFResponse.СведОтветАГС.СведРегРожд.ПрдСведРег value) {
                this.прдСведРег = value;
            }

            /**
             * Gets the value of the сВедЕГРРазд2 property.
             *
             * @return
             *     possible object is
             *     {@link СведЕГРРазд2Тип }
             *
             */
            public СведЕГРРазд2Тип getСВедЕГРРазд2() {
                return сВедЕГРРазд2;
            }

            /**
             * Sets the value of the сВедЕГРРазд2 property.
             *
             * @param value
             *     allowed object is
             *     {@link СведЕГРРазд2Тип }
             *
             */
            public void setСВедЕГРРазд2(СведЕГРРазд2Тип value) {
                this.сВедЕГРРазд2 = value;
            }

            /**
             * Gets the value of the разделЕГР property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getРазделЕГР() {
                return разделЕГР;
            }

            /**
             * Sets the value of the разделЕГР property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setРазделЕГР(String value) {
                this.разделЕГР = value;
            }

            /**
             * Gets the value of the номерЗаписЕГР property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getНомерЗаписЕГР() {
                return номерЗаписЕГР;
            }

            /**
             * Sets the value of the номерЗаписЕГР property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setНомерЗаписЕГР(String value) {
                this.номерЗаписЕГР = value;
            }

            /**
             * Gets the value of the номАГССвид property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getНомАГССвид() {
                return номАГССвид;
            }

            /**
             * Sets the value of the номАГССвид property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setНомАГССвид(String value) {
                this.номАГССвид = value;
            }

            /**
             * Gets the value of the номерВерс property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getНомерВерс() {
                return номерВерс;
            }

            /**
             * Sets the value of the номерВерс property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setНомерВерс(String value) {
                this.номерВерс = value;
            }

            /**
             * Gets the value of the датаВерс property.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getДатаВерс() {
                return датаВерс;
            }

            /**
             * Sets the value of the датаВерс property.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setДатаВерс(XMLGregorianCalendar value) {
                this.датаВерс = value;
            }

            /**
             * Gets the value of the кодСостСтат property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getКодСостСтат() {
                return кодСостСтат;
            }

            /**
             * Sets the value of the кодСостСтат property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setКодСостСтат(String value) {
                this.кодСостСтат = value;
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
             *           &lt;element name="ПрСчетМатер">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="СчетМатер" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2"/>
             *         &lt;/choice>
             *         &lt;element name="СведРоды" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ЧислоРодДетей" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2"/>
             *                   &lt;choice>
             *                     &lt;element name="ПрСчет">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
             *                           &lt;enumeration value="1"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="Счет" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2"/>
             *                   &lt;/choice>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="СведРодившемся">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;choice>
             *                     &lt;element name="ПрЖивМертв">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
             *                           &lt;enumeration value="1"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="ЖивМертв">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
             *                           &lt;enumeration value="0"/>
             *                           &lt;enumeration value="1"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                   &lt;/choice>
             *                   &lt;choice>
             *                     &lt;element name="ПрПол">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
             *                           &lt;enumeration value="1"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="Пол">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
             *                           &lt;enumeration value="1"/>
             *                           &lt;enumeration value="2"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                   &lt;/choice>
             *                   &lt;element name="ФИОРожд" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ФИОПрТип"/>
             *                   &lt;choice>
             *                     &lt;element name="ПрДатаРожд">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
             *                           &lt;enumeration value="1"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                     &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ДатаДокТип"/>
             *                   &lt;/choice>
             *                   &lt;choice>
             *                     &lt;element name="ПрМестоРожден">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
             *                           &lt;enumeration value="1"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}МестоТип"/>
             *                   &lt;/choice>
             *                 &lt;/sequence>
             *                 &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СНИЛСТип" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;choice>
             *           &lt;element name="ПрМать">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="СведМать" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведРодитТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрОтец">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="СведОтец" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведРодитТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрСведДокОснОтец">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="СведДокОснОтец" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведДокОснТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрСведДокРод">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="СведДокРод" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СведДокТип"/>
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
                "прСчетМатер",
                "счетМатер",
                "сведРоды",
                "сведРодившемся",
                "прМать",
                "сведМать",
                "прОтец",
                "сведОтец",
                "прСведДокОснОтец",
                "сведДокОснОтец",
                "прСведДокРод",
                "сведДокРод"
            })
            public static class ПрдСведРег {

                @XmlElement(name = "ПрСчетМатер", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                protected String прСчетМатер;
                @XmlElement(name = "СчетМатер", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                protected BigInteger счетМатер;
                @XmlElement(name = "СведРоды", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                protected ROGDINFResponse.СведОтветАГС.СведРегРожд.ПрдСведРег.СведРоды сведРоды;
                @XmlElement(name = "СведРодившемся", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1", required = true)
                protected ROGDINFResponse.СведОтветАГС.СведРегРожд.ПрдСведРег.СведРодившемся сведРодившемся;
                @XmlElement(name = "ПрМать", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                protected String прМать;
                @XmlElement(name = "СведМать", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                protected СведРодитТип сведМать;
                @XmlElement(name = "ПрОтец", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                protected String прОтец;
                @XmlElement(name = "СведОтец", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                protected СведРодитТип сведОтец;
                @XmlElement(name = "ПрСведДокОснОтец", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                protected String прСведДокОснОтец;
                @XmlElement(name = "СведДокОснОтец", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                protected СведДокОснТип сведДокОснОтец;
                @XmlElement(name = "ПрСведДокРод", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                protected String прСведДокРод;
                @XmlElement(name = "СведДокРод", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                protected СведДокТип сведДокРод;

                /**
                 * Gets the value of the прСчетМатер property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрСчетМатер() {
                    return прСчетМатер;
                }

                /**
                 * Sets the value of the прСчетМатер property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрСчетМатер(String value) {
                    this.прСчетМатер = value;
                }

                /**
                 * Gets the value of the счетМатер property.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *
                 */
                public BigInteger getСчетМатер() {
                    return счетМатер;
                }

                /**
                 * Sets the value of the счетМатер property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *
                 */
                public void setСчетМатер(BigInteger value) {
                    this.счетМатер = value;
                }

                /**
                 * Gets the value of the сведРоды property.
                 *
                 * @return
                 *     possible object is
                 *     {@link ROGDINFResponse.СведОтветАГС.СведРегРожд.ПрдСведРег.СведРоды }
                 *
                 */
                public ROGDINFResponse.СведОтветАГС.СведРегРожд.ПрдСведРег.СведРоды getСведРоды() {
                    return сведРоды;
                }

                /**
                 * Sets the value of the сведРоды property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ROGDINFResponse.СведОтветАГС.СведРегРожд.ПрдСведРег.СведРоды }
                 *
                 */
                public void setСведРоды(ROGDINFResponse.СведОтветАГС.СведРегРожд.ПрдСведРег.СведРоды value) {
                    this.сведРоды = value;
                }

                /**
                 * Gets the value of the сведРодившемся property.
                 *
                 * @return
                 *     possible object is
                 *     {@link ROGDINFResponse.СведОтветАГС.СведРегРожд.ПрдСведРег.СведРодившемся }
                 *
                 */
                public ROGDINFResponse.СведОтветАГС.СведРегРожд.ПрдСведРег.СведРодившемся getСведРодившемся() {
                    return сведРодившемся;
                }

                /**
                 * Sets the value of the сведРодившемся property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ROGDINFResponse.СведОтветАГС.СведРегРожд.ПрдСведРег.СведРодившемся }
                 *
                 */
                public void setСведРодившемся(ROGDINFResponse.СведОтветАГС.СведРегРожд.ПрдСведРег.СведРодившемся value) {
                    this.сведРодившемся = value;
                }

                /**
                 * Gets the value of the прМать property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрМать() {
                    return прМать;
                }

                /**
                 * Sets the value of the прМать property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрМать(String value) {
                    this.прМать = value;
                }

                /**
                 * Gets the value of the сведМать property.
                 *
                 * @return
                 *     possible object is
                 *     {@link СведРодитТип }
                 *
                 */
                public СведРодитТип getСведМать() {
                    return сведМать;
                }

                /**
                 * Sets the value of the сведМать property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link СведРодитТип }
                 *
                 */
                public void setСведМать(СведРодитТип value) {
                    this.сведМать = value;
                }

                /**
                 * Gets the value of the прОтец property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрОтец() {
                    return прОтец;
                }

                /**
                 * Sets the value of the прОтец property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрОтец(String value) {
                    this.прОтец = value;
                }

                /**
                 * Gets the value of the сведОтец property.
                 *
                 * @return
                 *     possible object is
                 *     {@link СведРодитТип }
                 *
                 */
                public СведРодитТип getСведОтец() {
                    return сведОтец;
                }

                /**
                 * Sets the value of the сведОтец property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link СведРодитТип }
                 *
                 */
                public void setСведОтец(СведРодитТип value) {
                    this.сведОтец = value;
                }

                /**
                 * Gets the value of the прСведДокОснОтец property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрСведДокОснОтец() {
                    return прСведДокОснОтец;
                }

                /**
                 * Sets the value of the прСведДокОснОтец property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрСведДокОснОтец(String value) {
                    this.прСведДокОснОтец = value;
                }

                /**
                 * Gets the value of the сведДокОснОтец property.
                 *
                 * @return
                 *     possible object is
                 *     {@link СведДокОснТип }
                 *
                 */
                public СведДокОснТип getСведДокОснОтец() {
                    return сведДокОснОтец;
                }

                /**
                 * Sets the value of the сведДокОснОтец property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link СведДокОснТип }
                 *
                 */
                public void setСведДокОснОтец(СведДокОснТип value) {
                    this.сведДокОснОтец = value;
                }

                /**
                 * Gets the value of the прСведДокРод property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрСведДокРод() {
                    return прСведДокРод;
                }

                /**
                 * Sets the value of the прСведДокРод property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрСведДокРод(String value) {
                    this.прСведДокРод = value;
                }

                /**
                 * Gets the value of the сведДокРод property.
                 *
                 * @return
                 *     possible object is
                 *     {@link СведДокТип }
                 *
                 */
                public СведДокТип getСведДокРод() {
                    return сведДокРод;
                }

                /**
                 * Sets the value of the сведДокРод property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link СведДокТип }
                 *
                 */
                public void setСведДокРод(СведДокТип value) {
                    this.сведДокРод = value;
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
                 *           &lt;element name="ПрЖивМертв">
                 *             &lt;simpleType>
                 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
                 *                 &lt;enumeration value="1"/>
                 *               &lt;/restriction>
                 *             &lt;/simpleType>
                 *           &lt;/element>
                 *           &lt;element name="ЖивМертв">
                 *             &lt;simpleType>
                 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
                 *                 &lt;enumeration value="0"/>
                 *                 &lt;enumeration value="1"/>
                 *               &lt;/restriction>
                 *             &lt;/simpleType>
                 *           &lt;/element>
                 *         &lt;/choice>
                 *         &lt;choice>
                 *           &lt;element name="ПрПол">
                 *             &lt;simpleType>
                 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
                 *                 &lt;enumeration value="1"/>
                 *               &lt;/restriction>
                 *             &lt;/simpleType>
                 *           &lt;/element>
                 *           &lt;element name="Пол">
                 *             &lt;simpleType>
                 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
                 *                 &lt;enumeration value="1"/>
                 *                 &lt;enumeration value="2"/>
                 *               &lt;/restriction>
                 *             &lt;/simpleType>
                 *           &lt;/element>
                 *         &lt;/choice>
                 *         &lt;element name="ФИОРожд" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ФИОПрТип"/>
                 *         &lt;choice>
                 *           &lt;element name="ПрДатаРожд">
                 *             &lt;simpleType>
                 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
                 *                 &lt;enumeration value="1"/>
                 *               &lt;/restriction>
                 *             &lt;/simpleType>
                 *           &lt;/element>
                 *           &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *           &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ДатаДокТип"/>
                 *         &lt;/choice>
                 *         &lt;choice>
                 *           &lt;element name="ПрМестоРожден">
                 *             &lt;simpleType>
                 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
                 *                 &lt;enumeration value="1"/>
                 *               &lt;/restriction>
                 *             &lt;/simpleType>
                 *           &lt;/element>
                 *           &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}МестоТип"/>
                 *         &lt;/choice>
                 *       &lt;/sequence>
                 *       &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СНИЛСТип" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "прЖивМертв",
                    "живМертв",
                    "прПол",
                    "пол",
                    "фиоРожд",
                    "прДатаРожд",
                    "датаРождКаленд",
                    "датаРождДок",
                    "прМестоРожден",
                    "местоРожден"
                })
                public static class СведРодившемся {

                    @XmlElement(name = "ПрЖивМертв", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                    protected String прЖивМертв;
                    @XmlElement(name = "ЖивМертв", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                    protected String живМертв;
                    @XmlElement(name = "ПрПол", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                    protected String прПол;
                    @XmlElement(name = "Пол", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                    protected String пол;
                    @XmlElement(name = "ФИОРожд", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1", required = true)
                    protected ФИОПрТип фиоРожд;
                    @XmlElement(name = "ПрДатаРожд", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                    protected String прДатаРожд;
                    @XmlElement(name = "ДатаРождКаленд", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar датаРождКаленд;
                    @XmlElement(name = "ДатаРождДок", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                    protected ДатаДокТип датаРождДок;
                    @XmlElement(name = "ПрМестоРожден", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                    protected String прМестоРожден;
                    @XmlElement(name = "МестоРожден", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                    protected МестоТип местоРожден;
                    @XmlAttribute(name = "СНИЛС")
                    protected String снилс;

                    /**
                     * Gets the value of the прЖивМертв property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getПрЖивМертв() {
                        return прЖивМертв;
                    }

                    /**
                     * Sets the value of the прЖивМертв property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setПрЖивМертв(String value) {
                        this.прЖивМертв = value;
                    }

                    /**
                     * Gets the value of the живМертв property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getЖивМертв() {
                        return живМертв;
                    }

                    /**
                     * Sets the value of the живМертв property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setЖивМертв(String value) {
                        this.живМертв = value;
                    }

                    /**
                     * Gets the value of the прПол property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getПрПол() {
                        return прПол;
                    }

                    /**
                     * Sets the value of the прПол property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setПрПол(String value) {
                        this.прПол = value;
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
                     * Gets the value of the фиоРожд property.
                     *
                     * @return
                     *     possible object is
                     *     {@link ФИОПрТип }
                     *
                     */
                    public ФИОПрТип getФИОРожд() {
                        return фиоРожд;
                    }

                    /**
                     * Sets the value of the фиоРожд property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link ФИОПрТип }
                     *
                     */
                    public void setФИОРожд(ФИОПрТип value) {
                        this.фиоРожд = value;
                    }

                    /**
                     * Gets the value of the прДатаРожд property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getПрДатаРожд() {
                        return прДатаРожд;
                    }

                    /**
                     * Sets the value of the прДатаРожд property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setПрДатаРожд(String value) {
                        this.прДатаРожд = value;
                    }

                    /**
                     * Gets the value of the датаРождКаленд property.
                     *
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public XMLGregorianCalendar getДатаРождКаленд() {
                        return датаРождКаленд;
                    }

                    /**
                     * Sets the value of the датаРождКаленд property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *
                     */
                    public void setДатаРождКаленд(XMLGregorianCalendar value) {
                        this.датаРождКаленд = value;
                    }

                    /**
                     * Gets the value of the датаРождДок property.
                     *
                     * @return
                     *     possible object is
                     *     {@link ДатаДокТип }
                     *
                     */
                    public ДатаДокТип getДатаРождДок() {
                        return датаРождДок;
                    }

                    /**
                     * Sets the value of the датаРождДок property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link ДатаДокТип }
                     *
                     */
                    public void setДатаРождДок(ДатаДокТип value) {
                        this.датаРождДок = value;
                    }

                    /**
                     * Gets the value of the прМестоРожден property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getПрМестоРожден() {
                        return прМестоРожден;
                    }

                    /**
                     * Sets the value of the прМестоРожден property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setПрМестоРожден(String value) {
                        this.прМестоРожден = value;
                    }

                    /**
                     * Gets the value of the местоРожден property.
                     *
                     * @return
                     *     possible object is
                     *     {@link МестоТип }
                     *
                     */
                    public МестоТип getМестоРожден() {
                        return местоРожден;
                    }

                    /**
                     * Sets the value of the местоРожден property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link МестоТип }
                     *
                     */
                    public void setМестоРожден(МестоТип value) {
                        this.местоРожден = value;
                    }

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
                 *         &lt;element name="ЧислоРодДетей" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2"/>
                 *         &lt;choice>
                 *           &lt;element name="ПрСчет">
                 *             &lt;simpleType>
                 *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
                 *                 &lt;enumeration value="1"/>
                 *               &lt;/restriction>
                 *             &lt;/simpleType>
                 *           &lt;/element>
                 *           &lt;element name="Счет" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2"/>
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
                    "числоРодДетей",
                    "прСчет",
                    "счет"
                })
                public static class СведРоды {

                    @XmlElement(name = "ЧислоРодДетей", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1", required = true)
                    protected BigInteger числоРодДетей;
                    @XmlElement(name = "ПрСчет", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                    protected String прСчет;
                    @XmlElement(name = "Счет", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
                    protected BigInteger счет;

                    /**
                     * Gets the value of the числоРодДетей property.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *
                     */
                    public BigInteger getЧислоРодДетей() {
                        return числоРодДетей;
                    }

                    /**
                     * Sets the value of the числоРодДетей property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *
                     */
                    public void setЧислоРодДетей(BigInteger value) {
                        this.числоРодДетей = value;
                    }

                    /**
                     * Gets the value of the прСчет property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getПрСчет() {
                        return прСчет;
                    }

                    /**
                     * Sets the value of the прСчет property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setПрСчет(String value) {
                        this.прСчет = value;
                    }

                    /**
                     * Gets the value of the счет property.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *
                     */
                    public BigInteger getСчет() {
                        return счет;
                    }

                    /**
                     * Sets the value of the счет property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *
                     */
                    public void setСчет(BigInteger value) {
                        this.счет = value;
                    }

                }

            }

        }

    }

}
