
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * �����������/��������� ����������� ������
 *
 * <p>Java class for TRegistrar complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TRegistrar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TStructRegistrar">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;sequence>
 *             &lt;element name="contactInfo" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TContactInfo" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *             &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *             &lt;element name="patronymic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *             &lt;element name="idDocumentRef" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TDocumentRefer" minOccurs="0"/>
 *             &lt;element name="snils" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SSNILS" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="appointment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="role" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}DRole"/>
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
@XmlType(name = "TRegistrar", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TRegistrar
    extends TStructRegistrar
{


}
