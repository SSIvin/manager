package smev.Service.excel;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ExcelGeneratorService {
   private static final Logger log = LoggerFactory.getLogger(ExcelGeneratorService.class);
   private final Map<Class<? extends ExcelContentGenerator>, ExcelContentGenerator> contentGenerators;
   private static final DateTimeFormatter DEFAULT_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

   public ExcelGeneratorService(List<ExcelContentGenerator> contentGenerators) {
      this.contentGenerators = (Map)contentGenerators.stream().collect(Collectors.toMap(Object::getClass, Function.identity()));
   }

   public void generateExcelFile(Class<? extends ExcelContentGenerator> contentGeneratorClass) {
      ExcelContentGenerator contentGenerator = (ExcelContentGenerator)this.contentGenerators.get(contentGeneratorClass);

      try {
         InputStream templateFile = (new ClassPathResource(contentGenerator.getTemplatePath())).getInputStream();

         try {
            Workbook workbook = new XSSFWorkbook(templateFile);
            Sheet sheet = workbook.getSheetAt(0);
            contentGenerator.fillData(sheet);
            LocalDateTime now = LocalDateTime.now();
            String fileName = String.format("%s__%s__%s__%s.xlsx", contentGenerator.outFilePrefix(), "Регион", now.format(DEFAULT_FORMATTER), Timestamp.valueOf(now).getTime());
            log.info("Saving Excel file as [{}].", fileName);
            workbook.write(new FileOutputStream(fileName));
            log.info("Saved.");
         } catch (Throwable var9) {
            if (templateFile != null) {
               try {
                  templateFile.close();
               } catch (Throwable var8) {
                  var9.addSuppressed(var8);
               }
            }

            throw var9;
         }

         if (templateFile != null) {
            templateFile.close();
         }
      } catch (IOException var10) {
         log.error("Can't create validation report!", var10);
      }

   }
}
