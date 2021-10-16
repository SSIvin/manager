package smev.Wrapper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import smev.Dto.InteractionInfoDto;
import smev.ElementServices.Dohflna.IdentityDocumentShortType;
import smev.ElementServices.Dohflna.NDFL2Request;
import smev.ElementServices.Dohflna.NDFL2Response;
import smev.ElementServices.Dohflna.PhysicalPersonNameType;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Entity.Subject;
import smev.Enum.InquiryVersionEnum;
import smev.Enum.OrderInquiryState;
import smev.Enum.ReestrDoc;
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
import java.time.LocalDate;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class Request2NDFLRequest extends ObjectMessage implements TypeBussines, CreateMessageStrategy, ReceiveMessageStrategy {

    private NDFL2Request data;

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
        ObjectMessage message = new Request2NDFLRequest();
        NDFL2Request dataRequest = new NDFL2Request();
        SubjectDataDTO subjectDTO = (SubjectDataDTO) payLoad.getPayLoadObject();
        LoadData loadData = payLoad.getLoadData();
        NDFL2Request.СвФЛ svedFl = new NDFL2Request.СвФЛ();

        IdentityDocumentShortType udLichFlType = new IdentityDocumentShortType();
        udLichFlType.setSeriesNumber(util.getStringNotSpaces(subjectDTO.getDocSeries()) + " " + util.getStringOnlyNumber(subjectDTO.getDocNumber()));
        udLichFlType.setDocumentCode(ReestrDoc.reestrToOtherDoc(subjectDTO.getDocCodeReestr()).kodFNS());
        PhysicalPersonNameType fio = new PhysicalPersonNameType();
        fio.setFamilyName(subjectDTO.getSurname());
        fio.setFirstName(subjectDTO.getName());
        if (!subjectDTO.getSecname().equals("")) {
            fio.setPatronymic(subjectDTO.getSecname());
        }
        svedFl.setДатаРожд(subjectDTO.getBirthday());
        svedFl.setФИОФЛ(fio);
        svedFl.setУдЛичн(udLichFlType);
        svedFl.setНомЗаявФЛ("2");
        svedFl.setСНИЛС(util.getStringNotSpaces(subjectDTO.getSnils()));
        svedFl.setДатаЗаявФЛ(LocalDate.now());
        dataRequest.setСвФЛ(svedFl);
        dataRequest.setТипЗапросП("2");
        dataRequest.setОтчетГод(loadData.getParamInteger1());
        messageEntity.setIdMessage(UUID.randomUUID());
        dataRequest.setИдЗапрос(messageEntity.getIdMessage().toString());

        ((Request2NDFLRequest) message).data = dataRequest;

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

            NDFL2Response response = (NDFL2Response) Marshaller.unmarshal(element);
            if (response != null) {
                if (response.getКодОбраб() != null && response.getКодОбраб().equals("99")) {
                    orderInquiryDTO.setOrderInquiryState(OrderInquiryState.ERROR);
                } else
                    orderInquiryDTO.setOrderInquiryState(OrderInquiryState.SUCCESS);
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
        return InquiryVersionEnum.getInquiryId(InquiryVersionEnum.NDFL2).toString();
    }
}
