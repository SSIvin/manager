package smev.Reestr.Service.Impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.itextpdf.html2pdf.HtmlConverter;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import smev.Dto.ReportDataDto;
import smev.Dto.UserDto;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Entity.OrderFromReestr;
import smev.Entity.Subject;
import smev.Entity.UserEntity;
import smev.Enum.*;
import smev.Reestr.Converter.OrderConverter;
import smev.Reestr.Converter.OrderInquiryConverter;
import smev.Reestr.Converter.OrderInquiryConverterImpl;
import smev.Reestr.Dao.OrderReestrDao;
import smev.Reestr.Dto.*;
import smev.Reestr.Entity.SubjectEntity;
import smev.Reestr.Entity.SubjectEntityPK;
import smev.Reestr.Repo.SubjectRepo;
import smev.Reestr.Service.OrderService;
import smev.Service.BusinessService;
import smev.Service.CreateMessageService;
import smev.Service.Impl.UserServiceImpl;
import smev.Service.ReceiveMessageService;
import smev.Service.ReportService;
import smev.Wrapper.LoadData;
import smev.Wrapper.ObjectMessage;
import smev.Wrapper.PayLoad;
import smev.converters.InteractionConverter;
import smev.dao.EntitySmev.*;
import smev.dao.RepoSmev.*;
import smev.dao.SmevDao;
import smev.exceptions.SystemException;

import java.io.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@Log4j2
public class OrderServiceImpl implements OrderService {

//    @Autowired
//    private CacheManager cacheManager;

    @Value("${order.dayTimeOUT}")
    public Integer dayTimeOUT;


    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private OrderInquiryRepo orderInquiryRepo;

    @Autowired
    private OrderInteractionRepo orderInteractionRepo;

    @Autowired
    private SubjectRepo subjectRepo;

    @Autowired
    private OrderTemplateRepo orderTemplateRepo;

    @Autowired
    private DataSubjectRepo dataSubjectRepo;

    @Autowired
    private CreateMessageService createMessageService;

    @Autowired
    private BusinessService businessService;

    @Autowired
    private OrderReestrDao orderReestrDao;

    @Autowired
    private ReceiveMessageService receiveMessageService;

    @Autowired
    private InquiryVersionRepo inquiryVersionRepo;

    @Autowired
    private BusinessInteractionRepo businessInteractionRepo;

    @Autowired
    private SmevDao smevDao;



    @Autowired
    private ReportService reportService;

    @Autowired
    PDFMerger pdfMerger;

    @Autowired
    OrderConverter orderConverter;

    @Override
    public void removeOrder(UUID orderId) {
        orderInquiryRepo.deleteByOrderId(orderId);
        orderRepo.deleteById(orderId);
    }

