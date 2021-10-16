package smev.Scheduller.MyJob;



import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;

import java.util.Date;

//@Configuration
//@EnableScheduling
@Log4j2
public class Perses implements SchedulingConfigurer {



    @Value("${scheduler.cron1}")
    private String cron1;
    @Value("${scheduler.cron2}")
    private String cron2;

//    private String cronConfig() {
//        String cronTabExpression = "*/5 * * * * *";
//        if (defaultConfigDto != null && !defaultConfigDto.getFieldValue().isEmpty()) {
//            cronTabExpression = "0 0 4 * * ?";
//        }
//        return cronTabExpression;
//    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.addTriggerTask(new Runnable() {


            @Override
            public void run() {
                //запуск
                log.info("Привет");
            }
        }, new Trigger() {
            @Override
            public Date nextExecutionTime(TriggerContext triggerContext) {
                String cron = "";
                if (cron1.equals("1")) {
                    cron = "*/5 * * * * *";
                } else
                {
                    cron = "*/2 * * * * *";
                }
                CronTrigger trigger = new CronTrigger(cron);
                Date nextExec = trigger.nextExecutionTime(triggerContext);
                return nextExec;
            }
        });
    }
}
