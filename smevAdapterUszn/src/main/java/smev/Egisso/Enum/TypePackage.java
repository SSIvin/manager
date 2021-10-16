package smev.Egisso.Enum;

public enum TypePackage {

    EMPTY(0,""),
    PACKAGE_KMSZ (1,"Реестр ЛМСЗ"),
    PACKAGE_FACT (2,"Реестр фактов назначений"),
    PACKAGE_PROTOCOL (3,"Протоколы");

    private final int index;
    private final String typeName;

    TypePackage(int index, String typeName) {
        this.index = index;
        this.typeName = typeName;
    }

    public int index() {
        return index;
    }
    public String typeName() {
        return typeName;
    }

    public String typeName(int index) {
        return typeName;
    }

    public static TypePackage getTypePackageById(Integer id) {
        for(TypePackage e : values()) {
            if(e.index == id)
                return e;
        }
        return null;
    }

}
