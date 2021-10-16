package smev.Send;



import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import smev.Service.SmevService;
import smev.Wrapper.ObjectMessage;

import javax.xml.transform.TransformerException;

@Component
@Log4j2
public class BaseSend implements SendingRequest {


    final
    SmevService smevService;

    @Autowired
    public BaseSend(SmevService smevService) {
        this.smevService = smevService;
    }

    @Override
    public void Send(Element bussinesData, ObjectMessage req) throws TransformerException {
       // smevService.saveMessage(bussinesData, req);
        log.info("Запрос записан в базу ");
    }
}
