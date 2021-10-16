
package smev.ElementServices.ZagsRojd;

import lombok.Data;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;
import smev.utils.LocalDateAdapter;

import java.math.BigInteger;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element name="СведОсн">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="СведДокОсн" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-500"/>
 *                   &lt;element name="ПрСведДокОсн">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                         &lt;enumeration value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *                 &lt;attribute name="КодНормОсн" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-2" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СведЗапрос" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СведАГС" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ДатаДокТип"/>
 *                               &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;/choice>
 *                             &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ОрганЗАГСНТип"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="НомерЗапис" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-22" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СведФЛ">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ФИО" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ФИОПрТип"/>
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
 *                             &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}УдЛичнФЛСНТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ТипУчАЗ">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                                 &lt;enumeration value="1"/>
 *                                 &lt;enumeration value="2"/>
 *                                 &lt;enumeration value="3"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СНИЛСТип" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;choice>
 *                     &lt;element name="ПрРегионРегАГС">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
 *                           &lt;enumeration value="1"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="РегионРегАГС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ССРФТип"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ИдДок" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-36" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ИдЗапрос" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ИдЗапросТип" />
 *       &lt;attribute name="КолДок" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}number-2" />
 *       &lt;attribute name="ТипАГС" use="required">
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
    "сведОсн",
    "сведЗапрос"
})
@XmlRootElement(name = "ROGDINFRequest", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
@Data
public class ROGDINFRequest implements TypeBussines {

    @XmlElement(name = "СведОсн", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1", required = true)
    protected ROGDINFRequest.СведОсн сведОсн;

    @XmlElement(name = "СведЗапрос", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1", required = true)
    protected ROGDINFRequest.СведЗапрос сведЗапрос;
//    protected List<ROGDINFRequest.СведЗапрос> сведЗапрос;

    @XmlAttribute(name = "ИдЗапрос", required = true)
    protected String идЗапрос;
    @XmlAttribute(name = "КолДок", required = true)
    protected BigInteger колДок;
    @XmlAttribute(name = "ТипАГС", required = true)
    protected String типАГС;

    @Override
    public TypeBussines tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
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
     *         &lt;element name="СведАГС" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ДатаДокТип"/>
     *                     &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;/choice>
     *                   &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ОрганЗАГСНТип"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="НомерЗапис" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-22" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="СведФЛ">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ФИО" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ФИОПрТип"/>
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
     *                   &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}УдЛичнФЛСНТип" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ТипУчАЗ">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
     *                       &lt;enumeration value="1"/>
     *                       &lt;enumeration value="2"/>
     *                       &lt;enumeration value="3"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}СНИЛСТип" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice>
     *           &lt;element name="ПрРегионРегАГС">
     *             &lt;simpleType>
     *               &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
     *                 &lt;enumeration value="1"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;element name="РегионРегАГС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ССРФТип"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="ИдДок" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-36" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "сведАГС",
        "сведФЛ",
        "прРегионРегАГС",
        "регионРегАГС"
    })
    public static class СведЗапрос {

        @XmlElement(name = "СведАГС", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
        protected ROGDINFRequest.СведЗапрос.СведАГС сведАГС;

        @XmlElement(name = "СведФЛ", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1", required = true)
        protected ROGDINFRequest.СведЗапрос.СведФЛ сведФЛ;

        @XmlElement(name = "ПрРегионРегАГС", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
        protected String прРегионРегАГС;

        @XmlElement(name = "РегионРегАГС", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
        protected String регионРегАГС;

        @XmlAttribute(name = "ИдДок", required = true)
        protected String идДок;

        /**
         * Gets the value of the сведАГС property.
         *
         * @return
         *     possible object is
         *     {@link ROGDINFRequest.СведЗапрос.СведАГС }
         *
         */
        public ROGDINFRequest.СведЗапрос.СведАГС getСведАГС() {
            return сведАГС;
        }

        /**
         * Sets the value of the сведАГС property.
         *
         * @param value
         *     allowed object is
         *     {@link ROGDINFRequest.СведЗапрос.СведАГС }
         *
         */
        public void setСведАГС(ROGDINFRequest.СведЗапрос.СведАГС value) {
            this.сведАГС = value;
        }

        /**
         * Gets the value of the сведФЛ property.
         *
         * @return
         *     possible object is
         *     {@link ROGDINFRequest.СведЗапрос.СведФЛ }
         *
         */
        public ROGDINFRequest.СведЗапрос.СведФЛ getСведФЛ() {
            return сведФЛ;
        }

        /**
         * Sets the value of the сведФЛ property.
         *
         * @param value
         *     allowed object is
         *     {@link ROGDINFRequest.СведЗапрос.СведФЛ }
         *
         */
        public void setСведФЛ(ROGDINFRequest.СведЗапрос.СведФЛ value) {
            this.сведФЛ = value;
        }

        /**
         * Gets the value of the прРегионРегАГС property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getПрРегионРегАГС() {
            return прРегионРегАГС;
        }

        /**
         * Sets the value of the прРегионРегАГС property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setПрРегионРегАГС(String value) {
            this.прРегионРегАГС = value;
        }

        /**
         * Gets the value of the регионРегАГС property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getРегионРегАГС() {
            return регионРегАГС;
        }

        /**
         * Sets the value of the регионРегАГС property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setРегионРегАГС(String value) {
            this.регионРегАГС = value;
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
         *         &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ОрганЗАГСНТип"/>
         *       &lt;/sequence>
         *       &lt;attribute name="НомерЗапис" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-22" />
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
            "органЗАГС"
        })
        public static class СведАГС {

            @XmlElement(name = "ДатаЗаписДок", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
            protected ДатаДокТип датаЗаписДок;

            @XmlElement(name = "ДатаЗапис", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
            //@XmlSchemaType(name = "date")
            @XmlJavaTypeAdapter(LocalDateAdapter.class)
            protected LocalDate датаЗапис;

            @XmlElement(name = "ОрганЗАГС", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1", required = true)
            protected ОрганЗАГСНТип органЗАГС;
            @XmlAttribute(name = "НомерЗапис", required = true)
            protected String номерЗапис;

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
            public LocalDate getДатаЗапис() {
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
            public void setДатаЗапис(LocalDate value) {
                this.датаЗапис = value;
            }

            /**
             * Gets the value of the органЗАГС property.
             *
             * @return
             *     possible object is
             *     {@link ОрганЗАГСНТип }
             *
             */
            public ОрганЗАГСНТип getОрганЗАГС() {
                return органЗАГС;
            }

            /**
             * Sets the value of the органЗАГС property.
             *
             * @param value
             *     allowed object is
             *     {@link ОрганЗАГСНТип }
             *
             */
            public void setОрганЗАГС(ОрганЗАГСНТип value) {
                this.органЗАГС = value;
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
         *         &lt;element name="ФИО" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}ФИОПрТип"/>
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
         *         &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}УдЛичнФЛСНТип" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ТипУчАЗ">
         *         &lt;simpleType>
         *           &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
         *             &lt;enumeration value="1"/>
         *             &lt;enumeration value="2"/>
         *             &lt;enumeration value="3"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
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
            "фио",
            "прДатаРожд",
            "датаРождКаленд",
            "датаРождДок",
            "удЛичнФЛ"
        })
        @Data
        public static class СведФЛ {

            @XmlElement(name = "ФИО", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1", required = true)
            protected ФИОПрТип фио;
            @XmlElement(name = "ПрДатаРожд", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
            protected String прДатаРожд;

            @XmlElement(name = "ДатаРождКаленд", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
            @XmlJavaTypeAdapter(LocalDateAdapter.class)
            protected LocalDate датаРождКаленд;

            @XmlElement(name = "ДатаРождДок", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
            protected ДатаДокТип датаРождДок;
            @XmlElement(name = "УдЛичнФЛ", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
            protected УдЛичнФЛСНТип удЛичнФЛ;
            @XmlAttribute(name = "ТипУчАЗ")
            protected String типУчАЗ;

            @XmlAttribute(name = "СНИЛС")
            protected String снилс;

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
     *         &lt;element name="СведДокОсн" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-500"/>
     *         &lt;element name="ПрСведДокОсн">
     *           &lt;simpleType>
     *             &lt;restriction base="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-1">
     *               &lt;enumeration value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/choice>
     *       &lt;attribute name="КодНормОсн" use="required" type="{urn://x-artefacts-zags-rogdinf/types/4.0.1}string-2" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "сведДокОсн",
        "прСведДокОсн"
    })
    public static class СведОсн {

        @XmlElement(name = "СведДокОсн", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
        protected String сведДокОсн;
        @XmlElement(name = "ПрСведДокОсн", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.1")
        protected String прСведДокОсн;
        @XmlAttribute(name = "КодНормОсн", required = true)
        protected String кодНормОсн;

        /**
         * Gets the value of the сведДокОсн property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getСведДокОсн() {
            return сведДокОсн;
        }

        /**
         * Sets the value of the сведДокОсн property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setСведДокОсн(String value) {
            this.сведДокОсн = value;
        }

        /**
         * Gets the value of the прСведДокОсн property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getПрСведДокОсн() {
            return прСведДокОсн;
        }

        /**
         * Sets the value of the прСведДокОсн property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setПрСведДокОсн(String value) {
            this.прСведДокОсн = value;
        }

        /**
         * Gets the value of the кодНормОсн property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getКодНормОсн() {
            return кодНормОсн;
        }

        /**
         * Sets the value of the кодНормОсн property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setКодНормОсн(String value) {
            this.кодНормОсн = value;
        }

    }

}
