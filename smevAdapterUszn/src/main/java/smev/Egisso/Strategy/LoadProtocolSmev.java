package smev.Egisso.Strategy;


import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xml.sax.InputSource;
import smev.Egisso.Elements.ElementsProtocol.Response;
import smev.Egisso.Entity.GlobalPackage;
import smev.Egisso.Entity.PackageHistory;
import smev.Egisso.Entity.PackageMessage;
import smev.Egisso.Enum.ApplayProtocol;
import smev.Egisso.Enum.StatusPackage;
import smev.Egisso.Enum.StatusPackageSmev;
import smev.Egisso.Service.Impl.EgissoBusinessServices;
import smev.Egisso.Service.Impl.ProtocolService;
import smev.Egisso.dto.PacInner;
import smev.Egisso.exceptions.ProtocolServiceException;
import smev.Egisso.util.MyUtils;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.utils.util;

import java.io.StringReader;
import java.util.List;
import java.util.stream.Collectors;

@Component("loadsmev")
@Log4j2
public class LoadProtocolSmev implements LoadProtocolStrategy {

    @Autowired
    private EgissoBusinessServices egissoBusinessServices;

    @Autowired
    ProtocolService protocolService;

    @Override
    public void Load() {
        boolean isOk = false;

        GlobalPackage globalPackageInProcess = egissoBusinessServices.getGlobalPackageByStatusAndApplayProtocol(StatusPackage.CREATED, ApplayProtocol.NO);
        if (globalPackageInProcess == null) {
            return;
            //log.warn("В базе нет глобального пакета для обработки.");
            //throw new ProtocolServiceException("В базе нет глобального пакета для обработки");
        }
        List<PackageHistory> listPackageHistory = egissoBusinessServices.getListPackageHistoryByGlobalPac(globalPackageInProcess)
                .stream()
                .filter(packageHistory -> StatusPackageSmev.PROTOCOL_RECEIVED.equals(packageHistory.getStatusSmev()))
                .filter(packageHistory -> !StatusPackage.LOAD_PROTOCOL.equals(packageHistory.getStatusEgisso()))
                .collect(Collectors.toList());

        if (listPackageHistory.size() > 0) {
            for (PackageHistory packageHistory : listPackageHistory) {
                List<PackageMessage> listpackageMessages = egissoBusinessServices.listPackageMessageByPackageId(packageHistory.getPackageId());
                for (PackageMessage packageMessage : listpackageMessages) {
                    BusinessMessageEntity messageEntity = egissoBusinessServices.getMessagesInteractionByMessageIdOrderDesc(packageMessage.getMessageId());
                    if (messageEntity != null) {
                        String contentSmev = egissoBusinessServices.getContentSmev(messageEntity.getContentId());
                        if (contentSmev != null) {
                            PacInner pacInner = PacInner.builder().build();
                            pacInner.setGuidFile(util.UUIDtoString(packageHistory.getPackageId()));
                            InputSource is = new InputSource(new StringReader(contentSmev));
                            Response responseProtocol = MyUtils.getResponseProtocol(is);
                            if (responseProtocol.getProtocol().getPackageResult() != null) {
                                if (!responseProtocol.getProtocol().getPackageResult().getPackageID().equalsIgnoreCase(pacInner.getGuidFile())) {
                                    throw new ProtocolServiceException("Гуиды сообщений не совпадают!");
                                }
                            }
                            pacInner.setProtocol(responseProtocol.getProtocol());
                            isOk = this.protocolService.ttt(pacInner);
                        }
                    }
                }
            }
        } else {
            PacInner pacInner = PacInner.builder().build();
            pacInner.setIdGlobalPackage(globalPackageInProcess.getIdGlobalPackage().toString());
            isOk = this.protocolService.ttt(pacInner);
        }

        if (isOk) {
            log.info("Обработка протоколов от СМЭВА завершена.");
        }
    }
}
