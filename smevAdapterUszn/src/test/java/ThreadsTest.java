import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import smev.Dto.DataRequestInteractions;
import smev.Dto.LimitInteractionDto;
import smev.Dto.PersonFilter;
import smev.Enum.InteractionDirection;
import smev.Service.BusinessService;
import smev.SmevApplication;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= SmevApplication.class) //Application being your
@SpringBootTest
@TestPropertySource("/application.properties")
@Log4j2
public class ThreadsTest {


    @Autowired
    private BusinessService businessService;


    @Test
    public void test() throws InterruptedException {
        int n = 10;
        for (int i = 1; i < n; i++) {
            //Thread.sleep(100);
            DataRequestInteractions reqData = new DataRequestInteractions();
            reqData.setPageNum(i);
            reqData.setPersonFilterFlag(0);
            reqData.setPersonFilter(new PersonFilter("","","",0,0,null));
            reqData.setRegionUser(0);
            reqData.setInquiryId(null);
            List<LimitInteractionDto> list  = businessService.getLimitInteractionDtos(InteractionDirection.OUTGOING, 1, reqData);

            businessService.getData(list);

            log.info(list);

        }



    }


}
