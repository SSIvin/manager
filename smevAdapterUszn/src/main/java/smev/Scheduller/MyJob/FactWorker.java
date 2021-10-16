package smev.Scheduller.MyJob;

import lombok.extern.log4j.Log4j2;
import org.quartz.JobExecutionException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smev.Egisso.Service.Impl.NaznServiceImpl;
import smev.Egisso.exceptions.NaznServiceException;

@Component("factWorker")
@Log4j2
public class FactWorker implements Worker {


    @Autowired
    NaznServiceImpl naznService;

    @Override
    public void work(Integer idExecuteJob) throws JobExecutionException, NaznServiceException {
        naznService.Create_Nazn(idExecuteJob);
        log.info("Формирование назначений завершенно.");
    }
}
