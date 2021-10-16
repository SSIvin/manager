package smev.FRI.Dao;

public interface SQLFRI {


    String INSERT_ORDERING = "" +
            "IF not EXISTS(SELECT 1 FROM [ORDERING] AS o WHERE o.ID_ORDERING=:ID_ORDERING) BEGIN\n" +
            "INSERT INTO [ORDERING]\n" +
            "           ([ID_ORDERING]\n" +
            "           ,[MESSAGE_ID]\n" +
            "           ,[SNILS]\n" +
            "           ,[STATE])\n" +
            "     VALUES\n" +
            "           (:ID_ORDERING\n" +
            "           ,:MESSAGE_ID\n" +
            "           ,:SNILS\n" +
            "           ,:[STATE])\n"+
                        "END";
    String INSERT_DOCUMENT = "" +
            "INSERT INTO [DOCUMENT]\n" +
            "           ([ID_DOCUMENT]\n" +
            "           ,[ORDERING_ID])\n" +
            "     VALUES\n" +
            "           (:ID_DOCUMENT\n" +
            "           ,:ORDERING_ID)";

    String INSERT_ZAPIS = "" +
            "INSERT INTO [ZAPIS]\n" +
            "           ([ID_ZAPIS]\n" +
            "           ,[DOCUMENT_ID]\n" +
            "           ,[KEY]\n" +
            "           ,PARENT\n" +
            "           ,KOD\n" +
            "           ,[NAME]\n" +
            "           ,TARGET)\n" +
            "     VALUES\n" +
            "           (:ID_ZAPIS\n" +
            "           ,:DOCUMENT_ID\n" +
            "           ,:[KEY]\n" +
            "           ,:PARENT\n" +
            "           ,:KOD\n" +
            "           ,:[NAME]\n" +
            "           ,:TARGET)";

    String INSERT_ATTRIBUT = "" +
            "INSERT INTO [ATTRIBUT]\n" +
            "           ([KOD]\n" +
            "           ,[ZAPIS_ID]\n" +
            "           ,[DOCUMENT_ID]\n" +
            "           ,[NAME]\n" +
            "           ,[TYPE]\n" +
            "           ,[VALUE])\n" +
            "     VALUES\n" +
            "           (\n" +
            ":KOD\n" +
            ",:ZAPIS_ID\n" +
            ",:DOCUMENT_ID\n" +
            ",:[NAME]\n" +
            ",:[TYPE]\n" +
            ",:VALUE\n" +
            ")";
}
