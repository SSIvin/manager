package smev;

public interface SQL {

    String SQL_WRITE_CONTENT = "INSERT INTO t_send (id,[content]) VALUES (?,?)";

//    String SQL_LIST_RECEIVE = "SELECT TOP(1) [content], id " +
    String SQL_LIST_RECEIVE = "SELECT TOP(1) [content], id " +
//    String SQL_LIST_RECEIVE = "SELECT TOP(1) [content], id " +
//02.06.2021            "FROM t_receive WITH(UPDLOCK,ROWLOCK,READPAST)" +
            "FROM t_receive WITH(UPDLOCK,READPAST)" +
            "WHERE " +
            "process IS NULL AND ISNULL(process,0) <> 1 ";
//            "AND ISNULL(CONVERT(VARCHAR(MAX), [content]),'') <> '' ";
//            " and uid in (2273186, 2273184)" +
            //"ORDER BY uid desc";
    String UPDATE_RESP = "" +
            "UPDATE r\n" +
            "SET r.idResponse = ?\n" +
            "FROM Request AS r\n" +
            "INNER JOIN t_send AS s ON\n" +
            "s.uid = r.idAdapter\n" +
            "WHERE s.idMessage = ?\n";
    //clientId
    String UPDATE_processInRECEIVE = "UPDATE t_receive SET process = ? WHERE id = ?";
    //code, description, code, replyToClientId, clientId,

    //    String UPDATE_REQUEST = "" +
//            "UPDATE Request \n" +
//            "SET code = ?,[description] = ?\n" +
//            "WHERE idSend = ?\n";
    String SQL_RESP = "" +
            "SELECT req.idAdapter, r.[content]\n" +
            "FROM Request req \n" +
            "INNER JOIN t_receive AS r ON\n" +
            "r.id = req.idResponse\n" +
            "WHERE req.idAdapter = ?";
    String LIST_ALL_REQUEST_SMEV = "" +
            "SELECT [idAdapter]\n" +
            "      ,[idSend]\n" +
            "      ,[typeRequest]\n" +
            "      ,[ID_BASE]\n" +
            "      ,[ID_REGION]\n" +
            "      ,[ID_SUBJECT]\n" +
            "      ,[idResponse]\n" +
            "      ,[Surname]\n" +
            "      ,[Name]\n" +
            "      ,[Secname]\n" +
            "      ,[Birthdate]\n" +
            "      ,[description]\n" +
            "  FROM [Request] ORDER BY idAdapter DESC";


