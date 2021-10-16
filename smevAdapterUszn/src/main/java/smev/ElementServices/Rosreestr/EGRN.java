
package smev.ElementServices.Rosreestr;

import lombok.Data;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;
import smev.utils.LocalDateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "EGRNRequest")
@Data
public class EGRN implements TypeBussines {

    private DocumentPerson documentPerson;
    private Person person;
    private Period period;

//    @XmlAttribute(name = "familyName", required = true)
//    protected String familyName;

    @Override
    public Object tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Data
    public static class DocumentPerson {

        @XmlAttribute(name = "docCodeReestr", required = true)
        private Integer docCodeReestr;

        @XmlAttribute(name = "docSeries", required = true)
        private String docSeries;

        @XmlAttribute(name = "docNumber", required = true)
        private String docNumber;

        @XmlAttribute(name = "issueDate", required = true)
        @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
        private LocalDate issueDate;
    }

    @Data
    public static class Person {

        @XmlAttribute(name = "surname", required = true)
        private String surname;

        @XmlAttribute(name = "secname", required = true)
        private String secname;

        @XmlAttribute(name = "patronymic")
        private String patronymic;

        @XmlAttribute(name = "snils")
        private String snils;

        @XmlAttribute(name = "birthday")
        @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
        private LocalDate birthday;

    }

    @Data
    public static class Period {

        @XmlAttribute(name = "dateStart")
        @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
        private LocalDate dateStart;

        @XmlAttribute(name = "dateEnd")
        @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
        private LocalDate dateEnd;

        @XmlAttribute(name = "date")
        @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
        private LocalDate date;


    }


}
