package smev.Egisso.Elements.ElementsProtocol;


import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "receivingTime",
        "processingTime",
        "errors"
})
@Data
public class MessageResult {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivingTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processingTime;
    @XmlElement(required = true)
    protected Errors errors;


}
