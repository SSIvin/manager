
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * StrictDocument � ������������ ������� ���������
 *
 * <p>Java class for TDocumentWithNumber complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TDocumentWithNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Documents}TStrictDocument">
 *       &lt;sequence>
 *         &lt;element name="documentTypes" type="{http://rosreestr.ru/services/v0.1/commons/Documents}DocumentTypes" maxOccurs="2"/>
 *         &lt;element name="name" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SDocName" minOccurs="0"/>
 *         &lt;element name="number" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SDocNumber"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="attachment" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TAttachment" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://rosreestr.ru/services/v0.1/commons/Commons}TNote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="series" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issuer" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TIssuerInfo" minOccurs="0"/>
 *         &lt;element name="durationStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="durationStop" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="notaryInfo" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TNotaryInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDocumentWithNumber", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
@XmlSeeAlso({
    TIdDocumentRestr.class,
    TLegalAct.class
})
public class TDocumentWithNumber
    extends TStrictDocument
{


}
