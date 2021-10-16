package smev.Service.excel;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import smev.Reestr.Dao.ReestrDao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

@Component
public class UserReportGenerator implements ExcelContentGenerator {
   private static final Logger log = LoggerFactory.getLogger(UserReportGenerator.class);

   @Autowired
   private ReestrDao reestrDao;

   public String getTemplatePath() {
      return "excel_templates/user_validation_report.xlsx";
   }

   public String outFilePrefix() {
      return "user_report";
   }

   public void fillData(Sheet sheet) {
      CellStyle cellStyle = ExcelUtils.createCellStyle(sheet.getWorkbook());
      sheet.getRow(3).getCell(2).setCellValue(DateTimeFormatter.ofPattern("dd.MM.yyyy").format(LocalDate.now()));
      sheet.getRow(4).getCell(2).setCellValue("Регион");
      log.info("Fetching data for user report.");
      List<ResultFromView> result = this.fetchData();
      log.info("Generating Excel content.");
      Iterator var4 = result.iterator();

      while(var4.hasNext()) {
         UserReportGenerator.ResultFromView rowData = (UserReportGenerator.ResultFromView)var4.next();
         Row currentRow = sheet.createRow(sheet.getLastRowNum() + 1);
         ExcelUtils.RowCursor cursor = new ExcelUtils.RowCursor(currentRow, cellStyle);
         cursor.appendCell().setCellValue((double)rowData.getRowNumber());
         cursor.appendCell().setCellValue(rowData.getSnils());
         cursor.appendCell().setCellValue(rowData.getFio());
         cursor.appendCell().setCellValue(rowData.getErrorMessage());
         cursor.appendCell().setCellValue(rowData.getInvalidValue());
      }

   }

   private List<ResultFromView> fetchData() {
      return reestrDao.getReportExcel_1();

   }

//   public UserReportGenerator(final JdbcTemplate jdbcTemplate) {
//      this.jdbcTemplate = jdbcTemplate;
//   }

   public static class ResultFromView {
      private Integer rowNumber;
      private String snils;
      private String fio;
      private String errorMessage;
      private String invalidValue;

      public Integer getRowNumber() {
         return this.rowNumber;
      }

      public String getSnils() {
         return this.snils;
      }

      public String getFio() {
         return this.fio;
      }

      public String getErrorMessage() {
         return this.errorMessage;
      }

      public String getInvalidValue() {
         return this.invalidValue;
      }

      public void setRowNumber(final Integer rowNumber) {
         this.rowNumber = rowNumber;
      }

      public void setSnils(final String snils) {
         this.snils = snils;
      }

      public void setFio(final String fio) {
         this.fio = fio;
      }

      public void setErrorMessage(final String errorMessage) {
         this.errorMessage = errorMessage;
      }

      public void setInvalidValue(final String invalidValue) {
         this.invalidValue = invalidValue;
      }

      public boolean equals(final Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof UserReportGenerator.ResultFromView)) {
            return false;
         } else {
            UserReportGenerator.ResultFromView other = (UserReportGenerator.ResultFromView)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               label71: {
                  Object this$rowNumber = this.getRowNumber();
                  Object other$rowNumber = other.getRowNumber();
                  if (this$rowNumber == null) {
                     if (other$rowNumber == null) {
                        break label71;
                     }
                  } else if (this$rowNumber.equals(other$rowNumber)) {
                     break label71;
                  }

                  return false;
               }

               Object this$snils = this.getSnils();
               Object other$snils = other.getSnils();
               if (this$snils == null) {
                  if (other$snils != null) {
                     return false;
                  }
               } else if (!this$snils.equals(other$snils)) {
                  return false;
               }

               label57: {
                  Object this$fio = this.getFio();
                  Object other$fio = other.getFio();
                  if (this$fio == null) {
                     if (other$fio == null) {
                        break label57;
                     }
                  } else if (this$fio.equals(other$fio)) {
                     break label57;
                  }

                  return false;
               }

               Object this$errorMessage = this.getErrorMessage();
               Object other$errorMessage = other.getErrorMessage();
               if (this$errorMessage == null) {
                  if (other$errorMessage != null) {
                     return false;
                  }
               } else if (!this$errorMessage.equals(other$errorMessage)) {
                  return false;
               }

               Object this$invalidValue = this.getInvalidValue();
               Object other$invalidValue = other.getInvalidValue();
               if (this$invalidValue == null) {
                  if (other$invalidValue == null) {
                     return true;
                  }
               } else if (this$invalidValue.equals(other$invalidValue)) {
                  return true;
               }

               return false;
            }
         }
      }

      protected boolean canEqual(final Object other) {
         return other instanceof UserReportGenerator.ResultFromView;
      }

      public int hashCode() {
         int result = 1;
         Object $rowNumber = this.getRowNumber();
         result = result * 59 + ($rowNumber == null ? 43 : $rowNumber.hashCode());
         Object $snils = this.getSnils();
         result = result * 59 + ($snils == null ? 43 : $snils.hashCode());
         Object $fio = this.getFio();
         result = result * 59 + ($fio == null ? 43 : $fio.hashCode());
         Object $errorMessage = this.getErrorMessage();
         result = result * 59 + ($errorMessage == null ? 43 : $errorMessage.hashCode());
         Object $invalidValue = this.getInvalidValue();
         result = result * 59 + ($invalidValue == null ? 43 : $invalidValue.hashCode());
         return result;
      }

      public String toString() {
         Integer var10000 = this.getRowNumber();
         return "UserReportGenerator.ResultFromView(rowNumber=" + var10000 + ", snils=" + this.getSnils() + ", fio=" + this.getFio() + ", errorMessage=" + this.getErrorMessage() + ", invalidValue=" + this.getInvalidValue() + ")";
      }

      public ResultFromView(final Integer rowNumber, final String snils, final String fio, final String errorMessage, final String invalidValue) {
         this.rowNumber = rowNumber;
         this.snils = snils;
         this.fio = fio;
         this.errorMessage = errorMessage;
         this.invalidValue = invalidValue;
      }
   }
}
