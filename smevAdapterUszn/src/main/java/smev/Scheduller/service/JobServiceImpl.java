package smev.Scheduller.service;

import lombok.extern.log4j.Log4j2;
import org.quartz.*;
import org.quartz.Trigger.TriggerState;
import org.quartz.impl.matchers.GroupMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Service;
import smev.Egisso.Entity.GlobalPackage;
import smev.Egisso.Service.Impl.MyJobServiceImpl;
import smev.Egisso.dto.DtoGlobalPackage;
import smev.Egisso.dto.DtoHistoryJob;
import smev.Egisso.dto.DtoJobInfoExecute;
import smev.Egisso.dto.HistoryJob;
import smev.Egisso.util.MyUtils;

import java.util.*;


@Service
@Log4j2
public class JobServiceImpl implements JobService {

    @Autowired
    @Lazy
    SchedulerFactoryBean schedulerFactoryBean;

    @Autowired
    private MyJobServiceImpl jobService;

    @Autowired
    private ApplicationContext context;

    /**
     * Schedule a job by jobName at given date.
     */
    @Override
    public boolean scheduleOneTimeJob(String jobName, Class<? extends QuartzJobBean> jobClass, Date date) {
        //log.info("Request received to scheduleJob");

        String jobKey = jobName;
        String groupKey = "SampleGroup";
        String triggerKey = jobName;

        JobDetail jobDetail = JobUtil.createJob(jobClass, true, context, jobKey, groupKey);

        //log.info("creating trigger for key :"+jobKey + " at date :"+date);
        Trigger cronTriggerBean = JobUtil.createSingleTrigger(triggerKey, date, SimpleTrigger.MISFIRE_INSTRUCTION_FIRE_NOW);
        //Trigger cronTriggerBean = JobUtil.createSingleTrigger(triggerKey, date, SimpleTrigger.MISFIRE_INSTRUCTION_RESCHEDULE_NEXT_WITH_REMAINING_COUNT);

        try {
            Scheduler scheduler = schedulerFactoryBean.getScheduler();
            Date dt = scheduler.scheduleJob(jobDetail, cronTriggerBean);
            //log.info("Job with key jobKey :"+jobKey+ " and group :"+groupKey+ " scheduled successfully for date :"+dt);
            return true;
        } catch (SchedulerException e) {
            //log.info("SchedulerException while scheduling job with key :"+jobKey + " message :"+e.getMessage());
            e.printStackTrace();
        }

        return false;
    }

    /**
     * Schedule a job by jobName at given date.
     */
    @Override
    public boolean scheduleCronJob(String jobName, Class<? extends QuartzJobBean> jobClass, Date date, String cronExpression) {
        //log.info("Request received to scheduleJob");

        String jobKey = jobName;
        String groupKey = "SampleGroup";
        String triggerKey = jobName;

        JobDetail jobDetail = JobUtil.createJob(jobClass, true, context, jobKey, groupKey);

        //log.info("creating trigger for key :"+jobKey + " at date :"+date);
        Trigger cronTriggerBean = JobUtil.createCronTrigger(triggerKey, date, cronExpression, SimpleTrigger.MISFIRE_INSTRUCTION_FIRE_NOW);

        try {
            Scheduler scheduler = schedulerFactoryBean.getScheduler();
            Date dt = scheduler.scheduleJob(jobDetail, cronTriggerBean);
            log.info("Job with key jobKey :"+jobKey+ " and group :"+groupKey+ " scheduled successfully for date :"+dt);
            return true;
        } catch (SchedulerException e) {
            //log.info("SchedulerException while scheduling job with key :"+jobKey + " message :"+e.getMessage());
            e.printStackTrace();
        }

        return false;
    }

