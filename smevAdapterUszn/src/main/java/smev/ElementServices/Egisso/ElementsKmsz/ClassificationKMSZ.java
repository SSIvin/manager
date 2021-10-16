package smev.ElementServices.Egisso.ElementsKmsz;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "classificationKMSZ")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClassificationKMSZ {

    @XmlElement(name = "codePartKMSZ", namespace = Namespaces.etlmsz)
    private String codePartKMSZ;

    @XmlElement(name = "codeMSZ", namespace = Namespaces.etlmsz)
    private String codeMSZ;

    @XmlElement(name = "codeProvisionForm", namespace = Namespaces.etlmsz)
    private String codeProvisionForm;

    @XmlElement(name = "codeLevelNPA", namespace = Namespaces.etlmsz)
    private String codeLevelNPA;

    @XmlElementWrapper(name = "localCategories", namespace = Namespaces.etlmsz)
    @XmlElement(name = "localCategory", namespace = Namespaces.etlmsz)
    private List<LocalCategory> localCategory;

    @XmlElementWrapper(name = "cofinancing", namespace = Namespaces.etlmsz)
    @XmlElement(name = "fundingSource", namespace = Namespaces.etlmsz)
    private List<FundingSource> fundingSources;

    public ClassificationKMSZ(String codePartKMSZ, String codeMSZ, String codeProvisionForm, String codeLevelNPA) {
        this.codePartKMSZ = codePartKMSZ;
        this.codeMSZ = codeMSZ;
        this.codeProvisionForm = codeProvisionForm;
        this.codeLevelNPA = codeLevelNPA;
    }

    public ClassificationKMSZ(String codePartKMSZ, String codeMSZ, String codeProvisionForm, String codeLevelNPA, List<LocalCategory> localCategory) {
        this.codePartKMSZ = codePartKMSZ;
        this.codeMSZ = codeMSZ;
        this.codeProvisionForm = codeProvisionForm;
        this.codeLevelNPA = codeLevelNPA;
        this.localCategory = localCategory;
    }
}
