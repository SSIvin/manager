import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import smev.GisJkh.Repo.GlobalPackageRepo;
import smev.GisJkh.Repo.PackageRepo;
import smev.GisJkh.Service.GisJkhServiceImpl;
import smev.SmevApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SmevApplication.class) //Application being your
@SpringBootTest
@TestPropertySource("/application.properties")
public class GisJkhCreateRequestTest {

    private static final Logger log = LogManager.getLogger("GisJkh");


    @Autowired
    private PackageRepo packageRequestRepo;

    @Autowired
    private GlobalPackageRepo globalPackageRepo;


    @Autowired
    private GisJkhServiceImpl gisJkhService;


    @Test
    public void createRequestGisJkh() throws Exception {
         gisJkhService.createRequestGisJkh();


//        GlobalPackageEntity globalPackageEntity = new GlobalPackageEntity();
//        globalPackageEntity.setIdGlobalPackage(UUID.randomUUID());
//        globalPackageRepo.save(globalPackageEntity);

//        PackageEntity packageRequestImportEntity = packageRequestRepo.findByInteractionId(UUID.fromString("8F9F566F-CCF7-4953-A13F-781C1741F104"));
//        packageRequestImportEntity.setMode(null);
//
//        if (packageRequestImportEntity.getMode() != null) {
//            if (packageRequestImportEntity.getMode().equals("STATUS") | packageRequestImportEntity.getMode().equals("REJECT") | packageRequestImportEntity.getMode().equals("ERROR")) {
//                log.info("");
//            }
//        }


    }


}
