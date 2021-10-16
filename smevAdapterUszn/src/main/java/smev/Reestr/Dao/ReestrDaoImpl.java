package smev.Reestr.Dao;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
import smev.ElementServices.NalogMnogodet.СведФЛТип;
import smev.ElementServices.NalogMnogodet.Файл;
import smev.ElementServices.PFR_KSZN.responsePfrKszn;
import smev.GisJkh.Converter.GisJkhConverter;
import smev.GisJkh.Entity.DataRequestEntity;
import smev.GisJkh.Entity.GlobalPackageEntity;
import smev.Mapper.BisinnesIntMapper;
import smev.Reestr.Dto.DataRequestOrders;
import smev.Reestr.Dto.DateForGisJkh;
import smev.Reestr.Entity2.NalogMnogodetEntity;
import smev.Reestr.Entity2.Rekvezits;
import smev.Reestr.Entity2.SubjectReestr;
import smev.Reestr.Entity2.ZagsEntity;
import smev.Reestr.Mapper.ChangePFRKSZNMapper;
import smev.Reestr.Mapper.DateForGisJkhMapper;
import smev.Reestr.Mapper.NalogMnogodetMapper;
import smev.Reestr.Mapper.RekvezitsMapper;
import smev.Reestr.SQL_REESTR;
import smev.SQL;
import smev.Service.excel.UserReportGenerator;
import smev.dao.EntitySmev.OrderEntity;
import smev.utils.util;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
@Log4j2
public class ReestrDaoImpl implements ReestrDao, OrderReestrDao {

    @Autowired
    @Qualifier("jdbcReestr")
    private JdbcTemplate jdbcReestr;


    @Autowired
    @Qualifier("jdbcRNamed")
    private NamedParameterJdbcTemplate reestrJdbcNamed;


    @Override
    public void insertZagsEntity(ZagsEntity zagsEntity) {
        try {
            reestrJdbcNamed.update(SQL.INSERT_ZAGS_SMEV
                    , new MapSqlParameterSource()
                            .addValue("SURNAME", zagsEntity.getSurname(), Types.VARCHAR)
                            .addValue("NAME", zagsEntity.getName(), Types.VARCHAR)
                            .addValue("SECNAME", zagsEntity.getSecname(), Types.VARCHAR)
                            .addValue("BIRTHDAY", zagsEntity.getBirthDay(), Types.VARCHAR)
                            .addValue("SNILS", zagsEntity.getSnils(), Types.VARCHAR)
                            .addValue("DEATHD", zagsEntity.getDeathDate(), Types.VARCHAR)
                            .addValue("ACTNOMER", zagsEntity.getActNumber(), Types.VARCHAR)
                            .addValue("ACTDATE", zagsEntity.getActdate(), Types.VARCHAR)
                            .addValue("SER_NUM", zagsEntity.getSerNum(), Types.VARCHAR)
                            .addValue("ADDRESS_LIVE_LAST", zagsEntity.getAddressLiveLast(), Types.VARCHAR)
                            .addValue("MESSAGE_ID", zagsEntity.getMessageId(), Types.VARCHAR)
            );
        } catch (Exception e) {
            log.error(e);
            log.error(zagsEntity);
        }

    }

    @Override
    public void updateZags(ZagsEntity zagsEntity) {

    }

