package smev.Egisso.Elements.ElementsProtocol;

import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn://egisso-ru/types/package-result/1.0.2}packageID"/>
 *         &lt;element ref="{urn://egisso-ru/types/package-result/1.0.2}packageType"/>
 *         &lt;element ref="{urn://egisso-ru/types/package-result/1.0.2}packageStatus"/>
 *         &lt;element ref="{urn://egisso-ru/types/package-result/1.0.2}receivingTime"/>
 *         &lt;element ref="{urn://egisso-ru/types/package-result/1.0.2}startProcessTime"/>
 *         &lt;element ref="{urn://egisso-ru/types/package-result/1.0.2}finishProcessTime"/>
 *         &lt;element ref="{urn://egisso-ru/types/package-result/1.0.2}recordNum"/>
 *         &lt;element ref="{urn://egisso-ru/types/package-result/1.0.2}recordNumSuccess"/>
 *         &lt;element ref="{urn://egisso-ru/types/package-protocol/1.0.3}errorRecords"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "packageID",
        "packageType",
        "packageStatus",
        "receivingTime",
        "startProcessTime",
        "finishProcessTime",
        "recordNum",
        "recordNumSuccess",
        "errorRecords"
})
@XmlRootElement(name = "packageResult")
@Data
public class PackageResult {

    @XmlElement(required = true)
    protected String packageID;
    @XmlElement(required = true)
    protected String packageType;
    @XmlElement(required = true)
    protected BigInteger packageStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivingTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startProcessTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishProcessTime;
    @XmlElement(required = true)
    protected BigInteger recordNum;
    @XmlElement(required = true)
    protected BigInteger recordNumSuccess;
    @XmlElement(required = true)
    protected ErrorRecords errorRecords;

}
