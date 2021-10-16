package smev.Controller;

import info.hubbitus.annotation.XsdInfo;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.Element;
import smev.Dto.MessageDto;
import smev.ElementServices.Other.Content;
import smev.ElementServices.Dohflna.DOHFLNARequest;
import smev.ElementServices.Dohflna.IdentityDocumentShortType;
import smev.ElementServices.Dohflna.PhysicalPersonNameType;
import smev.ElementServices.Snils.SnilsByAdditionalDataRequest;
import smev.ElementServices.infoEgissoBySnils.Request;
import smev.ElementServices.infoEgissoBySnils.TRequestedData;
import smev.Kmsz;
import smev.Marshaller.Marshaller;
import smev.Send.BaseSend;
import smev.Send.StrategySend;
import smev.Service.MessageService;
import smev.Service.SmevService;
import smev.Wrapper.*;
import smev.response.Response;
import smev.response.ResponseBuilder;
import smev.utils.util;

import javax.xml.datatype.DatatypeConfigurationException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequestMapping("/api/smev")
public class MyController {


//    @Autowired
//    SmevAdapterService smevService;

    @Autowired
    SmevService smevServiceMy;

    @Autowired
    MessageService rsMessageService;


    /**
     * тестовый метод. пробуем создать один метод rest контроллера,
     * но чтобы он мог принимать разные объекты
     */
    //Создание нового исходящее сообщение
//    @ApiOperation(value = "Создание нового исходящее сообщение")
//    @GetMapping("/test1")
//
    public Response getTest1(
            @RequestBody MessageDto messageDto
    ) throws Exception {

        //rsMessageService.createRequestMessage(messageDto,null);

        return (new ResponseBuilder()).success().build();
        //Element aa =
        //log.info("bdfd");
//        if (obj instanceof A) {
//
//        }
//        if (obj instanceof B) {
//            log.info(((B) obj).getNumber());
//        }
//        A a = (A) obj;
//        log.info(a.getStr());
    }

//    //Создание нового исходящее сообщение
//    @ApiOperation(value = "Получение данных сообщения")
//    @GetMapping("/test2")
//    public Response getTest2(
//            @RequestBody MessageDto messageDto
//    ) throws Exception {
//
//        //rsMessageService.createRequestMessage(messageDto,null);
//
//        return (new ResponseBuilder()).success().build();
//
//    }



/*
* Создание ответа для входящего сообщения
* */
    //@GetMapping("")
    public void createResponse(
            //Идентификатор сообщения, для которого создаётся ответ
            @RequestBody UUID referenceMessageId
    ) throws Exception {

        this.rsMessageService.createResponseMessage(referenceMessageId, null);
    }
    /**
     * Write Request DOHFLNARequest
     * urn://x-artefacts-fns-dohflna/root/260-18/4.0.1
     */
    //@PostMapping("/postDOHFLNARequest")
    public void postDOHFLNARequest(
            //@RequestBody RequestDOHFLNARequest reqDOHFLNA
    ) throws ParseException, DatatypeConfigurationException {
        RequestDOHFLNARequest requestDOHFLNARequest = new RequestDOHFLNARequest();
        // requestDOHFLNARequest.setPersonalSignature(true);

//        GregorianCalendar gc = new GregorianCalendar();
//        XMLGregorianCalendar calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
//        gc.set(1984, 9, 14);
//        calendar.setTime(0,0,0);
        requestDOHFLNARequest.setData(DOHFLNARequest.builder()
                //.idMessage("PERSONAL_SIGNATURE")
                .idZaprosa("000000000000000000000000000000000003")
                .otchetGod(2018)
                .svFl(DOHFLNARequest.SvFl.builder()
                        //.birthday(util.StringToXmlGregorianCalendar("1984-09-14"))
                        .innFl("344703998094")
                        .snils("14842838895")
                        .fioFl(PhysicalPersonNameType.builder()
                                .familyName("Ивин")
                                .firstName("Сергей")
                                .patronymic("Сергеевич")
                                .build())
                        .udLich(IdentityDocumentShortType.builder()
                                .documentCode("21")
                                .seriesNumber("1804 612332")
                                .build())
                        .build())
                .build());

        //root
        //XsdInfo xsdAnnotation = DOHFLNARequest.class.getDeclaredAnnotation(XsdInfo.class);
        XsdInfo xsdAnnotation = null;
        try {
            //Field
            xsdAnnotation = DOHFLNARequest.class.getDeclaredField("svFl").getAnnotation(XsdInfo.class);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        log.info(xsdAnnotation.name());
        log.info(xsdAnnotation.name());

        log.info("Новый запрос 2-НДФЛ " + requestDOHFLNARequest.toString());
//        DOHFLNARequest bussinesDataReq = requestDOHFLNARequest.getData();
//        choiseStrategy(requestDOHFLNARequest, bussinesDataReq);
    }


    /*
     * Получение всех Request из таблицы SMEV
     * */
    //@GetMapping("/GetListRequestSmev")
    public List<RequestSmev> GetListRequestSmev(
    ) {
        log.info("получение списка запросов " + LocalDateTime.now());
        return smevServiceMy.GetListRequestSmev();
    }


    /*
     * получение ответа на запрос получение 2 НДФЛ
     * */

   // @GetMapping(value = "/GetDOHFLNAResponse")
    public Element GetDOHFLNAResponse(
            @RequestBody Long idAdapter
    ) {

        return smevServiceMy.GetDOHFLNAResponse(idAdapter);

    }




    /*
     * получение ответа на запрос получение информации из Егиссо по СНИЛС
     * */

    //@GetMapping("/GetResponseInfoEgissoBySnils")
    public void GetResponseInfoEgissoBySnils(
            @RequestBody Long idAdapter
    ) {

        smevServiceMy.GetInfoEgissoBySnils(idAdapter);

    }


    /*
     * получение информации из Егиссо по СНИЛС
     * */

    //@GetMapping("/GetRequestInfoEgissoBySnils")
    public void GetRequestInfoEgissoBySnils() throws ParseException {

        TRequestedData tRequestedData = new TRequestedData();
        Request request = new Request();

        Date dateBegin = new SimpleDateFormat("dd-MM-yyyy").parse("21-05-1967");
        Date dateEnd = new SimpleDateFormat("dd-MM-yyyy").parse("21-05-1967");

        tRequestedData.setSnils("11737784886");
        TRequestedData.ReportPeriod build = TRequestedData.ReportPeriod.builder()
                .beginDate(util.getDate(dateBegin))
                .endDate(util.getDate(dateEnd))
                .build();
        tRequestedData.setReportPeriod(build);
        request.setRequestData(tRequestedData);
        RequestInfoEgissoBySnils build1 = new RequestInfoEgissoBySnils();
//        build1.subject.setID_BASE(0);
//        build1.subject.setID_REGION(0);
//        build1.subject.setID_SUBJECT(0);
        build1.setData(request);

        choiseStrategy(build1, request);

    }

    /**
     * Get Response СНИЛС
     */
    //@GetMapping(path = "/getSnils", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getSnils(
            @RequestBody Long idAdapter
    ) {
        return smevServiceMy.GetSnils(idAdapter);
    }

