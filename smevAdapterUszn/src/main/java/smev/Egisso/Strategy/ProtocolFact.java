package smev.Egisso.Strategy;


import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import smev.Egisso.Enum.ApplayProtocol;
import smev.Egisso.Enum.StatusPackage;
import smev.Egisso.Service.Impl.ProtocolService;
import smev.Egisso.Service.NaznService;
import smev.Egisso.dto.PacInner;

@Component
@Log4j2
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProtocolFact implements ProcessingProtocolStrategy {


    @Autowired
    private NaznService naznService;

    @Autowired
    private ProtocolService protocolService;


    public ProtocolFact() {
    }

    @Override
    public void applayProtocol(PacInner pacInner) {
        if (naznService.getPackageByNotLOAD_PROTOCOL(pacInner.getIdGlobalPackage()) != 0) {
            log.info("Обработка протоколов фактов не начнется пока не будут загруженны все протоколы.");
        } else {
            log.info("Применение протоколов фактов....");
            final int kol = naznService.applayProtocolFact(pacInner.getIdGlobalPackage());
            protocolService.setApplayProtocolGlobalPackage(pacInner, ApplayProtocol.YES);
            log.info("Обработка протоколов фактов закончена. Обработанно " + kol + " фактов.");
        }
    }


    @Override
    public void processProtocol(PacInner pac) {
        protocolService.writeProtocolInBase(pac);

        protocolService.updateStatusPackageInfo(pac);
        applayProtocol(pac);
    }
}
