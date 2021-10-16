
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ��������, � �������������� ������
 *
 * <p>Java class for TDocumentSeries complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TDocumentSeries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Documents}TStrictDocument">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="documentTypes" type="{http://rosreestr.ru/services/v0.1/commons/Documents}DocumentTypes" maxOccurs="2"/>
 *           &lt;element name="name" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SDocName" minOccurs="0"/>
 *           &lt;element name="number" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SDocNumber" minOccurs="0"/>
 *           &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           &lt;element name="attachment" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TAttachment" minOccurs="0"/>
 *           &lt;element name="notes" type="{http://rosreestr.ru/services/v0.1/commons/Commons}TNote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="series" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "TDocumentSeries", namespace = "http://rosreestr.ru/services/v0.1/commons/Documents")
public class TDocumentSeries
    extends TStrictDocument
{


}
