package smev.GisJkh.Dao;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import smev.GisJkh.Converter.GisJkhConverter;
import smev.GisJkh.Entity.DataRequestEntity;
import smev.GisJkh.Entity.GlobalPackageEntity;
import smev.GisJkh.Enum.TypePackage;
import smev.GisJkh.Mapper.GlobalPackageMapper;
import smev.GisJkh.SQL_GIS_JKH;
import smev.Reestr.SQL_REESTR;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

@Repository
public class GisJkhDaoImpl {

    private static final Logger log = LogManager.getLogger("GisJkh");

    @Value("${gisJkh.countDayPlusOfResponseDate}")
    public Integer countDayPlusOfResponseDate;



    @Autowired
    @Qualifier("jdbcGisJkhNamed")
    private NamedParameterJdbcTemplate gisJkhJdbcNamed;

    public void test() {
        gisJkhJdbcNamed.update("" +
                        "INSERT INTO PACKAGE_REQUEST\n" +
                        "(\n" +
                        "\tIdPackage,\n" +
                        "\tinteractionId\n" +
                        ")\n" +
                        "VALUES\n" +
                        "(\n" +
                        "\t:A,:B\n" +
                        ")"
                , new MapSqlParameterSource()
                        .addValue("A", "66caa87f-bf61-d04a-b08e-3bef04cb7ebb", Types.VARCHAR)
                        .addValue("B", "2d978e85-3053-45ca-9318-28fa880f9c77", Types.VARCHAR)
        );
    }


    //@Override
    public List<DataRequestEntity> geListForRequestRequest(GlobalPackageEntity globalPackageEntity) {
        List<DataRequestEntity> list = new ArrayList<>();
        gisJkhJdbcNamed.query(SQL_GIS_JKH.ListDataRequestRequest
                , new MapSqlParameterSource()
                        .addValue("idGlobalPackage", globalPackageEntity.getIdGlobalPackage().toString(), Types.VARCHAR)
                        .addValue("typePackage", TypePackage.IMPORT.value(), Types.VARCHAR)
                        .addValue("countDayPlusOfResponseDate", countDayPlusOfResponseDate, Types.INTEGER)
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        list.add(GisJkhConverter.MAPPER.ToRequestEntity(rs));
                    }
                });
        return list;
    }

    //@Override
    public GlobalPackageEntity LastGlobalPackage() {
        GlobalPackageEntity globalPackageEntity = new GlobalPackageEntity();
        try {
            globalPackageEntity = gisJkhJdbcNamed.queryForObject(SQL_GIS_JKH.LastGlobalPackage
                    , new MapSqlParameterSource()
                    , new GlobalPackageMapper()
            );
        } catch (EmptyResultDataAccessException e) {

        }
        return globalPackageEntity;

    }


    public List<DataRequestEntity> getListRequestError(GlobalPackageEntity globalPackageEntity) {
        List<DataRequestEntity> list = new ArrayList<>();
        gisJkhJdbcNamed.query(SQL_GIS_JKH.ListRequestForReSend
                , new MapSqlParameterSource()
                        .addValue("idGlobalPackage", globalPackageEntity.getIdGlobalPackage().toString(), Types.VARCHAR)
                        .addValue("typePackage", TypePackage.IMPORT.value(), Types.VARCHAR)
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        list.add(GisJkhConverter.MAPPER.ToRequestEntity(rs));
                    }
                });
        return list;
    }


//    public List<DataRequestEntity> getListNewData(GlobalPackageEntity globalPackageEntity) {
//        List<DataRequestEntity> list = new ArrayList<>();
//        gisJkhJdbcNamed.query(SQL_GIS_JKH.ListData
//                , new MapSqlParameterSource()
//                        .addValue("idGlobalPackage", globalPackageEntity.getIdGlobalPackage().toString(), Types.VARCHAR)
//                        .addValue("typePackage", TypePackage.IMPORT.value(), Types.VARCHAR)
//                , new RowCallbackHandler() {
//                    @Override
//                    public void processRow(ResultSet rs) throws SQLException {
//                        list.add(GisJkhConverter.MAPPER.ToRequestEntity(rs));
//                    }
//                });
//        return list;
//    }

    public List<String> getPackagesForReSend(GlobalPackageEntity globalPackageEntity) {
        List<String> list = new ArrayList<>();
        gisJkhJdbcNamed.query(SQL_GIS_JKH.ListIdPackageForReSend
                , new MapSqlParameterSource()
                        .addValue("idGlobalPackage", globalPackageEntity.getIdGlobalPackage().toString(), Types.VARCHAR)
                        .addValue("typePackage", TypePackage.IMPORT.value(), Types.VARCHAR)
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        list.add(rs.getString("packageId"));
                    }
                });
        return list;
    }


    public List<DataRequestEntity>  getRequestDataByPackageId(String packageForSend) {
        List<DataRequestEntity> list = new ArrayList<>();
        gisJkhJdbcNamed.query(SQL_GIS_JKH.ListRequestByIdPackage
                , new MapSqlParameterSource()
                        .addValue("packageId", packageForSend, Types.VARCHAR)
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        list.add(GisJkhConverter.MAPPER.ToRequestEntity(rs));
                    }
                });
        return list;
    }

}
