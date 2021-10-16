package smev.Egisso.Service.Impl;

import io.swagger.annotations.ApiOperation;

import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smev.Egisso.Entity.GlobalPackage;
import smev.ElementServices.Egisso.ElementsKmsz.PackageKMSZ;
import smev.Egisso.Enum.ApplayProtocol;
import smev.Egisso.Enum.StatusPackage;
import smev.Egisso.Enum.TypePackage;
import smev.Egisso.Service.KmszService;
import smev.Egisso.Service.NaznService;
import smev.Egisso.Strategy.*;
import smev.Egisso.dto.PacInner;
import smev.Egisso.exceptions.ErrorMessages;
import smev.Egisso.exceptions.ProtocolServiceException;
import smev.Egisso.util.MyUtils;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.StreamSupport;

import static java.nio.file.Files.newDirectoryStream;

@Service
@Log4j2
@Transactional(value = "jdbcEgissoTransactionManager")
public class ProtocolService {



    private volatile boolean toStopFlag = true;

    @Autowired
    KmszService kmszService;

    @Autowired
    private NaznService naznService;

    @Autowired
    private EgissoBusinessServices egissoBusinessServices;


    @Resource(name = "loadfile")
    LoadProtocolFile loadfile;

    @Resource(name = "loadsmev")
    LoadProtocolSmev loadsmev;

    @Autowired
    ProtocolFact protocolFact;

    @Autowired
    ProtocolKmsz protocolKmsz;

    public ProcessingProtocolStrategy strategyProtocol;
    public LoadProtocolStrategy loadProtocolStrategy;

    @Value("${scheduler.processProtocol.delay}")
    private Long del;

    @Value("${egisso.pathProtocol}")
    private String pathProtocol;

    @Value("${egisso.path_copy}")
    private String path_copy;

    @Value("${egisso.path_for_Load_kmsz}")
    private String pathForLoadKmsz;

    @Value("${spring.profiles.active}")
    public String profileActive;


//    public void getProtocol2(Integer idExecuteJob) throws ProtocolServiceException {
//
//        if (log.isDebugEnabled()) {
//            log.info("Проверка наличия файлов...");
//        }
////        PackageFACT packageFact = null;
//        PackageKMSZ packageKMSZ = null;
//        PacInner pacInner = null;
//
//        try {
//            DirectoryStream<Path> directoryStream = newDirectoryStream(Paths.get(pathProtocol), "*.xml");
//            boolean fOk = false;//флаг что протоколы успешно отработались
//            for (Path path : directoryStream) {
//                if (isRegularFile(path)) {
//                    log.info("получение данных из файла " + path.getFileName());
//                    pacInner = PacInner.builder()
//                            .build();
//                    Response resFile = MyUtils.getResponseProtocol(path.toAbsolutePath());
//
//                    packageKMSZ = kmszService.getKmszNoSend();
//                    if (packageKMSZ != null) {
//                        //приоритет обработки классификатора если найден не обработанный
//                        pacInner.setGuidFile(packageKMSZ.getPackageId());
//                        if (!pacInner.getGuidFile().toUpperCase().equals(resFile.getProtocol().getPackageResult().getPackageID().toUpperCase())) {
//                            log.warn("Гуид отправленного классифкатора не соответствует гуиду в файле протокола классификатора");
//                            continue;
//                        }
//                    } else {
//                        String idGlobalPackage = naznService.getPackageFactNoSend();
////                        packageFact = new PackageFACT();
////                        packageFact.setPackageId();
//                        if (idGlobalPackage == null) {
//                            break;
//                        } else {
//                            pacInner.setIdGlobalPackage(idGlobalPackage);
//                        }
//                        //pacInner.setIdGlobalPackage(naznService.getPackageFactNoSend());
//                        pacInner.setGuidFile(resFile.getProtocol().getPackageResult().getPackageID());
//                        //проверяем есть ли такой гуид в пакетах
//                        naznService.findGuidInTable(resFile.getProtocol().getPackageResult().getPackageID());
//                    }
//
//                    /*
//                     * использую паттерн Стратегия, в котором указываю какая стратегия применяется для
//                     * обработки пакета, а потом вызываю runProtocol
//                     * */
//                    if (resFile.getProtocol().getPackageResult().getPackageType().equals(TypePackage.PACKAGE_KMSZ.typeName())) {
//                        pacInner.setTypePackage(TypePackage.PACKAGE_KMSZ);
//                        pacInner.setStrategyProtocol(new ProtocolKmsz(naznService, kmszService));
//                    }
//                    if (resFile.getProtocol().getPackageResult().getPackageType().equals(TypePackage.PACKAGE_FACT.typeName())) {
//                        pacInner.setTypePackage(TypePackage.PACKAGE_FACT);
//                        pacInner.setStrategyProtocol(new ProtocolFact(naznService));
//                    }
//
//                    pacInner.runProtocol(resFile, pacInner);
//                    fOk = true;
//                    //strategyProtocol.processProtocol(resFile, pacInner);
//                    //processingProtocol(resFile, pacInner);
//                }
//            }
//            //TODO реализовать применение протоколо когда файлов протоколов больше не будет
//            // но запустить обработку надо
//            //strategyProtocol.applayProtocol();
//
//            if (fOk) {
//                //создание копии папки с протоколами
//                String dirToCopy = MyUtils.createDirToday(path_copy);
//                MyUtils.copyDir(pathProtocol, dirToCopy);
//                //очистка каталога
//                MyUtils.clearDir(pathProtocol);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new ProtocolServiceException(e.getMessage(), e.getCause());
//        }
//    }

