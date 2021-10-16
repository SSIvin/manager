package smev.Wrapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import smev.Dto.InteractionInfoDto;
import smev.ElementServices.Inn.*;
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
import smev.dao.EntitySmev.DataSubjectEntityPK;
import smev.dao.RepoSmev.DataSubjectRepo;
import smev.dao.RepoSmev.OrderInquiryRepo;
import smev.utils.util;

import javax.xml.datatype.DatatypeConfigurationException;
import java.text.ParseException;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@Component
public class RequestInn extends ObjectMessage implements TypeBussines, CreateMessageStrategy, ReceiveMessageStrategy {

    private FNSINNSingularRequest data;

    @Autowired
    private BusinessService businessService;

    @Autowired
    private OrderInquiryRepo orderInquiryRepo;

    @Autowired
    private DataSubjectRepo dataSubjectRepo;

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
        ObjectMessage message = new RequestInn();
        FNSINNSingularRequest dataRequest = new FNSINNSingularRequest();
        SubjectDataDTO subjectDTO = (SubjectDataDTO) payLoad.getPayLoadObject();
        SvedFlType svedFlType = new SvedFlType();
        UdLichFlType udLichFlType = new UdLichFlType();
        udLichFlType.setSerNumDoc(util.getStringNotSpaces(subjectDTO.getDocSeries()) + " " + util.getStringOnlyNumber(subjectDTO.getDocNumber()));
        udLichFlType.setKodVidDoc(ReestrDoc.reestrToOtherDoc(subjectDTO.getDocCodeReestr()).kodFNS());
        FioType fioType = new FioType();
        fioType.setFamily(subjectDTO.getSurname());
        fioType.setName(subjectDTO.getName());
        if (!subjectDTO.getSecname().equals("")) {
            fioType.setOtchestvo(subjectDTO.getSecname());
        }
        svedFlType.setBirthday(subjectDTO.getBirthday());
        svedFlType.setFio(fioType);
        svedFlType.setUdLichFl(udLichFlType);
        dataRequest.setSvedFl(svedFlType);
        messageEntity.setIdMessage(UUID.randomUUID());
        dataRequest.setIdZapros(messageEntity.getIdMessage().toString());

        FNSINNSingularRequest.SvedYlType svedYlType = new FNSINNSingularRequest.SvedYlType();
        svedYlType.setOgrn(businessService.getPropConfig().Prop().get("OGRN").toString());
        svedYlType.setInnYl(businessService.getPropConfig().Prop().get("INN").toString());
        svedYlType.setNameOrg(businessService.getPropConfig().Prop().get("NAME_ORG").toString());

        dataRequest.setSvedYl(svedYlType);

        ((RequestInn) message).data = dataRequest;

        return message;

    //return businessService.createAutoMessages(userId, inquiryVersionId, payLoad.getSubject(), message);
    }


    @Override
    public void runReceive(InquiryVersionEnum inquiryVersionEnum, BusinessMessageEntity message) throws ParseException, DatatypeConfigurationException {

    }

    @Override
    public DataSubjectEntity runReceiveOrder(BusinessInteractionEntity interactionEntity, OrderInquiryDto orderInquiryDTO) throws ParseException, DatatypeConfigurationException {

        InteractionInfoDto interactionInfoDto = InteractionConverter.toInfo(interactionEntity);
        if (interactionInfoDto.getResponseNumber() > 0) {
            Element element = businessService.getElementResponse(interactionEntity, true);
            if (element == null) return null;

            FNSINNSingularResponse response = (FNSINNSingularResponse) Marshaller.unmarshal(element);
            if (response != null && response.getInnFl() != null && !response.getInnFl().equals("")) {
                orderInquiryDTO.setOrderInquiryState(OrderInquiryState.SUCCESS);
                DataSubjectEntity byId = dataSubjectRepo.findById(new DataSubjectEntityPK(orderInquiryDTO.getIdRegion(), orderInquiryDTO.getIdSubject())).get();
                Gson gson = new GsonBuilder().create();
                SubjectDataDTO subjectDataDTO = gson.fromJson(byId.getDataJsonSubject(), SubjectDataDTO.class);
                subjectDataDTO.setInn(response.getInnFl());
                byId.setDataJsonSubject(gson.toJson(subjectDataDTO));
                return byId;
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
        return InquiryVersionEnum.getInquiryId(InquiryVersionEnum.INN).toString();
    }


}
