
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ������� ��������� �� ����������� �����
 *
 * <p>Java class for TStrictPerson complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TStrictPerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TPerson">
 *       &lt;sequence>
 *         &lt;element name="contactInfo" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TContactInfo" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="patronymic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="birthPlace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gender" type="{http://rosreestr.ru/services/v0.1/commons/Commons}SGender" minOccurs="0"/>
 *         &lt;element name="idDocumentRef" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TDocumentRefer"/>
 *         &lt;element name="address" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TPersonAddress"/>
 *         &lt;element name="citizenship" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TCitizenship" minOccurs="0"/>
 *         &lt;element name="snils" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SSNILS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TStrictPerson", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TStrictPerson
    extends TPerson
{


}
