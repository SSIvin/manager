package smev.Report;

import smev.Dto.ReportParamDto;

//стратегия по умолчанию
public class DefaultCreateReportStrategy implements CreateReportStrategy {


    @Override
    public String createReport(ReportParamDto reportParamDto) {
        return "";
    }

    @Override
    public Integer getIndexReport() {
        return 0;
    }
}
