package smev.Wrapper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import smev.Dto.InteractionInfoDto;
import smev.ElementServices.Szn.SZNRequest;
import smev.ElementServices.Szn.SZNResponse;
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
import java.time.LocalDate;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class RequestSZNRequest extends ObjectMessage implements TypeBussines, CreateMessageStrategy, ReceiveMessageStrategy {

    private SZNRequest data;

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
        return null;
    }

    @Override
    public ObjectMessage runOrder(BusinessMessageEntity messageEntity, UUID inquiryVersionId, PayLoad payLoad) throws ParseException, DatatypeConfigurationException {
        ObjectMessage message = new RequestSZNRequest();
        SZNRequest dataRequest = new SZNRequest();
        SubjectDataDTO subjectDTO = (SubjectDataDTO) payLoad.getPayLoadObject();
        dataRequest.setRegionCode(businessService.getPropConfig().Prop().get("OKTMO").toString());
        dataRequest.setLastName(subjectDTO.getSurname());
        dataRequest.setFirstName(subjectDTO.getName());
        if (!subjectDTO.getSecname().equals("")) {
            dataRequest.setMiddleName(subjectDTO.getSecname());
        }
        dataRequest.setSnils(subjectDTO.getSnils());
        dataRequest.setBirthDate(subjectDTO.getBirthday());
        dataRequest.setDateQuery(LocalDate.now());
        messageEntity.setIdMessage(UUID.randomUUID());

        ((RequestSZNRequest) message).data = dataRequest;

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

            SZNResponse response = (SZNResponse) Marshaller.unmarshal(element);
            if (response != null && response.isPresenceData()) {
                orderInquiryDTO.setOrderInquiryState(OrderInquiryState.SUCCESS);
            } else
                orderInquiryDTO.setOrderInquiryState(OrderInquiryState.WARNING);
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
        return InquiryVersionEnum.getInquiryId(InquiryVersionEnum.SZN).toString();
    }
}
