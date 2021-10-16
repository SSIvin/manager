 package smev.utils;



import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;


 public class IOUtil
 {
/* 14 */   public static final byte[] BOM = new byte[] { -17, -69, -65 };


   public static byte[] readBytesFromInputStream(InputStream in) throws IOException {
/* 18 */     Objects.requireNonNull(in);
/* 19 */     try (ByteArrayOutputStream byteBuffer = new ByteArrayOutputStream()) {
/* 20 */       byte[] buf = new byte[1024];
       int len;
/* 22 */       while ((len = in.read(buf)) != -1) {
/* 23 */         byteBuffer.write(buf, 0, len);
       }
/* 25 */       byteBuffer.flush();
/* 26 */       return byteBuffer.toByteArray();
     }
   }

   public static void writeBytesToOutputStream(byte[] data, OutputStream out) throws IOException {
/* 31 */     Objects.requireNonNull(data);
/* 32 */     Objects.requireNonNull(out);
/* 33 */     out.write(data);
/* 34 */     out.flush();
   }

   public static String readStringFromInputStream(InputStream in) throws IOException {
/* 38 */     Objects.requireNonNull(in, "in is null");
/* 39 */     return new String(removeBOM(readBytesFromInputStream(in)), "UTF-8");
   }

   public static boolean haveBOM(byte[] buf) {
/* 43 */     if (buf == null || buf.length < 3) {
/* 44 */       return false;
     }
/* 46 */     return (buf[0] == BOM[0] && buf[1] == BOM[1] && buf[2] == BOM[2]);
   }

   public static byte[] removeBOM(byte[] buf) {
/* 50 */     if (buf == null) {
/* 51 */       return null;
     }
/* 53 */     if (!haveBOM(buf)) {
/* 54 */       return buf;
     }
/* 56 */     byte[] b = new byte[buf.length - 3];
/* 57 */     for (int q = 0; q < b.length; q++) {
/* 58 */       b[q] = buf[q + 3];
     }
/* 60 */     return b;
   }
 }

