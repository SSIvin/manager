package smev.Wrapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import smev.Dto.InteractionInfoDto;
import smev.ElementServices.Other.GenderType;
import smev.ElementServices.Other.PassportRFType;
import smev.ElementServices.Other.SovietPassportType;
import smev.ElementServices.Snils.SnilsByAdditionalDataRequest;
import smev.ElementServices.Snils.SnilsByAdditionalDataResponse;
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
@Log4j2
public class RequestSnils extends ObjectMessage implements TypeBussines, CreateMessageStrategy, ReceiveMessageStrategy {

    private SnilsByAdditionalDataRequest data;

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
        ObjectMessage message = new RequestSnils();
        SnilsByAdditionalDataRequest dataRequest = new SnilsByAdditionalDataRequest();
        SubjectDataDTO subjectDTO = (SubjectDataDTO) payLoad.getPayLoadObject();
        dataRequest.setFamilyName(subjectDTO.getSurname());
        dataRequest.setFirstName(subjectDTO.getName());
        if (subjectDTO.getSecname() != null && !subjectDTO.getSecname().equals("")) {
            dataRequest.setPatronymic(subjectDTO.getSecname());
        }
        dataRequest.setBirthDate(subjectDTO.getBirthday());

        switch (subjectDTO.getDocCodeReestr()) {
            case 1:
                setPasssportRF(dataRequest, subjectDTO);
                break;
            case 2:
                setPasssportRF(dataRequest, subjectDTO);
                break;
            case 6:
                setSovietPassport(dataRequest, subjectDTO);
                break;
        }
        switch (subjectDTO.getSex()) {
            case "М":
                dataRequest.setGender(GenderType.MALE);
                break;
            case "Ж":
                dataRequest.setGender(GenderType.FEMALE);
                break;
        }

        ((RequestSnils) message).data = dataRequest;
        return message;
        //businessService.createAutoMessages(messageEntity.getUserId(), inquiryVersionId, payLoad.getSubject(), message);
    }

    private void setSovietPassport(SnilsByAdditionalDataRequest dataRequest, SubjectDataDTO subjectDTO) {
        SovietPassportType sovietPassportType = new SovietPassportType();
        sovietPassportType.setSeries(util.getStringNotSpaces(subjectDTO.getDocSeries()));
        sovietPassportType.setNumber(util.getStringOnlyNumber(subjectDTO.getDocNumber()));
        sovietPassportType.setIssueDate(subjectDTO.getDocDate());

        if (subjectDTO.getIssueName().equals("")) {
            sovietPassportType.setIssuer("отдел ЗАГС");
        } else {
            sovietPassportType.setIssuer(util.getStringOnlyNumberAndRussian(subjectDTO.getIssueName()));
        }
        dataRequest.setBirthCertificate(sovietPassportType);
    }

    private void setPasssportRF(SnilsByAdditionalDataRequest dataRequest, SubjectDataDTO subjectDTO) {
        PassportRFType passportRFType = new PassportRFType();
        passportRFType.setSeries(util.getStringNotSpaces(subjectDTO.getDocSeries()));
        passportRFType.setNumber(util.getStringOnlyNumber(subjectDTO.getDocNumber()));
        passportRFType.setIssueDate(subjectDTO.getDocDate());
        passportRFType.setIssuer(util.getStringOnlyNumberAndRussian(subjectDTO.getIssueName()));
        dataRequest.setPassportRF(passportRFType);
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

            SnilsByAdditionalDataResponse response = (SnilsByAdditionalDataResponse) Marshaller.unmarshal(element);

            if (response != null && response.getSnils() != null && !response.getSnils().equals("")) {
                orderInquiryDTO.setOrderInquiryState(OrderInquiryState.SUCCESS);
                DataSubjectEntity byId = dataSubjectRepo.findById(new DataSubjectEntityPK(orderInquiryDTO.getIdRegion(), orderInquiryDTO.getIdSubject())).get();
                Gson gson = new GsonBuilder().create();
                SubjectDataDTO subjectDataDTO = gson.fromJson(byId.getDataJsonSubject(), SubjectDataDTO.class);
                subjectDataDTO.setSnils(response.getSnils());
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
        return InquiryVersionEnum.getInquiryId(InquiryVersionEnum.SNILS).toString();
    }


//    @Override
//    public Element getElement(ObjectMessage objectMessage) {
//        return null;
//    }


//    public SnilsByAdditionalDataRequest getData() {
//        return this.data;
//    }
}
