package smev.Service;

import org.w3c.dom.Element;
import smev.ElementServices.Other.XMLDSigSignatureType;

import java.io.InputStream;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

public interface SignatureService {

    XMLDSigSignatureType getSignature(Element object);

    byte[]  getSignForRosreestr(byte[] object);
    byte[]  getSignForRosreestr(InputStream inputStream);

    X509Certificate getCert();
    PrivateKey getKey();

    X509Certificate getCertRosreestr();
    PrivateKey getKeyRosreestr();


}
