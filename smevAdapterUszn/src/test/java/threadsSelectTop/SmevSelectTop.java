package threadsSelectTop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import smev.SmevApplication;
import smev.core.DatabaseIntegrationModule;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SmevApplication.class) //Application being your
@SpringBootTest
@TestPropertySource("/application.properties")
public class SmevSelectTop {

    private static final Logger log = LogManager.getLogger();

    @Autowired
    private ApplicationContext context;

    @Test
    public void smevSelectTop() throws Exception {

        DatabaseIntegrationModule bean = (DatabaseIntegrationModule) context.getBean("database");
        //bean.run();

    }

}
