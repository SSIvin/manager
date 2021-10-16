package smev.ElementServices.Egisso.Registers;

import lombok.Data;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ****************************************************************************************************
 *      Вид сведений СМЭВ: «10.26.I ЗАПРОС В ЕГИССО НА ПОЛУЧЕНИЕ СВЕДЕНИЙ ИЗ РЕЕСТРА ЛИЦ, СВЯЗАННЫХ С ИЗМЕНЕНИЕМ РОДИТЕЛЬСКИХ ПРАВ, РЕЕСТРА ЛИЦ С ИЗМЕНЕННОЙ ДЕЕСПОСОБНОСТЬЮ И РЕЕСТРА ЗАКОННЫХ ПРЕДСТАВИТЕЛЕЙ»
 *      ****************************************************************************************************
 *
 *  Сообщение-запрос с параметрами запрашиваемых сведений о включении или исключении лица или связанных лиц из реестра лиц, связанных с изменением родительских прав, реестра лиц с измененной дееспособностью и реестра законных представителей
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request"
})
@XmlRootElement(name = "request", namespace = "urn://egisso-ru/msg/10.26.I/1.0.1")
@Data
public class Request implements TypeBussines {

    @XmlElement(namespace = "urn://egisso-ru/types/registers-request/1.0.1", required = true)
    protected TRequestData request;

    @Override
    public TypeBussines tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return this.request;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }
}
