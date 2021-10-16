package smev.Egisso.Dao;


import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
import smev.Egisso.Enum.StatusPackageSmev;
import smev.SQL;
import smev.Egisso.Entity.PackageHistory;
import smev.Egisso.Enum.StatusPackage;
import smev.Egisso.Enum.TypePackage;
import smev.ElementServices.Egisso.ElementsKmsz.ClassificationKMSZ;
import smev.ElementServices.Egisso.ElementsKmsz.LocalMSZ;
import smev.Egisso.Elements.ElementsNazn.*;
import smev.Egisso.Elements.ElementsProtocol.RecordResult;

import javax.annotation.PostConstruct;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.*;

@Repository
@Log4j2
public class NaznDaoImpl implements NaznDao {


    @Autowired
    @Qualifier("jdbcEgisso")
    private JdbcTemplate jdbcEgisso;

    @PostConstruct
    public void init() {
        jdbcEgisso.setResultsMapCaseInsensitive(true);
    }

    @Override
    public String getFactPackageNoSend() {
        List<String> str = jdbcEgisso.queryForList(SQL.SQL_PackageFactNoSend
                , String.class);
        if (str.isEmpty()) {
            return null;
            //throw new NaznServiceException(ErrorMessages.ERROR_SQL_Empty_Fact.getErrorMessage());
        } else
            return str.get(0);


        //packageFACT = jdbcEgisso.queryForObject(sql, BeanPropertyRowMapper.newInstance(PackageFACT.class)) == null ? null : null;
//        String packageFACT = jdbcEgisso.queryForObject(SQL.SQL_PackageFactNoSend, BeanPropertyRowMapper.newInstance(PackageFACT.class));
//        return packageFACT;
    }

    @Override
    public List<PrsnInfo> fill_reason_persons(String idGlobalPackageFact, String factId) {
        List<PrsnInfo> prsnInfoList = new ArrayList<>();
        jdbcEgisso.query(SQL.SQL_REASON_PERSON
                , new PreparedStatementSetter() {
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setString(1, idGlobalPackageFact);
                        preparedStatement.setString(2, factId);
                    }
                }
                , new RowCallbackHandler() {
                    public void processRow(ResultSet PERSONS) throws SQLException {
                        prsnInfoList.add(new PrsnInfo(
                                PERSONS.getString("FACT_GUID"),
                                PERSONS.getString("SNILS"),
                                PERSONS.getString("FamilyName"),
                                PERSONS.getString("FirstName"),
                                PERSONS.getString("Patronymic").equals("") ? null : PERSONS.getString("Patronymic"),
                                PERSONS.getString("Gender"),
                                new SimpleDateFormat("yyyy-MM-dd").format(PERSONS.getDate("BirthDate"))
                        ));
                    }
                }
        );
        return prsnInfoList;
    }

    @Override
    public List<Fact> factList(String packageId) {
        log.info("Выборка фактов для формирования файлов назначений");
        List<Fact> list = new ArrayList<>();
        jdbcEgisso.query(SQL.SQL_SELECT_FROM_NAZN, new PreparedStatementSetter() {
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setString(1, packageId);
                    }
                }
                , new RowCallbackHandler() {
                    public void processRow(ResultSet rs) throws SQLException {
                        Fact fact = Fact.builder()
                                .ID(rs.getString("FACT_GUID"))
                                .OSZCode(rs.getString("OSZCODE"))
                                .LMSZID(rs.getString("GUID_LOCAL_MSZ"))
                                .categoryID(rs.getString("GUID_LOCAL_CATEG"))
                                .decision_date(rs.getDate("DECISION_DATE") == null ? null : new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("DECISION_DATE")))
                                .dateStart(rs.getDate("DATESTART") == null ? null : new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("DATESTART")))
                                .dateFinish(rs.getDate("DATEFINISH") == null ? null : new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("DATEFINISH")))
                                .needsCriteria(NeedsCriteria.builder()
                                        .usingSign(rs.getString("USINGSIGN"))
                                        .build())
                                .msz_receiver(MSZ_receiver.builder()
                                        .FamilyName(rs.getString("FAMILYNAME"))
                                        .FirstName(rs.getString("FIRSTNAME"))
                                        .Patronymic(rs.getString("PATRONYMIC").equals("") ? null : rs.getString("PATRONYMIC"))
                                        .SNILS(rs.getString("SNILS"))
                                        .Gender(rs.getString("GENDER"))
                                        .BirthDate(new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("BIRTHDATE")))
                                        .build())
                                .localMSZ(LocalMSZ.builder()
                                        .classificationKMSZ(ClassificationKMSZ.builder()
                                                .codeProvisionForm(rs.getString("FORM_MSZ")).build()).build()
                                )
                                .lastChanging(new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + "T" + new SimpleDateFormat("hh:mm:ss").format(new Date()) + "+03:00")
                                .build();

                        setFormMsz(fact, rs.getString("AMOUNT"), rs.getString("EQUIVALENTAMOUNT"));

                        list.add(fact);
                    }
                }
        );
        return list;
    }

