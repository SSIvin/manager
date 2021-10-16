package smev.Scheduller.service;

import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import smev.Egisso.dto.DtoJobInfoExecute;
import smev.Egisso.dto.HistoryJob;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface JobService {
	boolean scheduleOneTimeJob(String jobName, Class<? extends QuartzJobBean> jobClass, Date date);
	boolean scheduleCronJob(String jobName, Class<? extends QuartzJobBean> jobClass, Date date, String cronExpression);

	boolean updateOneTimeJob(String jobName, Date date);
	boolean updateCronJob(String jobName, Date date, String cronExpression);

	boolean unScheduleJob(String jobName);
	boolean deleteJob(String jobName);
	boolean pauseJob(String jobName);
	boolean resumeJob(String jobName);
	boolean startJobNow(String jobName) throws JobExecutionException;
	boolean isJobRunning(String jobName);
	List<Map<String, Object>> getAllJobs();
	Optional<HistoryJob> getLastStatus(String jobName);
	boolean isJobWithNamePresent(String jobName);
	String getJobState(String jobName);
	boolean stopJob(String jobName);

	List<DtoJobInfoExecute> listHistJob();

}
