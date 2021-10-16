
package smev.ElementServices.ZagsBrakZak;

import lombok.Data;

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
 *                   &lt;element name="СведРегЗаклБрак" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
 *                               &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;/choice>
 *                             &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ОрганЗАГСТип"/>
 *                             &lt;element name="СвидетЗаклБрак" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ПрдСведРег">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="ДатаЗаклБрак" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         &lt;element name="ДатаЗаклБракДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
 *                                       &lt;/choice>
 *                                       &lt;element name="Супруг" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СупругТип"/>
 *                                       &lt;element name="Супруга" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СупругТип"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СведЕГРРазд2Тип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="РазделЕГР" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
 *                                 &lt;enumeration value="1"/>
 *                                 &lt;enumeration value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-21" />
 *                           &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-10" />
 *                           &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1_3" />
 *                           &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-4" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ИдДок" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-36" />
 *                 &lt;attribute name="РезОбраб" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
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
 *       &lt;attribute name="ИдЗапрос" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ИдЗапросТип" />
 *       &lt;attribute name="КолДок" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}number-2" />
 *       &lt;attribute name="ДатаСвед" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ТипАГСЗапрос" use="required">
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
    "сведОтветАГС"
})
@XmlRootElement(name = "BRAKZAKINFResponse", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
@Data
public class BRAKZAKINFResponse {

    @XmlElement(name = "СведОтветАГС", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0", required = true)
    protected List<BRAKZAKINFResponse.СведОтветАГС> сведОтветАГС;
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
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="СведРегЗаклБрак" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
     *                     &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;/choice>
     *                   &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ОрганЗАГСТип"/>
     *                   &lt;element name="СвидетЗаклБрак" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ПрдСведРег">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="ДатаЗаклБрак" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               &lt;element name="ДатаЗаклБракДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
     *                             &lt;/choice>
     *                             &lt;element name="Супруг" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СупругТип"/>
     *                             &lt;element name="Супруга" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СупругТип"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СведЕГРРазд2Тип" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="РазделЕГР" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
     *                       &lt;enumeration value="1"/>
     *                       &lt;enumeration value="2"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-21" />
     *                 &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-10" />
     *                 &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1_3" />
     *                 &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-4" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ИдДок" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-36" />
     *       &lt;attribute name="РезОбраб" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
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
        "сведРегЗаклБрак"
    })
    @Data
    public static class СведОтветАГС {

        @XmlElement(name = "СведРегЗаклБрак", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
        protected List<BRAKZAKINFResponse.СведОтветАГС.СведРегЗаклБрак> сведРегЗаклБрак;
        @XmlAttribute(name = "ИдДок", required = true)
        protected String идДок;
        @XmlAttribute(name = "РезОбраб", required = true)
        protected String резОбраб;

        /**
         * Gets the value of the сведРегЗаклБрак property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the сведРегЗаклБрак property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getСведРегЗаклБрак().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BRAKZAKINFResponse.СведОтветАГС.СведРегЗаклБрак }
         *
         *
         */
        public List<BRAKZAKINFResponse.СведОтветАГС.СведРегЗаклБрак> getСведРегЗаклБрак() {
            if (сведРегЗаклБрак == null) {
                сведРегЗаклБрак = new ArrayList<BRAKZAKINFResponse.СведОтветАГС.СведРегЗаклБрак>();
            }
            return this.сведРегЗаклБрак;
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
         *           &lt;element name="ДатаЗаписДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
         *           &lt;element name="ДатаЗапис" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;/choice>
         *         &lt;element name="ОрганЗАГС" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ОрганЗАГСТип"/>
         *         &lt;element name="СвидетЗаклБрак" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СведСвидетТип" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ПрдСведРег">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="ДатаЗаклБрак" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                     &lt;element name="ДатаЗаклБракДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
         *                   &lt;/choice>
         *                   &lt;element name="Супруг" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СупругТип"/>
         *                   &lt;element name="Супруга" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СупругТип"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="СВедЕГРРазд2" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СведЕГРРазд2Тип" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="РазделЕГР" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1">
         *             &lt;enumeration value="1"/>
         *             &lt;enumeration value="2"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="НомерЗаписЕГР" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-21" />
         *       &lt;attribute name="НомАГССвид" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-10" />
         *       &lt;attribute name="НомерВерс" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1_3" />
         *       &lt;attribute name="ДатаВерс" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="КодСостСтат" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-4" />
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
            "свидетЗаклБрак",
            "прдСведРег",
            "сВедЕГРРазд2"
        })
        @Data
        public static class СведРегЗаклБрак {

            @XmlElement(name = "ДатаЗаписДок", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
            protected ДатаДокТип датаЗаписДок;
            @XmlElement(name = "ДатаЗапис", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаЗапис;
            @XmlElement(name = "ОрганЗАГС", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0", required = true)
            protected ОрганЗАГСТип органЗАГС;
            @XmlElement(name = "СвидетЗаклБрак", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
            protected List<СведСвидетТип> свидетЗаклБрак;
            @XmlElement(name = "ПрдСведРег", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0", required = true)
            protected BRAKZAKINFResponse.СведОтветАГС.СведРегЗаклБрак.ПрдСведРег прдСведРег;
            @XmlElement(name = "СВедЕГРРазд2", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
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
             *           &lt;element name="ДатаЗаклБрак" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *           &lt;element name="ДатаЗаклБракДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ДатаДокТип"/>
             *         &lt;/choice>
             *         &lt;element name="Супруг" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СупругТип"/>
             *         &lt;element name="Супруга" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СупругТип"/>
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
                "датаЗаклБрак",
                "датаЗаклБракДок",
                "супруг",
                "супруга"
            })
            @Data
            public static class ПрдСведРег {

                @XmlElement(name = "ДатаЗаклБрак", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar датаЗаклБрак;
                @XmlElement(name = "ДатаЗаклБракДок", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0")
                protected ДатаДокТип датаЗаклБракДок;
                @XmlElement(name = "Супруг", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0", required = true)
                protected СупругТип супруг;
                @XmlElement(name = "Супруга", namespace = "urn://x-artefacts-zags-brakzakinf/root/112-54/4.0.0", required = true)
                protected СупругТип супруга;


            }

        }

    }

}
