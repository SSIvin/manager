package smev.Wrapper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import smev.Dto.InteractionInfoDto;
import smev.ElementServices.ZagsParent.PARENTINFRequest;
import smev.ElementServices.ZagsParent.PARENTINFResponse;
import smev.ElementServices.ZagsParent.ФИОПрТип;
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
import java.math.BigInteger;
import java.text.ParseException;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper=true)
@Component
public class PARENTINFRequestRequest extends ObjectMessage implements TypeBussines, CreateMessageStrategy, ReceiveMessageStrategy {

    private PARENTINFRequest data;

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
        messageEntity.setIdMessage(UUID.randomUUID());
        ObjectMessage message = new PARENTINFRequestRequest();
        PARENTINFRequest dataRequest = new PARENTINFRequest();
        SubjectDataDTO subjectDTO = (SubjectDataDTO) payLoad.getPayLoadObject();

        dataRequest.setКолДок(BigInteger.valueOf(1));
        dataRequest.setТипАГС("04");

        PARENTINFRequest.СведЗапрос.СведФЛ сведФЛ = new PARENTINFRequest.СведЗапрос.СведФЛ();
        сведФЛ.setДатаРождКаленд(subjectDTO.getBirthday());
        сведФЛ.setСнилс(util.getSnilsFormatting1(subjectDTO.getSnils()));

        ФИОПрТип фиоПрТип = new ФИОПрТип();
        фиоПрТип.setФамилия(subjectDTO.getSurname());
        фиоПрТип.setИмя(subjectDTO.getName());
        if (!subjectDTO.getSecname().equals("")) {
            фиоПрТип.setОтчество(subjectDTO.getSecname());
        } else
            фиоПрТип.setПрОтчество("1");

        сведФЛ.setФио(фиоПрТип);

//        BRAKZAKINFRequest.СведЗапрос.СведАГС сведАГС = new BRAKZAKINFRequest.СведЗапрос.СведАГС();
//        ОрганЗАГСНТип органЗАГСНТип = new ОрганЗАГСНТип();
//        органЗАГСНТип.setНаимЗАГС();

        PARENTINFRequest.СведЗапрос сведЗапрос = new PARENTINFRequest.СведЗапрос();
        сведЗапрос.setПрРегионРегАГС("1");
        сведЗапрос.setИдДок(messageEntity.getIdMessage().toString());
        сведЗапрос.setСведФЛ(сведФЛ);
//        сведЗапрос.setСведАГС(сведАГС);

        PARENTINFRequest.СведОсн сведОсн = new PARENTINFRequest.СведОсн();
        сведОсн.setКодНормОсн("01");
        сведОсн.setПрСведДокОсн("1");

        dataRequest.setСведОсн(сведОсн);
        dataRequest.setСведЗапрос(сведЗапрос);

        dataRequest.setИдЗапрос(messageEntity.getIdMessage().toString());

        ((PARENTINFRequestRequest) message).data = dataRequest;

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

            PARENTINFResponse response = (PARENTINFResponse) Marshaller.unmarshal(element);
            if (response != null && response.getСведОтветАГС() != null) {
                if (response.getСведОтветАГС().get(0).getРезОбраб().equals("1")
                        | response.getСведОтветАГС().get(0).getРезОбраб().equals("2")) {
                    orderInquiryDTO.setOrderInquiryState(OrderInquiryState.SUCCESS);
                } else
                    orderInquiryDTO.setOrderInquiryState(OrderInquiryState.WARNING);
            } else {
                orderInquiryDTO.setOrderInquiryState(OrderInquiryState.ERROR);
                orderInquiryDTO.setDescription("Ответ не разобран");
            }
        }


        if (interactionInfoDto.getRejectNumber() > 0) {
            orderInquiryDTO.setOrderInquiryState(OrderInquiryState.WARNING);
            orderInquiryDTO.setDescription("возврат");
        }

        if (interactionInfoDto.getErrorNumber() > 0) {
            orderInquiryDTO.setOrderInquiryState(OrderInquiryState.ERROR);
        }

        return null;
    }

    @Override
    public String getIdInquery() {
        return InquiryVersionEnum.getInquiryId(InquiryVersionEnum.ZAGS_FATHER).toString();
    }
}
