package smev.Reestr;

public interface SQL_REESTR {

    String mapDateForGisJkh = "" +
            "DECLARE @DATE_33 DATETIME, @DATE_79 DATETIME\n" +
            "\n" +
            "SELECT @DATE_33 = dbo.RETURN_date(MAX(tmp.DATE_COUNT))\n" +
            "FROM T_MEMORY_PAY AS tmp\n" +
            "WHERE tmp.ID_TYPEPAY = 33 \n" +
            "\n" +
            "SELECT @DATE_79 = dbo.RETURN_date(MAX(tmp.DATE_COUNT))\n" +
            "FROM T_MEMORY_PAY AS tmp\n" +
            "WHERE tmp.ID_TYPEPAY = 79\n" +
            "\n" +
            "SELECT @DATE_33 AS DATE_33,@DATE_79 AS DATE_79";

//    String ListData = "" +
//            "SELECT * FROM dbo.F_LIST_DATA_JKH(:ID_REGION,:DATE_33, :DATE_79) AS f\n" +
//            "ORDER BY f.ID_REGION, ID_SUBJECT";

   String ListData = "" +
           "DECLARE @tt TABLE (\n" +
           "\tidRegion SMALLINT\n" +
           "\t,idSubject INT\n" +
           ")\n" +
           "INSERT INTO @tt\n" +
           "(\n" +
           "\tidRegion,\n" +
           "\tidSubject\n" +
           ")\n" +
           "/*выберем кто не был отправлен в гис жкх по параметру idResultFromGisJkh*/\n" +
           "SELECT r.idRegion, r.idSubject\n" +
           "FROM [SQL-442-1].GisJkh.dbo.DATA_REQUEST r\n" +
           "INNER JOIN [SQL-442-1].GisJkh.dbo.DATA_PACKAGE AS dp ON\n" +
           "dp.transportId = r.transportId\n" +
           "\n" +
           "INNER JOIN [SQL-442-1].GisJkh.dbo.PACKAGES AS p ON\n" +
           "p.IdPackage = dp.packageId\n" +
           "\n" +
           "WHERE p.globalPackageId = :globalPackageId\n" +
           "AND r.idResultFromGisJkh IS NULL\n" +
           "GROUP BY r.idRegion, r.idSubject\n" +
           "\n" +
           "IF (SELECT COUNT(*) FROM @tt) > 0\n" +
           "BEGIN\n" +
           "\t/*если кто есть в @tt то выберем только их*/\n" +
           "\tSELECT f.* \n" +
           "\tFROM F_LIST_DATA_JKH (:ID_REGION,:DATE_33, :DATE_79) f\n" +
           "\n" +
           "\tINNER JOIN @tt as t ON\n" +
           "\tf.ID_REGION = t.idRegion AND f.ID_SUBJECT = t.idSubject\n" +
           "\n" +
           "END\n" +
           "ELSE\n" +
           "BEGIN\n" +
           "\t/*иначе выберем полный набор*/\n" +
           "\tSELECT f.* \n" +
           "\tFROM F_LIST_DATA_JKH (:ID_REGION,:DATE_33, :DATE_79) f\n" +
           "END";

    String getListSubject = "" +
//            "TRUNCATE TABLE TEMP_test_insert_thread;\n" +
            "SELECT TOP(1000000) s.ID_REGION AS idR, s.ID_SUBJECT AS idSubject, s.SURNAME AS f, s.NAME AS i, s.SECNAME AS o\n" +
            "FROM T_SUBJECT AS s";
    String paySubject = "" +
            "SELECT TOP(1) ISNULL(h.SNAZN,0) AS SNAZN FROM T_HISTORY_PAY AS h WITH (NOLOCK)\n" +
            "WHERE h.ID_REGION = :ID_REGION\n" +
            "AND h.ID_SUBJECT = :ID_SUBJECT";
    String INSERT_TO_TABLE = "" +
            "INSERT INTO [TEMP_test_insert_thread]\n" +
            "           ([ID_REGION]\n" +
            "           ,[ID_SUBJECT]\n" +
            "           ,[SUMMA])\n" +
            "     VALUES\n" +
            "           (\n" +
            "           :ID_REGION,\n" +
            "           :ID_SUBJECT,\n" +
            "           :SUMMA\t\n" +
            "           )\n" +
            "           \t";
    String DataForNalog37 = "" +
            "SELECT * FROM T_NALOG_MNOGODET";
    String getMaxDatZ = "" +
            "\tSELECT \n" +
            "\tmax(thp.datz)\n" +
            "\tFROM T_HISTORY_PAY AS thp\n" +
            "\tWHERE  thp.ID_TYPE_PAY IN (33, 79)";
    String getRekvezitsByIdRegion = "" +
            "SELECT [ID_REGION]\n" +
            "      ,[FULL_NAME]\n" +
            "      ,[SHORT_NAME]\n" +
            "FROM [T_D_REKVEZITS]\n" +
            "WHERE ID_REGION = :ID_REGION";
    String getDataChangePFRKSZN = "EXEC [P_RESP_PFR_KSZN] :dateCreate";



}
