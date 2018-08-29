package Others; // As Per you Package Name 

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestExcelRead {

 public static String readdatafromExcelusingcolumnName(String ColumnName)
   throws EncryptedDocumentException, InvalidFormatException, IOException {
  String SheetName = "LoginDataSheet";
  File file = new File(".\\testData\\data.xlsx");
  FileInputStream fi = new FileInputStream(file);
  Workbook wb = WorkbookFactory.create(fi);
  Sheet sheet = wb.getSheet(SheetName);
  // it will take value from first row
  Row row = sheet.getRow(0);
// it will give you count of row which is used or filled
  short lastcolumnused = row.getLastCellNum();

  int colnum = 0;
  
  for (int i = 0; i < lastcolumnused; i++) {
   if (row.getCell(i).getStringCellValue().equalsIgnoreCase(ColumnName)) {
    colnum = i;
    break;
   }
  }

  // it will take value from Second row
  row = sheet.getRow(1);
  Cell column = row.getCell(colnum);
   String CellValue = column.getStringCellValue();

  return CellValue;
  
  

 }
       
//Main method called to ReadExcel Method
 public static void main(String[] args)
   throws EncryptedDocumentException, InvalidFormatException, IOException {
  readdatafromExcelusingcolumnName("UserName");
 
System.out.println("user Name value is : "+CellValue;


}
  
       
    }
