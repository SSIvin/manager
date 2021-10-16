package smev.Egisso.Service.Impl;


import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.Egisso.Enum.StatusPackage;
import smev.Egisso.Enum.TypePackage;
import smev.Egisso.Service.KmszService;
import smev.Egisso.Service.NaznService;
import smev.Egisso.util.MyUtils;
import smev.Egisso.Dao.KmszDao;
import smev.Egisso.exceptions.ErrorMessages;
import smev.Egisso.exceptions.KmszServiceException;
import smev.ElementServices.Egisso.ElementsKmsz.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Service
@Log4j2
@Transactional(value = "jdbcEgissoTransactionManager",  propagation = Propagation.SUPPORTS)
public class KmszServiceImpl implements KmszService {

    private static String path_copy;

    @Value("${egisso.smb.useSMB}")
    private boolean useSMB;

    @Value("${egisso.pathProtocol}")
    private String pathProtocol;

    @Value("${egisso.path_for_Load}")
    private String pathForLoad;

    @Value("${egisso.path_for_Load_SIGN}")
    private String pathLoadSign;

    @Value("${egisso.formatNameFileKmsz}")
    private String formatNameFileKmsz;

    @Value("${egisso.path_copy}")
    public void setPath_copy(String path_copy) {
        this.path_copy = path_copy;
    }

    @Autowired
    KmszService kmszService;

    @Autowired
    private NaznService naznService;

    @Autowired
    private KmszDao kmszDao;

    private static String packageID;

    @Override
    public int getCountKmszForChange() {
        try {
            return kmszDao.getCountKmszForChange();
        } catch (DataAccessException e) {
            throw new KmszServiceException(ErrorMessages.ERROR_SQL_LIST_KMSZ_FOR_CHANGE.getErrorMessage(), e);
        }
    }

    @Override
    public PackageKMSZ getKmszNoSend() {
        PackageKMSZ kmszNoSend = null;
        try {
            kmszNoSend = kmszDao.getKmszNoSend();
        } catch (EmptyResultDataAccessException e) {

        }

        return kmszNoSend;
    }

    @Override
    //@Transactional(value = "jdbcEgissoTransactionManager", propagation = Propagation.REQUIRES_NEW)
    public Map<String, String> getPackageID(TypePackage typePackage, Integer idExecuteJob) {
        try {
            return kmszDao.getPackageID(typePackage, idExecuteJob);
        } catch (DataAccessException e) {
            throw new KmszServiceException(ErrorMessages.ERROR_SQL_PROC_GET_NEW_PACKAGE_GUID.getErrorMessage(), e);
        }
    }

    @Override
    public void updateGuid() {
        try {
            kmszDao.updateGuid();
        } catch (DataAccessException e) {
            throw new KmszServiceException(ErrorMessages.ERROR_SQL_PROC_UPDATE_GUID.getErrorMessage(), e);
        }
    }

    @Override
    public List<NPA> fillNpa(int ID_MSZ) {
        try {
            List<NPA> npaList = kmszDao.fillNpa(ID_MSZ);
            if (npaList.size() == 0)
                throw new KmszServiceException(ErrorMessages.Empty_Array_Npa.getErrorMessage() + ",Мера: ID_MSZ = " + ID_MSZ);
            return npaList;
        } catch (DataAccessException e) {
            throw new KmszServiceException(ErrorMessages.ERROR_EXEC_SQL_NPA_KMSZ.getErrorMessage(), e);
        }
    }

    @Override
    public String getLastGuidKmsz(int ID_MSZ) {
        try {
            String lastGuidKmsz = kmszDao.getLastGuidKmsz(ID_MSZ);
            if (lastGuidKmsz.equals(""))
                throw new KmszServiceException(ErrorMessages.Empty_last_guid_msz.getErrorMessage() + ",Мера: ID_MSZ = " + ID_MSZ);
            return lastGuidKmsz;
        } catch (DataAccessException e) {
            throw new KmszServiceException(ErrorMessages.ERROR_SQL_GET_LAST_GUID_KMSZ.getErrorMessage(), e);
        }
    }

    @Override
    public List<Map<String, Object>> getMszForChange() {
        try {
            return kmszDao.getMszForChange();
        } catch (DataAccessException e) {
            throw new KmszServiceException(ErrorMessages.ERROR_SQL_LIST_KMSZ_FOR_CHANGE.getErrorMessage(), e);
        }
    }