    private int count(List<OrderInquiryEntity> list) {
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override
    public List<OrderDto> orders(UserDto user, DataRequestOrders reqData) {
        UserEntity userEntity = this.userService.getByNameDomain(user.getUserName());


        //List<OrderEntity> orders = orderRepo.findAll();
//        List<OrderEntity> orders = orderRepo.findAll2();

        List<UUID> uuidOrders = this.smevDao.getOrders(userEntity.getId(), reqData);
        List<OrderEntity> orders = this.orderRepo.findAllById(uuidOrders);

        //        List<BusinessInteractionEntity> interactions =  businessService.getData(list);//this.businessService.getOutgoingInteractions(InteractionDirection.OUTGOING, userEntity.getId(), dataRequestInteractions)
//        List<OrderEntity> result = new ArrayList<>();
//        for (OrderEntity orderEntity : orders) {
//            if (orderEntity != null) {
//                if (!StatusOrder.DELETED.equals(orderEntity.getStatusId())) {
//                    if (userEntity.getRoleView().stream()
//                            .filter(roleView -> roleView.getInteractionDirection().equals(InteractionDirection.OUTGOING))
//                            .anyMatch(roleView -> roleView.getInteractionType().equals(orderEntity.getInquiryVersion().getInteractionType()))) {
//                        result.add(orderEntity);
//                    }
//                }
//            }
//        }
//        long endTime2 = System.currentTimeMillis();
//        long processingTime2 = endTime2 - startTime2;
//        log.info("getData = " + processingTime2);

        return orderConverter.entityListToDtoList(orders);
//        return OrderConverter.MAPPER.entityListToDtoList(orders);


    }

    @Override
    public List<OrderInquiryDto> orderInquirys(UUID orderId) {
        Optional<List<OrderInquiryEntity>> orderInquiryByOrderId = orderInquiryRepo.getOrderInquiryByOrderId(orderId);
        List<OrderInquiryDto> inquiryDtos = orderInquiryByOrderId.map(OrderInquiryConverterImpl.MAPPER::entityListToDtoList).orElse(new ArrayList<>());

        //выборка всех ВС в кеш и потом list to Map
        //inquiryVersionRepo.findAll();
        Map<UUID, InquiryVersionEntity> collect1 = inquiryVersionRepo.findAll()
                .stream()
                .collect(Collectors.toMap(InquiryVersionEntity::getId, Function.identity()));


        //через IN для взаимодействия
        List<UUID> list = new ArrayList<>();
        for (OrderInquiryDto inquiryDto : inquiryDtos) {
            List<OrderInteractionDto> interactionDtoList = inquiryDto.getOrderInteractionDtos();
            for (OrderInteractionDto dto : interactionDtoList) {
                list.add(dto.getInteractionId());
            }
        }
        List<BusinessInteractionEntity> interactionEntities = businessInteractionRepo.findAllById(list);
        interactionEntities.forEach(businessInteractionEntity -> {
            businessInteractionEntity.setMessages(smevDao.getMessagesByInteractionId(businessInteractionEntity.getId()));
        });
        Map<UUID, BusinessInteractionEntity> mapListInteractions = interactionEntities.stream().collect(Collectors.toMap(BusinessInteractionEntity::getId, Function.identity()));


//через IN
//        List<InquiryVersionEntity> allById = inquiryVersionRepo.findAllById(inquiryDtos.stream()
//                .map(OrderInquiryDto::getIdInquiry)
//                .collect(Collectors.toList())
//        );
//        Map<UUID, InquiryVersionEntity> collect1 = allById.stream().collect(Collectors.toMap(InquiryVersionEntity::getId, Function.identity()));
//        inquiryDtos.forEach(orderInquiryDto -> orderInquiryDto.setInquiryName(collect1.get(orderInquiryDto.getIdInquiry()).getDescription()));


        inquiryDtos.forEach(orderInquiryDto -> {
            orderInquiryDto.setInquiryName(collect1.get(orderInquiryDto.getIdInquiry()).getDescription());
            orderInquiryDto.getOrderInteractionDtos().forEach(orderInteractionDto -> {
                orderInteractionDto.setInteractionInfoDto(InteractionConverter.toInfo(mapListInteractions.get(orderInteractionDto.getInteractionId())));
                orderInteractionDto.setCreationDate((mapListInteractions.get(orderInteractionDto.getInteractionId()).getCreationDate()));
            });
        });


        return inquiryDtos;
    }

    @Override
    public byte[] getPdfByOrderId(UUID orderId) throws Exception {
//        Optional<List<Object[]>> interactionFromOrder = orderInquiryRepo.getInteractionFromOrder(UUID.fromString("67df8123-5f5a-4e59-b42e-7e4d4a9895e6"));
        Optional<List<Object[]>> interactionFromOrder = orderInquiryRepo.getInteractionFromOrder(orderId);
        List<UUID> list = new ArrayList<>();
        Map<UUID, UUID> map = new HashMap<>();
        for (Object[] borderTypes : interactionFromOrder.get()) {
            map.put((UUID) borderTypes[0], (UUID) borderTypes[1]);
            list.add((UUID) borderTypes[0]);
        }
//все взаимодействия по данному заявлению
        List<BusinessInteractionEntity> listInter1 = businessInteractionRepo.findAllById(list);

//получаем взаимодейстия у которых есть сообщение с ответом или сообщение с возвратом
//если есть взаимодействия с ошибкой то обработка всего заявления будет с ошибкой.
        List<BusinessInteractionEntity> listInter = listInter1.stream()
                .filter(i -> i.getMessages2().stream()
                        .anyMatch(m ->
                                m.getType().equals(MessageType.RESPONSE)
                                        &
                                        (m.getMode().equals(MessageMode.MESSAGE)
                                                |
                                                m.getMode().equals(MessageMode.REJECT)
                                        )
                                        &
                                        m.getState().equals(MessageState.RECEIVED)
                        )
                )
                .collect(Collectors.toList());

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        final File outputFile = new File("C:\\01\\", "testPDF.pdf");
//        FileOutputStream stream = null;
//        try {
//            stream = new FileOutputStream(outputFile);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        List<InputStream> inputPdfList = new ArrayList<InputStream>();
        listInter.forEach(i -> {
            if (InquiryVersionEnum.InquiryById(i.getInquiryVersionId()).templateName().equals("")) {
                return;
            }
            ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
            ReportDataDto report = new ReportDataDto();
            report.setInteractionId(i.getId());
            report.setXsltForm(InquiryVersionEnum.InquiryById(i.getInquiryVersionId()).templateName().concat(".xsl"));

            String s = this.reportService.CreateReport(report);
            HtmlConverter.convertToPdf(s, outputStream2);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream2.toByteArray());
            inputPdfList.add(inputStream);
        });

        if (listInter.size() > 0) {
            pdfMerger.mergePdfFiles(inputPdfList, outputStream);
            return outputStream.toByteArray();
        }
        return null;
    }

