package smev.Egisso.Enum;

public enum StatusPackageSmev {


    EMPTY(0, ""),
    DRAFT(1, "Черновик"),
    SENT(2, "Отправлен в адаптер"),
    SENDING(3, "Отправка"),
    UNSENT(4, "Ошибка отправки"),
    PROTOCOL_RECEIVED(5, "Ответ получен"),
    DELIVERED(6, "Отправлен в СМЭВ"),
    REJECT(7, "Возврат");


    private final int index;
    private final String statusName;

    StatusPackageSmev(int index, String statusName) {
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

    public static StatusPackageSmev getStatusPackageById(Integer id) {
        for (StatusPackageSmev e : values()) {
            if (e.index == id)
                return e;
        }
        return null;
    }

}
