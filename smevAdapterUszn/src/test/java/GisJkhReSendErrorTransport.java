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
public class GisJkhReSendErrorTransport {

    private static final Logger log = LogManager.getLogger("GisJkh");


    @Autowired
    private PackageRepo packageRequestRepo;

    @Autowired
    private GlobalPackageRepo globalPackageRepo;


    @Autowired
    private GisJkhServiceImpl gisJkhService;


    @Test
    public void createRequestGisJkh() throws Exception {

        gisJkhService.reSendErrorRequest();

    }


}