    public Boolean Check_SNILS_INN(UUID idOrder) {
        Optional<List<OrderInquiryEntity>> list = orderInquiryRepo.getOrderInquiryByNotStatusOrder(StatusOrder.SUCCESS, idOrder.toString());
        if (!list.isPresent()) {
            return true;
        }

        //HashSet<String> set = new HashSet<>();
       // set.forEach(System.out::println);

        int countSnilsInn = count(countSnilsInn(list.get()));
        if (countSnilsInn == 0) {
            return true;
        }
        int countSnilsInnSUCCESS = count(countSnilsInnSUCCESS(list.get()));
        if (countSnilsInn == countSnilsInnSUCCESS) {
            return true;

        }
        return false;
    }

    @Scheduled(fixedDelay = 5000, initialDelay = 5000)
    public void run() {

        List<OrderEntity> listOrder = orderRepo.getByProcessStatusOrder(ProcessStatusOrder.IN_WORK);
        for (OrderEntity oneOrder : listOrder) {
            Optional<List<OrderInquiryEntity>> orderInquiryAll = orderInquiryRepo.getOrderInquiryByOrderId(oneOrder.getId());
            if (!orderInquiryAll.isPresent()) return;

            List<OrderInquiryEntity> notSuccess = OrderService.getNotSuccess(orderInquiryAll.get());
            if (notSuccess == null) return;

            List<OrderInquiryEntity> orderInquiryAllFinish = runSchedullerOrder(notSuccess, oneOrder.getId());

            //обновим orderInquiryAll на состояния из orderInquiryAllFinish
            orderInquiryAllFinish.forEach(orderInquiryEntity -> {
                for (int i = 0; i < orderInquiryAll.get().size(); i++) {
                    if (orderInquiryAll.get().get(i).getId().equals(orderInquiryEntity.getId())) {
                        orderInquiryAll.get().set(i, orderInquiryEntity);
                    }
                }
            });

            //обновить статус всего заявления
            OrderService.orderState(oneOrder, orderInquiryAll.get());
            orderRepo.save(oneOrder);
        }


        // if (!oneOrder.isPresent()) return;


    }


