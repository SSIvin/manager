package smev.Scheduller.MyJob;

import lombok.extern.log4j.Log4j2;
import org.quartz.JobExecutionException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.Egisso.exceptions.ProtocolServiceException;
import smev.Service.BusinessService;
import smev.Service.Impl.ThreadService;
import smev.Service.MessageService;

@Component
@Profile(value="dev")
@Log4j2
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ThreadWorker implements Worker {


    @Autowired
    ThreadService threadService;


    @Override
    public void work(Integer idExecuteJob) throws JobExecutionException, ProtocolServiceException {
        try {
            threadService.testThread();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ProtocolServiceException(e.getMessage(), e.getCause());
        }
        // log.info(messageService.getClass());
//        log.info("ок");
    }
}
