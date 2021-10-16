
package smev.ElementServices.ZagsBrakZak;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о документе, удостоверяющем личность физического лица (серия и номер раздельно)
 *
 * <p>Java class for УдЛичнФЛСНТип complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="УдЛичнФЛСНТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="КодВидДок" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}СПДУЛТип" />
 *       &lt;attribute name="СерДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1_40" />
 *       &lt;attribute name="НомДок" use="required" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-1_40" />
 *       &lt;attribute name="ДатаДок" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ВыдДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-255" />
 *       &lt;attribute name="КодВыдДок" type="{urn://x-artefacts-zags-brakzakinf/types/4.0.0}string-7" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "УдЛичнФЛСНТип", namespace = "urn://x-artefacts-zags-brakzakinf/types/4.0.0")
@Data
public class УдЛичнФЛСНТип {

    @XmlAttribute(name = "КодВидДок", required = true)
    protected String кодВидДок;
    @XmlAttribute(name = "СерДок")
    protected String серДок;
    @XmlAttribute(name = "НомДок", required = true)
    protected String номДок;
    @XmlAttribute(name = "ДатаДок")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаДок;
    @XmlAttribute(name = "ВыдДок")
    protected String выдДок;
    @XmlAttribute(name = "КодВыдДок")
    protected String кодВыдДок;

}
