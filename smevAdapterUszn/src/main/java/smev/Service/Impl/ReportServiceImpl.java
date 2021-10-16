package smev.Service.Impl;

import lombok.extern.log4j.Log4j2;
import net.sf.saxon.TransformerFactoryImpl;
import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import smev.Dto.ReportDataDto;
import smev.ElementServices.Report.ReportPrint;
import smev.Entity.BusinessAttachmentEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Enum.MessageState;
import smev.Marshaller.Marshaller;
import smev.Report.InteractionStatus;
import smev.Service.*;
import smev.utils.util;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.UUID;

@Service
@Log4j2
public class ReportServiceImpl implements ReportService {


    @Value("${spring.profiles.active}")
    public String profileActive;

    @Autowired
    BusinessService businessService;

    @Autowired
    UserService userService;

    @Autowired
    InteractionService interactionService;

    @Override
    public Element ContentStringToElement(String content) {
        return util.toElement(content);
    }

    @Override
    public String CreateReport(ReportDataDto reportDataDto) {

        try {
            ReportPrint reportPrint = getReportPrint(reportDataDto);
//        File fileXml = new File("F:\\outData.xml");
//        OutputStream outputStream = new ByteArrayOutputStream();
//        Marshaller.marshal(reportPrint, outputStream);

            /*Сделал через Element потому что Stream криво превращается в Source(нужный для transform)*/
            Element marshal = Marshaller.marshal(reportPrint);
            return transformToHtml(reportDataDto.getXsltForm(), marshal);
        } catch (Exception ex) {
            log.error("{}, {} ошибка",reportDataDto.getInteractionId(), reportDataDto.getXsltForm());
            log.error(ex.getMessage());
        }
        return "";
    }
//    @Override
//    public String CreateReportOfStrategy(ReportEnum reportEnum, ReportParamDto reportParamDto) {
//        CreateReportStrategy createReportStrategy = map.getOrDefault(reportEnum.index(), new DefaultCreateReportStrategy());
//       return createReportStrategy.createReport(reportParamDto);
//
//    }

