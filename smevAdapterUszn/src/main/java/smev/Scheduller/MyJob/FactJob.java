package smev.Scheduller.MyJob;

import lombok.extern.log4j.Log4j2;
import org.quartz.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;
import smev.Egisso.util.MyUtils;
import smev.Egisso.exceptions.ErrorMessages;

@DisallowConcurrentExecution
@PersistJobDataAfterExecution
/*
@DisallowConcurrentExecution предотвращает выполнение
Защита от параллельного выполнения задачи (2 атрибута на джобе)
нескольких экземпляров задания с тем же ключом (JobKey)
одновременно
 */
@Log4j2
public class FactJob extends QuartzJobBean implements InterruptableJob {


    private Worker worker;

        @Autowired
        private ApplicationContext ctx;

    @Override
    protected void executeInternal(JobExecutionContext context)
            throws JobExecutionException {
        worker = (Worker) ctx.getBean("factWorker");
        try {
            int ID = MyUtils.getIdFromContext(context);
            worker.work(ID);
        } catch (Throwable e) {
            log.error("",e);
            throw new JobExecutionException(ErrorMessages.ERROR_SCHEDULLER.getErrorMessage() + context.getJobDetail().getKey().getName(), e);
        }
    }



    @Override
    public void interrupt() throws UnableToInterruptJobException {

    }
}
