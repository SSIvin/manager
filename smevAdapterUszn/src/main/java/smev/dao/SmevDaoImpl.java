package smev.dao;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import smev.Dto.DataRequestInteractions;
import smev.Dto.LimitInteractionDto;
import smev.Dto.row;
import smev.Entity.*;
import smev.Enum.*;
import smev.GisJkh.SQL_GIS_JKH;
import smev.Mapper.*;
import smev.Reestr.Dto.DataRequestOrders;
import smev.Reestr.SQL_REESTR;
import smev.SQL;
import smev.Wrapper.ObjectMessage;
import smev.Wrapper.RequestSmev;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.dao.EntitySmev.InquiryVersionEntity;
import smev.dao.EntitySmev.OrderEntity;
import smev.exceptions.RsServiceException;
import smev.utils.util;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.sql.*;
import java.util.*;

@Repository
@Log4j2
public class SmevDaoImpl implements SmevDao {


    //private static final Gson GSON = (new GsonBuilder()).create();

    @Autowired
    @Qualifier("jdbcSmev")
    private JdbcTemplate jdbcSmev;

    @Autowired
    @Qualifier("jdbcSmevNamed")
    private NamedParameterJdbcTemplate jdbcSmevNamed;

    @Value("${rowsPerPage}")
    public Integer RowsPerPage;


    @PostConstruct
    public void init() {
        jdbcSmev.setResultsMapCaseInsensitive(true);
    }


    @Override
    public void writeToBase(String con, UUID clientId, ObjectMessage req) {
        log.info("Вставка нового запроса " + util.UUIDtoString(clientId));
        log.info("Строка запроса " + con);

//        jdbcSmev.queryForList("SELECT 1");
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcSmev.update(
                new PreparedStatementCreator() {
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement ps =
                                connection.prepareStatement(SQL.SQL_WRITE_CONTENT, new String[]{"uid"});
                        ps.setString(1, util.UUIDtoString(clientId));
                        ps.setString(2, con);
                        return ps;
                    }
                },
                keyHolder);

        log.info("idAdapter " + keyHolder.getKey());

//        jdbcSmev.insertMessage(SQL.SQL_WRITE_Request, new PreparedStatementSetter() {
//            @Override
//            public void setValues(PreparedStatement ps) throws SQLException {
//                ps.setInt(1, keyHolder.getKey().intValue());
//                ps.setString(2, clientId);
//                ps.setInt(3, req.getTypeRequest());
//                ps.setInt(4, req. getSubject() != null ? req.getSubject().getID_BASE() : 0);
//                ps.setInt(5, req.getSubject() != null ? req.getSubject().getID_REGION() : 0);
//                ps.setInt(6, req.getSubject() != null ? req.getSubject().getID_SUBJECT() : 0);
//                ps.setString(7, req.getSubject() != null ? req.getSubject().getSurname() : null);
//                ps.setString(8, req.getSubject() != null ? req.getSubject().getName_domain() : null);
//                ps.setString(9, req.getSubject() != null ? req.getSubject().getSecname() : null);
//                ps.setString(10, req.getSubject() != null ? req.getSubject().getBirthday().toString() : null);
//            }
//        });
    }

    /*
     * если в xml есть переносы но сибираем все в одну строку
     * */
    public static String trim(String input) {
        BufferedReader reader = new BufferedReader(new StringReader(input));
        StringBuffer result = new StringBuffer();
        try {
            String line;
            while ((line = reader.readLine()) != null)
                result.append(line.trim());
            return result.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    @Override
//    public List<String> getListReceive() {
//        List<String> list = new ArrayList<>();
//        jdbcSmev.query(SQL.SQL_LIST_RECEIVE
//                , new ResultSetExtractor<Object>() {
//                    @Override
//                    public List<String> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
//                        while (resultSet.next()) {
//                            log.info("Обработка записи для idAdapter: " + resultSet.getString("id"));
//                            //log.info(resultSet.getString("content"));
//                            list.add(resultSet.getString("content"));
//                        }
//                        return list;
//                    }
//                });
//        return list;
//    }

    @Override
    public void updateGuid(int idAdapter, String requestId, String responseId) {
        jdbcSmev.update(SQL.UPDATE_RESP, requestId, responseId);
    }

    @Override
    public void updateStatusMessage(MessageType status, String clientId, String replyToClientId, String code, String description) {
//        jdbcSmev.insertMessage(SQL.UPDATE_processInRECEIVE, clientId);
//        log.info("Обработка записи idSend: " + replyToClientId + " - " + description );
//        jdbcSmev.insertMessage(SQL.UPDATE_REQUEST,
//                new MapSqlParameterSource("replyToClientId", replyToClientId)
//                       .addValue("clientId", clientId)
//                        .addValue("code", code)
//                        .addValue("description", description)
//        );

        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcSmev)
                .withProcedureName(SQL.P_UPDATE_STATUS_MESSAGE)
                .declareParameters(
                        new SqlParameter("replyToClientId", Types.NVARCHAR)
                        , new SqlParameter("clientId", Types.NVARCHAR)
                        , new SqlParameter("code", Types.NVARCHAR)
                        , new SqlParameter("description", Types.NVARCHAR)
                        , new SqlParameter("status", Types.NVARCHAR)
                );
        MapSqlParameterSource paramMap = new MapSqlParameterSource()
                .addValue("replyToClientId", replyToClientId)
                .addValue("clientId", clientId)
                .addValue("code", code)
                .addValue("description", description)
                .addValue("status", status);

        jdbcCall.execute(paramMap);
    }

    @Override
    @Transactional(value = "jdbcSmevTransactionManager", propagation = Propagation.NEVER, isolation = Isolation.READ_COMMITTED)
    public List<Map<String, Object>> getListMapReceive() {
        return jdbcSmev.queryForList(SQL.SQL_LIST_RECEIVE);
    }

    @Override
    public void updateReciv(String id) {
        jdbcSmev.update(SQL.UPDATE_processInRECEIVE, id);
    }

    @Override
    public void updateMessagePrimary(MessageType status, String clientId, String replyToClientId, String code, String description) {
//        jdbcSmev.insertMessage(SQL.UPDATE_processInRECEIVE, clientId);
//        log.info("Обработка записи idSend: " + replyToClientId + "," + description);
//        jdbcSmev.insertMessage(SQL.UPDATE_MessagePrimary, code, description, clientId, replyToClientId);
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcSmev)
                .withProcedureName(SQL.P_UPDATE_PRIMARY_MESSAGE)
                .declareParameters(
                        new SqlParameter("replyToClientId", Types.NVARCHAR)
                        , new SqlParameter("clientId", Types.NVARCHAR)
                        , new SqlParameter("code", Types.NVARCHAR)
                        , new SqlParameter("description", Types.NVARCHAR)
                        , new SqlParameter("status", Types.NVARCHAR)
                );
        MapSqlParameterSource paramMap = new MapSqlParameterSource()
                .addValue("replyToClientId", replyToClientId)
                .addValue("clientId", clientId)
                .addValue("code", code)
                .addValue("description", description)
                .addValue("status", status);

        jdbcCall.execute(paramMap);

    }

    @Override
    public String getContent(Long idAdapter) {
        final String[] ss = {""};
//       java.util.UUID uuid = java.util.UUID.fromString("B7456710-A94C-4A1E-A4B7-B9990C56ABBE");
        jdbcSmev.query(SQL.SQL_RESP
                , new PreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setLong(1, idAdapter);
                        //preparedStatement.setString(1, "B7456710-A94C-4A1E-A4B7-B9990C56ABBE");
                    }
                }
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet resultSet) throws SQLException {
                        ss[0] = resultSet.getString("content");
                    }
                }
        );
