package smev.Scheduller.MyJob;

import lombok.extern.log4j.Log4j2;
import org.quartz.JobExecutionException;


import org.springframework.stereotype.Component;
import smev.Egisso.exceptions.ProtocolServiceException;

@Component("otherJobWorker")
@Log4j2
public class OtherJobWorker implements Worker {





    @Override
    public void work(Integer idExecuteJob) throws JobExecutionException, ProtocolServiceException {
        try {
            log.info("Запущен otherJob");


        } catch (Exception e) {
            e.printStackTrace();
            throw new ProtocolServiceException(e.getMessage(), e.getCause());
        }
    }
}