    String REQUEST37 = "" +
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "<QueryResult xmlns=\"urn://x-artefacts-smev-gov-ru/services/service-adapter/types\" xmlns:ns2=\"urn://x-artefacts-smev-gov-ru/services/service-adapter/types/faults\">\n" +
            "\t<smevMetadata>\n" +
            "\t\t<MessageId>823066c6-7a4a-11ea-b6d9-5cf3fc659590</MessageId>\n" +
            "\t\t<ReferenceMessageID>57b85cba-7a4a-11ea-b887-107b44198ce0</ReferenceMessageID>\n" +
            "\t\t<TransactionCode>578eb487-7a4a-11ea-a9a9-001a4a1660a6|00000000000000000000|i+FvtQI4DBgm5GPcedRPB556z6bhD56X016rtK2dmGFIYcfZkIrE1VJQnfD/jCKXARpyjl3sIoonLfuZAlH5kI8fVW2Xbp+5TBN5GZFA6oHe5QqUkdLP7WbQ74ZimTQwO1gVIfbKhiV3sOdZHn7YzMaITgGGxcqHJmBlF34YnDR0ncDpbGcjWCaSq9aVzcvyzjgIEeeuvoEwx3Ko51Z665dZErR9m6XCdc7G2jXovZatvvAVDzelMazpjQpEQEOG1CwEGssCFWuxdvO23Q1vHjF7ZpwD2HsifPuA2tsMokiGj/K2C37FBVCgRFmpx5V6tDyvqHBvEAmhmUaTrXCP8w==</TransactionCode>\n" +
            "\t\t<OriginalMessageID>57b85cba-7a4a-11ea-b887-107b44198ce0</OriginalMessageID>\n" +
            "\t\t<Sender>pilot2</Sender>\n" +
            "\t\t<Recipient>001301</Recipient>\n" +
            "\t</smevMetadata>\n" +
            "\t<Message xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ResponseMessageType\">\n" +
            "\t\t<messageType>PrimaryMessage</messageType>\n" +
            "\t\t<ResponseMetadata>\n" +
            "\t\t\t<clientId>78c1b111-1f23-4fde-9b66-518d24d3083d</clientId>\n" +
            "\t\t\t<replyToClientId>04db9fff-5da7-417f-89d6-18474d907062</replyToClientId>\n" +
            "\t\t</ResponseMetadata>\n" +
            "\t\t<ResponseContent>\n" +
            "\t\t\t<content>\n" +
            "\t\t\t\t<MessagePrimaryContent>\n" +
            "\t\t\t\t\t<tns:FormData oktmo=\"00000000000\" xmlns:tns=\"http://epgu.gosuslugi.ru/concentrator/familychildsub/1.0.0\">\n" +
            "\t\t\t\t\t\t<tns:orderId>123123123</tns:orderId>\n" +
            "\t\t\t\t\t\t<tns:currentDate>2020-03-26</tns:currentDate>\n" +
            "\t\t\t\t\t\t<tns:ApplicantInfo>\n" +
            "\t\t\t\t\t\t\t<tns:Surname>Иванов</tns:Surname>\n" +
            "\t\t\t\t\t\t\t<tns:FirstName>Иван</tns:FirstName>\n" +
            "\t\t\t\t\t\t\t<tns:MiddleName>Иванович</tns:MiddleName>\n" +
            "\t\t\t\t\t\t\t<tns:Bithday>1967-08-13</tns:Bithday>\n" +
            "\t\t\t\t\t\t\t<tns:SNILS>123-123-123 12</tns:SNILS>\n" +
            "\t\t\t\t\t\t\t<tns:BirthPlace>г. Москва</tns:BirthPlace>\n" +
            "\t\t\t\t\t\t\t<tns:AddressInfo>\n" +
            "\t\t\t\t\t\t\t\t<tns:AdressRegistration>\n" +
            "\t\t\t\t\t\t\t\t\t<tns:FullAddress>г. Москва ул. Академика-Королева, 12 кв.43</tns:FullAddress>\n" +
            "\t\t\t\t\t\t\t\t\t<tns:Index>123123</tns:Index>\n" +
            "\t\t\t\t\t\t\t\t\t<tns:Region code=\"123\">г. Москва</tns:Region>\n" +
            "\t\t\t\t\t\t\t\t</tns:AdressRegistration>\n" +
            "\t\t\t\t\t\t\t\t<tns:AdressStay>\n" +
            "\t\t\t\t\t\t\t\t\t<tns:FullAddress>г. Москва ул. Академика-Королева, 12 кв.43</tns:FullAddress>\n" +
            "\t\t\t\t\t\t\t\t\t<tns:Index>123123</tns:Index>\n" +
            "\t\t\t\t\t\t\t\t\t<tns:Region code=\"123\">г. Москва</tns:Region>\n" +
            "\t\t\t\t\t\t\t\t</tns:AdressStay>\n" +
            "\t\t\t\t\t\t\t</tns:AddressInfo>\n" +
            "\t\t\t\t\t\t\t<tns:IdentityDocInfo>\n" +
            "\t\t\t\t\t\t\t\t<tns:Type code=\"01\">Паспорт гражданина РФ</tns:Type>\n" +
            "\t\t\t\t\t\t\t\t<tns:Series>1231</tns:Series>\n" +
            "\t\t\t\t\t\t\t\t<tns:Number>123123</tns:Number>\n" +
            "\t\t\t\t\t\t\t\t<tns:IssueDate>1967-08-13</tns:IssueDate>\n" +
            "\t\t\t\t\t\t\t\t<tns:Issuer>Отдел МВД Московской области</tns:Issuer>\n" +
            "\t\t\t\t\t\t\t</tns:IdentityDocInfo>\n" +
            "\t\t\t\t\t\t</tns:ApplicantInfo>\n" +
            "\t\t\t\t\t\t<tns:FamilyInfo>\n" +
            "\t\t\t\t\t\t\t<tns:RelativeInfo>\n" +
            "\t\t\t\t\t\t\t\t<tns:Surname>Иванова</tns:Surname>\n" +
            "\t\t\t\t\t\t\t\t<tns:FirstName>Светлана</tns:FirstName>\n" +
            "\t\t\t\t\t\t\t\t<tns:Bithday>1988-09-29</tns:Bithday>\n" +
            "\t\t\t\t\t\t\t\t<tns:SNILS>123-123-123 22</tns:SNILS>\n" +
            "\t\t\t\t\t\t\t\t<tns:BirthPlace>г.Ярославль</tns:BirthPlace>\n" +
            "\t\t\t\t\t\t\t\t<tns:AddressInfo>\n" +
            "\t\t\t\t\t\t\t\t\t<tns:AdressRegistration>\n" +
            "\t\t\t\t\t\t\t\t\t\t<tns:FullAddress>г. Ярославль ул. Строителей д. 45 кв. 23</tns:FullAddress>\n" +
            "\t\t\t\t\t\t\t\t\t\t<tns:Index>123123</tns:Index>\n" +
            "\t\t\t\t\t\t\t\t\t\t<tns:Region code=\"7623\">г. Ярославль</tns:Region>\n" +
            "\t\t\t\t\t\t\t\t\t</tns:AdressRegistration>\n" +
            "\t\t\t\t\t\t\t\t\t<tns:AdressStay>\n" +
            "\t\t\t\t\t\t\t\t\t\t<tns:FullAddress>г. Ярославль ул. Строителей д. 45 кв. 23</tns:FullAddress>\n" +
            "\t\t\t\t\t\t\t\t\t\t<tns:Index>123123</tns:Index>\n" +
            "\t\t\t\t\t\t\t\t\t\t<tns:Region code=\"7623\">г. Ярославль</tns:Region>\n" +
            "\t\t\t\t\t\t\t\t\t</tns:AdressStay>\n" +
            "\t\t\t\t\t\t\t\t</tns:AddressInfo>\n" +
            "\t\t\t\t\t\t\t\t<tns:IdentityDocInfo>\n" +
            "\t\t\t\t\t\t\t\t\t<tns:Type code=\"01\">Паспорт гражданина РФ</tns:Type>\n" +
            "\t\t\t\t\t\t\t\t\t<tns:Series>1231</tns:Series>\n" +
            "\t\t\t\t\t\t\t\t\t<tns:Number>123123</tns:Number>\n" +
            "\t\t\t\t\t\t\t\t\t<tns:IssueDate>2012-02-02</tns:IssueDate>\n" +
            "\t\t\t\t\t\t\t\t\t<tns:Issuer>Отдел МВД г. Ярославля</tns:Issuer>\n" +
            "\t\t\t\t\t\t\t\t</tns:IdentityDocInfo>\n" +
            "\t\t\t\t\t\t\t</tns:RelativeInfo>\n" +
            "\t\t\t\t\t\t</tns:FamilyInfo>\n" +
            "\t\t\t\t\t\t<tns:SubsidiesInfo>\n" +
            "\t\t\t\t\t\t\t<tns:Radio code=\"1\">Через кредитную организацию</tns:Radio>\n" +
            "\t\t\t\t\t\t\t<tns:TransferInfo>\n" +
            "\t\t\t\t\t\t\t<tns:BankInfo>\n" +
            "\t\t\t\t\t\t\t\t<tns:BankName>Тинькофф банк</tns:BankName>\n" +
            "\t\t\t\t\t\t\t\t<tns:BIK>123123123</tns:BIK>\n" +
            "\t\t\t\t\t\t\t\t<tns:INN>1231231231</tns:INN>\n" +
            "\t\t\t\t\t\t\t\t<tns:AccountNumber>12312312312312312312</tns:AccountNumber>\n" +
            "\t\t\t\t\t\t\t</tns:BankInfo>\n" +
            "\t\t\t\t\t\t\t</tns:TransferInfo>\n" +
            "\t\t\t\t\t\t</tns:SubsidiesInfo>\n" +
            "\t\t\t\t\t</tns:FormData>\n" +
            "\t\t\t\t</MessagePrimaryContent>\n" +
            "\t\t\t</content>\n" +
            "\t\t</ResponseContent>\n" +
            "\t</Message>\n" +
            "</QueryResult>";
    String P_UPDATE_STATUS_MESSAGE = "P_UPDATE_STATUS_MESSAGE";
    String P_UPDATE_PRIMARY_MESSAGE = "P_UPDATE_PRIMARY_MESSAGE";
    String P_UPDATE_REJECT_MESSAGE = "P_UPDATE_REJECT_MESSAGE";
    String SQL_RESPONSE_DOHFLNA = "<QueryResult xmlns=\"urn://x-artefacts-smev-gov-ru/services/service-adapter/types\" xmlns:ns2=\"urn://x-artefacts-smev-gov-ru/services/service-adapter/types/faults\"><smevMetadata><MessageId>e17c2f55-847a-11ea-9ccf-005056ad53ff</MessageId><ReferenceMessageID>d43a7a18-847a-11ea-9d83-107b44198ce0</ReferenceMessageID><TransactionCode>d423491e-847a-11ea-a9a9-001a4a1660a6|00000000000000000000|U5jUYBCl5rM+FmO8HfB1c3tA8ZSE8MuUZS65ItsA8sEFnkvjfCUXzL5bslSgGXvWMWtX6oBm9OunTIohTjq29+qqWYKhW4N/CazykcAHtHOozIwwswbpPVubuVdR+pvVmvjYDMl4CWDE6XX+7tyL4CdJ3WFLS56q6Yor5RrCUYCKJhqj4HeEwvES91mS4fa00GI61fpObo1IpW0bf0rKy2U7AfaVwKaEuhVlXvLkGVlfIn3jLJaJ+2enlidcWUJtXYYemxQeeuxzpXZDf3KJI37ncYKm4DUkicIPqwlO1z7rma46u9DfXSdfY51ER8otagTJZHfIMQEO7QkMU+V2og==</TransactionCode><OriginalMessageID>d43a7a18-847a-11ea-9d83-107b44198ce0</OriginalMessageID><Sender>pilot1</Sender><Recipient>001301</Recipient></smevMetadata><Message xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ResponseMessageType\"><messageType>PrimaryMessage</messageType><ResponseMetadata><clientId>353cdc82-0e25-4751-a8a0-411603dc31ec</clientId><replyToClientId>6868cb0f-d8dc-409d-970b-94ad949c7993</replyToClientId></ResponseMetadata><ResponseContent><content><MessagePrimaryContent><tns:DOHFLNAResponse xmlns:tns=\"urn://x-artefacts-fns-dohflna/root/260-18/4.0.1\" xmlns=\"urn://x-artefacts-smev-gov-ru/services/message-exchange/types/basic/1.1\" xmlns:ns2=\"urn://x-artefacts-smev-gov-ru/services/message-exchange/types/1.1\" xmlns:ns3=\"urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1\" ИдЗапрос=\"000000000000000000000000000000000003\"><tns:ДохФЛ ОтчетГод=\"2018\"><tns:ДохФЛ_НА><tns:ПолучДох ДатаРожд=\"1984-09-14\" ИННФЛ=\"344703998094\"><tns:ФИО FamilyName=\"ИВИН\" FirstName=\"СЕРГЕЙ\" Patronymic=\"СЕРГЕЕВИЧ\"/><tns:УдЛичнФЛ DocumentCode=\"21\" SeriesNumber=\"18 04612332\"/></tns:ПолучДох><tns:СвНА><tns:СвНАЮЛ ИННЮЛ=\"3444059322\" КПП=\"344401001\" НаимОрг=\"КОМИТЕТ СОЦИАЛЬНОЙ ЗАЩИТЫ НАСЕЛЕНИЯ ВОЛГОГРАДСКОЙ ОБЛАСТИ\"/></tns:СвНА><tns:СведДох_2НДФЛ Ставка=\"13\"><tns:ДохВыч><tns:СвСумДох КодДоход=\"2000\" Месяц=\"01\" СумДоход=\"33339.00\"/><tns:СвСумДох КодДоход=\"2000\" Месяц=\"02\" СумДоход=\"33337.82\"/><tns:СвСумДох КодДоход=\"2000\" Месяц=\"03\" СумДоход=\"33339.00\"/><tns:СвСумДох КодДоход=\"2002\" Месяц=\"03\" СумДоход=\"24416.00\"/><tns:СвСумДох КодДоход=\"2000\" Месяц=\"04\" СумДоход=\"69963.00\"/><tns:СвСумДох КодДоход=\"2012\" Месяц=\"04\" СумДоход=\"26237.10\"/><tns:СвСумДох КодДоход=\"2760\" Месяц=\"04\" СумДоход=\"24416.00\"/><tns:СвСумДох КодДоход=\"2000\" Месяц=\"05\" СумДоход=\"10001.33\"/><tns:СвСумДох КодДоход=\"2000\" Месяц=\"06\" СумДоход=\"32375.37\"/><tns:СвСумДох КодДоход=\"2000\" Месяц=\"07\" СумДоход=\"34278.00\"/><tns:СвСумДох КодДоход=\"2012\" Месяц=\"07\" СумДоход=\"26846.05\"/><tns:СвСумДох КодДоход=\"2000\" Месяц=\"08\" СумДоход=\"13412.64\"/><tns:СвСумДох КодДоход=\"2000\" Месяц=\"09\" СумДоход=\"34278.00\"/><tns:СвСумДох КодДоход=\"2000\" Месяц=\"10\" СумДоход=\"34278.00\"/><tns:СвСумДох КодДоход=\"2000\" Месяц=\"11\" СумДоход=\"34278.00\"/><tns:СвСумДох КодДоход=\"2000\" Месяц=\"12\" СумДоход=\"34278.00\"/><tns:СвСумДох КодДоход=\"2002\" Месяц=\"12\" СумДоход=\"12956.61\"/></tns:ДохВыч><tns:СГДНалПер НалБаза=\"498229.92\" СумДохОбщ=\"512029.92\"/></tns:СведДох_2НДФЛ></tns:ДохФЛ_НА></tns:ДохФЛ></tns:DOHFLNAResponse></MessagePrimaryContent></content></ResponseContent></Message></QueryResult>";
    /*при большом кол-во сообщений почему то адаптер начинает в t_receive вставлять по две записи поэтому not EXISTS*/
    String INSERT_MESSAGE = "IF not EXISTS(SELECT 1 FROM [MESSAGE] AS m WHERE m.SEND_ID=:SEND_ID) BEGIN " +
            "INSERT INTO [MESSAGE]\n" +
            "           ([SEND_ID]\n" +
            "           ,[ID_MESSAGE]\n" +
            "           ,[RECEIVE_ID]\n" +
            "           ,[INTERACTION_ID]\n" +
            "           ,[USER_ID]\n" +
            "           ,[REFERENCE_ID]\n" +
            "           ,[DIRECTION]\n" +
            "           ,[MODE]\n" +
            "           ,[TYPE]\n" +
            "           ,[STATE]\n" +
            "           ,[CONTENT_ID]\n" +
            "           ,[SMEV_MESSAGE_ID]\n" +
            "           ,[PERSONAL_SIGNATURE]\n" +
            "           ,[DESCRIPTION]\n" +
            "           ,[CODE]\n" +
            "           ,[CHANGE_DATE])\n" +
            "     VALUES\n" +
            "           (:SEND_ID,:ID_MESSAGE,:RECEIVE_ID,:INTERACTION_ID,:USER_ID,:REFERENCE_ID,:DIRECTION,:MODE,:TYPE,:STATE,:CONTENT_ID,:SMEV_MESSAGE_ID,:PERSONAL_SIGNATURE, :DESCRIPTION,:CODE,:CHANGE_DATE)\n" +
            "END";



