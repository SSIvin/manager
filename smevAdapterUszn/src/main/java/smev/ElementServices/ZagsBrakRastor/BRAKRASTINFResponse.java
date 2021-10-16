
package smev.ElementServices.ZagsBrakRastor;

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
 *                   &lt;element name="СведРегРастБрак" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                               &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ДатаДокТип"/>
 *                             &lt;/choice>
 *                             &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ОрганЗАГСТип"/>
 *                             &lt;element name="СвидетРастБрак" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ПрдСведРег">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Супруг" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СупругТип"/>
 *                                       &lt;element name="Супруга" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СупругТип"/>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрДатаПрекБрак">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="ДатаПрекрБрак" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         &lt;element name="ДатаПрекрБракДок" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ДатаДокТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрСведДокЗаклБрак">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="СведДокЗаклБрак" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СведДокОснТип"/>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СведЕГРРазд2Тип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="РазделЕГР" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
 *                                 &lt;enumeration value="1"/>
 *                                 &lt;enumeration value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-21" />
 *                           &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-10" />
 *                           &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1_3" />
 *                           &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-4" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ИдДок" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-36" />
 *                 &lt;attribute name="РезОбраб" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
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
 *       &lt;attribute name="ИдЗапрос" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ИдЗапросТип" />
 *       &lt;attribute name="КолДок" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}number-2" />
 *       &lt;attribute name="ДатаСвед" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ТипАГСЗапрос" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-2">
 *             &lt;enumeration value="03"/>
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
@XmlRootElement(name = "BRAKRASTINFResponse", namespace = "urn://x-artefacts-zags-brakrastinf/root/112-55/4.0.0")
public class BRAKRASTINFResponse {