    @Override
    public List<LocalCategory> fillCateg(int ID_MSZ) {
        try {
            List<LocalCategory> categoryList = kmszDao.fillCateg(ID_MSZ);
            if (categoryList.size() == 0)
                throw new KmszServiceException(ErrorMessages.Empty_Array_Category.getErrorMessage() + ",Мера: ID_MSZ = " + ID_MSZ);
            return categoryList;
        } catch (DataAccessException e) {
            throw new KmszServiceException(ErrorMessages.ERROR_SQL_CATEG_KMSZ.getErrorMessage(), e);
        }
    }

    @Override
    public void insertPackageKmsz(File file, Request req) {
        try {
            kmszDao.insertPackageKmsz(file, req);
        } catch (DataAccessException e) {
            throw new KmszServiceException(ErrorMessages.ERROR_SQL_INSERT_FILE_KMSZ.getErrorMessage(), e);
        }
    }

    @Override
    public void applay_protocol_klacc(String packageID) {
        kmszDao.applay_protocol_klacc(packageID);
    }

    @Override
    public List<Method> fillMethods(Integer id_msz) {
        try {
            List<Method> methods = kmszDao.fillMethods(id_msz);
            if (methods.size() == 0)
                throw new KmszServiceException(ErrorMessages.Empty_Array_methods.getErrorMessage() + ",Мера: ID_MSZ = " + id_msz);
            return methods;
        } catch (DataAccessException e) {
            throw new KmszServiceException(ErrorMessages.ERROR_EXEC_SQL_METHODS_KMSZ.getErrorMessage(), e);
        }
    }

    @Override
    public List<Integer> fillFormReq(Integer id_msz) {
        try {
            List<Integer> formReq = kmszDao.fillFormReq(id_msz);
            if (formReq.size() == 0)
                throw new KmszServiceException(ErrorMessages.Empty_Array_FormReq.getErrorMessage() + ",Мера: ID_MSZ = " + id_msz);
            return formReq;
        } catch (DataAccessException e) {
            throw new KmszServiceException(ErrorMessages.ERROR_EXEC_SQL_FORMREQ_KMSZ.getErrorMessage(), e);
        }
    }

    @Override
    public List<Integer> fillFormRecieve(Integer id_msz) {
        try {
            List<Integer> formRecieve = kmszDao.fillFormRecieve(id_msz);
            if (formRecieve.size() == 0)
                throw new KmszServiceException(ErrorMessages.Empty_Array_FormRecieve.getErrorMessage() + ",Мера: ID_MSZ = " + id_msz);
            return formRecieve;
        } catch (DataAccessException e) {
            throw new KmszServiceException(ErrorMessages.ERROR_EXEC_SQL_FORMRECIEVE_KMSZ.getErrorMessage(), e);
        }
    }

    @Override
    public List<DocTypesList> fillDocTypeList(Integer id_msz) {
        try {
            List<DocTypesList> docTypeList = kmszDao.fillDocTypeList(id_msz);
            if (docTypeList.size() == 0)
                throw new KmszServiceException(ErrorMessages.Empty_Array_Doc_type_list.getErrorMessage() + ",Мера: ID_MSZ = " + id_msz);
            return docTypeList;
        } catch (DataAccessException e) {
            throw new KmszServiceException(ErrorMessages.ERROR_EXEC_SQL_DOCTYPELIST_KMSZ.getErrorMessage(), e);
        }
    }

    @Override
    public List<StepsForMSZ> fillStepsMSZ(Integer id_msz) {
        try {
            List<StepsForMSZ> stepsForMSZS = kmszDao.fillStepsMSZ(id_msz);
            if (stepsForMSZS.size() == 0)
                throw new KmszServiceException(ErrorMessages.Empty_Array_stepsMSZ.getErrorMessage() + ",Мера: ID_MSZ = " + id_msz);
            return stepsForMSZS;
        } catch (DataAccessException e) {
            throw new KmszServiceException(ErrorMessages.ERROR_EXEC_SQL_STEPS_MSZ_KMSZ.getErrorMessage(), e);
        }
    }

