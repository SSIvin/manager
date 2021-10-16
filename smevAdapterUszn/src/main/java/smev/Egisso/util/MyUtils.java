package smev.Egisso.util;

import jcifs.smb.NtlmPasswordAuthentication;
import jcifs.smb.SmbException;
import jcifs.smb.SmbFile;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.quartz.JobExecutionContext;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLReaderFactory;
import smev.Egisso.Elements.ElementsProtocol.NamespaceFilter;
import smev.Egisso.Elements.ElementsProtocol.Response;
import smev.Egisso.Entity.GlobalPackage;
import smev.Egisso.Enum.StatusJob;
import smev.Egisso.Enum.StatusPackage;
import smev.Egisso.Enum.TypePackage;
import smev.Egisso.dto.DtoGlobalPackage;
import smev.Egisso.dto.DtoHistoryJob;
import smev.Egisso.dto.HistoryJob;
import smev.Egisso.exceptions.ErrorMessages;
import smev.Egisso.exceptions.ProtocolServiceException;
import smev.Egisso.exceptions.UtilsException;
import smev.ElementServices.Egisso.ElementsKmsz.Request;
import smev.utils.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.sax.SAXSource;
import java.io.*;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Optional;

import static java.nio.file.Files.isRegularFile;
import static java.nio.file.Files.newDirectoryStream;

@Component
@Log4j2
public class MyUtils {

//            //удаление файла из for_Load при наличии его и его подписи в for_Load_SIGN
//            if (FileUtils.getFile(pathLoadSign + req.getFileName()).exists() & FileUtils.getFile(pathLoadSign + req.getFileName() + ".p7s").exists()) {
//                MyUtils.delFile(FileUtils.getFile(pathForLoad + req.getFileName()));
//            }
//MyUtils.ToCopy(pathForLoad + req.getFileName(), path_copy + req.getFileName());


    static {
        jcifs.Config.setProperty("jcifs.smb.client.ssnLimit", "255");
        jcifs.Config.setProperty("jcifs.smb.client.soTimeout", "35000"); //35000
        jcifs.Config.setProperty("jcifs.smb.client.responseTimeout", "30000"); //30000

        //эти 2 параметра реально помогло для копирования в smb
        jcifs.Config.setProperty("jcifs.resolveOrder", "DNS");
        jcifs.Config.setProperty("jcifs.smb.client.dfs.disabled", "false");

        jcifs.Config.setProperty("jcifs.smb.lmCompatibility", "3");

        //jcifs.Config.setProperty("jcifs.util.loglevel", "4");
        jcifs.Config.setProperty("jcifs.smb.client.disablePlainTextPasswords", "false");
    }


    public static String pathForLoadSIGN;
    public static String smbDomain;
    public static String smbUserName;
    public static String smbPathOut;
    public static String smbPathIn;
    public static String smbPassword;
    public static String path_for_Load;
    public static String path_copy;
    public static boolean use_SMB;

    @Value("${egisso.smb.useSMB}")
    public void setUseSMB(boolean useSMB) {
        use_SMB = useSMB;
    }

    @Value("${egisso.path_for_Load}")
    public void setPath_for_Load(String path_for_Load1) {
        path_for_Load = path_for_Load1;
    }

    @Value("${egisso.path_for_Load_SIGN}")
    public void setPathForLoadKmszSIGN(String pathForLoadKmszSIGN1) {
        pathForLoadSIGN = pathForLoadKmszSIGN1;
    }

    @Value("${egisso.path_copy}")
    public void setPathCopy(String pathCopy) {
        path_copy = pathCopy;
    }


    @Value("${egisso.smb.smbPathOut}")
    public void setSmbPathOut(String smbPathOut1) {
        smbPathOut = smbPathOut1;
    }

    @Value("${egisso.smb.smbPathIn}")
    public void setSmbPathIn(String smbPathIn1) {
        smbPathIn = smbPathIn1;
    }

    @Value("${egisso.smb.username}")
    public void setSmbUserName(String smbUserName1) {
        smbUserName = smbUserName1;
    }

    @Value("${egisso.smb.password}")
    public void setSmbPassword(String smbPassword1) {
        smbPassword = smbPassword1;
    }

    @Value("${egisso.smb.domain}")
    public void setSmbDomain(String smbDomain1) {
        smbDomain = smbDomain1;
    }

