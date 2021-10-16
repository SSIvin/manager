package smev.Report;

import smev.Dto.ReportParamDto;

public interface CreateReportStrategy {

   String createReport(ReportParamDto reportParamDto);

    Integer getIndexReport();

}