//        if (!list.isEmpty()) {
//            return list.get(0);
//        }
        return ss[0];
    }

    @Override
    public List<RequestSmev> allRequestSmev() {
        List<RequestSmev> list = new ArrayList<>();
        jdbcSmev.query(SQL.LIST_ALL_REQUEST_SMEV
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        list.add(RequestSmev.builder()
                                .idAdapter(rs.getInt("idAdapter"))
                                .idSend(rs.getString("idSend"))
                                .typeRequest(rs.getInt("typeRequest"))
                                .nameTypeRequest(TypeRequestSmev.getTypeRequestSmevById(rs.getInt("typeRequest")).typeName())
                                .subject(Subject.builder()
                                        .ID_BASE(rs.getInt("ID_BASE"))
                                        .ID_REGION(rs.getInt("ID_REGION"))
                                        .ID_SUBJECT(rs.getInt("ID_SUBJECT"))
                                        .Surname(rs.getString("Surname"))
                                        .Name(rs.getString("Name"))
                                        .Secname(rs.getString("Secname"))
                                        .birthDay(rs.getDate("Birthdate") == null ? null : rs.getDate("Birthdate").toLocalDate())
                                        .build())
                                .idResponse(rs.getString("idResponse"))
                                .description(rs.getString("description"))
                                .build());
                    }
                }
        );
        return list;
    }

    @Override
    public void insertMessageIntoT_Send(BusinessMessageEntity messageEntity) {
        jdbcSmev.update(SQL.SQL_WRITE_CONTENT
                , new PreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps) throws SQLException {
                        ps.setString(1, util.UUIDtoString(messageEntity.getSendId()));
                        ps.setString(2, messageEntity.getContent());
                    }
                }
        );
    }

    MapSqlParameterSource setParam(BusinessMessageEntity messageEntity) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource
                .addValue("SEND_ID", messageEntity.getSendId(), Types.VARCHAR)
                .addValue("ID_MESSAGE", util.UUIDtoString(messageEntity.getIdMessage()), Types.VARCHAR)
                .addValue("RECEIVE_ID", util.UUIDtoString(messageEntity.getReceiveId()), Types.VARCHAR)
                .addValue("INTERACTION_ID", util.UUIDtoString(messageEntity.getInteractionId()), Types.VARCHAR)
                .addValue("USER_ID", messageEntity.getUserId(), Types.INTEGER)
                .addValue("REFERENCE_ID", util.UUIDtoString(messageEntity.getReferenceId()), Types.VARCHAR)
                .addValue("DIRECTION", messageEntity.getDirection().name(), Types.VARCHAR)
                .addValue("MODE", messageEntity.getMode().name(), Types.VARCHAR)
                .addValue("TYPE", messageEntity.getType().name(), Types.VARCHAR)
                .addValue("STATE", messageEntity.getState().name(), Types.VARCHAR)
                .addValue("CONTENT_ID", util.UUIDtoString(messageEntity.getContentId()), Types.VARCHAR)
                .addValue("SMEV_MESSAGE_ID", util.UUIDtoString(messageEntity.getSmevMessageId()), Types.VARCHAR)
                .addValue("PERSONAL_SIGNATURE", messageEntity.getPersonalSignature(), Types.BOOLEAN)
                .addValue("DESCRIPTION", messageEntity.getDescription(), Types.VARCHAR)
                .addValue("CODE", messageEntity.getCode(), Types.VARCHAR)
                .addValue("CHANGE_DATE", Timestamp.from(java.time.Instant.now()), Types.DATE);
        return parameterSource;
    }

    @Override
    public void insertMessage(BusinessMessageEntity messageEntity) {
        //KeyHolder keyHolder = new GeneratedKeyHolder();
        messageEntity.setIdMessage(UUID.randomUUID());
        jdbcSmevNamed.update(SQL.INSERT_MESSAGE
                , setParam(messageEntity)
        );
//        jdbcSmev.update(
//               new PreparedStatementCreator() {
//                    @Override
//                    public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
//                        PreparedStatement ps =
//                                con.prepareStatement(SQL.INSERT_MESSAGE, new String[]{"ID_MESSAGE"});
//                        setParamForMessage(ps, messageEntity);
//                        return ps;
//                    }
//                },
//                keyHolder
//        );
        /*из-за not EXIST делаем проверку на null*/

        //messageEntity.setIdMessage(UUID.fromString(String.valueOf(keyHolder.getKeyList().get(0).get("ID_MESSAGE"))));
//        messageEntity.setIdMessage(keyHolder.getKey() == null ? null : keyHolder.getKey().);
        if (log.isDebugEnabled()) {
            log.info("----insertContent MESSAGE: {}:", messageEntity.toString());
        }
    }


    @Override
    public void updateProcessInT_Receive(String receiveId, ReceiveMessageStatus receiveMessageStatus) {
        jdbcSmev.update(SQL.UPDATE_processInRECEIVE, receiveMessageStatus.index(), receiveId);
        log.info("update table t_receive process = 0 for message id = {} ", receiveId);
    }

    @Override
    public void insertInteractionEntity(BusinessInteractionEntity interaction) {

        jdbcSmev.update(SQL.InsertInteractionEntity
                , new PreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps) throws SQLException {
                        ps.setObject(1, interaction.getId());
                        ps.setObject(2, interaction.getInquiryVersion().getId());
                        ps.setObject(3, interaction.getUser());
                        ps.setObject(4, interaction.getDirection().name());
                        ps.setObject(5, interaction.getState().name());
                        ps.setBoolean(6, interaction.isTest());
                    }
                }

        );

    }

    @Override
    public void update(BusinessInteractionEntity interaction) {
        jdbcSmevNamed.update(SQL.UPDATE_INTERACTION
                , new MapSqlParameterSource()
                        .addValue("ID", interaction.getId())
                        .addValue("INQUIRY_VERSION_ID", interaction.getInquiryVersion().getId())
                        .addValue("USER_ID", interaction.getUser())
                        .addValue("DIRECTION", interaction.getDirection().name())
                        .addValue("STATE", interaction.getState().name())
                        .addValue("TEST", interaction.isTest())
        );
    }

    @Override
    public InquiryVersionEntity getById(UUID inquiryVersionId) {
        InquiryVersionEntity inquiryVersionEntity = null;
        //InquiryVersionEntity = jdbcSmev.queryForObject(sql, BeanPropertyRowMapper.newInstance(InquiryVersionEntity.class)) == null ? null : null;
        try {
            inquiryVersionEntity = jdbcSmev.queryForObject(SQL.InquiryVersionEntityGetById
                    , new Object[]{inquiryVersionId}
                    , BeanPropertyRowMapper.newInstance(InquiryVersionEntity.class)
            );
        } catch (EmptyResultDataAccessException e) {

        }
        return inquiryVersionEntity;
    }

    @Override
    public BusinessAttachmentEntity getAttachmentById(UUID attachmentId) {

        List<BusinessAttachmentEntity> entityList = new ArrayList<>();
        jdbcSmev.query(SQL.AttachmentEntityById
                , new Object[]{attachmentId}
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        BusinessAttachmentEntity entity = fillAttachmentEntity(rs);
                        entity.setContent(rs.getBytes("CONTENT"));
                        entityList.add(entity);
                    }
                }
        );
        return entityList.isEmpty() ? null : entityList.get(0);

    }


    @Override
    @Transactional(value = "jdbcSmevTransactionManager", propagation = Propagation.NEVER, isolation = Isolation.READ_UNCOMMITTED)
    public BusinessMessageEntity MessageByClientId(UUID clientId) {
        if (clientId == null) {
            return null;
        }
        List<BusinessMessageEntity> entityList = new ArrayList<>();
        jdbcSmev.query(SQL.MessageEntityByClientId
                , new Object[]{clientId}
                //, BeanPropertyRowMapper.newInstance(BusinessMessageEntity.class)
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        BusinessMessageEntity entity = fillBusinessMessageEntity(rs);
                        entityList.add(entity);
                    }
                }
        );
        return entityList.isEmpty() ? null : entityList.get(0);
    }

    @Override
    public BusinessMessageEntity MessageBySmevId(UUID clientId) {
        if (clientId == null) {
            return null;
        }
        List<BusinessMessageEntity> entityList = new ArrayList<>();
        jdbcSmev.query(SQL.MessageEntityBySmevId
                , new Object[]{clientId}
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        BusinessMessageEntity entity = fillBusinessMessageEntity(rs);
                        entityList.add(entity);
                    }
                }
        );
        return entityList.isEmpty() ? null : entityList.get(0);
    }

    @Override
    @Transactional(value = "jdbcSmevTransactionManager", propagation = Propagation.NEVER, isolation = Isolation.READ_UNCOMMITTED)
    public List<LimitInteractionDto> getLimitInteractionDtos(InteractionDirection paramInteractionDirection, Integer userId, DataRequestInteractions dataRequestInteractions) {
        List<LimitInteractionDto> list = new ArrayList<>();
        jdbcSmevNamed.query(SQL.ListInteractionsPage2
                , new MapSqlParameterSource()
                        .addValue("DIRECTION", paramInteractionDirection.name())
                        .addValue("PageNumber", dataRequestInteractions.getPageNum())
                        .addValue("inquiryId", dataRequestInteractions.getInquiryId() == null ? "" : dataRequestInteractions.getInquiryId())
                        .addValue("SURNAME", dataRequestInteractions.getPersonFilter().getSurname())
                        .addValue("NAME", dataRequestInteractions.getPersonFilter().getFirstname())
                        .addValue("SECNAME", dataRequestInteractions.getPersonFilter().getSecname())
                        .addValue("BIRTHDAY", dataRequestInteractions.getPersonFilter().getBirthday())
                        .addValue("ID_SUBJECT", dataRequestInteractions.getPersonFilter().getIdSubject())
                        .addValue("ID_REGION", dataRequestInteractions.getPersonFilter().getIdRegion())
                        .addValue("SNILS", "")
                        .addValue("RegionUser", dataRequestInteractions.getRegionUser())
                        .addValue("USER_ID", userId)
                        .addValue("personFilterFlag", dataRequestInteractions.getPersonFilterFlag())
                        .addValue("RowsPerPage", RowsPerPage)

                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        list.add(LimitInteractionDto.fillDto(rs));
                    }
                }
        );

        return list;
    }