    private List<OrderInquiryEntity> countSnilsInn(List<OrderInquiryEntity> orderInquiryEntityList) {
        if (orderInquiryEntityList == null || orderInquiryEntityList.isEmpty()) {
            return null;
        }
        return (List<OrderInquiryEntity>) orderInquiryEntityList.stream()
                .filter(orderInquiryEntity -> InquiryVersionEnum.InquiryById(orderInquiryEntity.getInquiryId()).equals(InquiryVersionEnum.SNILS) | InquiryVersionEnum.InquiryById(orderInquiryEntity.getInquiryId()).equals(InquiryVersionEnum.INN))
                .collect(Collectors.toList());
    }

    private List<OrderInquiryEntity> countSnilsInnSUCCESS(List<OrderInquiryEntity> orderInquiryEntityList) {
        if (orderInquiryEntityList == null || orderInquiryEntityList.isEmpty()) {
            return null;
        }
        return (List<OrderInquiryEntity>) orderInquiryEntityList.stream()
                .filter(orderInquiryEntity -> InquiryVersionEnum.InquiryById(orderInquiryEntity.getInquiryId()).equals(InquiryVersionEnum.SNILS) | InquiryVersionEnum.InquiryById(orderInquiryEntity.getInquiryId()).equals(InquiryVersionEnum.INN))
                .filter(orderInquiryEntity -> OrderInquiryState.SUCCESS.equals(orderInquiryEntity.getOrderInquiryState()))
                .collect(Collectors.toList());
    }

    @Override
    public List<OrderInquiryEntity> runSchedullerOrder(List<OrderInquiryEntity> list, UUID idOrder) {
        List<OrderInquiryDto> listOrderInquiryDtos = OrderInquiryConverter.MAPPER.entityListToDtoList(list);
        List<OrderInteractionEntity> listInteraction = new ArrayList<>();
        Boolean checkSnilsInn = Check_SNILS_INN(idOrder);
        listOrderInquiryDtos.forEach(orderInquiry -> {
            InquiryVersionEnum inquiryVersionEnum = InquiryVersionEnum.InquiryById(orderInquiry.getIdInquiry());

            //посмотреть есть ли ответы по ключевым ВС(СНИЛС и ИНН) без которых другие вс делать нельзя
            if (!(inquiryVersionEnum.equals(InquiryVersionEnum.SNILS)
                    | inquiryVersionEnum.equals(InquiryVersionEnum.INN))) {
                if (!checkSnilsInn) {
                    return;
                }
            }
            List<Optional<OrderInteractionEntity>> listOrderInteraction = orderInteractionRepo.findByOrderInquiryId(orderInquiry.getId());
            if (listOrderInteraction.size() == 0) {
                //создание взаимодействия и добавления его в массив
                listInteraction.addAll(createInteractionOneOrMore(orderInquiry, inquiryVersionEnum));
            } else {
                for (Optional<OrderInteractionEntity> ordInter : listOrderInteraction) {
                    if (ordInter.get().getInteractionId() != null) {
                        //разбор взаимодействия
                        ParsingInteractionOrder(orderInquiry, ordInter.get().getInteractionId());
                    }
                }
            }


//            if (listOrderInquiryId.size() > 0) {
//                //несколько взаимодействий по одному ВС
//                for (Optional<OrderInteractionEntity> ordInter : listOrderInquiryId) {
//                    if (ordInter.get().getInteractionId() != null) {
//                        //разбор взаимодействия
//                        ParsingInteractionOrder(orderInquiry, ordInter.get().getInteractionId());
//                    } else {
//                        //создание взаимодействия
//                        createInteractionOneOrMore(orderInquiry, inquiryVersionEnum);
//                    }
//                }
//            } else {
//                //создание взаимодействия
//                createInteractionOneOrMore(orderInquiry, inquiryVersionEnum);
//            }

            //сделал через Batch
//            OrderInquiryEntity s = OrderInquiryConverter.MAPPER.dtoToEntity(orderInquiry);
//            orderInquiryRepo.save(s);
        });

        List<OrderInquiryEntity> orderInquiryEntities = OrderInquiryConverter.MAPPER.dtoListToEntityList(listOrderInquiryDtos);

        if (listInteraction.size() > 0) {
            orderInteractionRepo.saveAll(listInteraction);
        }
        orderInquiryRepo.saveAll(orderInquiryEntities);
        return orderInquiryEntities;
    }

