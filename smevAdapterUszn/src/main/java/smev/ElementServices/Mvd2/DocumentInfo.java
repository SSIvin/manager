//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.09.30 at 11:38:56 PM MSK
//


package smev.ElementServices.Mvd2;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ������ ���������: ���, �����, �����, ���� ������
 *
 * <p>Java class for DocumentInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DocumentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="russianPassport" type="{urn://mvd/guvm/basic-types/1.2.0}RussianPassport"/>
 *         &lt;element name="foreignPassport" type="{urn://mvd/guvm/basic-types/1.2.0}ForeignPassport"/>
 *         &lt;element name="birthCertificate" type="{urn://mvd/guvm/basic-types/1.2.0}BirthCertificate"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentInfo", propOrder = {
    "russianPassport",
    "foreignPassport",
    "birthCertificate"
})
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentInfo {

    @XmlElement(namespace = "urn://mvd/guvm/registration-commons/1.2.0")
    protected RussianPassport russianPassport;

    @XmlElement(namespace = "urn://mvd/guvm/registration-commons/1.2.0")
    protected ForeignPassport foreignPassport;

    @XmlElement(namespace = "urn://mvd/guvm/registration-commons/1.2.0")
    protected BirthCertificate birthCertificate;


}