//    private void setPersons(Fact fact) {
//        List<PrsnInfo> prsnInfoList = new ArrayList<>();
//        prsnInfoList = fill_reason_persons(fact.getID());
//        if (prsnInfoList.size() != 0) {
//            fact.setPrsnInfoList(prsnInfoList);
//        }
//    }

    private void setFormMsz(Fact fact, String amount, String equivalentamount) {
        switch (fact.getLocalMSZ().getClassificationKMSZ().getCodeProvisionForm()) {
            case "01":
                List<Monetary_form> monetaryformList = new ArrayList<>();
                Monetary_form monetary_form = new Monetary_form();
                monetary_form.setAmount(amount.replace(",", "."));
                monetaryformList.add(monetary_form);
                fact.setMonetary_form(monetaryformList);
                break;
            case "03": {
                List<ExemptionForm> exemptionFormList = new ArrayList<>();
                ExemptionForm exemptionForm = new ExemptionForm();
                exemptionForm.setMeasuryCode("03");
                exemptionForm.setMonetization(false);
                exemptionForm.setAmount(amount.replace(",", "."));
                exemptionForm.setEquivalentAmount(equivalentamount.replace(",", "."));
                exemptionFormList.add(exemptionForm);
                fact.setExemptionForms(exemptionFormList);
                break;
            }
            case "04":
                List<ServiceForm> serviceFormList = new ArrayList<>();
                ServiceForm serviceForm = new ServiceForm();
                serviceForm.setMeasuryCode("03");
                serviceForm.setAmount(amount.replace(",", "."));
                serviceForm.setEquivalentAmount(equivalentamount.replace(",", "."));
                serviceFormList.add(serviceForm);
                fact.setServiceForms(serviceFormList);
                break;
        }
    }

    @Override
    public void spfillTempNazn(String idGlobalPackageFact) throws DataAccessException {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcEgisso)
                .withProcedureName(SQL.SQL_spFill)
                .useInParameterNames("PACKAGE_ASSIG_GUID")
                .useInParameterNames("strBase")
                .useInParameterNames("strID_REGION")
                .useInParameterNames("DATE_PAY")
                .declareParameters(new SqlParameter("PACKAGE_ASSIG_GUID", Types.VARCHAR))
                .declareParameters(new SqlParameter("strBase", Types.VARCHAR))
                .declareParameters(new SqlParameter("strID_REGION", Types.VARCHAR))
                .declareParameters(new SqlParameter("DATE_PAY", Types.DATE));

        MapSqlParameterSource paramMap = new MapSqlParameterSource()
                .addValue("PACKAGE_ASSIG_GUID", idGlobalPackageFact)
                .addValue("strBase", "0")
                .addValue("strID_REGION", "0")
                .addValue("DATE_PAY", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));

        jdbcCall.execute(paramMap);
    }

    @Override
    public void exec_spFillNazn(String PackageId) {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcEgisso)
                .withProcedureName(SQL.SQL_spFill_NAZN)
                .useInParameterNames("strBase")
                .useInParameterNames("strID_REGION")
                .useInParameterNames("PACKAGE_ASSIG_GUID");
        MapSqlParameterSource paramMap = new MapSqlParameterSource()
                .addValue("strBase", "0")
                .addValue("strID_REGION", "0")
                .addValue("PACKAGE_ASSIG_GUID", PackageId);
