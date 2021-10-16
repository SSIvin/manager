package smev.Egisso.Service.Impl;

import lombok.extern.log4j.Log4j2;
import org.jetbrains.annotations.NotNull;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.Egisso.Dao.EgissoDao;
import smev.Egisso.Dao.NaznDao;
import smev.Egisso.Elements.ElementsNazn.*;
import smev.Egisso.Elements.ElementsProtocol.RecordResult;
import smev.Egisso.Enum.StatusPackage;
import smev.Egisso.Enum.TypeFile;
import smev.Egisso.Enum.TypePackage;
import smev.Egisso.Service.NaznService;
import smev.Egisso.exceptions.ErrorMessages;
import smev.Egisso.exceptions.NaznServiceException;
import smev.Egisso.util.MyUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Log4j2
@Transactional(value = "jdbcEgissoTransactionManager", propagation = Propagation.SUPPORTS)
public class NaznServiceImpl implements NaznService {

    private static String path_copy;
    private static String pathForLoadSIGN;

    @Autowired
    private NaznDao naznDao;

    @Autowired
    private NaznService naznService;

    @Autowired
    private EgissoDao egissoDao;

    @Value("${spring.profiles.active}")
    public String profileActive;


    @Value("${egisso.formatNameFileFact}")
    private String formatNameFileFact;

    @Value("${egisso.maxRecordNaznWithOutFamily}")
    private Integer maxRecordNaznWithOutFamily;

    @Value("${egisso.maxRecordNaznWithFamily}")
    private Integer maxRecordNaznWithFamily;


    @Value("${egisso.maxRecordTerm}")
    private Integer maxRecordTerm;

    @Value("${egisso.path_for_Load}")
    private String pathForLoad;

    @Value("${egisso.path_copy}")
    public void setPath_copy(String path_copy) {
        this.path_copy = path_copy;
    }

    @Value("${egisso.path_for_Load_SIGN}")
    public void setPathForLoadKmszSIGN(String pathForLoadKmszSIGN) {
        this.pathForLoadSIGN = pathForLoadKmszSIGN;
    }


    private int numFile;

    @Override
    public String getPackageFactNoSend() {
        return naznDao.getFactPackageNoSend();
    }

    @Override
    // @Transactional(value = "jdbcEgissoTransactionManager", propagation = Propagation.SUPPORTS)
    public List<PrsnInfo> fill_reason_persons(String idGlobalPackageFact, String factId) {
        try {
            return naznDao.fill_reason_persons(idGlobalPackageFact, factId);
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_fill_reason_persons.getErrorMessage(), e);
        }
    }

    private void spfillTempNazn(String idGlobalPackageFact) {
        try {
            log.info("Выборка всех назначений из баз...");
            naznDao.spfillTempNazn(idGlobalPackageFact);
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_SQL_spFill.getErrorMessage(), e);
        }
    }

    @Override
    @Transactional(value = "jdbcEgissoTransactionManager", propagation = Propagation.REQUIRED)
    public void exec_spFillNazn(String PackageId) {
        log.info("Сравнение выбранных и отправленных мер, наполнение таблицы назначений...");
        try {
            naznDao.exec_spFillNazn(PackageId);
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_DB_FillNazn.getErrorMessage(), e);
        }
    }

    private void spFillTempReasonPersons(String PackageId) {
        log.info("Заполнение таблицы состава семьи...");
        try {
            naznDao.spFillTempReasonPersons(PackageId);
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_DB_FillTempResonPersons.getErrorMessage() + " " + PackageId, e);
        }
    }

    @Override
    public List<Map<String, Object>> mapNazn(String PAC_GUID) {
        try {
            return naznDao.mapNazn(PAC_GUID);
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_SQL_SELECT_FROM_NAZN.getErrorMessage(), e);
        }
    }

    @Override
    public List<Fact> factList(String packageId) {
        try {
            return naznDao.factList(packageId);
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_SQL_SELECT_FROM_NAZN.getErrorMessage(), e);
        }

    }

    @Override
    public void SaveFileXmlToBase(NaznMetaData naznMetaData) {
        log.info("Запись файлов в базу...");
        try {
            //naznDao.SaveFileXmlToBase(naznMetaData);
            log.info("Файлы сохранены в таблице.");
            log.info("Всего файлов: " + naznMetaData.getListFileNazn().size());
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_SQL_INSERT_FILE_ASSIGN.getErrorMessage(), e);
        }
    }

    @Override
    public int getNotSendKMSZ() {
        try {
            return naznDao.getNotSendKMSZ();
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_SQL_GET_NO_SEND_KMSZ.getErrorMessage(), e);
        }

    }

    @Override
    public int countNoSendPackage() {
        return naznDao.countNoSendPackage();
    }

    @Override
    public void writeProtocol(RecordResult rec, String idFileProtocol) {
        try {
            naznDao.writeProtocol(rec, idFileProtocol);
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_SQL_INSERT_PROTOCOL.getErrorMessage(), e);
        }
    }


    @Override
    public int applayProtocolFact(String idGlobalPackage) {
        try {
            return naznDao.applayProtocolFact(idGlobalPackage);
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_SQL_APPALY_PROTOCOL.getErrorMessage(), e);
        }
    }

