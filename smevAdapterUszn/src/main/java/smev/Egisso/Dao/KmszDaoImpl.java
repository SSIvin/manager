package smev.Egisso.Dao;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.io.FileUtils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.object.GenericStoredProcedure;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Repository;
import smev.ElementServices.Egisso.ElementsKmsz.*;
import smev.SQL;
import smev.Egisso.Enum.StatusPackage;
import smev.Egisso.Enum.TypeFile;
import smev.Egisso.Enum.TypePackage;
import smev.Egisso.exceptions.ErrorMessages;
import smev.Egisso.exceptions.KmszServiceException;

import javax.annotation.PostConstruct;
import javax.xml.bind.ValidationException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
@Log4j2
public class KmszDaoImpl implements KmszDao {


    @Autowired
    @Qualifier("jdbcEgisso")
    private JdbcTemplate jdbcEgisso;

    @PostConstruct
    public void init() {
        jdbcEgisso.setResultsMapCaseInsensitive(true);
    }

    @Override
    public int getCountKmszForChange() throws DataAccessException {
        RowCountCallbackHandler countCallback = new RowCountCallbackHandler();
        jdbcEgisso.query(SQL.SQL_LIST_KMSZ_FOR_CHANGE
                , new Object[]{1},
                countCallback
        );

        return countCallback.getRowCount();
    }

    @Override
    public PackageKMSZ getKmszNoSend() throws EmptyResultDataAccessException {
        return jdbcEgisso.queryForObject(SQL.SQL_PackageKmszNoSend, BeanPropertyRowMapper.newInstance(PackageKMSZ.class));
    }

