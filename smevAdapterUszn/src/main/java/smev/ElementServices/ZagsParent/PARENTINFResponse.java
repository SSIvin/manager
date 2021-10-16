
package smev.ElementServices.ZagsParent;

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
 *                   &lt;element name="СведРегОтцов" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ДатаДокТип"/>
 *                               &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;/choice>
 *                             &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ОрганЗАГСТип"/>
 *                             &lt;element name="СвидетРегОтцов" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ПрдСведРег">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="СведРебенок">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;choice>
 *                                                   &lt;element name="ПрПол">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
 *                                                         &lt;enumeration value="1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="Пол">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
 *                                                         &lt;enumeration value="1"/>
 *                                                         &lt;enumeration value="2"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/choice>
 *                                                 &lt;choice>
 *                                                   &lt;element name="ПрФИОДо">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
 *                                                         &lt;enumeration value="1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="ФИОДо" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ФИОПрТип"/>
 *                                                 &lt;/choice>
 *                                                 &lt;element name="ФИОПосле" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ФИОПрТип"/>
 *                                                 &lt;choice>
 *                                                   &lt;element name="ПрДатаРожд">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
 *                                                         &lt;enumeration value="1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                   &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ДатаДокТип"/>
 *                                                 &lt;/choice>
 *                                                 &lt;choice>
 *                                                   &lt;element name="ПрМестоРожден">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
 *                                                         &lt;enumeration value="1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}МестоТип"/>
 *                                                 &lt;/choice>
 *                                                 &lt;choice>
 *                                                   &lt;element name="ПрСведРегРожд">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
 *                                                         &lt;enumeration value="1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="СведРегРожд" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведДокОснТип"/>
 *                                                 &lt;/choice>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СНИЛСТип" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрСведМать">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="СведМать" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведРодитТип"/>
 *                                       &lt;/choice>
 *                                       &lt;element name="СведОтец" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведРодитТип"/>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрСвДокОтцов">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="СвДокОтцов">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;extension base="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведДокТип">
 *                                               &lt;/extension>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                       &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведЕГРРазд2Тип" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="РазделЕГР" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
 *                                 &lt;enumeration value="1"/>
 *                                 &lt;enumeration value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-21" />
 *                           &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-10" />
 *                           &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1_3" />
 *                           &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-4" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ИдДок" use="required" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-36" />
 *                 &lt;attribute name="РезОбраб" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
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
 *       &lt;attribute name="ИдЗапрос" use="required" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ИдЗапросТип" />
 *       &lt;attribute name="ДатаСвед" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="КолДок" use="required" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}number-2" />
 *       &lt;attribute name="ТипАГСЗапрос" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-2">
 *             &lt;enumeration value="04"/>
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
@XmlRootElement(name = "PARENTINFResponse", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
public class PARENTINFResponse {

    @XmlElement(name = "СведОтветАГС", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0", required = true)
    protected List<PARENTINFResponse.СведОтветАГС> сведОтветАГС;
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
     * {@link PARENTINFResponse.СведОтветАГС }
     *
     *
     */
    public List<PARENTINFResponse.СведОтветАГС> getСведОтветАГС() {
        if (сведОтветАГС == null) {
            сведОтветАГС = new ArrayList<PARENTINFResponse.СведОтветАГС>();
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
     *         &lt;element name="СведРегОтцов" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ДатаДокТип"/>
     *                     &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;/choice>
     *                   &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ОрганЗАГСТип"/>
     *                   &lt;element name="СвидетРегОтцов" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ПрдСведРег">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="СведРебенок">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;choice>
     *                                         &lt;element name="ПрПол">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
     *                                               &lt;enumeration value="1"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="Пол">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
     *                                               &lt;enumeration value="1"/>
     *                                               &lt;enumeration value="2"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                       &lt;/choice>
     *                                       &lt;choice>
     *                                         &lt;element name="ПрФИОДо">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
     *                                               &lt;enumeration value="1"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="ФИОДо" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ФИОПрТип"/>
     *                                       &lt;/choice>
     *                                       &lt;element name="ФИОПосле" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ФИОПрТип"/>
     *                                       &lt;choice>
     *                                         &lt;element name="ПрДатаРожд">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
     *                                               &lt;enumeration value="1"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                         &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ДатаДокТип"/>
     *                                       &lt;/choice>
     *                                       &lt;choice>
     *                                         &lt;element name="ПрМестоРожден">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
     *                                               &lt;enumeration value="1"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}МестоТип"/>
     *                                       &lt;/choice>
     *                                       &lt;choice>
     *                                         &lt;element name="ПрСведРегРожд">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
     *                                               &lt;enumeration value="1"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="СведРегРожд" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведДокОснТип"/>
     *                                       &lt;/choice>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СНИЛСТип" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;choice>
     *                               &lt;element name="ПрСведМать">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="СведМать" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведРодитТип"/>
     *                             &lt;/choice>
     *                             &lt;element name="СведОтец" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведРодитТип"/>
     *                             &lt;choice>
     *                               &lt;element name="ПрСвДокОтцов">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="СвДокОтцов">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;extension base="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведДокТип">
     *                                     &lt;/extension>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                             &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведЕГРРазд2Тип" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="РазделЕГР" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
     *                       &lt;enumeration value="1"/>
     *                       &lt;enumeration value="2"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-21" />
     *                 &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-10" />
     *                 &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1_3" />
     *                 &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-4" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ИдДок" use="required" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-36" />
     *       &lt;attribute name="РезОбраб" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
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
        "сведРегОтцов"
    })
    public static class СведОтветАГС {

        @XmlElement(name = "СведРегОтцов", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
        protected List<PARENTINFResponse.СведОтветАГС.СведРегОтцов> сведРегОтцов;
        @XmlAttribute(name = "ИдДок", required = true)
        protected String идДок;
        @XmlAttribute(name = "РезОбраб", required = true)
        protected String резОбраб;

        /**
         * Gets the value of the сведРегОтцов property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the сведРегОтцов property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getСведРегОтцов().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PARENTINFResponse.СведОтветАГС.СведРегОтцов }
         *
         *
         */
        public List<PARENTINFResponse.СведОтветАГС.СведРегОтцов> getСведРегОтцов() {
            if (сведРегОтцов == null) {
                сведРегОтцов = new ArrayList<PARENTINFResponse.СведОтветАГС.СведРегОтцов>();
            }
            return this.сведРегОтцов;
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
         *           &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ДатаДокТип"/>
         *           &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;/choice>
         *         &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ОрганЗАГСТип"/>
         *         &lt;element name="СвидетРегОтцов" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ПрдСведРег">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="СведРебенок">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;choice>
         *                               &lt;element name="ПрПол">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
         *                                     &lt;enumeration value="1"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="Пол">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
         *                                     &lt;enumeration value="1"/>
         *                                     &lt;enumeration value="2"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                             &lt;/choice>
         *                             &lt;choice>
         *                               &lt;element name="ПрФИОДо">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
         *                                     &lt;enumeration value="1"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="ФИОДо" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ФИОПрТип"/>
         *                             &lt;/choice>
         *                             &lt;element name="ФИОПосле" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ФИОПрТип"/>
         *                             &lt;choice>
         *                               &lt;element name="ПрДатаРожд">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
         *                                     &lt;enumeration value="1"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                               &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ДатаДокТип"/>
         *                             &lt;/choice>
         *                             &lt;choice>
         *                               &lt;element name="ПрМестоРожден">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
         *                                     &lt;enumeration value="1"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}МестоТип"/>
         *                             &lt;/choice>
         *                             &lt;choice>
         *                               &lt;element name="ПрСведРегРожд">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
         *                                     &lt;enumeration value="1"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="СведРегРожд" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведДокОснТип"/>
         *                             &lt;/choice>
         *                           &lt;/sequence>
         *                           &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СНИЛСТип" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;choice>
         *                     &lt;element name="ПрСведМать">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="СведМать" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведРодитТип"/>
         *                   &lt;/choice>
         *                   &lt;element name="СведОтец" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведРодитТип"/>
         *                   &lt;choice>
         *                     &lt;element name="ПрСвДокОтцов">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="СвДокОтцов">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;extension base="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведДокТип">
         *                           &lt;/extension>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
         *                   &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведЕГРРазд2Тип" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="РазделЕГР" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
         *             &lt;enumeration value="1"/>
         *             &lt;enumeration value="2"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-21" />
         *       &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-10" />
         *       &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1_3" />
         *       &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-4" />
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
            "свидетРегОтцов",
            "прдСведРег"
        })
        public static class СведРегОтцов {

            @XmlElement(name = "ДатаЗаписДок", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
            protected ДатаДокТип датаЗаписДок;
            @XmlElement(name = "ДатаЗапис", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаЗапис;
            @XmlElement(name = "ОрганЗАГС", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0", required = true)
            protected ОрганЗАГСТип органЗАГС;
            @XmlElement(name = "СвидетРегОтцов", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
            protected List<СведСвидетТип> свидетРегОтцов;
            @XmlElement(name = "ПрдСведРег", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0", required = true)
            protected PARENTINFResponse.СведОтветАГС.СведРегОтцов.ПрдСведРег прдСведРег;
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
             * Gets the value of the свидетРегОтцов property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the свидетРегОтцов property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getСвидетРегОтцов().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link СведСвидетТип }
             *
             *
             */
            public List<СведСвидетТип> getСвидетРегОтцов() {
                if (свидетРегОтцов == null) {
                    свидетРегОтцов = new ArrayList<СведСвидетТип>();
                }
                return this.свидетРегОтцов;
            }

            /**
             * Gets the value of the прдСведРег property.
             *
             * @return
             *     possible object is
             *     {@link PARENTINFResponse.СведОтветАГС.СведРегОтцов.ПрдСведРег }
             *
             */
            public PARENTINFResponse.СведОтветАГС.СведРегОтцов.ПрдСведРег getПрдСведРег() {
                return прдСведРег;
            }

            /**
             * Sets the value of the прдСведРег property.
             *
             * @param value
             *     allowed object is
             *     {@link PARENTINFResponse.СведОтветАГС.СведРегОтцов.ПрдСведРег }
             *
             */
            public void setПрдСведРег(PARENTINFResponse.СведОтветАГС.СведРегОтцов.ПрдСведРег value) {
                this.прдСведРег = value;
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
             *         &lt;element name="СведРебенок">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;choice>
             *                     &lt;element name="ПрПол">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
             *                           &lt;enumeration value="1"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="Пол">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
             *                           &lt;enumeration value="1"/>
             *                           &lt;enumeration value="2"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                   &lt;/choice>
             *                   &lt;choice>
             *                     &lt;element name="ПрФИОДо">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
             *                           &lt;enumeration value="1"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="ФИОДо" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ФИОПрТип"/>
             *                   &lt;/choice>
             *                   &lt;element name="ФИОПосле" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ФИОПрТип"/>
             *                   &lt;choice>
             *                     &lt;element name="ПрДатаРожд">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
             *                           &lt;enumeration value="1"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                     &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ДатаДокТип"/>
             *                   &lt;/choice>
             *                   &lt;choice>
             *                     &lt;element name="ПрМестоРожден">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
             *                           &lt;enumeration value="1"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}МестоТип"/>
             *                   &lt;/choice>
             *                   &lt;choice>
             *                     &lt;element name="ПрСведРегРожд">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
             *                           &lt;enumeration value="1"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="СведРегРожд" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведДокОснТип"/>
             *                   &lt;/choice>
             *                 &lt;/sequence>
             *                 &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СНИЛСТип" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;choice>
             *           &lt;element name="ПрСведМать">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="СведМать" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведРодитТип"/>
             *         &lt;/choice>
             *         &lt;element name="СведОтец" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведРодитТип"/>
             *         &lt;choice>
             *           &lt;element name="ПрСвДокОтцов">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="СвДокОтцов">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;extension base="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведДокТип">
             *                 &lt;/extension>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *         &lt;/choice>
             *         &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведЕГРРазд2Тип" minOccurs="0"/>
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
                "сведРебенок",
                "прСведМать",
                "сведМать",
                "сведОтец",
                "прСвДокОтцов",
                "свДокОтцов",
                "сВедЕГРРазд2"
            })
            public static class ПрдСведРег {

                @XmlElement(name = "СведРебенок", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0", required = true)
                protected PARENTINFResponse.СведОтветАГС.СведРегОтцов.ПрдСведРег.СведРебенок сведРебенок;
                @XmlElement(name = "ПрСведМать", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
                protected String прСведМать;
                @XmlElement(name = "СведМать", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
                protected СведРодитТип сведМать;
                @XmlElement(name = "СведОтец", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0", required = true)
                protected СведРодитТип сведОтец;
                @XmlElement(name = "ПрСвДокОтцов", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
                protected String прСвДокОтцов;
                @XmlElement(name = "СвДокОтцов", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
                protected PARENTINFResponse.СведОтветАГС.СведРегОтцов.ПрдСведРег.СвДокОтцов свДокОтцов;
                @XmlElement(name = "СВедЕГРРазд2", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
                protected СведЕГРРазд2Тип сВедЕГРРазд2;

                /**
                 * Gets the value of the сведРебенок property.
                 *
                 * @return
                 *     possible object is
                 *     {@link PARENTINFResponse.СведОтветАГС.СведРегОтцов.ПрдСведРег.СведРебенок }
                 *
                 */
                public PARENTINFResponse.СведОтветАГС.СведРегОтцов.ПрдСведРег.СведРебенок getСведРебенок() {
                    return сведРебенок;
                }

                /**
                 * Sets the value of the сведРебенок property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link PARENTINFResponse.СведОтветАГС.СведРегОтцов.ПрдСведРег.СведРебенок }
                 *
                 */
                public void setСведРебенок(PARENTINFResponse.СведОтветАГС.СведРегОтцов.ПрдСведРег.СведРебенок value) {
                    this.сведРебенок = value;
                }

                /**
                 * Gets the value of the прСведМать property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрСведМать() {
                    return прСведМать;
                }

                /**
                 * Sets the value of the прСведМать property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрСведМать(String value) {
                    this.прСведМать = value;
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
                 * Gets the value of the прСвДокОтцов property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрСвДокОтцов() {
                    return прСвДокОтцов;
                }

                /**
                 * Sets the value of the прСвДокОтцов property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрСвДокОтцов(String value) {
                    this.прСвДокОтцов = value;
                }

                /**
                 * Gets the value of the свДокОтцов property.
                 *
                 * @return
                 *     possible object is
                 *     {@link PARENTINFResponse.СведОтветАГС.СведРегОтцов.ПрдСведРег.СвДокОтцов }
                 *
                 */
                public PARENTINFResponse.СведОтветАГС.СведРегОтцов.ПрдСведРег.СвДокОтцов getСвДокОтцов() {
                    return свДокОтцов;
                }

                /**
                 * Sets the value of the свДокОтцов property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link PARENTINFResponse.СведОтветАГС.СведРегОтцов.ПрдСведРег.СвДокОтцов }
                 *
                 */
                public void setСвДокОтцов(PARENTINFResponse.СведОтветАГС.СведРегОтцов.ПрдСведРег.СвДокОтцов value) {
                    this.свДокОтцов = value;
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
                 * <p>Java class for anonymous complex type.
                 *
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведДокТип">
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class СвДокОтцов
                    extends СведДокТип
                {


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
                 *           &lt;element name="ПрПол">
                 *             &lt;simpleType>
                 *               &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
                 *                 &lt;enumeration value="1"/>
                 *               &lt;/restriction>
                 *             &lt;/simpleType>
                 *           &lt;/element>
                 *           &lt;element name="Пол">
                 *             &lt;simpleType>
                 *               &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
                 *                 &lt;enumeration value="1"/>
                 *                 &lt;enumeration value="2"/>
                 *               &lt;/restriction>
                 *             &lt;/simpleType>
                 *           &lt;/element>
                 *         &lt;/choice>
                 *         &lt;choice>
                 *           &lt;element name="ПрФИОДо">
                 *             &lt;simpleType>
                 *               &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
                 *                 &lt;enumeration value="1"/>
                 *               &lt;/restriction>
                 *             &lt;/simpleType>
                 *           &lt;/element>
                 *           &lt;element name="ФИОДо" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ФИОПрТип"/>
                 *         &lt;/choice>
                 *         &lt;element name="ФИОПосле" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ФИОПрТип"/>
                 *         &lt;choice>
                 *           &lt;element name="ПрДатаРожд">
                 *             &lt;simpleType>
                 *               &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
                 *                 &lt;enumeration value="1"/>
                 *               &lt;/restriction>
                 *             &lt;/simpleType>
                 *           &lt;/element>
                 *           &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *           &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}ДатаДокТип"/>
                 *         &lt;/choice>
                 *         &lt;choice>
                 *           &lt;element name="ПрМестоРожден">
                 *             &lt;simpleType>
                 *               &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
                 *                 &lt;enumeration value="1"/>
                 *               &lt;/restriction>
                 *             &lt;/simpleType>
                 *           &lt;/element>
                 *           &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}МестоТип"/>
                 *         &lt;/choice>
                 *         &lt;choice>
                 *           &lt;element name="ПрСведРегРожд">
                 *             &lt;simpleType>
                 *               &lt;restriction base="{urn://x-artefacts-zags-parentinf/types/4.0.0}string-1">
                 *                 &lt;enumeration value="1"/>
                 *               &lt;/restriction>
                 *             &lt;/simpleType>
                 *           &lt;/element>
                 *           &lt;element name="СведРегРожд" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СведДокОснТип"/>
                 *         &lt;/choice>
                 *       &lt;/sequence>
                 *       &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-parentinf/types/4.0.0}СНИЛСТип" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "прПол",
                    "пол",
                    "прФИОДо",
                    "фиоДо",
                    "фиоПосле",
                    "прДатаРожд",
                    "датаРождКаленд",
                    "датаРождДок",
                    "прМестоРожден",
                    "местоРожден",
                    "прСведРегРожд",
                    "сведРегРожд"
                })
                public static class СведРебенок {

                    @XmlElement(name = "ПрПол", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
                    protected String прПол;
                    @XmlElement(name = "Пол", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
                    protected String пол;
                    @XmlElement(name = "ПрФИОДо", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
                    protected String прФИОДо;
                    @XmlElement(name = "ФИОДо", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
                    protected ФИОПрТип фиоДо;
                    @XmlElement(name = "ФИОПосле", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0", required = true)
                    protected ФИОПрТип фиоПосле;
                    @XmlElement(name = "ПрДатаРожд", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
                    protected String прДатаРожд;
                    @XmlElement(name = "ДатаРождКаленд", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar датаРождКаленд;
                    @XmlElement(name = "ДатаРождДок", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
                    protected ДатаДокТип датаРождДок;
                    @XmlElement(name = "ПрМестоРожден", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
                    protected String прМестоРожден;
                    @XmlElement(name = "МестоРожден", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
                    protected МестоТип местоРожден;
                    @XmlElement(name = "ПрСведРегРожд", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
                    protected String прСведРегРожд;
                    @XmlElement(name = "СведРегРожд", namespace = "urn://x-artefacts-zags-parentinf/root/112-56/4.0.0")
                    protected СведДокОснТип сведРегРожд;
                    @XmlAttribute(name = "СНИЛС")
                    protected String снилс;

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
                     * Gets the value of the прФИОДо property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getПрФИОДо() {
                        return прФИОДо;
                    }

                    /**
                     * Sets the value of the прФИОДо property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setПрФИОДо(String value) {
                        this.прФИОДо = value;
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

}
