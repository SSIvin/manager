
package smev.ElementServices.ZagsBrakZak;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Место

 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "МестоТип", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
@Data
public class МестоТип {

    @XmlAttribute(name = "ПризнМесто", required = true)
    protected String признМесто;
    @XmlAttribute(name = "МестоТекст", required = true)
    protected String местоТекст;
    @XmlAttribute(name = "КодСтраны")
    protected String кодСтраны;
    @XmlAttribute(name = "НаимСтраны")
    protected String наимСтраны;
    @XmlAttribute(name = "Регион")
    protected String регион;
    @XmlAttribute(name = "НаимСубъект")
    protected String наимСубъект;
    @XmlAttribute(name = "Район")
    protected String район;
    @XmlAttribute(name = "Город")
    protected String город;
    @XmlAttribute(name = "НаселПункт")
    protected String населПункт;
    @XmlAttribute(name = "ОКТМО")
    protected String октмо;

}