    @ApiOperation("Обработка протоколов по стратегии: или через файл или через smev")
    public void getProtocol(Integer idExecuteJob) throws ProtocolServiceException {

        if (!profileActive.equals("prod")) {
            return;
        }

        /*
        если по глобальному гуиду присутствуют пакеты со статусами кроме
        statusEgisso = 3(CREATED) и statusSmev = 5(PROTOCOL_RECEIVED), то обработка не должна запускаться
        * */
//        if (naznService.getPackageByNotLOAD_PROTOCOL(pacInner.getIdGlobalPackage()) != 0) {
        //GlobalPackage globalPackage = egissoBusinessServices.getGlobalPackageByStatusAndApplayProtocol(StatusPackage.CREATED, ApplayProtocol.NO);




        if (log.isDebugEnabled()) {
            log.info("Проверка наличия файлов...");
        }
//        PackageFACT packageFact = null;


        try {
            DirectoryStream<Path> directoryStream = newDirectoryStream(Paths.get(pathProtocol), "*.xml");

            boolean filesIsPresent = StreamSupport.stream(directoryStream.spliterator(), false)
                    .findFirst().isPresent();

            if (filesIsPresent) {
                //закроем поток файлов чтобы открыть его в Load для полного списка файлов
                //directoryStream.close();

                //strategy.processProtocol();
                LoadProtocolStrategy strategy = loadfile;
//                pacInner.setLoadProtocolStrategy(new LoadProtocolFile(this));
                strategy.Load();

            } else {
//                pacInner.setLoadProtocolStrategy(new LoadProtocolSmev());
                LoadProtocolStrategy strategy = loadsmev;
                strategy.Load();
//                pacInner.setLoadProtocolStrategy(loadsmev);
//                pacInner.Loading();
            }

            //TODO реализовать применение протоколо когда файлов протоколов больше не будет
            // но запустить обработку надо
            //strategyProtocol.applayProtocol();

        } catch (Exception e) {
            e.printStackTrace();
            throw new ProtocolServiceException(e.getMessage(), e.getCause());
        }
    }

    public void moveProtocolFiles() {
        //создание копии папки с протоколами
        String dirToCopy = MyUtils.createDirToday(path_copy,false);
        MyUtils.copyDir(pathProtocol, dirToCopy);
        //очистка каталога
        MyUtils.clearDir(pathProtocol);
    }

    public boolean ttt(PacInner pacInner) {
        //проверяем есть ли такой гуид в пакетах
        if (pacInner.getGuidFile() != null) {
            naznService.findGuidInTable(pacInner.getGuidFile());
        }


        if (pacInner.getProtocol() != null && pacInner.getProtocol().getMessageResult() != null) {
            pacInner.setTypePackage(TypePackage.EMPTY);
        } else {
            PackageKMSZ packageKMSZ = null;
            packageKMSZ = kmszService.getKmszNoSend();
            if (packageKMSZ != null) {
                //приоритет обработки классификатора если найден не обработанный
                if (packageKMSZ.getPackageId().equalsIgnoreCase(pacInner.getGuidFile())) {
                    pacInner.setTypePackage(TypePackage.PACKAGE_KMSZ);
                } else
                    log.warn("Гуид отправленного классифкатора не соответствует гуиду в файле протокола классификатора");
            } else {
                String idGlobalPackage = naznService.getPackageFactNoSend();
                if (idGlobalPackage == null && pacInner.getIdGlobalPackage() != null) {
                    log.info("Запущенно только применение протоколов фактов...");
                    idGlobalPackage = pacInner.getIdGlobalPackage();
                }

                if (idGlobalPackage == null && pacInner.getProtocol() != null) {
                    log.warn(ErrorMessages.ERROR_SQL_Empty_Fact.getErrorMessage());
                } else {
                    pacInner.setIdGlobalPackage(idGlobalPackage);
                    pacInner.setTypePackage(TypePackage.PACKAGE_FACT);
                }
            }
        }
        /*
         * использую паттерн Стратегия, в котором указываю какая стратегия применяется для
         * обработки пакета, а потом вызываю processProtocol
         * */
        if (pacInner.getTypePackage() != null) {
            switch (pacInner.getTypePackage()) {
                case EMPTY: {
                    this.writeProtocolInBase(pacInner);
                    egissoBusinessServices.updateStatusPackage(pacInner, null, null, StatusPackage.ERROR);
                    return true;
                }

                case PACKAGE_KMSZ: {
                    ProcessingProtocolStrategy loadProtocolStrategy = protocolKmsz;
                    loadProtocolStrategy.processProtocol(pacInner);
                    return true;

                }
                case PACKAGE_FACT: {
                    ProcessingProtocolStrategy loadProtocolStrategy = protocolFact;
                    loadProtocolStrategy.processProtocol(pacInner);
                    return true;
                }
            }
        }
        return false;
    }


