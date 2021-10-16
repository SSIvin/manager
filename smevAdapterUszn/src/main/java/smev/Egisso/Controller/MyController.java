//package ru.uszn.scheduller.Controller;
//
//import org.quartz.*;
//

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class MyController {
//
////    @Autowired
////    SmevAdapterService smevService;
//
//    private static final Logger log = LogManager.getLogger(MyController.class);
//
//    @GetMapping("/parsingXml")
//    public void parsingXml() {
//        /*
//        * Чтение из базы SMEV строки xml и преобразование ее в объект
//        * */
//        log.info("Rest Ok");
//
//       // smevService.getInstanceService();
//
//
//    }
//
//
//    @PostMapping("/test")
//    public String Test() throws SchedulerException {
//
////        JobDataMap jobDataMap = new JobDataMap();
////        JobDetail jobDetail = JobBuilder.newJob(EmailJob.class)
////                .withIdentity(UUID.randomUUID().toString(), "email-jobs")
////                .withDescription("Send Email Job")
////                .usingJobData(jobDataMap)
////                .storeDurably()
////                .build();
////        Trigger trigger = TriggerBuilder.newTrigger()
////                .forJob(jobDetail)
////                .withIdentity(jobDetail.getKey().getName(), "email-triggers")
////                .withDescription("Send Email Trigger")
////                .startAt(Date.from(startAt.toInstant()))
////                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withMisfireHandlingInstructionFireNow())
////                .build();
////
////
////        scheduler.scheduleJob(jobDetail, trigger);
//
//        JobDetail job = JobBuilder.newJob(HelloJob.class)
//                .withIdentity("dummyJobName", "group1").build();
//
//        Trigger trigger = TriggerBuilder
//                .newTrigger()
//                .withIdentity("dummyTriggerName", "group1")
//                .startNow()
////                .withSchedule(
////                        SimpleScheduleBuilder.simpleSchedule()
////                                .withIntervalInSeconds(5).repeatForever()
////                )
//                .build();
//
//        // schedule it
////        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
////        scheduler.start();
////        scheduler.scheduleJob(job, trigger);
//        return "ответ из контроллера";
//    }
//
//
//}
