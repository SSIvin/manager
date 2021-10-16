
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ���������� �������� � ��������
 *
 * <p>Java class for TPersonPreviousData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TPersonPreviousData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicPersonPreviousData">
 *       &lt;sequence>
 *         &lt;element name="FIO" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TFIO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="address" type="{http://rosreestr.ru/services/v0.1/commons/Address}TAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idDocumentRef" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TDocumentRefer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPersonPreviousData", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TPersonPreviousData
    extends TBasicPersonPreviousData
{


}
