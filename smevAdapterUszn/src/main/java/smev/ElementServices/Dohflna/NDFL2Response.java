
package smev.ElementServices.Dohflna;

import java.math.BigDecimal;
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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "колДокНА",
    "дохФЛ",
    "кодОбраб"
})
@XmlRootElement(name = "NDFL2Response", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1")
public class NDFL2Response {

    @XmlElement(name = "КолДокНА", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1")
    protected NDFL2Response.КолДокНА колДокНА;
    @XmlElement(name = "ДохФЛ", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1")
    protected NDFL2Response.ДохФЛ дохФЛ;
    @XmlElement(name = "КодОбраб", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1")
    protected String кодОбраб;
    @XmlAttribute(name = "ИдЗапрос")
    protected String идЗапрос;

    /**
     * Gets the value of the колДокНА property.
     *
     * @return
     *     possible object is
     *     {@link NDFL2Response.КолДокНА }
     *
     */
    public NDFL2Response.КолДокНА getКолДокНА() {
        return колДокНА;
    }

    /**
     * Sets the value of the колДокНА property.
     *
     * @param value
     *     allowed object is
     *     {@link NDFL2Response.КолДокНА }
     *
     */
    public void setКолДокНА(NDFL2Response.КолДокНА value) {
        this.колДокНА = value;
    }

    /**
     * Gets the value of the дохФЛ property.
     *
     * @return
     *     possible object is
     *     {@link NDFL2Response.ДохФЛ }
     *
     */
    public NDFL2Response.ДохФЛ getДохФЛ() {
        return дохФЛ;
    }

    /**
     * Sets the value of the дохФЛ property.
     *
     * @param value
     *     allowed object is
     *     {@link NDFL2Response.ДохФЛ }
     *
     */
    public void setДохФЛ(NDFL2Response.ДохФЛ value) {
        this.дохФЛ = value;
    }

    /**
     * Gets the value of the кодОбраб property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getКодОбраб() {
        return кодОбраб;
    }

    /**
     * Sets the value of the кодОбраб property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setКодОбраб(String value) {
        this.кодОбраб = value;
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
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ПолучДох">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ФИО" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonNameType"/>
     *                   &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}IdentityDocumentShortType"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ИННФЛ" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonINNType" />
     *                 &lt;attribute name="ДатаРожд" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ДохФЛ_НА" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="СвНА">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="СвНАЮЛ">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="НаимОрг" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}string-1000" />
     *                                     &lt;attribute name="ИННЮЛ" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}LegalPersonINNType" />
     *                                     &lt;attribute name="КПП" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}KPPType" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="СвНАФЛ">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ФИО" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonNameType"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="ИННФЛ" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonINNType" />
     *                                     &lt;attribute name="СНИЛС" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}SNILSType" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="СведДох" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ДохВыч">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="СвСумДох" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="СвСумВыч" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}СведВычТип" maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="Месяц" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{urn://x-artefacts-fns-ndfl2/types/4.1.1}digits-2">
     *                                                     &lt;enumeration value="01"/>
     *                                                     &lt;enumeration value="02"/>
     *                                                     &lt;enumeration value="03"/>
     *                                                     &lt;enumeration value="04"/>
     *                                                     &lt;enumeration value="05"/>
     *                                                     &lt;enumeration value="06"/>
     *                                                     &lt;enumeration value="07"/>
     *                                                     &lt;enumeration value="08"/>
     *                                                     &lt;enumeration value="09"/>
     *                                                     &lt;enumeration value="10"/>
     *                                                     &lt;enumeration value="11"/>
     *                                                     &lt;enumeration value="12"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="КодДоход" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}digits-4" />
     *                                               &lt;attribute name="СумДоход" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-14_2" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="НалВычССИ" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ПредВычССИ" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}СведВычТип" maxOccurs="unbounded"/>
     *                                       &lt;element name="УведИмущВыч" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="НомерУвед" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}string-20" />
     *                                               &lt;attribute name="ДатаУвед" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                                               &lt;attribute name="ИФНСУвед" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}SONOType" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="СГДНалПер">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="СумДохОбщ" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-14_2" />
     *                                     &lt;attribute name="НалБаза" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-14_2" />
     *                                     &lt;attribute name="НалИсчисл" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
     *                                     &lt;attribute name="НалУдерж" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
     *                                     &lt;attribute name="НалПеречисл" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
     *                                     &lt;attribute name="НалУдержЛиш" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
     *                                     &lt;attribute name="НалНеУдерж" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Ставка" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-2" />
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
     *       &lt;attribute name="ОтчетГод" use="required" type="{http://www.w3.org/2001/XMLSchema}gYear" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "получДох",
        "дохФЛНА"
    })
    public static class ДохФЛ {

        @XmlElement(name = "ПолучДох", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1", required = true)
        protected NDFL2Response.ДохФЛ.ПолучДох получДох;
        @XmlElement(name = "ДохФЛ_НА", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1", required = true)
        protected List<NDFL2Response.ДохФЛ.ДохФЛНА> дохФЛНА;
        @XmlAttribute(name = "ОтчетГод", required = true)
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar отчетГод;

        /**
         * Gets the value of the получДох property.
         *
         * @return
         *     possible object is
         *     {@link NDFL2Response.ДохФЛ.ПолучДох }
         *
         */
        public NDFL2Response.ДохФЛ.ПолучДох getПолучДох() {
            return получДох;
        }

        /**
         * Sets the value of the получДох property.
         *
         * @param value
         *     allowed object is
         *     {@link NDFL2Response.ДохФЛ.ПолучДох }
         *
         */
        public void setПолучДох(NDFL2Response.ДохФЛ.ПолучДох value) {
            this.получДох = value;
        }

        /**
         * Gets the value of the дохФЛНА property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the дохФЛНА property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getДохФЛНА().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NDFL2Response.ДохФЛ.ДохФЛНА }
         *
         *
         */
        public List<NDFL2Response.ДохФЛ.ДохФЛНА> getДохФЛНА() {
            if (дохФЛНА == null) {
                дохФЛНА = new ArrayList<NDFL2Response.ДохФЛ.ДохФЛНА>();
            }
            return this.дохФЛНА;
        }

        /**
         * Gets the value of the отчетГод property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getОтчетГод() {
            return отчетГод;
        }

        /**
         * Sets the value of the отчетГод property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setОтчетГод(XMLGregorianCalendar value) {
            this.отчетГод = value;
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
         *         &lt;element name="СвНА">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="СвНАЮЛ">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="НаимОрг" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}string-1000" />
         *                           &lt;attribute name="ИННЮЛ" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}LegalPersonINNType" />
         *                           &lt;attribute name="КПП" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}KPPType" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="СвНАФЛ">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ФИО" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonNameType"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="ИННФЛ" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonINNType" />
         *                           &lt;attribute name="СНИЛС" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}SNILSType" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="СведДох" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ДохВыч">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="СвСумДох" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="СвСумВыч" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}СведВычТип" maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="Месяц" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{urn://x-artefacts-fns-ndfl2/types/4.1.1}digits-2">
         *                                           &lt;enumeration value="01"/>
         *                                           &lt;enumeration value="02"/>
         *                                           &lt;enumeration value="03"/>
         *                                           &lt;enumeration value="04"/>
         *                                           &lt;enumeration value="05"/>
         *                                           &lt;enumeration value="06"/>
         *                                           &lt;enumeration value="07"/>
         *                                           &lt;enumeration value="08"/>
         *                                           &lt;enumeration value="09"/>
         *                                           &lt;enumeration value="10"/>
         *                                           &lt;enumeration value="11"/>
         *                                           &lt;enumeration value="12"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="КодДоход" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}digits-4" />
         *                                     &lt;attribute name="СумДоход" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-14_2" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="НалВычССИ" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ПредВычССИ" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}СведВычТип" maxOccurs="unbounded"/>
         *                             &lt;element name="УведИмущВыч" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="НомерУвед" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}string-20" />
         *                                     &lt;attribute name="ДатаУвед" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                                     &lt;attribute name="ИФНСУвед" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}SONOType" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="СГДНалПер">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="СумДохОбщ" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-14_2" />
         *                           &lt;attribute name="НалБаза" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-14_2" />
         *                           &lt;attribute name="НалИсчисл" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
         *                           &lt;attribute name="НалУдерж" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
         *                           &lt;attribute name="НалПеречисл" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
         *                           &lt;attribute name="НалУдержЛиш" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
         *                           &lt;attribute name="НалНеУдерж" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Ставка" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-2" />
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
            "свНА",
            "сведДох"
        })
        public static class ДохФЛНА {

            @XmlElement(name = "СвНА", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1", required = true)
            protected NDFL2Response.ДохФЛ.ДохФЛНА.СвНА свНА;
            @XmlElement(name = "СведДох", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1", required = true)
            protected List<NDFL2Response.ДохФЛ.ДохФЛНА.СведДох> сведДох;

            /**
             * Gets the value of the свНА property.
             *
             * @return
             *     possible object is
             *     {@link NDFL2Response.ДохФЛ.ДохФЛНА.СвНА }
             *
             */
            public NDFL2Response.ДохФЛ.ДохФЛНА.СвНА getСвНА() {
                return свНА;
            }

            /**
             * Sets the value of the свНА property.
             *
             * @param value
             *     allowed object is
             *     {@link NDFL2Response.ДохФЛ.ДохФЛНА.СвНА }
             *
             */
            public void setСвНА(NDFL2Response.ДохФЛ.ДохФЛНА.СвНА value) {
                this.свНА = value;
            }

            /**
             * Gets the value of the сведДох property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the сведДох property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getСведДох().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link NDFL2Response.ДохФЛ.ДохФЛНА.СведДох }
             *
             *
             */
            public List<NDFL2Response.ДохФЛ.ДохФЛНА.СведДох> getСведДох() {
                if (сведДох == null) {
                    сведДох = new ArrayList<NDFL2Response.ДохФЛ.ДохФЛНА.СведДох>();
                }
                return this.сведДох;
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
             *         &lt;element name="СвНАЮЛ">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="НаимОрг" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}string-1000" />
             *                 &lt;attribute name="ИННЮЛ" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}LegalPersonINNType" />
             *                 &lt;attribute name="КПП" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}KPPType" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="СвНАФЛ">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ФИО" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonNameType"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="ИННФЛ" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonINNType" />
             *                 &lt;attribute name="СНИЛС" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}SNILSType" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/choice>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "свНАЮЛ",
                "свНАФЛ"
            })
            public static class СвНА {

                @XmlElement(name = "СвНАЮЛ", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1")
                protected NDFL2Response.ДохФЛ.ДохФЛНА.СвНА.СвНАЮЛ свНАЮЛ;
                @XmlElement(name = "СвНАФЛ", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1")
                protected NDFL2Response.ДохФЛ.ДохФЛНА.СвНА.СвНАФЛ свНАФЛ;

                /**
                 * Gets the value of the свНАЮЛ property.
                 *
                 * @return
                 *     possible object is
                 *     {@link NDFL2Response.ДохФЛ.ДохФЛНА.СвНА.СвНАЮЛ }
                 *
                 */
                public NDFL2Response.ДохФЛ.ДохФЛНА.СвНА.СвНАЮЛ getСвНАЮЛ() {
                    return свНАЮЛ;
                }

                /**
                 * Sets the value of the свНАЮЛ property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link NDFL2Response.ДохФЛ.ДохФЛНА.СвНА.СвНАЮЛ }
                 *
                 */
                public void setСвНАЮЛ(NDFL2Response.ДохФЛ.ДохФЛНА.СвНА.СвНАЮЛ value) {
                    this.свНАЮЛ = value;
                }

                /**
                 * Gets the value of the свНАФЛ property.
                 *
                 * @return
                 *     possible object is
                 *     {@link NDFL2Response.ДохФЛ.ДохФЛНА.СвНА.СвНАФЛ }
                 *
                 */
                public NDFL2Response.ДохФЛ.ДохФЛНА.СвНА.СвНАФЛ getСвНАФЛ() {
                    return свНАФЛ;
                }

                /**
                 * Sets the value of the свНАФЛ property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link NDFL2Response.ДохФЛ.ДохФЛНА.СвНА.СвНАФЛ }
                 *
                 */
                public void setСвНАФЛ(NDFL2Response.ДохФЛ.ДохФЛНА.СвНА.СвНАФЛ value) {
                    this.свНАФЛ = value;
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
                 *         &lt;element name="ФИО" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonNameType"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="ИННФЛ" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonINNType" />
                 *       &lt;attribute name="СНИЛС" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}SNILSType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "фио"
                })
                public static class СвНАФЛ {

                    @XmlElement(name = "ФИО", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1", required = true)
                    protected PhysicalPersonNameType фио;
                    @XmlAttribute(name = "ИННФЛ", required = true)
                    protected String иннфл;
                    @XmlAttribute(name = "СНИЛС")
                    protected String снилс;

                    /**
                     * Gets the value of the фио property.
                     *
                     * @return
                     *     possible object is
                     *     {@link PhysicalPersonNameType }
                     *
                     */
                    public PhysicalPersonNameType getФИО() {
                        return фио;
                    }

                    /**
                     * Sets the value of the фио property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link PhysicalPersonNameType }
                     *
                     */
                    public void setФИО(PhysicalPersonNameType value) {
                        this.фио = value;
                    }

                    /**
                     * Gets the value of the иннфл property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getИННФЛ() {
                        return иннфл;
                    }

                    /**
                     * Sets the value of the иннфл property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setИННФЛ(String value) {
                        this.иннфл = value;
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
                 *       &lt;attribute name="НаимОрг" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}string-1000" />
                 *       &lt;attribute name="ИННЮЛ" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}LegalPersonINNType" />
                 *       &lt;attribute name="КПП" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}KPPType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class СвНАЮЛ {

                    @XmlAttribute(name = "НаимОрг", required = true)
                    protected String наимОрг;
                    @XmlAttribute(name = "ИННЮЛ", required = true)
                    protected String иннюл;
                    @XmlAttribute(name = "КПП", required = true)
                    protected String кпп;

                    /**
                     * Gets the value of the наимОрг property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getНаимОрг() {
                        return наимОрг;
                    }

                    /**
                     * Sets the value of the наимОрг property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setНаимОрг(String value) {
                        this.наимОрг = value;
                    }

                    /**
                     * Gets the value of the иннюл property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getИННЮЛ() {
                        return иннюл;
                    }

                    /**
                     * Sets the value of the иннюл property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setИННЮЛ(String value) {
                        this.иннюл = value;
                    }

                    /**
                     * Gets the value of the кпп property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getКПП() {
                        return кпп;
                    }

                    /**
                     * Sets the value of the кпп property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setКПП(String value) {
                        this.кпп = value;
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
             *         &lt;element name="ДохВыч">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="СвСумДох" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="СвСумВыч" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}СведВычТип" maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="Месяц" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{urn://x-artefacts-fns-ndfl2/types/4.1.1}digits-2">
             *                                 &lt;enumeration value="01"/>
             *                                 &lt;enumeration value="02"/>
             *                                 &lt;enumeration value="03"/>
             *                                 &lt;enumeration value="04"/>
             *                                 &lt;enumeration value="05"/>
             *                                 &lt;enumeration value="06"/>
             *                                 &lt;enumeration value="07"/>
             *                                 &lt;enumeration value="08"/>
             *                                 &lt;enumeration value="09"/>
             *                                 &lt;enumeration value="10"/>
             *                                 &lt;enumeration value="11"/>
             *                                 &lt;enumeration value="12"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="КодДоход" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}digits-4" />
             *                           &lt;attribute name="СумДоход" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-14_2" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="НалВычССИ" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ПредВычССИ" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}СведВычТип" maxOccurs="unbounded"/>
             *                   &lt;element name="УведИмущВыч" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="НомерУвед" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}string-20" />
             *                           &lt;attribute name="ДатаУвед" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
             *                           &lt;attribute name="ИФНСУвед" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}SONOType" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="СГДНалПер">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="СумДохОбщ" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-14_2" />
             *                 &lt;attribute name="НалБаза" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-14_2" />
             *                 &lt;attribute name="НалИсчисл" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
             *                 &lt;attribute name="НалУдерж" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
             *                 &lt;attribute name="НалПеречисл" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
             *                 &lt;attribute name="НалУдержЛиш" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
             *                 &lt;attribute name="НалНеУдерж" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Ставка" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-2" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "дохВыч",
                "налВычССИ",
                "сгдНалПер"
            })
            public static class СведДох {

                @XmlElement(name = "ДохВыч", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1", required = true)
                protected NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.ДохВыч дохВыч;
                @XmlElement(name = "НалВычССИ", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1")
                protected NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.НалВычССИ налВычССИ;
                @XmlElement(name = "СГДНалПер", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1", required = true)
                protected NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.СГДНалПер сгдНалПер;
                @XmlAttribute(name = "Ставка", required = true)
                protected BigInteger ставка;

                /**
                 * Gets the value of the дохВыч property.
                 *
                 * @return
                 *     possible object is
                 *     {@link NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.ДохВыч }
                 *
                 */
                public NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.ДохВыч getДохВыч() {
                    return дохВыч;
                }

                /**
                 * Sets the value of the дохВыч property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.ДохВыч }
                 *
                 */
                public void setДохВыч(NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.ДохВыч value) {
                    this.дохВыч = value;
                }

                /**
                 * Gets the value of the налВычССИ property.
                 *
                 * @return
                 *     possible object is
                 *     {@link NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.НалВычССИ }
                 *
                 */
                public NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.НалВычССИ getНалВычССИ() {
                    return налВычССИ;
                }

                /**
                 * Sets the value of the налВычССИ property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.НалВычССИ }
                 *
                 */
                public void setНалВычССИ(NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.НалВычССИ value) {
                    this.налВычССИ = value;
                }

                /**
                 * Gets the value of the сгдНалПер property.
                 *
                 * @return
                 *     possible object is
                 *     {@link NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.СГДНалПер }
                 *
                 */
                public NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.СГДНалПер getСГДНалПер() {
                    return сгдНалПер;
                }

                /**
                 * Sets the value of the сгдНалПер property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.СГДНалПер }
                 *
                 */
                public void setСГДНалПер(NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.СГДНалПер value) {
                    this.сгдНалПер = value;
                }

                /**
                 * Gets the value of the ставка property.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *
                 */
                public BigInteger getСтавка() {
                    return ставка;
                }

                /**
                 * Sets the value of the ставка property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *
                 */
                public void setСтавка(BigInteger value) {
                    this.ставка = value;
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
                 *         &lt;element name="СвСумДох" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="СвСумВыч" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}СведВычТип" maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="Месяц" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{urn://x-artefacts-fns-ndfl2/types/4.1.1}digits-2">
                 *                       &lt;enumeration value="01"/>
                 *                       &lt;enumeration value="02"/>
                 *                       &lt;enumeration value="03"/>
                 *                       &lt;enumeration value="04"/>
                 *                       &lt;enumeration value="05"/>
                 *                       &lt;enumeration value="06"/>
                 *                       &lt;enumeration value="07"/>
                 *                       &lt;enumeration value="08"/>
                 *                       &lt;enumeration value="09"/>
                 *                       &lt;enumeration value="10"/>
                 *                       &lt;enumeration value="11"/>
                 *                       &lt;enumeration value="12"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="КодДоход" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}digits-4" />
                 *                 &lt;attribute name="СумДоход" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-14_2" />
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
                    "свСумДох"
                })
                public static class ДохВыч {

                    @XmlElement(name = "СвСумДох", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1", required = true)
                    protected List<NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.ДохВыч.СвСумДох> свСумДох;

                    /**
                     * Gets the value of the свСумДох property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the свСумДох property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getСвСумДох().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.ДохВыч.СвСумДох }
                     *
                     *
                     */
                    public List<NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.ДохВыч.СвСумДох> getСвСумДох() {
                        if (свСумДох == null) {
                            свСумДох = new ArrayList<NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.ДохВыч.СвСумДох>();
                        }
                        return this.свСумДох;
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
                     *         &lt;element name="СвСумВыч" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}СведВычТип" maxOccurs="unbounded" minOccurs="0"/>
                     *       &lt;/sequence>
                     *       &lt;attribute name="Месяц" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{urn://x-artefacts-fns-ndfl2/types/4.1.1}digits-2">
                     *             &lt;enumeration value="01"/>
                     *             &lt;enumeration value="02"/>
                     *             &lt;enumeration value="03"/>
                     *             &lt;enumeration value="04"/>
                     *             &lt;enumeration value="05"/>
                     *             &lt;enumeration value="06"/>
                     *             &lt;enumeration value="07"/>
                     *             &lt;enumeration value="08"/>
                     *             &lt;enumeration value="09"/>
                     *             &lt;enumeration value="10"/>
                     *             &lt;enumeration value="11"/>
                     *             &lt;enumeration value="12"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="КодДоход" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}digits-4" />
                     *       &lt;attribute name="СумДоход" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-14_2" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "свСумВыч"
                    })
                    public static class СвСумДох {

                        @XmlElement(name = "СвСумВыч", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1")
                        protected List<СведВычТип> свСумВыч;
                        @XmlAttribute(name = "Месяц", required = true)
                        protected String месяц;
                        @XmlAttribute(name = "КодДоход", required = true)
                        protected String кодДоход;
                        @XmlAttribute(name = "СумДоход", required = true)
                        protected BigDecimal сумДоход;

                        /**
                         * Gets the value of the свСумВыч property.
                         *
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the свСумВыч property.
                         *
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getСвСумВыч().add(newItem);
                         * </pre>
                         *
                         *
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link СведВычТип }
                         *
                         *
                         */
                        public List<СведВычТип> getСвСумВыч() {
                            if (свСумВыч == null) {
                                свСумВыч = new ArrayList<СведВычТип>();
                            }
                            return this.свСумВыч;
                        }

                        /**
                         * Gets the value of the месяц property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getМесяц() {
                            return месяц;
                        }

                        /**
                         * Sets the value of the месяц property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setМесяц(String value) {
                            this.месяц = value;
                        }

                        /**
                         * Gets the value of the кодДоход property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getКодДоход() {
                            return кодДоход;
                        }

                        /**
                         * Sets the value of the кодДоход property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setКодДоход(String value) {
                            this.кодДоход = value;
                        }

                        /**
                         * Gets the value of the сумДоход property.
                         *
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *
                         */
                        public BigDecimal getСумДоход() {
                            return сумДоход;
                        }

                        /**
                         * Sets the value of the сумДоход property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *
                         */
                        public void setСумДоход(BigDecimal value) {
                            this.сумДоход = value;
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
                 *         &lt;element name="ПредВычССИ" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}СведВычТип" maxOccurs="unbounded"/>
                 *         &lt;element name="УведИмущВыч" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="НомерУвед" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}string-20" />
                 *                 &lt;attribute name="ДатаУвед" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
                 *                 &lt;attribute name="ИФНСУвед" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}SONOType" />
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
                    "предВычССИ",
                    "уведИмущВыч"
                })
                public static class НалВычССИ {

                    @XmlElement(name = "ПредВычССИ", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1", required = true)
                    protected List<СведВычТип> предВычССИ;
                    @XmlElement(name = "УведИмущВыч", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1")
                    protected NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.НалВычССИ.УведИмущВыч уведИмущВыч;

                    /**
                     * Gets the value of the предВычССИ property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the предВычССИ property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getПредВычССИ().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link СведВычТип }
                     *
                     *
                     */
                    public List<СведВычТип> getПредВычССИ() {
                        if (предВычССИ == null) {
                            предВычССИ = new ArrayList<СведВычТип>();
                        }
                        return this.предВычССИ;
                    }

                    /**
                     * Gets the value of the уведИмущВыч property.
                     *
                     * @return
                     *     possible object is
                     *     {@link NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.НалВычССИ.УведИмущВыч }
                     *
                     */
                    public NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.НалВычССИ.УведИмущВыч getУведИмущВыч() {
                        return уведИмущВыч;
                    }

                    /**
                     * Sets the value of the уведИмущВыч property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.НалВычССИ.УведИмущВыч }
                     *
                     */
                    public void setУведИмущВыч(NDFL2Response.ДохФЛ.ДохФЛНА.СведДох.НалВычССИ.УведИмущВыч value) {
                        this.уведИмущВыч = value;
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
                     *       &lt;attribute name="НомерУвед" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}string-20" />
                     *       &lt;attribute name="ДатаУвед" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
                     *       &lt;attribute name="ИФНСУвед" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}SONOType" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class УведИмущВыч {

                        @XmlAttribute(name = "НомерУвед", required = true)
                        protected String номерУвед;
                        @XmlAttribute(name = "ДатаУвед", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar датаУвед;
                        @XmlAttribute(name = "ИФНСУвед", required = true)
                        protected String ифнсУвед;

                        /**
                         * Gets the value of the номерУвед property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getНомерУвед() {
                            return номерУвед;
                        }

                        /**
                         * Sets the value of the номерУвед property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setНомерУвед(String value) {
                            this.номерУвед = value;
                        }

                        /**
                         * Gets the value of the датаУвед property.
                         *
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *
                         */
                        public XMLGregorianCalendar getДатаУвед() {
                            return датаУвед;
                        }

                        /**
                         * Sets the value of the датаУвед property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *
                         */
                        public void setДатаУвед(XMLGregorianCalendar value) {
                            this.датаУвед = value;
                        }

                        /**
                         * Gets the value of the ифнсУвед property.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getИФНСУвед() {
                            return ифнсУвед;
                        }

                        /**
                         * Sets the value of the ифнсУвед property.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setИФНСУвед(String value) {
                            this.ифнсУвед = value;
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
                 *       &lt;attribute name="СумДохОбщ" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-14_2" />
                 *       &lt;attribute name="НалБаза" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-14_2" />
                 *       &lt;attribute name="НалИсчисл" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
                 *       &lt;attribute name="НалУдерж" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
                 *       &lt;attribute name="НалПеречисл" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
                 *       &lt;attribute name="НалУдержЛиш" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
                 *       &lt;attribute name="НалНеУдерж" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-12" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class СГДНалПер {

                    @XmlAttribute(name = "СумДохОбщ", required = true)
                    protected BigDecimal сумДохОбщ;
                    @XmlAttribute(name = "НалБаза", required = true)
                    protected BigDecimal налБаза;
                    @XmlAttribute(name = "НалИсчисл", required = true)
                    protected BigInteger налИсчисл;
                    @XmlAttribute(name = "НалУдерж")
                    protected BigInteger налУдерж;
                    @XmlAttribute(name = "НалПеречисл")
                    protected BigInteger налПеречисл;
                    @XmlAttribute(name = "НалУдержЛиш")
                    protected BigInteger налУдержЛиш;
                    @XmlAttribute(name = "НалНеУдерж", required = true)
                    protected BigInteger налНеУдерж;

                    /**
                     * Gets the value of the сумДохОбщ property.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getСумДохОбщ() {
                        return сумДохОбщ;
                    }

                    /**
                     * Sets the value of the сумДохОбщ property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setСумДохОбщ(BigDecimal value) {
                        this.сумДохОбщ = value;
                    }

                    /**
                     * Gets the value of the налБаза property.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *
                     */
                    public BigDecimal getНалБаза() {
                        return налБаза;
                    }

                    /**
                     * Sets the value of the налБаза property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *
                     */
                    public void setНалБаза(BigDecimal value) {
                        this.налБаза = value;
                    }

                    /**
                     * Gets the value of the налИсчисл property.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *
                     */
                    public BigInteger getНалИсчисл() {
                        return налИсчисл;
                    }

                    /**
                     * Sets the value of the налИсчисл property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *
                     */
                    public void setНалИсчисл(BigInteger value) {
                        this.налИсчисл = value;
                    }

                    /**
                     * Gets the value of the налУдерж property.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *
                     */
                    public BigInteger getНалУдерж() {
                        return налУдерж;
                    }

                    /**
                     * Sets the value of the налУдерж property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *
                     */
                    public void setНалУдерж(BigInteger value) {
                        this.налУдерж = value;
                    }

                    /**
                     * Gets the value of the налПеречисл property.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *
                     */
                    public BigInteger getНалПеречисл() {
                        return налПеречисл;
                    }

                    /**
                     * Sets the value of the налПеречисл property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *
                     */
                    public void setНалПеречисл(BigInteger value) {
                        this.налПеречисл = value;
                    }

                    /**
                     * Gets the value of the налУдержЛиш property.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *
                     */
                    public BigInteger getНалУдержЛиш() {
                        return налУдержЛиш;
                    }

                    /**
                     * Sets the value of the налУдержЛиш property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *
                     */
                    public void setНалУдержЛиш(BigInteger value) {
                        this.налУдержЛиш = value;
                    }

                    /**
                     * Gets the value of the налНеУдерж property.
                     *
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *
                     */
                    public BigInteger getНалНеУдерж() {
                        return налНеУдерж;
                    }

                    /**
                     * Sets the value of the налНеУдерж property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *
                     */
                    public void setНалНеУдерж(BigInteger value) {
                        this.налНеУдерж = value;
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
         *         &lt;element name="ФИО" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonNameType"/>
         *         &lt;element name="УдЛичнФЛ" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}IdentityDocumentShortType"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ИННФЛ" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}PhysicalPersonINNType" />
         *       &lt;attribute name="ДатаРожд" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
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
            "удЛичнФЛ"
        })
        public static class ПолучДох {

            @XmlElement(name = "ФИО", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1", required = true)
            protected PhysicalPersonNameType фио;
            @XmlElement(name = "УдЛичнФЛ", namespace = "urn://x-artefacts-fns-ndfl2/root/260-10/4.1.1", required = true)
            protected IdentityDocumentShortType удЛичнФЛ;
            @XmlAttribute(name = "ИННФЛ")
            protected String иннфл;
            @XmlAttribute(name = "ДатаРожд", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаРожд;

            /**
             * Gets the value of the фио property.
             *
             * @return
             *     possible object is
             *     {@link PhysicalPersonNameType }
             *
             */
            public PhysicalPersonNameType getФИО() {
                return фио;
            }

            /**
             * Sets the value of the фио property.
             *
             * @param value
             *     allowed object is
             *     {@link PhysicalPersonNameType }
             *
             */
            public void setФИО(PhysicalPersonNameType value) {
                this.фио = value;
            }

            /**
             * Gets the value of the удЛичнФЛ property.
             *
             * @return
             *     possible object is
             *     {@link IdentityDocumentShortType }
             *
             */
            public IdentityDocumentShortType getУдЛичнФЛ() {
                return удЛичнФЛ;
            }

            /**
             * Sets the value of the удЛичнФЛ property.
             *
             * @param value
             *     allowed object is
             *     {@link IdentityDocumentShortType }
             *
             */
            public void setУдЛичнФЛ(IdentityDocumentShortType value) {
                this.удЛичнФЛ = value;
            }

            /**
             * Gets the value of the иннфл property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getИННФЛ() {
                return иннфл;
            }

            /**
             * Sets the value of the иннфл property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setИННФЛ(String value) {
                this.иннфл = value;
            }

            /**
             * Gets the value of the датаРожд property.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getДатаРожд() {
                return датаРожд;
            }

            /**
             * Sets the value of the датаРожд property.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setДатаРожд(XMLGregorianCalendar value) {
                this.датаРожд = value;
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
     *       &lt;attribute name="ОтчетГод" use="required" type="{http://www.w3.org/2001/XMLSchema}gYear" />
     *       &lt;attribute name="КолДок" use="required" type="{urn://x-artefacts-fns-ndfl2/types/4.1.1}number-9" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class КолДокНА {

        @XmlAttribute(name = "ОтчетГод", required = true)
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar отчетГод;
        @XmlAttribute(name = "КолДок", required = true)
        protected BigInteger колДок;

        /**
         * Gets the value of the отчетГод property.
         *
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public XMLGregorianCalendar getОтчетГод() {
            return отчетГод;
        }

        /**
         * Sets the value of the отчетГод property.
         *
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *
         */
        public void setОтчетГод(XMLGregorianCalendar value) {
            this.отчетГод = value;
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

    }

}
