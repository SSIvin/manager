
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TForeignOrgParams complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TForeignOrgParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBaseForeignOrgParams">
 *       &lt;sequence>
 *         &lt;element name="countryCode" type="{http://rosreestr.ru/services/v0.1/commons/directories/country}DCountry"/>
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="regNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kio" type="{http://rosreestr.ru/services/v0.1/commons/Documents}SOrgKIO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TForeignOrgParams", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TForeignOrgParams
    extends TBaseForeignOrgParams
{


}
