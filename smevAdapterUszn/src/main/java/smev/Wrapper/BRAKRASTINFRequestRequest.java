package smev.Wrapper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import smev.Dto.InteractionInfoDto;
import smev.ElementServices.ZagsBrakRastor.BRAKRASTINFRequest;
import smev.ElementServices.ZagsBrakRastor.BRAKRASTINFResponse;
import smev.ElementServices.ZagsBrakRastor.ФИОПрТип;
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
public class BRAKRASTINFRequestRequest extends ObjectMessage implements TypeBussines, CreateMessageStrategy, ReceiveMessageStrategy {

    private BRAKRASTINFRequest data;

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
        ObjectMessage message = new BRAKRASTINFRequestRequest();
        BRAKRASTINFRequest dataRequest = new BRAKRASTINFRequest();
        SubjectDataDTO subjectDTO = (SubjectDataDTO) payLoad.getPayLoadObject();

        dataRequest.setКолДок(BigInteger.valueOf(1));
        dataRequest.setТипАГС("03");

        BRAKRASTINFRequest.СведЗапрос.СведФЛ сведФЛ = new BRAKRASTINFRequest.СведЗапрос.СведФЛ();
        сведФЛ.setДатаРождКаленд(subjectDTO.getBirthday());
        сведФЛ.setИнфФИО("2");
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

        BRAKRASTINFRequest.СведЗапрос сведЗапрос = new BRAKRASTINFRequest.СведЗапрос();
        сведЗапрос.setПрРегионРегАГС("1");
        сведЗапрос.setИдДок(messageEntity.getIdMessage().toString());
        сведЗапрос.setСведФЛ(сведФЛ);
//        сведЗапрос.setСведАГС(сведАГС);

        BRAKRASTINFRequest.СведОсн сведОсн = new BRAKRASTINFRequest.СведОсн();
        сведОсн.setКодНормОсн("01");
        сведОсн.setПрСведДокОсн("1");

        dataRequest.setСведОсн(сведОсн);
        dataRequest.setСведЗапрос(сведЗапрос);

        dataRequest.setИдЗапрос(messageEntity.getIdMessage().toString());

        ((BRAKRASTINFRequestRequest) message).data = dataRequest;

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

            BRAKRASTINFResponse response = (BRAKRASTINFResponse) Marshaller.unmarshal(element);
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
        return InquiryVersionEnum.getInquiryId(InquiryVersionEnum.ZAGS_RAST_BRAK).toString();
    }
}