    /**
     * Update one time scheduled job.
     */
    @Override
    public boolean updateOneTimeJob(String jobName, Date date) {
        //log.info("Request received for updating one time job.");

        String jobKey = jobName;

        //log.info("Parameters received for updating one time job : jobKey :"+jobKey + ", date: "+date);
        try {
            //Trigger newTrigger = JobUtil.createSingleTrigger(jobKey, date, SimpleTrigger.MISFIRE_INSTRUCTION_RESCHEDULE_NEXT_WITH_REMAINING_COUNT);
            Trigger newTrigger = JobUtil.createSingleTrigger(jobKey, date, SimpleTrigger.MISFIRE_INSTRUCTION_FIRE_NOW);

            Date dt = schedulerFactoryBean.getScheduler().rescheduleJob(TriggerKey.triggerKey(jobKey), newTrigger);
            //log.info("Trigger associated with jobKey :"+jobKey+ " rescheduled successfully for date :"+dt);
            return true;
        } catch (Exception e) {
            //log.info("SchedulerException while updating one time job with key :"+jobKey + " message :"+e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Update scheduled cron job.
     */
    @Override
    public boolean updateCronJob(String jobName, Date date, String cronExpression) {
        //log.info("Request received for updating cron job.");

        String jobKey = jobName;

        //log.info("Parameters received for updating cron job : jobKey :"+jobKey + ", date: "+date);
        try {
            //Trigger newTrigger = JobUtil.createSingleTrigger(jobKey, date, SimpleTrigger.MISFIRE_INSTRUCTION_RESCHEDULE_NEXT_WITH_REMAINING_COUNT);
            Trigger newTrigger = JobUtil.createCronTrigger(jobKey, date, cronExpression, SimpleTrigger.MISFIRE_INSTRUCTION_FIRE_NOW);

            Date dt = schedulerFactoryBean.getScheduler().rescheduleJob(TriggerKey.triggerKey(jobKey), newTrigger);
            //log.info("Trigger associated with jobKey :"+jobKey+ " rescheduled successfully for date :"+dt);
            return true;
        } catch (Exception e) {
            //log.info("SchedulerException while updating cron job with key :"+jobKey + " message :"+e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Remove the indicated Trigger from the scheduler.
     * If the related job does not have any other triggers, and the job is not durable, then the job will also be deleted.
     */
    @Override
    public boolean unScheduleJob(String jobName) {
        //log.info("Request received for Unscheduleding job.");

        String jobKey = jobName;

        TriggerKey tkey = new TriggerKey(jobKey);
        //log.info("Parameters received for unscheduling job : tkey :"+jobKey);
        try {
            boolean status = schedulerFactoryBean.getScheduler().unscheduleJob(tkey);
            //log.info("Trigger associated with jobKey :"+jobKey+ " unscheduled with status :"+status);
            return status;
        } catch (SchedulerException e) {
            //log.info("SchedulerException while unscheduling job with key :"+jobKey + " message :"+e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Delete the identified Job from the Scheduler - and any associated Triggers.
     */
    @Override
    public boolean deleteJob(String jobName) {
        //log.info("Request received for deleting job.");

        String jobKey = jobName;
        String groupKey = "SampleGroup";

        JobKey jkey = new JobKey(jobKey, groupKey);
        //log.info("Parameters received for deleting job : jobKey :"+jobKey);

        try {
            boolean status = schedulerFactoryBean.getScheduler().deleteJob(jkey);
            //log.info("Job with jobKey :"+jobKey+ " deleted with status :"+status);
            return status;
        } catch (SchedulerException e) {
            //log.info("SchedulerException while deleting job with key :"+jobKey + " message :"+e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Pause a job
     */
    @Override
    public boolean pauseJob(String jobName) {
        //log.info("Request received for pausing job.");

        String jobKey = jobName;
        String groupKey = "SampleGroup";
        JobKey jkey = new JobKey(jobKey, groupKey);
        //log.info("Parameters received for pausing job : jobKey :"+jobKey+ ", groupKey :"+groupKey);

        try {
            schedulerFactoryBean.getScheduler().pauseJob(jkey);
            //log.info("Job with jobKey :"+jobKey+ " paused succesfully.");
            return true;
        } catch (SchedulerException e) {
            //log.info("SchedulerException while pausing job with key :"+jobName + " message :"+e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Resume paused job
     */
    @Override
    public boolean resumeJob(String jobName) {
        //log.info("Request received for resuming job.");

        String jobKey = jobName;
        String groupKey = "SampleGroup";

        JobKey jKey = new JobKey(jobKey, groupKey);
        //log.info("Parameters received for resuming job : jobKey :"+jobKey);
        try {
            schedulerFactoryBean.getScheduler().resumeJob(jKey);
            //log.info("Job with jobKey :"+jobKey+ " resumed succesfully.");
            return true;
        } catch (SchedulerException e) {
            //log.info("SchedulerException while resuming job with key :"+jobKey+ " message :"+e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Start a job now
     */
    @Override
    public boolean startJobNow(String jobName) throws JobExecutionException {
        //log.info("Request received for starting job now.");

        String jobKey = jobName;
        String groupKey = "SampleGroup";

        JobKey jKey = new JobKey(jobKey, groupKey);
        //log.info("Parameters received for starting job now : jobKey :"+jobKey);
        try {

            schedulerFactoryBean.getScheduler().triggerJob(jKey);
            //Scheduler ff = schedulerFactoryBean.getScheduler();
            //ff.st
            //log.info("Job with jobKey :"+jobKey+ " started now succesfully.");
            //throw new NaznServiceException("Ошибка задания");
            return true;

        } catch (SchedulerException e) {
            //log.info("SchedulerException while starting job now with key :"+jobKey+ " message :"+e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Check if job is already running
     */
    @Override
    public boolean isJobRunning(String jobName) {
        //log.info("Request received to check if job is running");

        String jobKey = jobName;
        String groupKey = "SampleGroup";

        //log.info("Parameters received for checking job is running now : jobKey :"+jobKey);
        try {

            List<JobExecutionContext> currentJobs = schedulerFactoryBean.getScheduler().getCurrentlyExecutingJobs();
            if (currentJobs != null) {
                for (JobExecutionContext jobCtx : currentJobs) {
                    String jobNameDB = jobCtx.getJobDetail().getKey().getName();
                    String groupNameDB = jobCtx.getJobDetail().getKey().getGroup();
                    if (jobKey.equalsIgnoreCase(jobNameDB) && groupKey.equalsIgnoreCase(groupNameDB)) {
                        return true;
                    }
                }
            }
        } catch (SchedulerException e) {
            //log.info("SchedulerException while checking job with key :"+jobKey+ " is running. error message :"+e.getMessage());
            e.printStackTrace();
            return false;
        }
        return false;
    }

    /**
     * Get all jobs
     */
    @Override
    public List<Map<String, Object>> getAllJobs() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        try {
            Scheduler scheduler = schedulerFactoryBean.getScheduler();

            for (String groupName : scheduler.getJobGroupNames()) {
                for (JobKey jobKey : scheduler.getJobKeys(GroupMatcher.jobGroupEquals(groupName))) {

                    String jobName = jobKey.getName();
                    String jobGroup = jobKey.getGroup();
                    JobDetail jobDetail = scheduler.getJobDetail(jobKey);
                    //get job's trigger
                    List<Trigger> triggers = (List<Trigger>) scheduler.getTriggersOfJob(jobKey);
                    Date scheduleTime = null;
                    Date lastFiredTime = null;
                    Date nextFireTime = null;
                    String description = jobDetail.getDescription();
                    if (triggers.size() > 0) {
                        scheduleTime = triggers.get(0).getStartTime();
                        nextFireTime = triggers.get(0).getNextFireTime();
                        lastFiredTime = triggers.get(0).getPreviousFireTime();

                    }

                    Map<String, Object> map = new HashMap<String, Object>();
                    map.put("jobName", jobName);
                    map.put("description", description);
                    map.put("groupName", jobGroup);
                    map.put("scheduleTime", scheduleTime);
                    map.put("lastFiredTime", lastFiredTime);
                    map.put("nextFireTime", nextFireTime);

                    //мое
//					List<JobExecutionContext> currentJobs = schedulerFactoryBean.getScheduler().getCurrentlyExecutingJobs();
//					if(currentJobs!=null){
//						for (JobExecutionContext jobCtx : currentJobs) {
//							String jobNameDB = jobCtx.getJobDetail().getKey().getName();
//							String groupNameDB = jobCtx.getJobDetail().getKey().getGroup();
//							if (jobName.equalsIgnoreCase(jobNameDB) && jobGroup.equalsIgnoreCase(groupNameDB)) {
//
//								JobResult jobResult = (JobResult) jobCtx.getResult();
//							}
//						}
//					}

                    //map.put("jobLastState", getJobInfoExecute(jobName));
                    fillMap(map, jobName);

                    if (isJobRunning(jobName)) {
                        map.put("jobStatus", "RUNNING");
                    } else {
                        String jobState = getJobState(jobName);
                        map.put("jobStatus", jobState);
                    }

					/*					Date currentDate = new Date();
					if (scheduleTime.compareTo(currentDate) > 0) {
						map.put("jobStatus", "scheduled");

					} else if (scheduleTime.compareTo(currentDate) < 0) {
						map.put("jobStatus", "Running");

					} else if (scheduleTime.compareTo(currentDate) == 0) {
						map.put("jobStatus", "Running");
					}*/

                    list.add(map);
                    //log.info("Job details:");
                    //log.info("Job Name:" + jobName + ", Group Name:" + groupName + ", Schedule Time:" + scheduleTime);
                }

            }
        } catch (SchedulerException e) {
            //log.info("SchedulerException while fetching all jobs. error message :"+e.getMessage());
            e.printStackTrace();
        }
        return list;
    }

    private void fillMap(Map<String, Object> map, String jobName) {
        Optional<DtoHistoryJob> historyJob = null;
        historyJob = toDTO(jobService.getLastJob(jobName));
        map.put("historyJob", historyJob);
        map.put("globalPackage", getGlobalPackage(historyJob));
    }

    @Override
    public Optional<HistoryJob> getLastStatus(String jobName) {
        return jobService.getLastJob(jobName);
    }

    public DtoJobInfoExecute getJobInfoExecute(String jobName) {
        Optional<DtoHistoryJob> historyJob = toDTO(jobService.getLastJob(jobName));
        Optional<DtoGlobalPackage> globalPackage = toDTO2(jobService.getGlobalPackageIdJob(historyJob.isPresent() ? historyJob.get().getId() : 0));

        return DtoJobInfoExecute.builder()
                .historyJob(historyJob)
                .globalPackage(globalPackage)
                .build();
    }

    public Optional<DtoHistoryJob> getHistoryJob(String jobName) {
        return toDTO(jobService.getLastJob(jobName));
    }

    public Optional<DtoGlobalPackage> getGlobalPackage(Optional<DtoHistoryJob> historyJob) {
        return toDTO2(jobService.getGlobalPackageIdJob(historyJob.isPresent() ? historyJob.get().getId() : 0));
    }

    private Optional<DtoGlobalPackage> toDTO2(Optional<GlobalPackage> globalPackageIdJob) {
        return MyUtils.getDtoGlobalPackage(globalPackageIdJob);
    }

    private Optional<DtoHistoryJob> toDTO(Optional<HistoryJob> lastJob) {
        return MyUtils.getDtoHistoryJob(lastJob);
    }

    /**
     * Check job exist with given userName
     */
    @Override
    public boolean isJobWithNamePresent(String jobName) {
        try {
            String groupKey = "SampleGroup";
            JobKey jobKey = new JobKey(jobName, groupKey);
            Scheduler scheduler = schedulerFactoryBean.getScheduler();
            if (scheduler.checkExists(jobKey)) {
                return true;
            }
        } catch (SchedulerException e) {
            //log.info("SchedulerException while checking job with userName and group exist:"+e.getMessage());
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Get the current state of job
     */
    public String getJobState(String jobName) {
        //log.info("JobServiceImpl.getJobState()");

        try {
            String groupKey = "SampleGroup";
            JobKey jobKey = new JobKey(jobName, groupKey);

            Scheduler scheduler = schedulerFactoryBean.getScheduler();
            JobDetail jobDetail = scheduler.getJobDetail(jobKey);

//			//мое
//
//					List<JobExecutionContext> currentJobs = schedulerFactoryBean.getScheduler().getCurrentlyExecutingJobs();
//					if(currentJobs!=null){
//						for (JobExecutionContext jobCtx : currentJobs) {
//							String jobNameDB = jobCtx.getJobDetail().getKey().getName();
//							String groupNameDB = jobCtx.getJobDetail().getKey().getGroup();
//							if (jobName.equalsIgnoreCase(jobNameDB) && groupKey.equalsIgnoreCase(groupNameDB)) {
//
//								Object obj =  jobCtx.getResult();
//								log.info(obj.toString());
//							}
//						}
//					}


            List<? extends Trigger> triggers = scheduler.getTriggersOfJob(jobDetail.getKey());
            if (triggers != null && triggers.size() > 0) {
                for (Trigger trigger : triggers) {
                    TriggerState triggerState = scheduler.getTriggerState(trigger.getKey());


                    if (TriggerState.PAUSED.equals(triggerState)) {
                        return "PAUSED";
                    } else if (TriggerState.BLOCKED.equals(triggerState)) {
                        return "BLOCKED";
                    } else if (TriggerState.COMPLETE.equals(triggerState)) {
                        return "COMPLETE";
                    } else if (TriggerState.ERROR.equals(triggerState)) {
                        return "ERROR";
                    } else if (TriggerState.NONE.equals(triggerState)) {
                        return "NONE";
                    } else if (TriggerState.NORMAL.equals(triggerState)) {
                        return "SCHEDULED";
                    }
                }
            }
        } catch (SchedulerException e) {
            //log.info("SchedulerException while checking job with userName and group exist:"+e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Stop a job
     */
    @Override
    public boolean stopJob(String jobName) {
        //log.info("JobServiceImpl.stopJob()");
        try {
            String jobKey = jobName;
            String groupKey = "SampleGroup";

            Scheduler scheduler = schedulerFactoryBean.getScheduler();
            JobKey jkey = new JobKey(jobKey, groupKey);

            return scheduler.interrupt(jkey);

        } catch (SchedulerException e) {
            //log.info("SchedulerException while stopping job. error message :"+e.getMessage());
            e.printStackTrace();
        }
        return false;

    }

    @Override
    public List<DtoJobInfoExecute> listHistJob() {
        return jobService.getListHistJob();
    }
}

