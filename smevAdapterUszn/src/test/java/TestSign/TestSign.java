package TestSign;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.voskhod.crypto.DigitalSignatureFactory;
import ru.voskhod.crypto.KeyStoreWrapper;
import ru.voskhod.crypto.exceptions.SignatureProcessingException;
import ru.voskhod.crypto.impl.PKCS7Tools;
import ru.voskhod.crypto.impl.X509Util;
import smev.Service.Impl.BusinessServiceImpl;
import smev.Service.SignatureService;
import smev.SmevApplication;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.*;
import java.security.cert.X509Certificate;
import java.util.Base64;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SmevApplication.class) //Application being your
@SpringBootTest
@TestPropertySource("/application.properties")
public class TestSign {

    private static final Logger log = LogManager.getLogger("GisJkh");
    private static final int BUFFER_SIZE = 4096;

    private final ThreadLocal<byte[]> buffer = new ThreadLocal<byte[]>() {
        @Override
        protected byte[] initialValue() {
            return new byte[BUFFER_SIZE];
        }
    };

    @Autowired
    private SignatureService signatureService;

    @Autowired
    private BusinessServiceImpl businessService;

    @Test
    public void sign3() throws IOException, NoSuchAlgorithmException, InvalidKeyException, SignatureException, SignatureProcessingException {
        File file = new File("C:\\15\\Request.zip");
        File out = new File("C:\\15\\Request.zip.sig");
        InputStream inputStream = new FileInputStream(file);
//        String signatureAlgorithmOID = X509Util.getSignatureAlgorithmOID(signatureService.getCertRosreestr());
//        KeyStoreWrapper keyStoreWrapper = DigitalSignatureFactory.getKeyStoreWrapper();
//        Provider provider = keyStoreWrapper.getKeyStore().getProvider();
//        Signature signer = Signature.getInstance(signatureAlgorithmOID, provider);
//        signer.initSign(signatureService.getKeyRosreestr());
//
//
//
//        signer.update(FileUtils.readFileToByteArray(file));
//        byte[] realSignature = signer.sign();

               // byte[] data = Base64.getDecoder().(fileContent).getBytes(StandardCharsets.UTF_8);
//        byte[] encode = Base64.getEncoder().encode(FileUtils.readFileToByteArray(file));


        byte[] fileContent = Files.readAllBytes(file.toPath());
        //byte[] hash = Files.readAllBytes(file.toPath());
        InputStream in = new ByteArrayInputStream(fileContent);
//        byte[] bytes = DigitalSignatureFactory.getDigitalSignatureProcessor().signPKCS7Detached(inputStream, signatureService.getKeyRosreestr(), signatureService.getCertRosreestr());
        byte[] bytes = DigitalSignatureFactory.getDigitalSignatureProcessor().signPKCS7Detached(in, signatureService.getKeyRosreestr(), signatureService.getCertRosreestr());
//        byte[] bytes1 = FileUtils.readFileToByteArray(file);
//        byte[] bytes = businessService.signByteArray(bytes1);
        FileOutputStream fos = new FileOutputStream(out);
        fos.write(Base64.getEncoder().encode(bytes));
        fos.flush();
        fos.close();


    }

    public MessageDigest getDigest(X509Certificate certificate) throws SignatureProcessingException {
        /* 131 */     return getDigest(X509Util.getDigestAlgorithmOID(certificate));
        /*     */   }

    public MessageDigest getDigest(String digestAlgorithmOID) throws SignatureProcessingException {
        /*     */     try {
            /* 123 */       return MessageDigest.getInstance(digestAlgorithmOID);
            /* 124 */     } catch (NoSuchAlgorithmException ex) {
            /* 125 */       throw new SignatureProcessingException("Криптопровайдер не поддерживает алгоритм " + X509Util.getGostName(digestAlgorithmOID), ex);
            /*     */     }
        /*     */   }

