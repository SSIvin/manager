package smev.Egisso.Elements.ElementsNazn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

//@XmlRootElement(namespace = "//o7planning.org/jaxb")
@XmlRootElement(name = "data")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataNazn {

    @XmlTransient
    private String fileName;

    @XmlTransient
    private String packageFileGuid;

    @XmlElement(name = "package", namespace = Namespaces.pac)
    private PackageFACT aPackage;
}
