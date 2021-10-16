package smev.ElementServices.Egisso.ElementsKmsz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "localCategory")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocalCategory {

    @XmlElement(name = "ID", namespace = Namespaces.etlmsz)
    private String ID;

    @XmlElement(name = "title", namespace = Namespaces.etlmsz)
    private String title;

    @XmlElement(name = "codeCategoryKMSZ", namespace = Namespaces.etlmsz)
    private String codeCategoryKMSZ;

}