    @Test
    @ApiOperation(value = "рабочий вариант")
    public void signNew() throws Exception {
        File file = new File("C:\\15\\Request.zip");
        File out = new File("C:\\15\\Request.zip.sig");
        byte[] fileContent = Files.readAllBytes(file.toPath());
        byte[] bytes1 = businessService.signByteArray(fileContent);
        FileOutputStream fos2 = new FileOutputStream(out);
        fos2.write(bytes1);
        fos2.flush();
        fos2.close();
    }
    @Test
    public void ver() throws Exception {
        File in = new File("C:\\15\\Request.zip");
        File out = new File("C:\\15\\Request.zip.sig");
        FileInputStream fileInputStream = new FileInputStream(in);

//        String signatureAlgorithmOID = X509Util.getSignatureAlgorithmOID(signatureService.getCert());
//        KeyStoreWrapper keyStoreWrapper = DigitalSignatureFactory.getKeyStoreWrapper();
//        Provider provider = keyStoreWrapper.getKeyStore().getProvider();
//        Signature signer = Signature.getInstance(signatureAlgorithmOID, provider);
//
        byte[] digestedContent;
//        digestedContent = calculateDigest(fileInputStream, getDigest());

        byte[] bytes1 = FileUtils.readFileToByteArray(in);
//         String encoded = Base64.getEncoder().encodeToString(bytes1);
//        byte[] decoded = Base64.getDecoder().decode(encoded);

        // Подписываем.
//        byte[] bytes = PKCS7Tools.signPKCS7SunSecurity(decoded, signatureService.getKey(), signatureService.getCert());


        // byte[] bytes = signPKCS7Detached(fileInputStream, signatureService.getKey(), signatureService.getCert());



//        FileUtils.writeByteArrayToFile(out, bytes);
    }

