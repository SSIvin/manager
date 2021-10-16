
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Описание адресного элемента (длина кода 2)
 *
 * <p>Java class for TAddressElement2 complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TAddressElement2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Address}TAddressElement">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://rosreestr.ru/services/v0.1/commons/Commons/simple-types}l2"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAddressElement2", namespace = "http://rosreestr.ru/services/v0.1/commons/Address")
public class TAddressElement2
    extends TAddressElement
{


}