    private List<OrderInteractionEntity> createInteractionOneOrMore(OrderInquiryDto orderInquiryDTO, InquiryVersionEnum inquiryVersionEnum) {
        List<OrderInteractionEntity> list = new ArrayList<>();
        LoadData loadData = new LoadData();
        switch (inquiryVersionEnum) {
            case REESTR_LIC: {
                loadData.setParamInteger1(orderInquiryDTO.getOrderInquiryWhoIsEnum().ordinal());
                list.add(createInteractionForOrder(orderInquiryDTO, loadData, inquiryVersionEnum));
            }
            break;
            case NDFL2:
            case NDIPSR:
            case NDFL3: {
                Optional<OrderEntity> orderById = orderRepo.findById(orderInquiryDTO.getIdOrder());
                Month orderMonth = orderById.get().getOrderDate().getMonth();
                List<Integer> listparam = new ArrayList<>();
                listparam.add(2020);
                listparam.add(2021);
                listparam.forEach(integer -> {
                    loadData.setParamInteger1(integer);
                    list.add(createInteractionForOrder(orderInquiryDTO, loadData, inquiryVersionEnum));
                });
                break;
            }
            default:
                list.add(createInteractionForOrder(orderInquiryDTO, loadData, inquiryVersionEnum));
        }
        return list;
    }

    private OrderInteractionEntity createInteractionForOrder(OrderInquiryDto orderInquiryDTO, LoadData loadData, InquiryVersionEnum inquiryVersionEnum) {
        Optional<DataSubjectEntity> byId = dataSubjectRepo.findById(new DataSubjectEntityPK(orderInquiryDTO.getIdRegion(), orderInquiryDTO.getIdSubject()));
        Gson gson = new GsonBuilder().create();
        SubjectDataDTO subjectDataDTO = gson.fromJson(byId.get().getDataJsonSubject(), SubjectDataDTO.class);

        Subject subject = new Subject();
        subject.setID_REGION(orderInquiryDTO.getIdRegion());
        subject.setID_SUBJECT(orderInquiryDTO.getIdSubject());
        subject.setID_BASE(subjectDataDTO.getID_BASE());
        subject.setSurname(subjectDataDTO.getSurname());
        subject.setName(subjectDataDTO.getName());
        subject.setSecname(subjectDataDTO.getSecname());
        subject.setBirthDay(subjectDataDTO.getBirthday());
        PayLoad payLoad = new PayLoad();
        payLoad.setPayLoadObject(subjectDataDTO);
        payLoad.setSubject(subject);
        payLoad.setLoadData(loadData);
        BusinessMessageEntity messageEntity = new BusinessMessageEntity();
        try {
            ObjectMessage message = this.createMessageService.autoCreateRequestMessageOrder(inquiryVersionEnum, messageEntity, payLoad);
            if (message == null) {
                log.error("ObjectMessage не создан так как стратегия создания заявления для вида сведений {} (UUID = {}) не реализованна", inquiryVersionEnum.name(), inquiryVersionEnum.idInquiry().toString());
                return null;
            }
            messageEntity = businessService.fillBusinessMessage(inquiryVersionEnum.idInquiry(), messageEntity);

            businessService.savePerson(subject, messageEntity.getInteractionId());
            messageEntity.setObjectMessage(message);

            businessService.saveNewContent(messageEntity);
            messageEntity.setState(MessageState.SENDING);
            businessService.saveMessage(messageEntity);
            businessService.saveMessageIntoT_Send(messageEntity);
            log.info("сообщение {} помечено для отправки", messageEntity.getIdMessage().toString());
        } catch (Exception e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }

        if (messageEntity == null) {
            log.error("Ошибка создания взамодействия для завяления {}", orderInquiryDTO.getId());
            //вызываьт throw
        } else {
            OrderInteractionEntity orderInteractionEntity = new OrderInteractionEntity(orderInquiryDTO.getId(), messageEntity.getInteractionId());
            //orderInteractionRepo.save(orderInteractionEntity);
            orderInquiryDTO.setOrderInquiryState(OrderInquiryState.IN_WORK);
            return orderInteractionEntity;
        }
        return null;
    }


