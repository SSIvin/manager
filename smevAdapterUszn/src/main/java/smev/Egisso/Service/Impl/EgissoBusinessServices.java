package smev.Egisso.Service.Impl;



import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.Egisso.Dao.EgissoDao;
import smev.Egisso.Dao.NaznDao;
import smev.Egisso.Entity.GlobalPackage;
import smev.Egisso.Entity.PackageHistory;
import smev.Egisso.Entity.PackageMessage;
import smev.Egisso.Enum.ApplayProtocol;
import smev.Egisso.Enum.StatusPackage;
import smev.Egisso.Enum.StatusPackageSmev;
import smev.Egisso.Enum.TypePackage;
import smev.Egisso.dto.PacInner;
import smev.Egisso.exceptions.EgissoServiceException;
import smev.Egisso.exceptions.ErrorMessages;
import smev.Egisso.exceptions.KmszServiceException;
import smev.Egisso.exceptions.NaznServiceException;
import smev.Egisso.util.MyUtils;
import smev.ElementServices.Egisso.ElementsKmsz.Request;
import smev.ElementServices.Egisso.RequestAttachment;
import smev.Entity.BusinessAttachmentEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Enum.MessageDirection;
import smev.Enum.MessageMode;
import smev.Enum.MessageState;
import smev.Enum.MessageType;
import smev.Service.BusinessService;
import smev.Wrapper.ObjectMessage;
import smev.Wrapper.RequestEgissoKmszChangeRequest;
import smev.Wrapper.RequestEgissoRequest;

import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Log4j2
@Transactional(value = "egissojdbcNamedTransactionManager", propagation = Propagation.SUPPORTS)
public class EgissoBusinessServices {


    @Autowired
    private NaznDao naznDao;

    @Autowired
    private EgissoDao egissoDao;

    @Autowired
    private BusinessService businessService;

//    @Autowired
//    private Jaxb2Marshaller jaxb2Marshaller;

    //TODO в этот сервис будем переносить общую логику

