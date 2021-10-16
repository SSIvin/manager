import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import smev.GisJkh.Dao.GisJkhDaoImpl;
import smev.GisJkh.Entity.*;
import smev.GisJkh.Repo.*;
import smev.Reestr.Dao.ReestrDao;
import smev.Reestr.Dto.DateForGisJkh;
import smev.Service.CreateMessageService;
import smev.SmevApplication;

import java.util.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SmevApplication.class) //Application being your
@SpringBootTest
@TestPropertySource("/application.properties")
public class GisJkhTestCode {

    private static final Logger log = LogManager.getLogger("GisJkh");


    @Autowired
    private GisJkhDaoImpl gisJkhDao;

    @Autowired
    private ReestrDao reestrDao;


    @Autowired
    private PackageRepo packageRepo;

    @Autowired
    private DataRequestRepo dataRequestRepo;

    @Autowired
    private DataPackageRepo dataPackageRepo;

    @Autowired
    private GlobalPackageRepo globalPackageRepo;


    @Autowired
    private CreateMessageService createMessageService;


    @Test
    public void createRequestGisJkh() throws Exception {

//        boolean uuid = util.isUUID("f641b4dc-9963-4963-8ca6-b143fdb29cf");
//        System.out.println(uuid);


        GlobalPackageEntity globalPackageEntity = gisJkhDao.LastGlobalPackage();

        DateForGisJkh lastDateForGisJkh = reestrDao.getLastDateForGisJkh();

        List<DataRequestEntity> originalList = reestrDao.getListDataRequestEntity(0, lastDateForGisJkh, globalPackageEntity);

    }

}
