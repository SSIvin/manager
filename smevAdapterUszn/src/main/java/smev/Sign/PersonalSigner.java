package smev.Sign;

import org.w3c.dom.Element;
import ru.voskhod.crypto.exceptions.SignatureProcessingException;

import java.io.InputStream;


public interface PersonalSigner {

    Element getSignature(Element businessContent) throws SignatureProcessingException;

    byte[] getSign(byte[] object) throws SignatureProcessingException;
    byte[] getSign(InputStream inputStream) throws SignatureProcessingException;
}