    public void update(PackageHistory packageHistory) {
        try {
            egissoDao.update(packageHistory);
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_SQL_UPDATE_FILE.getErrorMessage(), e);
        }
    }

    public void setPackageHistorySENDING(PackageHistory packageHistory, BusinessMessageEntity message) {
        packageHistory.setStatusSmev(StatusPackageSmev.SENDING);
        this.update(packageHistory);
        this.savePackageMessage(packageHistory.getPackageId(), message.getIdMessage());
    }

    public RequestEgissoRequest getObjectMessage() {
        RequestAttachment requestEgisso = new RequestAttachment();
        requestEgisso.setAttachment(true);
        RequestEgissoRequest build = new RequestEgissoRequest();
        build.setData(requestEgisso);
        return build;
    }

    public ObjectMessage getObjectMessage2(PackageHistory packageHistory) throws FileNotFoundException {
        ObjectMessage requestObject = null;
        switch (packageHistory.getTypePackage()) {
            case PACKAGE_KMSZ:
//                Request data2 = (Request)jaxb2Marshaller.unmarshal(new StreamSource(new FileInputStream("f:\\Egisso\\test\\for_Load\\0059_10.05.I_181.xml")));
                Request data = MyUtils.getRequestObjectFromFile(packageHistory.getFileName());
                requestObject = RequestEgissoKmszChangeRequest.builder()
                        .data(data)
                        .build();
                requestObject.setData(data);
                break;

            case PACKAGE_FACT:
                requestObject = RequestEgissoRequest.builder()
                        .build();
                RequestAttachment r = new RequestAttachment();
                r.setAttachment(true);
                requestObject.setData(r);
                break;
        }
        return requestObject;
    }

    public List<PackageMessage> listPackageMessageByPackageId(UUID packageID) {
        return egissoDao.getPackageMessageByPackageId(packageID);
    }

    public void savePackageMessage(UUID packageID, UUID messageID) {
        egissoDao.savePackageMessage(packageID, messageID);
    }


    @Transactional(value = "egissojdbcNamedTransactionManager", propagation = Propagation.SUPPORTS)
    public GlobalPackage getGlobalPackageByStatusAndApplayProtocol(StatusPackage statusPackage, ApplayProtocol applayProtocol) {
        return egissoDao.getGlobalPackageByStatusAndApplayProtocol(statusPackage, applayProtocol);
    }

    public PackageHistory getById(UUID packageID) {
        return egissoDao.getById(packageID);
    }

    private StatusPackageSmev setSendPackageStatus(BusinessMessageEntity messageEntity) {
        if (MessageDirection.OUTGOING.equals(messageEntity.getDirection())) {
            if (MessageState.UNSENT.equals(messageEntity.getState())) {
                return StatusPackageSmev.UNSENT;
            }
            if (MessageState.SENT.equals(messageEntity.getState())) {
                return StatusPackageSmev.SENT;
            }
            if (MessageState.SENDING.equals(messageEntity.getState())) {
                return StatusPackageSmev.SENDING;
            }
        }

        if (MessageDirection.INCOMING.equals(messageEntity.getDirection())) {
            switch (messageEntity.getMode()) {
                case MESSAGE:
                    if (MessageState.RECEIVED.equals(messageEntity.getState())) {
                        return StatusPackageSmev.PROTOCOL_RECEIVED;
                    }

                case STATUS:
                    if (MessageState.RECEIVED.equals(messageEntity.getState())) {
                        return StatusPackageSmev.DELIVERED;
                    }

                case REJECT:
                    if (MessageState.RECEIVED.equals(messageEntity.getState())) {
                        return StatusPackageSmev.REJECT;
                    }
                case ERROR:
                    if (MessageState.UNSENT.equals(messageEntity.getState())) {
                        return StatusPackageSmev.UNSENT;
                    }
            }
        }
        throw new EgissoServiceException("Не возможно сопоставить статусы сообщения");
    }

    public void chekingForUpdateMessage(GlobalPackage idGlobalPackage) {
        //проверим пришло ли что то на пакеты отправленные в адаптер
        List<PackageHistory> listPackageHistoryForUpdate = this.getListPackageHistoryByGlobalPac(idGlobalPackage)
                .stream()
                .filter(packageHistory -> !StatusPackageSmev.PROTOCOL_RECEIVED.equals(packageHistory.getStatusSmev()))
                .filter(packageHistory -> StatusPackage.CREATED.equals(packageHistory.getStatusEgisso()))
/*пока берем для смева только факты*/
                .filter(packageHistory -> TypePackage.PACKAGE_FACT.equals(packageHistory.getTypePackage()))
                .collect(Collectors.toList());
        for (PackageHistory packageHistory : listPackageHistoryForUpdate) {
            List<PackageMessage> packageMessageList = this.listPackageMessageByPackageId(packageHistory.getPackageId());
            for (PackageMessage packageMessage : packageMessageList) {
//                    log.info(packageMessage.getMessageId());
                BusinessMessageEntity messageEntity = businessService.getMessagesInteractionByMessageIdOrderDesc(packageMessage.getMessageId()).stream().findFirst().get();
                StatusPackageSmev statusPackageSmev = setSendPackageStatus(messageEntity);
                if (!packageHistory.getStatusSmev().equals(statusPackageSmev)) {
                    packageHistory.setStatusSmev(statusPackageSmev);
                    packageHistory.setDescription(messageEntity.getDescription());
                    packageHistory.setCode(messageEntity.getCode());
                    this.update(packageHistory);
                    //удалаяем вложение из каталога если ОТПРАВЛЕН
                    if (StatusPackageSmev.PROTOCOL_RECEIVED.equals(statusPackageSmev)) {
                        List<BusinessAttachmentEntity> listAttachments = businessService.getAttachmentsByMessageId(packageMessage.getMessageId());
                        if (listAttachments != null && !listAttachments.isEmpty()) {
                            Path path = Paths.get(listAttachments.get(0).getContentPath(), listAttachments.get(0).getFileName());
                            if (Files.exists(path)) {
                                path.toFile().delete();
                                log.info("файл {} удален, так как он отправлен", path.toString());
                            }
                        }
                    }
                }
            }
        }
    }

    public void updateStatusPackage(PacInner pac, BigInteger recordNum, BigInteger recordNumSuccess, StatusPackage statusPackage) {
        try {
            egissoDao.updateStatusPackage(pac, recordNum, recordNumSuccess, statusPackage);
        } catch (DataAccessException e) {
            throw new KmszServiceException(ErrorMessages.ERROR_SQL_CHEKING_KMSZ_SEND.getErrorMessage(), e);
        }
    }

    public void setApplayProtocolGlobalPackage(PacInner pac, ApplayProtocol applayProtocol) {
        try {
            egissoDao.setApplayProtocolGlobalPackage(pac, applayProtocol);
        } catch (DataAccessException e) {
            throw new KmszServiceException(ErrorMessages.ERROR_SQL_SET_APPALY_PROTOCOL.getErrorMessage(), e);
        }
    }

    public void writeProtocolBatch(PacInner pac) {
        try {
            egissoDao.writeProtocolBatch(pac);
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_SQL_INSERT_PROTOCOL_BATCH.getErrorMessage(), e);
        }
    }

    public BusinessMessageEntity getMessagesInteractionByMessageIdOrderDesc(UUID idMessage) {
        return businessService.getMessagesInteractionByMessageIdOrderDesc
                (idMessage).stream()
                .filter(businessMessageEntity -> MessageDirection.INCOMING.equals(businessMessageEntity.getDirection()))
                .filter(businessMessageEntity -> MessageMode.MESSAGE.equals(businessMessageEntity.getMode()))
                .filter(businessMessageEntity -> MessageType.RESPONSE.equals(businessMessageEntity.getType()))
                .filter(businessMessageEntity -> MessageState.RECEIVED.equals(businessMessageEntity.getState()))
                .findFirst().get();


    }

    public String getContentSmev(UUID contentId) {
        return businessService.getContent(contentId);
    }

    @Transactional(value = "egissojdbcNamedTransactionManager", propagation = Propagation.SUPPORTS)
    public List<PackageHistory> getListPackageHistoryByGlobalPac(GlobalPackage globalPackage) {
        return egissoDao.getListPackageHistoryByGlobalPac(globalPackage);
    }
}
