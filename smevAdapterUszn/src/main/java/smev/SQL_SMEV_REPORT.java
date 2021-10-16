package smev;

public interface SQL_SMEV_REPORT {

    String getDataStatSmev = "" +
            "DECLARE @DATE_BEGIN DATETIME\n" +
            "DECLARE @DATE_END DATETIME\n" +
            "DECLARE @ID_REGION SMALLINT\n" +
            "\n" +
            "SET @DATE_BEGIN = :dataBegin\n" +
            "SET @DATE_END = :dataEnd\n" +
            "SET @ID_REGION = :ID_REGION\n" +
            "\n" +
            "--SET @DATE_BEGIN = '01.06.2021'\n" +
            "--SET @DATE_END = '24.06.2021'\n" +
            "--SET @ID_REGION = 34\n" +
            "\n" +
            "/*******************************************\n" +
            " * стастистика по запросам\n" +
            " *******************************************/\n" +
            " \n" +
            "DECLARE @InRequest TABLE (\n" +
            "id UNIQUEIDENTIFIER\n" +
            ",nameQ VARCHAR(250)\t\n" +
            ")\n" +
            "\n" +
            "INSERT INTO @InRequest\n" +
            "(\n" +
            "\tid,nameQ\n" +
            ")\n" +
            "SELECT m.INTERACTION_ID, q.[DESCRIPTION] \n" +
            "FROM [MESSAGE] AS m WITH ( READPAST )\n" +
            "\n" +
            "INNER JOIN BUSINESS_INTERACTION AS i WITH ( READPAST ) ON\n" +
            "i.ID = m.INTERACTION_ID\n" +
            "\n" +
            "INNER JOIN T_USER AS u ON\n" +
            "u.ID = i.[USER_ID]\n" +
            "\n" +
            "INNER JOIN INQUIRY_VERSION AS q ON\n" +
            "q.ID = i.INQUIRY_VERSION_ID\n" +
            "\n" +
            "\n" +
            "WHERE dbo.RETURN_date(m.CREATION_DATE) BETWEEN @DATE_BEGIN AND @DATE_END\n" +
            "AND m.DIRECTION = 'OUTGOING'\n" +
            "AND m.MODE = 'MESSAGE'\n" +
            "AND m.[TYPE] = 'REQUEST'\n" +
            "AND m.[STATE] = 'SENT'\n" +
            "AND (u.ID_REGION = @ID_REGION OR @ID_REGION = 0) \n" +
            "--AND i.INQUIRY_VERSION_ID = '48e1df59-bdb8-4688-a142-38cf27911a01'\n" +
            "\n" +
            "\n" +
            "GROUP BY m.INTERACTION_ID, q.[DESCRIPTION]\n" +
            "\n" +
            "\n" +
            "DECLARE @Resp TABLE (\n" +
            "nameQ VARCHAR(250)\n" +
            ",kolResp INT\t\n" +
            ")\n" +
            "\n" +
            "\n" +
            "/*из-за того что иногда в адаптер попадает по два и более ответов по одному запросу\n" +
            "* делаем через distinct и with*/\n" +
            ";WITH tt (INTERACTION_ID, SMEV_MESSAGE_ID) AS \n" +
            "(\n" +
            "SELECT distinct m.INTERACTION_ID, m.SMEV_MESSAGE_ID\n" +
            "FROM [MESSAGE] AS m  WITH ( READPAST )\n" +
            "\n" +
            "INNER JOIN BUSINESS_INTERACTION AS i WITH ( READPAST )  ON\n" +
            "i.ID = m.INTERACTION_ID\n" +
            "\n" +
            "INNER JOIN INQUIRY_VERSION AS q ON\n" +
            "q.ID = i.INQUIRY_VERSION_ID\n" +
            "\n" +
            "INNER JOIN @InRequest AS ir ON\n" +
            "ir.id = m.INTERACTION_ID\n" +
            "\n" +
            "WHERE --dbo.RETURN_date(m.CREATION_DATE) BETWEEN @DATE_BEGIN AND @DATE_END\n" +
            "m.DIRECTION = 'INCOMING'\n" +
            "AND m.[TYPE] = 'RESPONSE'\n" +
            "AND m.[STATE] = 'RECEIVED'\n" +
            "AND (m.MODE = CASE\n" +
            "\t\t\t\tWHEN q.ID IN (\n" +
            "\t\t\t\t\t\t'F0F6C33A-41E7-49A4-9759-D04950F8F78B' --Справка 3-НДФЛ\n" +
            "\t\t\t\t\t\t,'EC474D91-C8CF-494E-856F-5DB7677D7776'--Сведения из налоговых деклараций, представленных индивидуальными предпринимателями, применяющими специальные налоговые режимы\n" +
            "\t\t\t\t\t\t,'B07FF7CD-8450-462A-B2F6-21A05A2C6CBD'--О выплатах в пользу физических лиц\n" +
            "\t\t\t\t\t\t,'FA6BA6A8-7866-4608-A7A8-6AE84F5F4EAA' --Справка 2-НДФЛ\n" +
            "\t\t\t\t\t\t,'b0a8e342-f137-4021-8178-5bc5053826f4') --выписка по инвалиду\n" +
            "\t\t\t\t\t\tTHEN 'REJECT'\n" +
            "             END \n" +
            "\tOR m.MODE = 'MESSAGE'\n" +
            "\t)\n" +
            "             \n" +
            "/*или можно как выше или <>STATUS, но тогда ошибочные тоже посчитаются*/             \n" +
            "--AND m.MODE <> 'STATUS'\n" +
            "\n" +
            "--and i.INQUIRY_VERSION_ID = '751DAED9-5693-43B8-85D2-33075765D1B3'\n" +
            ")\n" +
            "\n" +
            "INSERT INTO @Resp\n" +
            "(\n" +
            "\tnameQ,\n" +
            "\tkolResp\n" +
            ")\n" +
            "SELECT q.[DESCRIPTION] , COUNT(*) AS RESPONSE \n" +
            "\n" +
            "FROM tt\n" +
            "\n" +
            "INNER JOIN BUSINESS_INTERACTION AS i WITH ( READPAST )  ON\n" +
            "i.ID = tt.INTERACTION_ID\n" +
            "\n" +
            "INNER JOIN INQUIRY_VERSION AS q ON\n" +
            "q.ID = i.INQUIRY_VERSION_ID\n" +
            "\n" +
            "GROUP BY q.[DESCRIPTION]\n" +
            "\n" +
            "\n" +
            "SELECT i.nameQ, COUNT(*) AS kolReq, r.kolResp AS kolResp\n" +
            "\n" +
            "FROM @InRequest i\n" +
            "\n" +
            "LEFT JOIN @Resp AS r ON\n" +
            "r.nameQ = i.nameQ\n" +
            "\n" +
            "GROUP BY i.nameQ, r.kolResp \n";

}




