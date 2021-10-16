
package smev.ElementServices.FnsNdipsr;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "svNDSpResh"
})
@XmlRootElement(name = "NDIPSRResponse", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0")
@Data
public class NDIPSRResponse {

    @XmlElement(name = "СвНДСпРеж", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0", required = true)
    protected List<SvNDSpResh> svNDSpResh;

    @XmlAttribute(name = "ИдЗапрос")
    protected String idZapros;


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "svedIp",
            "echn",
            "usn",
            "envd"
    })
    @Data
    public static class SvNDSpResh {

        @XmlElement(name = "СведИП", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0", required = true)
        protected SvedIP svedIp;
        @XmlElement(name = "ЕСХН", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0")
        protected List<ECHN> echn;
        @XmlElement(name = "УСН", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0")
        protected List<USN> usn;
        @XmlElement(name = "ЕНВД", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0")
        protected List<ENVD> envd;

//        public List<ECHN> getЕСХН() {
//            if (echn == null) {
//                echn = new ArrayList<ECHN>();
//            }
//            return this.echn;
//        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "nalBaseKVPD"
        })
        @Data
        public static class ENVD {

            @XmlElement(name = "НалБазаКВПД", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0")
            protected List<NalBaseKVPD> nalBaseKVPD;

            @XmlAttribute(name = "ПериодОтч", required = true)
            protected String periodOtch;

            @XmlAttribute(name = "ГодПериодОтч", required = true)
            @XmlSchemaType(name = "gYear")
            protected XMLGregorianCalendar godPeriodOtch;



            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            @Data
            public static class NalBaseKVPD {

                @XmlAttribute(name = "КВПД", required = true)
                protected String kvpd;
                @XmlAttribute(name = "НалБаза", required = true)
                protected BigInteger nalBase;


            }

        }


         @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        @Data
        public static class ECHN {

            @XmlAttribute(name = "ПериодОтч", required = true)
            protected String periodOtch;

            @XmlAttribute(name = "ГодПериодОтч", required = true)
            @XmlSchemaType(name = "gYear")
            protected XMLGregorianCalendar godPeriodOtch;

            @XmlAttribute(name = "СумДох", required = true)
            protected BigInteger sumDoh;


        }



        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "fio"
        })
        @Data
        public static class SvedIP {

            @XmlElement(name = "ФИО", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0", required = true)
            protected PhysicalPersonNameType fio;

            @XmlAttribute(name = "ИННФЛ", required = true)
            protected String innFl;


        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "svUpr300",
                "svUpr501",
                "свУпр504"
        })
        @Data
        public static class USN {

            @XmlElement(name = "СвУпр3_00", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0")
            protected SvUpr300 svUpr300;

            @XmlElement(name = "СвУпр5_01", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0")
            protected SvUpr501 svUpr501;

            @XmlElement(name = "СвУпр5_04", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0")
            protected SvUpr504 свУпр504;

            @XmlAttribute(name = "ПериодОтч", required = true)
            protected String periodOtch;

            @XmlAttribute(name = "ГодПериодОтч", required = true)
            @XmlSchemaType(name = "gYear")
            protected XMLGregorianCalendar godPeriodOtch;

            @XmlAttribute(name = "ВерсФорм", required = true)
            protected String versForm;



            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "dohod",
                    "dohRash"
            })
            @Data
            public static class SvUpr300 {

                @XmlElement(name = "Доходы", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0")
                protected BigInteger dohod;

                @XmlElement(name = "ДохРасх", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0")
                protected BigInteger dohRash;


            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            @Data
            public static class SvUpr501 {

                @XmlAttribute(name = "ОбНал", required = true)
                protected String obNal;

                @XmlAttribute(name = "Доход", required = true)
                protected BigInteger dohod;

                @XmlAttribute(name = "Расход")
                protected BigInteger rashod;


            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "raschNalDoh",
                    "raschNalDohUm"
            })
            @Data
            public static class SvUpr504 {

                @XmlElement(name = "РасчНалДох", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0")
                protected RaschNalDoh raschNalDoh;

                @XmlElement(name = "РасчНалДохУм", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0")
                protected RaschNalDohUm raschNalDohUm;



                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "dohod"
                })
                @Data
                public static class RaschNalDoh {

                    @XmlElement(name = "Доход", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0", required = true)
                    protected SumType dohod;

                    @XmlAttribute(name = "ОбНал")
                    protected String obNal;


                }


                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "dohod",
                        "rashod"
                })
                @Data
                public static class RaschNalDohUm {

                    @XmlElement(name = "Доход", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0", required = true)
                    protected SumType dohod;

                    @XmlElement(name = "Расход", namespace = "urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0", required = true)
                    protected SumType rashod;

                    @XmlAttribute(name = "ОбНал")
                    protected String obNal;

                }

            }

        }

    }

}
