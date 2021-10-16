package smev.GisJkh.Service;


import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import smev.Egisso.exceptions.GisJkhJobException;
import smev.ElementServices.GisJKH.ActionType;
import smev.ElementServices.GisJKH.ExportDebtRequestsRequest;
import smev.ElementServices.GisJKH.ImportDebtRequestsRequest;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Enum.InquiryVersionEnum;
import smev.GisJkh.Converter.GisJkhConverter;
import smev.GisJkh.Dao.GisJkhDaoImpl;
import smev.GisJkh.Entity.*;
import smev.GisJkh.Enum.TypePackage;
import smev.GisJkh.Repo.DataPackageRepo;
import smev.GisJkh.Repo.DataRequestRepo;
import smev.GisJkh.Repo.GlobalPackageRepo;
import smev.GisJkh.Repo.PackageRepo;
import smev.Reestr.Dao.ReestrDao;
import smev.Reestr.Dto.DateForGisJkh;
import smev.Service.BusinessService;
import smev.Service.CreateMessageService;
import smev.Wrapper.PayLoad;
import smev.exceptions.SystemException;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional(value = "gisJkhTransactionManager")
public class GisJkhServiceImpl {

    /*
    ImportDebtRequestsRequest - отправляем данные
    ImportDebtRequestsResponse - ответ приняты данные или нет

    ExportDebtRequestsRequest - запрашиваем ответы
    ExportDebtRequestsResponse - сам ответ
    * */

    //private static final Logger log = LogManager.getLogger("GisJkh");
    private static final Logger log = LoggerFactory.getLogger("smev.GisJkh");

//    private final Integer partitionSizeRequest = 3;
//    private final Integer partitionSizeResponse = 2;

    @Value("${gisJkh.partitionSizeRequest}")
    public Integer partitionSizeRequest;

    @Value("${gisJkh.dayOfMonthSendDATA}")
    public Integer dayOfMonthSendDATA;


    @Value("${gisJkh.partitionSizeResponse}")
    public Integer partitionSizeResponse;

    @Value("${gisJkh.organizationId}")
    public String organizationId;

    @Value("${gisJkh.InformationSystemId}")
    public String informationSystemId;

    @Value("${gisJkh.executorId}")
    public String executorId;

    @Autowired
    private BusinessService businessService;

    @Autowired
    private GisJkhDaoImpl gisJkhDao;

    @Autowired
    private ReestrDao reestrDao;


    @Autowired
    private PackageRepo packageRepo;

    @Autowired
    private DataRequestRepo dataRequestRepo;

    @Autowired
    private DataPackageRepo dataPackageRepo;

    @Autowired
    private GlobalPackageRepo globalPackageRepo;


    @Autowired
    private CreateMessageService createMessageService;


