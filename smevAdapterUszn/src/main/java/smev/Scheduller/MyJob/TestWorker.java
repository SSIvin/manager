package smev.Scheduller.MyJob;

import lombok.extern.log4j.Log4j2;
import org.quartz.JobExecutionException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smev.Service.BusinessService;
import smev.Egisso.exceptions.ProtocolServiceException;
import smev.Service.MessageService;

import java.util.UUID;

@Component("testWorker")
@Log4j2
public class TestWorker implements Worker {


    @Autowired
    BusinessService businessService;

    @Autowired
    MessageService messageService;


    @Override
    public void work(Integer idExecuteJob) throws JobExecutionException, ProtocolServiceException {
        try {
            businessService.createMessagesForSendToEgisso();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ProtocolServiceException(e.getMessage(), e.getCause());
        }
        // log.info(messageService.getClass());
//        log.info("ок");
    }
}