    String ResponseMessage = "" +
            "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "<QueryResult xmlns=\"urn://x-artefacts-smev-gov-ru/services/service-adapter/types\" xmlns:ns2=\"urn://x-artefacts-smev-gov-ru/services/service-adapter/types/faults\">\n" +
            "\t<smevMetadata>\n" +
            "\t\t<ReferenceMessageID>a8a49032-7fd5-11ea-826c-107b44198ce0</ReferenceMessageID>\n" +
            "\t\t<TransactionCode>a841fd66-7fd5-11ea-93da-fa163e1007b9|00000000000000000000|DNYKXAewz9LgdpGYHnjAKfYgGYsV6jfwUoY8I1ITGgUlArfe8KjvBb8oXqBcEfGt8yVozYBj0EkJRH5a8UxRdU+4gIKqQEAiLCh/HzknYr/YValBip0LXvK3kQPaksht3Ak5kznQkjHjq56/B7dm3ShxDVdDvI7ydaZ+QqSateF+x/ayqEPSI2RPbcEsbgSuPfzha4fVdPFqfMzZuyDEi3EgSBqzj5j7v8ZvdfyHjvWwq+7E7tCTffEkUyTn4NvQqYn5zBwICwxmgBdrR9Bjm+9eGj9jCvKnPJ1aw6HWUtlSiEnUr2mG+mBaBmOcGvhNog2mm14AhAyOkq+UngjY6w==</TransactionCode>\n" +
            "\t\t<OriginalMessageID>a8a49032-7fd5-11ea-826c-107b44198ce0</OriginalMessageID>\n" +
            "\t</smevMetadata>\n" +
            "\t<Message xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ResponseMessageType\">\n" +
            "\t\t<messageType>StatusMessage</messageType>\n" +
            "\t\t<ResponseMetadata>\n" +
            "\t\t\t<clientId>b87134f8-fa33-4d31-9a92-36a6d6dedbd4</clientId>\n" +
            "\t\t\t<replyToClientId>6a0651d5-7d60-4587-9bf6-3a4424015a0c</replyToClientId>\n" +
            "\t\t</ResponseMetadata>\n" +
            "\t\t<ResponseContent>\n" +
            "\t\t\t<status>\n" +
            "\t\t\t\t<code>0</code>\n" +
            "\t\t\t\t<description>Сообщение отправлено в СМЭВ</description>\n" +
            "\t\t\t</status>\n" +
            "\t\t</ResponseContent>\n" +
            "\t</Message>\n" +
            "</QueryResult>";
    String UPDATE_MESSAGE = "" +
            "UPDATE [MESSAGE]\n" +
            "   SET [SEND_ID] = :SEND_ID\n" +
            "      ,[RECEIVE_ID] = :RECEIVE_ID\n" +
            "      ,[INTERACTION_ID] = :INTERACTION_ID\n" +
            "      ,[USER_ID] = :USER_ID\n" +
            "      ,[REFERENCE_ID] = :REFERENCE_ID\n" +
            "      ,[DIRECTION] = :DIRECTION\n" +
            "      ,[MODE] = :MODE\n" +
            "      ,[TYPE] = :TYPE\n" +
            "      ,[STATE] = :STATE\n" +
            "      ,[CONTENT_ID] = :CONTENT_ID\n" +
            "      ,[SMEV_MESSAGE_ID] = :SMEV_MESSAGE_ID\n" +
            "      ,[PERSONAL_SIGNATURE] = :PERSONAL_SIGNATURE\n" +
            "      ,[DESCRIPTION] = :DESCRIPTION\n" +
            "      ,[CODE] = :CODE\n" +
            "      ,[CHANGE_DATE] = :CHANGE_DATE\n" +
            "WHERE ID_MESSAGE = :ID_MESSAGE";
    String InquiryVersionEntityGetById = "select * from INQUIRY_VERSION where ID=?";
    String InsertInteractionEntity = "" +
            "INSERT INTO BUSINESS_INTERACTION\n" +
            "(ID,INQUIRY_VERSION_ID,[USER_ID],DIRECTION,[STATE],TEST)\n" +
            "VALUES (?,?,?,?,?,?)";
    String MessageEntityByClientId = "" +
            "SELECT *\n" +
            "FROM [MESSAGE]\n" +
            "WHERE SEND_ID = ?";
    String MessageEntityByIdMessage = "" +
            "SELECT *\n" +
            "FROM [MESSAGE]\n" +
            "WHERE ID_MESSAGE = ?";
    /*без страниц*/
    String ListInteractions = "" +
            "       SELECT [ID]\n" +
            "      ,[INQUIRY_VERSION_ID]\n" +
            "      ,[USER_ID]\n" +
            "      ,[DIRECTION]\n" +
            "      ,[STATE]\n" +
            "      ,[TEST]\n" +
            "      ,[CREATION_DATE]\n" +
            "  FROM [BUSINESS_INTERACTION] where USER_ID=? AND DIRECTION = ?";

//    String ListInteractionsPage = "" +
//            "\n" +
//            "SELECT * FROM [dbo].[F_GET_INTER] (\n" +
//            "  :inquiryId,\n" +
//            "  :DIRECTION,\n" +
//            "  :SURNAME,\n" +
//            "  :NAME,\n" +
//            "  :SECNAME,\n" +
//            "  :BIRTHDAY,\n" +
//            "  :ID_SUBJECT,\n" +
//            "  :ID_REGION,\n" +
//            "  :SNILS,\n" +
//            "  :RegionUser,\n" +
//            "  :USER_ID,\n" +
//            "  :personFilterFlag,\n" +
//            "  :PageNumber,\n" +
//            "  :RowsPerPage) AS f\n" +
//            "ORDER BY f.Num DESC";

