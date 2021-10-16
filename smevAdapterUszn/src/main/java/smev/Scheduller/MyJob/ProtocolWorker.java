package smev.Scheduller.MyJob;

import lombok.extern.log4j.Log4j2;
import org.quartz.JobExecutionException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smev.Egisso.Service.Impl.ProtocolService;
import smev.Egisso.exceptions.ProtocolServiceException;

@Component("protocolWorker")
@Log4j2
public class ProtocolWorker implements Worker {


    @Autowired
    ProtocolService protocolService;

//    @Autowired
//    BusinessService businessService;

    @Override
    public void work(Integer idExecuteJob) throws JobExecutionException, ProtocolServiceException {
        protocolService.getProtocol(idExecuteJob);
    }
}
