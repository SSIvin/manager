
package smev.ElementServices.ZagsRename;

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
 *                   &lt;element name="СведРегПерИмя" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                               &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ДатаДокТип"/>
 *                             &lt;/choice>
 *                             &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ОрганЗАГСТип"/>
 *                             &lt;element name="СвидетПерИмя" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ПрдСведРег">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;sequence>
 *                                         &lt;choice>
 *                                           &lt;element name="ПрГражданство">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
 *                                                 &lt;enumeration value="1"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="ГраждТекст" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-255"/>
 *                                           &lt;element name="ГраждОКСМ" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ОКСМТип"/>
 *                                         &lt;/choice>
 *                                         &lt;element name="ФИОДо" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ФИОПрТип"/>
 *                                         &lt;element name="ФИОПосле" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ФИОПрТип"/>
 *                                       &lt;/sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрДатаРожд">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ДатаДокТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрМестоРожден">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}МестоТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрАдрМЖ">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="АдрМЖ" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}АдрМЖТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрУдЛичнФЛ">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}УдЛичнФЛПрТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрСведРегРожд">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="СведРегРожд" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}СведДокОснТип"/>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}СНИЛСТип" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}СведЕГРРазд2Тип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="РазделЕГР" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
 *                                 &lt;enumeration value="1"/>
 *                                 &lt;enumeration value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-21" />
 *                           &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-10" />
 *                           &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1_3" />
 *                           &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-4" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ИдДок" use="required" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-36" />
 *                 &lt;attribute name="РезОбраб" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
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
 *       &lt;attribute name="ИдЗапрос" use="required" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ИдЗапросТип" />
 *       &lt;attribute name="ДатаСвед" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="КолДок" use="required" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}number-2" />
 *       &lt;attribute name="ТипАГСЗапрос" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-2">
 *             &lt;enumeration value="06"/>
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
@XmlRootElement(name = "PERNAMEINFResponse", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
public class PERNAMEINFResponse {

    @XmlElement(name = "СведОтветАГС", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0", required = true)
    protected List<PERNAMEINFResponse.СведОтветАГС> сведОтветАГС;
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
     * {@link PERNAMEINFResponse.СведОтветАГС }
     *
     *
     */
    public List<PERNAMEINFResponse.СведОтветАГС> getСведОтветАГС() {
        if (сведОтветАГС == null) {
            сведОтветАГС = new ArrayList<PERNAMEINFResponse.СведОтветАГС>();
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
     *         &lt;element name="СведРегПерИмя" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                     &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ДатаДокТип"/>
     *                   &lt;/choice>
     *                   &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ОрганЗАГСТип"/>
     *                   &lt;element name="СвидетПерИмя" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ПрдСведРег">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;sequence>
     *                               &lt;choice>
     *                                 &lt;element name="ПрГражданство">
     *                                   &lt;simpleType>
     *                                     &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
     *                                       &lt;enumeration value="1"/>
     *                                     &lt;/restriction>
     *                                   &lt;/simpleType>
     *                                 &lt;/element>
     *                                 &lt;element name="ГраждТекст" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-255"/>
     *                                 &lt;element name="ГраждОКСМ" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ОКСМТип"/>
     *                               &lt;/choice>
     *                               &lt;element name="ФИОДо" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ФИОПрТип"/>
     *                               &lt;element name="ФИОПосле" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ФИОПрТип"/>
     *                             &lt;/sequence>
     *                             &lt;choice>
     *                               &lt;element name="ПрДатаРожд">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ДатаДокТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрМестоРожден">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}МестоТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрАдрМЖ">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="АдрМЖ" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}АдрМЖТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрУдЛичнФЛ">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}УдЛичнФЛПрТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрСведРегРожд">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="СведРегРожд" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}СведДокОснТип"/>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                           &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}СНИЛСТип" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}СведЕГРРазд2Тип" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="РазделЕГР" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
     *                       &lt;enumeration value="1"/>
     *                       &lt;enumeration value="2"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-21" />
     *                 &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-10" />
     *                 &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1_3" />
     *                 &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-4" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ИдДок" use="required" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-36" />
     *       &lt;attribute name="РезОбраб" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
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
        "сведРегПерИмя"
    })
    public static class СведОтветАГС {

        @XmlElement(name = "СведРегПерИмя", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
        protected List<PERNAMEINFResponse.СведОтветАГС.СведРегПерИмя> сведРегПерИмя;
        @XmlAttribute(name = "ИдДок", required = true)
        protected String идДок;
        @XmlAttribute(name = "РезОбраб", required = true)
        protected String резОбраб;

        /**
         * Gets the value of the сведРегПерИмя property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the сведРегПерИмя property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getСведРегПерИмя().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PERNAMEINFResponse.СведОтветАГС.СведРегПерИмя }
         *
         *
         */
        public List<PERNAMEINFResponse.СведОтветАГС.СведРегПерИмя> getСведРегПерИмя() {
            if (сведРегПерИмя == null) {
                сведРегПерИмя = new ArrayList<PERNAMEINFResponse.СведОтветАГС.СведРегПерИмя>();
            }
            return this.сведРегПерИмя;
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
         *           &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *           &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ДатаДокТип"/>
         *         &lt;/choice>
         *         &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ОрганЗАГСТип"/>
         *         &lt;element name="СвидетПерИмя" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ПрдСведРег">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;sequence>
         *                     &lt;choice>
         *                       &lt;element name="ПрГражданство">
         *                         &lt;simpleType>
         *                           &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
         *                             &lt;enumeration value="1"/>
         *                           &lt;/restriction>
         *                         &lt;/simpleType>
         *                       &lt;/element>
         *                       &lt;element name="ГраждТекст" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-255"/>
         *                       &lt;element name="ГраждОКСМ" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ОКСМТип"/>
         *                     &lt;/choice>
         *                     &lt;element name="ФИОДо" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ФИОПрТип"/>
         *                     &lt;element name="ФИОПосле" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ФИОПрТип"/>
         *                   &lt;/sequence>
         *                   &lt;choice>
         *                     &lt;element name="ПрДатаРожд">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                     &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ДатаДокТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрМестоРожден">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}МестоТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрАдрМЖ">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="АдрМЖ" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}АдрМЖТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрУдЛичнФЛ">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}УдЛичнФЛПрТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрСведРегРожд">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="СведРегРожд" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}СведДокОснТип"/>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *                 &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}СНИЛСТип" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}СведЕГРРазд2Тип" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="РазделЕГР" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
         *             &lt;enumeration value="1"/>
         *             &lt;enumeration value="2"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-21" />
         *       &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-10" />
         *       &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1_3" />
         *       &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-4" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "датаЗапис",
            "датаЗаписДок",
            "органЗАГС",
            "свидетПерИмя",
            "прдСведРег",
            "сВедЕГРРазд2"
        })
        public static class СведРегПерИмя {

            @XmlElement(name = "ДатаЗапис", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаЗапис;
            @XmlElement(name = "ДатаЗаписДок", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
            protected ДатаДокТип датаЗаписДок;
            @XmlElement(name = "ОрганЗАГС", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0", required = true)
            protected ОрганЗАГСТип органЗАГС;
            @XmlElement(name = "СвидетПерИмя", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
            protected List<СведСвидетТип> свидетПерИмя;
            @XmlElement(name = "ПрдСведРег", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0", required = true)
            protected PERNAMEINFResponse.СведОтветАГС.СведРегПерИмя.ПрдСведРег прдСведРег;
            @XmlElement(name = "СВедЕГРРазд2", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
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
             * Gets the value of the свидетПерИмя property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the свидетПерИмя property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getСвидетПерИмя().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link СведСвидетТип }
             *
             *
             */
            public List<СведСвидетТип> getСвидетПерИмя() {
                if (свидетПерИмя == null) {
                    свидетПерИмя = new ArrayList<СведСвидетТип>();
                }
                return this.свидетПерИмя;
            }

            /**
             * Gets the value of the прдСведРег property.
             *
             * @return
             *     possible object is
             *     {@link PERNAMEINFResponse.СведОтветАГС.СведРегПерИмя.ПрдСведРег }
             *
             */
            public PERNAMEINFResponse.СведОтветАГС.СведРегПерИмя.ПрдСведРег getПрдСведРег() {
                return прдСведРег;
            }

            /**
             * Sets the value of the прдСведРег property.
             *
             * @param value
             *     allowed object is
             *     {@link PERNAMEINFResponse.СведОтветАГС.СведРегПерИмя.ПрдСведРег }
             *
             */
            public void setПрдСведРег(PERNAMEINFResponse.СведОтветАГС.СведРегПерИмя.ПрдСведРег value) {
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
             *         &lt;sequence>
             *           &lt;choice>
             *             &lt;element name="ПрГражданство">
             *               &lt;simpleType>
             *                 &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
             *                   &lt;enumeration value="1"/>
             *                 &lt;/restriction>
             *               &lt;/simpleType>
             *             &lt;/element>
             *             &lt;element name="ГраждТекст" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-255"/>
             *             &lt;element name="ГраждОКСМ" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ОКСМТип"/>
             *           &lt;/choice>
             *           &lt;element name="ФИОДо" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ФИОПрТип"/>
             *           &lt;element name="ФИОПосле" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ФИОПрТип"/>
             *         &lt;/sequence>
             *         &lt;choice>
             *           &lt;element name="ПрДатаРожд">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *           &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}ДатаДокТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрМестоРожден">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}МестоТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрАдрМЖ">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="АдрМЖ" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}АдрМЖТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрУдЛичнФЛ">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}УдЛичнФЛПрТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрСведРегРожд">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-pernameinf/types/4.0.0}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="СведРегРожд" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}СведДокОснТип"/>
             *         &lt;/choice>
             *       &lt;/sequence>
             *       &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-pernameinf/types/4.0.0}СНИЛСТип" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "прГражданство",
                "граждТекст",
                "граждОКСМ",
                "фиоДо",
                "фиоПосле",
                "прДатаРожд",
                "датаРождКаленд",
                "датаРождДок",
                "прМестоРожден",
                "местоРожден",
                "прАдрМЖ",
                "адрМЖ",
                "прУдЛичнФЛ",
                "удЛичнФЛ",
                "прСведРегРожд",
                "сведРегРожд"
            })
            public static class ПрдСведРег {

                @XmlElement(name = "ПрГражданство", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
                protected String прГражданство;
                @XmlElement(name = "ГраждТекст", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
                protected String граждТекст;
                @XmlElement(name = "ГраждОКСМ", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
                protected String граждОКСМ;
                @XmlElement(name = "ФИОДо", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0", required = true)
                protected ФИОПрТип фиоДо;
                @XmlElement(name = "ФИОПосле", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0", required = true)
                protected ФИОПрТип фиоПосле;
                @XmlElement(name = "ПрДатаРожд", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
                protected String прДатаРожд;
                @XmlElement(name = "ДатаРождКаленд", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar датаРождКаленд;
                @XmlElement(name = "ДатаРождДок", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
                protected ДатаДокТип датаРождДок;
                @XmlElement(name = "ПрМестоРожден", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
                protected String прМестоРожден;
                @XmlElement(name = "МестоРожден", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
                protected МестоТип местоРожден;
                @XmlElement(name = "ПрАдрМЖ", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
                protected String прАдрМЖ;
                @XmlElement(name = "АдрМЖ", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
                protected АдрМЖТип адрМЖ;
                @XmlElement(name = "ПрУдЛичнФЛ", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
                protected String прУдЛичнФЛ;
                @XmlElement(name = "УдЛичнФЛ", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
                protected УдЛичнФЛПрТип удЛичнФЛ;
                @XmlElement(name = "ПрСведРегРожд", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
                protected String прСведРегРожд;
                @XmlElement(name = "СведРегРожд", namespace = "urn://x-artefacts-zags-pernameinf/root/112-53/4.0.0")
                protected СведДокОснТип сведРегРожд;
                @XmlAttribute(name = "СНИЛС")
                protected String снилс;

                /**
                 * Gets the value of the прГражданство property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрГражданство() {
                    return прГражданство;
                }

                /**
                 * Sets the value of the прГражданство property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрГражданство(String value) {
                    this.прГражданство = value;
                }

                /**
                 * Gets the value of the граждТекст property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getГраждТекст() {
                    return граждТекст;
                }

                /**
                 * Sets the value of the граждТекст property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setГраждТекст(String value) {
                    this.граждТекст = value;
                }

                /**
                 * Gets the value of the граждОКСМ property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getГраждОКСМ() {
                    return граждОКСМ;
                }

                /**
                 * Sets the value of the граждОКСМ property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setГраждОКСМ(String value) {
                    this.граждОКСМ = value;
                }

                /**
                 * Gets the value of the фиоДо property.
                 *
                 * @return
                 *     possible object is
                 *     {@link ФИОПрТип }
                 *
                 */
                public ФИОПрТип getФИОДо() {
                    return фиоДо;
                }

                /**
                 * Sets the value of the фиоДо property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ФИОПрТип }
                 *
                 */
                public void setФИОДо(ФИОПрТип value) {
                    this.фиоДо = value;
                }

                /**
                 * Gets the value of the фиоПосле property.
                 *
                 * @return
                 *     possible object is
                 *     {@link ФИОПрТип }
                 *
                 */
                public ФИОПрТип getФИОПосле() {
                    return фиоПосле;
                }

                /**
                 * Sets the value of the фиоПосле property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ФИОПрТип }
                 *
                 */
                public void setФИОПосле(ФИОПрТип value) {
                    this.фиоПосле = value;
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
                 * Gets the value of the прАдрМЖ property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрАдрМЖ() {
                    return прАдрМЖ;
                }

                /**
                 * Sets the value of the прАдрМЖ property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрАдрМЖ(String value) {
                    this.прАдрМЖ = value;
                }

                /**
                 * Gets the value of the адрМЖ property.
                 *
                 * @return
                 *     possible object is
                 *     {@link АдрМЖТип }
                 *
                 */
                public АдрМЖТип getАдрМЖ() {
                    return адрМЖ;
                }

                /**
                 * Sets the value of the адрМЖ property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link АдрМЖТип }
                 *
                 */
                public void setАдрМЖ(АдрМЖТип value) {
                    this.адрМЖ = value;
                }

                /**
                 * Gets the value of the прУдЛичнФЛ property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрУдЛичнФЛ() {
                    return прУдЛичнФЛ;
                }

                /**
                 * Sets the value of the прУдЛичнФЛ property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрУдЛичнФЛ(String value) {
                    this.прУдЛичнФЛ = value;
                }

                /**
                 * Gets the value of the удЛичнФЛ property.
                 *
                 * @return
                 *     possible object is
                 *     {@link УдЛичнФЛПрТип }
                 *
                 */
                public УдЛичнФЛПрТип getУдЛичнФЛ() {
                    return удЛичнФЛ;
                }

                /**
                 * Sets the value of the удЛичнФЛ property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link УдЛичнФЛПрТип }
                 *
                 */
                public void setУдЛичнФЛ(УдЛичнФЛПрТип value) {
                    this.удЛичнФЛ = value;
                }

                /**
                 * Gets the value of the прСведРегРожд property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрСведРегРожд() {
                    return прСведРегРожд;
                }

                /**
                 * Sets the value of the прСведРегРожд property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрСведРегРожд(String value) {
                    this.прСведРегРожд = value;
                }

                /**
                 * Gets the value of the сведРегРожд property.
                 *
                 * @return
                 *     possible object is
                 *     {@link СведДокОснТип }
                 *
                 */
                public СведДокОснТип getСведРегРожд() {
                    return сведРегРожд;
                }

                /**
                 * Sets the value of the сведРегРожд property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link СведДокОснТип }
                 *
                 */
                public void setСведРегРожд(СведДокОснТип value) {
                    this.сведРегРожд = value;
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

        }

    }

}
