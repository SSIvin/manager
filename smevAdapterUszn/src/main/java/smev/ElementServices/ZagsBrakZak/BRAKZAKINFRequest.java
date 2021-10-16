
package smev.ElementServices.ZagsBrakZak;

import lombok.Data;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;
import smev.utils.LocalDateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;
import java.time.LocalDate;


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
 *                   &lt;element name="ПрСведДокОсн">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                         &lt;enumeration value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="СведДокОсн" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-500"/>
 *                 &lt;/choice>
 *                 &lt;attribute name="КодНормОсн" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-2" />
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
 *                               &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
 *                               &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;/choice>
 *                             &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ОрганЗАГСНТип"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="НомерЗапис" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-22" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СведФЛ">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ФИО" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ФИОПрТип"/>
 *                             &lt;choice>
 *                               &lt;element name="ПрДатаРожд">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                                     &lt;enumeration value="1"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                               &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
 *                             &lt;/choice>
 *                             &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}УдЛичнФЛСНТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ИнфФИО">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                                 &lt;enumeration value="1"/>
 *                                 &lt;enumeration value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СНИЛСТип" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;choice>
 *                     &lt;element name="ПрРегионРегАГС">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                           &lt;enumeration value="1"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="РегионРегАГС" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ССРФТип"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ИдДок" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-36" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ИдЗапрос" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ИдЗапросТип" />
 *       &lt;attribute name="КолДок" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}number-2" />
 *       &lt;attribute name="ТипАГС" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-2">
 *             &lt;enumeration value="02"/>
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
@XmlRootElement(name = "BRAKZAKINFRequest", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
@Data
public class BRAKZAKINFRequest implements TypeBussines {

    @XmlElement(name = "СведОсн", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0", required = true)
    protected BRAKZAKINFRequest.СведОсн сведОсн;

    @XmlElement(name = "СведЗапрос", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0", required = true)
    protected BRAKZAKINFRequest.СведЗапрос сведЗапрос;
//    protected List<BRAKZAKINFRequest.СведЗапрос> сведЗапрос;

    @XmlAttribute(name = "ИдЗапрос", required = true)
    protected String идЗапрос;

    @XmlAttribute(name = "КолДок", required = true)
    protected BigInteger колДок;

    @XmlAttribute(name = "ТипАГС", required = true)
    protected String типАГС;

    @Override
    public Object tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
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
     *                     &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
     *                     &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;/choice>
     *                   &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ОрганЗАГСНТип"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="НомерЗапис" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-22" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="СведФЛ">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ФИО" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ФИОПрТип"/>
     *                   &lt;choice>
     *                     &lt;element name="ПрДатаРожд">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                           &lt;enumeration value="1"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                     &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
     *                   &lt;/choice>
     *                   &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}УдЛичнФЛСНТип" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ИнфФИО">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                       &lt;enumeration value="1"/>
     *                       &lt;enumeration value="2"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СНИЛСТип" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice>
     *           &lt;element name="ПрРегионРегАГС">
     *             &lt;simpleType>
     *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                 &lt;enumeration value="1"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/element>
     *           &lt;element name="РегионРегАГС" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ССРФТип"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="ИдДок" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-36" />
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
    @Data
    public static class СведЗапрос {

        @XmlElement(name = "СведАГС", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
        protected BRAKZAKINFRequest.СведЗапрос.СведАГС сведАГС;

        @XmlElement(name = "СведФЛ", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0", required = true)
        protected BRAKZAKINFRequest.СведЗапрос.СведФЛ сведФЛ;

        @XmlElement(name = "ПрРегионРегАГС", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
        protected String прРегионРегАГС;

        @XmlElement(name = "РегионРегАГС", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
        protected String регионРегАГС;

        @XmlAttribute(name = "ИдДок", required = true)
        protected String идДок;


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
         *           &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
         *           &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;/choice>
         *         &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ОрганЗАГСНТип"/>
         *       &lt;/sequence>
         *       &lt;attribute name="НомерЗапис" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-22" />
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
        @Data
        public static class СведАГС {

            @XmlElement(name = "ДатаЗаписДок", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
            protected ДатаДокТип датаЗаписДок;

            @XmlElement(name = "ДатаЗапис", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
            //@XmlSchemaType(name = "date")
            @XmlJavaTypeAdapter(LocalDateAdapter.class)
            protected LocalDate датаЗапис;

            @XmlElement(name = "ОрганЗАГС", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0", required = true)
            protected ОрганЗАГСНТип органЗАГС;
            @XmlAttribute(name = "НомерЗапис", required = true)
            protected String номерЗапис;

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
         *         &lt;element name="ФИО" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ФИОПрТип"/>
         *         &lt;choice>
         *           &lt;element name="ПрДатаРожд">
         *             &lt;simpleType>
         *               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
         *                 &lt;enumeration value="1"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="ДатаРождКаленд" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *           &lt;element name="ДатаРождДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
         *         &lt;/choice>
         *         &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}УдЛичнФЛСНТип" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ИнфФИО">
         *         &lt;simpleType>
         *           &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
         *             &lt;enumeration value="1"/>
         *             &lt;enumeration value="2"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="СНИЛС" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СНИЛСТип" />
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

            @XmlElement(name = "ФИО", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0", required = true)
            protected ФИОПрТип фио;

            @XmlElement(name = "ПрДатаРожд", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
            protected String прДатаРожд;

            @XmlElement(name = "ДатаРождКаленд", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
//            @XmlSchemaType(name = "date")
            @XmlJavaTypeAdapter(LocalDateAdapter.class)
            protected LocalDate датаРождКаленд;

            @XmlElement(name = "ДатаРождДок", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
            protected ДатаДокТип датаРождДок;

            @XmlElement(name = "УдЛичнФЛ", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
            protected УдЛичнФЛСНТип удЛичнФЛ;

            @XmlAttribute(name = "ИнфФИО")
            protected String инфФИО;

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
     *         &lt;element name="ПрСведДокОсн">
     *           &lt;simpleType>
     *             &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *               &lt;enumeration value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="СведДокОсн" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-500"/>
     *       &lt;/choice>
     *       &lt;attribute name="КодНормОсн" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-2" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "прСведДокОсн",
        "сведДокОсн"
    })
    @Data
    public static class СведОсн {

        @XmlElement(name = "ПрСведДокОсн", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
        protected String прСведДокОсн;
        @XmlElement(name = "СведДокОсн", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
        protected String сведДокОсн;
        @XmlAttribute(name = "КодНормОсн", required = true)
        protected String кодНормОсн;


    }

}
