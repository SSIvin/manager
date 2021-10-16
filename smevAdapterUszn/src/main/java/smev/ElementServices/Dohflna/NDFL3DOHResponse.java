
package smev.ElementServices.Dohflna;

import lombok.Data;
import smev.utils.LocalDateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "svNDFL3"
})
@XmlRootElement(name = "NDFL3DOHResponse", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2")
@Data
public class NDFL3DOHResponse {

    @XmlElement(name = "СвНДФЛ3", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2", required = true)
    protected List<SvNDFL3> svNDFL3;
    @XmlAttribute(name = "ИдЗапрос")
    protected String idZapros;


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "svFl",
            "itogUplVozv"
    })
    @Data
    public static class SvNDFL3 {

        @XmlElement(name = "СвФЛ", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2", required = true)
        protected SvFl svFl;

        @XmlElement(name = "ИтогУплВозв", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2", required = true)
        protected ItogUplVozv itogUplVozv;

        @XmlAttribute(name = "ОтчетГод", required = true)
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar otchetGod;

        @XmlAttribute(name = "ДокПредст")
        protected String docPredst;


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "nalBase",
                "dohIstRF",
                "dohIstInost",
                "dohPredprinim"
        })
        @Data
        public static class ItogUplVozv {

            @XmlElement(name = "НалБаза", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2")
            protected List<NalBase> nalBase;
            @XmlElement(name = "ДоходИстРФ", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2")
            protected List<DohIstRF> dohIstRF;
            @XmlElement(name = "ДоходИстИно", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2")
            protected List<DohIstInost> dohIstInost;
            @XmlElement(name = "ДоходПредпр", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2")
            protected DohPredprinim dohPredprinim;


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "raschDohNalIno"
            })
            @Data
            public static class DohIstInost {

                @XmlElement(name = "РасчДохНалИно", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2")
                protected List<RaschDohNalIno> raschDohNalIno;
                @XmlAttribute(name = "Ставка")
                protected BigInteger stavka;


                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                @Data
                public static class RaschDohNalIno {

                    @XmlAttribute(name = "ОКСМ")
                    protected String oksm;
                    @XmlAttribute(name = "КодВидДох")
                    protected String kodVidDoh;
                    @XmlAttribute(name = "НаимИстДох")
                    protected String nameIstDoh;
                    @XmlAttribute(name = "ДоходИноРуб")
                    protected BigDecimal dohInoRub;
                    @XmlAttribute(name = "ДоходОсв60.217")
                    protected BigDecimal dohOsv60217;
                    @XmlAttribute(name = "ДоходОсв60.1.217")
                    protected BigDecimal dohOsv601217;
                    @XmlAttribute(name = "ДоходОсв66.217")
                    protected BigDecimal dohOsv66217;
                }

            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "istYL",
                    "istFLIn"
            })
            @Data
            public static class DohIstRF {

                @XmlElement(name = "ИстЮЛ", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2")
                protected IstYL istYL;
                @XmlElement(name = "ИстФЛИн", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2")
                protected IstFLIn istFLIn;
                @XmlAttribute(name = "Ставка")
                protected BigInteger stavka;
                @XmlAttribute(name = "ВидДоход")
                protected String vidDoh;
                @XmlAttribute(name = "Доход")
                protected BigDecimal dohod;


                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                @Data
                public static class IstFLIn {

                    @XmlAttribute(name = "ФИОИн")
                    protected String fioIn;
                    @XmlAttribute(name = "ИННФЛ")
                    protected String innFl;

                }


                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                @Data
                public static class IstYL {

                    @XmlAttribute(name = "Наим")
                    protected String naim;
                    @XmlAttribute(name = "ИННЮЛ")
                    protected String innYl;
                    @XmlAttribute(name = "КПП")
                    protected String kpp;

                }

            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "raschVidDeyat"
            })
            @Data
            public static class DohPredprinim {

                @XmlElement(name = "РасчВидДеят", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2")
                protected List<RaschVidDeyat> raschVidDeyat;

                @XmlAttribute(name = "ДоходИт")
                protected BigDecimal dohodIt;


                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                @Data
                public static class RaschVidDeyat {

                    @XmlAttribute(name = "ВидДеят")
                    protected String vidDeyat;
                    @XmlAttribute(name = "ОКВЭД")
                    protected String okved;
                    @XmlAttribute(name = "Доход")
                    protected BigDecimal dohod;
                    @XmlAttribute(name = "РасхФакт")
                    protected BigDecimal rashFact;

                }

            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            @Data
            public static class NalBase {

                @XmlAttribute(name = "Ставка")
                protected BigInteger stavka;

                @XmlAttribute(name = "ВидДоход")
                protected String vidDohod;

                @XmlAttribute(name = "НалБазаИсчисл")
                protected BigDecimal naBaseIschisl;

            }

        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "fioFl",
                "innFl",
                "svedFl"
        })
        @Data
        public static class SvFl {

            @XmlElement(name = "ФИОФЛ", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2", required = true)
            protected PhysicalPersonNameType fioFl;

            @XmlElement(name = "ИННФЛ", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2")
            protected String innFl;

            @XmlElement(name = "СведФЛ", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2")
            protected SvedFl svedFl;


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "udLich"
            })
            @Data
            public static class SvedFl {

                @XmlElement(name = "УдЛичн", namespace = "urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2", required = true)
                protected IdentityDocumentShortType udLich;

                @XmlAttribute(name = "ДатаРожд")
               //@XmlSchemaType(name = "date")
                @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
                protected LocalDate birthday;

                @XmlAttribute(name = "МестоРожд")
                protected String mestoBirthday;

            }

        }

    }

}