//    @Override
//    public List<String> listFilePackage() {
//        try {
//            return naznDao.listFilePackage();
//        } catch (DataAccessException e) {
//            throw new NaznServiceException(ErrorMessages.ERROR_SQL_LIST_FILE_GUID.getErrorMessage(), e);
//        }
//    }

    @Override
    public int getPackageByNotLOAD_PROTOCOL(String idGlobalPackage) {
        try {
            return naznDao.getPackageByNotLOAD_PROTOCOL(idGlobalPackage);
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_SQL_CountNoSendProtocol.getErrorMessage(), e);
        }
    }

    @Override
    public int findGuidInTable(String guidFile) throws NaznServiceException {
        try {
            int guidInTable = naznDao.findGuidInTable(guidFile);
            if (guidInTable == 0) {
                log.warn("Файл " + guidFile + " не найден в пакетах");
            }
            return guidInTable;
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_SQL_findGuidInTable.getErrorMessage(), e);
        }
    }

    @Override
    public List<Termination> termList(String idGlobalPackageFact) {
        log.info("Выборка приостановок");
        try {
            return naznDao.termList(idGlobalPackageFact);
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_SQL_P_SELECT_FROM_TERMINATE.getErrorMessage(), e);
        }
    }

    @Override
    public void insertPackageFact(NaznMetaData naznMetaData) {
        try {
            naznDao.insertPackageFact(naznMetaData);
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_SQL_insertPackageFact.getErrorMessage(), e);
        }


    }

    @Override
    public void setStatusGlobalPackage(String idGlobalPackage, Integer status) {
        naznDao.setStatusGlobalPackage(idGlobalPackage, status);
        log.info("Глобальный пакет " + idGlobalPackage + " " + StatusPackage.getStatusPackageById(status).statusName());
    }

    private void spFillTempAsign(String idGlobalPackageFact) {
        log.info("Наполнение таблицы temp_ASIGN...");
        naznDao.spFillTempAsign(idGlobalPackageFact);
    }

    @Override
    //@Transactional(value = "jdbcEgissoTransactionManager", propagation = Propagation.REQUIRES_NEW)
    public NaznMetaData.PackageGlobleFact getGlobalPackage(TypePackage typePackage, Integer idExecuteJob) {
        try {
            return naznDao.getGlobalPackage(typePackage, idExecuteJob);
        } catch (DataAccessException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_SQL_getGlobalPackage.getErrorMessage(), e);
        }

    }

    @Override
    @Transactional(value = "jdbcEgissoTransactionManager", propagation = Propagation.REQUIRES_NEW)
    public Integer Create_Nazn_data(NaznMetaData.PackageGlobleFact gF) throws NaznServiceException {

        log.info("Формирование фактов...");

        //если классификатор сформирован то формировать факты НЕЛЬЗЯ
        if (naznService.getNotSendKMSZ() != 0) {
            throw new NaznServiceException(ErrorMessages.KMSZ_NO_SEND.getErrorMessage());
        }
        if (naznService.countNoSendPackage() != 0) {
            throw new NaznServiceException(ErrorMessages.PACKAGE_NO_SEND.getErrorMessage());
            //log.info(ErrorMessages.PACKAGE_NO_SEND.getErrorMessage());
            //return;
        }

        NaznMetaData naznMetaData = new NaznMetaData();
        naznMetaData.setListFileNazn(new ArrayList<>());
        naznMetaData.setPackageGlobalFact(gF);
        numFile = 0;

        FillTempTable(gF);

        naznService.exec_spFillNazn(gF.getIdGlobalPackageFact());

        List<Fact> listOriginal = naznService.factList(gF.getIdGlobalPackageFact());
        if (listOriginal.isEmpty()) {
            log.info("Измененные факты отсутствуют.");
            return listOriginal.size();
        }
        MyUtils.clearDir(pathForLoad);

        log.info("получим наборы фактов с семьей и без по каждому факту");
        List<Fact> listOriginalWithFamily = new ArrayList<>();
        List<Fact> listOriginalWithOutFamily = new ArrayList<>();

        listOriginal.forEach(fact -> {
            List<PrsnInfo> prsnInfoList = fill_reason_persons(gF.getIdGlobalPackageFact(), fact.getID());
            if (prsnInfoList.size() != 0) {
                fact.setPrsnInfoList(prsnInfoList);
                listOriginalWithFamily.add(fact);
            } else {
                listOriginalWithOutFamily.add(fact);
            }
        });

        processNazn(naznMetaData, listOriginalWithFamily, new ArrayList<>(), TypeFile.FILE_NAZN);
        processNazn(naznMetaData, listOriginalWithOutFamily, new ArrayList<>(), TypeFile.FILE_NAZN);

        List<Termination> listOriginalTerminate = naznService.termList(gF.getIdGlobalPackageFact());

        processNazn(naznMetaData, listOriginalTerminate, new ArrayList<>(), TypeFile.FILE_TERM);

        naznService.insertPackageFact(naznMetaData);
        naznService.setStatusGlobalPackage(gF.getIdGlobalPackageFact(), StatusPackage.CREATED.index());

        log.info("Факты сформированны, " + naznMetaData.getListFileNazn().size() + " файлов.");

        return listOriginal.size();
    }

    @NotNull
    private List<Fact> fillListWithoutFamily(List<Fact> listOriginal) {
        log.info("заполнение списка без семьи");
        return listOriginal.stream()
                .filter(fact -> fact.getPrsnInfoList() == null)
                .collect(Collectors.toList());
    }

    @NotNull
    private List<Fact> fillListWithFamily(List<Fact> listOriginal) {
        log.info("заполнение списка с семьей");
        return listOriginal.stream()
                .filter(fact -> fact.getPrsnInfoList() != null)
                .collect(Collectors.toList());
    }

    private void setPrsnInfo(List<Fact> listOriginal, String packageId) {


    }

    @Override
    @Transactional(value = "jdbcEgissoTransactionManager", propagation = Propagation.REQUIRES_NEW)
    public void FillTempTable(NaznMetaData.PackageGlobleFact gF) {
        if (gF.getStatusPackage() != 4) {
            log.info("Заполнение временных таблиц для нового пакета: " + gF.getIdGlobalPackageFact());
            spfillTempNazn(gF.getIdGlobalPackageFact());
            spFillTempAsign(gF.getIdGlobalPackageFact());
            spFillTempReasonPersons(gF.getIdGlobalPackageFact());
            naznService.setStatusGlobalPackage(gF.getIdGlobalPackageFact(), StatusPackage.BEGIN_CREATED.index());
            log.info("Временные таблицы заполнены для пакета: " + gF.getIdGlobalPackageFact());
        } else
            log.info("Продолжение формирования пакета " + gF.getIdGlobalPackageFact());
    }

