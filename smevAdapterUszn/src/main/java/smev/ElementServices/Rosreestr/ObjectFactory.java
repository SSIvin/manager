
package smev.ElementServices.Rosreestr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the swiplfl package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Request_QNAME = new QName("http://rosreestr.ru/services/v0.12/TRequest", "request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: swiplfl
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TRequest }
     *
     */
    public TRequest createTRequest() {
        return new TRequest();
    }

    public Trequest2 createTrequest2() {
        return new Trequest2();
    }


    public TEGRNRequest createTEGRNRequest() {
        return new TEGRNRequest();
    }
    /**
     * Create an instance of {@link TFile }
     *
     */
    public TFile createTFile() {
        return new TFile();
    }

    /**
     * Create an instance of {@link TStatementFile }
     *
     */
    public TStatementFile createTStatementFile() {
        return new TStatementFile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://rosreestr.ru/services/v0.12/TRequest", name = "request")
    public JAXBElement<TRequest> createRequest(TRequest value) {
        return new JAXBElement<TRequest>(_Request_QNAME, TRequest.class, null, value);
    }

}
