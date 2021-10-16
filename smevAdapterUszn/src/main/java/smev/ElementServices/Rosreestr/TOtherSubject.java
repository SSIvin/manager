
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ����, ����, ����, ���
 *
 * <p>Java class for TOtherSubject complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TOtherSubject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicOtherSubject">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="contactInfo" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TContactInfo" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="inn" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SOrgINN" minOccurs="0"/>
 *           &lt;element name="ogrn" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SOrgOGRN" minOccurs="0"/>
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
@XmlType(name = "TOtherSubject", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TOtherSubject
    extends TBasicOtherSubject
{


}
