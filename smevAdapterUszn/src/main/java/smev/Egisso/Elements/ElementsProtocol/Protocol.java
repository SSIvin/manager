package smev.Egisso.Elements.ElementsProtocol;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "messageResult",
        "packageResult"
})
@XmlRootElement(name = "protocol")
@Data
public class Protocol {

    @XmlElement()
    protected MessageResult messageResult;

    @XmlElement()
    private PackageResult packageResult;

}