//    @Override
//    @Transactional(value = "jdbcSmevTransactionManager", propagation = Propagation.NEVER, isolation = Isolation.READ_UNCOMMITTED)
//    public List<BusinessInteractionEntity> getListInteractions(InteractionDirection paramInteractionDirection, Integer userId, DataRequestInteractions dataRequestInteractions) {
//        List<BusinessInteractionEntity> entityList = new ArrayList<>();
//        jdbcSmevNamed.query(SQL.ListInteractionsPage
//                , new MapSqlParameterSource()
//                        .addValue("DIRECTION", paramInteractionDirection.name())
//                        .addValue("PageNumber", dataRequestInteractions.getPageNum())
//                        .addValue("inquiryId", dataRequestInteractions.getInquiryId() == null ? "" : dataRequestInteractions.getInquiryId())
//                        .addValue("SURNAME", dataRequestInteractions.getPersonFilter().getSurname())
//                        .addValue("NAME", dataRequestInteractions.getPersonFilter().getFirstname())
//                        .addValue("SECNAME", dataRequestInteractions.getPersonFilter().getSecname())
//                        .addValue("BIRTHDAY", dataRequestInteractions.getPersonFilter().getBirthday())
//                        .addValue("ID_SUBJECT", dataRequestInteractions.getPersonFilter().getIdSubject())
//                        .addValue("ID_REGION", dataRequestInteractions.getPersonFilter().getIdR())
//                        .addValue("SNILS", "")
//                        .addValue("RegionUser", dataRequestInteractions.getRegionUser())
//                        .addValue("USER_ID", userId)
//                        .addValue("personFilterFlag", dataRequestInteractions.getPersonFilterFlag())
//                        .addValue("RowsPerPage", 22)
//                , new RowCallbackHandler() {
//                    @Override
//                    public void processRow(ResultSet rs) throws SQLException {
//                        entityList.add(getBusinessInteractionEntity(rs));
//                    }
//                }
//        );
//
//        return entityList;
//    }

    //    переделал вместо query на SimpleJdbcCall так как когда нет данных то query вызывает ошибку
