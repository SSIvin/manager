package smev.Wrapper;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import ru.anatol.sjema.xml.DomException;
import smev.ElementServices.Rosreestr.*;
import smev.Entity.BusinessAttachmentEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Enum.AttachmentTransferMethod;
import smev.Enum.ReestrDoc;
import smev.Marshaller.Marshaller;
import smev.Send.TypeBussines;
import smev.Service.Impl.BusinessServiceImpl;
import smev.exceptions.ModelException;
import smev.utils.RemoveUnusedNamespaces;
import smev.utils.ZipUtil;
import smev.utils.util;

import javax.swing.text.MaskFormatter;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Slf4j
public class RequestRosreestrRequest extends ObjectMessage implements TypeBussines {


    BusinessServiceImpl businessService;
    BusinessMessageEntity messageEntity;

    private final String fileStatement = "statement_" + UUID.randomUUID().toString();
    private final String fileRequest = "request";

    private final String actionCode = "659511111112";
    private final String statementType = "558630200000";
    private final String declarantKind = "357013000000";
    private final String benefitCategory = "358000000002";
    private List<File> listFile = new ArrayList<>();

    private EGRN data;


    @Override
    public String fillObj(BusinessServiceImpl businessService, BusinessMessageEntity messageEntity) {
        this.businessService = businessService;
        this.messageEntity = messageEntity;
        List<BusinessAttachmentEntity> attachmentEntitie = this.businessService.getAttachmentsByMessageId(messageEntity.getIdMessage());
        if (attachmentEntitie.size() > 0) {
            Map<String, byte[]> mapFilesFromByte = businessService.getMapFilesFromByte(attachmentEntitie.stream().filter(businessAttachmentEntity -> businessAttachmentEntity.getFileName().endsWith(".zip")).findFirst().orElse(null).getContent());
            for (Map.Entry<String, byte[]> entry : mapFilesFromByte.entrySet()) {
                if (entry.getKey().startsWith("statement_") && entry.getKey().endsWith(".xml")) {
                    try {
                        Document document = util.getDocument(entry.getValue());
                        return Marshaller.elementToString(document.getDocumentElement());
                    } catch (DomException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
        return null;
    }

    @Override
    public TypeBussines tt(BusinessServiceImpl businessServiceImpl, BusinessMessageEntity message) {
        this.businessService = businessServiceImpl;
        this.messageEntity = message;
        log.info("Создание вложения для росреестра для messageID {}", messageEntity.getIdMessage());
        String outFolder = messageEntity.getIdMessage().toString();
        Map<String, byte[]> map = (Map) new HashMap<>();


        byte[] elmentEgrnRequest = getEgrnRequest();
        InputStream in = new ByteArrayInputStream(elmentEgrnRequest);


//для корректировки фала из архива в дебаге по шагам
//        Path f1 = Paths.get(businessService.smevAdapterOut, fileStatement + ".xml");
//        try {
//            //сохраним
//            FileUtils.writeByteArrayToFile(f1.toFile(), elmentEgrnRequest);
//            //читаем
//            File file2 = new File(businessService.smevAdapterOut, fileStatement + ".xml");
//            elmentEgrnRequest = FileUtils.readFileToByteArray(file2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        byte[] elmentEgrnRequestSign = businessService.signInputStream(in);
        //elmentEgrnRequestSign = Base64.getEncoder().encode(elmentEgrnRequestSign);
        map.put(fileStatement + ".xml", elmentEgrnRequest);
        map.put(fileStatement + ".xml.sig", elmentEgrnRequestSign);

        byte[] request = getRequest();
        ByteArrayInputStream in2 = new ByteArrayInputStream(request);
        byte[] requestSign = businessService.signInputStream(in2);
        //requestSign = Base64.getEncoder().encode(requestSign);
        map.put(fileRequest + ".xml", request);
        map.put(fileRequest + ".xml.sig", requestSign);

        addList(map, outFolder);


        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();

//        String outFolder =UUID.randomUUID().toString();
        Path fileZip = Paths.get(businessService.smevAdapterOut, outFolder, "request.zip");
        Path fileZipSign = Paths.get(businessService.smevAdapterOut, outFolder, "request.zip.sig");
        try {
            //ZipUtil.writeZip(arrayOutputStream, map);
            ZipUtil.wrizipLingala(fileZip, listFile);
//            InputStream in3 = new ByteArrayInputStream(arrayOutputStream.toByteArray());
            InputStream in3 = new FileInputStream(fileZip.toFile());
            byte[] zipSign = businessService.signInputStream(in3);

            //итоговый корректный подписанный архив
            //zipSign = Base64.getEncoder().encode(zipSign);

//            сохраняем файлы если не prod
            // if (!businessService.profileActive.equalsIgnoreCase("prod")) {
//            Files.createDirectories(fileZip.getParent());
//            FileOutputStream fos = new FileOutputStream(fileZipSign.toFile());
//            fos.write(zipSign);
//            fos.flush();
//            fos.close();

            FileUtils.writeByteArrayToFile(fileZipSign.toFile(), zipSign);
            //FileUtils.writeByteArrayToFile(fileZip.toFile(), arrayOutputStream.toByteArray());

//            FileOutputStream outputStream = new FileOutputStream(fileZip.toFile());
//            arrayOutputStream.writeTo(outputStream);
//            outputStream.flush();
//            outputStream.close();

            //     }
//            arrayOutputStream.close();

            //вставим в attachment архив и подпись архива
            businessService.preparingAttachment(fileZip, Files.readAllBytes(fileZip), messageEntity, AttachmentTransferMethod.MTOM);
//            businessService.preparingAttachment(fileZip, arrayOutputStream.toByteArray(), messageEntity, AttachmentTransferMethod.MTOM);
            businessService.preparingAttachment(fileZipSign, zipSign, messageEntity, AttachmentTransferMethod.MTOM);

        } catch (Exception e) {
            log.error(e.getMessage(), e.getCause());
            e.printStackTrace();
        }
        //String s = Marshaller.elementToString(elmentEgrnRequest);
        TRequest requestClientMessage = getRequestClientMessage(messageEntity);
        return requestClientMessage;
    }

    private void addList(Map<String, byte[]> map, String outFolder) {
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            try {
                Path f1 = Paths.get(businessService.smevAdapterOut, outFolder, entry.getKey());
                listFile.add(f1.toFile());
                FileUtils.writeByteArrayToFile(f1.toFile(), entry.getValue());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void addList(String outFolder, byte[] elmentEgrnRequest) {
        try {
            Path f1 = Paths.get(businessService.smevAdapterOut, outFolder, fileStatement + ".xml");
            listFile.add(f1.toFile());
            FileUtils.writeByteArrayToFile(f1.toFile(), elmentEgrnRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private byte[] getRequest() {
        Trequest2 request = new Trequest2();
        List<TStatementFile> statementFileList = new ArrayList<>();
        TStatementFile statementFile = new TStatementFile();
        statementFile.setFileName(fileStatement + ".xml");
        statementFileList.add(statementFile);
        request.setRequestType("111300003000");
        request.setStatementFile(statementFileList);
        List<TFile> file = new ArrayList<>();
        TFile file1 = new TFile();
        TFile file2 = new TFile();
        TFile file3 = new TFile();
        file1.setFileName(fileRequest + ".xml");
        file2.setFileName(fileRequest + ".xml.sig");
        file3.setFileName(fileStatement + ".xml.sig");
//        file.add(file1);
        file.add(file2);
        file.add(file3);
        request.setFile(file);
        Element marshal = Marshaller.marshal(request);
        RemoveUnusedNamespaces removeUnusedNamespaces = new RemoveUnusedNamespaces();
        removeUnusedNamespaces.process(marshal);
        return util.toByteArray(marshal);
    }

    @NotNull
    private TRequest getRequestClientMessage(BusinessMessageEntity messageEntity) {
        TRequest requestClientMessage = new TRequest();
        requestClientMessage.setRegion(34);
        requestClientMessage.setExternalNumber(messageEntity.getIdMessage().toString());
        requestClientMessage.setSenderType("Vedomstvo");
        requestClientMessage.setActionCode(actionCode);
        AttachmentRequestType attachmentRequestType = new AttachmentRequestType();
        attachmentRequestType.setIsMTOMAttachmentContent(true);

        TValidatedStructuredAttachmentFormat requestDescriptionType = new TValidatedStructuredAttachmentFormat();
        requestDescriptionType.setIsUnstructuredFormat(false);
        requestDescriptionType.setIsZippedPacket(true);
        requestDescriptionType.setFileName(fileRequest + ".xml");

        List<TValidatedStructuredAttachmentFormat> statementTypeList = new ArrayList<>();
        TValidatedStructuredAttachmentFormat statementType = new TValidatedStructuredAttachmentFormat();
        statementType.setIsUnstructuredFormat(false);
        statementType.setIsZippedPacket(true);
        statementType.setFileName(fileStatement + ".xml");
        statementTypeList.add(statementType);


        List<TStructuredAttachmentFormat> fileList = new ArrayList<>();
        TStructuredAttachmentFormat fileType1 = new TStructuredAttachmentFormat();
        fileType1.setIsUnstructuredFormat(true);
        fileType1.setIsZippedPacket(true);
        fileType1.setFileName(fileStatement + ".xml.sig");

        TStructuredAttachmentFormat fileType2 = new TStructuredAttachmentFormat();
        fileType2.setIsUnstructuredFormat(true);
        fileType2.setIsZippedPacket(true);
        fileType2.setFileName(fileRequest + ".xml.sig");

        fileList.add(fileType1);
        fileList.add(fileType2);

        attachmentRequestType.setFile(fileList);
        attachmentRequestType.setStatement(statementTypeList);
        attachmentRequestType.setRequestDescription(requestDescriptionType);
        requestClientMessage.setAttachment(attachmentRequestType);
        return requestClientMessage;
    }

    private byte[] getEgrnRequest() {
        //        Create EGRNRequest
        MaskFormatter maskFormatterSnils = null;


        TEGRNRequest egrnRequest = new TEGRNRequest();
        TEGRNRequestHeader header = new TEGRNRequestHeader();
        TServiceInfo serviceInfo = new TServiceInfo();
        TEGRNRequestDeclarant declarant = new TEGRNRequestDeclarant();
        TBasicOtherSubject otherSubject = new TBasicOtherSubject();
        TEGRNRequestDetails requestDetails = new TEGRNRequestDetails();
        TRequestDataAction requestDataAction = new TRequestDataAction();
        TExtractSubjectAction extractSubjectAction = new TExtractSubjectAction();
        TInterval interval = new TInterval();
        TPeriod period = new TPeriod();
        List<TEGRNRequestOwnerParams> ownerParamsList = new ArrayList<>();
        TEGRNRequestOwnerParams owner = new TEGRNRequestOwnerParams();
        TEGRNRequestOwner person = new TEGRNRequestOwner();
        TDocumentRefer documentRefer = new TDocumentRefer();
        TEGRNRequestDeliveryDetails deliveryDetails = new TEGRNRequestDeliveryDetails();
        TEGRNRequestAgreements requestAgreements = new TEGRNRequestAgreements();
        List<TBasicSomeDocument> appliedDocumentList = new ArrayList<>();
        TBasicSomeDocument SomeDocument = new TBasicSomeDocument();
        TIdDocumentRestr idDocument = new TIdDocumentRestr();
        List<DocumentTypes> documentTypesList = new ArrayList<>();
        DocumentTypes documentTypes = new DocumentTypes();

        egrnRequest.setId(messageEntity.getIdMessage().toString());
//        Государственные услуги ЕГРН - DActionCode
        header.setActionCode(actionCode);
//        Заявления и запросы ЕГРН - DStatementType
        header.setStatementType(statementType);
        header.setCreationDate(LocalDateTime.now());

        serviceInfo.setServiceName("Оказание государственной услуги по назначению меры социальной поддержки - Ежемесячная денежная выплата на ребенка в возрасте от трех до семи лет включительно");
        serviceInfo.setRequestCause("Оказание государственной услуги по назначению меры социальной поддержки - Ежемесячная денежная выплата на ребенка в возрасте от трех до семи лет включительно");
        serviceInfo.setLegalActSection("ПОСТАНОВЛЕНИЕ от 31 марта 2020 г. N 384");
        header.setServiceInfo(serviceInfo);

        //DDocument
        ReestrDoc rosreestrDOC = ReestrDoc.reestrToOtherDoc(data.getDocumentPerson().getDocCodeReestr());
        if (rosreestrDOC == null ) {
            throw new ModelException("Код документа удостоверяющего личность " + data.getDocumentPerson().getDocCodeReestr().toString() + " не поддержвается");
        }
        documentTypes.setDocumentTypeCode(rosreestrDOC.kodRosreestr());
        idDocument.setId(UUID.randomUUID().toString());
//        idDocument.setName(getNameDoc(data.getDocumentPerson().getDocCode()));
        idDocument.setName(ReestrDoc.reestrToOtherDoc(data.getDocumentPerson().getDocCodeReestr()).nameRosreestr());
        idDocument.setNumber(data.getDocumentPerson().getDocNumber());
        idDocument.setSeries(data.getDocumentPerson().getDocSeries());
        idDocument.setIssueDate(data.getDocumentPerson().getIssueDate());

        declarant.setId(UUID.randomUUID().toString());
        otherSubject.setName(businessService.propConfig.Prop().get("NAME_IS").toString());
        declarant.setOther(otherSubject);
        declarant.setBenefitCategory(benefitCategory);
        declarant.setDeclarantKind(declarantKind);
        otherSubject.setInn(businessService.propConfig.Prop().get("INN").toString());
        otherSubject.setKpp(businessService.propConfig.Prop().get("KPP").toString());
        otherSubject.setOgrn(businessService.propConfig.Prop().get("OGRN").toString());

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse("05.02.2021", formatter2);

        otherSubject.setRegDate(localDate);


        person.setSurname(data.getPerson().getSurname());
        person.setFirstname(data.getPerson().getSecname());
        person.setPatronymic(data.getPerson().getPatronymic());
        person.setBirthDate(data.getPerson().getBirthday());
        try {
            maskFormatterSnils = new MaskFormatter("###-###-### ##");
            maskFormatterSnils.setValueContainsLiteralCharacters(false);
            person.setSnils(maskFormatterSnils.valueToString(data.getPerson().getSnils()));
        } catch (ParseException e) {
            e.printStackTrace();
        }


        requestAgreements.setPersDataProcessingAgreement("01");
        requestAgreements.setActualDataAgreement("01");
        TResultDeliveryMethod resultDeliveryMethod = new TResultDeliveryMethod();
        resultDeliveryMethod.setRecieveResultTypeCode("webService");
        resultDeliveryMethod.setDataReceiveForm(DDataReceiveForm.ELECTRONIC);

        deliveryDetails.setResultDeliveryMethod(resultDeliveryMethod);


        //extractSubjectAction.setUptodateData(true);

        TTerritory territory = new TTerritory();
        territory.setTerritoryRussia(true);
        extractSubjectAction.setTerritory(territory);

        TRealtyTypes realtyTypes = new TRealtyTypes();
        realtyTypes.setRealtyTypeAll(true);
        extractSubjectAction.setRealtyTypes(realtyTypes);

        interval.setDateStart(data.getPeriod().getDateStart());
        interval.setDateEnd(data.getPeriod().getDateEnd());
        //period.setInterval(interval);
        period.setDate((data.getPeriod().getDate()));
        extractSubjectAction.setPeriod(period);

        documentRefer.setDocumentID(idDocument.getId());
        person.setIdDocumentRef(documentRefer);
        owner.setPerson(person);
        ownerParamsList.add(owner);
        extractSubjectAction.setOwner(ownerParamsList);
        requestDataAction.setExtractSubject(extractSubjectAction);
        requestDetails.setRequestEGRNDataAction(requestDataAction);


        documentTypesList.add(documentTypes);
        idDocument.setDocumentTypes(documentTypesList);
        SomeDocument.setIdDocument(idDocument);
        appliedDocumentList.add(SomeDocument);

        header.setAppliedDocument(appliedDocumentList);
        egrnRequest.setHeader(header);
        egrnRequest.setDeclarant(declarant);
        egrnRequest.setRequestDetails(requestDetails);
        egrnRequest.setDeliveryDetails(deliveryDetails);
        egrnRequest.setStatementAgreements(requestAgreements);

        Element marshal = Marshaller.marshal(egrnRequest);
        RemoveUnusedNamespaces removeUnusedNamespaces = new RemoveUnusedNamespaces();
        removeUnusedNamespaces.process(marshal);
        return util.toByteArray(marshal);
    }

    private String getNameDoc(String docCode) {

        return "Паспорт гражданина Российской Федерации";

    }

}
