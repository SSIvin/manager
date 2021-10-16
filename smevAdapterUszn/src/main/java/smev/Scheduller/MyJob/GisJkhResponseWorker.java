package smev.Scheduller.MyJob;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smev.Egisso.exceptions.GisJkhJobException;
import smev.GisJkh.Service.GisJkhServiceImpl;

@Component("gisJkhResponseWorker")
@ApiOperation("Получить ответы у ГИС ЖКХ")
public class GisJkhResponseWorker implements Worker {

    private static final Logger log = LoggerFactory.getLogger("smev.GisJkh");


    @Autowired
    private GisJkhServiceImpl gisJkhService;


    @Override
    public void work(Integer idExecuteJob) throws JobExecutionException {
            log.info("Starting Job - получение ответов у ГИС ЖКХ");
            gisJkhService.createRequestRequest();

        // log.info(messageService.getClass());
//        log.info("ок");
    }
}