    @Test
    public void sign() throws Exception {


//        byte[] digest = getDigest(file);
//        byte[] checkSum = Base64.encodeBase64String(digest).getBytes();
//        byte[] sign2 = signatureService.getSign(checkSum);
//        byte[] checkSum2 = Base64.decodeBase64(sign2);
//        FileUtils.writeByteArrayToFile(out, checkSum2);

        // byte[] bytes = getDigest(file);
        // byte[] sign = signatureService.getSign(bytes);

        //FileUtils.writeByteArrayToFile(out, sign);
//        byte[] s = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><tns:EGRNRequest xmlns:dHouse=\"http://rosreestr.ru/services/v0.1/commons/directories/house\" xmlns:dUnitType=\"http://rosreestr.ru/services/v0.1/commons/directories/unitType\" xmlns:dRecieveResultType=\"http://rosreestr.ru/services/v0.1/commons/directories/recieveResultType\" xmlns:DObjectType=\"http://rosreestr.ru/services/v0.1/commons/directories/regionrf\" xmlns:dKindInfo=\"http://rosreestr.ru/services/v0.1/commons/directories/kindInfo\" xmlns:dLandCategory=\"http://rosreestr.ru/services/v0.1/commons/directories/LandCategory\" xmlns:tns=\"http://rosreestr.ru/services/v0.18/TStatementRequestEGRN\" xmlns:obj=\"http://rosreestr.ru/services/v0.1/commons/TObject\" xmlns:subj=\"http://rosreestr.ru/services/v0.1/commons/Subjects\" xmlns:doc=\"http://rosreestr.ru/services/v0.1/commons/Documents\" xmlns:com=\"http://rosreestr.ru/services/v0.1/commons/Commons\" xmlns:vc=\"http://www.w3.org/2007/XMLSchema-versioning\" xmlns:address=\"http://rosreestr.ru/services/v0.1/commons/Address\" xmlns:dObT=\"http://rosreestr.ru/services/v0.1/commons/directories/objectType\" xmlns:stCom=\"http://rosreestr.ru/services/v0.1/TStatementCommons\" xmlns:dObP=\"http://rosreestr.ru/services/v0.1/commons/directories/objectPurpose\" xmlns:dUsT=\"http://rosreestr.ru/services/v0.1/commons/directories/usageType\" xmlns:dReM=\"http://rosreestr.ru/services/v0.1/commons/directories/receivingMethod\" xmlns:dTeZ=\"http://rosreestr.ru/services/v0.1/commons/directories/terzone\" xmlns:dBoO=\"http://rosreestr.ru/services/v0.1/commons/directories/borderObjectType\" xmlns:dDocument=\"http://rosreestr.ru/services/v0.1/commons/directories/document\" xmlns:dAcC=\"http://rosreestr.ru/services/v0.1/commons/directories/actionCode\" xmlns:dSt=\"http://rosreestr.ru/services/v0.1/commons/directories/statementType\" xmlns:dReT=\"http://rosreestr.ru/services/v0.1/commons/directories/egrnrequesttype\" xmlns:dAgr=\"http://rosreestr.ru/services/v0.1/commons/directories/agreements\" xmlns:Sim1=\"http://rosreestr.ru/services/v0.1/commons/Commons/simple-types\" xmlns:dHoP=\"http://rosreestr.ru/services/v0.1/commons/directories/housingPurpose\" xmlns:dRoP=\"http://rosreestr.ru/services/v0.1/commons/directories/roomPurpose\" xmlns:dIObT=\"http://rosreestr.ru/services/v0.1/commons/directories/interdepobjecttype\" xmlns:dCon=\"http://rosreestr.ru/services/v0.1/commons/directories/contractor\" xmlns:dRequestDocument=\"http://rosreestr.ru/services/v0.1/commons/directories/requestDocument\" xmlns:dDeclarantKind=\"http://rosreestr.ru/services/v0.1/commons/directories/declarantKind\" xmlns:dCou=\"http://rosreestr.ru/services/v0.1/commons/directories/country\" xmlns:bCat=\"http://rosreestr.ru/services/v0.1/commons/directories/benefitCategory\" xmlns:dDeKR=\"http://rosreestr.ru/services/v0.1/commons/directories/declarantKindReg\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://rosreestr.ru/services/v0.18/TStatementRequestEGRN file:/C:/Users/YuOrlova/Desktop/%D0%A1%D1%85%D0%B5%D0%BC%D1%8B/10.04.2017/RequestEGRN_v01.xsd\"><tns:header><stCom:actionCode>659511111112</stCom:actionCode><stCom:statementType>558630200000</stCom:statementType><stCom:creationDate>2016-05-04T18:13:51.0</stCom:creationDate><stCom:appliedDocument><doc:idDocument _id=\"1\"><doc:documentTypes><doc:documentTypeCode>008001001000</doc:documentTypeCode></doc:documentTypes><doc:number>388423</doc:number><doc:issueDate>2011-11-08</doc:issueDate><doc:attachment><doc:fileDesc><doc:file><doc:fileURI>embedded://Pasport_Semenov.pdf</doc:fileURI><doc:md5sum>647A747DAA47E658367DFB076A00090A</doc:md5sum></doc:file><doc:signature><doc:fileURI>embedded://Pasport_Semenov.pdf.sig</doc:fileURI><doc:md5sum>F9F8B917314CE26D40651BA7C8296721</doc:md5sum></doc:signature></doc:fileDesc> </doc:attachment><doc:series>4511</doc:series><doc:issuer><doc:name>УФМС РОССИИ ПО ГОР. МОСКВЕ ПО РАЙОНУ ЧЕРЕМУШКИ</doc:name></doc:issuer></doc:idDocument></stCom:appliedDocument></tns:header><tns:declarant _id=\"2\"><subj:person><subj:surname>Семенов</subj:surname><subj:firstname>Семен</subj:firstname><subj:patronymic>Семенович</subj:patronymic><subj:birthDate>1966-10-24</subj:birthDate><subj:birthPlace>Москва</subj:birthPlace><subj:idDocumentRef documentID=\"6\"/><subj:address><address:fias>9dc649b8-4e46-4a56-88bb-164e4f2bd74f</address:fias><address:okato>45268577000</address:okato><address:region><address:code>77</address:code><address:type>г</address:type><address:name>Москва</address:name></address:region><address:street><address:code>0890</address:code><address:type>ш</address:type><address:name>Боровское</address:name></address:street><address:house><address:type>д</address:type><address:value>33</address:value></address:house><address:apartment><address:type>кв</address:type><address:name>73</address:name></address:apartment></subj:address><subj:citizenship><subj:country>848000000643</subj:country></subj:citizenship><subj:snils>121-320-412 76</subj:snils></subj:person><subj:declarantKind>357003000000</subj:declarantKind></tns:declarant><tns:requestDetails><tns:requestEGRNDataAction><tns:extractDataAction><tns:object><obj:objectTypeCode>002001001000</obj:objectTypeCode><obj:cadastralNumber><obj:cadastralNumber>33:05:080102:30</obj:cadastralNumber></obj:cadastralNumber></tns:object><tns:requestType>extractRealty</tns:requestType></tns:extractDataAction></tns:requestEGRNDataAction></tns:requestDetails><tns:deliveryDetails><stCom:requestDeliveryMethod><stCom:receivingMethodCode>electronically</stCom:receivingMethodCode><stCom:regRightAuthority>в Александровский отдел Управления Федеральной службы государственной регистрации, кадастра и картографии по Владимирской области</stCom:regRightAuthority><stCom:code>33.003</stCom:code><stCom:specialistNote>specialistNote0</stCom:specialistNote></stCom:requestDeliveryMethod><stCom:resultDeliveryMethod><stCom:recieveResultTypeCode>regRightAuthority</stCom:recieveResultTypeCode></stCom:resultDeliveryMethod></tns:deliveryDetails><tns:statementAgreements><stCom:persDataProcessingAgreement>01</stCom:persDataProcessingAgreement><stCom:actualDataAgreement>01</stCom:actualDataAgreement><stCom:qualityOfServiceAgreement>01</stCom:qualityOfServiceAgreement><stCom:qualityOfServiceTelephoneNumber>+79655632323</stCom:qualityOfServiceTelephoneNumber></tns:statementAgreements></tns:EGRNRequest>".getBytes(StandardCharsets.UTF_8);


//        byte[] encoded = Base64.encodeBase64(FileUtils.readFileToByteArray(file));
//        byte[] digest = getDigest(file);
//        byte[] checkSum = Base64.encodeBase64String(digest).getBytes();


//        byte[] data = FileUtils.readFileToByteArray(file);
//        byte[] data = Files.readAllBytes(Paths.get("C:\\15\\request.xml"));

        File file = new File("C:\\15\\request.xml");
        File out = new File("C:\\15\\request.xml.sig");

        byte[] fileContent = Files.readAllBytes(file.toPath());
//        byte[] data = Base64.getEncoder().encodeToString(fileContent).getBytes(StandardCharsets.UTF_8);
        //byte[] data = Base64.encodeBase64String(fileContent).getBytes(StandardCharsets.UTF_8);

        String signatureAlgorithmOID = X509Util.getSignatureAlgorithmOID(signatureService.getCert());
        KeyStoreWrapper keyStoreWrapper = DigitalSignatureFactory.getKeyStoreWrapper();
        Provider provider = keyStoreWrapper.getKeyStore().getProvider();
        Signature signer = Signature.getInstance(signatureAlgorithmOID, provider);
        signer.initSign(signatureService.getKey());
       // signer.update(data);
        byte[] sign = signer.sign();
        signer.initVerify(signatureService.getCert());
        boolean verify = signer.verify(sign);
        FileUtils.writeByteArrayToFile(out, sign);


//        byte[] digest = this.signer.getDigest(file);
//        byte[] checkSum = Base64.encodeBase64String(digest).getBytes();
//        byte[] personalSignature = this.signer.signPKCS7Detached(digest);

    }

