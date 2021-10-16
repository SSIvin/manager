package smev.Egisso.Elements.ElementsNazn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "prsnInfo")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrsnInfo {

    @XmlTransient
    private String ID;

    @XmlElement(name = "SNILS", namespace = Namespaces.prsn)
    private String SNILS;

    @XmlElement(name = "FamilyName", namespace = Namespaces.smev)
    private String FamilyName;

    @XmlElement(name = "FirstName", namespace = Namespaces.smev)
    private String FirstName;

    @XmlElement(name = "Patronymic", namespace = Namespaces.smev)
    private String Patronymic;

    @XmlElement(name = "Gender", namespace = Namespaces.prsn)
    private String Gender;

    @XmlElement(name = "BirthDate", namespace = Namespaces.prsn)
    private String BirthDate;
}