//    @Override
//    @Transactional(value = "jdbcEgissoTransactionManager", propagation = Propagation.REQUIRES_NEW)
//    public void setIdExecuteJob(Integer idExecuteJob, String idGlobalPackageFact) {
//        naznDao.setIdExecuteJob(idExecuteJob, idGlobalPackageFact);
//    }

    public void Create_Nazn(Integer idExecuteJob) {
        if (!profileActive.equals("prod")) {
            return;
        }
        NaznMetaData.PackageGlobleFact gF = naznService.getGlobalPackage(TypePackage.PACKAGE_FACT, idExecuteJob);
        Integer res = naznService.Create_Nazn_data(gF);
        if (res != null && res != 0) {
            MyUtils.CreateSignFile(TypePackage.PACKAGE_FACT);
        }
    }

    private Boolean isFamily(Fact fact) {
        return fact.getPrsnInfoList() != null;
    }

    private <T> void processNazn(NaznMetaData naznMetaData, List<T> listOriginal, List<T> listCopy, TypeFile
            typeFile) {
        //        Разбивка на файлы
        log.info("Разбивка на файлы: " + typeFile.typeFileName());
        int i = 0;
        int i_all = 0;
        try {
            for (T row : listOriginal) {
                i_all++;
                if (i < (typeFile == TypeFile.FILE_NAZN ?
                        isFamily((Fact) row) == true ? (maxRecordNaznWithFamily - 1) :
                                (maxRecordNaznWithOutFamily - 1) :
                        (maxRecordTerm - 1))
                ) {
                    listCopy.add(i, row);
                    i++;
                    if (i_all == listOriginal.size()) {
                        getD(naznMetaData, listCopy, typeFile);
                        listCopy.clear();
                        i = 0;
                    }
                } else {
                    listCopy.add(i, row);
                    getD(naznMetaData, listCopy, typeFile);
                    listCopy.clear();
                    i = 0;
                }
            }
            listOriginal = null;
            listCopy = null;
        } catch (IndexOutOfBoundsException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_file_Splitting.getErrorMessage(), e);
        } catch (IllegalArgumentException e) {
            throw new NaznServiceException(ErrorMessages.ERROR_file_Splitting.getErrorMessage(), e);
        } catch (NullPointerException e) {
            e.printStackTrace();
            throw new NaznServiceException(ErrorMessages.ERROR_file_Splitting.getErrorMessage(), e);
        }
    }

    private <T> void getD(NaznMetaData naznMetaData, List<T> mapCopy, TypeFile typeFile) {
        numFile++;
        NaznMetaData.DataNazn dataNazn = new NaznMetaData.DataNazn();
        dataNazn.setAPackage(new PackageFACT(
                formatNameFileFact + String.format("%03d", numFile) + ".xml",
                UUID.randomUUID().toString()
        ));
        naznMetaData.setDataNazn(dataNazn);

        //типы фактов
        switch (typeFile) {
            case FILE_NAZN: {
                naznMetaData.getDataNazn().getAPackage().setFact(new ArrayList<>());
                fillFactData(naznMetaData, mapCopy);
                break;
            }
            case FILE_TERM: {
                naznMetaData.getDataNazn().getAPackage().setTermination(new ArrayList<>());
                fillTermData(naznMetaData, mapCopy);
                break;
            }
        }
    }

    private <T> void fillTermData(NaznMetaData naznMetaData, List<T> mapCopy) {
        for (T termination : mapCopy) {
//            Termination term = null;
//            term = getTerm(termination);
            naznMetaData.getDataNazn().getAPackage().getTermination().add((Termination) termination);
        }
        mapCopy = null;
        naznMetaData.getListFileNazn().add(new NaznFile(
                marshalingExample(naznMetaData)
                , TypeFile.FILE_TERM
                , naznMetaData.getDataNazn().getAPackage().getPackageId()
                , naznMetaData.getDataNazn().getAPackage().getFileName()
        ));
        log.info(naznMetaData.getListFileNazn().size() + " " + TypeFile.FILE_TERM.typeFileName() + " сформирован.");
    }

