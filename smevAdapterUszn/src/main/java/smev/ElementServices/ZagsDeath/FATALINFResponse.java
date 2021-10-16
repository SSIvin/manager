
package smev.ElementServices.ZagsDeath;

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
 *                   &lt;element name="СведРегСмерт" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ДатаДокТип"/>
 *                               &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;/choice>
 *                             &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ОрганЗАГСТип"/>
 *                             &lt;element name="СвидетСмерт" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ПрдСведРег">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрПол">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="Пол">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                               &lt;enumeration value="2"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрГражданство">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="ГраждТекст" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-255"/>
 *                                         &lt;element name="ГраждОКСМ" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ОКСМТип"/>
 *                                       &lt;/choice>
 *                                       &lt;element name="ФИОУмер" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ФИОПрТип"/>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрМестоРожден">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}МестоТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрДатаРожд">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ДатаДокТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрУдЛичнФЛ">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}УдЛичнФЛПрТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрМЖПосл">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="МЖПосл" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}АдрМЖТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрДатаСмерт">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="ДатаСмертКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         &lt;element name="ДатаСмертДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ДатаДокТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрВремяСмерт">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="ВремяСмерт" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрМестоСмерт">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="МестоСмерт" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}МестоТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрСведПричСмерт">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="СведПричСмерт" maxOccurs="unbounded">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;choice>
 *                                                   &lt;element name="СвПричСмертМКБ">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;attribute name="ПричСмертМКБ" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500" />
 *                                                           &lt;attribute name="КодПричСмертМКБ" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-20" />
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="СвПричСмертПроизв">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;choice>
 *                                                             &lt;element name="ПрКодПричСмертПроизв">
 *                                                               &lt;simpleType>
 *                                                                 &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                                                   &lt;enumeration value="1"/>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/simpleType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="КодПричСмертПроизв" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-20"/>
 *                                                           &lt;/choice>
 *                                                           &lt;attribute name="ПричСмертПроизв" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500" />
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/choice>
 *                                                 &lt;attribute name="ТипПричСмерт" use="required">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-2">
 *                                                       &lt;enumeration value="01"/>
 *                                                       &lt;enumeration value="02"/>
 *                                                       &lt;enumeration value="03"/>
 *                                                       &lt;enumeration value="04"/>
 *                                                       &lt;enumeration value="05"/>
 *                                                       &lt;enumeration value="11"/>
 *                                                       &lt;enumeration value="12"/>
 *                                                       &lt;enumeration value="13"/>
 *                                                       &lt;enumeration value="14"/>
 *                                                       &lt;enumeration value="15"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/attribute>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="ПрНеустанЛицо">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                           &lt;enumeration value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}СНИЛСТип" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}СведЕГРРазд2Тип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="РазделЕГР" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
 *                                 &lt;enumeration value="1"/>
 *                                 &lt;enumeration value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-21" />
 *                           &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-10" />
 *                           &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1_3" />
 *                           &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-4" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ИдДок" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-36" />
 *                 &lt;attribute name="РезОбраб" use="required">
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
 *       &lt;attribute name="ИдЗапрос" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ИдЗапросТип" />
 *       &lt;attribute name="ДатаСвед" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="КолДок" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}number-2" />
 *       &lt;attribute name="ТипАГСЗапрос" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-2">
 *             &lt;enumeration value="07"/>
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
@XmlRootElement(name = "FATALINFResponse", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
public class FATALINFResponse {

    @XmlElement(name = "СведОтветАГС", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1", required = true)
    protected List<FATALINFResponse.СведОтветАГС> сведОтветАГС;
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
     * {@link FATALINFResponse.СведОтветАГС }
     *
     *
     */
    public List<FATALINFResponse.СведОтветАГС> getСведОтветАГС() {
        if (сведОтветАГС == null) {
            сведОтветАГС = new ArrayList<FATALINFResponse.СведОтветАГС>();
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
     *         &lt;element name="СведРегСмерт" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ДатаДокТип"/>
     *                     &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;/choice>
     *                   &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ОрганЗАГСТип"/>
     *                   &lt;element name="СвидетСмерт" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ПрдСведРег">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="ПрПол">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="Пол">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                     &lt;enumeration value="2"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрГражданство">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="ГраждТекст" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-255"/>
     *                               &lt;element name="ГраждОКСМ" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ОКСМТип"/>
     *                             &lt;/choice>
     *                             &lt;element name="ФИОУмер" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ФИОПрТип"/>
     *                             &lt;choice>
     *                               &lt;element name="ПрМестоРожден">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}МестоТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрДатаРожд">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ДатаДокТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрУдЛичнФЛ">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}УдЛичнФЛПрТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрМЖПосл">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="МЖПосл" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}АдрМЖТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрДатаСмерт">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="ДатаСмертКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               &lt;element name="ДатаСмертДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ДатаДокТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрВремяСмерт">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="ВремяСмерт" type="{http://www.w3.org/2001/XMLSchema}time"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрМестоСмерт">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="МестоСмерт" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}МестоТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрСведПричСмерт">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="СведПричСмерт" maxOccurs="unbounded">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;choice>
     *                                         &lt;element name="СвПричСмертМКБ">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;attribute name="ПричСмертМКБ" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500" />
     *                                                 &lt;attribute name="КодПричСмертМКБ" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-20" />
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                         &lt;element name="СвПричСмертПроизв">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;choice>
     *                                                   &lt;element name="ПрКодПричСмертПроизв">
     *                                                     &lt;simpleType>
     *                                                       &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                                                         &lt;enumeration value="1"/>
     *                                                       &lt;/restriction>
     *                                                     &lt;/simpleType>
     *                                                   &lt;/element>
     *                                                   &lt;element name="КодПричСмертПроизв" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-20"/>
     *                                                 &lt;/choice>
     *                                                 &lt;attribute name="ПричСмертПроизв" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500" />
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                       &lt;/choice>
     *                                       &lt;attribute name="ТипПричСмерт" use="required">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-2">
     *                                             &lt;enumeration value="01"/>
     *                                             &lt;enumeration value="02"/>
     *                                             &lt;enumeration value="03"/>
     *                                             &lt;enumeration value="04"/>
     *                                             &lt;enumeration value="05"/>
     *                                             &lt;enumeration value="11"/>
     *                                             &lt;enumeration value="12"/>
     *                                             &lt;enumeration value="13"/>
     *                                             &lt;enumeration value="14"/>
     *                                             &lt;enumeration value="15"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/attribute>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                           &lt;attribute name="ПрНеустанЛицо">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                                 &lt;enumeration value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}СНИЛСТип" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}СведЕГРРазд2Тип" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="РазделЕГР" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
     *                       &lt;enumeration value="1"/>
     *                       &lt;enumeration value="2"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-21" />
     *                 &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-10" />
     *                 &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1_3" />
     *                 &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-4" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ИдДок" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-36" />
     *       &lt;attribute name="РезОбраб" use="required">
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
        "сведРегСмерт"
    })
    public static class СведОтветАГС {

        @XmlElement(name = "СведРегСмерт", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
        protected FATALINFResponse.СведОтветАГС.СведРегСмерт сведРегСмерт;
        @XmlAttribute(name = "ИдДок", required = true)
        protected String идДок;
        @XmlAttribute(name = "РезОбраб", required = true)
        protected String резОбраб;

        /**
         * Gets the value of the сведРегСмерт property.
         *
         * @return
         *     possible object is
         *     {@link FATALINFResponse.СведОтветАГС.СведРегСмерт }
         *
         */
        public FATALINFResponse.СведОтветАГС.СведРегСмерт getСведРегСмерт() {
            return сведРегСмерт;
        }

        /**
         * Sets the value of the сведРегСмерт property.
         *
         * @param value
         *     allowed object is
         *     {@link FATALINFResponse.СведОтветАГС.СведРегСмерт }
         *
         */
        public void setСведРегСмерт(FATALINFResponse.СведОтветАГС.СведРегСмерт value) {
            this.сведРегСмерт = value;
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
         *           &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ДатаДокТип"/>
         *           &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;/choice>
         *         &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ОрганЗАГСТип"/>
         *         &lt;element name="СвидетСмерт" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ПрдСведРег">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="ПрПол">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="Пол">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                           &lt;enumeration value="2"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрГражданство">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="ГраждТекст" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-255"/>
         *                     &lt;element name="ГраждОКСМ" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ОКСМТип"/>
         *                   &lt;/choice>
         *                   &lt;element name="ФИОУмер" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ФИОПрТип"/>
         *                   &lt;choice>
         *                     &lt;element name="ПрМестоРожден">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}МестоТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрДатаРожд">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                     &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ДатаДокТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрУдЛичнФЛ">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}УдЛичнФЛПрТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрМЖПосл">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="МЖПосл" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}АдрМЖТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрДатаСмерт">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="ДатаСмертКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                     &lt;element name="ДатаСмертДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ДатаДокТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрВремяСмерт">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="ВремяСмерт" type="{http://www.w3.org/2001/XMLSchema}time"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрМестоСмерт">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="МестоСмерт" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}МестоТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрСведПричСмерт">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="СведПричСмерт" maxOccurs="unbounded">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;choice>
         *                               &lt;element name="СвПричСмертМКБ">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;attribute name="ПричСмертМКБ" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500" />
         *                                       &lt;attribute name="КодПричСмертМКБ" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-20" />
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="СвПричСмертПроизв">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;choice>
         *                                         &lt;element name="ПрКодПричСмертПроизв">
         *                                           &lt;simpleType>
         *                                             &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                                               &lt;enumeration value="1"/>
         *                                             &lt;/restriction>
         *                                           &lt;/simpleType>
         *                                         &lt;/element>
         *                                         &lt;element name="КодПричСмертПроизв" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-20"/>
         *                                       &lt;/choice>
         *                                       &lt;attribute name="ПричСмертПроизв" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500" />
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                             &lt;/choice>
         *                             &lt;attribute name="ТипПричСмерт" use="required">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-2">
         *                                   &lt;enumeration value="01"/>
         *                                   &lt;enumeration value="02"/>
         *                                   &lt;enumeration value="03"/>
         *                                   &lt;enumeration value="04"/>
         *                                   &lt;enumeration value="05"/>
         *                                   &lt;enumeration value="11"/>
         *                                   &lt;enumeration value="12"/>
         *                                   &lt;enumeration value="13"/>
         *                                   &lt;enumeration value="14"/>
         *                                   &lt;enumeration value="15"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/attribute>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *                 &lt;attribute name="ПрНеустанЛицо">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *                       &lt;enumeration value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}СНИЛСТип" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}СведЕГРРазд2Тип" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="РазделЕГР" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
         *             &lt;enumeration value="1"/>
         *             &lt;enumeration value="2"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-21" />
         *       &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-10" />
         *       &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1_3" />
         *       &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-4" />
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
            "свидетСмерт",
            "прдСведРег",
            "сВедЕГРРазд2"
        })
        public static class СведРегСмерт {

            @XmlElement(name = "ДатаЗаписДок", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
            protected ДатаДокТип датаЗаписДок;
            @XmlElement(name = "ДатаЗапис", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаЗапис;
            @XmlElement(name = "ОрганЗАГС", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1", required = true)
            protected ОрганЗАГСТип органЗАГС;
            @XmlElement(name = "СвидетСмерт", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
            protected List<СведСвидетТип> свидетСмерт;
            @XmlElement(name = "ПрдСведРег", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1", required = true)
            protected FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег прдСведРег;
            @XmlElement(name = "СВедЕГРРазд2", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
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
             * Gets the value of the свидетСмерт property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the свидетСмерт property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getСвидетСмерт().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link СведСвидетТип }
             *
             *
             */
            public List<СведСвидетТип> getСвидетСмерт() {
                if (свидетСмерт == null) {
                    свидетСмерт = new ArrayList<СведСвидетТип>();
                }
                return this.свидетСмерт;
            }

            /**
             * Gets the value of the прдСведРег property.
             *
             * @return
             *     possible object is
             *     {@link FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег }
             *
             */
            public FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег getПрдСведРег() {
                return прдСведРег;
            }

            /**
             * Sets the value of the прдСведРег property.
             *
             * @param value
             *     allowed object is
             *     {@link FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег }
             *
             */
            public void setПрдСведРег(FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег value) {
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
             *           &lt;element name="ПрПол">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="Пол">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *                 &lt;enumeration value="2"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрГражданство">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="ГраждТекст" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-255"/>
             *           &lt;element name="ГраждОКСМ" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ОКСМТип"/>
             *         &lt;/choice>
             *         &lt;element name="ФИОУмер" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ФИОПрТип"/>
             *         &lt;choice>
             *           &lt;element name="ПрМестоРожден">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="МестоРожден" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}МестоТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрДатаРожд">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *           &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ДатаДокТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрУдЛичнФЛ">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}УдЛичнФЛПрТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрМЖПосл">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="МЖПосл" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}АдрМЖТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрДатаСмерт">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="ДатаСмертКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *           &lt;element name="ДатаСмертДок" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}ДатаДокТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрВремяСмерт">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="ВремяСмерт" type="{http://www.w3.org/2001/XMLSchema}time"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрМестоСмерт">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="МестоСмерт" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}МестоТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрСведПричСмерт">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="СведПричСмерт" maxOccurs="unbounded">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;choice>
             *                     &lt;element name="СвПричСмертМКБ">
             *                       &lt;complexType>
             *                         &lt;complexContent>
             *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                             &lt;attribute name="ПричСмертМКБ" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500" />
             *                             &lt;attribute name="КодПричСмертМКБ" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-20" />
             *                           &lt;/restriction>
             *                         &lt;/complexContent>
             *                       &lt;/complexType>
             *                     &lt;/element>
             *                     &lt;element name="СвПричСмертПроизв">
             *                       &lt;complexType>
             *                         &lt;complexContent>
             *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                             &lt;choice>
             *                               &lt;element name="ПрКодПричСмертПроизв">
             *                                 &lt;simpleType>
             *                                   &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
             *                                     &lt;enumeration value="1"/>
             *                                   &lt;/restriction>
             *                                 &lt;/simpleType>
             *                               &lt;/element>
             *                               &lt;element name="КодПричСмертПроизв" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-20"/>
             *                             &lt;/choice>
             *                             &lt;attribute name="ПричСмертПроизв" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500" />
             *                           &lt;/restriction>
             *                         &lt;/complexContent>
             *                       &lt;/complexType>
             *                     &lt;/element>
             *                   &lt;/choice>
             *                   &lt;attribute name="ТипПричСмерт" use="required">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-2">
             *                         &lt;enumeration value="01"/>
             *                         &lt;enumeration value="02"/>
             *                         &lt;enumeration value="03"/>
             *                         &lt;enumeration value="04"/>
             *                         &lt;enumeration value="05"/>
             *                         &lt;enumeration value="11"/>
             *                         &lt;enumeration value="12"/>
             *                         &lt;enumeration value="13"/>
             *                         &lt;enumeration value="14"/>
             *                         &lt;enumeration value="15"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/attribute>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *         &lt;/choice>
             *       &lt;/sequence>
             *       &lt;attribute name="ПрНеустанЛицо">
             *         &lt;simpleType>
             *           &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
             *             &lt;enumeration value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}СНИЛСТип" />
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
                "прГражданство",
                "граждТекст",
                "граждОКСМ",
                "фиоУмер",
                "прМестоРожден",
                "местоРожден",
                "прДатаРожд",
                "датаРождКаленд",
                "датаРождДок",
                "прУдЛичнФЛ",
                "удЛичнФЛ",
                "прМЖПосл",
                "мжПосл",
                "прДатаСмерт",
                "датаСмертКаленд",
                "датаСмертДок",
                "прВремяСмерт",
                "времяСмерт",
                "прМестоСмерт",
                "местоСмерт",
                "прСведПричСмерт",
                "сведПричСмерт"
            })
            public static class ПрдСведРег {

                @XmlElement(name = "ПрПол", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected String прПол;
                @XmlElement(name = "Пол", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected String пол;
                @XmlElement(name = "ПрГражданство", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected String прГражданство;
                @XmlElement(name = "ГраждТекст", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected String граждТекст;
                @XmlElement(name = "ГраждОКСМ", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected String граждОКСМ;
                @XmlElement(name = "ФИОУмер", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1", required = true)
                protected ФИОПрТип фиоУмер;
                @XmlElement(name = "ПрМестоРожден", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected String прМестоРожден;
                @XmlElement(name = "МестоРожден", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected МестоТип местоРожден;
                @XmlElement(name = "ПрДатаРожд", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected String прДатаРожд;
                @XmlElement(name = "ДатаРождКаленд", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar датаРождКаленд;
                @XmlElement(name = "ДатаРождДок", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected ДатаДокТип датаРождДок;
                @XmlElement(name = "ПрУдЛичнФЛ", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected String прУдЛичнФЛ;
                @XmlElement(name = "УдЛичнФЛ", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected УдЛичнФЛПрТип удЛичнФЛ;
                @XmlElement(name = "ПрМЖПосл", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected String прМЖПосл;
                @XmlElement(name = "МЖПосл", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected АдрМЖТип мжПосл;
                @XmlElement(name = "ПрДатаСмерт", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected String прДатаСмерт;
                @XmlElement(name = "ДатаСмертКаленд", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar датаСмертКаленд;
                @XmlElement(name = "ДатаСмертДок", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected ДатаДокТип датаСмертДок;
                @XmlElement(name = "ПрВремяСмерт", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected String прВремяСмерт;
                @XmlElement(name = "ВремяСмерт", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                @XmlSchemaType(name = "time")
                protected XMLGregorianCalendar времяСмерт;
                @XmlElement(name = "ПрМестоСмерт", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected String прМестоСмерт;
                @XmlElement(name = "МестоСмерт", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected МестоТип местоСмерт;
                @XmlElement(name = "ПрСведПричСмерт", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected String прСведПричСмерт;
                @XmlElement(name = "СведПричСмерт", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                protected List<FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег.СведПричСмерт> сведПричСмерт;
                @XmlAttribute(name = "ПрНеустанЛицо")
                protected String прНеустанЛицо;
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
                 * Gets the value of the фиоУмер property.
                 *
                 * @return
                 *     possible object is
                 *     {@link ФИОПрТип }
                 *
                 */
                public ФИОПрТип getФИОУмер() {
                    return фиоУмер;
                }

                /**
                 * Sets the value of the фиоУмер property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ФИОПрТип }
                 *
                 */
                public void setФИОУмер(ФИОПрТип value) {
                    this.фиоУмер = value;
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
                 * Gets the value of the прМЖПосл property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрМЖПосл() {
                    return прМЖПосл;
                }

                /**
                 * Sets the value of the прМЖПосл property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрМЖПосл(String value) {
                    this.прМЖПосл = value;
                }

                /**
                 * Gets the value of the мжПосл property.
                 *
                 * @return
                 *     possible object is
                 *     {@link АдрМЖТип }
                 *
                 */
                public АдрМЖТип getМЖПосл() {
                    return мжПосл;
                }

                /**
                 * Sets the value of the мжПосл property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link АдрМЖТип }
                 *
                 */
                public void setМЖПосл(АдрМЖТип value) {
                    this.мжПосл = value;
                }

                /**
                 * Gets the value of the прДатаСмерт property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрДатаСмерт() {
                    return прДатаСмерт;
                }

                /**
                 * Sets the value of the прДатаСмерт property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрДатаСмерт(String value) {
                    this.прДатаСмерт = value;
                }

                /**
                 * Gets the value of the датаСмертКаленд property.
                 *
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getДатаСмертКаленд() {
                    return датаСмертКаленд;
                }

                /**
                 * Sets the value of the датаСмертКаленд property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public void setДатаСмертКаленд(XMLGregorianCalendar value) {
                    this.датаСмертКаленд = value;
                }

                /**
                 * Gets the value of the датаСмертДок property.
                 *
                 * @return
                 *     possible object is
                 *     {@link ДатаДокТип }
                 *
                 */
                public ДатаДокТип getДатаСмертДок() {
                    return датаСмертДок;
                }

                /**
                 * Sets the value of the датаСмертДок property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ДатаДокТип }
                 *
                 */
                public void setДатаСмертДок(ДатаДокТип value) {
                    this.датаСмертДок = value;
                }

                /**
                 * Gets the value of the прВремяСмерт property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрВремяСмерт() {
                    return прВремяСмерт;
                }

                /**
                 * Sets the value of the прВремяСмерт property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрВремяСмерт(String value) {
                    this.прВремяСмерт = value;
                }

                /**
                 * Gets the value of the времяСмерт property.
                 *
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getВремяСмерт() {
                    return времяСмерт;
                }

                /**
                 * Sets the value of the времяСмерт property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public void setВремяСмерт(XMLGregorianCalendar value) {
                    this.времяСмерт = value;
                }

                /**
                 * Gets the value of the прМестоСмерт property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрМестоСмерт() {
                    return прМестоСмерт;
                }

                /**
                 * Sets the value of the прМестоСмерт property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрМестоСмерт(String value) {
                    this.прМестоСмерт = value;
                }

                /**
                 * Gets the value of the местоСмерт property.
                 *
                 * @return
                 *     possible object is
                 *     {@link МестоТип }
                 *
                 */
                public МестоТип getМестоСмерт() {
                    return местоСмерт;
                }

                /**
                 * Sets the value of the местоСмерт property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link МестоТип }
                 *
                 */
                public void setМестоСмерт(МестоТип value) {
                    this.местоСмерт = value;
                }

                /**
                 * Gets the value of the прСведПричСмерт property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрСведПричСмерт() {
                    return прСведПричСмерт;
                }

                /**
                 * Sets the value of the прСведПричСмерт property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрСведПричСмерт(String value) {
                    this.прСведПричСмерт = value;
                }

                /**
                 * Gets the value of the сведПричСмерт property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the сведПричСмерт property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getСведПричСмерт().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег.СведПричСмерт }
                 *
                 *
                 */
                public List<FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег.СведПричСмерт> getСведПричСмерт() {
                    if (сведПричСмерт == null) {
                        сведПричСмерт = new ArrayList<FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег.СведПричСмерт>();
                    }
                    return this.сведПричСмерт;
                }

                /**
                 * Gets the value of the прНеустанЛицо property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getПрНеустанЛицо() {
                    return прНеустанЛицо;
                }

                /**
                 * Sets the value of the прНеустанЛицо property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setПрНеустанЛицо(String value) {
                    this.прНеустанЛицо = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 *
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;choice>
                 *         &lt;element name="СвПричСмертМКБ">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="ПричСмертМКБ" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500" />
                 *                 &lt;attribute name="КодПричСмертМКБ" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-20" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="СвПричСмертПроизв">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;choice>
                 *                   &lt;element name="ПрКодПричСмертПроизв">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
                 *                         &lt;enumeration value="1"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="КодПричСмертПроизв" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-20"/>
                 *                 &lt;/choice>
                 *                 &lt;attribute name="ПричСмертПроизв" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/choice>
                 *       &lt;attribute name="ТипПричСмерт" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-2">
                 *             &lt;enumeration value="01"/>
                 *             &lt;enumeration value="02"/>
                 *             &lt;enumeration value="03"/>
                 *             &lt;enumeration value="04"/>
                 *             &lt;enumeration value="05"/>
                 *             &lt;enumeration value="11"/>
                 *             &lt;enumeration value="12"/>
                 *             &lt;enumeration value="13"/>
                 *             &lt;enumeration value="14"/>
                 *             &lt;enumeration value="15"/>
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
                    "свПричСмертМКБ",
                    "свПричСмертПроизв"
                })
                public static class СведПричСмерт {

                    @XmlElement(name = "СвПричСмертМКБ", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                    protected FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег.СведПричСмерт.СвПричСмертМКБ свПричСмертМКБ;
                    @XmlElement(name = "СвПричСмертПроизв", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                    protected FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег.СведПричСмерт.СвПричСмертПроизв свПричСмертПроизв;
                    @XmlAttribute(name = "ТипПричСмерт", required = true)
                    protected String типПричСмерт;

                    /**
                     * Gets the value of the свПричСмертМКБ property.
                     *
                     * @return
                     *     possible object is
                     *     {@link FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег.СведПричСмерт.СвПричСмертМКБ }
                     *
                     */
                    public FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег.СведПричСмерт.СвПричСмертМКБ getСвПричСмертМКБ() {
                        return свПричСмертМКБ;
                    }

                    /**
                     * Sets the value of the свПричСмертМКБ property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег.СведПричСмерт.СвПричСмертМКБ }
                     *
                     */
                    public void setСвПричСмертМКБ(FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег.СведПричСмерт.СвПричСмертМКБ value) {
                        this.свПричСмертМКБ = value;
                    }

                    /**
                     * Gets the value of the свПричСмертПроизв property.
                     *
                     * @return
                     *     possible object is
                     *     {@link FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег.СведПричСмерт.СвПричСмертПроизв }
                     *
                     */
                    public FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег.СведПричСмерт.СвПричСмертПроизв getСвПричСмертПроизв() {
                        return свПричСмертПроизв;
                    }

                    /**
                     * Sets the value of the свПричСмертПроизв property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег.СведПричСмерт.СвПричСмертПроизв }
                     *
                     */
                    public void setСвПричСмертПроизв(FATALINFResponse.СведОтветАГС.СведРегСмерт.ПрдСведРег.СведПричСмерт.СвПричСмертПроизв value) {
                        this.свПричСмертПроизв = value;
                    }

                    /**
                     * Gets the value of the типПричСмерт property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getТипПричСмерт() {
                        return типПричСмерт;
                    }

                    /**
                     * Sets the value of the типПричСмерт property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setТипПричСмерт(String value) {
                        this.типПричСмерт = value;
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
                     *       &lt;attribute name="ПричСмертМКБ" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500" />
                     *       &lt;attribute name="КодПричСмертМКБ" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-20" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class СвПричСмертМКБ {

                        @XmlAttribute(name = "ПричСмертМКБ", required = true)
                        protected String причСмертМКБ;
                        @XmlAttribute(name = "КодПричСмертМКБ", required = true)
                        protected String кодПричСмертМКБ;

                        /**
                         * Gets the value of the причСмертМКБ property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getПричСмертМКБ() {
                            return причСмертМКБ;
                        }

                        /**
                         * Sets the value of the причСмертМКБ property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setПричСмертМКБ(String value) {
                            this.причСмертМКБ = value;
                        }

                        /**
                         * Gets the value of the кодПричСмертМКБ property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getКодПричСмертМКБ() {
                            return кодПричСмертМКБ;
                        }

                        /**
                         * Sets the value of the кодПричСмертМКБ property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setКодПричСмертМКБ(String value) {
                            this.кодПричСмертМКБ = value;
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
                     *       &lt;choice>
                     *         &lt;element name="ПрКодПричСмертПроизв">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-1">
                     *               &lt;enumeration value="1"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="КодПричСмертПроизв" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-20"/>
                     *       &lt;/choice>
                     *       &lt;attribute name="ПричСмертПроизв" use="required" type="{urn://x-artefacts-zags-fatalinf/types/4.0.1}string-500" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "прКодПричСмертПроизв",
                        "кодПричСмертПроизв"
                    })
                    public static class СвПричСмертПроизв {

                        @XmlElement(name = "ПрКодПричСмертПроизв", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                        protected String прКодПричСмертПроизв;
                        @XmlElement(name = "КодПричСмертПроизв", namespace = "urn://x-artefacts-zags-fatalinf/root/112-52/4.0.1")
                        protected String кодПричСмертПроизв;
                        @XmlAttribute(name = "ПричСмертПроизв", required = true)
                        protected String причСмертПроизв;

                        /**
                         * Gets the value of the прКодПричСмертПроизв property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getПрКодПричСмертПроизв() {
                            return прКодПричСмертПроизв;
                        }

                        /**
                         * Sets the value of the прКодПричСмертПроизв property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setПрКодПричСмертПроизв(String value) {
                            this.прКодПричСмертПроизв = value;
                        }

                        /**
                         * Gets the value of the кодПричСмертПроизв property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getКодПричСмертПроизв() {
                            return кодПричСмертПроизв;
                        }

                        /**
                         * Sets the value of the кодПричСмертПроизв property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setКодПричСмертПроизв(String value) {
                            this.кодПричСмертПроизв = value;
                        }

                        /**
                         * Gets the value of the причСмертПроизв property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getПричСмертПроизв() {
                            return причСмертПроизв;
                        }

                        /**
                         * Sets the value of the причСмертПроизв property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setПричСмертПроизв(String value) {
                            this.причСмертПроизв = value;
                        }

                    }

                }

            }

        }

    }

}
