package smev.Egisso.Enum;

public enum ApplayProtocol {


    YES(1, "Да"),
    NO(0, "");

    private final int index;
    private final String applayProtName;

    ApplayProtocol(int index, String applayProtName) {
        this.index = index;
        this.applayProtName = applayProtName;
    }

    public String applayProtName() {
        return applayProtName;
    }

    public String applayProtName(int index) {
        return applayProtName;
    }

    public int index() {
        return index;
    }

    public static ApplayProtocol getApplayProtNameById(Integer id) {
        for (ApplayProtocol e : values()) {
            if (e.index == id)
                return e;
        }
        return null;
    }

}
