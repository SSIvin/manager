package smev.FRI.Enum;

public enum ZapisType {

    MSE_BURO(0, "MSE.BURO"),
    MSE_IPRA_GENERAL(1, "MSE.IPRA.GENERAL");

    private final int index;
    private final String zapisName;

    ZapisType(int index, String zapisName) {
        this.index = index;
        this.zapisName = zapisName;
    }

    public int index() {
        return index;
    }

    public String zapisName() {
        return zapisName;
    }

    public String zapisName(int index) {
        return zapisName;
    }

    public static ZapisType getZapisTypeByName(String zapisName) {
        for (ZapisType e : values()) {
            if (e.zapisName.equals(zapisName))
                return e;
        }
        return null;
    }
}