    String ListInteractionsPage2 = "" +
            "\n" +
            "[P_LIST_INTERACTIONS]\n" +
            "  :SURNAME,\n" +
            "  :NAME,\n" +
            "  :SECNAME,\n" +
            "  :BIRTHDAY,\n" +
            "  :ID_SUBJECT,\n" +
            "  :ID_REGION,\n" +
            "  :SNILS,\n" +
            "  :RegionUser,\n" +
            "  :USER_ID,\n" +
            "  :personFilterFlag,\n" +
            "  :dateCreateFilterFlag,\n" +
            "  :editCreateDateS,\n" +
            "  :editCreateDatePO,\n" +
            "  :DIRECTION,\n" +
            "  :inquiryId,\n" +
            "  :RowsPerPage,\n" +
            "  :PageNumber";


    String ListInteractionsPage = "P_LIST_INTERACTIONS";


    String MessagesByInteractionId = "" +
            "SELECT *\n" +
            "FROM [MESSAGE]\n" +
            "WHERE INTERACTION_ID = ?";
    String InteractionById = "" +
            "       SELECT [ID]\n" +
            "      ,[INQUIRY_VERSION_ID]\n" +
            "      ,[USER_ID]\n" +
            "      ,[DIRECTION]\n" +
            "      ,[STATE]\n" +
            "      ,[TEST]\n" +
            "      ,[CREATION_DATE]\n" +
            "  FROM [BUSINESS_INTERACTION] where ID=?";
    String SQL_LIST_SEND = "" +
            "SELECT TOP(100)\n" +
            "id\n" +
            ",status\n" +
            "FROM [t_send]\n" +
            "WHERE ISNULL(STATUS,'') <> 'NEW' " +
            "AND process IS NULL AND ISNULL(process,0) <> 1";
    String UPDATE_STATEInMESSAGE = "" +
            "DECLARE @STATE VARCHAR(20)\n" +
            "DECLARE @id UNIQUEIDENTIFIER\n" +
            "SET @STATE = ?\n" +
            "SET @id = ?\n" +
            "UPDATE [MESSAGE]\n" +
            "SET [STATE] = CASE\n" +
            "\t\t\t\tWHEN @STATE = 'SUCCESS' THEN 'SENT'\n" +
            "\t\t\t\t--WHEN @STATE = 'FAULT' THEN 'UNSENT'\n" +
            "\t\t\t\tELSE 'UNSENT'\n" +
            "\t\t\t\tEND\n" +
            "WHERE SEND_ID = @id\t";
    String UPDATE_processInT_SEND = "UPDATE t_send SET process = 0 WHERE id = ?";
    String deleteFromT_SEND = "DELETE FROM t_send WHERE id = ?";
    String INSERT_CONTENT = "" +
            "INSERT INTO MESSAGE_CONTENT\n" +
            "(ID_CONTENT, [CONTENT])\n" +
            "VALUES (:ID_CONTENT,:[CONTENT])";
    String CONTENT = "" +
            "SELECT [CONTENT] FROM MESSAGE_CONTENT\n" +
            "WHERE ID_CONTENT = ?";
    String UPDATE_CONTENT = "" +
            "UPDATE MESSAGE_CONTENT\n" +
            "SET [CONTENT] = ?\n" +
            "WHERE ID_CONTENT = ?";
    String INSERT_PERSON = "" +
            "INSERT INTO INTERACTION_PERSON\n" +
            "(\n" +
            "\tINTERACTION_ID,\n" +
            "\tID_BASE,\n" +
            "\tID_REGION,\n" +
            "\tID_SUBJECT,\n" +
            "\tSURNAME,\n" +
            "\tNAME,\n" +
            "\tSECNAME,\n" +
            "\tBIRTHDAY\n" +
            ")\n" +
            "VALUES\n" +
            "(\n" +
            "\t:INTERACTION_ID,\n" +
            "\t:ID_BASE,\n" +
            "\t:ID_REGION,\n" +
            "\t:ID_SUBJECT,\n" +
            "\t:SURNAME,\n" +
            "\t:NAME,\n" +
            "\t:SECNAME,\n" +
            "\t:BIRTHDAY\n" +
            ")";
    String SubjectByInteractionId = "" +
            "SELECT ID_BASE, ID_REGION, ID_SUBJECT, SURNAME, NAME, SECNAME, BIRTHDAY \n" +
            "FROM INTERACTION_PERSON with(NOLOCK)\n" +
            "WHERE INTERACTION_ID =:INTERACTION_ID";
    String InquiryVersionById = "" +
            "SELECT ID, [NAMESPACE], [DESCRIPTION], VERSION, TEST_MESSAGE, ISNULL(INTERACTION_TYPE,0) as INTERACTION_TYPE, PERSONAL_SIGNATURE, PERSON,\n" +
            "CREATION_DATE \n" +
            "FROM INQUIRY_VERSION\n" +
            "WHERE ID = :ID";
    String GetUserByNameDomain = "" +
            "SELECT * FROM T_USER AS u\n" +
            "WHERE u.userName = :userName";
    String GetUserById = "" +
            "SELECT * FROM T_USER AS u\n" +
            "WHERE u.id = :id";