//        Map map = (Map) arr.get(0);
        //jdbcCall.execute(paramMap).get("#result-set-1");
        jdbcCall.execute(paramMap);
//        try {
//            Connection con;
//            con = Objects.requireNonNull(jdbcEgisso.getDataSource()).getConnection();
//            if (con != null) {
//                con.commit();
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void spFillTempReasonPersons(String PackageId) {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcEgisso)
                .withProcedureName(SQL.SQL_spFill_Temp_REASON_PERSONS)
                .useInParameterNames("PACKAGE_ASSIG_GUID");
        MapSqlParameterSource paramMap = new MapSqlParameterSource()
                .addValue("PACKAGE_ASSIG_GUID", PackageId);
        jdbcCall.execute(paramMap);
    }


    @Override
    public List<Map<String, Object>> mapNazn(String PAC_GUID) {
        List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
        log.info("Наполнение массива rows назначений");
        jdbcEgisso.query(SQL.SQL_SELECT_FROM_NAZN,
                new PreparedStatementSetter() {
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setString(1, PAC_GUID);
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

//    @Override
//    public void SaveFileXmlToBase(NaznMetaData naznMetaData) {
//        for (int i = 0; i < naznMetaData.getListFileNazn().size(); i++) {
//            int finalI = i;
//            jdbcEgisso.update(SQL.SQL_INSERT_FILE_ASSIGN, new PreparedStatementSetter() {
//                @Override
//                public void setValues(PreparedStatement ps) throws SQLException {
//                    try {
//                        ps.setString(1, naznMetaData.getPackageGlobalFact().getIdGlobalPackageFact());
//                        ps.setString(3, naznMetaData.getListFileNazn().get(finalI).getFileID());
//                        ps.setString(2, naznMetaData.getListFileNazn().get(finalI).getFileName());
//
//                        ps.setInt(4, naznMetaData.getListFileNazn().get(finalI).getTypePackage());
//                        ps.setBlob(5, new ByteArrayInputStream(FileUtils.readFileToByteArray(naznMetaData.getListFileNazn().get(finalI).getFile())));
//                    } catch (IOException e) {
//                        throw new NaznServiceException(ErrorMessages.ERROR_SET_PARAM_SQL_INSERT_FILE_ASSIGN.getErrorMessage(), e);
//                    }
//                }
//            });
//        }
//    }

    @Override
    public void insertPackageFact(NaznMetaData naznMetaData) {
        log.info("Вставка в PACKAGE_HISTORY, FILES_PACKAGE и " + "Обновление глобального пакета " + naznMetaData.getPackageGlobalFact().getIdGlobalPackageFact() + " что он сформирован польностью успешно.");
        for (int i = 0; i < naznMetaData.getListFileNazn().size(); i++) {
            int finalI = i;

            jdbcEgisso.update(SQL.SQL_INSERT_PACKAGE_HISTORY, new PreparedStatementSetter() {
                @Override
                public void setValues(PreparedStatement ps) throws SQLException {
                    ps.setString(1, naznMetaData.getListFileNazn().get(finalI).getFileID());
                    ps.setString(2, naznMetaData.getListFileNazn().get(finalI).getFileName());
                    ps.setInt(3, TypePackage.PACKAGE_FACT.index());
                    ps.setInt(4, StatusPackage.CREATED.index());//сформирован
                }
            });


            jdbcEgisso.update(SQL.SQL_INSERT_FILES_PACKAGE, new PreparedStatementSetter() {
                @Override
                public void setValues(PreparedStatement ps) throws SQLException {
                    ps.setString(1, naznMetaData.getPackageGlobalFact().getIdGlobalPackageFact());
                    ps.setString(2, naznMetaData.getListFileNazn().get(finalI).getFileID());
                    /*1 - назначения, 2 - прекращения*/
                    ps.setInt(3, naznMetaData.getListFileNazn().get(finalI).getTypeFile().index());
                    ps.setObject(4, null);
                }
            });
        }
    }

    @Override
    public void setStatusGlobalPackage(String idGlobalPackage, Integer status) {
        jdbcEgisso.update(SQL.SQL_UPDATE_GLOBAL_PACKEAGE, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                ps.setInt(1, status);
                ps.setString(2, idGlobalPackage);
            }
        });
    }

    @Override
    public void spFillTempAsign(String idGlobalPackageFact) {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcEgisso)
                .withProcedureName(SQL.SQL_P_FILL_tempASIGN)
                .useInParameterNames("strBase")
                .useInParameterNames("strID_REGION")
                .useInParameterNames("PACKAGE_ASSIG_GUID");
        MapSqlParameterSource paramMap = new MapSqlParameterSource()
                .addValue("strBase", "0")
                .addValue("strID_REGION", "0")
                .addValue("PACKAGE_ASSIG_GUID", idGlobalPackageFact);
        jdbcCall.execute(paramMap);
    }

    @Override
    public NaznMetaData.PackageGlobleFact getGlobalPackage(TypePackage typePackage, Integer idExecuteJob) {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcEgisso)
                .withProcedureName(SQL.SQL_P_GET_Global_Package);

        MapSqlParameterSource paramMap = new MapSqlParameterSource()
                .addValue("idExecuteJob", idExecuteJob)
                .addValue("typePackage", typePackage.index());


        ArrayList arr = (ArrayList) jdbcCall.execute(paramMap).get("#result-set-1");
        if (arr.size() > 0) {
            Map map = (Map) arr.get(0);
            return new NaznMetaData.PackageGlobleFact(map.get("packageIDGlobal").toString(), (Short) map.get("statusPackage"));
        }
        return null;
    }





    @Override
    public int getNotSendKMSZ() {
        RowCountCallbackHandler countCallback = new RowCountCallbackHandler();
        jdbcEgisso.query(SQL.SQL_PackageKmszNoSend
                , countCallback
        );
        return countCallback.getRowCount();
    }


    //    private RowCountCallbackHandler getCountKmszForChange(String ERROR_SQL_LIST_KMSZ_FOR_CHANGE) {
