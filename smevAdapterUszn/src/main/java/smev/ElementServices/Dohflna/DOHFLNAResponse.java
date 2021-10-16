
package smev.ElementServices.Dohflna;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dohFL"
})
@XmlRootElement(name = "DOHFLNAResponse"
//        , namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1"
)
@Data
public class DOHFLNAResponse {

    @XmlElement(name = "ДохФЛ"
    //        , namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1", required = true
    )
    protected DOHFLNAResponse.DohFL dohFL;

    @XmlAttribute(name = "ИдЗапрос")
    protected String idZaprosa;



    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dohFLna"
    })
    @Data
    public static class DohFL {

        @XmlElement(name = "ДохФЛ_НА"
                //, namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1", required = true
                )
        protected List<DohFLNA> dohFLna;

        @XmlAttribute(name = "ОтчетГод", required = true)
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar OtchetGod;


//        public List<DOHFLNAResponse.DohFL.DohFLNA> getDohFLna() {
//            if (dohFLna == null) {
//                dohFLna = new ArrayList<DohFLNA>();
//            }
//            return this.dohFLna;
//        }



        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "poluchDoh",
            "cvnA",
            "svedDoh2NDFL",
            "svedDohNdPrib"
        })
        @Data
        public static class DohFLNA {

            @XmlElement(name = "ПолучДох"
            //        , namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1", required = true
            )
            protected DOHFLNAResponse.DohFL.DohFLNA.PoluchDoh poluchDoh;

            @XmlElement(name = "СвНА"
            //        , namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1", required = true
            )
            protected DOHFLNAResponse.DohFL.DohFLNA.CvnA cvnA;

            @XmlElement(name = "СведДох_2НДФЛ"
            //        , namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1"
            )
            protected List<SvedDoh2NDFL> svedDoh2NDFL;

            @XmlElement(name = "СведДох_НДПриб"
            //        , namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1"
            )
            protected List<SvedDohNdPrib> svedDohNdPrib;


//            public List<DOHFLNAResponse.DohFL.DohFLNA.СведДох2НДФЛ> getСведДох2НДФЛ() {
//                if (сведДох2НДФЛ == null) {
//                    сведДох2НДФЛ = new ArrayList<DOHFLNAResponse.DohFL.DohFLNA.СведДох2НДФЛ>();
//                }
//                return this.сведДох2НДФЛ;
//            }

            /**
             * Gets the value of the сведДохНДПриб property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the сведДохНДПриб property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getСведДохНДПриб().add(newItem);
             * </pre>
             *
             *

             *
             */
//            public List<DOHFLNAResponse.DohFL.DohFLNA.СведДохНДПриб> getСведДохНДПриб() {
//                if (сведДохНДПриб == null) {
//                    сведДохНДПриб = new ArrayList<DOHFLNAResponse.DohFL.DohFLNA.СведДохНДПриб>();
//                }
//                return this.сведДохНДПриб;
//            }


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
             *         &lt;element userName="ФИО" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}PhysicalPersonNameType"/>
             *         &lt;element userName="УдЛичнФЛ" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}IdentityDocumentShortType"/>
             *       &lt;/sequence>
             *       &lt;attribute userName="ИННФЛ" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}PhysicalPersonINNType" />
             *       &lt;attribute userName="ДатаРожд" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "fio",
                "udLich"
            })
            @Data
            public static class PoluchDoh {

                @XmlElement(name = "ФИО"
                        //, namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1", required = true
                        )
                protected PhysicalPersonNameType fio;
                @XmlElement(name = "УдЛичнФЛ"
                //        , namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1", required = true
                )
                protected IdentityDocumentShortType udLich;
                @XmlAttribute(name = "ИННФЛ")
                protected String innFl;
                @XmlAttribute(name = "ДатаРожд", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar birthday;


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
             *         &lt;element userName="СвНАЮЛ">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute userName="НаимОрг" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}string-1000" />
             *                 &lt;attribute userName="ИННЮЛ" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}LegalPersonINNType" />
             *                 &lt;attribute userName="КПП" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}KPPType" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element userName="СвНАФЛ">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element userName="ФИО" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}PhysicalPersonNameType"/>
             *                 &lt;/sequence>
             *                 &lt;attribute userName="ИННФЛ" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}PhysicalPersonINNType" />
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
                "svNAYL",
                "svNAFL"
            })
            @Data
            public static class CvnA {

                @XmlElement(name = "СвНАЮЛ"
                //        , namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1"
                )
                protected DOHFLNAResponse.DohFL.DohFLNA.CvnA.SvNAYL svNAYL;
                @XmlElement(name = "СвНАФЛ"
                //        , namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1"
                )
                protected DOHFLNAResponse.DohFL.DohFLNA.CvnA.SvNAFL svNAFL;



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
                 *         &lt;element userName="ФИО" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}PhysicalPersonNameType"/>
                 *       &lt;/sequence>
                 *       &lt;attribute userName="ИННФЛ" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}PhysicalPersonINNType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "fio"
                })
                @Data
                public static class SvNAFL {

                    @XmlElement(name = "ФИО"
                    //        , namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1", required = true
                    )
                    protected PhysicalPersonNameType fio;
                    @XmlAttribute(name = "ИННФЛ", required = true)
                    protected String innFl;



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
                 *       &lt;attribute userName="НаимОрг" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}string-1000" />
                 *       &lt;attribute userName="ИННЮЛ" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}LegalPersonINNType" />
                 *       &lt;attribute userName="КПП" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}KPPType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                @Data
                public static class SvNAYL {

                    @XmlAttribute(name = "НаимОрг", required = true)
                    protected String nameOrg;
                    @XmlAttribute(name = "ИННЮЛ", required = true)
                    protected String innYl;
                    @XmlAttribute(name = "", required = true)
                    protected String kpp;



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
             *         &lt;element userName="ДохВыч" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element userName="СвСумДох" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute userName="Месяц" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{urn://x-artefacts-fns-dohflna/types/4.0.1}digits-2">
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
             *                           &lt;attribute userName="КодДоход" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}digits-4" />
             *                           &lt;attribute userName="СумДоход" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}number-14_2" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element userName="СГДНалПер" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute userName="СумДохОбщ" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}number-14_2" />
             *                 &lt;attribute userName="НалБаза" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}number-14_2" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute userName="Ставка" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}number-2" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "dohVich",
                "sgdNalPer"
            })
            @Data
            public static class SvedDoh2NDFL {

                @XmlElement(name = "ДохВыч"
                //        , namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1"
                )
                protected DOHFLNAResponse.DohFL.DohFLNA.SvedDoh2NDFL.DohVich dohVich;
                @XmlElement(name = "СГДНалПер"
                //        , namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1"
                )
                protected DOHFLNAResponse.DohFL.DohFLNA.SvedDoh2NDFL.SgdNalPer sgdNalPer;
                @XmlAttribute(name = "Ставка", required = true)
                protected BigInteger stavka;




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
                 *         &lt;element userName="СвСумДох" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute userName="Месяц" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{urn://x-artefacts-fns-dohflna/types/4.0.1}digits-2">
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
                 *                 &lt;attribute userName="КодДоход" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}digits-4" />
                 *                 &lt;attribute userName="СумДоход" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}number-14_2" />
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
                    "svSumDoh"
                })
                @Data
                public static class DohVich {

                    @XmlElement(name = "СвСумДох"
                    //        , namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1", required = true
                    )
                    protected List<SvSumDoh> svSumDoh;

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

                     *
                     */
//                    public List<DOHFLNAResponse.DohFL.DohFLNA.СведДох2НДФЛ.ДохВыч.SvSumDoh> getСвСумДох() {
//                        if (свСумДох == null) {
//                            свСумДох = new ArrayList<DOHFLNAResponse.DohFL.DohFLNA.СведДох2НДФЛ.ДохВыч.СвСумДох>();
//                        }
//                        return this.свСумДох;
//                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     *
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute userName="Месяц" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{urn://x-artefacts-fns-dohflna/types/4.0.1}digits-2">
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
                     *       &lt;attribute userName="КодДоход" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}digits-4" />
                     *       &lt;attribute userName="СумДоход" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}number-14_2" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    @Data
                    public static class SvSumDoh {

                        @XmlAttribute(name = "Месяц", required = true)
                        protected String month;
                        @XmlAttribute(name = "КодДоход", required = true)
                        protected String kodDohod;
                        @XmlAttribute(name = "СумДоход", required = true)
                        protected BigDecimal sumDohod;



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
                 *       &lt;attribute userName="СумДохОбщ" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}number-14_2" />
                 *       &lt;attribute userName="НалБаза" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}number-14_2" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                @Data
                public static class SgdNalPer {

                    @XmlAttribute(name = "СумДохОбщ", required = true)
                    protected BigDecimal sumDohItog;
                    @XmlAttribute(name = "НалБаза", required = true)
                    protected BigDecimal nalBase;


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
             *         &lt;element userName="ДохНалПер" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute userName="Ставка" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}number-2" />
             *                 &lt;attribute userName="СумДохОбщ" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}number-17_2" />
             *                 &lt;attribute userName="НалБаза" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}number-17_2" />
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
                "dohNalPer"
            })
            @Data
            public static class SvedDohNdPrib {

                @XmlElement(name = "ДохНалПер"
                //        , namespace = "urn://x-artefacts-fns-dohflna/root/260-18/4.0.1"
                )
                protected DOHFLNAResponse.DohFL.DohFLNA.SvedDohNdPrib.DohNalPer dohNalPer;




                /**
                 * <p>Java class for anonymous complex type.
                 *
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute userName="Ставка" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}number-2" />
                 *       &lt;attribute userName="СумДохОбщ" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}number-17_2" />
                 *       &lt;attribute userName="НалБаза" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}number-17_2" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                @Data
                public static class DohNalPer {

                    @XmlAttribute(name = "Ставка", required = true)
                    protected BigInteger stavka;
                    @XmlAttribute(name = "СумДохОбщ", required = true)
                    protected BigDecimal sumDohItog;
                    @XmlAttribute(name = "НалБаза", required = true)
                    protected BigDecimal nalBase;



                }

            }

        }

    }

}
