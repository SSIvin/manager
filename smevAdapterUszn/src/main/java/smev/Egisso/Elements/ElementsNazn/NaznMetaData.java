package smev.Egisso.Elements.ElementsNazn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
public class NaznMetaData {

    private PackageGlobleFact packageGlobalFact;

    private DataNazn dataNazn;
    private List<NaznFile> listFileNazn;

    @XmlRootElement(name = "data")
    @XmlAccessorType(XmlAccessType.FIELD)
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DataNazn {

        @XmlElement(name = "package", namespace = Namespaces.pac)
        private PackageFACT aPackage;
    }

    @Data
    @AllArgsConstructor
    public static class PackageGlobleFact {

        private String idGlobalPackageFact;
        private Short statusPackage;

    }



}
