package smev.Sign;

import org.w3c.dom.Element;
import ru.voskhod.crypto.exceptions.SignatureProcessingException;

import java.io.InputStream;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

public class KeyPersonalSignerImpl implements PersonalSigner {

    private final SignatureOperationsClient signer;

    public KeyPersonalSignerImpl(SignatureOperationsClient signer) {
        this.signer = signer;
    }

    public KeyPersonalSignerImpl(PrivateKey privateKey, X509Certificate certificate) {
        this(new SignatureOperationsClient(privateKey, certificate));
    }

    public static KeyPersonalSignerImpl create(SignatureOperationsClient signer) {
        return signer == null ? null : new KeyPersonalSignerImpl(signer);
    }

    public Element getSignature(Element businessContent) throws SignatureProcessingException {
        businessContent.setAttribute("Id", "PERSONAL_SIGNATURE");
        businessContent.setIdAttribute("Id", true);
        return signer.signXMLDSigDetached(businessContent, null);
    }

    public byte[] getSign(byte[] digest) throws SignatureProcessingException {
        return signer.signPKCS7Detached(digest);
//        /* 105 */
//        byte[] checkSum = Base64.encodeBase64String(digest).getBytes();
//        /* 106 */
//        byte[] personalSignature = this.signer.signPKCS7Detached(digest);
//        /*     */
    }

    public byte[] getSign(InputStream inputStream) throws SignatureProcessingException {
        return signer.signPKCS7Detached(inputStream);
//        /* 105 */
//        byte[] checkSum = Base64.encodeBase64String(digest).getBytes();
//        /* 106 */
//        byte[] personalSignature = this.signer.signPKCS7Detached(digest);
//        /*     */
    }


}
