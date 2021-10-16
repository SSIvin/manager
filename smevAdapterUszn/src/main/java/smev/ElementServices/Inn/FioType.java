package smev.ElementServices.Inn;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/*
* Фамилия, имя, отчество физического лица
*
* */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FioType", namespace = "urn://x-artefacts-fns-inn/commons/4.0.0")
@Data
public class FioType {

    @XmlAttribute(name = "Фамилия", required = true)
    protected String family;

    @XmlAttribute(name = "Имя", required = true)
    protected String name;

    @XmlAttribute(name = "Отчество")
    protected String otchestvo;

}
