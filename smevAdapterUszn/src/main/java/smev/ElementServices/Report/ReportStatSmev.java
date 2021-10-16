package smev.ElementServices.Report;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import smev.Dto.ReportParamDto;
import smev.Enum.ReportEnum;
import smev.Marshaller.Marshaller;
import smev.Reestr.Dao.ReestrDao;
import smev.Reestr.Entity2.Rekvezits;
import smev.Report.CreateReportStrategy;
import smev.Service.ReportService;
import smev.dao.SmevDaoReport;
import smev.utils.LocalDateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.List;


/*
* Отчет  - статистика запросов по СМЭВ
*
*
* */


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "", propOrder = {
//        "rowStatSmev"
//})
@XmlRootElement(name = "ReportStatSmev")
@Component
public class ReportStatSmev implements CreateReportStrategy {


    @Autowired
    @XmlTransient
    private SmevDaoReport smevDaoReport;

    @Autowired
    @XmlTransient
    private ReportService reportService;

    @Autowired
    @XmlTransient
    private ReestrDao reestrDao;

    @XmlElementWrapper(name = "Data")
    @XmlElement(required = true)
    private List<rowStatSmev> rowStatSmev;

    @XmlElement(required = true, name = "OrgParam")
    private OrgParam orgParam;


    @XmlElement(required = true)
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate dateBegin;

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate dateEnd;

    @Override
    public String createReport(ReportParamDto reportParamDto) {
        ReportStatSmev reportStatSmev = new ReportStatSmev();
        OrgParam orgParam = new OrgParam();
        //reportParamDto.setIdRegion(42);
        orgParam.setIdR(reportParamDto.getIdRegion());
        Rekvezits rekByIdRegion = reestrDao.getByIdRegion(reportParamDto.getIdRegion());
        if (rekByIdRegion != null) {
            orgParam.setNameOrganization(rekByIdRegion.getFullName());
        }
        reportStatSmev.setOrgParam(orgParam);
//        reportStatSmev.setDateBegin(LocalDate.parse("2021-06-20"));
//        reportStatSmev.setDateEnd(LocalDate.parse("2021-06-23"));
        reportStatSmev.setDateBegin(reportParamDto.getBeginDate());
        reportStatSmev.setDateEnd(reportParamDto.getEndDate());

        reportStatSmev.setRowStatSmev(smevDaoReport.GetDataReport(reportStatSmev));

        /*Сделал через Element потому что Stream криво превращается в Source(нужный для transform)*/
        Element marshal = Marshaller.marshal(reportStatSmev);
        return reportService.transformToHtml(ReportEnum.getReportEnumByIndex(reportParamDto.getIdReport()).xsltName(), marshal);
//        System.out.println(s);
//        return
    }

    @Override
    public Integer getIndexReport() {
        return ReportEnum.STAT_SMEV.index();
    }


    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class rowStatSmev {
        private String nameQ;
        private Integer kolReq;
        private Integer kolResp;

    }
}
