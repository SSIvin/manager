
package smev.ElementServices.Egisso;

import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="attachment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "attachment"
})
@XmlRootElement(name = "request", namespace = "urn://egisso-ru/msg/10.10.I/1.0.2")
public class RequestAttachment implements TypeBussines {

    @XmlElement(namespace = "urn://egisso-ru/msg/10.10.I/1.0.2")
    protected boolean attachment;

    /**
     * Gets the value of the attachment property.
     *
     */
    public boolean isAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     *
     */
    public void setAttachment(boolean value) {
        this.attachment = value;
    }

    @Override
    public Object tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }
}
