package smev.Egisso.Elements.ProtocolEgisso;

import lombok.Data;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "protocol"
})
@XmlRootElement(name = "response", namespace = NamespacesMSZ.msg)
@Data
public class ResponseNamespace {

    @XmlElement(name = "protocol",namespace = NamespacesMSZ.pac)
    protected ProtocolNamespace protocol;


}

