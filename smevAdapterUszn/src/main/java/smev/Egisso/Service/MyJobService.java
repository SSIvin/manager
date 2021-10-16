package smev.Egisso.Service;

import org.quartz.JobExecutionException;
import smev.Egisso.Entity.GlobalPackage;
import smev.Egisso.dto.DtoJobInfoExecute;
import smev.Egisso.dto.HistoryJob;

import java.util.List;
import java.util.Optional;

public interface MyJobService {
    int writeStart(String ID_EXEC, int i);

    void updateJob(int id,JobExecutionException jobExecutionException);

    Optional<HistoryJob> getLastJob(String jobName);

    Optional<GlobalPackage> getGlobalPackageIdJob(int executeJobId);

    List<DtoJobInfoExecute> getListHistJob();
}
