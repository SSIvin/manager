package smev.ElementServices.Egisso.ElementsKmsz;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "localMSZ")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocalMSZ {

    @XmlElement(name = "ID", namespace = Namespaces.etlmsz)
    private String ID;

    @XmlElement(name = "code", namespace = Namespaces.etlmsz)
    private String code;

    @XmlElement(name = "title", namespace = Namespaces.etlmsz)
    private String title;

    @XmlElement(name = "dateEnact", namespace = Namespaces.etlmsz)
    private String dateEnact;

    @XmlElement(name = "dateExpiration", namespace = Namespaces.etlmsz)
    private String dateExpiration;

    @XmlElement(name = "periodicityCode", namespace = Namespaces.etlmsz)
    private String periodicityCode;


    @XmlElement(name = "classificationKMSZ", namespace = Namespaces.etlmsz)
    private ClassificationKMSZ classificationKMSZ;

    @XmlElement(name = "estimation", namespace = Namespaces.etlmsz)
    private String estimation;

    @XmlElement(name = "territories", namespace = Namespaces.etlmsz)
    private Territories territories;

    @XmlElementWrapper(name = "reasons", namespace = Namespaces.etlmsz)
    @XmlElement(name = "NPA", namespace = Namespaces.etlmsz)
    private List<NPA> npaList;

    @XmlElement(name = "KBKCode", namespace = Namespaces.etlmsz)
    private String KBKCode;

    @XmlElement(name = "cases", namespace = Namespaces.etlmsz)
    private String cases;

    @XmlElement(name = "conditions", namespace = Namespaces.etlmsz)
    private String conditions;

    @XmlElement(name = "methods", namespace = Namespaces.etlmsz)
    private List<Method> methods;

    @XmlElement(name = "formReq", namespace = Namespaces.etlmsz)
    private List<Integer> formReq;

    @XmlElement(name = "formRecieve", namespace = Namespaces.etlmsz)
    private List<Integer> formRecieve;

    @XmlElement(name = "docTypesList", namespace = Namespaces.etlmsz)
    private List<DocTypesList> docTypesList;

    @XmlElement(name = "stepsForMSZ", namespace = Namespaces.etlmsz)
    private List<StepsForMSZ> stepsForMSZ;

    //	ISO 8601
    @XmlElement(name = "lastChanging", namespace = Namespaces.etplmsz)
    private String lastChanging;

    @XmlElement(name = "previousID", namespace = Namespaces.etplmsz)
    private String previousID;

    public LocalMSZ(String ID
            , String code
            , String title
            , String dateEnact, String dateExpiration
            , String periodicityCode, String KBKCode
            , String cases, String conditions
            , String estimation
            , String lastChanging
            , String previousID) {
        this.ID = ID;
        this.code = code;
        this.title = title;
        this.dateEnact = dateEnact;
        this.dateExpiration = dateExpiration;
        this.periodicityCode = periodicityCode;
        this.KBKCode = KBKCode;
        this.cases = cases;
        this.conditions = conditions;
        this.estimation = estimation;
        this.lastChanging = lastChanging;
        this.previousID = previousID;
    }

    public LocalMSZ(String ID, String code, String title, String dateEnact, String dateExpiration) {
        this.ID = ID;
        this.code = code;
        this.title = title;
        this.dateEnact = dateEnact;
        this.dateExpiration = dateExpiration;
        this.periodicityCode = periodicityCode;
    }


}
