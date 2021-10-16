package smev.Wrapper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import smev.Dto.InteractionInfoDto;
import smev.ElementServices.Egisso.Registers.Request;
import smev.ElementServices.Egisso.Registers.Response;
import smev.ElementServices.Egisso.Registers.TRequestData;
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
public class RequestRegister extends ObjectMessage implements TypeBussines, CreateMessageStrategy, ReceiveMessageStrategy {

    private Request data;

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
        ObjectMessage message = new RequestRegister();
        Request dataRequest = new Request();
        LoadData loadData = payLoad.getLoadData();
        SubjectDataDTO subjectDTO = (SubjectDataDTO) payLoad.getPayLoadObject();

        switch (loadData.getParamInteger1()) {
            case 1:
            case 0: {
//заявитель или член семьи
                TRequestData requestData = new TRequestData();
                TRequestData.Rlirp rlirp = new TRequestData.Rlirp();
                TRequestData.Rlirp.ChildRequest childRequest = new TRequestData.Rlirp.ChildRequest();
                childRequest.setSnils(subjectDTO.getSnils());
                rlirp.setChildRequest(childRequest);
                requestData.setRlirp(rlirp);
                dataRequest.setRequest(requestData);
                requestData.setWithDossier(true);
            }
            break;
            case 2: {
//ребенок
                TRequestData requestData = new TRequestData();
                TRequestData.Rlid rlid = new TRequestData.Rlid();
                rlid.setSnils(subjectDTO.getSnils());
                requestData.setRlid(rlid);
                dataRequest.setRequest(requestData);
                requestData.setWithDossier(true);
            }
            break;

        }
        ((RequestRegister) message).data = dataRequest;

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

            Response response = (Response) Marshaller.unmarshal(element);
            if (response != null && response.getResponse() != null && response.getResponse().getError() != null) {
                orderInquiryDTO.setOrderInquiryState(OrderInquiryState.ERROR);
                orderInquiryDTO.setDescription(response.getResponse().getError().getMessage());
            }

            if (response != null && response.getResponse() != null
                    && response.getResponse().getStatementData() != null
                    && (response.getResponse().getStatementData().getRlidRecord() != null
                    | response.getResponse().getStatementData().getRlirpRecord() != null
                    | response.getResponse().getStatementData().getRzpRecord() != null)
            ) {
                orderInquiryDTO.setOrderInquiryState(OrderInquiryState.SUCCESS);
                orderInquiryDTO.setDescription("информация отсутствует");
            }
        }


        if (interactionInfoDto.getRejectNumber() > 0) {
            orderInquiryDTO.setOrderInquiryState(OrderInquiryState.ERROR);
            orderInquiryDTO.setDescription("возврат");
        }

        if (interactionInfoDto.getErrorNumber() > 0) {
            orderInquiryDTO.setOrderInquiryState(OrderInquiryState.ERROR);
        }

        return null;
    }

    @Override
    public String getIdInquery() {
        return InquiryVersionEnum.getInquiryId(InquiryVersionEnum.REESTR_LIC).toString();
    }
}
