
package smev.ElementServices.Rosreestr;

import lombok.Data;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;
import smev.Wrapper.RequestRosreestrRequest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * Техническое описание пакета электронных документов
 *
 * <p>Java class for TRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statementFile" type="{http://rosreestr.ru/services/v0.12/TRequest}TStatementFile" maxOccurs="unbounded"/>
 *         &lt;element name="file" type="{http://rosreestr.ru/services/v0.12/TRequest}TFile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requestType" type="{http://rosreestr.ru/services/v0.1/commons/directories/requestType}DRequestType"/>
 *         &lt;element name="paperDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRequest", namespace = "urn://x-artefacts-rosreestr-gov-ru/virtual-services/egrn-statement/1.1.2", propOrder = {
        "region",
        "externalNumber",
        "senderType",
        "actionCode",
        "attachment",
        "statementFile",
        "file",
        "requestType",
        "paperDocuments"
})
@XmlRootElement(name = "Request", namespace = "urn://x-artefacts-rosreestr-gov-ru/virtual-services/egrn-statement/1.1.2")
@Data
public class TRequest implements TypeBussines {

    @XmlElement(required = true)
    protected Integer region;

    @XmlElement(required = true)
    protected String externalNumber;

    @XmlElement(required = true)
    protected String senderType;

    @XmlElement(required = true)
    protected String actionCode;

    @XmlElement(name = "Attachment", required = true)
    protected AttachmentRequestType attachment;

    @XmlElement(required = true)
    protected List<TStatementFile> statementFile;

    @XmlElement()
    protected List<TFile> file;

    @XmlElement(required = true)
    protected String requestType;

    @XmlElement()
    protected Boolean paperDocuments;

    /**
     * Gets the value of the statementFile property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementFile property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementFile().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TStatementFile }
     */
    public List<TStatementFile> getStatementFile() {
        if (statementFile == null) {
            statementFile = new ArrayList<TStatementFile>();
        }
        return this.statementFile;
    }

    /**
     * Gets the value of the file property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the file property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFile().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TFile }
     */
    public List<TFile> getFile() {
        if (file == null) {
            file = new ArrayList<TFile>();
        }
        return this.file;
    }

    /**
     * Gets the value of the requestType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the paperDocuments property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPaperDocuments() {
        return paperDocuments;
    }

    /**
     * Sets the value of the paperDocuments property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPaperDocuments(Boolean value) {
        this.paperDocuments = value;
    }

    @Override
    public Object tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        RequestRosreestrRequest requestRosreestrRequest = new RequestRosreestrRequest();
        return requestRosreestrRequest.fillObj(businessService, messageEntity);
    }
}
