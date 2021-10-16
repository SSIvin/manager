
package smev.ElementServices.Dohflna;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;

/**********************************************************************************
* Ответ на запрос сведений о выплатах, произведенных плательщиками страховых
* взносов в пользу физических лиц
* *******************************************************************************/

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fio",
    "svedDoh"
})
@XmlRootElement(name = "SVVIPLFLResponse", namespace = "urn://x-artefacts-fns-svviplfl/root/114-43/4.0.0")
@Data
public class SVVIPLFLResponse {

    @XmlElement(name = "ФИО", namespace = "urn://x-artefacts-fns-svviplfl/root/114-43/4.0.0", required = true)
    protected FioType fio;

    @XmlElement(name = "СведДох", namespace = "urn://x-artefacts-fns-svviplfl/root/114-43/4.0.0", required = true)
    protected List<SvedDoh> svedDoh;

    @XmlAttribute(name = "ИдЗапрос", required = true)
    protected String idZapros;

    @XmlAttribute(name = "ИдОтвет", required = true)
    protected String idOtvet;

    @XmlAttribute(name = "СНИЛС", required = true)
    protected String snils;

    @XmlAttribute(name = "ИННФЛ")
    protected String innFl;


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "svedYl",
        "svedFl",
        "svedVipl"
    })
    @Data
    public static class SvedDoh {

        @XmlElement(name = "СведЮЛ", namespace = "urn://x-artefacts-fns-svviplfl/root/114-43/4.0.0")
        protected SvedYl svedYl;

        @XmlElement(name = "СведФЛ", namespace = "urn://x-artefacts-fns-svviplfl/root/114-43/4.0.0")
        protected SvedFl svedFl;

        @XmlElement(name = "СведВыпл", namespace = "urn://x-artefacts-fns-svviplfl/root/114-43/4.0.0", required = true)
        protected List<SvedVipl> svedVipl;


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        @Data
        public static class SvedVipl {

            @XmlAttribute(name = "Год", required = true)
            @XmlSchemaType(name = "gYear")
            protected Integer god;

            @XmlAttribute(name = "Месяц", required = true)
            protected String month;

            @XmlAttribute(name = "СумДох", required = true)
            protected BigDecimal sumDoh;


        }



        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "fio"
        })
        @Data
        public static class SvedFl {

            @XmlElement(name = "ФИО", namespace = "urn://x-artefacts-fns-svviplfl/root/114-43/4.0.0", required = true)
            protected FioType fio;

            @XmlAttribute(name = "ИННФЛ", required = true)
            protected String innFl;


        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        @Data
        public static class SvedYl {

            @XmlAttribute(name = "НаимОрг", required = true)
            protected String nameOrg;

            @XmlAttribute(name = "ИННЮЛ", required = true)
            protected String innYl;

            @XmlAttribute(name = "КПП", required = true)
            protected String kpp;

        }

    }

}