    @Override
    public Map<String, String> getPackageID(TypePackage typePackage, Integer idExecuteJob) {
        try {
            SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcEgisso)
                    .withProcedureName(SQL.SQL_PROC_P_GET_NEXT_ID)
                    .useInParameterNames("typePackage")
                    .useInParameterNames("idExecuteJob")
                    .declareParameters(new SqlParameter("typePackage", Types.INTEGER))
                    .declareParameters(new SqlParameter("idExecuteJob", Types.INTEGER));

            MapSqlParameterSource paramMap = new MapSqlParameterSource()
                    .addValue("typePackage", typePackage.index())
                    .addValue("idExecuteJob", idExecuteJob);

            ArrayList arr = (ArrayList) jdbcCall.execute(paramMap).get("#result-set-1");
            Map resultMap = (Map) arr.get(0);
            Map<String, String> m2 = (Map) resultMap;
            return m2;
        } catch (DataAccessException e) {
            throw new KmszServiceException(ErrorMessages.ERROR_EXEC_SQL_PROC_GET_NEW_PACKAGE_GUID.getErrorMessage(), e);
        }
        //или
//        for (Map.Entry<String, Object> entry : result.entrySet()) {
//            log.info(entry.getKey() + ":" + entry.getValue().toString());
//        }
//или
//        ObjectMapper objectMapper = new ObjectMapper();
//        List<Foo> list = objectMapper.convertValue(execute.get("#result-set-1"), new TypeReference<List<Foo>>() {});


    }

    @Override
    public void updateGuid() {
        StoredProcedure procedure = new GenericStoredProcedure();
        procedure.setSql(SQL.SQL_PROC_UPDATE_GUID);
        procedure.setJdbcTemplate(jdbcEgisso);
        procedure.execute();

    }

    @Override
    public List<NPA> fillNpa(int ID_MSZ) {
        //открваем НПА c параметром
        List<NPA> listNpa = new ArrayList<>();
        jdbcEgisso.query(SQL.SQL_NPA_KMSZ, new PreparedStatementSetter() {
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setInt(1, ID_MSZ);
                    }
                }
                , new RowCallbackHandler() {
                    public void processRow(ResultSet NPA) throws SQLException {
                        listNpa.add(new NPA(NPA.getString("Number"),
                                        NPA.getDate("date") == null ? null : new SimpleDateFormat("yyyy-MM-dd").format(NPA.getDate("date")),
                                        NPA.getString("Title"),
                                        NPA.getString("Authority"),
                                        NPA.getString("URL")
                                )
                        );
                    }
                }
        );
        return listNpa;
    }

    @Override
    public String getLastGuidKmsz(int ID_MSZ) {
        List<String> str = jdbcEgisso.queryForList(SQL.SQL_GET_LAST_GUID_KMSZ,
                new Object[]{ID_MSZ}, String.class);
        if (str.isEmpty()) {
            try {
                throw new ValidationException(ErrorMessages.EMPTY_GUID_HISTORY.getErrorMessage(), "");
            } catch (ValidationException e) {
                e.printStackTrace();
            }
        } else
            return str.get(0);
        return "";
    }

    @Override
    public List<Map<String, Object>> getMszForChange() {
        List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
        jdbcEgisso.query(SQL.SQL_LIST_KMSZ_FOR_CHANGE,
                new PreparedStatementSetter() {
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setInt(1, 1);
                        //preparedStatement.setFetchSize(3);
                    }
                },
                new ResultSetExtractor<ResultSet>() {
                    @Override
                    public ResultSet extractData(ResultSet rs) throws SQLException, DataAccessException {
                        return DaoUtil.getResultSet(rs, rows);
                    }
                }
        );
        return rows;
    }


    @Override
    public List<LocalCategory> fillCateg(int ID_MSZ) {
        List<LocalCategory> listCateg = new ArrayList<>();
        jdbcEgisso.query(SQL.SQL_CATEG_KMSZ, new PreparedStatementSetter() {
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setInt(1, ID_MSZ);
                    }
                }
                , new RowCallbackHandler() {
                    public void processRow(ResultSet CATEG) throws SQLException {
                        ResultSetMetaData metaData = CATEG.getMetaData();
//Подсчет кол-ва записей
                        int rec = metaData.getColumnCount();
                        //int rec = CATEG.last() ? CATEG.getRowTest() : 0;
                        listCateg.add(new LocalCategory(CATEG.getString("LOCAL_CATEG"), CATEG.getString("CATEGORY_NAME"), CATEG.getString("CATEG_KLASS")));
                    }
                }
        );
        return listCateg;
    }

    @Override
    public void insertPackageKmsz(File file, Request req) {
        jdbcEgisso.update(SQL.SQL_INSERT_PACKAGE_HISTORY, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                //                    ps.setString(1, req.getAPackage().getPackageId());
                //ps.setBlob(1, new ByteArrayInputStream(FileUtils.readFileToByteArray(file)));
                ps.setString(1, req.getAPackage().getPackageId());
                ps.setString(2, req.getAPackage().getFILE_NAME());
                ps.setInt(3, TypePackage.PACKAGE_KMSZ.index());
                ps.setInt(4, StatusPackage.CREATED.index());
            }
        });

        jdbcEgisso.update(SQL.SQL_INSERT_FILES_PACKAGE, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                ps.setString(1, req.getAPackage().getPackageId());
                ps.setString(2, req.getAPackage().getPackageId());
                ps.setInt(3, TypeFile.FILE_CLASS.index());
                try {
                    ps.setBlob(4, new ByteArrayInputStream(FileUtils.readFileToByteArray(file)));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }



    @Override
    public void applay_protocol_klacc(String packageID) {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcEgisso)
                .withProcedureName(SQL.SQL_PROC_APPLAY_PROTOCOL_CLASS)
                .useInParameterNames("FILE_GUID")
                .declareParameters(new SqlParameter("FILE_GUID", Types.NVARCHAR));
        MapSqlParameterSource paramMap = new MapSqlParameterSource()
                .addValue("FILE_GUID", packageID);
        jdbcCall.execute(paramMap);
    }

