
package smev.ElementServices.Rosreestr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TNativeForeignParams complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TNativeForeignParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://rosreestr.ru/services/v0.1/commons/Subjects}TBaseNativeForeignParams">
 *       &lt;choice>
 *         &lt;element name="nativeOrgParams" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TNativeOrgParams"/>
 *         &lt;element name="foreignOrgParams" type="{http://rosreestr.ru/services/v0.1/commons/Subjects}TForeignOrgParams"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNativeForeignParams", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
public class TNativeForeignParams
    extends TBaseNativeForeignParams
{


}