    String UPDATE_INTERACTION = "" +
            "UPDATE BUSINESS_INTERACTION\n" +
            "SET\n" +
            "\tID = :ID,\n" +
            "\tINQUIRY_VERSION_ID = :INQUIRY_VERSION_ID,\n" +
            "\tUSER_ID = :USER_ID,\n" +
            "\tDIRECTION = :DIRECTION,\n" +
            "\tSTATE = :STATE,\n" +
            "\tTEST = :TEST\n" +
            "WHERE ID = :ID";
    String UserByUserName = "SELECT userName, [PASSWORD], ACTIVE FROM T_USER WITH(NOLOCK) WHERE userName = ?";
    String authoritiesByUserName = "SELECT u.userName,r.roles\n" +
            "FROM T_USER as u \n" +
            "INNER JOIN USERS_ROLES ur ON\n" +
            "u.ID = ur.[user_id]\n" +
            "INNER JOIN ROLES AS r ON\n" +
            "r.id = ur.role_id\n" +
            "WHERE u.userName = ?";
//    String authoritiesByUserName = "SELECT u.userName, 'USER' as roles FROM T_USER as u WHERE u.userName = ?";
    String InquiryVersionEntityGetByNamespace = "select * from INQUIRY_VERSION where NAMESPACE=?";
    String DELETE_MESSAGE = "" +
            "DELETE FROM MESSAGE\n" +
            "WHERE ID_MESSAGE = :ID_MESSAGE";


    /**
     * @Запросы_JOB
     **/

    String SQL_WRITE_START = "INSERT INTO T_HISTORY_JOB_EXEC (jobName,statusId) VALUES(?,?)";
    //    String SQL_UPDATE_STATUS = "UPDATE T_HISTORY_JOB_EXEC set statusId = ?, message = ?, causes = ? WHERE ID = ?";
    String SQL_UPDATE_STATUS = "UPDATE T_HISTORY_JOB_EXEC set statusId = ?, message = ?, causes = ? WHERE ID = ?";
    String SQL_LAST_ID_JOB = "" +
            "SELECT h.ID, h.jobName, h.runDate, h.statusId, h.[message], h.causes\n" +
            "FROM T_HISTORY_JOB_EXEC AS h \n" +
            "WHERE h.jobName = ?\n" +
            " AND h.ID = (SELECT MAX(ID) \n" +
            "             FROM T_HISTORY_JOB_EXEC AS h2\n" +
            "             WHERE h2.jobName = ?\n" +
            " )";


    /**
     * @Запросы_классификатора
     */

