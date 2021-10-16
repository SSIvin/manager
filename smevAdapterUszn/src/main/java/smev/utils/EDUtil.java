package smev.utils;

import javax.xml.bind.DatatypeConverter;
import java.math.BigInteger;
import java.util.Objects;

public final class EDUtil
        /*    */ {
    /*    */   public static String encodeHex(byte[] data) {
        /* 16 */     return (new BigInteger(data)).toString(16);
        /*    */   }
    /*    */
    /*    */   public static byte[] decodeHex(String hex) {
        /* 20 */     return (new BigInteger(hex, 16)).toByteArray();
        /*    */   }
    /*    */
    /*    */
    /*    */   public static String encodeBase64(byte[] binaryData) throws IllegalArgumentException {
        /* 25 */     Objects.requireNonNull(binaryData, "binaryData is null");
        /* 26 */     return DatatypeConverter.printBase64Binary(binaryData);
        /*    */   }
    /*    */
    /*    */   public static byte[] decodeBase64(String base64String) throws IllegalArgumentException {
        /* 30 */     Objects.requireNonNull(base64String, "base64String is null");
        /* 31 */     base64String = base64String.replaceAll("[^A-Za-z0-9+/=]", "");
        /* 32 */     return DatatypeConverter.parseBase64Binary(base64String);
        /*    */   }
    /*    */ }
