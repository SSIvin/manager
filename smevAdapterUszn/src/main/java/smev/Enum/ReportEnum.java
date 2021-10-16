package smev.Enum;

public enum ReportEnum {


    EMPTY(0, "", ""),
    STAT_SMEV(1, "TemplateStatisticSmev.xsl", "Статистика запросов по СМЭВ");


    private final int index;
    private final String xsltName;
    private final String reportName;


    ReportEnum(int index, String xsltName, String reportName) {
        this.index = index;
        this.reportName = reportName;
        this.xsltName = xsltName;
    }

    public String typeName() {
        return reportName;
    }

    public String xsltName() {
        return xsltName;
    }

    public String typeName(int index) {
        return reportName;
    }

    public int index() {
        return index;
    }

    public static ReportEnum getReportEnumByIndex(Integer index) {
        for (ReportEnum e : values()) {
            if (e.index == index)
                return e;
        }
        return null;
    }

}
