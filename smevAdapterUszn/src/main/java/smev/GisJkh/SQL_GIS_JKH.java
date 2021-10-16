package smev.GisJkh;

import io.swagger.annotations.ApiParam;

public interface SQL_GIS_JKH {



    String ListDataRequestRequest = "" +
            "DECLARE @currDate DATETIME\n" +
            "DECLARE @countDayPlusOfResponseDate INT\n" +
            "SET @countDayPlusOfResponseDate = :countDayPlusOfResponseDate\n" +
            "SET @currDate = dbo.Get_date() \n" +
            "--SELECT DATEADD(DAY,0,@currDate) \n" +
            "\n" +
            "----на которые еще не было ответа\n" +
            "--SELECT r.* \n" +
            "--FROM DATA_REQUEST AS r \n" +
            "--\n" +
            "--INNER JOIN DATA_PACKAGE AS dp ON\n" +
            "--dp.transportId = r.transportId\n" +
            "--\n" +
            "--INNER JOIN PACKAGES AS p ON\n" +
            "--dp.packageId = p.IdPackage\n" +
            "--\n" +
            "--INNER JOIN GLOBAL_PACKAGE AS g ON\n" +
            "--g.idGlobalPackage = p.globalPackageId\n" +
            "--\n" +
            "--WHERE \n" +
            "--g.idGlobalPackage = '48b2c1c2-fe13-40cc-b941-c73a7b72344a' and  \n" +
            "--p.typePackage = 'IMPORT' \n" +
            "--and ISNULL(r.resultType,'') <> 'SUCCESS' \n" +
            "--and r.idResultFromGisJkh IS NOT NULL \n" +
            "--\n" +
            "--UNION\n" +
            "\n" +
            "--берем тех у кого есть  idResultFromGisJkh\n" +
            "--не берем тех по которым пришел ответ PROCESSED\n" +
            "--если есть ответ то берем по дате готовности + 1 день к примеру\n" +
            "SELECT r.transportId, r.actionType, r.idRegion, r.idSubject, r.fiasId, r.firstName,\n" +
            "       r.lastName, ISNULL(r.middleName,'') AS middleName, r.snils, r.docType, r.docSeries, r.docNumber,\n" +
            "       r.[address], r.executorId, r.errorCode, r.[description], r.stacktrace,\n" +
            "       r.resultType, r.idResultFromGisJkh, r.createDate, r.changeDate \n" +
            "FROM DATA_REQUEST AS r\n" +
            "\n" +
            "INNER JOIN DATA_PACKAGE AS dp ON\n" +
            "dp.transportId = r.transportId\n" +
            "\n" +
            "INNER JOIN PACKAGES AS p ON\n" +
            "dp.packageId = p.IdPackage\n" +
            "\n" +
            "LEFT JOIN DATA_RESPONSE AS resp ON\n" +
            "resp.requestId = r.idResultFromGisJkh\n" +
            "\n" +
            "WHERE ISNULL(resp.[status],'') <> 'PROCESSED'\n" +
            "and p.globalPackageId = :idGlobalPackage \n" +
            "and r.idResultFromGisJkh IS NOT NULL \n" +
            "and p.typePackage = :typePackage\n" +
            "--запрашиваем в положенный день ответа(0) или еще раз на n день\n" +
            "--AND DATEADD(DAY,@countDayPlusOfResponseDate,resp.responseDate) = @currDate ";

    String LastGlobalPackage = "" +
            "SELECT TOP(1) * \n" +
            "FROM GLOBAL_PACKAGE AS g\n" +
            "ORDER BY g.createDate DESC";


    @ApiParam("Список пакетов с ошибкой для повторной отправки")
    String ListIdPackageForReSend = "" +
            "SELECT dp.packageId \n" +
            "\n" +
            "FROM DATA_REQUEST AS r\n" +
            "\n" +
            "INNER JOIN DATA_PACKAGE AS dp ON\n" +
            "dp.transportId = r.transportId\n" +
            "\n" +
            "INNER JOIN PACKAGES AS p ON\n" +
            "p.IdPackage = dp.packageId\n" +
            "\n" +
            "INNER JOIN GLOBAL_PACKAGE AS gp ON\n" +
            "gp.idGlobalPackage = p.globalPackageId\n" +
            "\n" +
            "WHERE p.mode IN ('ERROR', 'REJECT') \n" +
            "AND p.typePackage = :typePackage\n" +
            "AND p.globalPackageId = :idGlobalPackage\n" +
            "\n" +
            "GROUP BY dp.packageId";

    @ApiParam("Список Request с ошибкой для повторной отправки")
    String ListRequestForReSend = "" +
            "SELECT r.*\n" +
            "\n" +
            "FROM DATA_REQUEST AS r\n" +
            "\n" +
            "INNER JOIN DATA_PACKAGE AS dp ON\n" +
            "dp.transportId = r.transportId\n" +
            "\n" +
            "INNER JOIN PACKAGES AS p ON\n" +
            "p.IdPackage = dp.packageId\n" +
            "\n" +
            "WHERE p.mode IN ('MESSAGE') \n" +
            "AND p.typePackage = 'IMPORT'\n" +
            "AND p.globalPackageId = :idGlobalPackage\n" +
            "AND r.resultType = 'ERROR'\n" +
            "AND r.idResultFromGisJkh IS NULL\n";


    String ListRequestByIdPackage = "" +
            "SELECT r.* \n" +
            "\n" +
            "FROM DATA_REQUEST AS r\n" +
            "\n" +
            "INNER JOIN DATA_PACKAGE AS dp ON\n" +
            "dp.transportId = r.transportId\n" +
            "\n" +
            "WHERE dp.packageId = :packageId";

    String ListForRevok = "" +
            "SET DATEFORMAT dmy;\n" +
            "SELECT c.[CONTENT]  \n" +
            "\n" +
            "FROM [MESSAGE] AS m\n" +
            "\n" +
            "INNER JOIN BUSINESS_INTERACTION AS i ON\n" +
            "i.ID = m.INTERACTION_ID\n" +
            "AND m.DIRECTION = 'INCOMING'\n" +
            "AND m.MODE = 'MESSAGE'\n" +
            "AND m.[TYPE] = 'RESPONSE'\n" +
            "AND m.[STATE] = 'RECEIVED'\n" +
            "\n" +
            "INNER JOIN MESSAGE_CONTENT AS c ON\n" +
            "c.ID_CONTENT = m.CONTENT_ID\n" +
            "\n" +
            "WHERE dbo.RETURN_date(m.CREATION_DATE) = '09.06.2021'\n" +
            "AND i.INQUIRY_VERSION_ID = 'A4CE1C62-9825-49B2-967B-ED1FAE01DAC3'";

//    String INSERT_ORDERING = "" +
//            "IF not EXISTS(SELECT 1 FROM [ORDERING] AS o WHERE o.ID_ORDERING=:ID_ORDERING) BEGIN\n" +
//            "INSERT INTO [ORDERING]\n" +
//            "           ([ID_ORDERING]\n" +
//            "           ,[MESSAGE_ID]\n" +
//            "           ,[SNILS]\n" +
//            "           ,[STATE])\n" +
//            "     VALUES\n" +
//            "           (:ID_ORDERING\n" +
//            "    /       ,:MESSAGE_ID\n" +
//            "           ,:SNILS\n" +
//            "           ,:[STATE])\n"+
//            "END";

}
