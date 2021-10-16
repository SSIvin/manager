
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ������������� �����������
 *
 * <p>Java class for TOrganizationRepresentative complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TOrganizationRepresentative">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicRepresentative">
 *       &lt;sequence>
 *         &lt;element name="subject" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TOrgRepresentativeSubject"/>
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
@XmlType(name = "TOrganizationRepresentative", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TOrganizationRepresentative
    extends TBasicRepresentative
{


}
