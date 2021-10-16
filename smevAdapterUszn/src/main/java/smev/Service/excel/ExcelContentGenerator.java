package smev.Service.excel;

import org.apache.poi.ss.usermodel.Sheet;

public interface ExcelContentGenerator {
   String getTemplatePath();

   void fillData(Sheet templateSheet);

   String outFilePrefix();
}