//    private Termination getTerm(Termination termination) {
//        return new Termination(
//                termination.get("TERMINATE_GUID").toString(),
//                rowcopy.get("FACT_GUID_OLD").toString()
//                , rowcopy.get("DATE_TERMG") == null ? null : new SimpleDateFormat("yyyy-MM-dd").format(rowcopy.get("DATE_TERMG"))
//                , new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + "T" + new SimpleDateFormat("hh:mm:ss").format(new Date()) + "+03:00"
//        );
//    }

    private <T> void fillFactData(NaznMetaData naznMetaData, List<T> mapCopy) {
        for (T fact : mapCopy) {
//            NeedsCriteria needsCriteria = new NeedsCriteria();
//            List<PrsnInfo> prsnInfoList = new ArrayList<>();
//            MSZ_receiver msz_receiver = new MSZ_receiver();


            //Fact fact = null;
            //fact = getFact(rowcopy);
            //setFormMsz(fact);

            //prsnInfoList = naznService.fill_reason_persons(rowcopy);
            //fill_msz_receiver(rowcopy, msz_receiver);
            //fill_needsCriteria(rowcopy, needsCriteria);

            //fact.setMsz_receiver(msz_receiver);
            //fact.setNeedsCriteria(needsCriteria);
//            if (prsnInfoList.size() != 0) {
//                fact.setPrsnInfoList(prsnInfoList);
//            }
            naznMetaData.getDataNazn().getAPackage().getFact().add((Fact) fact);
        }
        mapCopy = null;
        naznMetaData.getListFileNazn().add(new NaznFile(
                marshalingExample(naznMetaData)
                , TypeFile.FILE_NAZN
                , naznMetaData.getDataNazn().getAPackage().getPackageId()
                , naznMetaData.getDataNazn().getAPackage().getFileName()
        ));
        log.info(naznMetaData.getListFileNazn().size() + " " + TypeFile.FILE_NAZN.typeFileName() + " сформирован.");
    }

