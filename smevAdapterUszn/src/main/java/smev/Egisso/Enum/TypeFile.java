package smev.Egisso.Enum;

public enum TypeFile {

    FILE_NAZN (1,"Файл назначений"),
    FILE_TERM (2,"Файл прекращений"),
    FILE_CLASS(3,"Файл классификатора");


    private final int index;
    private final String typeFileName;

    TypeFile(int index, String typeFileName) {
        this.index = index;
        this.typeFileName = typeFileName;
    }

    public int index() {
        return index;
    }
    public String typeFileName() {
        return typeFileName;
    }



}
