package smev.Egisso.Dao;


import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import smev.Egisso.Elements.ElementsProtocol.Messages;
import smev.Egisso.Elements.ElementsProtocol.RecordResult;
import smev.Egisso.Elements.ElementsProtocol.TError;
import smev.Egisso.Entity.GlobalPackage;
import smev.Egisso.Enum.ApplayProtocol;
import smev.Egisso.Enum.StatusPackage;
import smev.Egisso.Enum.TypePackage;
import smev.Egisso.dto.PacInner;
import smev.Egisso.exceptions.ErrorMessages;
import smev.Egisso.exceptions.NaznServiceException;
import smev.SQL;
import smev.Egisso.Entity.PackageHistory;
import smev.Egisso.Entity.PackageMessage;

import javax.annotation.PostConstruct;
import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
public class EgissoDaoImpl implements EgissoDao {


    @Autowired
    @Qualifier("jdbcEgisso")
    private JdbcTemplate jdbcEgisso;

    @Autowired
    @Qualifier("egissojdbcNamed")
    private NamedParameterJdbcTemplate egissoJdbcNamed;

    @Value("${egisso.batchSize}")
    private int batchSize;

    @PostConstruct
    public void init() {
        jdbcEgisso.setResultsMapCaseInsensitive(true);
    }