//    да и раз процедуру вызываю то так красивее, но геморней))
    @Override
    @Transactional(value = "jdbcSmevTransactionManager", propagation = Propagation.NEVER, isolation = Isolation.READ_UNCOMMITTED)
    public List<BusinessInteractionEntity> getListInteractions(InteractionDirection paramInteractionDirection, Integer userId, DataRequestInteractions dataRequestInteractions) {

        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcSmev)
                .withProcedureName(SQL.ListInteractionsPage)
                .returningResultSet("items", new BisinnesIntMapper());

        MapSqlParameterSource paramMap = new MapSqlParameterSource()
                .addValue("DIRECTION", paramInteractionDirection.name())
                .addValue("PageNumber", dataRequestInteractions.getPageNum())
                .addValue("inquiryId", dataRequestInteractions.getInquiryId() == null ? "" : dataRequestInteractions.getInquiryId())
                .addValue("SURNAME", dataRequestInteractions.getPersonFilter().getSurname())
                .addValue("NAME", dataRequestInteractions.getPersonFilter().getFirstname())
                .addValue("SECNAME", dataRequestInteractions.getPersonFilter().getSecname())
                .addValue("BIRTHDAY", dataRequestInteractions.getPersonFilter().getBirthday())
                .addValue("ID_SUBJECT", dataRequestInteractions.getPersonFilter().getIdSubject())
                .addValue("ID_REGION", dataRequestInteractions.getPersonFilter().getIdRegion())
                .addValue("SNILS", "")
                .addValue("RegionUser", dataRequestInteractions.getRegionUser())
                .addValue("USER_ID", userId)
                .addValue("personFilterFlag", dataRequestInteractions.getPersonFilterFlag())
                .addValue("dateCreateFilterFlag", dataRequestInteractions.getDateCreateFilterFlag())
                .addValue("editCreateDateS", dataRequestInteractions.getEditCreateDateS())
                .addValue("editCreateDatePO", dataRequestInteractions.getEditCreateDatePO())
                .addValue("RowsPerPage", 22);

        List<BusinessInteractionEntity> arr = (List<BusinessInteractionEntity>) jdbcCall.execute(paramMap).get("items");
        if (arr == null) {
            return new ArrayList<>();
        }
        for (BusinessInteractionEntity interactionEntity : arr) {
            interactionEntity.setInquiryVersion(getInquiryVersionById(interactionEntity.getInquiryVersion().getId()));
            interactionEntity.setSubject(getSubjectByInteractionId(interactionEntity.getId()));
            interactionEntity.setMessages(getMessagesByInteractionId(interactionEntity.getId()));
        }
        return arr;
    }


    @Override
    public BusinessInteractionEntity getBusinessInteractionEntity(LimitInteractionDto limitDto) {
        return BusinessInteractionEntity.builder()
                .id(limitDto.getId())
                .inquiryVersion(getInquiryVersionById(limitDto.getInquiryVersion()))
                .user(limitDto.getUserId())
                .direction(InteractionDirection.valueOf(limitDto.getDirection()))
                .state(InteractionState.valueOf(limitDto.getState()))
                .test(limitDto.getTest())
                .subject(getSubjectByInteractionId(limitDto.getId()))
                .messages(getMessagesByInteractionId(limitDto.getId()))
                .creationDate(limitDto.getCreationDate())
                .build();
    }

    private BusinessInteractionEntity getBusinessInteractionEntity(ResultSet rs) throws SQLException {
//        long startTime = System.currentTimeMillis();
//        long endTime = System.currentTimeMillis();
//        long processingTime = endTime - startTime;
//        log.info(processingTime);
        return BusinessInteractionEntity.builder()
                .id(util.StringToUUID(rs.getString("ID")))
                .inquiryVersion(getInquiryVersionById(util.StringToUUID(rs.getString("INQUIRY_VERSION_ID"))))
                .user(rs.getInt("USER_ID"))
                .direction(InteractionDirection.valueOf(rs.getString("DIRECTION")))
                .state(InteractionState.valueOf(rs.getString("STATE")))
                .test(rs.getBoolean("TEST"))
                .subject(getSubjectByInteractionId(util.StringToUUID(rs.getString("ID"))))
                .messages(getMessagesByInteractionId(util.StringToUUID(rs.getString("ID"))))
                .creationDate(util.DatetoLocalDateTime(rs.getTimestamp("CREATION_DATE")))
                .build();
    }

    private MessageSettingsEntity fillMessageSettingsEntity(ResultSet rs) throws SQLException {
        return MessageSettingsEntity.builder()
                .id(util.StringToUUID(rs.getString("ID")))
                .inquiryVersionId(util.StringToUUID(rs.getString("INQUIRY_VERSION_ID")))
                .mode(rs.getString("STRUCTURE_MODE"))
                .source(rs.getString("STRUCTURE_SOURCE"))
                .from(rs.getString("STRUCTURE_FROM"))
                .rootElement(rs.getString("ROOT_ELEMENT"))
                .contentElement(rs.getString("CONTENT_ELEMENT"))
                .dynamicRouting(rs.getBoolean("DYNAMIC_ROUTING"))
                .identifierRouting(rs.getBoolean("IDENTIFIER_ROUTING"))
                .attachments(rs.getBoolean("ATTACHMENTS"))
                .personalSignature(rs.getBoolean("PERSONAL_SIGNATURE"))
                .creationDate(util.DatetoLocalDateTime(rs.getTimestamp("CREATION_DATE")))
                .changeDate(util.DatetoLocalDateTime(rs.getTimestamp("CHANGE_DATE")))
                .build();
    }


    private InquiryVersionEntity getInquiryVersionById(UUID id) {
        InquiryVersionEntity inquiryVersionEntity = new InquiryVersionEntity();

        try {
            inquiryVersionEntity = jdbcSmevNamed.queryForObject(SQL.InquiryVersionById
                    , new MapSqlParameterSource()
                            .addValue("ID", id, Types.VARCHAR)
                    , new InquiryVersionMapper()
            );
        } catch (EmptyResultDataAccessException e) {

        }
        return inquiryVersionEntity;

//        InquiryVersionEntity.builder()
//                .id(util.StringToUUID(rs.getString("INQUIRY_VERSION_ID")))
//                .description(rs.getString("DIRECTION"))
//                .testMessage(rs.getBoolean("TEST"))
//                .person(rs.getBoolean("PERSON"))
//                .build()
    }

    public Subject getSubjectByInteractionId(UUID idInteraction) {
        Subject subject = new Subject();
        try {
            subject = jdbcSmevNamed.queryForObject(SQL.SubjectByInteractionId
                    , new MapSqlParameterSource()
                            .addValue("INTERACTION_ID", idInteraction, Types.VARCHAR)
                    , new SubjectMapper()
            );
        } catch (EmptyResultDataAccessException e) {

        }
        return subject;
    }

    @Override
    @Transactional(value = "jdbcSmevTransactionManager", propagation = Propagation.NEVER, isolation = Isolation.READ_UNCOMMITTED)
    public List<BusinessMessageEntity> getMessagesByInteractionId(UUID interactionId) {
        List<BusinessMessageEntity> messageEntityList = new ArrayList<>();
        jdbcSmev.query(SQL.MessagesByInteractionId
                , new Object[]{interactionId}
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        BusinessMessageEntity entity = fillBusinessMessageEntity(rs);
                        messageEntityList.add(entity);
                    }
                }
        );
        return messageEntityList;
    }

    @Override
    @Transactional(value = "jdbcSmevTransactionManager", propagation = Propagation.NEVER, isolation = Isolation.READ_UNCOMMITTED)
    public List<BusinessMessageEntity> getMessagesWithDATAByInteractionId(UUID interactionId) {
        List<BusinessMessageEntity> messageEntityList = new ArrayList<>();
        jdbcSmev.query(SQL.MessagesByInteractionId
                , new Object[]{interactionId}
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        BusinessMessageEntity entity = fillBusinessMessageEntity(rs);
                        messageEntityList.add(entity);
                    }
                }
        );
        return messageEntityList;

    }

    @Override
    @Transactional(value = "jdbcSmevTransactionManager", propagation = Propagation.NEVER, isolation = Isolation.READ_UNCOMMITTED)
    public BusinessInteractionEntity interactionById(UUID id) {
        List<BusinessInteractionEntity> interactionEntityList = new ArrayList<>();
        jdbcSmev.query(SQL.InteractionById
                , new Object[]{id}
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        interactionEntityList.add(getBusinessInteractionEntity(rs));
                    }
                }
        );
        return interactionEntityList.isEmpty() ? null : interactionEntityList.get(0);
    }

    @Override
    public void updateMessage(BusinessMessageEntity messageEntity) {
        jdbcSmevNamed.update(SQL.UPDATE_MESSAGE
                , setParam(messageEntity)
                        .addValue("ID_MESSAGE"
                                , messageEntity.getIdMessage()
                                , Types.VARCHAR)
        );
    }

    @Override
    @Transactional(value = "jdbcSmevTransactionManager", propagation = Propagation.NEVER, isolation = Isolation.READ_UNCOMMITTED)
    public BusinessMessageEntity MessageEntityByIdMessage(UUID idMessage, boolean removeNS) {
        List<BusinessMessageEntity> entityList = new ArrayList<>();
        jdbcSmev.query(SQL.MessageEntityByIdMessage
                , new Object[]{idMessage}
                //, BeanPropertyRowMapper.newInstance(BusinessMessageEntity.class)
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        BusinessMessageEntity entity = fillBusinessMessageEntity(rs);
                        entityList.add(entity);
                    }
                }
        );
        return entityList.isEmpty() ? null : entityList.get(0);
    }

    @Override
    public List<Map<String, Object>> getListT_Send() {
        return jdbcSmev.queryForList(SQL.SQL_LIST_SEND);
    }

    @Override
    @Transactional(value = "jdbcSmevTransactionManager", propagation = Propagation.NEVER, isolation = Isolation.READ_UNCOMMITTED)
    public String getContent(UUID idContent) {
        try {
            return idContent == null ? null : jdbcSmev.queryForObject(SQL.CONTENT, new Object[]{idContent}, String.class);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public void insertContent(BusinessMessageEntity messageEntity) {
        jdbcSmevNamed.update(SQL.INSERT_CONTENT
                , new MapSqlParameterSource()
                        .addValue("ID_CONTENT", util.UUIDtoString(messageEntity.getContentId()), Types.VARCHAR)
                        .addValue("[CONTENT]", messageEntity.getContent(), Types.VARCHAR)
        );

//        jdbcSmev.update(SQL.INSERT_CONTENT
//                , new PreparedStatementSetter() {
//                    @Override
//                    public void setValues(PreparedStatement ps) throws SQLException {
//                        ps.setString(1, util.UUIDtoString(messageEntity.getContentId()));
//                        ps.setString(2, messageEntity.getContent());
//                    }
//                });
    }

    @Override
    public void updateContent(BusinessMessageEntity message) {
        jdbcSmev.update(SQL.UPDATE_CONTENT, message.getContent(), message.getContentId());
    }


    @Override
    public void insertPerson(Subject subject, UUID interactionId) {
        jdbcSmevNamed.update(SQL.INSERT_PERSON
                , new MapSqlParameterSource()
                        .addValue("INTERACTION_ID", interactionId, Types.VARCHAR)
                        .addValue("ID_BASE", subject.getID_BASE(), Types.SMALLINT)
                        .addValue("ID_REGION", subject.getID_REGION(), Types.SMALLINT)
                        .addValue("ID_SUBJECT", subject.getID_SUBJECT(), Types.INTEGER)
                        .addValue("SURNAME", subject.getSurname(), Types.VARCHAR)
                        .addValue("NAME", subject.getName(), Types.VARCHAR)
                        .addValue("SECNAME", subject.getSecname(), Types.VARCHAR)
                        .addValue("BIRTHDAY", subject.getBirthDay(), Types.DATE)
        );
    }

    @Override
    @Transactional(value = "jdbcSmevTransactionManager", propagation = Propagation.NEVER, isolation = Isolation.READ_UNCOMMITTED)
    public UserEntity getByNameDomain(String nameDomain) {
        UserEntity userEntity = null;
        try {
            userEntity = jdbcSmevNamed.queryForObject(SQL.GetUserByNameDomain
                    , new MapSqlParameterSource()
                            .addValue("userName", nameDomain, Types.VARCHAR)
                    , BeanPropertyRowMapper.newInstance(UserEntity.class)
            );
        } catch (EmptyResultDataAccessException e) {

        } catch (IncorrectResultSizeDataAccessException e) {
            throw new RsServiceException("Пользователь в системе заведен более одного раза!");
        }
        return userEntity;
    }

    @Override
    public InquiryVersionEntity getByNamespace(String namespace) {
        InquiryVersionEntity inquiryVersionEntity = null;
        //InquiryVersionEntity = jdbcSmev.queryForObject(sql, BeanPropertyRowMapper.newInstance(InquiryVersionEntity.class)) == null ? null : null;
        try {
            inquiryVersionEntity = jdbcSmev.queryForObject(SQL.InquiryVersionEntityGetByNamespace
                    , new Object[]{namespace}
                    , BeanPropertyRowMapper.newInstance(InquiryVersionEntity.class)
            );
        } catch (EmptyResultDataAccessException e) {

        }
        return inquiryVersionEntity;

    }

    @Override
    public void deleteMessage(UUID messageId) {
        this.jdbcSmevNamed.update(SQL.DELETE_MESSAGE
                , new MapSqlParameterSource()
                        .addValue("ID_MESSAGE", messageId)
        );
    }

    @Override
    @Transactional(value = "jdbcSmevTransactionManager", propagation = Propagation.NEVER, isolation = Isolation.READ_UNCOMMITTED)
    public UserEntity getUserById(Integer userId) {
        UserEntity userEntity = null;
        try {
            userEntity = jdbcSmevNamed.queryForObject(SQL.GetUserById
                    , new MapSqlParameterSource()
                            .addValue("id", userId, Types.INTEGER)
                    , BeanPropertyRowMapper.newInstance(UserEntity.class)
            );
        } catch (EmptyResultDataAccessException e) {

        }
        return userEntity;
    }

    @Override
    public void insert(BusinessAttachmentEntity attachment) {
        jdbcSmevNamed.update(SQL.INSERT_ATTACHMENT
                , new MapSqlParameterSource()
                        .addValue("ID", attachment.getId(), Types.VARCHAR)
                        .addValue("MESSAGE_ID", attachment.getMessageId(), Types.VARCHAR)
                        .addValue("TRANSFER_METHOD", attachment.getTransferMethod(), Types.VARCHAR)
                        .addValue("FILE_NAME", attachment.getFileName(), Types.VARCHAR)
                        .addValue("CONTENT_TYPE", attachment.getContentType(), Types.VARCHAR)
                        .addValue("CONTENT", attachment.getContent(), Types.BLOB)
                        .addValue("CONTENT_PATH", attachment.getContentPath(), Types.VARCHAR)
        );
    }

    @Override
    public List<BusinessAttachmentEntity> getAttachmentsByMessageId(UUID messageId) {
        return jdbcSmevNamed.query(SQL.ListBusinessAttachmentEntity
                , new MapSqlParameterSource()
                        .addValue("messageId", messageId)
                , new BeanPropertyRowMapper(BusinessAttachmentEntity.class));

    }

    @Override
    public List<BusinessMessageEntity> MessagesInteractionByMessageIdOrderDesc(UUID idMessage) {
        List<BusinessMessageEntity> entityList = new ArrayList<>();
        jdbcSmevNamed.query(SQL.MessagesInteractionByMessageIdOrderDesc
                , new MapSqlParameterSource()
                        .addValue("ID_MESSAGE", idMessage)
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        BusinessMessageEntity entity = fillBusinessMessageEntity(rs);
                        entityList.add(entity);
                    }
                }
        );
        return entityList.isEmpty() ? null : entityList;
    }

    @Override
    public BusinessMessageEntity MessageByReceiveId(UUID receiveId) {
        List<BusinessMessageEntity> entityList = new ArrayList<>();
        jdbcSmev.query(SQL.MessageEntityByReceivetId
                , new Object[]{receiveId}
                //, BeanPropertyRowMapper.newInstance(BusinessMessageEntity.class)
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        BusinessMessageEntity entity = fillBusinessMessageEntity(rs);
                        entityList.add(entity);
                    }
                }
        );
        return entityList.isEmpty() ? null : entityList.get(0);
    }

    @Override
    public Set<RoleEntity> getByRoles(Integer id) {
        Set<RoleEntity> roleEntities = new HashSet<>();
        jdbcSmevNamed.query(SQL.getRoles
                , new MapSqlParameterSource()
                        .addValue("id", id)
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        roleEntities.add(new RoleEntity(rs.getInt("id"), rs.getString("roles"), ""));
                    }
                }
        );
        return roleEntities;
    }

    @Override
    public Set<RoleView> getRolesView(Integer user_id) {
        Set<RoleView> rolesViews = new HashSet<>();
        jdbcSmevNamed.query(SQL.getRolesView
                , new MapSqlParameterSource()
                        .addValue("user_id", user_id)
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        rolesViews.add(new RoleView(InteractionDirection.valueOf(rs.getString("INTERACTION_VIEW")), InteractionType.valueOf(rs.getString("INQUIRY_VERSION_VIEW"))));
                    }
                }
        );
        return rolesViews;
    }

    @Override
    @Transactional(value = "jdbcSmevTransactionManager", propagation = Propagation.NEVER, isolation = Isolation.READ_UNCOMMITTED)
    public List<MessageSettingsEntity> getMessageSettingsList(UUID inquiryVersionId) {
        List<MessageSettingsEntity> entityList = new ArrayList<>();
        jdbcSmevNamed.query(SQL.ListMessageSettings
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        entityList.add(fillMessageSettingsEntity(rs));
                    }
                }
        );
        return entityList;
    }

    @Override
    public List<BusinessAttachmentEntity> getAttachmentsWithoutContent(UUID messageId) {
        List<BusinessAttachmentEntity> entityList = new ArrayList<>();
        jdbcSmevNamed.query(SQL.ListAttachmentsWithoutContent
                , new MapSqlParameterSource()
                        .addValue("MESSAGE_ID", messageId, Types.VARCHAR)
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        entityList.add(fillAttachmentEntity(rs));
                    }
                }
        );
        return entityList;
    }

    @Override
    public List<InquiryVersionEntity> getInquiryVersions() {
        return jdbcSmevNamed.query(SQL.ListInquiryVersion
//                , new MapSqlParameterSource()
//                        .addValue("INTERACTION_TYPE", type.name())
                , new BeanPropertyRowMapper(InquiryVersionEntity.class));


//        List<InquiryVersionEntity> entityList = new ArrayList<>();
//        jdbcSmevNamed.query(SQL.ListInquiryVersion
//                , new MapSqlParameterSource()
//                        .addValue("INTERACTION_TYPE", type, Types.VARCHAR)
//                , new RowCallbackHandler() {
//                    @Override
//                    public void processRow(ResultSet rs) throws SQLException {
//                        entityList.add(fillInquiryVersion(rs));
//                    }
//                }
//        );
//        return entityList;
    }

    @Override
    public List<BusinessMessageEntity> getMessagesByParam(UUID inquiryVersionId
            , MessageDirection messageDirection, MessageMode messageMode
            , MessageType messageType, MessageState messageState, InteractionState interactionState) {
        List<BusinessMessageEntity> entityList = new ArrayList<>();
        jdbcSmevNamed.query(SQL.MessagesByParam
                , new MapSqlParameterSource()
                        .addValue("INQUIRY_VERSION_ID", inquiryVersionId, Types.NVARCHAR)
                        .addValue("DIRECTION", messageDirection.name(), Types.VARCHAR)
                        .addValue("MODE", messageMode.name(), Types.VARCHAR)
                        .addValue("TYPE", messageType.name(), Types.VARCHAR)
                        .addValue("STATE", messageState.name(), Types.VARCHAR)
                        .addValue("STATE_INTERACTION", interactionState.name(), Types.VARCHAR)
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        entityList.add(fillBusinessMessageEntity(rs));
                    }
                }
        );
        return entityList;
    }

    @Override
    public String getInqueryVersionByInteractionId(UUID interactionId) {

        try {
            return jdbcSmevNamed.queryForObject(SQL.InquiryVersionByInteractionId,
                    new MapSqlParameterSource()
                            .addValue("INTERACTION_ID", interactionId, Types.VARCHAR), String.class);
        } catch (EmptyResultDataAccessException e) {

        }
        return "";
    }

    @Override
    public row getrow() {
        //startTransaction();
        List<row> query = jdbcSmev.query(SQL.getRowTest
                , new RowMapperSmev());
//        jdbcSmev.update(SQL.updateTest, query.get(0).getUid());
        // commitTransaction();
        return query.get(0);
    }

    @Override
    public void startTransaction() {
        jdbcSmev.execute("BEGIN TRANSACTION");
    }

    @Override
    public void commitTransaction() {
        jdbcSmev.execute("COMMIT TRANSACTION");
    }

    @Override
    public Map<String, String> getOrderType() {
        HashMap<String, String> mapRet = new HashMap<String, String>();
        jdbcSmev.query("SELECT id,TYPE_NAME FROM ORDER_TYPE", new ResultSetExtractor<Map>() {
            @Override
            public Map extractData(ResultSet rs) throws SQLException, DataAccessException {
                while (rs.next()) {
                    mapRet.put(rs.getString("id"), rs.getString("TYPE_NAME"));
                }
                return mapRet;
            }
        });
        return mapRet;
    }

    private BusinessAttachmentEntity fillAttachmentEntity(ResultSet rs) throws SQLException {
        return BusinessAttachmentEntity.builder()
                .id(util.StringToUUID(rs.getString("ID")))
                .messageId(util.StringToUUID(rs.getString("MESSAGE_ID")))
                .transferMethod(AttachmentTransferMethod.valueOf(rs.getString("TRANSFER_METHOD")))
                .fileName(rs.getString("FILE_NAME"))
                .contentType(rs.getString("CONTENT_TYPE"))
                .contentPath(rs.getString("CONTENT_PATH"))
                .creationDate(util.DatetoLocalDateTime(rs.getTimestamp("CREATION_DATE")))
                .build();
    }

    @Override
    public void updateProcessInT_send(String id) {
        jdbcSmev.update(SQL.UPDATE_processInT_SEND, id);
        //log.info("update table t_send process = 0 for message id = {}", id);
    }

    @Override
    public void deleteFromT_SEND(String id) {
        jdbcSmev.update(SQL.deleteFromT_SEND, id);
    }

    @Override
    public void updateStateInMessage(String id, String status) {
        jdbcSmev.update(SQL.UPDATE_STATEInMESSAGE, status, id);
        log.info("update table t_send state = {} for message id = {}", status, id);
    }

    private BusinessMessageEntity fillBusinessMessageEntity(ResultSet rs) throws SQLException {
        return BusinessMessageEntity.builder()
                .idMessage(util.StringToUUID(rs.getString("ID_MESSAGE")))
                .sendId(util.StringToUUID(rs.getString("SEND_ID")))
                .receiveId(util.StringToUUID(rs.getString("RECEIVE_ID")))
                .interactionId(util.StringToUUID(rs.getString("INTERACTION_ID")))
                .userId(rs.getInt("USER_ID"))
                .referenceId(util.StringToUUID(rs.getString("REFERENCE_ID")))
                .direction(MessageDirection.valueOf(rs.getString("DIRECTION")))
                .mode(MessageMode.valueOf(rs.getString("MODE")))
                .type(MessageType.valueOf(rs.getString("TYPE")))
                .state(MessageState.valueOf(rs.getString("STATE")))
                .contentId(util.StringToUUID(rs.getString("CONTENT_ID")))
                .smevMessageId(util.StringToUUID(rs.getString("SMEV_MESSAGE_ID")))
                .description(rs.getString("DESCRIPTION"))
                .code(rs.getString("CODE"))
                .personalSignature(rs.getBoolean("PERSONAL_SIGNATURE"))
                .creationDate(util.DatetoLocalDateTime(rs.getTimestamp("CREATION_DATE")))
                .changeDate(util.DatetoLocalDateTime(rs.getTimestamp("CHANGE_DATE")))
                .build();
    }


    // @Transactional(value = "jdbcSmevTransactionManager", propagation = Propagation.SUPPORTS)
    public void updateTest(row row) {
        jdbcSmev.update(SQL.updateTest, row.getUid());

    }

    public List<String> GetContentStringForRevok() {
        List<String> list = new ArrayList<>();
        jdbcSmevNamed.query(SQL_GIS_JKH.ListForRevok
                , new MapSqlParameterSource()
                , new RowCallbackHandler() {
                    @Override
                    public void processRow(ResultSet rs) throws SQLException {
                        list.add(rs.getString("CONTENT"));
                    }
                });
        return list;
    }

    @Override
    public List<UUID> getOrders(Integer userId, DataRequestOrders reqData) {
        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcSmev)
                .withProcedureName(SQL.ListOrdersPage)
                .returningResultSet("items", new OrderMapper());

        MapSqlParameterSource paramMap = new MapSqlParameterSource()
                .addValue("PageNumber", reqData.getPageNum())
                .addValue("orderId", reqData.getOrderId() == null ? "" : reqData.getOrderId())
                .addValue("orderIdEpgu", reqData.getOrderIdEpgu() == null ? "" : reqData.getOrderIdEpgu())
                .addValue("SURNAME", reqData.getPersonFilter().getSurname())
                .addValue("NAME", reqData.getPersonFilter().getFirstname())
                .addValue("SECNAME", reqData.getPersonFilter().getSecname())
                .addValue("BIRTHDAY", reqData.getPersonFilter().getBirthday())
                .addValue("ID_SUBJECT", reqData.getPersonFilter().getIdSubject())
                .addValue("ID_REGION", reqData.getPersonFilter().getIdRegion())
                .addValue("SNILS", "")
                .addValue("RegionUser", reqData.getRegionUser())
                .addValue("USER_ID", userId)
                .addValue("personFilterFlag", reqData.getPersonFilterFlag())
                .addValue("dateCreateFilterFlag", reqData.getDateCreateFilterFlag())
                .addValue("editCreateDateS", reqData.getEditCreateDateS())
                .addValue("editCreateDatePO", reqData.getEditCreateDatePO())
                .addValue("DIRECTION", "")
                .addValue("inquiryId", "")
                .addValue("RowsPerPage", 22);

        List<UUID> arr = (List<UUID>) jdbcCall.execute(paramMap).get("items");
        if (arr == null) {
            return new ArrayList<>();
        }

        return arr;


    }


}
