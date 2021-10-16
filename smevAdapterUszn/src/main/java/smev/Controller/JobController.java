package smev.Controller;

import io.swagger.annotations.ApiOperation;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import smev.Scheduller.MyJob.TestJob;
import smev.Scheduller.dto.ServerResponse;
import smev.Scheduller.service.JobService;
import smev.Scheduller.util.ServerResponseCode;
import smev.Egisso.dto.DtoJobInfoExecute;
import smev.Egisso.exceptions.NaznServiceException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/scheduler/")
public class JobController {

    @Autowired
    @Lazy
    JobService jobService;

    @RequestMapping("schedule")

    public ServerResponse schedule(@RequestParam("jobName") String jobName,
                                   @RequestParam("jobScheduleTime") @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm") Date jobScheduleTime,
                                   @RequestParam("cronExpression") String cronExpression) {
        //log.info("JobController.schedule()");

        //Job Name is mandatory
        if (jobName == null || jobName.trim().equals("")) {
            return getServerResponse(ServerResponseCode.JOB_NAME_NOT_PRESENT, false);
        }

        //Check if job Name is unique;
        if (!jobService.isJobWithNamePresent(jobName)) {

            if (cronExpression == null || cronExpression.trim().equals("")) {
                //Single Trigger
                boolean status = jobService.scheduleOneTimeJob(jobName, TestJob.class, jobScheduleTime);
                if (status) {
                    return getServerResponse(ServerResponseCode.SUCCESS, jobService.getAllJobs());
                } else {
                    return getServerResponse(ServerResponseCode.ERROR, false);
                }

            } else {
                //Cron Trigger
                Class<? extends QuartzJobBean>  c = null;
                try {
                    c = (Class<? extends QuartzJobBean>) Class.forName("smev.scheduller.Scheduller.MyJob." + jobName);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                if (c == null) {
                    return getServerResponse(ServerResponseCode.ERROR, "class no found");
                }

                boolean status = jobService.scheduleCronJob(jobName,c, jobScheduleTime, cronExpression);
                if (status) {
                    return getServerResponse(ServerResponseCode.SUCCESS, jobService.getAllJobs());
                } else {
                    return getServerResponse(ServerResponseCode.ERROR, false);
                }
            }
        } else {
            return getServerResponse(ServerResponseCode.JOB_WITH_SAME_NAME_EXIST, false);
        }
    }

    @RequestMapping("unschedule")

    public void unschedule(@RequestParam("jobName") String jobName) {
        //log.info("JobController.unschedule()");
        jobService.unScheduleJob(jobName);
    }

    @RequestMapping("delete")

    public ServerResponse delete(@RequestParam("jobName") String jobName) {
        //log.info("JobController.delete()");

        if (jobService.isJobWithNamePresent(jobName)) {
            boolean isJobRunning = jobService.isJobRunning(jobName);

            if (!isJobRunning) {
                boolean status = jobService.deleteJob(jobName);
                if (status) {
                    return getServerResponse(ServerResponseCode.SUCCESS, true);
                } else {
                    return getServerResponse(ServerResponseCode.ERROR, false);
                }
            } else {
                return getServerResponse(ServerResponseCode.JOB_ALREADY_IN_RUNNING_STATE, false);
            }
        } else {
            //Job doesn't exist
            return getServerResponse(ServerResponseCode.JOB_DOESNT_EXIST, false);
        }
    }

    @ApiOperation("Пауза")
    @RequestMapping("pause")

    public ServerResponse pause(@RequestParam("jobName") String jobName) {
        //log.info("JobController.pause()");

        if (jobService.isJobWithNamePresent(jobName)) {

            boolean isJobRunning = jobService.isJobRunning(jobName);

            if (!isJobRunning) {
                boolean status = jobService.pauseJob(jobName);
                if (status) {
                    return getServerResponse(ServerResponseCode.SUCCESS, true);
                } else {
                    return getServerResponse(ServerResponseCode.ERROR, false);
                }
            } else {
                return getServerResponse(ServerResponseCode.JOB_ALREADY_IN_RUNNING_STATE, false);
            }

        } else {
            //Job doesn't exist
            return getServerResponse(ServerResponseCode.JOB_DOESNT_EXIST, false);
        }
    }

    @RequestMapping("resume")

    public ServerResponse resume(@RequestParam("jobName") String jobName) {
        //log.info("JobController.resume()");

        if (jobService.isJobWithNamePresent(jobName)) {
            String jobState = jobService.getJobState(jobName);

            if (jobState.equals("PAUSED")) {
                //log.info("Job current state is PAUSED, Resuming job...");
                boolean status = jobService.resumeJob(jobName);

                if (status) {
                    return getServerResponse(ServerResponseCode.SUCCESS, true);
                } else {
                    return getServerResponse(ServerResponseCode.ERROR, false);
                }
            } else {
                return getServerResponse(ServerResponseCode.JOB_NOT_IN_PAUSED_STATE, false);
            }

        } else {
            //Job doesn't exist
            return getServerResponse(ServerResponseCode.JOB_DOESNT_EXIST, false);
        }
    }

    @RequestMapping("update")

    public ServerResponse updateJob(@RequestParam("jobName") String jobName,
                                    @RequestParam("jobScheduleTime")  String jobScheduleTimeStr,
                                    @RequestParam("cronExpression") String cronExpression) throws ParseException {
        //log.info("JobController.updateJob()");

        //Job Name is mandatory
        if (jobName == null || jobName.trim().equals("")) {
            return getServerResponse(ServerResponseCode.JOB_NAME_NOT_PRESENT, false);
        }
        Date jobScheduleTime=new SimpleDateFormat("yyyy/MM/dd HH:mm").parse(jobScheduleTimeStr);
        //Edit Job
        if (jobService.isJobWithNamePresent(jobName)) {

            if (cronExpression == null || cronExpression.trim().equals("")) {
                //Single Trigger
                boolean status = jobService.updateOneTimeJob(jobName, jobScheduleTime);
                if (status) {
                    return getServerResponse(ServerResponseCode.SUCCESS, jobService.getAllJobs());
                } else {
                    return getServerResponse(ServerResponseCode.ERROR, false);
                }

            } else {
                //Cron Trigger
                boolean status = jobService.updateCronJob(jobName, jobScheduleTime, cronExpression);
                if (status) {
                    return getServerResponse(ServerResponseCode.SUCCESS, jobService.getAllJobs());
                } else {
                    return getServerResponse(ServerResponseCode.ERROR, false);
                }
            }


        } else {
            return getServerResponse(ServerResponseCode.JOB_DOESNT_EXIST, false);
        }
    }

    @RequestMapping("jobs")

    public ServerResponse getAllJobs(
    ) {
        //log.info("JobController.getAllJobs()");

        List<Map<String, Object>> list = jobService.getAllJobs();
        return getServerResponse(ServerResponseCode.SUCCESS, list);
    }

    @RequestMapping("ListHistJob")

    public ServerResponse ListHistJob() {
        List<DtoJobInfoExecute> list = jobService.listHistJob();
        return getServerResponse(ServerResponseCode.SUCCESS, list);
    }

    @RequestMapping("checkJobName")
    public ServerResponse checkJobName(@RequestParam("jobName") String jobName) {
        //log.info("JobController.checkJobName()");

        //Job Name is mandatory
        if (jobName == null || jobName.trim().equals("")) {
            return getServerResponse(ServerResponseCode.JOB_NAME_NOT_PRESENT, false);
        }

        boolean status = jobService.isJobWithNamePresent(jobName);
        return getServerResponse(ServerResponseCode.SUCCESS, status);
    }

    @RequestMapping("isJobRunning")

    public ServerResponse isJobRunning(@RequestParam("jobName") String jobName) {
        //log.info("JobController.isJobRunning()");

        boolean status = jobService.isJobRunning(jobName);
        return getServerResponse(ServerResponseCode.SUCCESS, status);
    }

    @RequestMapping("jobState")

    public ServerResponse getJobState(@RequestParam("jobName") String jobName) {
        //log.info("JobController.getJobState()");

        String jobState = jobService.getJobState(jobName);
        return getServerResponse(ServerResponseCode.SUCCESS, jobState);
    }

    @RequestMapping("stop")
    public ServerResponse stopJob(@RequestParam("jobName") String jobName) {
        //log.info("JobController.stopJob()");

        if (jobService.isJobWithNamePresent(jobName)) {

            if (jobService.isJobRunning(jobName)) {
                boolean status = jobService.stopJob(jobName);
                if (status) {
                    return getServerResponse(ServerResponseCode.SUCCESS, true);
                } else {
                    //Server error
                    return getServerResponse(ServerResponseCode.ERROR, false);
                }

            } else {
                //Job not in running state
                return getServerResponse(ServerResponseCode.JOB_NOT_IN_RUNNING_STATE, false);
            }

        } else {
            //Job doesn't exist
            return getServerResponse(ServerResponseCode.JOB_DOESNT_EXIST, false);
        }
    }

    @RequestMapping("start")

    public ServerResponse startJobNow(@RequestParam("jobName") String jobName) throws JobExecutionException, NaznServiceException {
        //log.info("JobController.startJobNow()");
        //throw new NaznServiceException("Ошибка задания");
        if (jobService.isJobWithNamePresent(jobName)) {

            if (!jobService.isJobRunning(jobName)) {
                boolean status = jobService.startJobNow(jobName);

                if (status) {
                    //Success
                    return getServerResponse(ServerResponseCode.SUCCESS, true);

                } else {
                    //Server error
                    return getServerResponse(ServerResponseCode.ERROR, false);
                }

            } else {
                //Job already running
                return getServerResponse(ServerResponseCode.JOB_ALREADY_IN_RUNNING_STATE, false);
            }

        } else {
            //Job doesn't exist
            return getServerResponse(ServerResponseCode.JOB_DOESNT_EXIST, false);
        }
    }

    public ServerResponse getServerResponse(int responseCode, Object data) {
        ServerResponse serverResponse = new ServerResponse();
        serverResponse.setStatusCode(responseCode);
        serverResponse.setData(data);
        return serverResponse;
    }
}
