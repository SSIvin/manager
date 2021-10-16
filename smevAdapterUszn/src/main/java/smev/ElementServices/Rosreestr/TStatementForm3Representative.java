
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ������������� �� ����� 3 ��������� � ����������� ����
 *
 * <p>Java class for TStatementForm3Representative complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TStatementForm3Representative">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicRepresentative">
 *       &lt;sequence>
 *         &lt;element name="subject" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TStatementForm3RepresentativeSubject"/>
 *         &lt;element name="representativeDocumentRef" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TDocumentRefer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TStatementForm3Representative", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TStatementForm3Representative
    extends TBasicRepresentative
{


}
