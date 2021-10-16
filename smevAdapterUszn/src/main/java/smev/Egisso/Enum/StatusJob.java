package smev.Egisso.Enum;

public enum StatusJob {

    EMPTY(0, ""),
    OK(1, "OK"),
    ERROR(2, "ERROR");

    private final int index;
    private final String statusName;

    StatusJob(int index, String statusName) {
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

    public static StatusJob getStatusJobById(Integer id) {
        for (StatusJob e : values()) {
            if (e.index == id)
                return e;
        }
        return null;
    }


}