    @XmlElement(name = "СведОтветАГС", namespace = "urn://x-artefacts-zags-brakrastinf/root/112-55/4.0.0", required = true)
    protected List<BRAKRASTINFResponse.СведОтветАГС> сведОтветАГС;
    @XmlAttribute(name = "ИдЗапрос", required = true)
    protected String идЗапрос;
    @XmlAttribute(name = "КолДок", required = true)
    protected BigInteger колДок;
    @XmlAttribute(name = "ДатаСвед", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаСвед;
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
     * {@link BRAKRASTINFResponse.СведОтветАГС }
     *
     *
     */
    public List<BRAKRASTINFResponse.СведОтветАГС> getСведОтветАГС() {
        if (сведОтветАГС == null) {
            сведОтветАГС = new ArrayList<BRAKRASTINFResponse.СведОтветАГС>();
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
     *         &lt;element name="СведРегРастБрак" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                     &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ДатаДокТип"/>
     *                   &lt;/choice>
     *                   &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ОрганЗАГСТип"/>
     *                   &lt;element name="СвидетРастБрак" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ПрдСведРег">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Супруг" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СупругТип"/>
     *                             &lt;element name="Супруга" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СупругТип"/>
     *                             &lt;choice>
     *                               &lt;element name="ПрДатаПрекБрак">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="ДатаПрекрБрак" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               &lt;element name="ДатаПрекрБракДок" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ДатаДокТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрСведДокЗаклБрак">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="СведДокЗаклБрак" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СведДокОснТип"/>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СведЕГРРазд2Тип" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="РазделЕГР" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
     *                       &lt;enumeration value="1"/>
     *                       &lt;enumeration value="2"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-21" />
     *                 &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-10" />
     *                 &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1_3" />
     *                 &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-4" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ИдДок" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-36" />
     *       &lt;attribute name="РезОбраб" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
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
        "сведРегРастБрак"
    })
    public static class СведОтветАГС {

        @XmlElement(name = "СведРегРастБрак", namespace = "urn://x-artefacts-zags-brakrastinf/root/112-55/4.0.0")
        protected List<BRAKRASTINFResponse.СведОтветАГС.СведРегРастБрак> сведРегРастБрак;
        @XmlAttribute(name = "ИдДок", required = true)
        protected String идДок;
        @XmlAttribute(name = "РезОбраб", required = true)
        protected String резОбраб;

        /**
         * Gets the value of the сведРегРастБрак property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the сведРегРастБрак property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getСведРегРастБрак().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BRAKRASTINFResponse.СведОтветАГС.СведРегРастБрак }
         *
         *
         */
        public List<BRAKRASTINFResponse.СведОтветАГС.СведРегРастБрак> getСведРегРастБрак() {
            if (сведРегРастБрак == null) {
                сведРегРастБрак = new ArrayList<BRAKRASTINFResponse.СведОтветАГС.СведРегРастБрак>();
            }
            return this.сведРегРастБрак;
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
         *           &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ДатаДокТип"/>
         *         &lt;/choice>
         *         &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ОрганЗАГСТип"/>
         *         &lt;element name="СвидетРастБрак" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ПрдСведРег">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Супруг" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СупругТип"/>
         *                   &lt;element name="Супруга" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СупругТип"/>
         *                   &lt;choice>
         *                     &lt;element name="ПрДатаПрекБрак">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="ДатаПрекрБрак" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                     &lt;element name="ДатаПрекрБракДок" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ДатаДокТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрСведДокЗаклБрак">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="СведДокЗаклБрак" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СведДокОснТип"/>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СведЕГРРазд2Тип" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="РазделЕГР" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
         *             &lt;enumeration value="1"/>
         *             &lt;enumeration value="2"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-21" />
         *       &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-10" />
         *       &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1_3" />
         *       &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-4" />
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
            "свидетРастБрак",
            "прдСведРег",
            "сВедЕГРРазд2"
        })
        public static class СведРегРастБрак {

            @XmlElement(name = "ДатаЗапис", namespace = "urn://x-artefacts-zags-brakrastinf/root/112-55/4.0.0")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаЗапис;
            @XmlElement(name = "ДатаЗаписДок", namespace = "urn://x-artefacts-zags-brakrastinf/root/112-55/4.0.0")
            protected ДатаДокТип датаЗаписДок;
            @XmlElement(name = "ОрганЗАГС", namespace = "urn://x-artefacts-zags-brakrastinf/root/112-55/4.0.0", required = true)
            protected ОрганЗАГСТип органЗАГС;
            @XmlElement(name = "СвидетРастБрак", namespace = "urn://x-artefacts-zags-brakrastinf/root/112-55/4.0.0")
            protected List<СведСвидетТип> свидетРастБрак;
            @XmlElement(name = "ПрдСведРег", namespace = "urn://x-artefacts-zags-brakrastinf/root/112-55/4.0.0", required = true)
            protected BRAKRASTINFResponse.СведОтветАГС.СведРегРастБрак.ПрдСведРег прдСведРег;
            @XmlElement(name = "СВедЕГРРазд2", namespace = "urn://x-artefacts-zags-brakrastinf/root/112-55/4.0.0")
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
             * Gets the value of the свидетРастБрак property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the свидетРастБрак property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getСвидетРастБрак().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link СведСвидетТип }
             *
             *
             */
            public List<СведСвидетТип> getСвидетРастБрак() {
                if (свидетРастБрак == null) {
                    свидетРастБрак = new ArrayList<СведСвидетТип>();
                }
                return this.свидетРастБрак;
            }

            /**
             * Gets the value of the прдСведРег property.
             *
             * @return
             *     possible object is
             *     {@link BRAKRASTINFResponse.СведОтветАГС.СведРегРастБрак.ПрдСведРег }
             *
             */
            public BRAKRASTINFResponse.СведОтветАГС.СведРегРастБрак.ПрдСведРег getПрдСведРег() {
                return прдСведРег;
            }

            /**
             * Sets the value of the прдСведРег property.
             *
             * @param value
             *     allowed object is
             *     {@link BRAKRASTINFResponse.СведОтветАГС.СведРегРастБрак.ПрдСведРег }
             *
             */
            public void setПрдСведРег(BRAKRASTINFResponse.СведОтветАГС.СведРегРастБрак.ПрдСведРег value) {
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
             *         &lt;element name="Супруг" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СупругТип"/>
             *         &lt;element name="Супруга" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СупругТип"/>
             *         &lt;choice>
             *           &lt;element name="ПрДатаПрекБрак">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="ДатаПрекрБрак" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *           &lt;element name="ДатаПрекрБракДок" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ДатаДокТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрСведДокЗаклБрак">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="СведДокЗаклБрак" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СведДокОснТип"/>
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
                "супруг",
                "супруга",
                "прДатаПрекБрак",
                "датаПрекрБрак",
                "датаПрекрБракДок",
                "прСведДокЗаклБрак",
                "сведДокЗаклБрак"
            })
            public static class ПрдСведРег {

