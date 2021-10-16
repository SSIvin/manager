package smev.Egisso.Strategy;


import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import smev.Egisso.Enum.ApplayProtocol;
import smev.Egisso.Service.Impl.ProtocolService;
import smev.Egisso.Service.KmszService;
import smev.Egisso.dto.PacInner;

@Component
@Log4j2
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProtocolKmsz implements ProcessingProtocolStrategy {

    @Autowired
    private KmszService kmszService;

    @Autowired
    private ProtocolService protocolService;

    public ProtocolKmsz() {
    }


    @Override
    public void applayProtocol(PacInner pacInner) {
        log.info("Применение протоколов классификатора...");
        kmszService.applay_protocol_klacc(pacInner.getGuidFile());
        protocolService.setApplayProtocolGlobalPackage(pacInner, ApplayProtocol.YES);

    }

    @Override
    public void processProtocol(PacInner pac) {

        protocolService.writeProtocolInBase(pac);

        protocolService.updateStatusPackageInfo(pac);

        applayProtocol(pac);

    }
}