    @NotNull
    @Override
    public String transformToHtml(String xsltForm, Element marshal) {
        String s = Marshaller.elementToString(marshal);

        if (!profileActive.equals("prod")) {
            File fileXml = new File("F:\\DataXml.xml");
            try {
                FileUtils.writeStringToFile(fileXml, s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        //Reader reader = new InputStreamReader(new ByteArrayInputStream(((ByteArrayOutputStream) outputStream).toByteArray()));
        //StreamSource streamSource = null;
//        try {
//            streamSource = new StreamSource(((ByteArrayOutputStream) outputStream).toString("UTF-8"));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        //StreamSource streamSource = new StreamSource(new StringReader("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ReportPrint xmlns:ns2=\"urn://x-artefacts-fns-ndfl3doh/root/210-18/4.0.2\" xmlns:ns1=\"urn://x-artefacts-fns-dohflna/root/260-18/4.0.1\" xmlns:ns3=\"urn://x-artefacts-fns-ndipsr/root/210-17/4.0.0\" xmlns:tns1=\"urn://x-artefacts-smev-gov-ru/services/service-adapter/types\" xmlns:ns5=\"http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0\" xmlns:ns6=\"urn://x-artefacts-smev-gov-ru/supplementary/commons/1.0.1\" xmlns:ns7=\"http://kvs.pfr.com/snils-by-additionalData/1.0.1\" xmlns:ns8=\"http://common.kvs.pfr.com/1.0.0\" xmlns:ns9=\"urn://egisso-ru/types/cls-request/1.0.2\" xmlns:ns10=\"urn://egisso-ru/msg/10.02.I/1.0.2\" xmlns:ns11=\"urn://x-artefacts-fns-dohflna/types/4.0.1\" xmlns:ns12=\"urn://x-artefacts-fns-svviplfl/root/114-43/4.0.0\" xmlns:ns13=\"urn://x-artefacts-fns-ndipsr/types/4.0.0\" xmlns:ns14=\"urn://x-artefacts-fns-inn-singular/root/270-18/4.0.1\" xmlns:ns15=\"urn://x-artefacts-fns-inn/commons/4.0.0\" xmlns:ns17=\"urn://egisso-ru/types/prsn-statement/1.0.3\" xmlns:ns18=\"urn://egisso-ru/msg/10.13.I/1.0.3\"><reportRequest><MessagePrimaryContent><DOHFLNARequest Id=\"PERSONAL_SIGNATURE\" ИдЗапрос=\"000000000000000000000000000000000001\" ОтчетГод=\"2015\"><СвФЛ ДатаРожд=\"1980-01-01Z\" ИННФЛ=\"100000000074\" СНИЛС=\"00000000000\"><ФИОФЛ FamilyName=\"ИВАНОВ\" FirstName=\"ИВАН\" Patronymic=\"ИВАНОВИЧ\"/><УдЛичн DocumentCode=\"21\" SeriesNumber=\"0000 000000\"/></СвФЛ></DOHFLNARequest></MessagePrimaryContent><requestCreateDate>2020-08-08T18:30:04</requestCreateDate><transportId>2fc66cf1-4982-4770-8f77-77947ac501b1</transportId></reportRequest><reportResponse><DOHFLNAResponse ИдЗапрос=\"000000000000000000000000000000000001\"><ДохФЛ ОтчетГод=\"2015\"><ДохФЛ_НА><ПолучДох ДатаРожд=\"1980-01-01Z\" ИННФЛ=\"100000000074\"><ФИО FamilyName=\"ИВАНОВ\" FirstName=\"ИВАН\" Patronymic=\"ИВАНОВИЧ\"/><УдЛичнФЛ DocumentCode=\"21\" SeriesNumber=\"0000 000000\"/></ПолучДох><СвНА><СвНАФЛ ИННФЛ=\"100000000074\"><ФИО FamilyName=\"ИВАНОВ\" FirstName=\"ИВАН\" Patronymic=\"ИВАНОВИЧ\"/></СвНАФЛ></СвНА><СведДох_2НДФЛ Ставка=\"13\"><ДохВыч><СвСумДох КодДоход=\"2000\" Месяц=\"01\" СумДоход=\"1000.12\"/><СвСумДох КодДоход=\"2000\" Месяц=\"02\" СумДоход=\"2000.12\"/></ДохВыч><СГДНалПер НалБаза=\"3000.24\" СумДохОбщ=\"3000.24\"/></СведДох_2НДФЛ></ДохФЛ_НА><ДохФЛ_НА><ПолучДох ДатаРожд=\"1980-01-01Z\" ИННФЛ=\"100000000074\"><ФИО FamilyName=\"ИВАНОВ\" FirstName=\"ИВАН\" Patronymic=\"ИВАНОВИЧ\"/><УдЛичнФЛ DocumentCode=\"21\" SeriesNumber=\"0000 000000\"/></ПолучДох><СвНА><СвНАЮЛ ИННЮЛ=\"1000000002\" КПП=\"010101001\" НаимОрг=\"ООО ТЕСТ\"/></СвНА><СведДох_НДПриб><ДохНалПер НалБаза=\"3000.11\" Ставка=\"2\" СумДохОбщ=\"5000.11\"/></СведДох_НДПриб></ДохФЛ_НА></ДохФЛ></DOHFLNAResponse><responseCreateDate>2020-08-08T18:31:27</responseCreateDate><responseId>865a55b3-3337-4e6a-84f8-890fea4b9bfb</responseId></reportResponse><interactionStatus><statusReport><code>0</code><desc>Сообщение отправлено в СМЭВ</desc></statusReport></interactionStatus></ReportPrint>"));
        StreamSource streamSource = new StreamSource(new StringReader(s));

        //Source xslDoc = new StreamSource("SampleFile.xsl");
        Source xslDoc = null;
        /*Если файл существует в каталоге корня то берем его иначе берем из ресурсов*/
        File f = new File(xsltForm);
        if (f.exists()) {
            xslDoc = new StreamSource(xsltForm);
        } else {
            xslDoc = new StreamSource(getClass().getClassLoader().getResourceAsStream(xsltForm));
        }

        /*определяем путь к файлу xslt формы чтобы написать его в setSystemId,
        чтобы процессор брал все файлы по этому пути*/
        String path = util.getPathXsltForm(xsltForm);
        xslDoc.setSystemId(path);


        return getStringWriter(streamSource,  xslDoc);
    }

    @NotNull
    private String getStringWriter(StreamSource streamSource, Source xslDoc) {
        TransformerFactory tFactory = new TransformerFactoryImpl();
        StringWriter outWriter = new StringWriter();
        StreamResult result = new StreamResult(outWriter);
        Transformer trasform;
        try {
            trasform = tFactory.newTransformer(xslDoc);
            //StreamSource streamSource = new StreamSource(reader);
            trasform.transform(streamSource, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }

        if (log.isDebugEnabled()) {
        File fileXml = new File("F:\\ResultHtml.html");
        try {
            FileUtils.writeStringToFile(fileXml,outWriter.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
//        log.info(outWriter.toString());
        }
        return outWriter.toString();
    }

    @NotNull
    private ReportPrint getReportPrint(ReportDataDto reportDataDto) {
        List<BusinessMessageEntity> messages = this.businessService.getMessagesWithContentByInteractionId(reportDataDto.getInteractionId());
        ReportPrint reportPrint = new ReportPrint();
        InteractionStatus interactionStatus = new InteractionStatus();
        for (BusinessMessageEntity messageEntity : messages) {
            switch (messageEntity.getMode()) {
                case MESSAGE:
                    switch (messageEntity.getType()) {
                        case REQUEST:
                            if (messageEntity.getState().equals(MessageState.DRAFT)) {
                                continue;
                            }
                            Element element = util.toElement(messageEntity.getContent());
                            reportPrint.setReportRequest(ReportPrint.ReportRequest.builder()
                                    .reportRequestAny(getElementMessagePrimary(element))
                                    .requestId(messageEntity.getIdMessage())
                                    .requestCreateDate(messageEntity.getCreationDate())
                                    .userName(this.userService.getUserById(messageEntity.getUserId()).getFioUser())
                                    .build());


                            break;
                        case RESPONSE:
                            List<BusinessAttachmentEntity> attachmentEntitie = this.businessService.getAttachmentsByMessageId(messageEntity.getIdMessage());
                            String xmAttachmentString = "";
                            if (attachmentEntitie.size() > 0) {
                                Document documentFromByte = businessService.getDocumentFromByte(attachmentEntitie.get(0).getContent());
                                xmAttachmentString = Marshaller.elementToString(documentFromByte.getDocumentElement());
                            }
                            reportPrint.setReportResponse(ReportPrint.ReportResponse.builder()
                                    .reportResponseAny(util.toElement(Marshaller.removeNStoString(messageEntity.getContent())))
                                    .responseId(messageEntity.getIdMessage())
                                    .responseCreateDate(messageEntity.getCreationDate())

                                    .reportAttachmentData(ReportPrint.ReportAttachmentData.builder()
                                            .reportAttachmentDataAny(util.toElement(Marshaller.removeNStoString(xmAttachmentString)))
                                            .attachmentId(attachmentEntitie.size() > 0 ? attachmentEntitie.get(0).getId():null)
                                            .build())

                                    .build());
                            break;
                    }
                    break;
                case REJECT:
                    interactionStatus.setRejectReport(
                            InteractionStatus.RejectReport.builder()
                                    .code(messageEntity.getCode())
                                    .desc(messageEntity.getDescription())
                                    .rejectDate(messageEntity.getCreationDate())
                                    .build()
                    );

                    break;
                case STATUS:
                    interactionStatus.setStatusReport(
                            InteractionStatus.StatusReport.builder()
                                    .code(messageEntity.getCode())
                                    .desc(messageEntity.getDescription())
                                    .statusDate(messageEntity.getCreationDate())
                                    .build()
                    );
                    break;
                case ERROR:
                    interactionStatus.setErrorReport(
                            InteractionStatus.ErrorReport.builder()
                                    .code(messageEntity.getCode())
                                    .desc(messageEntity.getDescription())
                                    .errorDate(messageEntity.getCreationDate())
                                    .build()
                    );
                    break;
            }
        }
        reportPrint.setInteractionStatus(interactionStatus);
        return reportPrint;
    }



    private Element getElementMessagePrimary(Element element) {
        NodeList messagePrimaryContent = element.getElementsByTagName("MessagePrimaryContent");
        for (int i = 0; i < messagePrimaryContent.getLength(); i++) {
            Node n = messagePrimaryContent.item(i);
            if (n.getNodeType() == Node.ELEMENT_NODE) {
                return (Element) n;
            }
        }
        return null;
    }
}
