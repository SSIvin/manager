package smev.Enum;

import java.util.UUID;

public enum TypeRequestSmev {


    EMPTY(0, ""),
    SNILS(1, "Запрос СНИЛС"),
    KMSZ_EGISSO(2, "Классификатор ЕГИССО"),
    INFO_EGISSO_BY_SNILS(3, "Информирование из ЕГИССО по СНИЛС");

    private final int index;
    private final String typeName;


    TypeRequestSmev(int index, String typeName) {
        this.index = index;
        this.typeName = typeName;
    }

    public String typeName() {
        return typeName;
    }

    public String typeName(int index) {
        return typeName;
    }

    public int index() {
        return index;
    }

    public static TypeRequestSmev getTypeRequestSmevById(Integer id) {
        for (TypeRequestSmev e : values()) {
            if (e.index == id)
                return e;
        }
        return null;
    }

}
