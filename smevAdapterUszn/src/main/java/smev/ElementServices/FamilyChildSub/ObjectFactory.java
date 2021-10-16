
package smev.ElementServices.FamilyChildSub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the FamilyChildSub package.
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

    private final static QName _FormData_QNAME = new QName("http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", "FormData");
    private final static QName _FormDataResponse_QNAME = new QName("http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", "FormDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: FamilyChildSub
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FormDataType }
     *
     */
    public FormDataType createFormDataType() {
        return new FormDataType();
    }

    /**
     * Create an instance of {@link FormDataResponseType }
     *
     */
    public FormDataResponseType createFormDataResponseType() {
        return new FormDataResponseType();
    }

    /**
     * Create an instance of {@link ApplicationInfoType }
     *
     */
    public ApplicationInfoType createApplicationInfoType() {
        return new ApplicationInfoType();
    }

    /**
     * Create an instance of {@link DocInfoType }
     *
     */
    public DocInfoType createDocInfoType() {
        return new DocInfoType();
    }

    /**
     * Create an instance of {@link StatusCodeType }
     *
     */
    public StatusCodeType createStatusCodeType() {
        return new StatusCodeType();
    }

    /**
     * Create an instance of {@link PostInfoType }
     *
     */
    public PostInfoType createPostInfoType() {
        return new PostInfoType();
    }

    /**
     * Create an instance of {@link RelativesInfoType }
     *
     */
    public RelativesInfoType createRelativesInfoType() {
        return new RelativesInfoType();
    }

    /**
     * Create an instance of {@link TransferInfoType }
     *
     */
    public TransferInfoType createTransferInfoType() {
        return new TransferInfoType();
    }

    /**
     * Create an instance of {@link OrderIdType }
     *
     */
    public OrderIdType createOrderIdType() {
        return new OrderIdType();
    }

    /**
     * Create an instance of {@link IncomeInfoType }
     *
     */
    public IncomeInfoType createIncomeInfoType() {
        return new IncomeInfoType();
    }

    /**
     * Create an instance of {@link PersonInfoType }
     *
     */
    public PersonInfoType createPersonInfoType() {
        return new PersonInfoType();
    }

    /**
     * Create an instance of {@link BankInfoType }
     *
     */
    public BankInfoType createBankInfoType() {
        return new BankInfoType();
    }

    /**
     * Create an instance of {@link IncomeType }
     *
     */
    public IncomeType createIncomeType() {
        return new IncomeType();
    }

    /**
     * Create an instance of {@link ChangeOrderInfoType }
     *
     */
    public ChangeOrderInfoType createChangeOrderInfoType() {
        return new ChangeOrderInfoType();
    }

    /**
     * Create an instance of {@link FamilyInfoType }
     *
     */
    public FamilyInfoType createFamilyInfoType() {
        return new FamilyInfoType();
    }

    /**
     * Create an instance of {@link PersonIdentityDocInfoType }
     *
     */
    public PersonIdentityDocInfoType createPersonIdentityDocInfoType() {
        return new PersonIdentityDocInfoType();
    }

    /**
     * Create an instance of {@link AddressInfoType }
     *
     */
    public AddressInfoType createAddressInfoType() {
        return new AddressInfoType();
    }

    /**
     * Create an instance of {@link DataElementType }
     *
     */
    public DataElementType createDataElementType() {
        return new DataElementType();
    }

    /**
     * Create an instance of {@link AddressType }
     *
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormDataType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", name = "FormData")
    public JAXBElement<FormDataType> createFormData(FormDataType value) {
        return new JAXBElement<FormDataType>(_FormData_QNAME, FormDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormDataResponseType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", name = "FormDataResponse")
    public JAXBElement<FormDataResponseType> createFormDataResponse(FormDataResponseType value) {
        return new JAXBElement<FormDataResponseType>(_FormDataResponse_QNAME, FormDataResponseType.class, null, value);
    }

}
