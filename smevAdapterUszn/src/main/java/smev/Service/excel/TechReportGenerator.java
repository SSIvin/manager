package smev.Service.excel;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import smev.GisJkh.Entity.OrgSubRequestEntity;
import smev.GisJkh.Repo.OrgSubRepo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

@Component
public class TechReportGenerator implements ExcelContentGenerator {
   private static final Logger log = LoggerFactory.getLogger(TechReportGenerator.class);
   private final ObjectMapper objectMapper;

   @Autowired
   private OrgSubRepo orgSubRepo;


   public String getTemplatePath() {
      return "excel_templates/tech_validation_report.xlsx";
   }

   public String outFilePrefix() {
      return "tech_report";
   }

   public void fillData(Sheet sheet) {
      log.info("Generating tech report.");
      sheet.getRow(4).getCell(2).setCellValue(DateTimeFormatter.ofPattern("dd.MM.yyyy").format(LocalDate.now()));
      sheet.getRow(5).getCell(2).setCellValue("Регион");
      CellStyle cellStyle = ExcelUtils.createCellStyle(sheet.getWorkbook());
      Object pageable = PageRequest.of(0, 10000);

      while(true) {
         Page<OrgSubRequestEntity> chunk = this.orgSubRepo.findAll((Pageable)pageable);
         if (chunk.isEmpty()) {
            break;
         }

         this.append(sheet, chunk.getContent(), cellStyle);
         if (!chunk.hasNext()) {
            break;
         }

         pageable = chunk.nextPageable();
      }

   }

   private void append(Sheet sheet, List<OrgSubRequestEntity> chunkContent, CellStyle cellStyle) {
      try {
         Iterator var4 = chunkContent.iterator();

         while(var4.hasNext()) {
            OrgSubRequestEntity reportEntry = (OrgSubRequestEntity)var4.next();
               Row currentRow = sheet.createRow(sheet.getLastRowNum() + 1);
               ExcelUtils.RowCursor cursor = new ExcelUtils.RowCursor(currentRow, cellStyle);
               cursor.appendCell().setCellValue((double)(currentRow.getRowNum() - 8));
               cursor.appendCell().setCellValue(reportEntry.getNameOrg());
               cursor.appendCell().setCellValue(reportEntry.getId().toString());
//               cursor.appendCell().setCellValue(message.getMessage());
//               cursor.appendCell().setCellValue(message.getInvalidValue());
//               cursor.appendCell().setCellValue((double)message.getCode());
         }

      } catch (Exception var14) {
         throw var14;
      }
   }

   public TechReportGenerator(final ObjectMapper objectMapper) {
      this.objectMapper = objectMapper;
   }
}
