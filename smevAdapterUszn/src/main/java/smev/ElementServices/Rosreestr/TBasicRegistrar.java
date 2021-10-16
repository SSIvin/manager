
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Регистратор/Сотрудник кадастровой палаты
 *
 * <p>Java class for TBasicRegistrar complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TBasicRegistrar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBasicPerson">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="contactInfo" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TContactInfo" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="patronymic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="idDocumentRef" type="{http://rosreestr.ru/services/v0.1/commons/Documents}TDocumentRefer" minOccurs="0"/>
 *           &lt;element name="snils" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SSNILS" minOccurs="0"/>
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
@XmlType(name = "TBasicRegistrar", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
@XmlSeeAlso({
    TStructRegistrar.class
})
public class TBasicRegistrar
    extends TBasicPerson
{


}
