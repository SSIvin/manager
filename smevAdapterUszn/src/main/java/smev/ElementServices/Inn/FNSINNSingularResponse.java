package smev.ElementServices.Inn;

import lombok.Data;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "")
@XmlRootElement(name = "FNSINNSingularResponse")//, namespace = "urn://x-artefacts-fns-inn-singular/root/270-18/4.0.1")
@Data
public class FNSINNSingularResponse {

    @XmlAttribute(name = "ИдЗапрос", required = true)
    protected String idZapros;
    @XmlAttribute(name = "ИННФЛ")
    protected String innFl;

}
