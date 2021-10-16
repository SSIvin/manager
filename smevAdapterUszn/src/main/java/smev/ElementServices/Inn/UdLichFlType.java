package smev.ElementServices.Inn;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Сведения о документе, удостоверяющем личность физического лица
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UdLichFlType", namespace = "urn://x-artefacts-fns-inn/commons/4.0.0")
@Data
public class UdLichFlType {

    @XmlAttribute(name = "КодВидДок", required = true)
    protected String kodVidDoc;
    @XmlAttribute(name = "СерНомДок", required = true)
    protected String serNumDoc;
    @XmlAttribute(name = "ДатаДок")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateDoc;
    @XmlAttribute(name = "ВыдДок")
    protected String vydDoc;
    @XmlAttribute(name = "КодВыдДок")
    protected String kodVydDoc;
}
