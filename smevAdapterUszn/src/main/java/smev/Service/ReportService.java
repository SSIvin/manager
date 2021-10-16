package smev.Service;

import org.w3c.dom.Element;
import smev.Dto.ReportDataDto;
import smev.Dto.ReportParamDto;
import smev.Enum.ReportEnum;

public interface ReportService {

    Element ContentStringToElement(String content);

    String CreateReport(ReportDataDto reportDataDto);

//    String CreateReportOfStrategy(ReportEnum reportEnum, ReportParamDto reportParamDto);

    String transformToHtml(String xsltForm, Element marshal);
}
