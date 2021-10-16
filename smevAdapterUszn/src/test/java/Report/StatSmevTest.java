package Report;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.w3c.dom.Element;
import smev.ElementServices.Report.OrgParam;
import smev.ElementServices.Report.ReportStatSmev;
import smev.Marshaller.Marshaller;
import smev.Reestr.Dao.ReestrDao;
import smev.Reestr.Entity2.Rekvezits;
import smev.Service.ReportService;
import smev.SmevApplication;
import smev.dao.SmevDaoReport;

import java.time.LocalDate;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SmevApplication.class) //Application being your
@SpringBootTest
@TestPropertySource("/application.properties")
public class StatSmevTest {

    private static final Logger log = LogManager.getLogger();

    @Autowired
    private SmevDaoReport smevDaoReport;

    @Autowired
    private ReportService reportService;

    @Autowired
    private ReestrDao reestrDao;


    @Test
    public void Test() throws Exception {

        ReportStatSmev reportStatSmev = new ReportStatSmev();
        OrgParam orgParam = new OrgParam();
        orgParam.setIdR(46);
        Rekvezits rekByIdRegion = reestrDao.getByIdRegion(orgParam.getIdR());
        orgParam.setNameOrganization(rekByIdRegion.getFullName());
        reportStatSmev.setOrgParam(orgParam);
        reportStatSmev.setDateBegin(LocalDate.parse("2021-06-20"));
        reportStatSmev.setDateEnd(LocalDate.parse("2021-06-23"));
        reportStatSmev.setRowStatSmev(smevDaoReport.GetDataReport(reportStatSmev));

        /*Сделал через Element потому что Stream криво превращается в Source(нужный для transform)*/
        Element marshal = Marshaller.marshal(reportStatSmev);
        String s = reportService.transformToHtml("xsltTemplates/TemplateStatisticSmev.xsl", marshal);
        System.out.println(s);
    }

}
