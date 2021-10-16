package smev.Egisso.Dao;

import org.quartz.JobExecutionException;
import smev.Egisso.Entity.GlobalPackage;
import smev.Egisso.dto.HistoryJob;

import java.util.List;
import java.util.Optional;

public interface JobDao {

    int writeStart(String jobName, int statusId);
    void updateJob(int id, JobExecutionException jobExecutionException);
    Optional<HistoryJob> getLastJob(String jobName);

    Optional<HistoryJob> getJobById(Integer executeJobId);

    Optional<GlobalPackage> getGlobalPackageIdJob(int executeJobId);

    List<Optional<GlobalPackage>> getListGlobalPackage();

}