    //String SQL_CHEKING_KMSZ_SEND = "UPDATE T_PACKAGE_HISTORY SET SendPackage = 1 WHERE packageID = ?";
    String SQL_LIST_KMSZ_FOR_CHANGE = "select * from F_LIST_KMSZ_FOR_CHANGE (?)";
    String SQL_PackageKmszNoSend = "SELECT * FROM T_PACKAGE_HISTORY WHERE  ISNULL(StatusEgisso, 0) = 3\n" +
            "AND TypePackage = 1";
    String SQL_PROC_P_GET_NEXT_ID = "P_GET_NEXT_ID";
    String SQL_PROC_UPDATE_GUID = "P_UPDATE_GUID_KMSZ";
    String SQL_NPA_KMSZ = "SELECT * FROM F_LIST_NPA_FOR_KMSZ (?)";
    String SQL_GET_LAST_GUID_KMSZ = "SELECT h.HIST_GUID_LOCAL_MSZ FROM T_HISTORY_GUID_LOCAL_MSZ AS h WHERE h.ID_MSZ = ?";
    String SQL_CATEG_KMSZ = "select * from F_LIST_CATEG_FOR_KMSZ (?)";
    String SQL_INSERT_PACKAGE_HISTORY = "INSERT INTO T_PACKAGE_HISTORY\n" +
            "(packageID,[FILE_NAME],TypePackage,StatusEgisso)" +
            " VALUES(?,?,?,?)";
    String SQL_PROC_APPLAY_PROTOCOL_CLASS = "P_APPLAY_PROTOCOL_KLASS";
    /**
     * @Назначения
     **/
    String SQL_REASON_PERSON = "EXECUTE P_REASON_PERSON ?,?";
    String SQL_spFill = "P_FILL";
    String SQL_spFill_NAZN = "P_FILL_NAZN";
    String SQL_spFill_Temp_REASON_PERSONS = "P_FILL_temp_REASON_PERSONS";
    String SQL_SELECT_FROM_NAZN = "execute P_SELECT_FROM_NAZN ?";
    //String SQL_INSERT_FILE_ASSIGN = "INSERT INTO [LIST_FILE_ASSIGNMENT] ([packageID],[FILE_NAME],[FILE_GUID],[FILE_TYPE],[FILE_ASSIGNMENT_FACT]) VALUES(?,?,?,?,?)";
    String SQL_INSERT_FILES_PACKAGE = "INSERT INTO LIST_FILES_PACKAGE\n" +
            "(packageIDGlobal,packageID,FILE_TYPE,FILE_XML)\n" +
            "VALUES(?,?,?,?)";
    //String SQL_GET_NO_SEND_KMSZ = "SELECT p.ID FROM T_PACKAGE_HISTORY AS p WHERE ISNULL(p.SendPackage,0) = 0 AND p.TypePackage = 1";
    String SQL_INSERT_PROTOCOL = "INSERT INTO [T_PROTOCOL] ([FACT_GUID],[recordOK],[CODE_RULE],[messageType],[COMMENT],[packageIDGlobal],[packageID])\n" +
            "VALUES (?,?,?,?,?,?,?)";
    String SQL_PackageFactNoSend = "SELECT DISTINCT p.packageIDGlobal\n" +
            "FROM T_PACKAGE_HISTORY h\n" +
            "INNER JOIN LIST_FILES_PACKAGE AS p ON\n" +
            "p.packageID = h.packageID\n" +
            "WHERE ISNULL(h.StatusEgisso,0) = 3\n" +
            "AND ISNULL(h.TypePackage,0) = 2";

    String SQL_APPALY_PROTOCOL_FACT = "P_APPLY_Protocol_Fact";
    //String SQL_LIST_FILE_GUID = "SELECT [FILE_GUID] FROM LIST_FILE_ASSIGNMENT WHERE packageID = (SELECT a.packageID FROM T_PACKAGE_ASSIGNMENT_FACT AS a WHERE ISNULL(a.SendPackage,0) = 0)";
    String SQL_UPDATE_STATUS_PACKAGE =
            "UPDATE T_PACKAGE_HISTORY " +
                    "SET StatusEgisso = ?" +
                    ",recordNum = ?, recordNumSuccess = ?" +
                    " WHERE packageID = ?";
    String SQL_setApplayProtocol =
            "UPDATE T_GLOBAL_PACKAGE\n" +
                    "SET applayProtocol = ?\n" +
                    "WHERE IdGlobalPackage = ?";
    String SQL_CountNoSendPackageFact = "SELECT h.ID FROM T_PACKAGE_HISTORY AS h\n" +
            "INNER JOIN LIST_FILES_PACKAGE AS f ON\n" +
            "f.packageID = h.packageID\n" +
            "WHERE f.packageIDGlobal = ?\n" +
            "AND ISNULL(h.StatusEgisso,0) <> ?";
    String SQL_P_SELECT_FROM_TERMINATE = "execute P_SELECT_FROM_TERMINATE ?";
    String SQL_CountNoSendPackage = "SELECT ID FROM T_PACKAGE_HISTORY WHERE ISNULL(StatusEgisso,0) = 3 and ISNULL(TypePackage,0) = 2";
    String SQL_findGuidInTable = "SELECT a.ID FROM T_PACKAGE_HISTORY AS a\n" +
            "WHERE a.packageID = ? AND ISNULL(a.StatusEgisso,0) = 3\n";
    String SQL_METHODS_KMSZ = "SELECT tw.KODWay FROM T_MSZ_WAY AS w\n" +
            "LEFT JOIN T_D_WAY AS tw ON\n" +
            "tw.ID = w.ID_WAY\n" +
            "WHERE w.ID_MSZ = ?\n" +
            "ORDER BY tw.ID";
    String SQL_FORMREQ_KMSZ = "SELECT ta.ID\n" +
            "FROM T_MSZ_APPEAL AS a\n" +
            "LEFT JOIN T_D_APPEAL AS ta ON\n" +
            "ta.ID = a.ID_APPEAL\n" +
            "WHERE a.ID_MSZ = ?\n" +
            "ORDER BY ta.ID";
    String SQL_FORMRECIEVE_KMSZ = "SELECT DR.ID\n" +
            "FROM T_MSZ_Receipt AS R\n" +
            "LEFT JOIN T_D_Receipt AS DR ON\n" +
            "DR.ID = R.ID_Receipt\n" +
            "WHERE R.ID_MSZ = ?\n" +
            "ORDER BY DR.ID";
    String SQL_DOCTYPELIST_KMSZ = "SELECT d.NameDoc\n" +
            ",dt.NameDocType\n" +
            ",d.Kol\n" +
            ",d.require\n" +
            ", isnull(d.DocRemark,'') AS DocRemark\n" +
            "FROM T_MSZ_DOC AS d\n" +
            "LEFT JOIN T_D_DOC_MSZ_TYPE AS dt ON\n" +
            "dt.ID = d.DocType\n" +
            "WHERE d.ID_MSZ = ?";
    String SQL_StepsMsz_KMSZ = "SELECT s.NUM_STEP, ISNULL(s.stepH,'') as stepH, ISNULL(s.RemarkStep,'') AS RemarkStep\n" +
            "FROM T_MSZ_STEP AS s\n" +
            "WHERE s.ID_MSZ = ?";

