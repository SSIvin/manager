package smev.ElementServices.Egisso.ElementsKmsz;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "reasons")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Reasons {
    @XmlElement(name = "NPA")
    private List<NPA> npaList = null;

}