    //@Override
    @ApiOperation("Отправка данных")
    public void createRequestGisJkh() {
        List<BusinessMessageEntity> listMessageForSend = new ArrayList<>();
        List<List<DataRequestEntity>> partitions = new LinkedList<List<DataRequestEntity>>();
        LocalDateTime nowDate = LocalDateTime.now();
        GlobalPackageEntity globalPackageEntity;

        try {
            if (nowDate.getDayOfMonth() != dayOfMonthSendDATA) {
                globalPackageEntity = gisJkhDao.LastGlobalPackage();
            } else {
                globalPackageEntity = new GlobalPackageEntity();
                globalPackageEntity.setIdGlobalPackage(UUID.randomUUID());
                globalPackageEntity.setCreateDate(LocalDateTime.now());
                globalPackageRepo.save(globalPackageEntity);
            }
            //List<PackageRequestEntity> all = packageRepo.findAll();
            //LocalDate maxDatZ = reestrDao.getMaxDatZ();
            DateForGisJkh lastDateForGisJkh = reestrDao.getLastDateForGisJkh();

//        GlobalPackageEntity globalPackage = new GlobalPackageEntity();
//        globalPackage.setIdGlobalPackage(UUID.randomUUID());
//        globalPackageRepo.save(globalPackage);
            List<DataRequestEntity> originalList = reestrDao.getListDataRequestEntity(0, lastDateForGisJkh, globalPackageEntity);


            for (int i = 0; i < originalList.size(); i += partitionSizeRequest) {
                partitions.add(originalList.subList(i,
                        Math.min(i + partitionSizeRequest, originalList.size())));
            }

            for (List<DataRequestEntity> requestPackage : partitions) {
                fillDataRequest(requestPackage);

                ImportDebtRequestsRequest request = new ImportDebtRequestsRequest();
                fillImportDebitRequestRequest(requestPackage, request);

                PackageEntity packageEntityImport = new PackageEntity();
                packageEntityImport.setIdPackage(UUID.randomUUID());
                packageEntityImport.setGlobalPackageId(globalPackageEntity.getIdGlobalPackage());
                packageEntityImport.setTypePackage(TypePackage.IMPORT.value());
                //packageEntityImport.setDatePay(nowDate);
                packageEntityImport.setCreateDate(nowDate);


                dataRequestRepo.saveAll(requestPackage);
//            связка пакетов и индивидуальных запросов
                List<DataPackageEntity> list = new ArrayList<>();
                for (DataRequestEntity data : requestPackage) {
                    DataPackageEntity dat = new DataPackageEntity(new DataPackageEntityPK(data.getTransportId(), packageEntityImport.getIdPackage()));
                    list.add(dat);
                }
                dataPackageRepo.saveAll(list);

                PayLoad payLoad = new PayLoad();
                payLoad.setPayLoadObject(request);
                BusinessMessageEntity messageEntity = createMessageService.autoCreateRequestMessage(InquiryVersionEnum.GIS_JKH_IMPORT_REQUEST, 1111, null, payLoad);
                if (messageEntity == null) {
                    log.error("autoCreateMessage in null, payload = {}", payLoad.toString());
                    throw new SystemException("autoCreateMessage in null");
                }
                listMessageForSend.add(messageEntity);
                packageEntityImport.setInteractionId(messageEntity.getInteractionId());
                packageRepo.save(packageEntityImport);
//            Thread.sleep(5000);
                log.info("автоматически успешно создано взаимодействие для ГИС ЖКХ {}, {}", messageEntity.getInteractionId(), InquiryVersionEnum.GIS_JKH_IMPORT_REQUEST.name());
//            dataRequestRepo.saveAll(GisJkhConverter.MAPPER.toDataRequestEntityList(requestPackage));

            }
        } catch (Exception ex) {
            log.error("Ошибка формирования сообщений для смева", ex.getMessage());
            ex.printStackTrace();
            throw new GisJkhJobException(ex.getMessage(), ex.getCause());
        }

        log.info("отправка сформированных сообщений...{} штук", listMessageForSend.size());
        for (BusinessMessageEntity message : listMessageForSend) {
            businessService.saveMessageIntoT_Send(message);
            log.info("сообщение {} помечено для отправки", message.getIdMessage().toString());
        }

        if (partitions.size() > 0) {
            log.info("отправка данных в ГИС ЖКХ закончена");
        }

    }

    private void fillDataRequest(List<DataRequestEntity> requestPackage) {
        requestPackage.forEach(dataRequestEntity -> {
            dataRequestEntity.setActionType(ActionType.SEND.value());
            dataRequestEntity.setTransportId(UUID.randomUUID());
            dataRequestEntity.setExecutorId(UUID.fromString(executorId));
            dataRequestEntity.setCreateDate(LocalDateTime.now());
        });
    }

