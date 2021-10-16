
package smev.ElementServices.ZagsBrakRastor;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о документе основании
 *
 * <p>Java class for СведДокОснТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="СведДокОснТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ЗапАктОсн" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}ЗапАктТип"/>
 *         &lt;element name="ДокОсн" type="{urn://x-artefacts-zags-brakrastinf/types/4.0.0}СведДокТип"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "СведДокОснТип", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0", propOrder = {
    "запАктОсн",
    "докОсн"
})
@Data
public class СведДокОснТип {

    @XmlElement(name = "ЗапАктОсн", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected ЗапАктТип запАктОсн;
    @XmlElement(name = "ДокОсн", namespace = "urn://x-artefacts-zags-brakrastinf/types/4.0.0")
    protected СведДокТип докОсн;

}
