import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import smev.Service.CreateMessageService;
import smev.SmevApplication;
import smev.Wrapper.ObjectMessage;
import smev.Wrapper.RequestExportRAOHousesRequest;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= SmevApplication.class) //Application being your
@SpringBootTest
@TestPropertySource("/application.properties")
@Log4j2
public class CreateObjectMessageTest {


    @Autowired
    private CreateMessageService createMessageService;


    @Test
    public void test() throws Exception {
//        Date dateBegin = new SimpleDateFormat("dd-MM-yyyy").parse("14-09-1984");
//        util.getDate(dateBegin);
//        util.DatetoLocalDateTime(dateBegin);
//        Subject subject = new Subject();
//        subject.setID_BASE(1);
//        subject.setID_REGION(41);
//        subject.setID_SUBJECT(82279);
//        subject.setBirthday(util.DatetoLocalDateTime(dateBegin).toLocalDate());
//        subject.setSurname("Ивин");
//        subject.setName("Сергей");
//        subject.setSecname("сергеевич");
//        createMessageService.createMessageAuto(UUID.fromString("751daed9-5693-43b8-85d2-33075765d1b3"),subject);
        ObjectMessage objectMessage = new RequestExportRAOHousesRequest();
        //createMessageService.autoCreateRequestMessage(UUID.fromString("dc58c534-5646-4d64-97b8-c7b7c5db9f66"),1111, null, objectMessage);


    }


}
