package smev.Service.Impl;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import smev.ElementServices.Dohflna.DOHFLNAResponse;
import smev.ElementServices.Other.QueryResult;
import smev.ElementServices.Snils.SnilsByAdditionalDataResponse;
import smev.ElementServices.infoEgissoBySnils.Request;
import smev.ElementServices.infoEgissoBySnils.Response;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Enum.MessageDirection;
import smev.Enum.MessageMode;
import smev.Enum.MessageState;
import smev.Enum.MessageType;
import smev.Marshaller.Marshaller;
import smev.SQL;
import smev.Service.SmevService;
import smev.Sign.SignatureOperationsClient;
import smev.Wrapper.ObjectMessage;
import smev.Wrapper.RequestSmev;
import smev.dao.SmevDao;
import smev.utils.util;

import javax.xml.transform.TransformerException;
import java.util.List;

@Service
@Log4j2
public class SmevServiceImpl implements SmevService {


    SignatureOperationsClient signatureOperationsClient;

    @Autowired
    private SmevDao smevDao;

    @Override
    public String GetSnils(Long idAdapter) {
        //TODO попробывать добавить в объект SnilsByAdditionalDataResponse пространство имен и
        // избавить от удаления NS

        String content = smevDao.getContent(idAdapter);
        //content = SQL.SQL_RESPONSE;
        InputSource inputSource = Marshaller.removeNS(content);
        Element element = null;
        try {
            QueryResult res = (QueryResult) Marshaller.unmarshal(inputSource);
            //Element element = res.getMessage().getResponseContent().getContent().getMessagePrimaryContent().getAny();
            SnilsByAdditionalDataResponse res2 = (SnilsByAdditionalDataResponse) Marshaller.unmarshal(element);
            log.info(res2);
            return res2.getSnils();
        } catch (Exception e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public Request GetInfoEgissoBySnils(Long idAdapter) {

        String content = smevDao.getContent(idAdapter);
        //content = SQL.SQL_RESPONSE;
        //content = null;
        //InputSource inputSource = new InputSource(content);
        InputSource inputSource = Marshaller.removeNS(content);
        Element element = null;
        try {
            QueryResult res = (QueryResult) Marshaller.unmarshal(inputSource);
            //Element element = res.getMessage().getResponseContent().getContent().getMessagePrimaryContent().getAny();
            Response res2 = (Response) Marshaller.unmarshal(element);
            log.info(res2);
        } catch (Exception e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public void saveMessage(Element bussinesData, ObjectMessage req) throws TransformerException {

        BusinessMessageEntity messageEntity = new BusinessMessageEntity();
        messageEntity.setDirection(MessageDirection.OUTGOING);
        messageEntity.setType(MessageType.REQUEST);
        messageEntity.setMode(MessageMode.MESSAGE);
        messageEntity.setState(MessageState.DRAFT);

//        if (messageEntity.getIdMessage() == null) {
//            //insertMessageIntoT_Send
//            messageEntity.setIdMessage(UUID.randomUUID());
//            messageEntity.setContent(generateContent(messageEntity, bussinesData));
//            smevDao.insertMessageIntoT_Send(messageEntity);
//        } else {
//            //insertMessage
//            smevDao.insertMessage(messageEntity);
//        }


//        try {
//            JAXBContext context = JAXBContext.newInstance(ClientMessage.class);
//            javax.xml.bind.Marshaller Marshaller = context.createMarshaller();
//            Marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT,false);
//            Marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8");
//            sw = new StringWriter();
//            Marshaller.marshal(clientMessage,sw);
//        } catch (PropertyException e) {
//            e.printStackTrace();
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }

//        byte[] s=null;
//        GetSignAdapter getSignAdapter = new GetSignAdapter(signatureOperationsClient);
//        try {
//            s = getSignAdapter.GetSignAdapter("<ns1:DOHFLNARequest xmlns:ns1=\"urn://x-artefacts-fns-dohflna/root/260-18/4.0.1\" Id=\"PERSONAL_SIGNATURE\" ИдЗапрос=\"000000000000000000000000000000000003\" ОтчетГод=\"2015\"><ns1:СвФЛ ДатаРожд=\"1984-09-14\" ИННФЛ=\"344703998094\" СНИЛС=\"14842838895\"><ns1:ФИОФЛ FamilyName=\"Ивин\" FirstName=\"Сергей\" Patronymic=\"Сергеевич\"/><ns1:УдЛичн DocumentCode=\"21\" SeriesNumber=\"1804 612332\"/>");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        String s1 = DatatypeConverter.printBase64Binary(s);

//        String str = null;
//        try {
//            str = Marshaller.stringFrom(marshal);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //String str = Marshaller.convertElementToString(clientMessage);
        //final String str = sw.toString();

        log.info("Конверт в смэв сформирован " + messageEntity.getSmevMessageId());
        log.info(messageEntity.getContent());
        smevDao.writeToBase(messageEntity.getContent(), messageEntity.getSmevMessageId(), req);
    }




    @Override
    public List<RequestSmev> GetListRequestSmev() {
        return smevDao.allRequestSmev();
    }

    @Override
    public Element GetDOHFLNAResponse(Long idAdapter) {
        //String content = smevDao.getContent(idAdapter);
        String content = SQL.SQL_RESPONSE_DOHFLNA;
        Element document = null;
        //content = null;

        document = util.toElement(content);

        InputSource inputSource = new InputSource(content);
        //InputSource inputSource = Marshaller.removeNS(content);
        DOHFLNAResponse res2 = null;
        Element element = null;

       Element element1 = util.getElementMessagePrimaryContent(content,"content");
       String dd = util.getInnerHTML(element1);
//        String dd=""; //= "<?xml version=\"1.0\" encoding=\"UTF-8\"?><DOHFLNAResponse ИдЗапрос=\"000000000000000000000000000000000003\"><ДохФЛ ОтчетГод=\"2018\"><ДохФЛ_НА><ПолучДох ДатаРожд=\"1984-09-14\" ИННФЛ=\"344703998094\"><ФИО FamilyName=\"ИВИН\" FirstName=\"СЕРГЕЙ\" Patronymic=\"СЕРГЕЕВИЧ\"/><УдЛичнФЛ DocumentCode=\"21\" SeriesNumber=\"18 04612332\"/></ПолучДох><СвНА><СвНАЮЛ ИННЮЛ=\"3444059322\" КПП=\"344401001\" НаимОрг=\"КОМИТЕТ СОЦИАЛЬНОЙ ЗАЩИТЫ НАСЕЛЕНИЯ ВОЛГОГРАДСКОЙ ОБЛАСТИ\"/></СвНА><СведДох_2НДФЛ Ставка=\"13\"><ДохВыч><СвСумДох КодДоход=\"2000\" Месяц=\"01\" СумДоход=\"33339.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"02\" СумДоход=\"33337.82\"/><СвСумДох КодДоход=\"2000\" Месяц=\"03\" СумДоход=\"33339.00\"/><СвСумДох КодДоход=\"2002\" Месяц=\"03\" СумДоход=\"24416.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"04\" СумДоход=\"69963.00\"/><СвСумДох КодДоход=\"2012\" Месяц=\"04\" СумДоход=\"26237.10\"/><СвСумДох КодДоход=\"2760\" Месяц=\"04\" СумДоход=\"24416.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"05\" СумДоход=\"10001.33\"/><СвСумДох КодДоход=\"2000\" Месяц=\"06\" СумДоход=\"32375.37\"/><СвСумДох КодДоход=\"2000\" Месяц=\"07\" СумДоход=\"34278.00\"/><СвСумДох КодДоход=\"2012\" Месяц=\"07\" СумДоход=\"26846.05\"/><СвСумДох КодДоход=\"2000\" Месяц=\"08\" СумДоход=\"13412.64\"/><СвСумДох КодДоход=\"2000\" Месяц=\"09\" СумДоход=\"34278.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"10\" СумДоход=\"34278.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"11\" СумДоход=\"34278.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"12\" СумДоход=\"34278.00\"/><СвСумДох КодДоход=\"2002\" Месяц=\"12\" СумДоход=\"12956.61\"/></ДохВыч><СГДНалПер НалБаза=\"498229.92\" СумДохОбщ=\"512029.92\"/></СведДох_2НДФЛ></ДохФЛ_НА></ДохФЛ></DOHFLNAResponse>";
//        try {
//            dd = getInnerHTML(element1);
//        } catch (TransformerException e) {
//            e.printStackTrace();
//        }
//        log.info(dd);
        try {
            QueryResult res = (QueryResult) Marshaller.unmarshal(document);
            //element = res.getMessage().getResponseContent().getContent().getMessagePrimaryContent().getAny();
            res2 = (DOHFLNAResponse) Marshaller.unmarshal(element);
//            String dd; //= "<?xml version=\"1.0\" encoding=\"UTF-8\"?><DOHFLNAResponse ИдЗапрос=\"000000000000000000000000000000000003\"><ДохФЛ ОтчетГод=\"2018\"><ДохФЛ_НА><ПолучДох ДатаРожд=\"1984-09-14\" ИННФЛ=\"344703998094\"><ФИО FamilyName=\"ИВИН\" FirstName=\"СЕРГЕЙ\" Patronymic=\"СЕРГЕЕВИЧ\"/><УдЛичнФЛ DocumentCode=\"21\" SeriesNumber=\"18 04612332\"/></ПолучДох><СвНА><СвНАЮЛ ИННЮЛ=\"3444059322\" КПП=\"344401001\" НаимОрг=\"КОМИТЕТ СОЦИАЛЬНОЙ ЗАЩИТЫ НАСЕЛЕНИЯ ВОЛГОГРАДСКОЙ ОБЛАСТИ\"/></СвНА><СведДох_2НДФЛ Ставка=\"13\"><ДохВыч><СвСумДох КодДоход=\"2000\" Месяц=\"01\" СумДоход=\"33339.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"02\" СумДоход=\"33337.82\"/><СвСумДох КодДоход=\"2000\" Месяц=\"03\" СумДоход=\"33339.00\"/><СвСумДох КодДоход=\"2002\" Месяц=\"03\" СумДоход=\"24416.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"04\" СумДоход=\"69963.00\"/><СвСумДох КодДоход=\"2012\" Месяц=\"04\" СумДоход=\"26237.10\"/><СвСумДох КодДоход=\"2760\" Месяц=\"04\" СумДоход=\"24416.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"05\" СумДоход=\"10001.33\"/><СвСумДох КодДоход=\"2000\" Месяц=\"06\" СумДоход=\"32375.37\"/><СвСумДох КодДоход=\"2000\" Месяц=\"07\" СумДоход=\"34278.00\"/><СвСумДох КодДоход=\"2012\" Месяц=\"07\" СумДоход=\"26846.05\"/><СвСумДох КодДоход=\"2000\" Месяц=\"08\" СумДоход=\"13412.64\"/><СвСумДох КодДоход=\"2000\" Месяц=\"09\" СумДоход=\"34278.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"10\" СумДоход=\"34278.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"11\" СумДоход=\"34278.00\"/><СвСумДох КодДоход=\"2000\" Месяц=\"12\" СумДоход=\"34278.00\"/><СвСумДох КодДоход=\"2002\" Месяц=\"12\" СумДоход=\"12956.61\"/></ДохВыч><СГДНалПер НалБаза=\"498229.92\" СумДохОбщ=\"512029.92\"/></СведДох_2НДФЛ></ДохФЛ_НА></ДохФЛ></DOHFLNAResponse>";
//            dd = getInnerHTML(element);
//            log.info(dd);
        } catch (Exception e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
        return element;
    }

    @Override
    public void saveMessage(BusinessMessageEntity messageEntity) {

        if (messageEntity.getIdMessage() == null) {
            //insertMessageIntoT_Send
            smevDao.insertMessage(messageEntity);
        } else {
            //TODO UPDATE MESSAGE
            //insertMessage
            //smevDao.insertMessage(messageEntity);
        }


        //log.info("Конверт в смэв сформирован " + messageEntity.getSmevMessageId());
        //log.info(messageEntity.getContent());
        //smevDao.writeToBase(messageEntity.getContent(), messageEntity.getSmevMessageId(), subject);


    }

    @Override
    public String generateContent(BusinessMessageEntity messageEntity) {
        return null;
    }



}
