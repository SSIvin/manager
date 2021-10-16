
package smev.ElementServices.ZagsBrakRastor;

import lombok.Data;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о дате по представленным документам
 *
 * <p>Java class for ДатаДокТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ДатаДокТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ПрДень">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="День" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}number-2"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="ПрМесяц">
 *             &lt;simpleType>
 *               &lt;restriction base="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}string-1">
 *                 &lt;enumeration value="1"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="Месяц" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}number-2"/>
 *         &lt;/choice>
 *         &lt;element name="Год">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}gYear">
 *               &lt;minInclusive value="1826"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ДатаДокТип", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0", propOrder = {
    "прДень",
    "день",
    "прМесяц",
    "месяц",
    "год"
})
@Data
public class ДатаДокТип {

    @XmlElement(name = "ПрДень", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected String прДень;
    @XmlElement(name = "День", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected BigInteger день;
    @XmlElement(name = "ПрМесяц", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected String прМесяц;
    @XmlElement(name = "Месяц", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected BigInteger месяц;
    @XmlElement(name = "Год", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0", required = true)
    protected XMLGregorianCalendar год;

}