    public void writeProtocolInBase(PacInner pac) {
        if (pac.getProtocol() != null) {
            log.info("Запись протоколов в базу....");
            egissoBusinessServices.writeProtocolBatch(pac);
        }
    }

    public void updateStatusPackageInfo(PacInner pac) {

        if (pac.getProtocol() == null) {
            return;
        }

        final BigInteger recordNum = pac.getProtocol().getPackageResult().getRecordNum();
        final BigInteger recordNumSuccess = pac.getProtocol().getPackageResult().getRecordNumSuccess();

        String prefix = "-----!!!-----";
        if (recordNum.equals(recordNumSuccess)) {
            prefix = "";
        }
        StatusPackage statusPackage = MyUtils.getStatusPackage(recordNumSuccess);
        egissoBusinessServices.updateStatusPackage(pac, recordNum, recordNumSuccess, statusPackage);
        log.info("Протокол " + pac.getGuidFile() + ", Закачанно в егиссо: " + recordNumSuccess + " из " + recordNum + "  " + prefix + ", Статус пакета: " + statusPackage.statusName());

    }



    public void setApplayProtocolGlobalPackage(PacInner pacInner, ApplayProtocol applayProtocol) {
        egissoBusinessServices.setApplayProtocolGlobalPackage(pacInner,applayProtocol);
    }



    //@Override
    //@Transactional
//    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        JobKey key = jobExecutionContext.getJobDetail().getKey();
//        log.info("======================================");

    //*********** For retrieving stored key-value pairs ***********/
//        JobDataMap dataMap = jobExecutionContext.getMergedJobDataMap();
//        String myValue = dataMap.getString("myKey");
//        log.info("Value:" + myValue);

    //*********** For retrieving stored object, It will try to deserialize the bytes Object. ***********/
		/*
		SchedulerContext schedulerContext = null;
        try {
            schedulerContext = jobExecutionContext.getScheduler().getContext();
        } catch (SchedulerException e1) {
            e1.printStackTrace();
        }
        YourClass yourClassObject = (YourClass) schedulerContext.get("storedObjectKey");
		 */
//        try {
//            getProtocol();
//        } catch (NaznServiceException e) {
//            log.error(e.getMessage());
//            e.printStackTrace();
//        } catch (Exception e) {
//            throw new SchedullerException(ErrorMessages.ERROR_SCHEDULLER.getErrorMessage(), e);
//        }

//        while (toStopFlag) {
//            try {
//                log.info("ScheduledProtocol Job Running... Thread Name :" + Thread.currentThread().getName());
//
//
//
//               Thread.sleep(3000);
//            }
//            catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    //  log.info("Thread: " + Thread.currentThread().getName() + " stopped.");
    //}


//    @Scheduled(cron="10 * * * *  *") //Scheduling job at the interval of 10 seconds
//    public void scheduleJob(){
//        JobParameters jobParameters=new JobParametersBuilder().addLong("time",System.currentTimeMillis()).toJobParameters();
//        try {
//            String jobName=job.getName();
//            logger.info("JOB NAME===> "+jobName);
//            JobExecution jobExecution=jobLauncher.runReceive(job, jobParameters);
//            logger.info("JOB STATUS===> "+jobExecution.getStatus());
//
//        } catch (JobExecutionAlreadyRunningException e) {
//        } catch (JobRestartException e) {
//        } catch (JobInstanceAlreadyCompleteException e) {
//        } catch (JobParametersInvalidException e) {
//        }
//    }


}
