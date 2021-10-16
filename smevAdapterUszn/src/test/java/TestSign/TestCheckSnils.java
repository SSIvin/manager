package TestSign;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.voskhod.crypto.exceptions.SignatureProcessingException;
import smev.SmevApplication;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SmevApplication.class) //Application being your
@SpringBootTest
@TestPropertySource("/application.properties")
public class TestCheckSnils {


    @Test
    public void snils() throws IOException, NoSuchAlgorithmException, InvalidKeyException, SignatureException, SignatureProcessingException {

    }
}
