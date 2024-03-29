package smev.ElementServices.Egisso.ElementsKmsz;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "cofinancing")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Cofinancing {

    @XmlElement(name = "fundingSource")
    private List<FundingSource> fundingSources = null;

}
