
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ���������, �������������� ������, ��������������
 *
 * <p>Java class for TPaymentDocumentRestr complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TPaymentDocumentRestr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Documents}TPaymentDocument">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="documentTypes" type="{http://rosreestr.ru/services/v0.1/commons/Documents}DocumentTypes" maxOccurs="2"/>
 *           &lt;element name="name" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SDocName" minOccurs="0"/>
 *           &lt;element name="number" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SDocNumber" minOccurs="0"/>
 *           &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           &lt;element name="attachment" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TAttachment" minOccurs="0"/>
 *           &lt;element name="notes" type="{http://rosreestr.ru/services/v0.1/commons/Commons}TNote" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="series" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="issuer" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TIssuerInfo" minOccurs="0"/>
 *           &lt;element name="durationStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           &lt;element name="durationStop" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           &lt;element name="notaryInfo" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TNotaryInfo" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="supplierBillId" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SDocNumber" minOccurs="0"/>
 *           &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *           &lt;element name="OKTMO" type="{http://rosreestr.ru/services/v0.1/commons/Commons}SOKTMO" minOccurs="0"/>
 *           &lt;element name="BIC" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SBIC" minOccurs="0"/>
 *           &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="settlementAccount" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SSettlementAccount" minOccurs="0"/>
 *           &lt;element name="payerFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="idPayers" type="{http://rosreestr.ru/services/v0.1/commons/Documents}idPayersType"/>
 *           &lt;element name="offline" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TOffline" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPaymentDocumentRestr", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
public class TPaymentDocumentRestr
    extends TPaymentDocument
{


}
