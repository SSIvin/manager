package smev.ElementServices.Egisso.ElementsKmsz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.sql.Timestamp;
import java.util.List;

@XmlRootElement(name = "package")
@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@Data
@NoArgsConstructor
public
class PackageKMSZ {

    @XmlElement(name = "packageId", namespace = Namespaces.etplmsz)
    private String packageId;

    @XmlTransient
    private Timestamp CreateDate;

    @XmlTransient
    private String FILE_NAME;

    @XmlElementWrapper(name = "elements", namespace = Namespaces.etplmsz)
    @XmlElement(name = "localMSZ", namespace = Namespaces.etplmsz)
    private List<LocalMSZ> localMSZ;

    public PackageKMSZ(String packageId) {
        this.packageId = packageId;
    }

}
