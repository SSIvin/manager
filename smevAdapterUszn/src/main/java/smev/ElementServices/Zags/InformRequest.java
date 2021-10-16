
package smev.ElementServices.Zags;

import lombok.Data;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "svedAGS",
    "svedFl"
})
@XmlRootElement(name = "informRequest", namespace = "urn://x-artefacts-zags-inform/root/112-11/4.0.4")
@Data
public class InformRequest implements TypeBussines {

    @XmlElement(name = "СведАГС", namespace = "urn://x-artefacts-zags-inform/root/112-11/4.0.4")
    protected InformRequest.SvedAGS svedAGS;
    @XmlElement(name = "СведФЛ", namespace = "urn://x-artefacts-zags-inform/root/112-11/4.0.4", required = true)
    protected InformRequest.SvedFl svedFl;
    @XmlAttribute(name = "ИдЗапрос", required = true)
    protected String idZapros;
    @XmlAttribute(name = "ТипЗапрос", required = true)
    protected String typeZapros;
    @XmlAttribute(name = "ТипАГС", required = true)
    protected String typeAGS;

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
        "organZags"
    })
    @Data
    public static class SvedAGS {

        @XmlElement(name = "ОрганЗАГС", namespace = "urn://x-artefacts-zags-inform/root/112-11/4.0.4", required = true)
        protected InformRequest.SvedAGS.OrganZags organZags;

        @XmlAttribute(name = "НомерЗапис", required = true)
        protected String numZapis;

        @XmlAttribute(name = "ДатаЗапис", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateZapis;






        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        @Data
        public static class OrganZags {

            @XmlAttribute(name = "НаимЗАГС", required = true)
            protected String nameZags;

            @XmlAttribute(name = "КодЗАГС")
            protected String kodZags;

        }

    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fio",
        "birthday",
        "mesGodBirthday",
        "godBirthday",
        "udLichFLType"
    })
    @Data
    public static class SvedFl {

        @XmlElement(name = "ФИО", namespace = "urn://x-artefacts-zags-inform/root/112-11/4.0.4", required = true)
        protected FIOPrType fio;

        @XmlElement(name = "ДатаРожд", namespace = "urn://x-artefacts-zags-inform/root/112-11/4.0.4")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birthday;

        @XmlElement(name = "МесГодРожд", namespace = "urn://x-artefacts-zags-inform/root/112-11/4.0.4")
        @XmlSchemaType(name = "gYearMonth")
        protected XMLGregorianCalendar mesGodBirthday;

        @XmlElement(name = "ГодРожд", namespace = "urn://x-artefacts-zags-inform/root/112-11/4.0.4")
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar godBirthday;

        @XmlElement(name = "УдЛичнФЛ", namespace = "urn://x-artefacts-zags-inform/root/112-11/4.0.4")
        protected UdLichFLType udLichFLType;

        @XmlAttribute(name = "СНИЛС")
        protected String snils;

        @XmlAttribute(name = "ИННФЛ")
        protected String innFl;

    }


    /**
     * Сведения о документе, удостоверяющем личность физического лица
     * */

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "udLichFLType", namespace = "urn://x-artefacts-zags-inform/types/4.0.4")
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


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "family",
            "prFamily",
            "name",
            "prName",
            "otchestvo",
            "prOtchestvo"
    })
    @Data
    public static class FIOPrType {

        @XmlElement(name = "Фамилия", namespace = "urn://x-artefacts-zags-inform/types/4.0.4")
        protected String family;
        @XmlElement(name = "ПрФамилия", namespace = "urn://x-artefacts-zags-inform/types/4.0.4")
        protected String prFamily;
        @XmlElement(name = "Имя", namespace = "urn://x-artefacts-zags-inform/types/4.0.4")
        protected String name;
        @XmlElement(name = "ПрИмя", namespace = "urn://x-artefacts-zags-inform/types/4.0.4")
        protected String prName;
        @XmlElement(name = "Отчество", namespace = "urn://x-artefacts-zags-inform/types/4.0.4")
        protected String otchestvo;
        @XmlElement(name = "ПрОтчество", namespace = "urn://x-artefacts-zags-inform/types/4.0.4")
        protected String prOtchestvo;

    }

}
