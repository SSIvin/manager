
package smev.ElementServices.FamilyChildSub;

import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 *                 Ответ на подачу заявлени или запроса на отмену заявления или текстового сообщения от заявителя в ведомство
 *
 *
 * <p>Java class for FormDataResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FormDataResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changeOrderInfo" type="{http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0}changeOrderInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormDataResponseType", namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", propOrder = {
    "changeOrderInfo"
})
public class FormDataResponseType implements TypeBussines {

    @XmlElement(namespace = "http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0", required = true)
    protected ChangeOrderInfoType changeOrderInfo;

    /**
     * Gets the value of the changeOrderInfo property.
     *
     * @return
     *     possible object is
     *     {@link ChangeOrderInfoType }
     *
     */
    public ChangeOrderInfoType getChangeOrderInfo() {
        return changeOrderInfo;
    }

    /**
     * Sets the value of the changeOrderInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link ChangeOrderInfoType }
     *
     */
    public void setChangeOrderInfo(ChangeOrderInfoType value) {
        this.changeOrderInfo = value;
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