                @XmlElement(name = "Супруг", namespace = "urn://x-artefacts-zags-brakrastinf/root/112-55/4.0.0", required = true)
                protected СупругТип супруг;
                @XmlElement(name = "Супруга", namespace = "urn://x-artefacts-zags-brakrastinf/root/112-55/4.0.0", required = true)
                protected СупругТип супруга;
                @XmlElement(name = "ПрДатаПрекБрак", namespace = "urn://x-artefacts-zags-brakrastinf/root/112-55/4.0.0")
                protected String прДатаПрекБрак;
                @XmlElement(name = "ДатаПрекрБрак", namespace = "urn://x-artefacts-zags-brakrastinf/root/112-55/4.0.0")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar датаПрекрБрак;
                @XmlElement(name = "ДатаПрекрБракДок", namespace = "urn://x-artefacts-zags-brakrastinf/root/112-55/4.0.0")
                protected ДатаДокТип датаПрекрБракДок;
                @XmlElement(name = "ПрСведДокЗаклБрак", namespace = "urn://x-artefacts-zags-brakrastinf/root/112-55/4.0.0")
                protected String прСведДокЗаклБрак;
                @XmlElement(name = "СведДокЗаклБрак", namespace = "urn://x-artefacts-zags-brakrastinf/root/112-55/4.0.0")
                protected СведДокОснТип сведДокЗаклБрак;

                /**
                 * Gets the value of the супруг property.
                 *
                 * @return
                 *     possible object is
                 *     {@link СупругТип }
                 *
                 */
                public СупругТип getСупруг() {
                    return супруг;
                }

                /**
                 * Sets the value of the супруг property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link СупругТип }
                 *
                 */
                public void setСупруг(СупругТип value) {
                    this.супруг = value;
                }

                /**
                 * Gets the value of the супруга property.
                 *
                 * @return
                 *     possible object is
                 *     {@link СупругТип }
                 *
                 */
                public СупругТип getСупруга() {
                    return супруга;
                }

                /**
                 * Sets the value of the супруга property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link СупругТип }
                 *
                 */
                public void setСупруга(СупругТип value) {
                    this.супруга = value;
                }

                /**
                 * Gets the value of the прДатаПрекБрак property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрДатаПрекБрак() {
                    return прДатаПрекБрак;
                }

                /**
                 * Sets the value of the прДатаПрекБрак property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрДатаПрекБрак(String value) {
                    this.прДатаПрекБрак = value;
                }

                /**
                 * Gets the value of the датаПрекрБрак property.
                 *
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getДатаПрекрБрак() {
                    return датаПрекрБрак;
                }

                /**
                 * Sets the value of the датаПрекрБрак property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public void setДатаПрекрБрак(XMLGregorianCalendar value) {
                    this.датаПрекрБрак = value;
                }

                /**
                 * Gets the value of the датаПрекрБракДок property.
                 *
                 * @return
                 *     possible object is
                 *     {@link ДатаДокТип }
                 *
                 */
                public ДатаДокТип getДатаПрекрБракДок() {
                    return датаПрекрБракДок;
                }

                /**
                 * Sets the value of the датаПрекрБракДок property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ДатаДокТип }
                 *
                 */
                public void setДатаПрекрБракДок(ДатаДокТип value) {
                    this.датаПрекрБракДок = value;
                }

                /**
                 * Gets the value of the прСведДокЗаклБрак property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрСведДокЗаклБрак() {
                    return прСведДокЗаклБрак;
                }

                /**
                 * Sets the value of the прСведДокЗаклБрак property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрСведДокЗаклБрак(String value) {
                    this.прСведДокЗаклБрак = value;
                }

                /**
                 * Gets the value of the сведДокЗаклБрак property.
                 *
                 * @return
                 *     possible object is
                 *     {@link СведДокОснТип }
                 *
                 */
                public СведДокОснТип getСведДокЗаклБрак() {
                    return сведДокЗаклБрак;
                }

                /**
                 * Sets the value of the сведДокЗаклБрак property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link СведДокОснТип }
                 *
                 */
                public void setСведДокЗаклБрак(СведДокОснТип value) {
                    this.сведДокЗаклБрак = value;
                }

            }

        }

    }

}
