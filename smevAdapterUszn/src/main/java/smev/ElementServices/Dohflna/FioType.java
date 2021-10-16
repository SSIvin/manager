
package smev.ElementServices.Dohflna;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ФИОТип", namespace = "urn://x-artefacts-fns-svviplfl/types/114-43/4.0.0")
@Data
public class FioType {

    @XmlAttribute(name = "Фамилия", required = true)
    protected String familyName;
    @XmlAttribute(name = "Имя", required = true)
    protected String firstName;
    @XmlAttribute(name = "Отчество")
    protected String patronymic;

}
