package smev.Service.excel;

import org.apache.poi.ss.usermodel.*;

class ExcelUtils {
   private ExcelUtils() {
   }

   static CellStyle createCellStyle(Workbook workbook) {
      return createCellStyle(workbook, BorderStyle.THIN);
   }

   static CellStyle createCellStyle(Workbook workbook, BorderStyle borderStyle) {
      CellStyle style = workbook.createCellStyle();
      style.setBorderBottom(borderStyle);
      style.setBorderLeft(borderStyle);
      style.setBorderRight(borderStyle);
      style.setBorderTop(borderStyle);
      style.setWrapText(true);
      return style;
   }

   static class RowCursor {
      private final Row row;
      private final CellStyle cellStyle;
      private int position = 0;

      Cell appendCell() {
         Cell cell = this.row.createCell(this.position);
         cell.setCellStyle(this.cellStyle);
         ++this.position;
         return cell;
      }

      public RowCursor(final Row row, final CellStyle cellStyle) {
         this.row = row;
         this.cellStyle = cellStyle;
      }
   }
}
