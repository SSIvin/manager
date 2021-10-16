
package smev.ElementServices.Egisso.Death;

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
 *         &lt;element name="СведРегСмерт" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ОрганЗАГС" type="{urn://egisso-ru/types/death-reg/1.0.1}ОрганЗАГСТип"/>
 *                   &lt;element name="СтатусЗаписи">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ДатаНачСтатус" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="КодСтатус" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}digits-2">
 *                                 &lt;enumeration value="01"/>
 *                                 &lt;enumeration value="02"/>
 *                                 &lt;enumeration value="03"/>
 *                                 &lt;enumeration value="07"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимСтатус" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-255" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СведСвидет" type="{urn://egisso-ru/types/death-reg/1.0.1}СведСвидетТип" minOccurs="0"/>
 *                   &lt;element name="ПовтСвидет" type="{urn://egisso-ru/types/death-reg/1.0.1}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ПрдСведРег">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="СведУмер">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрГражданство">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="Гражданство" type="{urn://egisso-ru/types/death-reg/1.0.1}ГражданствоТип"/>
 *                                       &lt;/choice>
 *                                       &lt;element name="ФИОУмер" type="{urn://egisso-ru/types/death-reg/1.0.1}ФИОПрТип"/>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрДатаРожд">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         &lt;element name="ДатаРождДок" type="{urn://egisso-ru/types/death-reg/1.0.1}ДатаДокТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрМестоРожден">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="МестоРожден" type="{urn://egisso-ru/types/death-reg/1.0.1}МестоТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрМЖПосл">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="МЖПосл" type="{urn://egisso-ru/types/death-reg/1.0.1}МЖПослТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрУдЛичнФЛ">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="УдЛичнФЛ" type="{urn://egisso-ru/types/death-reg/1.0.1}УдЛичнФЛТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрДатаСмерт">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="ДатаСмертКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         &lt;element name="ДатаСмертДок" type="{urn://egisso-ru/types/death-reg/1.0.1}ДатаДокТип"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрВремяСмерт">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="ВремяСмерт" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="ПрМестоСмерт">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
 *                                               &lt;enumeration value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="МестоСмерт" type="{urn://egisso-ru/types/death-reg/1.0.1}МестоТип"/>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="ПрНеустанЛицо">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}digits-1">
 *                                           &lt;enumeration value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="Пол">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}digits-1">
 *                                           &lt;enumeration value="1"/>
 *                                           &lt;enumeration value="2"/>
 *                                           &lt;enumeration value="3"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="СНИЛС" type="{urn://egisso-ru/types/death-reg/1.0.1}СНИЛСТип" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СведИспрАГС" type="{urn://egisso-ru/types/death-reg/1.0.1}СведИзмАГСТип" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="СведВосстанАГС" type="{urn://egisso-ru/types/death-reg/1.0.1}СведИзмАГСТип" minOccurs="0"/>
 *                   &lt;element name="СведАннулирАГС" type="{urn://egisso-ru/types/death-reg/1.0.1}СведИзмАГСТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="НомерЗапис" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-22" />
 *                 &lt;attribute name="ДатаЗапис" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="НомерВерс" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-1_3" />
 *                 &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ИдСвед" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}ИдЗапросТип" />
 *       &lt;attribute name="ДатаСвед" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "\u0441\u0432\u0435\u0434\u0420\u0435\u0433\u0421\u043c\u0435\u0440\u0442"
})
@XmlRootElement(name = "FATALRequest", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
public class FATALRequest {

    @XmlElement(name = "\u0421\u0432\u0435\u0434\u0420\u0435\u0433\u0421\u043c\u0435\u0440\u0442", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1", required = true)
    protected List<FATALRequest.СведРегСмерт> сведРегСмерт;
    @XmlAttribute(name = "\u0418\u0434\u0421\u0432\u0435\u0434", required = true)
    protected String идСвед;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0421\u0432\u0435\u0434", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаСвед;

    /**
     * Gets the value of the сведРегСмерт property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the сведРегСмерт property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСведРегСмерт().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FATALRequest.СведРегСмерт }
     *
     *
     */
    public List<FATALRequest.СведРегСмерт> getСведРегСмерт() {
        if (сведРегСмерт == null) {
            сведРегСмерт = new ArrayList<FATALRequest.СведРегСмерт>();
        }
        return this.сведРегСмерт;
    }

    /**
     * Gets the value of the идСвед property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getИдСвед() {
        return идСвед;
    }

    /**
     * Sets the value of the идСвед property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setИдСвед(String value) {
        this.идСвед = value;
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
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ОрганЗАГС" type="{urn://egisso-ru/types/death-reg/1.0.1}ОрганЗАГСТип"/>
     *         &lt;element name="СтатусЗаписи">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ДатаНачСтатус" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="КодСтатус" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}digits-2">
     *                       &lt;enumeration value="01"/>
     *                       &lt;enumeration value="02"/>
     *                       &lt;enumeration value="03"/>
     *                       &lt;enumeration value="07"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="НаимСтатус" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-255" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="СведСвидет" type="{urn://egisso-ru/types/death-reg/1.0.1}СведСвидетТип" minOccurs="0"/>
     *         &lt;element name="ПовтСвидет" type="{urn://egisso-ru/types/death-reg/1.0.1}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ПрдСведРег">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="СведУмер">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="ПрГражданство">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="Гражданство" type="{urn://egisso-ru/types/death-reg/1.0.1}ГражданствоТип"/>
     *                             &lt;/choice>
     *                             &lt;element name="ФИОУмер" type="{urn://egisso-ru/types/death-reg/1.0.1}ФИОПрТип"/>
     *                             &lt;choice>
     *                               &lt;element name="ПрДатаРожд">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               &lt;element name="ДатаРождДок" type="{urn://egisso-ru/types/death-reg/1.0.1}ДатаДокТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрМестоРожден">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="МестоРожден" type="{urn://egisso-ru/types/death-reg/1.0.1}МестоТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрМЖПосл">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="МЖПосл" type="{urn://egisso-ru/types/death-reg/1.0.1}МЖПослТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрУдЛичнФЛ">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="УдЛичнФЛ" type="{urn://egisso-ru/types/death-reg/1.0.1}УдЛичнФЛТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрДатаСмерт">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="ДатаСмертКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               &lt;element name="ДатаСмертДок" type="{urn://egisso-ru/types/death-reg/1.0.1}ДатаДокТип"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрВремяСмерт">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="ВремяСмерт" type="{http://www.w3.org/2001/XMLSchema}time"/>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="ПрМестоСмерт">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
     *                                     &lt;enumeration value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="МестоСмерт" type="{urn://egisso-ru/types/death-reg/1.0.1}МестоТип"/>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                           &lt;attribute name="ПрНеустанЛицо">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}digits-1">
     *                                 &lt;enumeration value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="Пол">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}digits-1">
     *                                 &lt;enumeration value="1"/>
     *                                 &lt;enumeration value="2"/>
     *                                 &lt;enumeration value="3"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="СНИЛС" type="{urn://egisso-ru/types/death-reg/1.0.1}СНИЛСТип" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="СведИспрАГС" type="{urn://egisso-ru/types/death-reg/1.0.1}СведИзмАГСТип" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="СведВосстанАГС" type="{urn://egisso-ru/types/death-reg/1.0.1}СведИзмАГСТип" minOccurs="0"/>
     *         &lt;element name="СведАннулирАГС" type="{urn://egisso-ru/types/death-reg/1.0.1}СведИзмАГСТип" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="НомерЗапис" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-22" />
     *       &lt;attribute name="ДатаЗапис" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="НомерВерс" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-1_3" />
     *       &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u043e\u0440\u0433\u0430\u043d\u0417\u0410\u0413\u0421",
        "\u0441\u0442\u0430\u0442\u0443\u0441\u0417\u0430\u043f\u0438\u0441\u0438",
        "\u0441\u0432\u0435\u0434\u0421\u0432\u0438\u0434\u0435\u0442",
        "\u043f\u043e\u0432\u0442\u0421\u0432\u0438\u0434\u0435\u0442",
        "\u043f\u0440\u0434\u0421\u0432\u0435\u0434\u0420\u0435\u0433",
        "\u0441\u0432\u0435\u0434\u0418\u0441\u043f\u0440\u0410\u0413\u0421",
        "\u0441\u0432\u0435\u0434\u0412\u043e\u0441\u0441\u0442\u0430\u043d\u0410\u0413\u0421",
        "\u0441\u0432\u0435\u0434\u0410\u043d\u043d\u0443\u043b\u0438\u0440\u0410\u0413\u0421"
    })
    public static class СведРегСмерт {

        @XmlElement(name = "\u041e\u0440\u0433\u0430\u043d\u0417\u0410\u0413\u0421", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1", required = true)
        protected ОрганЗАГСТип органЗАГС;
        @XmlElement(name = "\u0421\u0442\u0430\u0442\u0443\u0441\u0417\u0430\u043f\u0438\u0441\u0438", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1", required = true)
        protected FATALRequest.СведРегСмерт.СтатусЗаписи статусЗаписи;
        @XmlElement(name = "\u0421\u0432\u0435\u0434\u0421\u0432\u0438\u0434\u0435\u0442", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
        protected СведСвидетТип сведСвидет;
        @XmlElement(name = "\u041f\u043e\u0432\u0442\u0421\u0432\u0438\u0434\u0435\u0442", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
        protected List<СведСвидетТип> повтСвидет;
        @XmlElement(name = "\u041f\u0440\u0434\u0421\u0432\u0435\u0434\u0420\u0435\u0433", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1", required = true)
        protected FATALRequest.СведРегСмерт.ПрдСведРег прдСведРег;
        @XmlElement(name = "\u0421\u0432\u0435\u0434\u0418\u0441\u043f\u0440\u0410\u0413\u0421", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
        protected List<СведИзмАГСТип> сведИспрАГС;
        @XmlElement(name = "\u0421\u0432\u0435\u0434\u0412\u043e\u0441\u0441\u0442\u0430\u043d\u0410\u0413\u0421", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
        protected СведИзмАГСТип сведВосстанАГС;
        @XmlElement(name = "\u0421\u0432\u0435\u0434\u0410\u043d\u043d\u0443\u043b\u0438\u0440\u0410\u0413\u0421", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
        protected СведИзмАГСТип сведАннулирАГС;
        @XmlAttribute(name = "\u041d\u043e\u043c\u0435\u0440\u0417\u0430\u043f\u0438\u0441", required = true)
        protected String номерЗапис;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0417\u0430\u043f\u0438\u0441", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаЗапис;
        @XmlAttribute(name = "\u041d\u043e\u043c\u0435\u0440\u0412\u0435\u0440\u0441", required = true)
        protected String номерВерс;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0412\u0435\u0440\u0441", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаВерс;

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
         * Gets the value of the статусЗаписи property.
         *
         * @return
         *     possible object is
         *     {@link FATALRequest.СведРегСмерт.СтатусЗаписи }
         *
         */
        public FATALRequest.СведРегСмерт.СтатусЗаписи getСтатусЗаписи() {
            return статусЗаписи;
        }

        /**
         * Sets the value of the статусЗаписи property.
         *
         * @param value
         *     allowed object is
         *     {@link FATALRequest.СведРегСмерт.СтатусЗаписи }
         *
         */
        public void setСтатусЗаписи(FATALRequest.СведРегСмерт.СтатусЗаписи value) {
            this.статусЗаписи = value;
        }

        /**
         * Gets the value of the сведСвидет property.
         *
         * @return
         *     possible object is
         *     {@link СведСвидетТип }
         *
         */
        public СведСвидетТип getСведСвидет() {
            return сведСвидет;
        }

        /**
         * Sets the value of the сведСвидет property.
         *
         * @param value
         *     allowed object is
         *     {@link СведСвидетТип }
         *
         */
        public void setСведСвидет(СведСвидетТип value) {
            this.сведСвидет = value;
        }

        /**
         * Gets the value of the повтСвидет property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the повтСвидет property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getПовтСвидет().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link СведСвидетТип }
         *
         *
         */
        public List<СведСвидетТип> getПовтСвидет() {
            if (повтСвидет == null) {
                повтСвидет = new ArrayList<СведСвидетТип>();
            }
            return this.повтСвидет;
        }

        /**
         * Gets the value of the прдСведРег property.
         *
         * @return
         *     possible object is
         *     {@link FATALRequest.СведРегСмерт.ПрдСведРег }
         *
         */
        public FATALRequest.СведРегСмерт.ПрдСведРег getПрдСведРег() {
            return прдСведРег;
        }

        /**
         * Sets the value of the прдСведРег property.
         *
         * @param value
         *     allowed object is
         *     {@link FATALRequest.СведРегСмерт.ПрдСведРег }
         *
         */
        public void setПрдСведРег(FATALRequest.СведРегСмерт.ПрдСведРег value) {
            this.прдСведРег = value;
        }

        /**
         * Gets the value of the сведИспрАГС property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the сведИспрАГС property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getСведИспрАГС().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link СведИзмАГСТип }
         *
         *
         */
        public List<СведИзмАГСТип> getСведИспрАГС() {
            if (сведИспрАГС == null) {
                сведИспрАГС = new ArrayList<СведИзмАГСТип>();
            }
            return this.сведИспрАГС;
        }

        /**
         * Gets the value of the сведВосстанАГС property.
         *
         * @return
         *     possible object is
         *     {@link СведИзмАГСТип }
         *
         */
        public СведИзмАГСТип getСведВосстанАГС() {
            return сведВосстанАГС;
        }

        /**
         * Sets the value of the сведВосстанАГС property.
         *
         * @param value
         *     allowed object is
         *     {@link СведИзмАГСТип }
         *
         */
        public void setСведВосстанАГС(СведИзмАГСТип value) {
            this.сведВосстанАГС = value;
        }

        /**
         * Gets the value of the сведАннулирАГС property.
         *
         * @return
         *     possible object is
         *     {@link СведИзмАГСТип }
         *
         */
        public СведИзмАГСТип getСведАннулирАГС() {
            return сведАннулирАГС;
        }

        /**
         * Sets the value of the сведАннулирАГС property.
         *
         * @param value
         *     allowed object is
         *     {@link СведИзмАГСТип }
         *
         */
        public void setСведАннулирАГС(СведИзмАГСТип value) {
            this.сведАннулирАГС = value;
        }

        /**
         * Gets the value of the номерЗапис property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getНомерЗапис() {
            return номерЗапис;
        }

        /**
         * Sets the value of the номерЗапис property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setНомерЗапис(String value) {
            this.номерЗапис = value;
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
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="СведУмер">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="ПрГражданство">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="Гражданство" type="{urn://egisso-ru/types/death-reg/1.0.1}ГражданствоТип"/>
         *                   &lt;/choice>
         *                   &lt;element name="ФИОУмер" type="{urn://egisso-ru/types/death-reg/1.0.1}ФИОПрТип"/>
         *                   &lt;choice>
         *                     &lt;element name="ПрДатаРожд">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                     &lt;element name="ДатаРождДок" type="{urn://egisso-ru/types/death-reg/1.0.1}ДатаДокТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрМестоРожден">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="МестоРожден" type="{urn://egisso-ru/types/death-reg/1.0.1}МестоТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрМЖПосл">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="МЖПосл" type="{urn://egisso-ru/types/death-reg/1.0.1}МЖПослТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрУдЛичнФЛ">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="УдЛичнФЛ" type="{urn://egisso-ru/types/death-reg/1.0.1}УдЛичнФЛТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрДатаСмерт">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="ДатаСмертКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                     &lt;element name="ДатаСмертДок" type="{urn://egisso-ru/types/death-reg/1.0.1}ДатаДокТип"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрВремяСмерт">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="ВремяСмерт" type="{http://www.w3.org/2001/XMLSchema}time"/>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="ПрМестоСмерт">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
         *                           &lt;enumeration value="1"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="МестоСмерт" type="{urn://egisso-ru/types/death-reg/1.0.1}МестоТип"/>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *                 &lt;attribute name="ПрНеустанЛицо">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}digits-1">
         *                       &lt;enumeration value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="Пол">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}digits-1">
         *                       &lt;enumeration value="1"/>
         *                       &lt;enumeration value="2"/>
         *                       &lt;enumeration value="3"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="СНИЛС" type="{urn://egisso-ru/types/death-reg/1.0.1}СНИЛСТип" />
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
            "\u0441\u0432\u0435\u0434\u0423\u043c\u0435\u0440"
        })
        public static class ПрдСведРег {

            @XmlElement(name = "\u0421\u0432\u0435\u0434\u0423\u043c\u0435\u0440", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1", required = true)
            protected FATALRequest.СведРегСмерт.ПрдСведРег.СведУмер сведУмер;

            /**
             * Gets the value of the сведУмер property.
             *
             * @return
             *     possible object is
             *     {@link FATALRequest.СведРегСмерт.ПрдСведРег.СведУмер }
             *
             */
            public FATALRequest.СведРегСмерт.ПрдСведРег.СведУмер getСведУмер() {
                return сведУмер;
            }

            /**
             * Sets the value of the сведУмер property.
             *
             * @param value
             *     allowed object is
             *     {@link FATALRequest.СведРегСмерт.ПрдСведРег.СведУмер }
             *
             */
            public void setСведУмер(FATALRequest.СведРегСмерт.ПрдСведРег.СведУмер value) {
                this.сведУмер = value;
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
             *           &lt;element name="ПрГражданство">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="Гражданство" type="{urn://egisso-ru/types/death-reg/1.0.1}ГражданствоТип"/>
             *         &lt;/choice>
             *         &lt;element name="ФИОУмер" type="{urn://egisso-ru/types/death-reg/1.0.1}ФИОПрТип"/>
             *         &lt;choice>
             *           &lt;element name="ПрДатаРожд">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *           &lt;element name="ДатаРождДок" type="{urn://egisso-ru/types/death-reg/1.0.1}ДатаДокТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрМестоРожден">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="МестоРожден" type="{urn://egisso-ru/types/death-reg/1.0.1}МестоТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрМЖПосл">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="МЖПосл" type="{urn://egisso-ru/types/death-reg/1.0.1}МЖПослТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрУдЛичнФЛ">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="УдЛичнФЛ" type="{urn://egisso-ru/types/death-reg/1.0.1}УдЛичнФЛТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрДатаСмерт">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="ДатаСмертКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *           &lt;element name="ДатаСмертДок" type="{urn://egisso-ru/types/death-reg/1.0.1}ДатаДокТип"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрВремяСмерт">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="ВремяСмерт" type="{http://www.w3.org/2001/XMLSchema}time"/>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="ПрМестоСмерт">
             *             &lt;simpleType>
             *               &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}string-1">
             *                 &lt;enumeration value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="МестоСмерт" type="{urn://egisso-ru/types/death-reg/1.0.1}МестоТип"/>
             *         &lt;/choice>
             *       &lt;/sequence>
             *       &lt;attribute name="ПрНеустанЛицо">
             *         &lt;simpleType>
             *           &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}digits-1">
             *             &lt;enumeration value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="Пол">
             *         &lt;simpleType>
             *           &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}digits-1">
             *             &lt;enumeration value="1"/>
             *             &lt;enumeration value="2"/>
             *             &lt;enumeration value="3"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="СНИЛС" type="{urn://egisso-ru/types/death-reg/1.0.1}СНИЛСТип" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "\u043f\u0440\u0413\u0440\u0430\u0436\u0434\u0430\u043d\u0441\u0442\u0432\u043e",
                "\u0433\u0440\u0430\u0436\u0434\u0430\u043d\u0441\u0442\u0432\u043e",
                "\u0444\u0438\u043e\u0423\u043c\u0435\u0440",
                "\u043f\u0440\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434",
                "\u0434\u0430\u0442\u0430\u0420\u043e\u0436\u0434\u041a\u0430\u043b\u0435\u043d\u0434",
                "\u0434\u0430\u0442\u0430\u0420\u043e\u0436\u0434\u0414\u043e\u043a",
                "\u043f\u0440\u041c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434\u0435\u043d",
                "\u043c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434\u0435\u043d",
                "\u043f\u0440\u041c\u0416\u041f\u043e\u0441\u043b",
                "\u043c\u0436\u041f\u043e\u0441\u043b",
                "\u043f\u0440\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b",
                "\u0443\u0434\u041b\u0438\u0447\u043d\u0424\u041b",
                "\u043f\u0440\u0414\u0430\u0442\u0430\u0421\u043c\u0435\u0440\u0442",
                "\u0434\u0430\u0442\u0430\u0421\u043c\u0435\u0440\u0442\u041a\u0430\u043b\u0435\u043d\u0434",
                "\u0434\u0430\u0442\u0430\u0421\u043c\u0435\u0440\u0442\u0414\u043e\u043a",
                "\u043f\u0440\u0412\u0440\u0435\u043c\u044f\u0421\u043c\u0435\u0440\u0442",
                "\u0432\u0440\u0435\u043c\u044f\u0421\u043c\u0435\u0440\u0442",
                "\u043f\u0440\u041c\u0435\u0441\u0442\u043e\u0421\u043c\u0435\u0440\u0442",
                "\u043c\u0435\u0441\u0442\u043e\u0421\u043c\u0435\u0440\u0442"
            })
            public static class СведУмер {

                @XmlElement(name = "\u041f\u0440\u0413\u0440\u0430\u0436\u0434\u0430\u043d\u0441\u0442\u0432\u043e", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                protected String прГражданство;
                @XmlElement(name = "\u0413\u0440\u0430\u0436\u0434\u0430\u043d\u0441\u0442\u0432\u043e", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                protected ГражданствоТип гражданство;
                @XmlElement(name = "\u0424\u0418\u041e\u0423\u043c\u0435\u0440", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1", required = true)
                protected ФИОПрТип фиоУмер;
                @XmlElement(name = "\u041f\u0440\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                protected String прДатаРожд;
                @XmlElement(name = "\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434\u041a\u0430\u043b\u0435\u043d\u0434", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar датаРождКаленд;
                @XmlElement(name = "\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434\u0414\u043e\u043a", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                protected ДатаДокТип датаРождДок;
                @XmlElement(name = "\u041f\u0440\u041c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434\u0435\u043d", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                protected String прМестоРожден;
                @XmlElement(name = "\u041c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434\u0435\u043d", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                protected МестоТип местоРожден;
                @XmlElement(name = "\u041f\u0440\u041c\u0416\u041f\u043e\u0441\u043b", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                protected String прМЖПосл;
                @XmlElement(name = "\u041c\u0416\u041f\u043e\u0441\u043b", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                protected МЖПослТип мжПосл;
                @XmlElement(name = "\u041f\u0440\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                protected String прУдЛичнФЛ;
                @XmlElement(name = "\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                protected УдЛичнФЛТип удЛичнФЛ;
                @XmlElement(name = "\u041f\u0440\u0414\u0430\u0442\u0430\u0421\u043c\u0435\u0440\u0442", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                protected String прДатаСмерт;
                @XmlElement(name = "\u0414\u0430\u0442\u0430\u0421\u043c\u0435\u0440\u0442\u041a\u0430\u043b\u0435\u043d\u0434", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar датаСмертКаленд;
                @XmlElement(name = "\u0414\u0430\u0442\u0430\u0421\u043c\u0435\u0440\u0442\u0414\u043e\u043a", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                protected ДатаДокТип датаСмертДок;
                @XmlElement(name = "\u041f\u0440\u0412\u0440\u0435\u043c\u044f\u0421\u043c\u0435\u0440\u0442", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                protected String прВремяСмерт;
                @XmlElement(name = "\u0412\u0440\u0435\u043c\u044f\u0421\u043c\u0435\u0440\u0442", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                @XmlSchemaType(name = "time")
                protected XMLGregorianCalendar времяСмерт;
                @XmlElement(name = "\u041f\u0440\u041c\u0435\u0441\u0442\u043e\u0421\u043c\u0435\u0440\u0442", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                protected String прМестоСмерт;
                @XmlElement(name = "\u041c\u0435\u0441\u0442\u043e\u0421\u043c\u0435\u0440\u0442", namespace = "urn://egisso-ru/msg/10.29.O/1.0.1")
                protected МестоТип местоСмерт;
                @XmlAttribute(name = "\u041f\u0440\u041d\u0435\u0443\u0441\u0442\u0430\u043d\u041b\u0438\u0446\u043e")
                protected String прНеустанЛицо;
                @XmlAttribute(name = "\u041f\u043e\u043b")
                protected String пол;
                @XmlAttribute(name = "\u0421\u041d\u0418\u041b\u0421")
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
                 * Gets the value of the гражданство property.
                 *
                 * @return
                 *     possible object is
                 *     {@link ГражданствоТип }
                 *
                 */
                public ГражданствоТип getГражданство() {
                    return гражданство;
                }

                /**
                 * Sets the value of the гражданство property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ГражданствоТип }
                 *
                 */
                public void setГражданство(ГражданствоТип value) {
                    this.гражданство = value;
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
                 *     {@link МЖПослТип }
                 *
                 */
                public МЖПослТип getМЖПосл() {
                    return мжПосл;
                }

                /**
                 * Sets the value of the мжПосл property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link МЖПослТип }
                 *
                 */
                public void setМЖПосл(МЖПослТип value) {
                    this.мжПосл = value;
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
                 *     {@link УдЛичнФЛТип }
                 *
                 */
                public УдЛичнФЛТип getУдЛичнФЛ() {
                    return удЛичнФЛ;
                }

                /**
                 * Sets the value of the удЛичнФЛ property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link УдЛичнФЛТип }
                 *
                 */
                public void setУдЛичнФЛ(УдЛичнФЛТип value) {
                    this.удЛичнФЛ = value;
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


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="ДатаНачСтатус" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="КодСтатус" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{urn://egisso-ru/types/death-reg/1.0.1}digits-2">
         *             &lt;enumeration value="01"/>
         *             &lt;enumeration value="02"/>
         *             &lt;enumeration value="03"/>
         *             &lt;enumeration value="07"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="НаимСтатус" use="required" type="{urn://egisso-ru/types/death-reg/1.0.1}string-255" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class СтатусЗаписи {

            @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0421\u0442\u0430\u0442\u0443\u0441", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаНачСтатус;
            @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u0442\u0430\u0442\u0443\u0441", required = true)
            protected String кодСтатус;
            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0442\u0430\u0442\u0443\u0441", required = true)
            protected String наимСтатус;

            /**
             * Gets the value of the датаНачСтатус property.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getДатаНачСтатус() {
                return датаНачСтатус;
            }

            /**
             * Sets the value of the датаНачСтатус property.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setДатаНачСтатус(XMLGregorianCalendar value) {
                this.датаНачСтатус = value;
            }

            /**
             * Gets the value of the кодСтатус property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getКодСтатус() {
                return кодСтатус;
            }

            /**
             * Sets the value of the кодСтатус property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setКодСтатус(String value) {
                this.кодСтатус = value;
            }

            /**
             * Gets the value of the наимСтатус property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getНаимСтатус() {
                return наимСтатус;
            }

            /**
             * Sets the value of the наимСтатус property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setНаимСтатус(String value) {
                this.наимСтатус = value;
            }

        }

    }

}
