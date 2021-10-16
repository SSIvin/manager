package smev.Scheduller.service;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import smev.Scheduller.util.SpringUtil;
import smev.Egisso.Service.Impl.MyJobServiceImpl;

@Component
@Configurable
public class SchedulerGlobalJobListener implements JobListener {

//    private String name = this.getClass().getName();
    private String name = "globalJob";

    public void setGlobalListenerName(String name) {
        this.name = name;
    }

//    @Autowired
//    private MyJobServiceImpl jobService;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void jobToBeExecuted(JobExecutionContext context) {
        //log.info("JobsListener.jobToBeExecuted()");

//        String ID_EXEC;
//        ID_EXEC = UUID.randomUUID().toString();
        if (context.get("ID") == null) {
            MyJobServiceImpl myJobService = jobStatusService();

            int id = myJobService.writeStart(
                    context.getJobDetail().getKey().getName(),
                    0
            );
            context.put("ID", id);
        }

    }

    @Override
    public void jobExecutionVetoed(JobExecutionContext context) {
        //log.info("JobsListener.jobExecutionVetoed()");
    }


    @Override
    public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
        //super.jobWasExecuted(context, jobException);
        //log.info("JobsListener.jobWasExecuted()");
//		Object obj = context.getResult();
//		log.info(jobException.getMessage());
//		log.info(obj.toString());

        //DataResultJob rj = (DataResultJob) context.getResult();

        if (context.get("ID") != null) {
            int ID = (Integer) context.get("ID");
            MyJobServiceImpl myJobService = jobStatusService();
            myJobService.updateJob(ID, jobException);
        }
    }

    public MyJobServiceImpl jobStatusService() {
        return SpringUtil.ctx.getBean(MyJobServiceImpl.class);
    }


}
