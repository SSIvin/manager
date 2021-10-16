package smev.Wrapper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import smev.Dto.InteractionInfoDto;
import smev.ElementServices.Gibdd.RequestBenefit489;
import smev.ElementServices.Gibdd.ResponseBenefit489;
import smev.ElementServices.Gibdd.Status;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Entity.Subject;
import smev.Enum.InquiryVersionEnum;
import smev.Enum.OrderInquiryState;
import smev.Marshaller.Marshaller;
import smev.Reestr.Dto.OrderInquiryDto;
import smev.Reestr.Dto.SubjectDataDTO;
import smev.Send.TypeBussines;
import smev.Service.BusinessService;
import smev.Service.CreateMessageStrategy;
import smev.Service.Impl.BusinessServiceImpl;
import smev.Service.ReceiveMessageStrategy;
import smev.converters.InteractionConverter;
import smev.dao.EntitySmev.DataSubjectEntity;

import javax.xml.datatype.DatatypeConfigurationException;
import java.text.ParseException;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
@Log4j2
public class RequestRequestBenefit489 extends ObjectMessage implements TypeBussines, CreateMessageStrategy, ReceiveMessageStrategy {

    private RequestBenefit489 data;

    @Autowired
    private BusinessService businessService;

    @Override
    public TypeBussines tt(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return this.data;
    }

    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        return null;
    }

    @Override
    public BusinessMessageEntity run(Integer userId, UUID inquiryVersionId, Subject subject, PayLoad payLoad) throws ParseException, DatatypeConfigurationException {
        ObjectMessage message = new RequestRequestBenefit489();
        //критерии выборки данных берем из payLoad
//        data = new RequestBenefit489();
//        data.setOwnerLastName("Ивин");
//        data.setOwnerFirstName("Сергей");
//        data.setOwnerMiddleName("Сергеевич");
//        data.setOwnerBirthDate(util.StringToXmlGregorianCalendar("1984-09-14"));
//        ((RequestRequestBenefit489) message).data = data;
        return businessService.createAutoMessages(userId, inquiryVersionId, subject, message);
    }

    @Override
    public ObjectMessage runOrder(BusinessMessageEntity messageEntity, UUID inquiryVersionId, PayLoad payLoad) throws ParseException, DatatypeConfigurationException {
        ObjectMessage message = new RequestRequestBenefit489();
        RequestBenefit489 dataRequest = new RequestBenefit489();
        SubjectDataDTO subjectDTO = (SubjectDataDTO) payLoad.getPayLoadObject();

        dataRequest.setOwnerLastName(subjectDTO.getSurname());
        dataRequest.setOwnerFirstName(subjectDTO.getName());
        if (!subjectDTO.getSecname().equals("")) {
            dataRequest.setOwnerMiddleName(subjectDTO.getSecname());
        }
        dataRequest.setOwnerBirthDate(subjectDTO.getBirthday());
        messageEntity.setIdMessage(UUID.randomUUID());

        ((RequestRequestBenefit489) message).data = dataRequest;

        return message;
    }

    @Override
    public void runReceive(InquiryVersionEnum inquiryVersionEnum, BusinessMessageEntity message) throws ParseException, DatatypeConfigurationException {

    }

    @Override
    public DataSubjectEntity runReceiveOrder(BusinessInteractionEntity interactionEntity, OrderInquiryDto orderInquiryDTO) throws ParseException, DatatypeConfigurationException {
        InteractionInfoDto interactionInfoDto = InteractionConverter.toInfo(interactionEntity);
        if (interactionInfoDto.getResponseNumber() > 0) {
            Element element = businessService.getElementResponse(interactionEntity, false);
            if (element == null) return null;

            ResponseBenefit489 response = (ResponseBenefit489) Marshaller.unmarshal(element);
            if (response != null) {
                if ((response.getStatus() != null && response.getStatus().equals(Status.ERROR))
                        & (response.getErrorText() != null && response.getErrorText().equalsIgnoreCase("ТС с указанными входными параметрами не найдены"))
                ) {
                    orderInquiryDTO.setOrderInquiryState(OrderInquiryState.SUCCESS);
                } else {
                    if (response.getResponseBenefitData() != null) {
                        orderInquiryDTO.setOrderInquiryState(OrderInquiryState.SUCCESS);
                    } else
                        orderInquiryDTO.setOrderInquiryState(OrderInquiryState.WARNING);
                }
            }
        }


        if (interactionInfoDto.getRejectNumber() > 0) {
            orderInquiryDTO.setOrderInquiryState(OrderInquiryState.WARNING);
        }

        if (interactionInfoDto.getErrorNumber() > 0) {
            orderInquiryDTO.setOrderInquiryState(OrderInquiryState.ERROR);
        }

        return null;
    }

    @Override
    public String getIdInquery() {
        return InquiryVersionEnum.getInquiryId(InquiryVersionEnum.GIBDD).toString();
    }
}
