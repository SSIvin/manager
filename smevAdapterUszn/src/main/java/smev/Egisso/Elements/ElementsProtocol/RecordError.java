package smev.Egisso.Elements.ElementsProtocol;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ruleCode",
        "report"
})
@Data
public class RecordError {

    @XmlElement(required = true)
    protected String ruleCode;
    @XmlElement(required = true)
    protected String report;
}
