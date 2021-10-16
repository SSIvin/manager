package smev.Egisso.dto;

import lombok.Builder;
import lombok.Data;
import smev.Egisso.Elements.ElementsProtocol.Protocol;
import smev.Egisso.Enum.TypePackage;
import smev.Egisso.Elements.ElementsProtocol.Response;
import smev.Egisso.Strategy.LoadProtocolStrategy;
import smev.Egisso.Strategy.ProcessingProtocolStrategy;

import java.io.IOException;

@Data
@Builder
public class PacInner {

    private String IdGlobalPackage;
    private String guidFile;
    private TypePackage typePackage;
    private Protocol protocol;
    public ProcessingProtocolStrategy strategyProtocol;
    public LoadProtocolStrategy loadProtocolStrategy;

//    public void runProtocol(PacInner pac, Response responseProtocol) {
//        strategyProtocol.processProtocol(pac, responseProtocol);
//    }

//    public void Loading() throws IOException {
//        loadProtocolStrategy.Load(this);
//    }
}
