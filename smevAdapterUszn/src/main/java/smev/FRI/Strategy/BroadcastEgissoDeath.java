package smev.FRI.Strategy;


import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import smev.ElementServices.Egisso.Death.FATALRequest;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Enum.*;
import smev.FRI.Service.BroadcastStrategy;
import smev.Marshaller.Marshaller;
import smev.Reestr.Entity2.ZagsEntity;
import smev.Reestr.Service.ReestrService;
import smev.Service.BusinessService;
import smev.Service.MessageService;
import smev.utils.util;

import java.time.format.DateTimeFormatter;
import java.util.List;


@Component
@Log4j2
public class BroadcastEgissoDeath implements BroadcastStrategy {

    @Autowired
    private MessageService messageService;

    @Autowired
    private BusinessService businessService;

    @Autowired
    ReestrService reestrService;

    @Override
    public void reading() {
//        log.info("читаем рассылку по умершим...");
        List<BusinessMessageEntity> list = messageService.getMessagesByParam(InquiryVersionEnum.getInquiryId(InquiryVersionEnum.DEATH_EGISSO)
                , MessageDirection.INCOMING, MessageMode.MESSAGE, MessageType.REQUEST, MessageState.RECEIVED, InteractionState.IN_WORK);


        if (list.size() > 0) {
            log.info("Входящая рассылка по ЕГР ЗАГС от ЕГИССО - {} сообщений", list.size());
        }

        for (BusinessMessageEntity entity : list) {
            log.info("Обработка сообщения {} ", list.indexOf(entity));
            BusinessInteractionEntity interactionEntity = businessService.getInteractionById(entity.getInteractionId());

//            String contentRequest = messageService.getContent(entity.getContentId());

            //String contentRequest = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><ns1:FATALRequest xmlns:ns1='urn://egisso-ru/msg/10.29.O/1.0.1' xmlns:ns2=\"urn://egisso-ru/types/death-reg/1.0.1\" ДатаСвед=\"2019-03-13\" ИдСвед=\"a\"><ns1:СведРегСмерт ДатаВерс=\"2018-12-15\" ДатаЗапис=\"2018-12-15\" НомерВерс=\"1\" НомерЗапис=\"111111111111111111111\"><ns1:ОрганЗАГС КодЗАГС=\"R0000000\" НаимЗАГС=\"Федеральное Управление ЗАГС\"/><ns1:СтатусЗаписи ДатаНачСтатус=\"2019-03-13\" КодСтатус=\"01\" НаимСтатус=\"запись акта первичная\"/><ns1:ПрдСведРег><ns1:СведУмер Пол=\"1\" СНИЛС=\"732 047 965 92\"><ns1:Гражданство НаимСтраны=\"Российская Федерация\" ОКСМ=\"643\"/><ns1:ФИОУмер><ns2:Фамилия>Иванов</ns2:Фамилия><ns2:Имя>Иван</ns2:Имя><ns2:Отчество>Иванович</ns2:Отчество></ns1:ФИОУмер><ns1:ДатаРождКаленд>1950-12-13</ns1:ДатаРождКаленд><ns1:МестоРожден Город=\"Уфа\" КодСтраны=\"643\" МестоТекст=\"Российская Федерация г. Уфа, ул. Ленина, д. 1, кв. 1\" НаимСтраны=\"Российская Федерация\" НаимСубъект=\"Республика Башкортостан\" ПризнМесто=\"1\" Регион=\"02\"/><ns1:МЖПосл><ns2:МЖПослРФ АдрРФТекст=\"Российская Федерация г. Уфа, ул. Ленина, д. 1, кв. 1\" ПрТипАдрРФ=\"1\"><ns2:АдрКЛАДР Город=\"Уфа\" Дом=\"1\" Индекс=\"111111\" Кварт=\"1\" КодРегион=\"02\" Корпус=\"1\" НаимРегион=\"Республика Башкортостан\" Улица=\"Ленина\"/></ns2:МЖПослРФ></ns1:МЖПосл><ns1:УдЛичнФЛ ВыдДок=\"a\" ДатаДок=\"1957-08-13\" КодВидДок=\"21\" НаимДок=\"Паспорт гражданина Российской Федерации\" СерНомДок=\"55\"/><ns1:ДатаСмертКаленд>1950-12-13</ns1:ДатаСмертКаленд><ns1:ВремяСмерт>09:00:00</ns1:ВремяСмерт><ns1:МестоСмерт Город=\"Уфа\" КодСтраны=\"643\" МестоТекст=\"Российская Федерация г. Уфа, ул. Ленина, д. 1, кв. 1\" НаимСтраны=\"Российская Федерация\" НаимСубъект=\"Республика Башкортостан\" ПризнМесто=\"1\" Регион=\"02\"/></ns1:СведУмер></ns1:ПрдСведРег></ns1:СведРегСмерт></ns1:FATALRequest>";
            /*unmarshal напрямую со String не сработал, пришлось через Element*/

            try {
                Element element = util.toElement(messageService.getContent(entity.getContentId()));
                FATALRequest fatalRequest = (FATALRequest) Marshaller.unmarshal(element);
                if (fatalRequest != null) {
                    for (FATALRequest.СведРегСмерт sub : fatalRequest.getСведРегСмерт()) {
                        log.info("Обработка записи {} ", fatalRequest.getСведРегСмерт().indexOf(sub));
                        if (fatalRequest.getСведРегСмерт().indexOf(sub) == 117) {
//                            log.info("");
                        }
                        ZagsEntity zagsEntity = new ZagsEntity();

                        zagsEntity.setSurname(sub.getПрдСведРег().getСведУмер().getФИОУмер().getФамилия());
                        zagsEntity.setName(sub.getПрдСведРег().getСведУмер().getФИОУмер().getИмя());

                        if (sub.getПрдСведРег().getСведУмер().getФИОУмер().getПрОтчество() != null && sub.getПрдСведРег().getСведУмер().getФИОУмер().getПрОтчество().equals("1")) {
                            zagsEntity.setSecname("");
                        } else
                            zagsEntity.setSecname(sub.getПрдСведРег().getСведУмер().getФИОУмер().getОтчество());

                        if (sub.getПрдСведРег().getСведУмер().getПрМЖПосл() != null && sub.getПрдСведРег().getСведУмер().getПрМЖПосл().equals("1")) {
                            zagsEntity.setAddressLiveLast("");
                        } else if (sub.getПрдСведРег().getСведУмер().getМЖПосл().getМЖПослРФ() != null) {
                            zagsEntity.setAddressLiveLast(sub.getПрдСведРег().getСведУмер().getМЖПосл().getМЖПослРФ().getАдрРФТекст());
                        }




                        String sBirthday = "";
                        if (sub.getПрдСведРег().getСведУмер().getДатаРождКаленд() != null) {
                            sBirthday = sub.getПрдСведРег().getСведУмер().getДатаРождКаленд().toGregorianCalendar().toZonedDateTime().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                        } else {
                              if (sub.getПрдСведРег().getСведУмер().getДатаРождДок() != null) {
                                if (sub.getПрдСведРег().getСведУмер().getДатаРождДок().getПрДень() != null && sub.getПрдСведРег().getСведУмер().getДатаРождДок().getПрДень().equals("1")) {
                                    sBirthday = "01";
                                } else
                                    sBirthday = sub.getПрдСведРег().getСведУмер().getДатаРождДок().getДень().toString();

                                if (sub.getПрдСведРег().getСведУмер().getДатаРождДок().getПрМесяц() != null && sub.getПрдСведРег().getСведУмер().getДатаРождДок().getПрМесяц().equals("1")) {
                                    String mm = "01";
                                } else
                                    sBirthday = sBirthday + "." + sub.getПрдСведРег().getСведУмер().getДатаРождДок().getМесяц().toString();

                                sBirthday = sBirthday + "." + sub.getПрдСведРег().getСведУмер().getДатаРождДок().getГод().toString();
                            }
                        }
                        zagsEntity.setBirthDay(sBirthday);


//                        if (sub.getПрдСведРег().getСведУмер().getПрДатаРожд() != null && sub.getПрдСведРег().getСведУмер().getПрДатаРожд().equals("1")) {
//                            zagsEntity.setBirthday("");
//                        } else {
//                            if (sub.getПрдСведРег().getСведУмер().getДатаРождКаленд() == null) {
//                                log.info("");
//                            }
//                            String format = sub.getПрдСведРег().getСведУмер().getДатаРождКаленд().toGregorianCalendar().toZonedDateTime().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//                            zagsEntity.setBirthday(format);
//                        }


                        //zagsEntity.setBirthday(util.localFrom(sub.getПрдСведРег().getСведУмер().getДатаРождКаленд()));

                        zagsEntity.setActNumber(sub.getНомерЗапис());

                        String sDeath = "";
                        if (sub.getПрдСведРег().getСведУмер().getДатаСмертКаленд() != null) {
                            sDeath = sub.getПрдСведРег().getСведУмер().getДатаСмертКаленд().toGregorianCalendar().toZonedDateTime().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                            //zagsEntity.setDeathDate(sDeath);
                        } else {
                            if (sub.getПрдСведРег().getСведУмер().getДатаСмертДок() != null) {
                                if (sub.getПрдСведРег().getСведУмер().getДатаСмертДок().getПрДень() != null && sub.getПрдСведРег().getСведУмер().getДатаСмертДок().getПрДень().equals("1")) {
                                    sDeath = "01";
                                } else
                                    sDeath = sub.getПрдСведРег().getСведУмер().getДатаСмертДок().getДень().toString();

                                if (sub.getПрдСведРег().getСведУмер().getДатаСмертДок().getПрМесяц() != null && sub.getПрдСведРег().getСведУмер().getДатаСмертДок().getПрМесяц().equals("1")) {
                                    String mm = "01";
                                } else
                                    sDeath = sDeath + "." + sub.getПрдСведРег().getСведУмер().getДатаСмертДок().getМесяц().toString();

                                sDeath = sDeath + "." + sub.getПрдСведРег().getСведУмер().getДатаСмертДок().getГод().toString();
                            }
                        }
                        zagsEntity.setDeathDate(sDeath);

                        String sAct = sub.getДатаЗапис().toGregorianCalendar().toZonedDateTime().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                        zagsEntity.setActdate(sAct);
                        //zagsEntity.setDeathDate(util.localFrom(sub.getДатаЗапис()));

                        if (sub.getПрдСведРег().getСведУмер().getСНИЛС() != null) {
                            zagsEntity.setSnils(sub.getПрдСведРег().getСведУмер().getСНИЛС().replaceAll("\\s+", ""));
                        }

                        if (sub.getПрдСведРег().getСведУмер().getУдЛичнФЛ() != null) {
                            zagsEntity.setSerNum(sub.getПрдСведРег().getСведУмер().getУдЛичнФЛ().getСерНомДок());
                            /*Разбиение серии и номера через регулярное выражение*/
                            /*Pattern p = Pattern.compile("^([A-ZА-Я]{2})*([A-Z]{1,4}[-]{1}[А-Я]{2})*([0-9]{2}\\s{1}[0-9]{2})*\\s([0-9]{6,7})*$");
                            Matcher m = p.matcher(sub.getПрдСведРег().getСведУмер().getУдЛичнФЛ().getСерНомДок());
//                            Matcher m = p.matcher("VII-РК 528867");

                            if (m.matches())
                            {
                                Boolean flag = true;
                                for (int i = 1; i <= m.groupCount(); i++) {
                                    if (m.group(i) != null) {
                                        if (flag) {
                                            zagsEntity.setSeriesDoc(m.group(i));
                                        } else
                                            zagsEntity.setNumDoc(m.group(i));
                                        flag = false;
                                    }
                                }
                            }*/
//
//                            String серНомДок = "1804 612332";
//                            String[] words = серНомДок.split("[0-9]{4}\\s[0-9]{6}");
//                            for(String word : words){
//                                log.info(word);
//                            }


//                            zagsEntity.setSeriesDoc(sub.getПрдСведРег().getСведУмер().getУдЛичнФЛ().getСерНомДок());
//                            zagsEntity.setNumDoc(sub.getПрдСведРег().getСведУмер().getУдЛичнФЛ().getСерНомДок());
                        }

                        zagsEntity.setMessageId(entity.getIdMessage());

                        reestrService.saveZags(zagsEntity);

                        //помечаем взаимодействие закрытым
                        interactionEntity.setState(InteractionState.CLOSED);
                        this.businessService.saveInteraction(interactionEntity);


                    }

                }
                //entity.setState(MessageState.READ);
                //this.businessService.saveMessage(entity);
            } catch (Exception ex) {
                log.error(ex.getMessage(), ex);
                ex.printStackTrace();
            }
        }
    }

    @Override
    public String getIdInquery() {
        return InquiryVersionEnum.getInquiryId(InquiryVersionEnum.DEATH_EGISSO).toString();
    }
}