    //@Transactional(value = "jdbcEgissoTransactionManager", propagation = Propagation.REQUIRES_NEW)
    public void Create_Kmsz_data(Map<String, String> map_k) throws KmszServiceException {

        //        List<Integer> tt = jdbcTemplate.query(ERROR_SQL_LIST_KMSZ_FOR_CHANGE
//                , new Object[]{1}, new RowMapper<Integer>() {
//                    @Override
//                    public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
//                        log.info(rs);
//                        ResultSetMetaData metaData = rs.getMetaData();
////Подсчет кол-ва записей
//                        int rec = metaData.getColumnCount();
//                        //int rec = CATEG.last() ? CATEG.getRowTest() : 0;
//                        return rec;
//                    }
//                }
//        );
        log.info("Начало формирования классификатора...");
        if (naznService.getNotSendKMSZ() != 0) {
            throw new KmszServiceException(ErrorMessages.KMSZ_NO_START.getErrorMessage());
        }
        if (kmszService.getCountKmszForChange() == 0) {
            throw new KmszServiceException(ErrorMessages.NOT_KMSZ_CHANGE.getErrorMessage());
//            log.info(InfoMessages.NOT_KMSZ_CHANGE.getErrorMessage());
//            return;
        }

        MyUtils.clearDir(pathForLoad);

        Request req = new Request();
        List<LocalMSZ> listLocalMSZ = new ArrayList<>();
        kmszService.updateGuid();

        String id = String.valueOf(map_k.get("ID"));
        PackageKMSZ aPackage = new PackageKMSZ(map_k.get("PACKAGEIDGLOBAL"));
        req.setAPackage(aPackage);
        req.getAPackage().setFILE_NAME(formatNameFileKmsz + id + ".xml");


        List<Map<String, Object>> mapCopy = kmszService.getMszForChange();
        for (Map<String, Object> row : mapCopy) {

            List<NPA> listNpa = new ArrayList<>();
            List<LocalCategory> listCategory = new ArrayList<>();
            List<FundingSource> fundingSources = new ArrayList<>();

            ClassificationKMSZ kmsz = new ClassificationKMSZ();

            fillKmsz(row, kmsz);
            listNpa = kmszService.fillNpa((Integer) row.get("ID_MSZ"));

            LocalMSZ msz = null;
            msz = fillLocalMSZ(row);

            fillSourceFin(row, fundingSources);
            listCategory = kmszService.fillCateg((Integer) row.get("ID_MSZ"));

            msz.setMethods(kmszService.fillMethods((Integer) row.get("ID_MSZ")));
            msz.setFormReq(kmszService.fillFormReq((Integer) row.get("ID_MSZ")));
            msz.setFormRecieve(kmszService.fillFormRecieve((Integer) row.get("ID_MSZ")));
            msz.setStepsForMSZ(kmszService.fillStepsMSZ((Integer) row.get("ID_MSZ")));

            msz.setDocTypesList(kmszService.fillDocTypeList((Integer) row.get("ID_MSZ")));


            msz.setClassificationKMSZ(kmsz);
            msz.setTerritories(getTerritories());
            msz.setNpaList(listNpa);

            kmsz.setLocalCategory(listCategory);
            kmsz.setFundingSources(fundingSources);
            listLocalMSZ.add(msz);
        }
        aPackage.setLocalMSZ(listLocalMSZ);


        kmszService.insertPackageKmsz(marshalingExample(req), req);
        naznService.setStatusGlobalPackage(aPackage.getPackageId(), StatusPackage.CREATED.index());

        log.info("Файл классификатора сформирован: " + req.getAPackage().getFILE_NAME());


        //        try {
//
//        } catch (Exception e) {
//            File file = new File(pathForLoad + req.getFileName());
//            if (file.exists()) {
//                file.delete();
//            }
//            throw new KmszServiceException(ErrorMessages.ERROR_CREATE_KMSZ.getErrorMessage(), e);
//        }


    }


    public void Create_Kmsz(Integer idExecuteJob) throws KmszServiceException {
        Map<String, String> map_k = kmszService.getPackageID(TypePackage.PACKAGE_KMSZ, idExecuteJob);
        Create_Kmsz_data(map_k);
        MyUtils.CreateSignFile(TypePackage.PACKAGE_KMSZ);
//        String dirToCopy = MyUtils.createDirToday();
//        MyUtils.copyDir(pathForLoad, dirToCopy);
//
//        if (useSMB) {
//            MyUtils.clearSmbDir();
//            MyUtils.copyToSmb();
//            MyUtils.sleepms((long) 30000);
//            MyUtils.copyFromSmb(dirToCopy);
//        }
    }

    private File marshalingExample(Request req) {
        File fileXml = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Request.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            fileXml = new File(pathForLoad + req.getAPackage().getFILE_NAME());
            jaxbMarshaller.marshal(req, fileXml);
        } catch (Exception e) {
            throw new KmszServiceException(ErrorMessages.ERROR_MARSHLING_KMSZ.getErrorMessage(), e);
        }
        return fileXml;
    }


//
//    @Scheduled(initialDelayString = "${scheduler.delay}", fixedDelayString = "${scheduler.delay}")
//    public void RunProc() {
//        Run runReceive = new Run();
//        runReceive.ShowMessage();
//    }

