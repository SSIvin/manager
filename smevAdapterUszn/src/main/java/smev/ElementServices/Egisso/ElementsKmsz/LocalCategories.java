package smev.ElementServices.Egisso.ElementsKmsz;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "localCategories")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class LocalCategories {

    @XmlElement(name = "localCategory")
    private List<LocalCategory> localCategory = null;

}
