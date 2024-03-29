//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.01.20 at 02:10:35 PM MSK
//


package smev.ElementServices.Egisso.Registers;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * ��� ������ ���� �������� ��� ����������� �������
 *
 * <p>Java class for tDossierData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tDossierData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="externalEvent" type="{urn://egisso-ru/types/registers-response/1.0.1}tExternalEvent"/>
 *         &lt;element name="internalEvent" type="{urn://egisso-ru/types/registers-response/1.0.1}tInternalEvent"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tDossierData", namespace = "urn://egisso-ru/types/registers-response/1.0.1", propOrder = {
    "externalEventOrInternalEvent"
})
public class TDossierData {

    @XmlElements({
        @XmlElement(name = "externalEvent", type = TExternalEvent.class),
        @XmlElement(name = "internalEvent", type = TInternalEvent.class)
    })
    protected List<Object> externalEventOrInternalEvent;

    /**
     * Gets the value of the externalEventOrInternalEvent property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalEventOrInternalEvent property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalEventOrInternalEvent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TExternalEvent }
     * {@link TInternalEvent }
     *
     *
     */
    public List<Object> getExternalEventOrInternalEvent() {
        if (externalEventOrInternalEvent == null) {
            externalEventOrInternalEvent = new ArrayList<Object>();
        }
        return this.externalEventOrInternalEvent;
    }

}