    String SQL_P_FILL_tempASIGN = "P_FILL_tempASIGN";
    String SQL_P_GET_Global_Package = "P_GET_Global_Package";
    String SQL_UPDATE_GLOBAL_PACKEAGE = "UPDATE T_GLOBAL_PACKAGE " +
            "SET statusPackage = ?" +
            ",modifyDate = dbo.Get_date_time() " +
            "WHERE IdGlobalPackage = ?";
    String updateTest1 = "update test1 set valueTest = 'value update'";
    String SQL_GETGLOBALPACKAGEidExec = "SELECT [IdGlobalPackage]\n" +
            "      ,ISNULL([statusPackage],0) as [statusPackage]\n" +
            "      ,[typePackage]\n" +
            "      ,[createDate]\n" +
            "      ,[modifyDate]\n" +
            "      ,[executeJobId]\n" +
            "      ,ISNULL([applayProtocol],0) as applayProtocol\n" +
            "  FROM [T_GLOBAL_PACKAGE] g\n" +
            "WHERE g.executeJobId = ?";
    String LIST_GLOBAL_PACKAGE = "SELECT g.IdGlobalPackage, ISNULL(g.statusPackage,0) as statusPackage, g.typePackage, g.createDate,\ng.modifyDate, g.executeJobId,\ng.applayProtocol\nFROM T_GLOBAL_PACKAGE AS g\nOrder by g.createDate DESC";
    String SQL_GET_JOB_BY_ID = "SELECT h.ID, h.jobName, h.runDate, h.statusId, h.[message], h.causes\n  FROM T_HISTORY_JOB_EXEC AS h\nWHERE h.ID = ?";
    String INSERT_ATTACHMENT = "INSERT INTO [ATTACHMENTS]\n" +
            "           ([ID]\n" +
            "           ,[MESSAGE_ID]\n" +
            "           ,[TRANSFER_METHOD]\n" +
            "           ,[FILE_NAME]\n" +
            "           ,[CONTENT_TYPE]\n" +
            "           ,[CONTENT_PATH]\n" +
            "           ,[CONTENT]\n" +
            "           )\n" +
            "     VALUES\n" +
            "           (:ID\n" +
            "           ,:MESSAGE_ID\n" +
            "           ,:TRANSFER_METHOD\n" +
            "           ,:FILE_NAME\n" +
            "           ,:CONTENT_TYPE\n" +
            "           ,:CONTENT_PATH\n" +
            "           ,:CONTENT\n" +
            "           )";
    String ListBusinessAttachmentEntity = "" +
            " SELECT [ID]\n" +
            "      ,[MESSAGE_ID]\n" +
            "      ,[TRANSFER_METHOD]\n" +
            "      ,[FILE_NAME]\n" +
            "      ,[CONTENT_TYPE]\n" +
            "      ,[CONTENT_PATH]\n" +
            "      ,[CONTENT]\n" +
            "      ,[CREATION_DATE]\n" +
            "  FROM [ATTACHMENTS]\n" +
            " WHERE [MESSAGE_ID] = :messageId";
    String INSERT_PACKAGE_MESSAGE = "" +
            "INSERT INTO [T_PACKAGE_MESSAGE]\n" +
            "           ([MESSAGE_ID]\n" +
            "           ,[PACKAGE_ID])\n" +
            "     VALUES\n" +
            "           (?,?)";

    String UPDATE_PACKEGE_HISTORY = "" +
            "UPDATE [T_PACKAGE_HISTORY]\n" +
            "   SET [FILE_NAME] = :fileName\n" +
            "      ,[TypePackage] = :typePackage\n" +
            "      ,[StatusEgisso] = :statusEgisso\n" +
            "      ,[StatusSmev] = :statusSmev\n" +
            "      ,[Description] = :description\n" +
            "      ,[Code] = :code\n" +
            "      ,[recordNum] = :recordNum\n" +
            "      ,[recordNumSuccess] = :recordNumSuccess\n" +
            "      WHERE packageID = :packageID";
    String PackageHistoryEntityGetById = "" +
            "SELECT [ID]\n" +
            "      ,[packageID]\n" +
            "      ,[FILE_NAME]\n" +
            "      ,[TypePackage]\n" +
            "      ,[CreateDate]\n" +
            "      ,[StatusEgisso]\n" +
            "      ,[StatusSmev]\n" +
            "      ,[Description]\n" +
            "      ,[Code]\n" +
            "      ,[recordNum]\n" +
            "      ,[recordNumSuccess]\n" +
            "  FROM [T_PACKAGE_HISTORY]\n" +
            "WHERE packageID = :packageID";

    /*
    * бывает что reject приходит быстрее чем status, то делаем такой вот изврат, (до этого было как в MessagesInteractionByMessageIdOrderDesc2)
    * */
    String MessagesInteractionByMessageIdOrderDesc = "" +
            "SELECT *\n" +
            ",ord=CASE\n" +
            "       WHEN m.MODE='ERROR' THEN 1\n" +
            "       WHEN m.MODE='REJECT' THEN 2\n" +
            "       WHEN m.DIRECTION = 'INCOMING' AND m.MODE='MESSAGE' AND m.[TYPE] = 'RESPONSE' THEN 3\n" +
            "       WHEN m.DIRECTION = 'INCOMING' AND m.MODE='STATUS' AND m.[TYPE] = 'RESPONSE' THEN 4\n" +
            "       WHEN m.DIRECTION = 'OUTGOING' AND m.MODE='MESSAGE' AND m.[TYPE] = 'REQUEST' THEN 5\n" +
            "       end\n" +
            "FROM   [MESSAGE] AS m\n" +
            "WHERE  m.INTERACTION_ID = (\n" +
            "           SELECT m2.INTERACTION_ID\n" +
            "           FROM   [MESSAGE] AS m2\n" +
            "           WHERE  m2.ID_MESSAGE = :ID_MESSAGE\n" +
            "       )\n" +
            "ORDER BY\n" +
            "       ord ASC,m.CREATION_DATE DESC\n" +
            "       \n" +
            "       ";
    String MessagesInteractionByMessageIdOrderDesc2 = "" +
            "SELECT m.ID_MESSAGE, m.SEND_ID, m.RECEIVE_ID, m.INTERACTION_ID, m.[USER_ID],\n" +
            "       m.REFERENCE_ID, m.DIRECTION, m.MODE, m.[TYPE], m.[STATE], m.CONTENT_ID,\n" +
            "       m.SMEV_MESSAGE_ID, m.[DESCRIPTION], m.CODE, m.PERSONAL_SIGNATURE,\n" +
            "       m.CREATION_DATE, m.CHANGE_DATE, m.ID_MESSAGE2\n" +
            "FROM [MESSAGE] AS m\n" +
            "WHERE m.INTERACTION_ID = \n" +
            "(\n" +
            "SELECT m2.INTERACTION_ID FROM [MESSAGE] AS m2\n" +
            "WHERE m2.ID_MESSAGE = :ID_MESSAGE\t\n" +
            ")\n" +
            "ORDER BY m.ID_MESSAGE2 DESC";
    String PackageMessageByPackageId = "" +
            "SELECT top(1) [MESSAGE_ID]\n" +
            "      ,[PACKAGE_ID]\n" +
            "  FROM T_PACKAGE_MESSAGE\n" +
            "WHERE PACKAGE_ID = :PACKAGE_ID\n" +
            "ORDER BY CreateDate DESC";

    String MessageEntityByReceivetId ="" +
            "SELECT *\n" +
            "FROM [MESSAGE]\n" +
            "WHERE RECEIVE_ID = ?";;
    String GlobalPackageByStatusAndApplayProtocol = "" +
            "SELECT TOP(1) * FROM T_GLOBAL_PACKAGE AS g\n" +
            "WHERE " +
            "g.statusPackage = :statusPackage " +
            "AND ISNULL(g.applayProtocol,0) = :applayProtocol\n" +
            "ORDER BY g.createDate desc";
    String ListPackageHistoryByGlobalPac = "" +
            "SELECT h.*\n" +
            "FROM T_PACKAGE_HISTORY AS h\n" +
            "INNER JOIN LIST_FILES_PACKAGE AS f ON\n" +
            "f.packageID = h.packageID\n" +
            "WHERE f.packageIDGlobal = :packageIDGlobal\n";

