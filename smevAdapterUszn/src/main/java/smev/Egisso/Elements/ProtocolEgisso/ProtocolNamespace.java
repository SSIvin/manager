package smev.Egisso.Elements.ProtocolEgisso;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "packageResult"
})
@XmlRootElement(name = "protocol")
@Data
public class ProtocolNamespace {

    @XmlElement(required = true, namespace = NamespacesMSZ.pac)
    private PackageResultNamespace packageResult;


    public PackageResultNamespace getPackageResult() {
        return packageResult;
    }

}