    public static Request getRequestObjectFromFile(String fileName) {
        JAXBContext jaxbContext     = null;
        Unmarshaller jaxbUnmarshaller = null;
        try {
            jaxbContext = JAXBContext.newInstance(Request.class );
            jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Path filePath = Paths.get(path_for_Load, fileName);
            InputStream inStream = new FileInputStream(filePath.toFile());

            return  (Request) jaxbUnmarshaller.unmarshal(inStream);

        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String createDirToday(String path, Boolean otherNameIfExistFile) {
        String getTodayFolderName = MyUtils.getTodayFolderName(path, otherNameIfExistFile);
        try {
            FileUtils.forceMkdir(FileUtils.getFile(getTodayFolderName));
        } catch (IOException e) {
            throw new UtilsException(ErrorMessages.ERROR_COPY_IN_SMB.getErrorMessage(), e);
        }
        return getTodayFolderName;
    }

    public static StatusPackage getStatusPackage(BigInteger recordNumSuccess) {
        if (recordNumSuccess != null && recordNumSuccess.equals(0)) {
            return StatusPackage.ERROR;
        } else {
            return StatusPackage.LOAD_PROTOCOL;
        }
    }

    public static void copyFromSmb(String dirForCopy) {
        /*
        Apparently you need to tell Windows that you want to use the machine as a file server and that it should allocate resources accordingly.  Set the following registry key to ‘1′:
        HKLM\SYSTEM\CurrentControlSet\Control\Session Manager\Memory Management\LargeSystemCache
        and set the following registry key to ‘3′:
        HKLM\SYSTEM\CurrentControlSet\Services\LanmanServer\Parameters\Size
        After making these changes and restarting, I haven’t seen this issue arise again
    пояснения
    * jcifs.smb.lmCompatibility = 0 или 1: отправить LM и NTLM 2)
      jcifs.smb.lmCompatibility = 2: Отправить NTLM в обоих полях 3)
      jcifs.smb.lmCompatibility = 3, 4 или 5: отправить только LMv2
    * */
        log.info("Копирования подписей из SMB...");
        NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(smbDomain, smbUserName, smbPassword);
        try {
            SmbFile out = new SmbFile(smbPathOut, auth);
            for (SmbFile f : out.listFiles()) {
                if (FilenameUtils.getExtension(f.getName()).equals("p7s")) {
                    FileUtils.copyInputStreamToFile(f.getInputStream(), new File(dirForCopy + "/" + f.getName()));
                    log.info("Файл " + dirForCopy + "/" + f.getName() + " скопирован");
                }
                f.delete();
            }
        } catch (SmbException e) {
            throw new UtilsException(ErrorMessages.ERROR_COPY_FROM_SMB.getErrorMessage(), e);
        } catch (IOException e) {
            throw new UtilsException(ErrorMessages.ERROR_COPY_FROM_SMB.getErrorMessage(), e);
        }
    }

    public static void sleepms(Long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int getIdFromContext(JobExecutionContext context) {
        int ID  = 0;
        //вытащим ID из контекста джоба, чтобы записать в T_GLOBAL_PACKAGE
        if (context.get("ID") != null) {
            ID = (Integer) context.get("ID");
        }
        return ID;
    }

    public static void CreateSignFile(TypePackage typePackage) {
        String dirToCopy = MyUtils.createDirToday(path_copy,true);
        MyUtils.copyDir(path_for_Load, dirToCopy);
        if (use_SMB && TypePackage.PACKAGE_KMSZ.equals(typePackage)) {
            MyUtils.clearSmbDir();
            MyUtils.copyToSmb();
            MyUtils.sleepms((long) 250000);//40сек. мало
            MyUtils.copyFromSmb(dirToCopy);
            //MyUtils.checkAndDelete(pathForLoadSIGN, pathForLoad);
            log.info("файлы скопированны и подписанны");
        }
    }

    private static String getTodayName() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }


    public static String getTodayFolderName(String path_copy, Boolean otherNameIfExistFile) {
        String todayName = getTodayName();
        Path ret = Paths.get(path_copy, todayName);
        if (!otherNameIfExistFile) {
            return Paths.get(path_copy, todayName).normalize().toString();
        }
        if (!Files.exists(ret))
            return ret.normalize().toString();
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            ret = Paths.get(path_copy, String.format("%s_%d", todayName, i));
            if (!Files.exists(ret))
                return ret.normalize().toString();
        }
        return null;
    }

    public static int copyToSmb() {
        log.info("Копирование файлов назначений для подписи в SMB.");
        int i = 0;
        DirectoryStream<Path> directoryStream = null;
        NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(smbDomain, smbUserName, smbPassword);
        try {
            directoryStream = newDirectoryStream(Paths.get(path_for_Load), "*.xml");
        } catch (IOException e) {
            throw new UtilsException(ErrorMessages.ERROR_COPY_IN_SMB.getErrorMessage(), e);
        }

        for (Path path : directoryStream) {
            if (isRegularFile(path)) {
                OutputStream out = null;
                SmbFile smbFile = null;
                try {
                    smbFile = new SmbFile(smbPathIn + path.getFileName(), auth);
                } catch (MalformedURLException e) {
                    throw new UtilsException(ErrorMessages.ERROR_COPY_IN_SMB_newSmbFile.getErrorMessage(), e);
                }
                try {
                    out = smbFile.getOutputStream();
                } catch (IOException e) {
                    throw new UtilsException(ErrorMessages.ERROR_COPY_IN_SMB_getOutputStream.getErrorMessage(), e);
                }
                try {
                    Files.copy(path.toAbsolutePath(), out);
                    i++;
                } catch (IOException e) {
                    throw new UtilsException(ErrorMessages.ERROR_COPY_IN_SMB_copy.getErrorMessage(), e);
                }
                try {
                    out.close();
                } catch (IOException e) {
                    throw new UtilsException(ErrorMessages.ERROR_.getErrorMessage(), e);
                }
            }
        }
        log.info("Скопированно файлов для подписис в SMB: " + i);
        return i;
    }

    public static void clearDir(String dir) {
        try {
            log.info("Чистка каталога " + dir);
            FileUtils.cleanDirectory(FileUtils.getFile(dir));
        } catch (IOException e) {
            throw new UtilsException(ErrorMessages.ERROR_CLEAR_DIR.getErrorMessage(), e);
        }
    }

    public static void copyDir(String source, String dist) {
        try {
            FileUtils.copyDirectory(FileUtils.getFile(source), FileUtils.getFile(dist));
        } catch (IOException e) {
            throw new UtilsException(ErrorMessages.ERROR_COPY_DIR_TO_DIR.getErrorMessage(), e);
        }

    }

    public static void checkAndDelete(String whereCheck, String whereDel) {
        Collection<File> filesWhereDel = FileUtils.listFiles(new File(whereDel), new String[]{"xml"}, true);
        for (File fileDel : filesWhereDel) {
            if (FileUtils.getFile(whereCheck + fileDel.getName()).exists() & FileUtils.getFile(whereCheck + fileDel.getName() + ".p7s").exists()) {
                delFile(fileDel);
            }
        }
    }

    public static void delFile(File fileName) {
        log.info("Удалени файла " + fileName);
        try {
            FileUtils.forceDelete(FileUtils.getFile(fileName));
        } catch (FileNotFoundException e) {
            throw new UtilsException(ErrorMessages.ERROR_FILE_NOT_FOUND.getErrorMessage(), e);
        } catch (IOException e) {
            throw new UtilsException(ErrorMessages.ERROR_DELETE_FILE.getErrorMessage(), e);
        }
    }

    public static void clearSmbDir() {
        log.info("Очистка in smb каталога...");
        try {
            NtlmPasswordAuthentication auth = new NtlmPasswordAuthentication(smbDomain, smbUserName, smbPassword);
            SmbFile out = new SmbFile(smbPathIn, auth);
            for (SmbFile f : out.listFiles()) {
                f.delete();
            }
        } catch (SmbException e) {
            throw new UtilsException(ErrorMessages.ERROR_CLEAR_DIR.getErrorMessage() + " " + smbPathIn, e);
        } catch (MalformedURLException e) {
            throw new UtilsException(ErrorMessages.ERROR_CLEAR_DIR.getErrorMessage() + " " + smbPathIn, e);
        }
    }


    public static void ToCopy(String source, String dest) {
        log.info("Копирование файла " + source + " в папку copy...");
        File sourcef = new File(source);
        File destf = new File(dest);
        try {
            FileUtils.copyFile(sourcef, destf);
        } catch (IOException e) {
            throw new UtilsException(ErrorMessages.ERROR_COPY_FILE_TO_COPY.getErrorMessage(), e);
        }
    }

    public static Response getResponseProtocol(InputSource is) {

        /******************************************************
         * обработка xml файл с namespace.  Пропускаем namespace
         *
         * XML to Java Object
         *
         *******************************************************/

        //InputStream inStream = new FileInputStream(xmlFilename);
        //String xmlFilename = "F:\\Java_project\\01_JAVA_JAXB\\MY_JAXB\\src\\main\\java\\com\\example\\demo\\Fact_full.xml";
        Response res = new Response();
        NamespaceFilter inFilter = new NamespaceFilter(null, false);
        Unmarshaller jaxbUnmarshaller = null;
        try {
            org.xml.sax.XMLReader reader = XMLReaderFactory.createXMLReader();
            inFilter.setParent(reader);
            JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);
            jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//            InputSource is = new InputSource(new FileInputStream(filePath.toString()));
            SAXSource source = new SAXSource(inFilter, is);
            res = (Response) jaxbUnmarshaller.unmarshal(source);
        } catch (JAXBException e) {
            throw new ProtocolServiceException(ErrorMessages.ERROR_UNMARSHLING.getErrorMessage(), e.getCause());
//            throw new ProtocolServiceException(ErrorMessages.ERROR_UNMARSHLING.getErrorMessage() + ' ' +  filePath.getFileName(), e.getCause());
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return res;


        //ProtocolResponse employee = (ProtocolResponse) jaxbUnmarshaller.unmarshal( inStream );


        //log.info(employee);

//        //Prepare JAXB objects
//        JAXBContext jc = JAXBContext.newInstance(ProtocolResponse.class);
//        Unmarshaller u = jc.createUnmarshaller();
//
//        //Create an XMLReader to use with our filter
//        org.xml.sax.XMLReader reader = XMLReaderFactory.createXMLReader();

        //Create the filter (to add namespace) and set the xmlReader as its parent.
//    NamespaceFilter inFilter = new NamespaceFilter(null,false);
//        inFilter.setParent(reader);

        //Prepare the input, in this case a java.io.File (output)
        //InputSource is = new InputSource(new FileInputStream(xmlFilename));

        //Create a SAXSource specifying the filter
        //SAXSource source = new SAXSource(inFilter, is);

        //Do unmarshalling
//    ProtocolResponse resp = (ProtocolResponse) u.unmarshal(source);
//
//        log.info(resp.protocol.packageResult.packageID);
//
//        for (RecordResult rec:resp.protocol.packageResult.errorRecords.recordResult){
//        log.info(rec.recID + "__" + rec.recordOK);
//
//        if (rec.messages != null) {
//            log.info(rec.messages.messageType + "__" + rec.messages.report);
//        }
//
//    }

    }

    public static Optional<DtoGlobalPackage> getDtoGlobalPackage(Optional<GlobalPackage> globalPackageIdJob) {
        return globalPackageIdJob.map(globalPackage -> DtoGlobalPackage.builder()
                .IdGlobalPackage(util.UUIDtoString(globalPackage.getIdGlobalPackage()))
                .typePackage(globalPackage.getTypePackage().index())
                .typePackageName(globalPackage.getTypePackage().typeName())
                .statusPackage(globalPackage.getStatusPackage().index())
                .statusPackageName(globalPackage.getStatusPackage().statusName())
                .createDate(globalPackage.getCreateDate())
                .modifyDate(globalPackage.getModifyDate())
                .executeJobId(globalPackage.getExecuteJobId())
                .applayProtocolName(globalPackage.getApplayProtocol().applayProtName())
                .build());
    }

    public static Optional<HistoryJob> getHistoryJob(ResultSet rs) throws SQLException {
        return Optional.ofNullable(HistoryJob.builder()
                .id(rs.getInt("ID"))
                .jobName(rs.getString("jobName"))
                .runDate(rs.getDate("runDate"))
                .statusId(rs.getInt("statusId"))
                .message(rs.getString("message"))
                .causes(rs.getString("causes"))
                .build());
    }

    public static Optional<DtoHistoryJob> getDtoHistoryJob(Optional<HistoryJob> lastJob) {
        return lastJob.map(historyJob -> DtoHistoryJob.builder()
                .id(historyJob.getId())
                .jobName(historyJob.getJobName())
                .causes(historyJob.getCauses())
                .message(historyJob.getMessage())
                .statusId(historyJob.getStatusId())
                .statusName(StatusJob.getStatusJobById(Integer.valueOf(historyJob.getStatusId())).statusName())
                .runDate(historyJob.getRunDate())
                .build());
    }

}
