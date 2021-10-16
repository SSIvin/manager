package ReadPropertiesKSZN;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import smev.Service.CreateMessageService;
import smev.Service.Impl.BusinessServiceImpl;
import smev.SmevApplication;
import smev.Wrapper.ObjectMessage;
import smev.Wrapper.RequestExportRAOHousesRequest;
import smev.config.PropConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= SmevApplication.class) //Application being your
@SpringBootTest
@TestPropertySource("/application.properties")
@Log4j2
public class ReadPropKSZN {


    @Autowired
    private BusinessServiceImpl businessService;


    @Test
    public void test() {
        log.info(businessService.propConfig.Prop().get("INN"));

    }


}