//        RowCountCallbackHandler countCallback = new RowCountCallbackHandler();
//        jdbcEgisso.query(ERROR_SQL_LIST_KMSZ_FOR_CHANGE
//                , new Object[]{1},
//                countCallback
//        );
//        return countCallback;
//    }

    @Override
    public void writeProtocol(RecordResult rec, String idFileProtocol) {
//        jdbcEgisso.update(SQL.SQL_INSERT_PROTOCOL,
//                rec.getRecID()
//                , rec.isRecordOK()
//                , rec.getMessages().getRuleCode().toString()
//                , rec.getMessages().getMessageType()
//                , rec.getMessages().getReport()
//                , null//getPackageFactNoSend().getPackageId()
//                , idFileProtocol
//        );
    }




    @Override
    public int applayProtocolFact(String idGlobalPackage) {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcEgisso)
                .withProcedureName(SQL.SQL_APPALY_PROTOCOL_FACT)
                .useInParameterNames("IdPackageGlobal")
                .declareParameters(new SqlParameter("IdPackageGlobal", Types.VARCHAR));

        MapSqlParameterSource paramMap = new MapSqlParameterSource()
                .addValue("IdPackageGlobal", idGlobalPackage);

        ArrayList arr = (ArrayList) jdbcCall.execute(paramMap).get("#result-set-1");
        if (arr.size() > 0) {
            Map map = (Map) arr.get(0);
            return (Integer) map.get("KolRecProtocol");
        }
        return 0;
    }

