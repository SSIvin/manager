package smev.Enum;

/*
 * Статус обработки сообщений в таблице t_receive
 *
 * */

public enum ReceiveMessageStatus {

    OK(0, "OK"),
    ERROR(1, "ERROR");

    private final int index;
    private final String statusName;

    ReceiveMessageStatus(int index, String statusName) {
        this.index = index;
        this.statusName = statusName;
    }

    public int index() {
        return index;
    }

    public String statusName() {
        return statusName;
    }

    public String statusName(int index) {
        return statusName;
    }

    public static ReceiveMessageStatus getStatusJobById(Integer id) {
        for (ReceiveMessageStatus e : values()) {
            if (e.index == id)
                return e;
        }
        return null;
    }


}