    @Override
    public void savePackageMessage(UUID packageID, UUID messageID) {
        jdbcEgisso.update(SQL.INSERT_PACKAGE_MESSAGE, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                ps.setObject(1, messageID);
                ps.setObject(2, packageID);
            }
        });
    }

    @Override
    public void update(PackageHistory packageHistory) {
        egissoJdbcNamed.update(SQL.UPDATE_PACKEGE_HISTORY
                , new MapSqlParameterSource()
                        .addValue("packageID", packageHistory.getPackageId(), Types.VARCHAR)
                        .addValue("fileName", packageHistory.getFileName(), Types.VARCHAR)
                        .addValue("typePackage", packageHistory.getTypePackage().index(), Types.INTEGER)
                        .addValue("statusEgisso", packageHistory.getStatusEgisso().index(), Types.INTEGER)
                        .addValue("statusSmev", packageHistory.getStatusSmev().index(), Types.INTEGER)
                        .addValue("description", packageHistory.getDescription(), Types.VARCHAR)
                        .addValue("code", packageHistory.getCode(), Types.VARCHAR)
                        .addValue("recordNum", packageHistory.getRecordNum(), Types.INTEGER)
                        .addValue("recordNumSuccess", packageHistory.getRecordNumSuccess(), Types.INTEGER)
        );
    }

    @Override
    public PackageHistory getById(UUID packageID) {
        PackageHistory packageHistory = null;
        //InquiryVersionEntity = jdbcSmev.queryForObject(sql, BeanPropertyRowMapper.newInstance(InquiryVersionEntity.class)) == null ? null : null;
        try {
            packageHistory = egissoJdbcNamed.queryForObject(SQL.PackageHistoryEntityGetById
                    , new MapSqlParameterSource()
                            .addValue("packageID", packageID, Types.VARCHAR)
                    , BeanPropertyRowMapper.newInstance(PackageHistory.class)
            );
        } catch (EmptyResultDataAccessException e) {

        }
        return packageHistory;
    }

    @Override
    public List<PackageMessage> getPackageMessageByPackageId(UUID packageID) {
        return egissoJdbcNamed.query(SQL.PackageMessageByPackageId
                , new MapSqlParameterSource()
                        .addValue("PACKAGE_ID", packageID, Types.VARCHAR)
                , new BeanPropertyRowMapper(PackageMessage.class));
    }


    public void updateStatusPackage(PacInner pac, BigInteger recordNum, BigInteger recordNumSuccess, StatusPackage statusPackage) {
        jdbcEgisso.update(SQL.SQL_UPDATE_STATUS_PACKAGE, statusPackage.index(), recordNum==null ? 0 : recordNum, recordNumSuccess==null ? 0 :recordNumSuccess, pac.getGuidFile());
    }

    public void setApplayProtocolGlobalPackage(PacInner pac, ApplayProtocol applayProtocol) {
        jdbcEgisso.update(SQL.SQL_setApplayProtocol, applayProtocol.index(), TypePackage.PACKAGE_FACT.equals(pac.getTypePackage()) ? pac.getIdGlobalPackage() : pac.getGuidFile());
    }

    @Override
    public GlobalPackage getGlobalPackageByStatusAndApplayProtocol(StatusPackage statusPackage, ApplayProtocol applayProtocol) {
        GlobalPackage globalPackage = null;
        //InquiryVersionEntity = jdbcSmev.queryForObject(sql, BeanPropertyRowMapper.newInstance(InquiryVersionEntity.class)) == null ? null : null;
        try {
            globalPackage = egissoJdbcNamed.queryForObject(SQL.GlobalPackageByStatusAndApplayProtocol
                    , new MapSqlParameterSource()
                            .addValue("applayProtocol", applayProtocol.index(), Types.INTEGER)
                            .addValue("statusPackage", statusPackage.index(), Types.INTEGER)
                    , BeanPropertyRowMapper.newInstance(GlobalPackage.class)
            );
        } catch (EmptyResultDataAccessException e) {

        }
        return globalPackage;
    }

    @Override
    public List<PackageHistory> getListPackageHistoryByGlobalPac(GlobalPackage globalPackage) {
        List<PackageHistory> entityList = null;
        try {
            entityList = egissoJdbcNamed.query(SQL.ListPackageHistoryByGlobalPac
                    , new MapSqlParameterSource()
                            .addValue("packageIDGlobal", globalPackage.getIdGlobalPackage(), Types.VARCHAR)
                    , BeanPropertyRowMapper.newInstance(PackageHistory.class)
            );
        } catch (EmptyResultDataAccessException e) {
        }
        return entityList;
    }


    @Override
    public void writeProtocolBatch(PacInner pac) {
        insertBatchWithSize(pac);
    }

    //    вставка записей пакетом с заданным размером
    /*
    так как Messages в мере может быть несколько то нужно размножить RecordResult
    тоесть на каждый Messages создаем новый RecordResult
     */
    public void insertBatchWithSize(PacInner pac) {
        try {
            List<RecordResult> recordResultList = null;
            recordResultList = fillRecordResult(pac);
            for (int j = 0; j < recordResultList.size(); j += batchSize) {
                insertBatchProtocol(pac, recordResultList, j);
            }
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_SQL_INSERT_PROTOCOL.getErrorMessage(), e);
        }
    }

    private List<RecordResult> fillRecordResult(PacInner pac) {
        List<RecordResult> recordResultList = new ArrayList<>();
        if (pac.getProtocol().getPackageResult() != null) {
            for (RecordResult rs : pac.getProtocol().getPackageResult().getErrorRecords().getRecordResult()) {
                if (rs.getMessages().size() == 0) {
                    if (rs.getRecordError().size() != 0) {
                        RecordResult r = new RecordResult();
                        Messages mes = new Messages();
                        mes.setRuleCode(BigInteger.valueOf(Long.parseLong(rs.getRecordError().get(0).getRuleCode())));
                        mes.setReport(rs.getRecordError().get(0).getReport());
                        r.setRecID(rs.getRecID());
                        setRecordOkey(rs, r);
                        List<Messages> l = new ArrayList<>();
                        l.add(mes);
                        r.setMessages(l);
                        recordResultList.add(r);
                    } else {
                        RecordResult r = new RecordResult();
                        r.setRecID(rs.getRecID());
                        setRecordOkey(rs, r);
                        recordResultList.add(r);
                    }
                } else {
                    for (Messages mess : rs.getMessages()) {
                        RecordResult r = new RecordResult();
                        r.setRecID(rs.getRecID());
                        setRecordOkey(rs, r);

                        List<Messages> l = new ArrayList<>();
                        l.add(mess);
                        r.setMessages(l);
                        recordResultList.add(r);
                    }
                }
            }
        }
        if (pac.getProtocol().getMessageResult() != null) {
            for (TError tError : pac.getProtocol().getMessageResult().getErrors().getError()) {
                RecordResult r = new RecordResult();
                r.setRecID(pac.getGuidFile());
                r.setRecordOK(false);
                List<Messages> l = new ArrayList<>();
                Messages message = new Messages();
                message.setReport(tError.getMessage());
                l.add(message);
                r.setMessages(l);
                recordResultList.add(r);
            }
        }

        return recordResultList;
    }

    private void setRecordOkey(RecordResult rs, RecordResult r) {
        if (rs.getRecordOK() == null) {
            r.setRecordOK(true);
        } else r.setRecordOK(rs.isRecordOK());
    }

    private void insertBatchProtocol(PacInner pac, List<RecordResult> recordResultList, int j) {
        final List<RecordResult> batchList = recordResultList.subList(j, j + batchSize > recordResultList.size() ? recordResultList.size() : j + batchSize);
        jdbcEgisso.batchUpdate(SQL.SQL_INSERT_PROTOCOL, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                //RecordResult customer = batchList.get(i);
                ps.setString(1, batchList.get(i).getRecID());
                ps.setBoolean(2, batchList.get(i).isRecordOK());
                ps.setObject(3, batchList.get(i).getMessages().size() == 0 ? "" : batchList.get(i).getMessages().get(0).getRuleCode());
                ps.setObject(4, batchList.get(i).getMessages().size() == 0 ? "" : batchList.get(i).getMessages().get(0).getMessageType());
                ps.setString(5, batchList.get(i).getMessages().size() == 0 ? "" : batchList.get(i).getMessages().get(0).getReport());
                ps.setString(6,
                        (pac.getTypePackage() == TypePackage.PACKAGE_FACT) ? pac.getIdGlobalPackage() : pac.getGuidFile()
                );
                ps.setString(7, pac.getGuidFile());
            }

            @Override
            public int getBatchSize() {
                return batchList.size();
            }
        });
    }


}
