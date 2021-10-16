package smev.Egisso.Service.Impl;

import lombok.extern.log4j.Log4j2;
import org.quartz.JobExecutionException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.Egisso.Dao.JobDao;
import smev.Egisso.Entity.GlobalPackage;
import smev.Egisso.Service.MyJobService;
import smev.Egisso.dto.DtoGlobalPackage;
import smev.Egisso.dto.DtoHistoryJob;
import smev.Egisso.dto.DtoJobInfoExecute;
import smev.Egisso.dto.HistoryJob;
import smev.Egisso.exceptions.ErrorMessages;
import smev.Egisso.exceptions.JobServiceException;
import smev.Egisso.util.MyUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Log4j2
@Transactional(value = "jdbcSchedullerTransactionManager",  propagation = Propagation.SUPPORTS)
public class MyJobServiceImpl implements MyJobService {

    @Autowired
    private JobDao jobDao;

    @Override
    public int writeStart(String jobName, int statusId) {
        try {
            return jobDao.writeStart(jobName, statusId);
        } catch (DataAccessException e) {
            throw new JobServiceException(ErrorMessages.ERROR_SQL_WRITE_ID_EXEC.getErrorMessage(), e);
        }
    }

    @Override
    public Optional<HistoryJob> getLastJob(String jobName) {
        Optional<HistoryJob> lastJob = jobDao.getLastJob(jobName);
        return lastJob;
    }

    @Override
    //@Transactional(value = "jdbcSchedullerTransactionManager", propagation = Propagation.SUPPORTS)
    public Optional<GlobalPackage> getGlobalPackageIdJob(int executeJobId) {
        return jobDao.getGlobalPackageIdJob(executeJobId);
    }

    @Override
    public List<DtoJobInfoExecute> getListHistJob() {
        List<DtoJobInfoExecute> list = new ArrayList<>();

        List<Optional<DtoGlobalPackage>> listDTOglobalPackage = toDTO(jobDao.getListGlobalPackage());
        listDTOglobalPackage.forEach(gtoGP -> {
            list.add(DtoJobInfoExecute.builder()
                    .globalPackage(gtoGP)
                    .historyJob(toDTO2(jobDao.getJobById(gtoGP.isPresent() ? gtoGP.get().getExecuteJobId() : 0)))
                    .build());
        });
        return list;
    }

    private Optional<DtoHistoryJob> toDTO2(Optional<HistoryJob> lastJob) {
        return MyUtils.getDtoHistoryJob(lastJob);
    }

    private List<Optional<DtoGlobalPackage>> toDTO(List<Optional<GlobalPackage>> listGlobalPackage) {
        List<Optional<DtoGlobalPackage>> listDTO = new ArrayList<>();
        listGlobalPackage.stream().forEach(globalPackage -> {
            listDTO.add(MyUtils.getDtoGlobalPackage(globalPackage));
        });
        return listDTO;
    }

    @Override
    public void updateJob(int id, JobExecutionException jobExecutionException) {
        jobDao.updateJob(id, jobExecutionException);
    }
}
