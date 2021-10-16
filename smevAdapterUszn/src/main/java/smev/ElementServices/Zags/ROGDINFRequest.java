
package smev.ElementServices.Zags;

import lombok.Data;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = ""
//        , propOrder = {
//        "svedOsn",
//        "svedZapros",
//        "idZapros"
//}
)
@XmlRootElement(name = "ROGDINFRequest", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.0")
@Data
public class ROGDINFRequest implements TypeBussines {

    @XmlElement(name = "СведОсн", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.0", required = true)
    protected ROGDINFRequest.SvedOsn svedOsn;

    @XmlElement(name = "СведЗапрос", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.0", required = true)
    protected ROGDINFRequest.SvedZapros svedZapros;
//    protected List<ROGDINFRequest.SvedZapros> svedZapros;

    @XmlAttribute(name = "ИдЗапрос", required = true)
    protected String idZapros;

    @XmlAttribute(name = "КолДок", required = true)
    protected String kolDoc;

    @XmlAttribute(name = "ТипАГС", required = true)
    protected String typeAGS;

    @XmlAttribute(name = "НаимТипЗаписЗапр", required = true)
    protected String nameTipZapisZapros;

    @Override
    public Object tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "svedAGS",
            "svedFl",
            "idDoc"
    })
    @Data
    public static class SvedZapros {

        @XmlElement(name = "СведАГС", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.0")
        protected ROGDINFRequest.SvedZapros.SvedAGS svedAGS;

        @XmlElement(name = "СведФЛ", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.0", required = true)
        protected ROGDINFRequest.SvedZapros.SvedFl svedFl;

        @XmlAttribute(name = "ИдДок", required = true)
        protected String idDoc;


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "dateZapisDoc",
                "dateZapis",
                "organZagsNTip"
        })
        @Data
        public static class SvedAGS {

            @XmlElement(name = "ДатаЗаписДок", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.0")
            protected DateDocTip dateZapisDoc;

            @XmlElement(name = "ДатаЗапис", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.0")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateZapis;

            @XmlElement(name = "ОрганЗАГС", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.0", required = true)
            protected OrganZagsNTip organZagsNTip;

            @XmlAttribute(name = "НомерЗапис", required = true)
            protected String numZapis;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "fio",
                "prBirthday",
                "birthdayCalend",
                "dateBirthdayDoc",
                "udLichFL"
        })
        @Data
        public static class SvedFl {

            @XmlElement(name = "ФИО", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.0", required = true)
            protected FIOPrType fio;

            @XmlElement(name = "ПрДатаРожд", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.0")
            protected String prBirthday;

            @XmlElement(name = "ДатаРождКаленд", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.0")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar birthdayCalend;

            @XmlElement(name = "ДатаРождДок", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.0")
            protected DateDocTip dateBirthdayDoc;

            @XmlElement(name = "УдЛичнФЛ", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.0")
            protected UdLichFLType udLichFL;

            @XmlAttribute(name = "СНИЛС")
            protected String snils;

        }

    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = ""
            , propOrder = {
            "normOsn",
            "svedDocOsn",
            "prSvedDocOsn"
    }
    )
    @Data
    public static class SvedOsn {

        @XmlElement(name = "НормОсн", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.0", required = true)
        protected NormOsn normOsn;

        @XmlElement(name = "СведДокОсн", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.0")
        protected String svedDocOsn;

        @XmlElement(name = "ПрСведДокОсн", namespace = "urn://x-artefacts-zags-rogdinf/root/112-51/4.0.0")
        protected String prSvedDocOsn;


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = ""
                , propOrder = {
                "kodNormOsn",
                "nameNormOsn"
        })
        @Data
        public static class NormOsn {

            @XmlAttribute(name = "КодНормОсн", required = true)
            protected String kodNormOsn;

            @XmlAttribute(name = "НаимНормОсн", required = true)
            protected String nameNormOsn;

        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.0", propOrder = {
            "family",
            "prFamily",
            "name",
            "prName",
            "otchestvo",
            "prOtchestvo"
    })
    @Data
    public static class FIOPrType {

        @XmlElement(name = "Фамилия", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.0")
        protected String family;
        @XmlElement(name = "ПрФамилия", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.0")
        protected String prFamily;
        @XmlElement(name = "Имя", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.0")
        protected String name;
        @XmlElement(name = "ПрИмя", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.0")
        protected String prName;
        @XmlElement(name = "Отчество", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.0")
        protected String otchestvo;
        @XmlElement(name = "ПрОтчество", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.0")
        protected String prOtchestvo;

    }


    /**
     * Сведения о дате по представленным документам
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.0", propOrder = {
            "prDay",
            "day",
            "prMonth",
            "month",
            "god"
    })
    @Data
    public static class DateDocTip {

        @XmlElement(name = "ПрДень", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.0")
        protected String prDay;
        @XmlElement(name = "День", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.0")
        protected BigInteger day;
        @XmlElement(name = "ПрМесяц", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.0")
        protected String prMonth;
        @XmlElement(name = "Месяц", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.0")
        protected BigInteger month;
        @XmlElement(name = "Год", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.0", required = true)
        protected XMLGregorianCalendar god;

    }


    /**
     * Сведения об органе, которым произведена государственная регистрация акта гражданского состояния
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.0")
    @Data
    public static class OrganZagsNTip {

        @XmlAttribute(name = "НаимЗАГС", required = true)
        protected String nameZags;
        @XmlAttribute(name = "КодЗАГС")
        protected String kodZags;
    }

    /**
     * Сведения о документе, удостоверяющем личность физического лица
     */

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "udLichFLType", namespace = "urn://x-artefacts-zags-rogdinf/types/4.0.0")
    @Data
    public static class UdLichFLType {

        @XmlAttribute(name = "КодВидДок", required = true)
        protected String kodVidDoc;

        @XmlAttribute(name = "НаимДок", required = true)
        protected String nameDoc;

        @XmlAttribute(name = "СерНомДок", required = true)
        protected String serNumDoc;

        @XmlAttribute(name = "ДатаДок")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateDoc;

        @XmlAttribute(name = "ВыдДок")
        protected String vidanDoc;

        @XmlAttribute(name = "КодВыдДок")
        protected String kodVidanDoc;

    }
}
