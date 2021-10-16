package dayBetween;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Service.BusinessService;
import smev.SmevApplication;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SmevApplication.class) //Application being your
@SpringBootTest
@TestPropertySource("/application.properties")
public class dayBetween {

    private static final Logger log = LogManager.getLogger();


    @Autowired
    private BusinessService businessService;










    @Test
    //@Scheduled(fixedRate = 5000)
    public void countDay() {

        LocalDateTime today = LocalDateTime.now();
        BusinessMessageEntity mess = businessService.getMessageEntityByIdMessage(UUID.fromString("B0B052EF-8CAA-4F1F-980B-96B958CEC849"),false);
        long o = Duration.between(today, mess.getCreationDate()).toDays();
        log.info(o);


//        LocalDateTime today1 = today;
//        String str = "2021-09-24 20:01:55";
//        String str2 = "2021-09-25 20:02:55";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime dateTime1 = LocalDateTime.parse(str, formatter);
//        LocalDateTime dateTime2 = LocalDateTime.parse(str2, formatter);
//        Duration.between(dateTime1,dateTime2).toDays();


    }



}
