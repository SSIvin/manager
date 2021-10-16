package smev.Scheduller.MyJob;

import lombok.extern.log4j.Log4j2;
import org.quartz.JobExecutionException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smev.Egisso.Service.Impl.KmszServiceImpl;
import smev.Egisso.exceptions.KmszServiceException;

@Component("kmszWorker")
@Log4j2
public class KmszWorker implements Worker {


    @Autowired
    KmszServiceImpl kmszService;

    @Override
    public void work(Integer idExecuteJob) throws JobExecutionException, KmszServiceException {
        kmszService.Create_Kmsz(idExecuteJob);
    }
}
