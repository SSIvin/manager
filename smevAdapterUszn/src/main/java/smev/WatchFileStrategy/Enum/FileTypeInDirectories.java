package smev.WatchFileStrategy.Enum;

public enum FileTypeInDirectories {

    EMPTY(0, "", "все остальные файлы"),
    ADRESS_PFR(1, "", "по Адреске запрос из ПФР"),
    ALL(2, "", "все остальные файлы");

    private final int index;
    private final String className;
    private final String processName;


    FileTypeInDirectories(int index, String className, String processName) {
        this.index = index;
        this.processName = processName;
        this.className = className;
    }

    public String typeName() {
        return processName;
    }

    public String xsltName() {
        return className;
    }

    public String typeName(int index) {
        return processName;
    }

    public int index() {
        return index;
    }

    public static FileTypeInDirectories getFileTypeInDirectoriesByIndex(Integer index) {
        for (FileTypeInDirectories e : values()) {
            if (e.index == index)
                return e;
        }
        return null;
    }
}
