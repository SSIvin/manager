package smev.WatchFileStrategy;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smev.ElementServices.PFR_KSZN.requestPfrKsznDTO;
import smev.ElementServices.PFR_KSZN.responsePfrKszn;
import smev.Reestr.Dao.ReestrDao;
import smev.Reestr.Entity.RequestPfrEntity;
import smev.Reestr.Repo.PfrRequestRepo;
import smev.WatchFileStrategy.Enum.FileTypeInDirectories;

import javax.swing.text.MaskFormatter;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
public class AdrByPfrFile implements FileReader {

    static String outFileCsv;
    static String outDirectory;
    static LocalDateTime nowtime;

    static {
        outFileCsv = outDirectory + "O_" + DateTimeFormatter.ofPattern("yyyy.MM.dd").format(LocalDate.now()) + ".csv";
        nowtime = LocalDateTime.now();
    }


    @Autowired
    private PfrRequestRepo pfrRequestRepo;

    @Autowired
    private ReestrDao reestrDao;


    @Override
    public void readFile(File file) {
        List<requestPfrKsznDTO> requestPfrKszns = parseFile(file);
        if (requestPfrKszns != null && !requestPfrKszns.isEmpty()) {
            pfrRequestRepo.saveAll(listDtoToEntityList(requestPfrKszns));
             log.info("файл {} обработан", file.getAbsolutePath());
            List<responsePfrKszn> responsePfrKsznList = reestrDao.getDataChangePFRKSZN(nowtime);
            toCSV(responsePfrKsznList);
            file.delete();
        }
    }

    private RequestPfrEntity toEntity(requestPfrKsznDTO dto) {
        RequestPfrEntity entity = new RequestPfrEntity();
        entity.setNumZapis(dto.getNumZapis());
        entity.setSnils(dto.getSnils());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setSecName(dto.getSecName());
        entity.setBirthday(dto.getBithdate());
        entity.setDateS(dto.getSrokS());
        entity.setDatePo(dto.getSrokPo());
        entity.setCreateDate(dto.getCreateDate());
        entity.setChangeDate(dto.getChangeDate());
        return entity;
    }

    private requestPfrKsznDTO toDto(RequestPfrEntity entity) {
        requestPfrKsznDTO dto = new requestPfrKsznDTO();
        dto.setNumZapis(entity.getNumZapis());
        dto.setSnils(entity.getSnils());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setSecName(entity.getSecName());
        dto.setBithdate(entity.getBirthday());
        dto.setSrokS(entity.getDateS());
        dto.setSrokPo(entity.getDatePo());
        dto.setCreateDate(entity.getCreateDate());
        dto.setChangeDate(dto.getChangeDate());

        return dto;
    }

    private List<requestPfrKsznDTO> listEntityToDtoList(List<RequestPfrEntity> entityList) {
        if (entityList == null) {
            return null;
        }
        List<requestPfrKsznDTO> list = new ArrayList<>();
        for (RequestPfrEntity pfrEntity : entityList) {
            list.add(toDto(pfrEntity));
        }
        return list;
    }

    private List<RequestPfrEntity> listDtoToEntityList(List<requestPfrKsznDTO> dtoList) {
        if (dtoList == null) {
            return null;
        }
        List<RequestPfrEntity> list = new ArrayList<>();
        for (requestPfrKsznDTO dto : dtoList) {
            list.add(toEntity(dto));
        }
        return list;
    }

    private List<requestPfrKsznDTO> parseFile(File file) {
        BufferedReader fileReader = null;
        CSVParser csvParser = null;

        List<requestPfrKsznDTO> req = new ArrayList<>();
        try {
            fileReader = Files.newBufferedReader(file.toPath(), Charset.forName("windows-1251"));
            //InputStreamReader in = new java.io.FileReader(file);
            //fileReader = new BufferedReader(in);
            csvParser = new CSVParser(fileReader,
                    CSVFormat.DEFAULT
                            .withDelimiter(';')

            );

            Iterable<CSVRecord> csvRecords = csvParser.getRecords();
            for (CSVRecord csvRecord : csvRecords) {
                requestPfrKsznDTO build = new requestPfrKsznDTO();
                build.setNumZapis(Integer.valueOf(csvRecord.get(0)));
                build.setSnils(csvRecord.get(1).replace(" ","").replace("-",""));
                build.setFirstName(csvRecord.get(2).trim());
                build.setLastName(csvRecord.get(3).trim());
                build.setSecName(csvRecord.get(4).trim());
                build.setBithdate(LocalDate.parse(csvRecord.get(5)));
                build.setSrokS(LocalDate.parse(csvRecord.get(6)));
                build.setSrokPo(LocalDate.parse(csvRecord.get(7)));
                build.setCreateDate(nowtime);
                req.add(build);
            }
            return req;
        } catch (Exception e) {
            log.error("Reading CSV file {} Error!", file.getAbsolutePath());
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                csvParser.close();
            } catch (IOException e) {
                log.error("Closing fileReader/csvParser {} Error!", file.getAbsolutePath());
                e.printStackTrace();
            }
        }
        return null;

    }

    void toCSV(List<responsePfrKszn> responsePfrKsznList) {
        try {
            FileWriter out = new FileWriter(outFileCsv);
            CSVPrinter csvPrinter = new CSVPrinter(out,
                    CSVFormat.DEFAULT.withDelimiter(';')
            );
            DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols();
            otherSymbols.setDecimalSeparator(',');
            DecimalFormat decimalFormat = new DecimalFormat("0.00", otherSymbols);

            MaskFormatter maskFormatterSnils = new MaskFormatter("###-###-### ##");
            maskFormatterSnils.setValueContainsLiteralCharacters(false);

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            responsePfrKsznList.forEach(responsePfrKszn -> {
                List<String> data = null;
                try {
                    data = Arrays.asList(
                            String.valueOf(responsePfrKszn.getNumZapis())
                            , maskFormatterSnils.valueToString(responsePfrKszn.getSnils())
                            , responsePfrKszn.getFirstName()
                            , responsePfrKszn.getLastName()
                            , responsePfrKszn.getSecName()
                            , responsePfrKszn.getBithdate().format(dateTimeFormatter)
                            , responsePfrKszn.getSrokS().format(dateTimeFormatter)
                            , responsePfrKszn.getSrokPo().format(dateTimeFormatter)
                            , responsePfrKszn.getDatePay().format(dateTimeFormatter)
    //                        , String.format(responsePfrKszn.getSumPay().toString(), "#,##")
                            , decimalFormat.format(responsePfrKszn.getSumPay())
    //                        , responsePfrKszn.getSumPay().toPlainString()
                    );
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                try {
                    csvPrinter.printRecord(data);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            csvPrinter.flush();
        } catch (Exception e) {
            System.out.println("Writing CSV error!");
            e.printStackTrace();
        }


    }

    @Override
    public FileTypeInDirectories getTypeFile() {
        return FileTypeInDirectories.ADRESS_PFR;
    }
}