//    private void setFormMsz(Fact fact) {
//        switch (fact.getLocalMSZ().getClassificationKMSZ().getCodeProvisionForm()) {
//            case "01":
//                List<Monetary_form> monetaryformList = new ArrayList<>();
//                Monetary_form monetary_form = new Monetary_form();
//                monetary_form.setAmount(fact. get("AMOUNT").toString().replace(",", "."));
//                monetaryformList.add(monetary_form);
//                fact.setMonetary_form(monetaryformList);
//                break;
//            case "03": {
//                List<ExemptionForm> exemptionFormList = new ArrayList<>();
//                ExemptionForm exemptionForm = new ExemptionForm();
//                exemptionForm.setMeasuryCode("03");
//                exemptionForm.setMonetization(false);
//                exemptionForm.setAmount(rowcopy.get("AMOUNT").toString().replace(",", "."));
//                exemptionForm.setEquivalentAmount(rowcopy.get("EQUIVALENTAMOUNT").toString().replace(",", "."));
//                exemptionFormList.add(exemptionForm);
//                fact.setExemptionForms(exemptionFormList);
//                break;
//            }
//            case "04":
//                List<ServiceForm> serviceFormList = new ArrayList<>();
//                ServiceForm serviceForm = new ServiceForm();
//                serviceForm.setMeasuryCode("03");
//                serviceForm.setAmount(rowcopy.get("AMOUNT").toString().replace(",", "."));
//                serviceForm.setEquivalentAmount(rowcopy.get("EQUIVALENTAMOUNT").toString().replace(",", "."));
//                serviceFormList.add(serviceForm);
//                fact.setServiceForms(serviceFormList);
//                break;
//        }
//    }

    private void fill_monetary_form(Map<String, Object> factOne, Monetary_form monetary_form) {
//        monetary_form.setAmount(factOne.get("amount").toString().replace(",", "."));
//        switch (factOne.get("FORM_MSZ").toString()) {
//            case "02":
//                monetary_form.setMeasuryCode("03");
//            case "03": {
//                monetary_form.setMeasuryCode("03");
//                monetary_form.setMonetization(false);
//            }
//            case "04":
//                monetary_form.setMeasuryCode("03");
//
//        }
    }

    private void fill_needsCriteria(Map<String, Object> factOne, NeedsCriteria needsCriteria) {
        needsCriteria.setUsingSign(factOne.get("USINGSIGN").toString());
    }

    private void fill_msz_receiver(Map<String, Object> factOne, MSZ_receiver msz_receiver) {
        msz_receiver.setSNILS(factOne.get("SNILS").toString());
        msz_receiver.setFamilyName(factOne.get("FAMILYNAME").toString());
        msz_receiver.setFirstName(factOne.get("FIRSTNAME").toString());
        msz_receiver.setPatronymic(factOne.get("PATRONYMIC").equals("") ? null : factOne.get("PATRONYMIC").toString());
        msz_receiver.setGender(factOne.get("GENDER").toString());
        msz_receiver.setBirthDate(new SimpleDateFormat("yyyy-MM-dd").format(factOne.get("BIRTHDATE")));
    }

    private File marshalingExample(NaznMetaData naznMetaData) {
        File fileXml = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(NaznMetaData.DataNazn.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
            fileXml = new File(pathForLoad + naznMetaData.getDataNazn().getAPackage().getFileName());
            //jaxbMarshaller.marshal(naznMetaData.getDataNazn(), System.out);
            jaxbMarshaller.marshal(naznMetaData.getDataNazn(), fileXml);
            return fileXml;
        } catch (Exception e) {
            throw new NaznServiceException(ErrorMessages.ERROR_MARSHLING_NAZN.getErrorMessage(), e);
        }
    }

    private Fact getFact(Map<String, Object> rowcopy) {
        return new Fact(
                rowcopy.get("FACT_GUID").toString(),
                rowcopy.get("OSZCODE").toString(),
                rowcopy.get("GUID_LOCAL_MSZ").toString(),
                rowcopy.get("GUID_LOCAL_CATEG").toString()
                , rowcopy.get("DECISION_DATE") == null ? null : new SimpleDateFormat("yyyy-MM-dd").format(rowcopy.get("DECISION_DATE"))
                , rowcopy.get("DATESTART") == null ? null : new SimpleDateFormat("yyyy-MM-dd").format(rowcopy.get("DATESTART"))
                , rowcopy.get("DATEFINISH") == null ? null : new SimpleDateFormat("yyyy-MM-dd").format(rowcopy.get("DATEFINISH"))
                , new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + "T" + new SimpleDateFormat("hh:mm:ss").format(new Date()) + "+03:00"
        );

    }
}