//    private void updateGuid(String ERROR_SQL_PROC_UPDATE_GUID) {
//        StoredProcedure procedure = new GenericStoredProcedure();
//        procedure.setSql(ERROR_SQL_PROC_UPDATE_GUID);
//        procedure.setJdbcTemplate(jdbcTemplate);
//        procedure.execute();
//    }

//    private RowCountCallbackHandler getCountKmszForChange(String ERROR_SQL_LIST_KMSZ_FOR_CHANGE) {
//        RowCountCallbackHandler countCallback = new RowCountCallbackHandler();
//        jdbcTemplate.query(ERROR_SQL_LIST_KMSZ_FOR_CHANGE
//                , new Object[]{1},
//                countCallback
//        );
//        return countCallback;
//    }

//    private String getPackageID(String ERROR_SQL_PROC_GET_NEW_PACKAGE_GUID) {
//        StoredProcedure procedure = new GenericStoredProcedure();
//        procedure.setSql(ERROR_SQL_PROC_GET_NEW_PACKAGE_GUID);
//        procedure.setJdbcTemplate(jdbcTemplate);
//        Map<String, Object> result = procedure.execute();
//
//        ArrayList arrayList = new ArrayList();
//        arrayList = (ArrayList) result.get("#result-set-1");
//        Map resultMap = (Map) arrayList.get(0);
//
//        return resultMap.get("packageID").toString();
//        //log.info("Account Number: " + resultMap.get("packageID"));
//
////или
////        for (Map.Entry<String, Object> entry : result.entrySet()) {
////            log.info(entry.getKey() + ":" + entry.getValue().toString());
////        }
////или
////        ObjectMapper objectMapper = new ObjectMapper();
////        List<Foo> list = objectMapper.convertValue(execute.get("#result-set-1"), new TypeReference<List<Foo>>() {});
//
//
//    }
//

    private void fillSourceFin(Map<String, Object> row, List<FundingSource> fundingSources) {
        if (row.get("SOURCE_FIN").toString().equals("0110")) {
            fundingSources.add(new FundingSource("0100", row.get("QUTA").toString()));
            fundingSources.add(new FundingSource("0010", row.get("QUTA2").toString()));
        } else {
            fundingSources.add(new FundingSource(row.get("SOURCE_FIN").toString(), row.get("QUTA").toString()));
        }
    }

    private void fillKmsz(Map<String, Object> row, ClassificationKMSZ kmsz) {
        //ClassificationKMSZ
        kmsz.setCodePartKMSZ(row.get("KOD_RUBRIK").toString());
        kmsz.setCodeMSZ(row.get("KODE_MSZ").toString());
        kmsz.setCodeProvisionForm(row.get("FORM_MSZ").toString());
        kmsz.setCodeLevelNPA(row.get("LEVEL_NPA").toString());
    }

    private LocalMSZ fillLocalMSZ(Map<String, Object> row) {
        return new LocalMSZ(row.get("GUID_LOCAL_MSZ").toString(),
                row.get("KODE_MSZ").toString(),
                row.get("NAMEPAYFULL").toString()
                , row.get("DATE_ENACT") == null ? null : new SimpleDateFormat("yyyy-MM-dd").format(row.get("DATE_ENACT"))
                , row.get("DATE_END") == null ? null : new SimpleDateFormat("yyyy-MM-dd").format(row.get("DATE_END"))
                , row.get("PERIODICITY_CODE").toString()
                , row.get("KBK_CODE").toString()
                , row.get("CASES").toString()
                , row.get("CONDITIONS").toString()
                , row.get("ESTIMATION").toString()
                , new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + "T" + new SimpleDateFormat("hh:mm:ss").format(new Date()) + "+03:00"
                , getPreviousID(row));
    }

    private String getPreviousID(Map<String, Object> row) {
        if (!Boolean.valueOf(row.get("ISNEW").toString())) {
            if (row.get("PREVIOUSID") == null) {
                throw new KmszServiceException(ErrorMessages.Empty_last_guid_msz.getErrorMessage() + ",Мера: ID_MSZ = " + row.get("ID_MSZ"));
            }
            return row.get("PREVIOUSID").toString();
        } else {
            return null;
        }
        //return !Boolean.valueOf(row.get("ISNEW").toString()) ? row.get("PREVIOUSID").toString() : null;
    }

    private Territories getTerritories() {
        Territories territories = new Territories();
        territories.setCodeOKTMO("18000000");
        return territories;
    }

}