    //@Override
    @ApiOperation("Запрос ответов")
    public void createRequestRequest() {

        LocalDateTime nowDate = LocalDateTime.now();
        List<BusinessMessageEntity> messageEntitiesForSend = new ArrayList<>();
        //LocalDate maxDatZ = reestrDao.getMaxDatZ();
        GlobalPackageEntity globalPackageEntity = gisJkhDao.LastGlobalPackage();
        Timestamp date = packageRepo.getLastCreateDateImportPackage();

        List<DataRequestEntity> originalList = gisJkhDao.geListForRequestRequest(globalPackageEntity);
        List<List<DataRequestEntity>> partitions = new LinkedList<List<DataRequestEntity>>();

        try {
            for (int i = 0; i < originalList.size(); i += partitionSizeResponse) {
                partitions.add(originalList.subList(i,
                        Math.min(i + partitionSizeResponse, originalList.size())));
            }

            //заполняем каждый  partitions
            for (List<DataRequestEntity> requestRequest : partitions) {
                ExportDebtRequestsRequest exportDebtRequestsRequest = new ExportDebtRequestsRequest();
                exportDebtRequestsRequest.setRequestId(requestRequest.stream().map(dataRequestEntity -> dataRequestEntity.getIdResultFromGisJkh().toString()).collect(Collectors.toList()));
                exportDebtRequestsRequest.setInformationSystemId(informationSystemId);
                exportDebtRequestsRequest.setOrganizationId(organizationId);

                PackageEntity packageEntityExport = new PackageEntity();
                packageEntityExport.setIdPackage(UUID.randomUUID());
                packageEntityExport.setGlobalPackageId(globalPackageEntity.getIdGlobalPackage());
                packageEntityExport.setTypePackage(TypePackage.EXPORT.value());
                //packageEntityExport.setDatePay(nowDate);
                packageEntityExport.setCreateDate(nowDate);


//            связка пакетов и transportId
                List<DataPackageEntity> list = new ArrayList<>();
                for (DataRequestEntity data : requestRequest) {
                    DataPackageEntity dat = new DataPackageEntity(new DataPackageEntityPK(data.getTransportId(), packageEntityExport.getIdPackage()));
                    list.add(dat);
                }
                dataPackageRepo.saveAll(list);


                PayLoad payLoad = new PayLoad();
                payLoad.setPayLoadObject(exportDebtRequestsRequest);
                BusinessMessageEntity messageEntity = createMessageService.autoCreateRequestMessage(InquiryVersionEnum.GIS_JKH_EXPORT_REQUEST, 1111, null, payLoad);
                messageEntitiesForSend.add(messageEntity);
                packageEntityExport.setInteractionId(messageEntity.getInteractionId());
                packageRepo.save(packageEntityExport);


                log.info("автоматически создано взаимодействие {}, {}", messageEntity.getInteractionId(), InquiryVersionEnum.GIS_JKH_EXPORT_REQUEST.name());
//            dataRequestRepo.saveAll(GisJkhConverter.MAPPER.toDataRequestEntityList(requestPackage));
            }

            log.info("отправка сформированных сообщений...{} штук", messageEntitiesForSend.size());
            for (BusinessMessageEntity messageEntity : messageEntitiesForSend) {
                businessService.saveMessageIntoT_Send(messageEntity);
                log.info("сообщение {} помечено для отправки", messageEntity.getIdMessage().toString());
            }

//        log.info(date.toString());
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
//        log.info(localDateTime.toString());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            String format = localDateTime.format(formatter);

        } catch (Exception e) {
            e.printStackTrace();
            throw new GisJkhJobException(e.getMessage(), e.getCause());
        }
    }

    //@Override
    @ApiOperation("Отправка ошибочных ERROR REJECT пакетов")
    public void reSendErrorPackage() throws Exception {
        LocalDateTime nowDate = LocalDateTime.now();
        GlobalPackageEntity globalPackageEntity = gisJkhDao.LastGlobalPackage();
        List<String> listForReSend = gisJkhDao.getPackagesForReSend(globalPackageEntity);
        for (String packageForBase : listForReSend) {
            List<DataRequestEntity> listRequestForBase = gisJkhDao.getRequestDataByPackageId(packageForBase);

            ImportDebtRequestsRequest newRequest = new ImportDebtRequestsRequest();
            fillImportDebitRequestRequest(listRequestForBase, newRequest);

            PackageEntity packageEntityImport = packageRepo.findById(UUID.fromString(packageForBase)).get();
            packageEntityImport.setMode(null);
            packageEntityImport.setDescription(null);
            packageEntityImport.setStacktrace(null);
            packageEntityImport.setErrorCode(null);
            packageEntityImport.setCreateDate(nowDate);

            PayLoad payLoad = new PayLoad();
            payLoad.setPayLoadObject(newRequest);
            BusinessMessageEntity messageEntity = createMessageService.autoCreateRequestMessage(InquiryVersionEnum.GIS_JKH_IMPORT_REQUEST, 1111, null, payLoad);
            packageEntityImport.setInteractionId(messageEntity.getInteractionId());
            packageRepo.save(packageEntityImport);
            log.info("пакет {} пересобран и отправлен", packageForBase);
        }
    }


