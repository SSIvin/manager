package smev.ElementServices.Egisso.ElementsKmsz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "docTypesList")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocTypesList {

    @XmlElement(name = "documentTypeName", namespace = Namespaces.etlmsz)
    private String documentTypeName;

    @XmlElement(name = "documentOrigin", namespace = Namespaces.etlmsz)
    private String documentOrigin;

    @XmlElement(name = "documentQ", namespace = Namespaces.etlmsz)
    private int documentQ;

    @XmlElement(name = "documentNess", namespace = Namespaces.etlmsz)
    private boolean documentNess;

    @XmlElement(name = "documentComment", namespace = Namespaces.etlmsz)
    private String documentComment;
}
