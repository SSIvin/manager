package smev.Scheduller.MyJob;

import org.quartz.JobExecutionException;

import java.io.IOException;

public interface Worker {
	public void work(Integer idExecuteJob) throws JobExecutionException, IOException;
}
