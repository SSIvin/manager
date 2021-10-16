
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ����������� ����
 *
 * <p>Java class for TOrganization complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TOrganization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicOrganization">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="contactInfo" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TContactInfo" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="kpp" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SOrgKPP"/>
 *           &lt;element name="nativeForeignParams" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TNativeForeignParams"/>
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
@XmlType(name = "TOrganization", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TOrganization
    extends TBasicOrganization
{


}