    @ApiOperation("Отправка ошибочных запросов со статусом ERROR")
    public void reSendErrorRequest() throws Exception {
        LocalDateTime nowDate = LocalDateTime.now();
        //LocalDate maxDatZ = reestrDao.getMaxDatZ();
        DateForGisJkh lastDateForGisJkh = reestrDao.getLastDateForGisJkh();
        GlobalPackageEntity globalPackageEntity = gisJkhDao.LastGlobalPackage();
        List<DataRequestEntity> newData = reestrDao.getListDataRequestEntity(0, lastDateForGisJkh, globalPackageEntity);
//        List<DataRequestEntity> newData = gisJkhDao.getListNewData(globalPackageEntity);
        List<DataRequestEntity> dataError = gisJkhDao.getListRequestError(globalPackageEntity);


        dataError.forEach(dataErr -> {
            String delo = String.format("%02d", dataErr.getIdRegion()) + String.format("%06d", dataErr.getIdSubject());
            DataRequestEntity dataNew = newData.stream().filter(dataRequestEntity -> (String.format("%02d", dataRequestEntity.getIdRegion()) + String.format("%06d", dataRequestEntity.getIdSubject())).equals(delo)).collect(Collectors.toList()).get(0);
            if (dataNew != null) {
                dataRequestRepo.deleteById(dataErr.getTransportId());
                dataPackageRepo.deleteByTransportId(dataErr.getTransportId());

                dataErr.setTransportId(UUID.randomUUID());
                dataErr.setActionType(ActionType.SEND.value());
                dataErr.setDescription(null);
                dataErr.setErrorCode(null);
                dataErr.setResultType(null);
                dataErr.setCreateDate(nowDate);
                dataErr.setExecutorId(UUID.fromString(executorId));
                dataErr.setStacktrace(null);
                dataErr.setAddress(dataNew.getAddress());
                dataErr.setDocNumber(dataNew.getDocNumber());
                dataErr.setDocSeries(dataNew.getDocSeries());
                dataErr.setDocType(dataNew.getDocType());
                dataErr.setFirstName(dataNew.getFirstName());
                dataErr.setLastName(dataNew.getLastName());
                dataErr.setMiddleName(dataNew.getMiddleName());
                dataErr.setFiasId(dataNew.getFiasId());
                dataErr.setSnils(dataNew.getSnils());
                dataErr.setChangeDate(null);
            }

        });
        List<List<DataRequestEntity>> partitions = new LinkedList<List<DataRequestEntity>>();
        for (int i = 0; i < dataError.size(); i += partitionSizeRequest) {
            partitions.add(dataError.subList(i,
                    Math.min(i + partitionSizeRequest, dataError.size())));
        }

        for (List<DataRequestEntity> requestPackage : partitions) {
            ImportDebtRequestsRequest request = new ImportDebtRequestsRequest();
            fillImportDebitRequestRequest(requestPackage, request);

            PackageEntity packageEntityImport = new PackageEntity();
            packageEntityImport.setIdPackage(UUID.randomUUID());
            packageEntityImport.setGlobalPackageId(globalPackageEntity.getIdGlobalPackage());
            packageEntityImport.setTypePackage(TypePackage.IMPORT.value());
            packageEntityImport.setCreateDate(nowDate);

            dataRequestRepo.saveAll(requestPackage);
//            связка пакетов и индивидуальных запросов
            List<DataPackageEntity> list = new ArrayList<>();
            for (DataRequestEntity data : requestPackage) {
                DataPackageEntity dat = new DataPackageEntity(new DataPackageEntityPK(data.getTransportId(), packageEntityImport.getIdPackage()));
                list.add(dat);
            }
            dataPackageRepo.saveAll(list);

            PayLoad payLoad = new PayLoad();
            payLoad.setPayLoadObject(request);
            BusinessMessageEntity messageEntity = createMessageService.autoCreateRequestMessage(InquiryVersionEnum.GIS_JKH_IMPORT_REQUEST, 1111, null, payLoad);
            packageEntityImport.setInteractionId(messageEntity.getInteractionId());
            packageRepo.save(packageEntityImport);
//            Thread.sleep(5000);
            log.info("автоматически успешно создано взаимодействие {}, {}", messageEntity.getInteractionId(), InquiryVersionEnum.GIS_JKH_IMPORT_REQUEST.name());
//            dataRequestRepo.saveAll(GisJkhConverter.MAPPER.toDataRequestEntityList(requestPackage));
        }
    }

    private void fillImportDebitRequestRequest(List<DataRequestEntity> listRequestForBase, ImportDebtRequestsRequest newRequest) {
        newRequest.setAction(GisJkhConverter.MAPPER.toActionList(listRequestForBase));
        newRequest.setInformationSystemId(informationSystemId);
        newRequest.setOrganizationId(organizationId);
    }
}
