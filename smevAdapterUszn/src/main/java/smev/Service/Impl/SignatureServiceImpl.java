package smev.Service.Impl;


import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import ru.voskhod.crypto.DigitalSignatureFactory;
import ru.voskhod.crypto.KeyStoreWrapper;
import ru.voskhod.crypto.exceptions.SignatureProcessingException;
import smev.ElementServices.Other.XMLDSigSignatureType;
import smev.Service.SignatureService;
import smev.Sign.KeyPersonalSignerImpl;
import smev.Sign.PersonalSigner;
import smev.Sign.Signer;

import javax.annotation.PostConstruct;
import java.io.InputStream;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

@Component
@Log4j2
public class SignatureServiceImpl implements SignatureService {


    private PrivateKey spPrivateKey;
    private X509Certificate spCertificate;

    private PrivateKey spPrivateKeyRosreestr;
    private X509Certificate spCertificateRosreestr;


    // "JCP" или "DIGT"
    @Value("${CRYPTO_PROVIDER}")
    private String CRYPTO_PROVIDER;

    @Value("${PERSONAL_CONTAINER_ALIAS}")
    private String PERSONAL_CONTAINER_ALIAS;

    @Value("${PERSONAL_CONTAINER_PASSWORD}")
    private String PERSONAL_CONTAINER_PASSWORD;

    @Value("${PERSONAL_RESREESTR_CONTAINER_ALIAS}")
    private String PERSONAL_RESREESTR_CONTAINER_ALIAS;

    @Value("${PERSONAL_RESREESTR_CONTAINER_PASSWORD}")
    private String PERSONAL_RESREESTR_CONTAINER_PASSWORD;



    @PostConstruct
    public void InitJCP() {
        // инициализация JCP
        log.info("Loading JCP....");
        DigitalSignatureFactory.init(CRYPTO_PROVIDER);
        KeyStoreWrapper keyStore = DigitalSignatureFactory.getKeyStoreWrapper();

        try {
            spPrivateKey = keyStore.getPrivateKey(PERSONAL_CONTAINER_ALIAS, PERSONAL_CONTAINER_PASSWORD.toCharArray());
            spCertificate = keyStore.getX509Certificate(PERSONAL_CONTAINER_ALIAS);

            spPrivateKeyRosreestr = keyStore.getPrivateKey(PERSONAL_RESREESTR_CONTAINER_ALIAS, PERSONAL_RESREESTR_CONTAINER_PASSWORD.toCharArray());
            spCertificateRosreestr = keyStore.getX509Certificate(PERSONAL_RESREESTR_CONTAINER_ALIAS);

        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnrecoverableKeyException e) {
            e.printStackTrace();
        } catch (CertificateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public XMLDSigSignatureType getSignature(Element object) {
        PersonalSigner signPersonal = new KeyPersonalSignerImpl(spPrivateKey, spCertificate);
        return Signer.createPersonalSignature(signPersonal, object);
    }

    @Override
    public byte[] getSignForRosreestr(byte[] object) {
        PersonalSigner signPersonal = new KeyPersonalSignerImpl(spPrivateKeyRosreestr, spCertificateRosreestr);
        try {
            return signPersonal.getSign(object);
        } catch (SignatureProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public byte[] getSignForRosreestr(InputStream inputStream) {
        PersonalSigner signPersonal = new KeyPersonalSignerImpl(spPrivateKeyRosreestr, spCertificateRosreestr);
        try {
            return signPersonal.getSign(inputStream);
        } catch (SignatureProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public X509Certificate getCert() {
        return this.spCertificate;
    }

    @Override
    public PrivateKey getKey() {
        return this.spPrivateKey;
    }

    @Override
    public PrivateKey getKeyRosreestr() {
        return this.spPrivateKeyRosreestr;
    }


    @Override
    public X509Certificate getCertRosreestr() {
        return this.spCertificateRosreestr;
    }

}
