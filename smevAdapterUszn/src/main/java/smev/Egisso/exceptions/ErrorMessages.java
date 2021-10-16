package smev.Egisso.exceptions;

public enum ErrorMessages {
    KMSZ_NO_SEND("Формирование фактов невозможно пока не отправлен классификатор и не загруженны протоколы по классификатору"),
    PACKAGE_NO_SEND("Формировние фактов невозможно, пакет с фактами уже сформирован."),
    KMSZ_NO_START("Формирование классификатора не возможно! он уже сформирован, но не отправлен."),
    NOT_KMSZ_CHANGE("Отсутствуют меры для изменений"),
    EMPTY_GUID_HISTORY("пустой Guid меры в истории гуидов"),
    ERROR_EXEC_SQL_NPA_KMSZ("ERROR_EXEC_SQL_NPA_KMSZ"),
    ERROR_SQL_GET_LAST_GUID_KMSZ("ERROR_SQL_GET_LAST_GUID_KMSZ"),
    Empty_Array_Npa("Пустой перечень НПА по мере"),
    Empty_Array_Category("Пустой перечень Категорий по мере"),
    ERROR_file_Splitting("Ошибка разбиение списка назначений на файлы"),
    Empty_last_guid_msz("Отсутствует исторический гуид по мере"),
    ERROR_EXEC_SQL_PROC_GET_NEW_PACKAGE_GUID("ERROR_EXEC_SQL_PROC_GET_NEW_PACKAGE_GUID"),
    ERROR_SQL_INSERT_FILE_KMSZ("ERROR_SQL_INSERT_FILE_KMSZ"),
    ERROR_SQL_CATEG_KMSZ("ERROR_SQL_CATEG_KMSZ"),
    ERROR_SQL_CHEKING_KMSZ_SEND("ERROR_SQL_CHEKING_KMSZ_SEND"),
    ERROR_SQL_LIST_KMSZ_FOR_CHANGE("ERROR_SQL_LIST_KMSZ_FOR_CHANGE"),
    ERROR_SQL_PROC_UPDATE_GUID("ERROR_SQL_PROC_UPDATE_GUID"),
    ERROR_SQL_INSERT_FILE_ASSIGN("ERROR_SQL_INSERT_FILE_ASSIGN"),
    ERROR_SET_PARAM_SQL_INSERT_FILE_ASSIGN("ERROR_SET_PARAM_SQL_INSERT_FILE_ASSIGN"),
    ERROR_SQL_INSERT_PROTOCOL("ERROR_SQL_INSERT_PROTOCOL"),
    ERROR_SQL_LIST_FILE_GUID("ERROR_SQL_LIST_FILE_GUID"),
    ERROR_SQL_UPDATE_FILE("ERROR_SQL_UPDATE_FILE"),
    ERROR_SQL_P_SELECT_FROM_TERMINATE("ERROR_SQL_P_SELECT_FROM_TERMINATE"),
    ERROR_SQL_CountNoSendProtocol("ERROR_SQL_CountNoSendProtocol"),
    ERROR_SQL_spFill("ERROR_SQL_spFill"),
    ERROR_SQL_INSERT_PROTOCOL_BATCH("ERROR_SQL_INSERT_PROTOCOL_BATCH"),
    ERROR_SQL_SELECT_FROM_NAZN("ERROR_SQL_SELECT_FROM_NAZN"),
    ERROR_SQL_LastPackageNoSend("ERROR_SQL_LastPackageNoSend"),
    ERROR_fill_reason_persons("Ошибка получения состава семьи"),
    ERROR_SQL_GET_NO_SEND_KMSZ("ERROR_SQL_GET_NO_SEND_KMSZ"),
    ERROR_SQL_APPALY_PROTOCOL("Ошибка выполнения процедуры APPALY_PROTOCOL по обработке протоколов"),
    ERROR_SQL_PROC_GET_NEW_PACKAGE_GUID("ERROR_SQL_PROC_GET_NEW_PACKAGE_GUID"),
    ERROR_MARSHLING_NAZN("Ошибка маршалинга файла назначений"),
    ERROR_UNMARSHLING("Ошибка демаршалинга файла"),
    ERROR_MARSHLING_KMSZ("Ошибка маршалинга файла классификатора"),
    ERROR_EMPTY_ARRAY_LIST_LOCAL_MSZ("Ошибка наполнения массива мера для изменений"),
    ERROR_CREATE_KMSZ ("Ошибка формирования классификатора"),
    ERROR_DB_FillNazn("Ошибка наполнения данных новый/старые"),
    ERROR_DB_FillTempResonPersons("Ошибка наполнения таблицы состава семьи"),
    ERROR_COPY_FROM_SMB("Ошибка копирования файлов из SMB"),
    ERROR_COPY_IN_SMB("Ошибка копирования файлов в SMB"),
    ERROR_SQL_Empty_Fact("В базе нет не отправленных пакетов с фактами."),
    ERROR_SCHEDULLER("Непредвиденная ошибка планировщика"),
    ERROR_SQL_findGuidInTable("ERROR_SQL_findGuidInTable"),
    FILE_GUID_NOT_FOUND("Файл с таким гуидом уже загружен или не найден ни в одной таблице"),
    ERROR_COPY_FILE_TO_COPY("Ошибка копирования в папку copy"),
    ERROR_DELETE_FILE("Ошибка удаления файла"),
    ERROR_FILE_NOT_FOUND("Файл не найден"),
    ERROR_CLEAR_DIR("Ошибка очистки каталога"),
    ERROR_COPY_DIR_TO_DIR("Ошибка копирования папки в папку"),
    ERROR_("Непредвиденная ошибка"),
    Empty_Array_methods("Пустой перечень способ получения по мере"),
    ERROR_EXEC_SQL_METHODS_KMSZ("ERROR_EXEC_SQL_METHODS_KMSZ"),
    Empty_Array_FormReq("Пустой перечень форма обращения по мере"),
    ERROR_EXEC_SQL_FORMREQ_KMSZ("ERROR_EXEC_SQL_FORMREQ_KMSZ"),
    Empty_Array_FormRecieve("Пустой перечень форма получения результата по мере"),
    ERROR_EXEC_SQL_FORMRECIEVE_KMSZ("ERROR_EXEC_SQL_FORMRECIEVE_KMSZ"),
    Empty_Array_Doc_type_list("Пустой перечень документов по мере"),
    ERROR_EXEC_SQL_DOCTYPELIST_KMSZ("ERROR_EXEC_SQL_DOCTYPELIST_KMSZ"),
    Empty_Array_stepsMSZ("Пустой перечень шагов по мере"),
    ERROR_EXEC_SQL_STEPS_MSZ_KMSZ("ERROR_EXEC_SQL_STEPS_MSZ_KMSZ"),
    ERROR_SQL_WRITE_ID_EXEC("ERROR_SQL_WRITE_ID_EXEC"),
    ERROR_SQL_insertPackageFact("ERROR_SQL_insertPackageFact"),
    ERROR_SQL_spFillTempAsign("ERROR_SQL_spFillTempAsign"),
    ERROR_SQL_getGlobalPackage("ERROR_SQL_getGlobalPackage"),
    ERROR_COPY_IN_SMB_getOutputStream("ERROR_COPY_IN_SMB_getOutputStream"),
    ERROR_COPY_IN_SMB_copy("ERROR_COPY_IN_SMB_copy"),
    ERROR_COPY_IN_SMB_newSmbFile("ERROR_COPY_IN_SMB_newSmbFile"),
    ERROR_SQL_SET_APPALY_PROTOCOL("Ошибка изменения статуса глобального пакета");


    private String errorMessage;

    ErrorMessages(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
