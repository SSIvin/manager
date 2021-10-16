
package smev.ElementServices.Rosreestr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Предыдущие сведения о субъекте
 *
 * <p>Java class for TBasicPersonPreviousData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TBasicPersonPreviousData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
@XmlType(name = "TBasicPersonPreviousData", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects", propOrder = {
    "fio",
    "address",
    "idDocumentRef"
})
@XmlSeeAlso({
    TPersonPreviousData.class,
    TInterdepPersonPreviousData.class
})
public class TBasicPersonPreviousData {

    @XmlElement(name = "FIO", namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected List<TFIO> fio;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected List<TAddress> address;
    @XmlElement(namespace = "http://rosreestr.ru/services/v0.1/commons/Subjects")
    protected List<TDocumentRefer> idDocumentRef;

    /**
     * Gets the value of the fio property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fio property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFIO().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TFIO }
     *
     *
     */
    public List<TFIO> getFIO() {
        if (fio == null) {
            fio = new ArrayList<TFIO>();
        }
        return this.fio;
    }

    /**
     * Gets the value of the address property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAddress }
     *
     *
     */
    public List<TAddress> getAddress() {
        if (address == null) {
            address = new ArrayList<TAddress>();
        }
        return this.address;
    }

    /**
     * Gets the value of the idDocumentRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idDocumentRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdDocumentRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDocumentRefer }
     *
     *
     */
    public List<TDocumentRefer> getIdDocumentRef() {
        if (idDocumentRef == null) {
            idDocumentRef = new ArrayList<TDocumentRefer>();
        }
        return this.idDocumentRef;
    }

}
