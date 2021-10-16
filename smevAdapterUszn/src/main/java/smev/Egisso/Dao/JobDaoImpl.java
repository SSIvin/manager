package smev.Egisso.Dao;

import lombok.extern.log4j.Log4j2;

import org.jetbrains.annotations.NotNull;
import org.quartz.JobExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import smev.Egisso.Entity.GlobalPackage;
import smev.Egisso.Enum.ApplayProtocol;
import smev.Egisso.Enum.StatusJob;
import smev.Egisso.Enum.StatusPackage;
import smev.Egisso.Enum.TypePackage;
import smev.Egisso.dto.HistoryJob;
import smev.Egisso.util.MyUtils;
import smev.SQL;
import smev.utils.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Log4j2
public class JobDaoImpl implements JobDao {

    @Autowired
    @Qualifier("jdbcScheduller")
    private JdbcTemplate jdbcScheduller;

    @Autowired
    @Qualifier("jdbcEgisso")
    private JdbcTemplate jdbcEgisso;


    @Override
    public Optional<HistoryJob> getLastJob(String jobName) {
        List<Optional<HistoryJob>> historyJobs = new ArrayList<>();
        jdbcScheduller.query(SQL.SQL_LAST_ID_JOB
                , new PreparedStatementSetter() {
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setString(1, jobName);
                        preparedStatement.setString(2, jobName);
                        //preparedStatement.setFetchSize(3);
                    }
                }
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        Optional<HistoryJob> job = MyUtils.getHistoryJob(rs);
//
//                        Map<String, Object> results = new HashMap<String, Object>();
//                        results.put("ID", rs.getInt("ID"));
//                        results.put("jobName", rs.getString("jobName"));
//                        results.put("runDate", rs.getDate("runDate"));
//                        results.put("statusId", rs.getInt("statusId"));
//                        results.put("message", rs.getString("message"));
//                        results.put("causes", rs.getString("causes"));
                        historyJobs.add(job);
                    }
                }
        );
        return historyJobs.size() > 0 ? historyJobs.get(0) : Optional.empty();
    }


    @Override
    public Optional<HistoryJob> getJobById(Integer executeJobId) {
        List<Optional<HistoryJob>> historyJobs = new ArrayList<>();
        jdbcScheduller.query(SQL.SQL_GET_JOB_BY_ID
                , new PreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps) throws SQLException {
                        ps.setInt(1, executeJobId);
                    }
                }
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        Optional<HistoryJob> job = MyUtils.getHistoryJob(rs);
                        historyJobs.add(job);
                    }
                }

        );
        return historyJobs.size() > 0 ? historyJobs.get(0) : Optional.empty();
    }

    @Override
    public Optional<GlobalPackage> getGlobalPackageIdJob(int executeJobId) {
        Optional<GlobalPackage> globalPackage = null;// Optional<GlobalPackage> globalPackage = null;
        try {
            globalPackage = Optional.of(jdbcEgisso.queryForObject(SQL.SQL_GETGLOBALPACKAGEidExec
                    , new Object[]{executeJobId}
                    , BeanPropertyRowMapper.newInstance(GlobalPackage.class)
            ));
        } catch (EmptyResultDataAccessException e) {

        }

        return globalPackage != null ? globalPackage : Optional.empty();

//        jdbcEgisso.query(SQL.SQL_GETGLOBALPACKAGEidExec
//                , new PreparedStatementSetter() {
//                    @Override
//                    public void setValues(PreparedStatement ps) throws SQLException {
//                        ps.setInt(1, executeJobId);
//                    }
//                }
//                , new RowCallbackHandler() {
//                    @Override
//                    public void processRow(ResultSet rs) throws SQLException {
//                        Optional<GlobalPackage1> globalPackages = getGlobalPackage(rs);
//                        listGlobalPackages.add(globalPackages);
//                    }
//                }
//        );
//        return listGlobalPackages.size() > 0 ? listGlobalPackages.get(0) : Optional.empty();
    }

    @NotNull
    private Optional<GlobalPackage> getGlobalPackage(ResultSet rs) throws SQLException {
        return Optional.ofNullable(GlobalPackage.builder()
                .IdGlobalPackage(UUID.fromString(rs.getString("IdGlobalPackage")))
                .statusPackage(StatusPackage.getStatusPackageById(rs.getInt("statusPackage")))
                .typePackage(TypePackage.getTypePackageById(rs.getInt("typePackage")))
                .createDate(util.DatetoLocalDateTime(rs.getTimestamp("createDate")))
                .modifyDate(util.DatetoLocalDateTime(rs.getTimestamp("modifyDate")))
                .executeJobId(rs.getInt("executeJobId"))
                .applayProtocol(ApplayProtocol.getApplayProtNameById(rs.getInt("applayProtocol")))
                .build());
    }

    @Override
    public List<Optional<GlobalPackage>> getListGlobalPackage() {
        List<Optional<GlobalPackage>> list = new ArrayList<>();
        jdbcEgisso.query(SQL.LIST_GLOBAL_PACKAGE
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        Optional<GlobalPackage> globalPackages = getGlobalPackage(rs);
                        list.add(globalPackages);
                    }
                }
        );
        return list;


    }


    // SQL.SQL_WRITE_START
    @Override
    public int writeStart(String jobName, int statusId) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcScheduller.update(
                new PreparedStatementCreator() {
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement ps =
                                connection.prepareStatement(SQL.SQL_WRITE_START, new String[]{"ID"});
                        ps.setString(1, jobName);
                        ps.setInt(2, statusId);
                        return ps;
                    }
                },
                keyHolder);
        return keyHolder.getKey().intValue();
    }

//    private Throwable getCause(Throwable e) {
//        Throwable cause = null;
//        Throwable result = e;
//
//        while(null != (cause = result.getCause())  && (result != cause) ) {
//            result = cause;
//        }
//        return result;
//    }


    private String getCause(Throwable e) {
        Throwable cause = null;
        Throwable result = e;
        String s;
        s = "";
        while (null != (cause = result.getCause()) && (result != cause)) {
            result = cause;
            s = s + result.toString();
        }
        return s;
    }

    @Override
    public void updateJob(int id, JobExecutionException jobExecutionException) {
        jdbcScheduller.update(SQL.SQL_UPDATE_STATUS
                , new PreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps) throws SQLException {
                        ps.setObject(1, jobExecutionException == null ? StatusJob.OK.index() : StatusJob.ERROR.index());
                        ps.setObject(2, jobExecutionException == null ? null : jobExecutionException.getMessage());
                        ps.setObject(3, jobExecutionException == null ? null : jobExecutionException.getCause() == null ? null : jobExecutionException.getCause().toString() + getCause(jobExecutionException.getCause()));
                        ps.setInt(4, id);
                    }
                });
//                , jobExecutionException == null ? StatusJob.OK.index() : StatusJob.ERROR.index()
//                , jobExecutionException == null ? null : jobExecutionException.getMessage()
//                , jobExecutionException == null ? null : jobExecutionException.getCause() == null ? null : jobExecutionException.getCause().toString() + getCause(jobExecutionException.getCause())
//                , id);
    }
}
