package smev.Enum;


public enum StatusOrder{
    UNKNOWN(0,""),
    SUCCESS(5, "обработка запросов закончена"),
    PROCESS(1, "в ожидании ответов"),
    ERROR(2, "ошибка"),
    WARNING(3, "предупреждение"),
    DELETED(4,"удален");

    private final int index;
    private final String typeName;


    StatusOrder(int index, String typeName) {
        this.index = index;
        this.typeName = typeName;
    }

    public String statusName() {
        return typeName;
    }

    public String statusName(int index) {
        return typeName;
    }

    public int index() {
        return index;
    }

    public static StatusOrder getStatusOrderById(Integer id) {
        for (StatusOrder e : values()) {
            if (e.index == id)
                return e;
        }
        return null;
    }
}
