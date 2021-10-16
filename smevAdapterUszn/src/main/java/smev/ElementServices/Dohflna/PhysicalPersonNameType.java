
package smev.ElementServices.Dohflna;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 *
 *
 * <p>Java class for PhysicalPersonNameType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType userName="PhysicalPersonNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute userName="FamilyName" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}string-60" />
 *       &lt;attribute userName="FirstName" use="required" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}string-60" />
 *       &lt;attribute userName="Patronymic" type="{urn://x-artefacts-fns-dohflna/types/4.0.1}string-60" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalPersonNameType"
//        , namespace = "urn://x-artefacts-fns-dohflna/types/4.0.1"
)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalPersonNameType {

    @XmlAttribute(name = "FamilyName", required = true)
    protected String familyName;
    @XmlAttribute(name = "FirstName", required = true)
    protected String firstName;
    @XmlAttribute(name = "Patronymic")
    protected String patronymic;

}