    @Override
    @ApiOperation("Разбор взаимодействия")
    public void ParsingInteractionOrder(OrderInquiryDto orderInquiryDTO, UUID interactionId) {
        BusinessInteractionEntity interactionById = businessService.getInteractionById(interactionId);
        switch (interactionById.getState()) {
            case IN_WORK:
                if (orderInquiryDTO.getOrderInquiryState().equals(OrderInquiryState.UNKNOWN)) {
                    orderInquiryDTO.setOrderInquiryState(OrderInquiryState.IN_WORK);
                    //orderInquiryRepo.save(orderInquiry);
                }
                checkTimeOut(interactionById, orderInquiryDTO);
                break;
            case CLOSED:
                //смотрим ответ
                try {
                    DataSubjectEntity dataSubjectEntity = receiveMessageService.autoReceiveMessageOrder(interactionById, orderInquiryDTO);
                    if (dataSubjectEntity != null) {
                        dataSubjectRepo.save(dataSubjectEntity);
                    }
                } catch (Exception e) {
                    try {
                        log.error("Ошибка обработки ответа по взаимодействию {}, OrderInquiry = {}", interactionId, orderInquiryDTO.getId());
                        log.error(e.getMessage(), e.getCause());
                        e.printStackTrace();
                        orderInquiryDTO.setOrderInquiryState(OrderInquiryState.ERROR);
                        orderInquiryDTO.setDescription(e.getMessage());
                        orderInquiryRepo.save(OrderInquiryConverter.MAPPER.dtoToEntity(orderInquiryDTO));
                    } catch (Exception ex) {
                        log.error(ex.getMessage(), ex.getCause());
                        ex.printStackTrace();
                    }
                }
                break;
        }
    }

    private void checkTimeOut(BusinessInteractionEntity inById, OrderInquiryDto orderInquiryDTO) {
        LocalDateTime today = LocalDateTime.now();
//        if (inById.getId().equals(UUID.fromString("a50529ea-0e8f-435b-829e-79477570cc05"))) {
//            System.out.println("rff");
//        }
        BusinessMessageEntity messageEntity = inById.getMessages()
                .stream()
                .filter(mess -> mess.getMode().equals(MessageMode.STATUS))
                .filter(mess -> mess.getType().equals(MessageType.RESPONSE))
                .filter(mess -> mess.getDirection().equals(MessageDirection.INCOMING))
                .filter(mess -> mess.getState().equals(MessageState.RECEIVED))
                .findFirst().orElse(null);
        if (messageEntity != null && Duration.between(messageEntity.getCreationDate(), today).toDays() >= dayTimeOUT) {
            orderInquiryDTO.setOrderInquiryState(OrderInquiryState.TIME_OUT);
        }

    }

