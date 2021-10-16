package smev.ElementServices.Egisso.ElementsKmsz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NPA")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NPA {
    @XmlElement(name = "number", namespace = Namespaces.etlmsz)
    private String number;

    @XmlElement(name = "date", namespace = Namespaces.etlmsz)
    private String date;

    @XmlElement(name = "title", namespace = Namespaces.etlmsz)
    private String title;

    @XmlElement(name = "authority", namespace = Namespaces.etlmsz)
    private String authority;

    @XmlElement(name = "URL", namespace = Namespaces.etlmsz)
    private String URL;
}
