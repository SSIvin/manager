//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.03.23 at 10:36:31 AM AMT
//


package smev.ElementServices.infoEgissoBySnils;

import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn://egisso-ru/types/prsn-request/1.0.3}requestData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestData"
})
@XmlRootElement(name = "request", namespace = "urn://egisso-ru/msg/10.13.I/1.0.3")
public class Request implements TypeBussines {

    @XmlElement(namespace = "urn://egisso-ru/types/prsn-request/1.0.3", required = true)
    protected TRequestedData requestData;

    /**
     *
     *                Параметры запроса выписки
     *
     *
     * @return
     *     possible object is
     *     {@link TRequestedData }
     *
     */
    public TRequestedData getRequestData() {
        return requestData;
    }

    /**
     * Sets the value of the requestData property.
     *
     * @param value
     *     allowed object is
     *     {@link TRequestedData }
     *
     */
    public void setRequestData(TRequestedData value) {
        this.requestData = value;
    }

    @Override
    public TypeBussines tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }
}