    @Override
    public OrderDto createOrder(OrderFromReestr orderFromReestr, Integer userId) {
        OrderEntity order = new OrderEntity();

        SubjectEntity subject = subjectRepo.findById(new SubjectEntityPK(orderFromReestr.getIdSubject(), orderFromReestr.getIdRegion())).get();
        order.setId(UUID.randomUUID());
        order.setIdRegion(subject.getIdRegion());
        order.setIdSubject(subject.getIdSubject());
        order.setCreateDate(LocalDateTime.now());
        order.setChangeDate(LocalDateTime.now());
        order.setOrderDate(orderFromReestr.getOrderDate());
        order.setIdOrderEpgu(orderFromReestr.getIdOrderEpgu());
        order.setOrderType(orderFromReestr.getTypeOrder());
        order.setStatusId(StatusOrder.PROCESS);
        order.setProcessStatusOrder(ProcessStatusOrder.IN_WORK);
        orderRepo.save(order);


        List<OrderTemplateEntity> listTemplate = orderTemplateRepo.findByOrderType(order.getOrderType()).orElseGet(() -> {
            List<OrderTemplateEntity> orderTemplateEntities = new ArrayList<>();
            return orderTemplateEntities;
        });

        Gson gson = new GsonBuilder().create();


        List<OrderInquiryEntity> listOrdInq = new ArrayList<>();
        orderFromReestr.getSubjects().forEach(sub -> {
            String subjectJson = gson.toJson(sub);
            listTemplate.forEach(orderTemplateEntity -> {
                OrderInquiryEntity s = getOrderInquiry(sub, order, orderTemplateEntity);
                if (s != null) {
                    if (sub.getID_REGION().equals(order.getIdRegion()) & sub.getID_SUBJECT().equals(order.getIdSubject())) {
                        s.setOrderInquiryWhoIsEnum(OrderInquiryWho_IsEnum.DECLARANT);
                    } else if (isChildren(sub.getBirthday())) {
                        s.setOrderInquiryWhoIsEnum(OrderInquiryWho_IsEnum.CHILD);
                    } else
                        s.setOrderInquiryWhoIsEnum(OrderInquiryWho_IsEnum.FAMILY_MEMBER);

                    listOrdInq.add(s);
                }
            });
            DataSubjectEntity dataSubjectEntity = new DataSubjectEntity(sub.getID_REGION(), sub.getID_SUBJECT());
            dataSubjectEntity.setDataJsonSubject(subjectJson);
            dataSubjectRepo.save(dataSubjectEntity);
        });
        orderInquiryRepo.saveAll(listOrdInq);

        return orderConverter.entityToDto(order);

    }


    @ApiOperation("определить для данного человеке делать данный ВС или нет")
    private OrderInquiryEntity getOrderInquiry(SubjectDataDTO sub, OrderEntity order, OrderTemplateEntity orderTemplateEntity) {

        if (test(sub, order, orderTemplateEntity.getInquiryId())) {
            OrderInquiryEntity s = new OrderInquiryEntity();
            s.setId(UUID.randomUUID());
            s.setIdRegion(sub.getID_REGION());
            s.setIdSubject(sub.getID_SUBJECT());
            s.setOrderId(order.getId());
            s.setInquiryId(orderTemplateEntity.getInquiryId());
            return s;
        }
        return null;
    }

    private boolean isChildren(LocalDate birthday) {
        long age = ChronoUnit.YEARS.between(birthday, LocalDate.now());
        return age < 18;
    }

    private boolean test(SubjectDataDTO sub, OrderEntity order, UUID inquiryId) {
        InquiryVersionEnum inc = InquiryVersionEnum.InquiryById(inquiryId);
        boolean isChildren = isChildren(sub.getBirthday());

//        смотреть на временные параметры будем когда будем создавать взаимодействие
//        if (!isChildren) {
//            return !sub.getInn().isEmpty();
//        }
//        if (isChildren) {
//            return !sub.getSnils().isEmpty();
//        }

        switch (inc) {
            case GIBDD:
                return true;
            case SNILS:
                return (sub.getSnils().isEmpty());
            case NDFL2:
                return !isChildren;
            case NDFL3:
                return true;
            case INN:
                return sub.getInn().isEmpty();
            case DOHFLNA_SP:
                return !isChildren;
            case VIP_FL:
                return !isChildren;
            case DOHFLNA:
                return !isChildren;
            case NDIPSR:
                return !isChildren;
            case ZAGS_FATAL:
                return !isChildren;
            case ZAGS_ROJD:
                return isChildren;
            case ZAGS_ZAK_BRAK:
                return !isChildren;
            case ZAGS_RAST_BRAK:
                return !isChildren;
            case ZAGS_FATHER:
                return isChildren;
            case ZAGS_RENAME:
                return isChildren;
            case SVVIPL_FL:
                return !isChildren;
            case SZN:
                return !isChildren;
            case REESTR_LIC:
                //если ребенок
                if (isChildren) {
                    return true;
                }
                //если заявитель
                if (order.getIdRegion().equals(sub.getID_REGION()) & order.getIdSubject().equals(sub.getID_SUBJECT())) {
                    return true;
                }
                break;
        }
        return false;
    }


}
