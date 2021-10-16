 package smev.utils;

import java.io.*;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;


 public class MimeTypeUtils
 {
   private static final String DEFAULT_CONTENT_TYPE = "application/octet-stream";
  private static final Map<String, String> CONTENT_TYPE_MAP = new HashMap<>();
   static {
     CONTENT_TYPE_MAP.put("doc", "application/msword");
    CONTENT_TYPE_MAP.put("dot", "application/msword");
    CONTENT_TYPE_MAP.put("docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
/*  23 */     CONTENT_TYPE_MAP.put("dotx", "application/vnd.openxmlformats-officedocument.wordprocessingml.template");
/*  24 */     CONTENT_TYPE_MAP.put("docm", "application/vnd.ms-word.document.macroEnabled.12");
/*  25 */     CONTENT_TYPE_MAP.put("dotm", "application/vnd.ms-word.template.macroEnabled.12");
/*  26 */     CONTENT_TYPE_MAP.put("xls", "application/vnd.ms-excel");
/*  27 */     CONTENT_TYPE_MAP.put("xlt", "application/vnd.ms-excel");
/*  28 */     CONTENT_TYPE_MAP.put("xla", "application/vnd.ms-excel");
/*  29 */     CONTENT_TYPE_MAP.put("xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
/*  30 */     CONTENT_TYPE_MAP.put("xltx", "application/vnd.openxmlformats-officedocument.spreadsheetml.template");
/*  31 */     CONTENT_TYPE_MAP.put("xlsm", "application/vnd.ms-excel.sheet.macroEnabled.12");
/*  32 */     CONTENT_TYPE_MAP.put("xltm", "application/vnd.ms-excel.template.macroEnabled.12");
/*  33 */     CONTENT_TYPE_MAP.put("xlam", "application/vnd.ms-excel.addin.macroEnabled.12");
/*  34 */     CONTENT_TYPE_MAP.put("xlsb", "application/vnd.ms-excel.sheet.binary.macroEnabled.12");
/*  35 */     CONTENT_TYPE_MAP.put("ppt", "application/vnd.ms-powerpoint");
/*  36 */     CONTENT_TYPE_MAP.put("pot", "application/vnd.ms-powerpoint");
/*  37 */     CONTENT_TYPE_MAP.put("pps", "application/vnd.ms-powerpoint");
/*  38 */     CONTENT_TYPE_MAP.put("ppa", "application/vnd.ms-powerpoint");
/*  39 */     CONTENT_TYPE_MAP.put("pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation");
/*  40 */     CONTENT_TYPE_MAP.put("potx", "application/vnd.openxmlformats-officedocument.presentationml.template");
/*  41 */     CONTENT_TYPE_MAP.put("ppsx", "application/vnd.openxmlformats-officedocument.presentationml.slideshow");
/*  42 */     CONTENT_TYPE_MAP.put("ppam", "application/vnd.ms-powerpoint.addin.macroEnabled.12");
/*  43 */     CONTENT_TYPE_MAP.put("pptm", "application/vnd.ms-powerpoint.presentation.macroEnabled.12");
/*  44 */     CONTENT_TYPE_MAP.put("potm", "application/vnd.ms-powerpoint.presentation.macroEnabled.12");
/*  45 */     CONTENT_TYPE_MAP.put("ppsm", "application/vnd.ms-powerpoint.slideshow.macroEnabled.12");

/*  47 */     CONTENT_TYPE_MAP.put("odt", "application/vnd.oasis.opendocument.text");
/*  48 */     CONTENT_TYPE_MAP.put("ott", "application/vnd.oasis.opendocument.text-template");
/*  49 */     CONTENT_TYPE_MAP.put("oth", "application/vnd.oasis.opendocument.text-web");
/*  50 */     CONTENT_TYPE_MAP.put("odm", "application/vnd.oasis.opendocument.text-master");
/*  51 */     CONTENT_TYPE_MAP.put("odg", "application/vnd.oasis.opendocument.graphics");
/*  52 */     CONTENT_TYPE_MAP.put("otg", "application/vnd.oasis.opendocument.graphics-template");
/*  53 */     CONTENT_TYPE_MAP.put("odp", "application/vnd.oasis.opendocument.presentation");
/*  54 */     CONTENT_TYPE_MAP.put("otp", "application/vnd.oasis.opendocument.presentation-template");
/*  55 */     CONTENT_TYPE_MAP.put("ods", "application/vnd.oasis.opendocument.spreadsheet");
/*  56 */     CONTENT_TYPE_MAP.put("ots", "application/vnd.oasis.opendocument.spreadsheet-template");
/*  57 */     CONTENT_TYPE_MAP.put("odc", "application/vnd.oasis.opendocument.chart");
/*  58 */     CONTENT_TYPE_MAP.put("odf", "application/vnd.oasis.opendocument.formula");
/*  59 */     CONTENT_TYPE_MAP.put("odb", "application/vnd.oasis.opendocument.database");
/*  60 */     CONTENT_TYPE_MAP.put("odi", "application/vnd.oasis.opendocument.image");
/*  61 */     CONTENT_TYPE_MAP.put("oxt", "application/vnd.openofficeorg.extension");

/*  63 */     CONTENT_TYPE_MAP.put("zip", "application/zip");
/*  64 */     CONTENT_TYPE_MAP.put("pdf", "application/pdf");
/*  65 */     CONTENT_TYPE_MAP.put("jpg", "image/jpeg");
/*  66 */     CONTENT_TYPE_MAP.put("jpeg", "image/jpeg");
/*  67 */     CONTENT_TYPE_MAP.put("png", "image/png");
/*  68 */     CONTENT_TYPE_MAP.put("tiff", "image/tiff");

/*  70 */     CONTENT_TYPE_MAP.put("xml", "application/xml");
/*  71 */     CONTENT_TYPE_MAP.put("xsd", "application/xml");

/*  73 */     CONTENT_TYPE_MAP.put("txt", "application/plain");

/*  75 */     CONTENT_TYPE_MAP.put("json", "application/json");
/*  76 */     CONTENT_TYPE_MAP.put("css", "text/css");
   }

   public static String getContentTypeByExtension(String extension) {
/*  80 */     if (CONTENT_TYPE_MAP.containsKey(extension.toLowerCase())) {
/*  81 */       return CONTENT_TYPE_MAP.get(extension.toLowerCase());
     }
/*  83 */     return "application/octet-stream";
   }

//   public static String getContentTypeByFilename(String filename) {
///*  87 */     return getContentTypeByExtension(getFileExtension(filename));
//   }



   public static String getContentTypeByFile(File file) throws IOException {
/*  93 */     String contentType = java.nio.file.Files.probeContentType(file.toPath());

/*  95 */     if (contentType == null || contentType.isEmpty()) {
/*  96 */       contentType = URLConnection.getFileNameMap().getContentTypeFor(file.getName());
     }

/*  99 */     if (contentType == null || contentType.isEmpty()) {
/* 100 */       contentType = URLConnection.guessContentTypeFromName(file.getName());
     }

/* 103 */     if (contentType == null || contentType.isEmpty()) {
/* 104 */       try (InputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
/* 105 */         contentType = URLConnection.guessContentTypeFromStream(inputStream);
       }
     }

///* 109 */     if (contentType == null || contentType.isEmpty()) {
///* 110 */       contentType = getContentTypeByFilename(file.getName());
//     }

/* 113 */     if (contentType == null || contentType.isEmpty()) {
/* 114 */       return "application/octet-stream";
     }
/* 116 */     return contentType;
   }

//   public static String getFileExtension(String filename) {
///* 120 */     return Files.getFileExtension(filename);
//   }
 }


