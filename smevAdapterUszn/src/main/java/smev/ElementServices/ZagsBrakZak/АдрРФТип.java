
package smev.ElementServices.ZagsBrakZak;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Адрес места жительства на территории Российской Федерации
 *
 * <p>Java class for АдрРФТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="АдрРФТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="АдрТекст" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-512" />
 *       &lt;attribute name="ИдНом" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-36" />
 *       &lt;attribute name="ОКТМО" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ОКТМОТипН" />
 *       &lt;attribute name="Индекс" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}digits-6" />
 *       &lt;attribute name="КодРегион" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}ССРФТип" />
 *       &lt;attribute name="НаимРегион" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-50" />
 *       &lt;attribute name="Район" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-50" />
 *       &lt;attribute name="Город" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-50" />
 *       &lt;attribute name="НаселПункт" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-50" />
 *       &lt;attribute name="Улица" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-50" />
 *       &lt;attribute name="Дом" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-20" />
 *       &lt;attribute name="Корпус" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-20" />
 *       &lt;attribute name="Кварт" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-20" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "АдрРФТип", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
@Data
public class АдрРФТип {

    @XmlAttribute(name = "АдрТекст", required = true)
    protected String адрТекст;
    @XmlAttribute(name = "ИдНом")
    protected String идНом;
    @XmlAttribute(name = "ОКТМО")
    protected String октмо;
    @XmlAttribute(name = "Индекс")
    protected String индекс;
    @XmlAttribute(name = "КодРегион", required = true)
    protected String кодРегион;
    @XmlAttribute(name = "НаимРегион", required = true)
    protected String наимРегион;
    @XmlAttribute(name = "Район")
    protected String район;
    @XmlAttribute(name = "Город")
    protected String город;
    @XmlAttribute(name = "НаселПункт")
    protected String населПункт;
    @XmlAttribute(name = "Улица")
    protected String улица;
    @XmlAttribute(name = "Дом")
    protected String дом;
    @XmlAttribute(name = "Корпус")
    protected String корпус;
    @XmlAttribute(name = "Кварт")
    protected String кварт;


}
