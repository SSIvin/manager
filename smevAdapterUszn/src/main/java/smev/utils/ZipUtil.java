package smev.utils;






import lombok.extern.log4j.Log4j2;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.*;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;
import net.lingala.zip4j.core.ZipFile;

@Log4j2
public class ZipUtil {


    public static List<String> readStructureZip(InputStream inputStream) throws IOException {
        Objects.requireNonNull(inputStream, "inputStream is null");
        List<String> structure = new ArrayList<>();
        try (ZipInputStream zipIStream = getZipInputStream(inputStream)) {
            while (true) {
                try {
                    ZipEntry zipEntry = zipIStream.getNextEntry();
                    if (zipEntry == null) {
                        zipIStream.closeEntry();
                        break;
                    }
                    if (zipEntry.isDirectory()) {
                        zipIStream.closeEntry();
                        continue;
                    }
                    structure.add(zipEntry.getName());
                } finally {
                    zipIStream.closeEntry();
                }
            }
        } catch (EOFException ex) {
            throw new IOException("zip file has an invalid format");
        }
        return structure;
    }


    public static Map<String, byte[]> readZip(InputStream inputStream) throws IOException {
        Objects.requireNonNull(inputStream, "inputStream is null");
        Map<String, byte[]> dataMap = new HashMap<>();
        try (ZipInputStream zipIStream = getZipInputStream(inputStream)) {
            while (true) {
                try {
                    ZipEntry zipEntry = zipIStream.getNextEntry();
                    if (zipEntry == null) {
                        zipIStream.closeEntry();
                        break;
                    }
                    if (zipEntry.isDirectory()) {
                        zipIStream.closeEntry();
                        continue;
                    }
                    byte[] buf = IOUtil.readBytesFromInputStream(zipIStream);
                    dataMap.put(zipEntry.getName(), buf);
                } finally {
                    zipIStream.closeEntry();
                }
            }
        } catch (EOFException ex) {
            throw new IOException("zip file has an invalid format");
        }
        return dataMap;
    }

    public static void zip (String targetPath, String destinationFilePath, String password) {
        try {
            ZipParameters parameters = new ZipParameters();
            parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
            parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);

            if (password.length() > 0) {
                parameters.setEncryptFiles(true);
                parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);
                parameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
                parameters.setPassword(password);
            }

            ZipFile zipFile = new ZipFile(destinationFilePath);

            File targetFile = new File(targetPath);
            if (targetFile.isFile()) {
                zipFile.addFile(targetFile, parameters);
            } else if (targetFile.isDirectory()) {
                zipFile.addFolder(targetFile, parameters);
            } else {
                //neither file nor directory
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void writeZip(OutputStream outputStream, Map<String, byte[]> dataMap) throws IOException {
        Objects.requireNonNull(outputStream, "inputStream is null");
        try (ZipOutputStream zipOStream = getZipOutputStream(outputStream)) {
//            zipOStream.setLevel(Deflater.NO_COMPRESSION);
//            zipOStream.setMethod(ZipOutputStream.DEFLATED);
            for (Map.Entry<String, byte[]> entry : dataMap.entrySet()) {
                ZipEntry zipEntry = new ZipEntry(entry.getKey());
//                zipEntry.setMethod(ZipEntry.DEFLATED);
//                zipEntry.setCompressedSize(-1);
                zipOStream.putNextEntry(zipEntry);
               // IOUtil.writeBytesToOutputStream(entry.getValue(), zipOStream);

                //или так
                try (ByteArrayInputStream bais = new ByteArrayInputStream(entry.getValue())) {
                    byte[] buffer = new byte[1024];
                    int len;
                    while ((len = bais.read(buffer)) > 0) {
                        zipOStream.write(buffer, 0, len);
                    }
                }
                zipOStream.closeEntry();
            }

        } catch (EOFException ex) {
            throw new IOException("zip file has an invalid format");
        }
    }


    private static ZipInputStream getZipInputStream(InputStream inputStream) {
        Charset charset = getCharset();
        if (charset == null) {
            return new ZipInputStream(inputStream);
        }
        return new ZipInputStream(inputStream, charset);
    }


    private static ZipOutputStream getZipOutputStream(OutputStream outputStream) {
        Charset charset = getCharset();
        if (charset == null) {
            return new ZipOutputStream(outputStream);
        }
        return new ZipOutputStream(outputStream, charset);
    }


    private static Charset getCharset() {
        if (!Charset.isSupported("IBM866")) {
            log.error("unsupported charset IBM866");
            return null;
        }
        return Charset.forName("IBM866");
    }

    public static void unzipLingala(String targetZipFilePath, String destinationFolderPath, String password) {
        try {
            ZipFile zipFile = new ZipFile(targetZipFilePath);
            if (zipFile.isEncrypted()) {
                zipFile.setPassword(password);
            }
            zipFile.extractAll(destinationFolderPath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void wrizipLingala(Path fileZip, List<File> listFile) {
        try {
            ZipParameters parameters = new ZipParameters();
            parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
            parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);

//            if (password.length() > 0) {
//                parameters.setEncryptFiles(true);
//                parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);
//                parameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
//                parameters.setPassword(password);
//            }

            ZipFile zipFile = new ZipFile(fileZip.toFile());

            for (File targetFile : listFile) {
                if (targetFile.isFile()) {
                    zipFile.addFile(targetFile, parameters);
                } else if (targetFile.isDirectory()) {
                    zipFile.addFolder(targetFile, parameters);
                } else {
                    //neither file nor directory
                }
            }





        } catch (ZipException e) {
            e.printStackTrace();
        }


    }
}

