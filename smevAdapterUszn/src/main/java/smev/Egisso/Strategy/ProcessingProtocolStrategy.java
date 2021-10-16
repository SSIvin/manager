package smev.Egisso.Strategy;

import smev.Egisso.dto.PacInner;

public interface ProcessingProtocolStrategy {

    void processProtocol(PacInner pac);

    void applayProtocol(PacInner pacInner);

//    void checkSend(PacInner pac, BigInteger recordNum, BigInteger recordNumSuccess);

}
