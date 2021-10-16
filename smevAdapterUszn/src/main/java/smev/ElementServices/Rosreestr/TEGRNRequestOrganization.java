
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * �������� ����������� ������������ ������������ ���� � ������ ��������� �� ������������� ��������
 *
 * <p>Java class for TEGRNRequestOrganization complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TEGRNRequestOrganization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicOrganization">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="contactInfo" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TContactInfo" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="kpp" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SOrgKPP" minOccurs="0"/>
 *           &lt;element name="nativeForeignParams" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBaseNativeForeignParams"/>
 *           &lt;element name="regDocument" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TDocument" minOccurs="0"/>
 *           &lt;element name="address" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddress" minOccurs="0"/>
 *           &lt;element name="previousData" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TOrganizationPreviousData" minOccurs="0"/>
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
@XmlType(name = "TEGRNRequestOrganization", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TEGRNRequestOrganization
    extends TBasicOrganization
{


}