//    @Override
//    public List<String> listFilePackage() {
//        List<String> list = new ArrayList<>();
//        jdbcEgisso.query(SQL.SQL_LIST_FILE_GUID
//           LIST_FILE_ASSIGNMENT     , new RowCallbackHandler() {
//                    public void processRow(ResultSet rs) throws SQLException {
//                        list.add(rs.getString("FILE_GUID"));
//                    }
//                }
//        );
//        return list;
//    }

    @Override
    public int getPackageByNotLOAD_PROTOCOL(String idGlobalPackage) {
        RowCountCallbackHandler countCallback = new RowCountCallbackHandler();
        jdbcEgisso.query(SQL.SQL_CountNoSendPackageFact
                , new Object[]{idGlobalPackage, StatusPackage.LOAD_PROTOCOL.index()},
                countCallback
        );
        return countCallback.getRowCount();

    }

    @Override
    public int findGuidInTable(String guidFile) {
        RowCountCallbackHandler countCallback = new RowCountCallbackHandler();
        jdbcEgisso.query(SQL.SQL_findGuidInTable
                , new Object[]{guidFile},
                countCallback
        );

        return countCallback.getRowCount();
    }

    @Override
    public List<Termination> termList(String idGlobalPackageFact) {
        log.info("Выборка приостановок для формирования файлов прекращений");
        List<Termination> list = new ArrayList<>();
        jdbcEgisso.query(SQL.SQL_P_SELECT_FROM_TERMINATE,
                new PreparedStatementSetter() {
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setString(1, idGlobalPackageFact);
                        //preparedStatement.setFetchSize(3);
                    }
                }
                , new RowCallbackHandler() {
                    public void processRow(ResultSet rs) throws SQLException {
                        list.add(Termination.builder()
                                .ID(rs.getString("TERMINATE_GUID"))
                                .assignmentFactID(rs.getString("FACT_GUID_OLD"))
                                .dateFinish(rs.getDate("DATE_TERMG") == null ? null : new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate("DATE_TERMG")))
                                .lastChanging(new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + "T" + new SimpleDateFormat("hh:mm:ss").format(new Date()) + "+03:00")
                                .build());
                    }
                }
        );
        return list;
    }


    @Override
    public int countNoSendPackage() {
        RowCountCallbackHandler countCallback = new RowCountCallbackHandler();
        jdbcEgisso.query(SQL.SQL_CountNoSendPackage
                , countCallback
        );
        return countCallback.getRowCount();

    }

    //    вставка записей пакетом размером с массив
//        public void insertBatchAll(Response res) {
//        List<RecordResult> list = new ArrayList<>();
//        list = res.getProtocol().getPackageResult().getErrorRecords().getRecordResult();
//        String packageId = getPackageFactNoSend().getPackageId();
//        final List<RecordResult> finalList = list;
//
//        jdbcEgisso.batchUpdate(ERROR_SQL_INSERT_PROTOCOL, new BatchPreparedStatementSetter() {
//            @Override
//            public void setValues(PreparedStatement ps, int i) throws SQLException {
//                RecordResult customer = finalList.get(i);
//
//                ps.setString(1, customer.getRecID());
//                ps.setBoolean(2, customer.isRecordOK());
//                ps.setString(3, customer.getMessages() == null ? "" : customer.getMessages().getRuleCode().toString());
//                ps.setString(4, customer.getMessages() == null ? "" : customer.getMessages().getMessageType().toString());
//                ps.setString(5, customer.getMessages() == null ? "" : customer.getMessages().getReport());
//                ps.setString(6, packageId);
//                ps.setString(7, res.getProtocol().getPackageResult().getPackageID());
//            }
//
//            @Override
//            public int getBatchSize() {
//                return finalList.size();
//            }
//        });
//    }


}
