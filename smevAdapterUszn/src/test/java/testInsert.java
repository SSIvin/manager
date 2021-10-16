import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import smev.GisJkh.Dao.GisJkhDaoImpl;
import smev.GisJkh.Entity.PackageEntity;
import smev.GisJkh.Repo.DataPackageRepo;
import smev.GisJkh.Repo.PackageRepo;
import smev.SmevApplication;
import smev.core.DatabaseIntegrationModule;

import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= SmevApplication.class) //Application being your
@SpringBootTest
@TestPropertySource("/application.properties")
@Log4j2
public class testInsert {


    @Autowired
    private PackageRepo packageRequestRepo;

    @Autowired
    private DataPackageRepo dataPackageRepo;

    @Autowired
    private GisJkhDaoImpl gisJkhDao;


    @Autowired
    private DatabaseIntegrationModule databaseIntegrationModule;

    @Test
    public void test() throws Exception {

        databaseIntegrationModule.run();

    }


}