    public byte[] calculateDigest(InputStream isdata, String digestAlgorithmName) throws SignatureProcessingException {
        try {
            MessageDigest digest = MessageDigest.getInstance(digestAlgorithmName);
            byte[] localBuffer = buffer.get();
            try {
                int readBytesCount;
                while ((readBytesCount = isdata.read(localBuffer)) >= 0) {
                    digest.update(localBuffer, 0, readBytesCount);
                }
            } catch (IOException e) {
                throw new SignatureProcessingException("Сбой на фазе генерации message digest.", e);
            }
            return digest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } finally {
            try {
                isdata.close();
            } catch (IOException e) {
                e.printStackTrace(); // todo: warning???
            }
        }
        return null;
    }

    public byte[] calculateDigest(InputStream isdata, MessageDigest digest) throws SignatureProcessingException {
        try {
            byte[] localBuffer = buffer.get();
            try {
                int readBytesCount;
                while ((readBytesCount = isdata.read(localBuffer)) >= 0) {
                    digest.update(localBuffer, 0, readBytesCount);
                }
            } catch (IOException e) {
                throw new SignatureProcessingException("Сбой на фазе генерации message digest.", e);
            }
            return digest.digest();
        } finally {
            try {
                isdata.close();
            } catch (IOException e) {
                e.printStackTrace(); // todo: warning???
            }
        }
    }