    /**
     * Write Request СНИЛС
     */
    //@PostMapping("/postSnils")
    public void postSnils(
            @RequestBody RequestSnils reqSnils
    ) throws ParseException {
        log.info("Новый запрос СНИЛС " + reqSnils.toString());
        //Date date = new SimpleDateFormat("dd-MM-yyyy").parse("21-05-1967");
        //Date date = formatter.parse("21-05-1967");


//        SnilsByAdditionalDataRequest bussinesDataReq = reqSnils.getData();
//        reqSnils.subject.setSurname(reqSnils.getData().getFamilyName());
//        reqSnils.subject.setName_domain(reqSnils.getData().getFirstName());
//        reqSnils.subject.setSecname(reqSnils.getData().getPatronymic());
//        reqSnils.subject.setBirthday(reqSnils.getData().getBirthday().toGregorianCalendar().toZonedDateTime().toLocalDate());
//        reqSnils.subject.setSecname("ИВАНОВ");
//        req.setFirstName("ИВАН");
//        req.setPatronymic("ИВАНОВИЧ");
//        req.setBirthday(util.getDate(date));
//        req.setGender(GenderType.MALE);

//        choiseStrategy(reqSnils, bussinesDataReq);
    }


    /**
     * @Запрос на получение классификатора 2
     */
   // @GetMapping("/getKmsz")
    public void getKmsz(
            // @RequestBody RequestKmsz reqKmsz
    ) {
        log.info("sfsdf");
//        Request request = reqKmsz.getData();
//        choiseStrategy(reqKmsz, request);
    }


    /**
     * @Запрос на получение классификатора 2
     */


    /**
     * @Запрос на получение классификатора
     */
    //@PutMapping("/getKmszOld")
    public void getKmszOld(
            @RequestBody RequestSnils request
    ) {
/* другой способ
//        Content content = ru.uszn.smev.ElementServices.Kmsz.builder()
//                .build().reqGetKmsz();
//        smevServiceMy.writeToBase(content);
  */
        if (request == null) {
            log.error("Запрос должен содержать метаданные");
        }
        StrategySend strategySend = new StrategySend();
        strategySend.setSendingRequest(new BaseSend(smevServiceMy));
        Content content = Kmsz.builder()
                .build().reqGetKmsz();
        //content.setRequest(request);
        //strategySend.executeStrategy(content, request);

        //smevServiceMy.updateProcessFieldInTableReceive();
//
//        strategySend.setSendingRequest(new WebServiceSend());
//        strategySend.executeStrategy(content);


//        try {
//            smevService.send(null);
//        } catch (RemoteException e) {
//            e.printStackTrace();
//        }
        log.info("Rest Ok");
        // smevService.getInstanceService();
    }

    private void choiseStrategy(ObjectMessage req, Object bussinesDataReq) {
        Element bussinesData = Marshaller.marshal(bussinesDataReq);
//        DOMResult domResult=null;
//        try {
//            JAXBContext context = JAXBContext.newInstance(DOHFLNARequest.class);
//            javax.xml.bind.Marshaller Marshaller = context.createMarshaller();
//            Marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT,true);
//            Marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8");
//            domResult = new DOMResult();
//            Marshaller.marshal(bussinesDataReq,domResult);
//        } catch (PropertyException e) {
//            e.printStackTrace();
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }
        //Element bussinesData = ((Document) domResult.getNode()).getDocumentElement();


        StrategySend strategySend = new StrategySend();
        strategySend.setSendingRequest(new BaseSend(smevServiceMy));
        strategySend.executeStrategy(bussinesData, req);
    }


}
