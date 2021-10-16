package smev.ElementServices.Report;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrgParam {

//    @XmlElement(name = "codePartKMSZ", namespace = Namespaces.etlmsz)
    private String nameOrganization;

//    @XmlElement(required = true)
    private Integer idR;

}
