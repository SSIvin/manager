
package smev.ElementServices.GisJKH;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип, описывающий месяц и год
 *
 * <p>Java class for MonthYearType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MonthYearType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="month" type="{urn:dom.gosuslugi.ru/common/1.2.0}MonthType"/>
 *         &lt;element name="year" type="{urn:dom.gosuslugi.ru/common/1.2.0}YearType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthYearType", namespace = "urn:dom.gosuslugi.ru/common/1.2.0", propOrder = {
    "month",
    "year"
})
public class MonthYearType {

    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0")
    protected int month;
    @XmlElement(namespace = "urn:dom.gosuslugi.ru/common/1.2.0")
    protected int year;

    /**
     * Gets the value of the month property.
     *
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     *
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Gets the value of the year property.
     *
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     *
     */
    public void setYear(int value) {
        this.year = value;
    }

}
