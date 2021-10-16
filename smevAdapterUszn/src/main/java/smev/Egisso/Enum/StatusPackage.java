package smev.Egisso.Enum;

public enum StatusPackage {


    EMPTY(0, ""),
    LOAD(1, "Загружен"),//обновляю в процедуре применения протоколов
    ERROR(2, "Обработан с ошибкой"),
    CREATED(3, "Сформирован"),
    BEGIN_CREATED(4, "Начатый для формирования"),
    LOAD_PROTOCOL(5, "Протоколы загружены");


    private final int index;
    private final String statusName;

    StatusPackage(int index, String statusName) {
        this.index = index;
        this.statusName = statusName;
    }

    public String statusName() {
        return statusName;
    }

    public String statusName(int index) {
        return statusName;
    }

    public int index() {
        return index;
    }

    public static StatusPackage getStatusPackageById(Integer id) {
        for (StatusPackage e : values()) {
            if (e.index == id)
                return e;
        }
        return null;
    }

}
