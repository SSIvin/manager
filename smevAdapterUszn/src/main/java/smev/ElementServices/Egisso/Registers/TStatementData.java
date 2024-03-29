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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ��� ������: ����� ������� �� ���������� ������ � ��������� ��� ���������� ���� ��� ��������� ��� �� ������� ���, ��������� � ����������� ������������ ����, ������� ��� � ���������� ��������������� � ������� �������� ��������������
 *
 * <p>Java class for tStatementData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="tStatementData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="rlirpRecord" type="{urn://egisso-ru/types/registers-response/1.0.1}tRegisterRecord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rlidRecord" type="{urn://egisso-ru/types/registers-response/1.0.1}tRegisterRecord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rzpRecord" type="{urn://egisso-ru/types/registers-response/1.0.1}tRegisterRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tStatementData", namespace = "urn://egisso-ru/types/registers-response/1.0.1", propOrder = {
    "statusDate",
    "rlirpRecord",
    "rlidRecord",
    "rzpRecord"
})
public class TStatementData {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar statusDate;
    protected List<TRegisterRecord> rlirpRecord;
    protected List<TRegisterRecord> rlidRecord;
    protected List<TRegisterRecord> rzpRecord;

    /**
     * Gets the value of the statusDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * Sets the value of the statusDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setStatusDate(XMLGregorianCalendar value) {
        this.statusDate = value;
    }

    /**
     * Gets the value of the rlirpRecord property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rlirpRecord property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRlirpRecord().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRegisterRecord }
     *
     *
     */
    public List<TRegisterRecord> getRlirpRecord() {
        if (rlirpRecord == null) {
            rlirpRecord = new ArrayList<TRegisterRecord>();
        }
        return this.rlirpRecord;
    }

    /**
     * Gets the value of the rlidRecord property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rlidRecord property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRlidRecord().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRegisterRecord }
     *
     *
     */
    public List<TRegisterRecord> getRlidRecord() {
        if (rlidRecord == null) {
            rlidRecord = new ArrayList<TRegisterRecord>();
        }
        return this.rlidRecord;
    }

    /**
     * Gets the value of the rzpRecord property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rzpRecord property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRzpRecord().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRegisterRecord }
     *
     *
     */
    public List<TRegisterRecord> getRzpRecord() {
        if (rzpRecord == null) {
            rzpRecord = new ArrayList<TRegisterRecord>();
        }
        return this.rzpRecord;
    }

}
