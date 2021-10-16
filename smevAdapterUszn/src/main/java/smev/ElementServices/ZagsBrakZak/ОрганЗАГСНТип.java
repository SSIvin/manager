
package smev.ElementServices.ZagsBrakZak;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения об органе, которым произведена государственная регистрация акта гражданского состояния
 *
 * <p>Java class for ОрганЗАГСНТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ОрганЗАГСНТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="НаимЗАГС" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1000" />
 *       &lt;attribute name="КодЗАГС" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-8" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ОрганЗАГСНТип", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
@Data
public class ОрганЗАГСНТип {

    @XmlAttribute(name = "НаимЗАГС", required = true)
    protected String наимЗАГС;
    @XmlAttribute(name = "КодЗАГС")
    protected String кодЗАГС;

}
