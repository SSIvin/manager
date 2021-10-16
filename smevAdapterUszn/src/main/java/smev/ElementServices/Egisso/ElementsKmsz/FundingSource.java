package smev.ElementServices.Egisso.ElementsKmsz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "fundingSource")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FundingSource {

    @XmlElement(name = "codeFundingSource", namespace = Namespaces.etlmsz)
    private String codeFundingSource;

    @XmlElement(name = "quota", namespace = Namespaces.etlmsz)
    private String quota;

}
