package smev.Egisso.Elements.ElementsNazn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "exemptionForm")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExemptionForm {

    @XmlElement(name = "amount", namespace = Namespaces.af)
    private String amount;

    @XmlElement(name = "measuryCode", namespace = Namespaces.af)
    private String measuryCode;

    @XmlElement(name = "monetization", namespace = Namespaces.af)
    private Boolean monetization;

    @XmlElement(name = "equivalentAmount", namespace = Namespaces.af)
    private String equivalentAmount;

}
