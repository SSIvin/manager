package smev.Egisso.Elements.ElementsNazn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "package")
@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@Data
@NoArgsConstructor
public
class PackageFACT {

    @XmlTransient
    private String fileName;

    @XmlElement(name = "packageID", namespace = Namespaces.pac)
    private String packageId;

    @XmlElementWrapper(name = "elements", namespace = Namespaces.pac)
    @XmlElement(name = "fact", namespace = Namespaces.pac)
    private List<Fact> fact;

    @XmlElementWrapper(name = "elements", namespace = Namespaces.pac)
    @XmlElement(name = "termination", namespace = Namespaces.pac)
    private List<Termination> termination;

    public PackageFACT(String packageId) {
        this.packageId = packageId;
    }

    public PackageFACT(String fileName, String packageId) {
        this.fileName = fileName;
        this.packageId = packageId;
    }
}
