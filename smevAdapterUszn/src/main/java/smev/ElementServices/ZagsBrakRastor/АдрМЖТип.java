
package smev.ElementServices.ZagsBrakRastor;

import lombok.Data;
import smev.ElementServices.ZagsBrakZak.АдрРФТип;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Адрес места жительства
 *
 * <p>Java class for АдрМЖТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="АдрМЖТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="АдрМЖРФ">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="АдрРФФИАС" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}АдрРФТип"/>
 *                   &lt;element name="АдрРФНеФИАС" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}АдрРФТип"/>
 *                   &lt;element name="АдрТекст" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-512"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="АдрМЖИн">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="ПрОКСМ">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
 *                           &lt;enumeration value="1"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="ОКСМ" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ОКСМТип"/>
 *                   &lt;/choice>
 *                   &lt;element name="АдрТекст" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-512"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="АдрМЖКонв" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-512"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "АдрМЖТип", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0", propOrder = {
    "адрМЖРФ",
    "адрМЖИн",
    "адрМЖКонв"
})
@Data
public class АдрМЖТип {

    @XmlElement(name = "АдрМЖРФ", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected АдрМЖТип.АдрМЖРФ адрМЖРФ;
    @XmlElement(name = "АдрМЖИн", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected АдрМЖТип.АдрМЖИн адрМЖИн;
    @XmlElement(name = "АдрМЖКонв", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected String адрМЖКонв;


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "прОКСМ",
        "оксм",
        "адрТекст"
    })
    @Data
    public static class АдрМЖИн {

        @XmlElement(name = "ПрОКСМ", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
        protected String прОКСМ;
        @XmlElement(name = "ОКСМ", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
        protected String оксм;
        @XmlElement(name = "АдрТекст", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0", required = true)
        protected String адрТекст;

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "адрРФФИАС",
        "адрРФНеФИАС",
        "адрТекст"
    })
@Data
    public static class АдрМЖРФ {

        @XmlElement(name = "АдрРФФИАС", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
        protected АдрРФТип адрРФФИАС;
        @XmlElement(name = "АдрРФНеФИАС", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
        protected АдрРФТип адрРФНеФИАС;
        @XmlElement(name = "АдрТекст", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
        protected String адрТекст;


    }

}
