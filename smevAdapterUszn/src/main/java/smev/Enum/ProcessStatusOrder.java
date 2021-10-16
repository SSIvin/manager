package smev.Enum;


public enum ProcessStatusOrder {
    UNKNOWN(0,""),
    IN_WORK(1, "в работе"),
    NOT_WORK(2, "не в работе");

    private final int index;
    private final String typeName;


    ProcessStatusOrder(int index, String typeName) {
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

    public static ProcessStatusOrder getStatusOrderById(Integer id) {
        for (ProcessStatusOrder e : values()) {
            if (e.index == id)
                return e;
        }
        return null;
    }
}
