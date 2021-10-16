
package smev.ElementServices.Rosreestr;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Описание файла документа
 *
 * <p>Java class for TAttachmentFile complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TAttachmentFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileURI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="md5sum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="fileCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAttachmentFile", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", propOrder = {
    "fileURI",
    "md5Sum",
    "fileSize",
    "fileCreationDate"
})
public class TAttachmentFile {

    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", required = true)
    protected String fileURI;
    @XmlElement(name = "md5sum", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents", required = true)
    protected String md5Sum;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    protected BigInteger fileSize;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fileCreationDate;

    /**
     * Gets the value of the fileURI property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFileURI() {
        return fileURI;
    }

    /**
     * Sets the value of the fileURI property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFileURI(String value) {
        this.fileURI = value;
    }

    /**
     * Gets the value of the md5Sum property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMd5Sum() {
        return md5Sum;
    }

    /**
     * Sets the value of the md5Sum property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMd5Sum(String value) {
        this.md5Sum = value;
    }

    /**
     * Gets the value of the fileSize property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setFileSize(BigInteger value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the fileCreationDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFileCreationDate() {
        return fileCreationDate;
    }

    /**
     * Sets the value of the fileCreationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFileCreationDate(XMLGregorianCalendar value) {
        this.fileCreationDate = value;
    }

}
