//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.08.02 at 10:03:24 PM MSK
//


package smev.ElementServices.Rosreestr;

import smev.utils.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;


/**
 * ��������� ���������� ���������
 *
 * <p>Java class for TBasePeriod complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TBasePeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dateStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dateEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="interval" type="{http://rosreestr.ru/services/v0.18/TStatementRequestEGRN}TInterval" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBasePeriod", namespace = "http://rosreestr.ru/services/v0.18/TStatementRequestEGRN", propOrder = {
        "date",
        "dateStart",
        "dateEnd",
        "interval"
})
@XmlSeeAlso({
        TAboutPersonPeriod.class,
        TPeriod.class
})
public class TBasePeriod {

    @XmlElement(name = "Date")
    //@XmlSchemaType(name = "date")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    protected LocalDate date;

    //    @XmlSchemaType(name = "date")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    protected LocalDate dateStart;

    //    @XmlSchemaType(name = "date")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    protected LocalDate dateEnd;

    protected TInterval interval;

    /**
     * Gets the value of the date property.
     *
     * @return possible object is
     * {@link LocalDate }
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     *
     * @param value allowed object is
     *              {@link LocalDate }
     */
    public void setDate(LocalDate value) {
        this.date = value;
    }

    /**
     * Gets the value of the dateStart property.
     *
     * @return possible object is
     * {@link LocalDate }
     */
    public LocalDate getDateStart() {
        return dateStart;
    }

    /**
     * Sets the value of the dateStart property.
     *
     * @param value allowed object is
     *              {@link LocalDate }
     */
    public void setDateStart(LocalDate value) {
        this.dateStart = value;
    }

    /**
     * Gets the value of the dateEnd property.
     *
     * @return possible object is
     * {@link LocalDate }
     */
    public LocalDate getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets the value of the dateEnd property.
     *
     * @param value allowed object is
     *              {@link LocalDate }
     */
    public void setDateEnd(LocalDate value) {
        this.dateEnd = value;
    }

    /**
     * Gets the value of the interval property.
     *
     * @return possible object is
     * {@link TInterval }
     */
    public TInterval getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     *
     * @param value allowed object is
     *              {@link TInterval }
     */
    public void setInterval(TInterval value) {
        this.interval = value;
    }

}