    public byte[] signPKCS7Detached(InputStream argContent2Sign, PrivateKey argPrivateKey, X509Certificate argUserCertificate) throws SignatureProcessingException {
        // Вычисляем дайджест.GOST3411
        byte[] digestedContent;
        digestedContent = calculateDigest(argContent2Sign, "GOST3411");

        //String encoded = Base64.getEncoder().encodeToString(bytes);
        //byte[] decoded = Base64.getDecoder().decode(encoded);

        //byte[] bytes = Base64.get decodeBase64(digestedContent);
        // Подписываем.
       // return PKCS7Tools.signPKCS7SunSecurity(bytes, argPrivateKey, argUserCertificate);
        return null;
    }

    @Test
    @ApiOperation("получение  файла sig из файла который нужно подписать. с проверкой валидации")
    public void sign2() throws Exception {
        File file = new File("C:\\15\\Request.zip");


        File out = new File("C:\\15\\Request.zip.sig");
        InputStream inputStream = new FileInputStream(out);


        byte[] data = Files.readAllBytes(file.toPath());
       // byte[] data = Base64.getEncoder().encode((fileContent));

        final byte[] digest = DigitalSignatureFactory.getDigitalSignatureProcessor().getDigest(signatureService.getCertRosreestr()).digest(data);
        byte[] bytes = DigitalSignatureFactory.getDigitalSignatureProcessor().signPKCS7Detached(data, signatureService.getKeyRosreestr(), signatureService.getCertRosreestr());

        //final byte[] digest2 = DigitalSignatureFactory.getDigitalSignatureProcessor().getDigest(signatureService.getCert()).digest(bytes);
        final X509Certificate cert = DigitalSignatureFactory.getDigitalSignatureProcessor().validatePKCS7Signature(inputStream, bytes);
        //byte[] checkSum = Base64.encodeBase64String(bytes).getBytes();
        FileUtils.writeByteArrayToFile(out, bytes);


        //FileUtils.writeByteArrayToFile(out, checkSum);

    }


    public DigestInputStream getDigestInputStream(InputStream inputStream) {
        /*     */
        try {
            /* 243 */
            if (this.signatureService.getCert() == null) {
                /* 244 */
                throw new SignatureProcessingException("certificate is missing");
                /*     */
            }
            /* 246 */
            return new DigestInputStream(inputStream, DigitalSignatureFactory.getDigitalSignatureProcessor().getDigest(this.signatureService.getCert()));
            /* 247 */
        } catch (SignatureProcessingException e) {
            /* 248 */
            /*     */
        }
        return null;
        /*     */
    }

    public DigestInputStream getDigestInputStream(File file) {
        /*     */
        try {
            /* 234 */
            return getDigestInputStream(new FileInputStream(file));
            /* 235 */
        } catch (FileNotFoundException e) {
            /* 236 */
            /*     */
        }
        return null;
        /*     */
    }

    public byte[] getDigest(DigestInputStream digestStream) {
        /*     */
        try {
            /*     */
            int c;
            /*     */
            do {
                /* 221 */
                c = digestStream.read();
                /* 222 */
            } while (c >= 0);
            /*     */
            /*     */
            /* 225 */
            return digestStream.getMessageDigest().digest();
            /* 226 */
        } catch (IOException e) {
            /* 227 */
            /*     */
        }
        return null;
        /*     */
    }

    public byte[] getDigest(File file) {
        /* 210 */
        try (DigestInputStream inputStream = getDigestInputStream(file)) {
            /* 211 */
            return getDigest(inputStream);
            /* 212 */
        } catch (IOException e) {
            /* 213 */
            /*     */
        }
        return null;
        /*     */
    }

}
