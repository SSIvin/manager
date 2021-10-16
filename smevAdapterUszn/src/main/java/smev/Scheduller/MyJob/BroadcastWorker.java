package smev.Scheduller.MyJob;

import lombok.extern.log4j.Log4j2;
import org.quartz.JobExecutionException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smev.Egisso.exceptions.ProtocolServiceException;
import smev.FRI.Service.BroadcastService;

@Component("broadcastWorker")
@Log4j2
public class BroadcastWorker implements Worker {


    @Autowired
    BroadcastService broadcastService;


    @Override
    public void work(Integer idExecuteJob) throws JobExecutionException, ProtocolServiceException {
        try {
            broadcastService.getInquiryBroadcastList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ProtocolServiceException(e.getMessage(), e.getCause());
        }
        // log.info(messageService.getClass());
//        log.info("ок");
    }
}
