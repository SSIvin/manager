package smev.Wrapper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import smev.Dto.InteractionInfoDto;
import smev.ElementServices.Dohflna.*;
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
import smev.utils.util;

import javax.xml.datatype.DatatypeConfigurationException;
import java.text.ParseException;
import java.util.List;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper=true)
@Component
public class RequestSVVIPLFLRequest extends ObjectMessage implements TypeBussines, CreateMessageStrategy, ReceiveMessageStrategy {

    private SVVIPLFLRequest data;

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
        ObjectMessage message = new RequestSVVIPLFLRequest();
        SVVIPLFLRequest dataRequest = new SVVIPLFLRequest();
        SubjectDataDTO subjectDTO = (SubjectDataDTO) payLoad.getPayLoadObject();

        FioType svFl = new FioType();
        svFl.setFamilyName(subjectDTO.getSurname());
        svFl.setFirstName(subjectDTO.getName());
        if (!subjectDTO.getSecname().equals("")) {
            svFl.setPatronymic(subjectDTO.getSecname());
        }
        dataRequest.setFio(svFl);
        dataRequest.setBirthday(subjectDTO.getBirthday());
        dataRequest.setPeriod("3");
        dataRequest.setSnils(util.getSnilsFormatting2(subjectDTO.getSnils()));

        messageEntity.setIdMessage(UUID.randomUUID());
        dataRequest.setIdZapros(messageEntity.getIdMessage().toString());

        ((RequestSVVIPLFLRequest) message).data = dataRequest;

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

            SVVIPLFLResponse response = (SVVIPLFLResponse) Marshaller.unmarshal(element);
            if (response != null) {
                orderInquiryDTO.setOrderInquiryState(OrderInquiryState.SUCCESS);
            }
        }


        if (interactionInfoDto.getRejectNumber() > 0) {
            List<BusinessMessageEntity> rejectMessages = InteractionConverter.getRejectMessages(interactionEntity);
            if (rejectMessages.get(0).getDescription().equalsIgnoreCase("не найдены сведения о доходах")) {
                orderInquiryDTO.setOrderInquiryState(OrderInquiryState.SUCCESS);
            } else
                orderInquiryDTO.setOrderInquiryState(OrderInquiryState.WARNING);
        }

        if (interactionInfoDto.getErrorNumber() > 0) {
            orderInquiryDTO.setOrderInquiryState(OrderInquiryState.ERROR);
        }

        return null;
    }

    @Override
    public String getIdInquery() {
        return InquiryVersionEnum.getInquiryId(InquiryVersionEnum.SVVIPL_FL).toString();
    }
}
