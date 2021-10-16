package excelTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import smev.Service.excel.ExcelGeneratorService;
import smev.Service.excel.TechReportGenerator;
import smev.Service.excel.UserReportGenerator;
import smev.SmevApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SmevApplication.class) //Application being your
@SpringBootTest
@TestPropertySource("/application.properties")
public class ExcelTestCode {

    private static final Logger log = LogManager.getLogger("GisJkh");


    //    @Autowired
//    private GisJkhDaoImpl gisJkhDao;
//
//    @Autowired
//    private ReestrDao reestrDao;
//
//
//    @Autowired
//    private PackageRepo packageRepo;
//
//    @Autowired
//    private DataRequestRepo dataRequestRepo;
//
//    @Autowired
//    private DataPackageRepo dataPackageRepo;
//
//    @Autowired
//    private GlobalPackageRepo globalPackageRepo;
//
//
    @Autowired
    private ExcelGeneratorService excelGeneratorService;


    @Test
    public void createExcel() throws Exception {
        this.excelGeneratorService.generateExcelFile(TechReportGenerator.class);
    }

}