//    @Override
//    public void applay_protocol_klacc(String packageID) {
//        jdbcTemplate.query(SQL.SQL_PROC_APPLAY_PROTOCOL_CLASS
//                , new Object[]{packageID}
//                , new RowCallbackHandler() {
//                    @Override
//                    public void processRow(ResultSet rs) throws SQLException {
//
//                    }
//                });
//
//    }

    @Override
    public List<Method> fillMethods(Integer id_msz) {
        //способ получения c параметром
        List<Method> methodList = new ArrayList<>();
        jdbcEgisso.query(SQL.SQL_METHODS_KMSZ, new PreparedStatementSetter() {
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setInt(1, id_msz);
                    }
                }
                , new RowCallbackHandler() {
                    public void processRow(ResultSet method) throws SQLException {
                        methodList.add(new Method(method.getString("KODWay")));
                    }
                }
        );
        return methodList;
    }

    @Override
    public List<Integer> fillFormReq(Integer id_msz) {
        //формы обращения за получением ЛМСЗ
        List<Integer> formReqList = new ArrayList<>();
        jdbcEgisso.query(SQL.SQL_FORMREQ_KMSZ, new PreparedStatementSetter() {
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setInt(1, id_msz);
                    }
                }
                , new RowCallbackHandler() {
                    public void processRow(ResultSet fr) throws SQLException {
                        formReqList.add(fr.getInt("ID"));
                    }
                }
        );
        return formReqList;
    }

    @Override
    public List<Integer> fillFormRecieve(Integer id_msz) {
        //формы получения результата
        List<Integer> formRecieveList = new ArrayList<>();
        jdbcEgisso.query(SQL.SQL_FORMRECIEVE_KMSZ, new PreparedStatementSetter() {
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setInt(1, id_msz);
                    }
                }
                , new RowCallbackHandler() {
                    public void processRow(ResultSet fr) throws SQLException {
                        formRecieveList.add(fr.getInt("ID"));
                    }
                }
        );
        return formRecieveList;
    }

    @Override
    public List<DocTypesList> fillDocTypeList(Integer id_msz) {
        //перечень документов
        List<DocTypesList> docTypeList = new ArrayList<>();
        jdbcEgisso.query(SQL.SQL_DOCTYPELIST_KMSZ, new PreparedStatementSetter() {
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setInt(1, id_msz);
                    }
                }
                , new RowCallbackHandler() {
                    public void processRow(ResultSet docsType) throws SQLException {
                        docTypeList.add(new DocTypesList(
                                        docsType.getString("NameDoc"),
                                        docsType.getString("NameDocType"),
                                        docsType.getInt("Kol"),
                                        docsType.getBoolean("require"),
                                        docsType.getString("DocRemark")
                                )
                        );
                    }
                }
        );
        return docTypeList;
    }

    @Override
    public List<StepsForMSZ> fillStepsMSZ(Integer id_msz) {
        //перечень ШАГОВ
        List<StepsForMSZ> stepsForMSZS = new ArrayList<>();
        jdbcEgisso.query(SQL.SQL_StepsMsz_KMSZ, new PreparedStatementSetter() {
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setInt(1, id_msz);
                    }
                }
                , new RowCallbackHandler() {
                    public void processRow(ResultSet docsType) throws SQLException {
                        stepsForMSZS.add(new StepsForMSZ(
                                        docsType.getInt("NUM_STEP"),
                                        docsType.getString("stepH"),
                                        docsType.getString("RemarkStep")
                                )
                        );
                    }
                }
        );
        return stepsForMSZS;
    }

    @Override
    public Map<String, String> getNextGuid(int typePackage, Integer idExecuteJob) {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcEgisso)
                .withProcedureName(SQL.SQL_P_GET_Global_Package);

        MapSqlParameterSource paramMap = new MapSqlParameterSource()
                .addValue("idExecuteJob", idExecuteJob)
                .addValue("typePackage", typePackage);


        ArrayList arr = (ArrayList) jdbcCall.execute(paramMap).get("#result-set-1");
        Map resultMap = (Map) arr.get(0);
        Map<String, String> m2 = (Map) resultMap;
        return m2;
    }



}
