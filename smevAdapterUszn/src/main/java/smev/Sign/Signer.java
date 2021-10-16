package smev.Sign;

import org.w3c.dom.Element;
import ru.voskhod.crypto.DigitalSignatureFactory;
import ru.voskhod.crypto.exceptions.SignatureProcessingException;
import smev.ElementServices.Other.XMLDSigSignatureType;

import java.io.*;
import java.security.DigestInputStream;

public class Signer {

    public static XMLDSigSignatureType createPersonalSignature(PersonalSigner signPersonal, Element businessContent) {
        try {
            XMLDSigSignatureType xmlSignature = new XMLDSigSignatureType();
            xmlSignature.setAny(signPersonal.getSignature(businessContent));
            return xmlSignature;
        } catch (SignatureProcessingException ex) {
            throw new RuntimeException(ex);
        }
    }



}
