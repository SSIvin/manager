package smev.FRI.Strategy;


import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import smev.ElementServices.Fri.ВыпискаФРИ;
import smev.Entity.BusinessAttachmentEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Enum.*;
import smev.FRI.Enum.ZapisType;
import smev.FRI.Service.BroadcastStrategy;
import smev.FRI.Service.FriService;
import smev.Marshaller.Marshaller;
import smev.Service.BusinessService;
import smev.Service.MessageService;

import java.util.List;


@Component
@Log4j2
//@Component("broadcastInitiativeDistribution")
public class BroadcastInitiativeDistribution implements BroadcastStrategy {


    @Autowired
    private MessageService messageService;

    @Autowired
    private BusinessService businessService;

    @Autowired
    private FriService friService;


    @Override
    public void reading() {
        List<BusinessMessageEntity> list = messageService.getMessagesByParam(InquiryVersionEnum.getInquiryId(InquiryVersionEnum.INITIATIVE_distribution)
                , MessageDirection.INCOMING, MessageMode.MESSAGE, MessageType.REQUEST, MessageState.RECEIVED, InteractionState.IN_WORK);

        if (list.size() > 0) {
            log.info("Входящая рассылка по инициативной раасылке  - Выписка по инвалиду - {} сообщений", list.size());
        }

        for (BusinessMessageEntity entity : list) {
            log.info("Обработка записи {} ", list.indexOf(entity));
//            BusinessInteractionEntity interactionEntity = businessService.getInteractionById(entity.getInteractionId());

            List<BusinessAttachmentEntity> attachmentEntitie = this.businessService.getAttachmentsByMessageId(entity.getIdMessage());
            if (attachmentEntitie.size() > 0) {

                Document document = businessService.getDocumentFromByte(attachmentEntitie.get(0).getContent());
                ВыпискаФРИ выпискаФРИ = (ВыпискаФРИ) Marshaller.unmarshal(document.getDocumentElement());
                if (выпискаФРИ != null) {
                    /*если вставки не было т.е такая выписка уже есть в базе, то идем дальше*/
                    if (friService.insert(выпискаФРИ, entity.getIdMessage()) == -1) {
                        continue;
                    }
                }

                ВыпискаФРИ.ВсеДокументы.Документ документ = getDocumentByZapisType(выпискаФРИ, ZapisType.MSE_IPRA_GENERAL);
                if (документ != null) {
                    friService.insert(документ,выпискаФРИ.getИдентификатор());
                    for (ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись запись : документ.getВсеСведения().getЗапись()) {
                        friService.insert(запись, документ.getРеквизитыДокумента().getID());
                        for (ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись.ВсеАтрибуты.Атрибут атрибут : запись.getВсеАтрибуты().getАтрибут()) {
                            friService.insert(атрибут,запись.getИдентификаторОбъекта(),документ.getРеквизитыДокумента().getID());
                        }
                    }
                }



//                String наименование = orderingInvalid.getВсеДокументы().getДокумент().stream().findFirst().get().getРеквизитыДокумента().getИсточник().getНаименование();
//                log.info(наименование);

                //помечаем взаимодействие закрытым
                //interactionEntity.setState(InteractionState.CLOSED);
                //this.businessService.saveInteraction(interactionEntity);






            }
//            try {
//                ZipFile zipFile = new ZipFile();
//                zipFile.
//                if (zipFile.isEncrypted()) {
//                    zipFile.setPassword(password);
//                }
//                zipFile.extractAll();
//            } catch (ZipException e) {
//                e.printStackTrace();
//            }


            //entity.setState(MessageState.READ);
            //this.businessService.saveMessage(entity);
        }
        //log.info("ok");tКод()
    }

    public ВыпискаФРИ.ВсеДокументы.Документ getDocumentByZapisType(ВыпискаФРИ friRequest, ZapisType zapisType) {
        for (ВыпискаФРИ.ВсеДокументы.Документ документ : friRequest.getВсеДокументы().getДокумент()) {
            for (ВыпискаФРИ.ВсеДокументы.Документ.ВсеСведения.Запись запись : документ.getВсеСведения().getЗапись()) {
                if (zapisType.equals(ZapisType.getZapisTypeByName(запись.getКатегория().getКод()))) {
                    return документ;
                }
            }
        }
        return null;
    }

    @Override
    public String getIdInquery() {
        return InquiryVersionEnum.getInquiryId(InquiryVersionEnum.INITIATIVE_distribution).toString();
    }
}
