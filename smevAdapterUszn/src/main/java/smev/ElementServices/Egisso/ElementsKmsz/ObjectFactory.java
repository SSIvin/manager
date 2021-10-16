
package smev.ElementServices.Egisso.ElementsKmsz;

import smev.ElementServices.Egisso.RequestAttachment;
import smev.ElementServices.Egisso.Response;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {



    public ObjectFactory() {
    }

    public Request createRequest() {
        return new Request();
    }

    public PackageKMSZ createPackageKMSZ() {
        return new PackageKMSZ();
    }

}
