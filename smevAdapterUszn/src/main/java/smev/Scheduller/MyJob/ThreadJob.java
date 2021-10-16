package smev.Scheduller.MyJob;

import lombok.extern.log4j.Log4j2;
import org.quartz.*;


import org.springframework.beans.factory.annotation.Autowired;
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
@Log4j2
public class ThreadJob extends QuartzJobBean implements InterruptableJob {


//    private Worker worker;


    @Autowired
    ThreadWorker threadWorker;


//    @Autowired
//    private ApplicationContext ctx;


//	private ApplicationContext ctx;
//	public void setApplicationContext(ApplicationContext applicationContext) {
//		this.ctx = applicationContext;
//	}

    @Override
    protected void executeInternal(JobExecutionContext context)
            throws JobExecutionException {
//        worker = (Worker) ctx.getBean("testWorker");
        try {
            int ID = MyUtils.getIdFromContext(context);
            threadWorker.work(ID);
//            worker.work(ID);
        } catch (Throwable e) {
            throw new JobExecutionException(ErrorMessages.ERROR_SCHEDULLER.getErrorMessage() + context.getJobDetail().getKey().getName(), e);
        }
    }


    @Override
    public void interrupt() throws UnableToInterruptJobException {

    }
}
