
package smev.ElementServices.Dohflna;

import lombok.Data;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;
import smev.utils.LocalDateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;


/*******************************************************
* Запрос сведений о выплатах, произведенных плательщиками страховых взносов в пользу физических лиц
* * ***********************************************************/

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fio"
})
@XmlRootElement(name = "SVVIPLFLRequest", namespace = "urn://x-artefacts-fns-svviplfl/root/114-43/4.0.0")
@Data
public class SVVIPLFLRequest implements TypeBussines {

    @XmlElement(name = "ФИО", namespace = "urn://x-artefacts-fns-svviplfl/root/114-43/4.0.0", required = true)
    protected FioType fio;

    @XmlAttribute(name = "ИдЗапрос", required = true)
    protected String idZapros;

    @XmlAttribute(name = "СНИЛС", required = true)
    protected String snils;

    @XmlAttribute(name = "ИННФЛ")
    protected String innFl;

    @XmlAttribute(name = "ДатаРожд", required = true)
    //@XmlSchemaType(name = "date")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    protected LocalDate birthday;

    @XmlAttribute(name = "Период", required = true)
    protected String period;


    @Override
    public Object tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }
}
