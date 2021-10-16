package smev.Scheduller.MyJob;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smev.Egisso.exceptions.GisJkhJobException;
import smev.Egisso.exceptions.ProtocolServiceException;
import smev.GisJkh.Service.GisJkhServiceImpl;
import smev.Service.BusinessService;
import smev.Service.MessageService;

@Component("gisJkhWorker")
@ApiOperation("Отправить данные в ГИС ЖКХ")
public class GisJkhWorker implements Worker {

    private static final Logger log = LoggerFactory.getLogger("smev.GisJkh");


    @Autowired
    private GisJkhServiceImpl gisJkhService;


    @Override
    public void work(Integer idExecuteJob) throws JobExecutionException {
            log.info("Starting Job - отправка данных в ГИС ЖКХ");
//            временно отключил
            //gisJkhService.createRequestGisJkh();

        // log.info(messageService.getClass());
//        log.info("ок");
    }
}