    String getRoles = "" +
            "SELECT r.id, r.roles\n" +
            "FROM T_USER as u \n" +
            "INNER JOIN USERS_ROLES ur ON\n" +
            "u.ID = ur.[user_id]\n" +
            "INNER JOIN ROLES AS r ON\n" +
            "r.id = ur.role_id\n" +
            "WHERE u.ID = :id";
    String getRolesView = "" +
            "SELECT rv.INTERACTION_VIEW, rv.INQUIRY_VERSION_VIEW \n" +
            "FROM T_USER AS u\n" +
            "INNER JOIN USERS_ROLES ur ON\n" +
            "u.ID = ur.[user_id]\n" +
            "INNER JOIN ROLES AS r ON\n" +
            "r.id = ur.role_id\n" +
            "INNER JOIN ROLES_VIEW AS rv ON\n" +
            "rv.role_id = r.id\n" +
            "WHERE u.ID = :user_id\n" +
            "GROUP BY rv.INTERACTION_VIEW, rv.INQUIRY_VERSION_VIEW";
    String ListMessageSettings = "" +
            "SELECT [ID]\n" +
            "      ,[INQUIRY_VERSION_ID]\n" +
            "      ,[STRUCTURE_MODE]\n" +
            "      ,[STRUCTURE_SOURCE]\n" +
            "      ,[STRUCTURE_FROM]\n" +
            "      ,[ROOT_ELEMENT]\n" +
            "      ,[CONTENT_ELEMENT]\n" +
            "      ,[DYNAMIC_ROUTING]\n" +
            "      ,[IDENTIFIER_ROUTING]\n" +
            "      ,[ATTACHMENTS]\n" +
            "      ,[PERSONAL_SIGNATURE]\n" +
            "      ,[CREATION_DATE]\n" +
            "      ,[CHANGE_DATE]\n" +
            "  FROM [MESSAGE_SETTINGS]";
    String ListAttachmentsWithoutContent = "" +
            "SELECT [ID]\n" +
            "      ,[MESSAGE_ID]\n" +
            "      ,[TRANSFER_METHOD]\n" +
            "      ,[FILE_NAME]\n" +
            "      ,[CONTENT_TYPE]\n" +
            "      ,[CONTENT_PATH]\n" +
            "      ,[CREATION_DATE]\n" +
            "  FROM [ATTACHMENTS]\n" +
            "WHERE MESSAGE_ID =:MESSAGE_ID ";
    String AttachmentEntityById = "" +
            "SELECT [ID]\n" +
            "      ,[MESSAGE_ID]\n" +
            "      ,[TRANSFER_METHOD]\n" +
            "      ,[FILE_NAME]\n" +
            "      ,[CONTENT_TYPE]\n" +
            "      ,[CONTENT_PATH]\n" +
            "      ,[CONTENT]\n" +
            "      ,[CREATION_DATE]\n" +
            "  FROM [ATTACHMENTS]\n" +
            "WHERE ID = ?";
    String ListInquiryVersion = "" +
            "SELECT [ID]\n" +
            "      ,[NAMESPACE]\n" +
            "      ,[DESCRIPTION]\n" +
            "      ,[VERSION]\n" +
            "      ,[TEST_MESSAGE]\n" +
            "      ,[INTERACTION_TYPE]\n" +
            "      ,[PERSON]\n" +
            "      ,[PERSONAL_SIGNATURE]\n" +
            "      ,[ENABLE]\n" +
            "      ,[CREATION_DATE]\n" +
            "  FROM [INQUIRY_VERSION]\n" +
            "  --where [INTERACTION_TYPE] = :INTERACTION_TYPE" +
            "  ORDER BY [DESCRIPTION] asc";
    String MessagesByParam = "" +
            "SELECT m.ID_MESSAGE, m.SEND_ID, m.RECEIVE_ID, m.INTERACTION_ID, m.[USER_ID],\n" +
            "       m.REFERENCE_ID, m.DIRECTION, m.MODE, m.[TYPE], m.[STATE], m.CONTENT_ID,\n" +
            "       m.SMEV_MESSAGE_ID, m.[DESCRIPTION], m.CODE, m.PERSONAL_SIGNATURE,\n" +
            "       m.CREATION_DATE, m.CHANGE_DATE, m.ID_MESSAGE2 \n" +
            "\n" +
            "FROM [MESSAGE] AS m\n" +
            "\n" +
            "INNER JOIN BUSINESS_INTERACTION AS i ON\n" +
            "i.ID = m.INTERACTION_ID\n" +
            "\n" +
            "WHERE i.INQUIRY_VERSION_ID = :INQUIRY_VERSION_ID\n" +
            "AND m.DIRECTION = :DIRECTION AND m.MODE = :MODE\n" +
            "AND m.[TYPE] = :TYPE AND i.[STATE] = :STATE_INTERACTION AND m.[STATE] = :STATE";
    String INSERT_ZAGS_SMEV = "" +
            "INSERT INTO [T_ZAGS_SMEV](\n" +
            "           [SURNAME]\n" +
            "           ,[NAME]\n" +
            "           ,[SECNAME]\n" +
            "           ,[BIRTHDAY]\n" +
            "           ,[SNILS]\n" +
            "           ,[DEATHD]\n" +
            "           ,[ACTNOMER]\n" +
            "           ,[ACTDATE]\n" +
            "           ,[SER_NUM]\n" +
            "           ,[ADDRESS_LIVE_LAST]\n" +
            "           ,[MESSAGE_ID])\n" +
            "     VALUES\n" +
            "           (\n" +
            "           :SURNAME\n" +
            "           ,:NAME\n" +
            "           ,:SECNAME\n" +
            "           ,:BIRTHDAY\n" +
            "           ,:SNILS\n" +
            "           ,:DEATHD\n" +
            "           ,:ACTNOMER\n" +
            "           ,:ACTDATE\n" +
            "           ,:SER_NUM\n" +
            "           ,:ADDRESS_LIVE_LAST\n" +
            "           ,:MESSAGE_ID\t\n" +
            "           )";
    String MessageEntityBySmevId = "" +
            "SELECT * FROM [MESSAGE] AS m\n" +
            "WHERE m.SMEV_MESSAGE_ID = ?\n" +
            "AND m.INTERACTION_ID IS NOT NULL";
    String InquiryVersionByInteractionId = "" +
            "SELECT b.INQUIRY_VERSION_ID\n" +
            "FROM BUSINESS_INTERACTION AS b\n" +
            "WHERE b.ID = :INTERACTION_ID";
    String getRowTest = "" +
            "SELECT TOP(1) [content], id, uid \n" +
            "FROM t_receive_test WITH(ROWLOCK,UPDLOCK,READPAST)\n" +
            "WHERE \n" +
            "ISNULL(process,0) <> 2 ";
    String updateTest = "" +
            "UPDATE t_receive_test\n" +
            "WITH (ROWLOCK) \n" +
            "SET\n" +
            "process = 2\n" +
            "WHERE uid = ?";

    String ListOrdersPage = "P_LIST_ORDERS";

}




