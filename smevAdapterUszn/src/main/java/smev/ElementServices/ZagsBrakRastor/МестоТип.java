
package smev.ElementServices.ZagsBrakRastor;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Место
 *
 * <p>Java class for МестоТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="МестоТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ПризнМесто" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="МестоТекст" use="required" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-512" />
 *       &lt;attribute name="КодСтраны" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ОКСМТип" />
 *       &lt;attribute name="НаимСтраны" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-255" />
 *       &lt;attribute name="Регион" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ССРФТип" />
 *       &lt;attribute name="НаимСубъект" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-50" />
 *       &lt;attribute name="Район" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-50" />
 *       &lt;attribute name="Город" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-50" />
 *       &lt;attribute name="НаселПункт" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-50" />
 *       &lt;attribute name="ОКТМО" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ОКТМОТипН" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "МестоТип", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
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
