package smev.Scheduller.MyJob;

import lombok.extern.log4j.Log4j2;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;
import smev.Egisso.exceptions.ErrorMessages;
import smev.Egisso.util.MyUtils;

@DisallowConcurrentExecution
@PersistJobDataAfterExecution
/*
@DisallowConcurrentExecution предотвращает выполнение
нескольких экземпляров задания с тем же ключом (JobKey)
одновременно
 */

public class GisJkhJob extends QuartzJobBean implements InterruptableJob {

    private static final Logger log = LoggerFactory.getLogger("smev.GisJkh");


    private Worker worker;



    @Autowired
    private ApplicationContext ctx;


//	private ApplicationContext ctx;
//	public void setApplicationContext(ApplicationContext applicationContext) {
//		this.ctx = applicationContext;
//	}

    @Override
    protected void executeInternal(JobExecutionContext context)
            throws JobExecutionException {
        worker = (Worker) ctx.getBean("gisJkhWorker");
        try {
            int ID = MyUtils.getIdFromContext(context);
            worker.work(ID);
        } catch (Throwable e) {
            throw new JobExecutionException(ErrorMessages.ERROR_SCHEDULLER.getErrorMessage() + context.getJobDetail().getKey().getName(), e);
        }
    }


    @Override
    public void interrupt() throws UnableToInterruptJobException {

    }
}