    @Override
    public void getPaySubject(SubjectReestr item) {
        reestrJdbcNamed.query(SQL_REESTR.paySubject,
                new MapSqlParameterSource()
                        .addValue("ID_REGION", item.getIdRegion(), Types.INTEGER)
                        .addValue("ID_SUBJECT", item.getIdSubject(), Types.INTEGER)
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        item.setSumma(rs.getString("SNAZN"));
                        //log.info(Thread.currentThread().getId() + " - сумма: " + rs.getBigDecimal("SNAZN").toString());
                    }
                }
        );
    }

    @Override
    public List<SubjectReestr> getListForJob() {
        List<SubjectReestr> reestrList = new ArrayList<>();
        reestrJdbcNamed.query(SQL_REESTR.getListSubject
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        reestrList.add(
                                new SubjectReestr(rs.getInt("idR")
                                        , rs.getInt("idSubject")
                                        , rs.getString("f")
                                        , rs.getString("i")
                                        , rs.getString("o")
                                        , null
                                )
                        );
                    }
                }
                //        BeanPropertyRowMapper.newInstance(SubjectReestr.class)
        );
        return reestrList;
    }

    @Override
    public void saveToOtherTable(SubjectReestr item) {
        reestrJdbcNamed.update(SQL_REESTR.INSERT_TO_TABLE
                , new MapSqlParameterSource()
                        .addValue("ID_REGION", item.getIdRegion(), Types.INTEGER)
                        .addValue("ID_SUBJECT", item.getIdSubject(), Types.INTEGER)
                        .addValue("SUMMA", item.getSumma(), Types.VARCHAR)
        );
    }

    @Override
    public void saveToOtherTableBatch(List<SubjectReestr> batchList) {
        List<Map<String, Object>> batchValues = new ArrayList<>(batchList.size());
        for (SubjectReestr subR : batchList) {
            batchValues.add(
                    new MapSqlParameterSource()
                            .addValue("ID_REGION", subR.getIdRegion())
                            .addValue("ID_SUBJECT", subR.getIdSubject())
                            .addValue("SUMMA", subR.getSumma())
                            .getValues());

        }
        int[] updateCounts = reestrJdbcNamed.batchUpdate(SQL_REESTR.INSERT_TO_TABLE,
                batchValues.toArray(new Map[batchList.size()]));

    }

    @Override
    public void ListNalogMnogodet(Файл файл) {
        List<Файл.Документ> документы = файл.getДокумент();
        reestrJdbcNamed.query(SQL_REESTR.getListSubject
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {


                        документы.add(CreateДокумент(файл, rs));
                    }
                }
                //        BeanPropertyRowMapper.newInstance(SubjectReestr.class)
        );
        //return ;СведДет
    }

    @Override
    public List<NalogMnogodetEntity> dataForNalog() {
        return reestrJdbcNamed.query(SQL_REESTR.DataForNalog37
                , new NalogMnogodetMapper()
        );
    }

    @Override
    public DateForGisJkh getLastDateForGisJkh() {
        DateForGisJkh dateForGisJkh = new DateForGisJkh();
        try {
            dateForGisJkh = reestrJdbcNamed.queryForObject(SQL_REESTR.mapDateForGisJkh
                    , new MapSqlParameterSource()
                    , new DateForGisJkhMapper()
            );
        } catch (EmptyResultDataAccessException e) {

        }
        return dateForGisJkh;

    }

    @Override
    public List<DataRequestEntity> getListDataRequestEntity(Integer idRegion, DateForGisJkh lastDateForGisJkh, GlobalPackageEntity globalPackageEntity) {
        List<DataRequestEntity> list = new ArrayList<>();
        reestrJdbcNamed.query(SQL_REESTR.ListData
                , new MapSqlParameterSource()
                        .addValue("ID_REGION", idRegion, Types.INTEGER)
                        .addValue("globalPackageId", globalPackageEntity.getIdGlobalPackage().toString(), Types.VARCHAR)
                        .addValue("DATE_33", lastDateForGisJkh.getDate33(), Types.DATE)
                        .addValue("DATE_79", lastDateForGisJkh.getDate79(), Types.DATE)
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        if (util.isUUID(rs.getString("HOUSE_ID").trim())) {
                            list.add(GisJkhConverter.MAPPER.dataToRequestEntity(rs));
                        } else
                            log.warn("UUID {} is not valid", rs.getString("HOUSE_ID").trim());
                    }
                });
        return list;
    }

    @Override
    public LocalDate getMaxDatZ() {
        Timestamp timestamp = (Timestamp) reestrJdbcNamed.queryForObject(
                SQL_REESTR.getMaxDatZ
                , new MapSqlParameterSource()
                , Timestamp.class);
        return util.toLocalDate(timestamp);
    }

    @Override
    public Rekvezits getByIdRegion(Integer idRegion) {
        List<Rekvezits> id_region = reestrJdbcNamed.query(SQL_REESTR.getRekvezitsByIdRegion
                , new MapSqlParameterSource()
                        .addValue("ID_REGION", idRegion, Types.INTEGER)
                , new RekvezitsMapper()
        );
        if (!id_region.isEmpty()) {
            return id_region.get(0);
        }
        return null;
    }

    @Override
    public List<UserReportGenerator.ResultFromView> getReportExcel_1() {
        return this.reestrJdbcNamed.query("SELECT TOP(100000) * FROM t_subject", (rs, rowNum) -> {
            return new UserReportGenerator.ResultFromView(rs.getInt("ID_SUBJECT"), rs.getString("snils"), rs.getString("SURNAME"), "", "");
        });

    }

    @Override
    public List<responsePfrKszn> getDataChangePFRKSZN(LocalDateTime nowtime) {
        List<responsePfrKszn> resp = reestrJdbcNamed.query(SQL_REESTR.getDataChangePFRKSZN
                , new MapSqlParameterSource()
                        .addValue("dateCreate", nowtime, Types.DATE)
                , new ChangePFRKSZNMapper()
        );
        return resp;
    }

    private Файл.Документ CreateДокумент(Файл файл, ResultSet rs) {
        Файл.Документ документ = new Файл.Документ();
        List<Файл.Документ.СодСвед> содСвед = документ.getСодСвед();
        Файл.Документ.СодСвед свед = new Файл.Документ.СодСвед();
        свед.setСведФЛ(CreateСведФЛ(rs));
        List<СведФЛТип> ListсведДет = свед.getСведДет();
        ListсведДет.add(CreateСведДет(rs));
        содСвед.add(свед);
        return null;
    }

    private СведФЛТип CreateСведДет(ResultSet rs) {
        СведФЛТип дет = new СведФЛТип();
        return дет;

    }

    private СведФЛТип CreateСведФЛ(ResultSet rs) {
        СведФЛТип сведФЛТип = new СведФЛТип();
        return сведФЛТип;

    }


}
