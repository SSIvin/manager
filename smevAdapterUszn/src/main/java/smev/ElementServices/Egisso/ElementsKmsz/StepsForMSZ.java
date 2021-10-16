package smev.ElementServices.Egisso.ElementsKmsz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "stepsForMSZ")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StepsForMSZ {

    //Номер шага
    @XmlElement(name = "stepNumber", namespace = Namespaces.etlmsz)
    private int stepNumber;

    //Краткое описание действия
    @XmlElement(name = "stepH", namespace = Namespaces.etlmsz)
    private String stepH;


    //Подробное описание действия которое необходимо совершить на данном шаге
    @XmlElement(name = "stepDescr", namespace = Namespaces.etlmsz)
    private String stepDescr;
}

