package Study.Studying;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;

import jxl.Sheet;

public class SampleDelete
{
	static WebDriver driver;
	public static void main(String args[]) throws Exception, FindFailed, InterruptedException
	{
		File file =    new File("D:\\Book1.xls");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook book = null;
		book = new HSSFWorkbook(inputStream);
		Sheet sh = book.getSheet("Sheet1");
		int rowCount=sh.getLastRowNum();
		HSSFCell cell;
	
		 for(int row=1;row<rowCount;row++) {
			 
			// cell = sheet.getRow(i).getCell(1);
			// cell.setCellType(Cell.CELL_TYPE_STRING);
		      String Username = sh.getCell(column("uname",sh),row).getContents();
		      driver.findElement(By.id("user_name")).sendKeys(Username);


		      String Password = sh.getCell(column("password",sh),row).getContents();
		      driver.findElement(By.id("user_pass")).sendKeys(Password);          
		      driver.findElement(By.id("login_button")).click(); 
	}
	}

public static int column(String columnName, Sheet sheetAt) throws Exception{
    Row row = sheetAt.getRow(0);

    int col = -1;
    for (int i=0; i<row.getLastCellNum(); i++) {
        Cell cell = row.getCell(i);
        if (cell == null || cell.getCellType() == Cell.CELL_TYPE_BLANK) {
            continue;
        }
        if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
            String text = cell.getStringCellValue();
            if (columnName.equals(text)) {
                col = i;
                break;
            }
        }
    }
    if (col == -1) {
        throw new Exception("None of the cells in the first row were Patch");
    }

    return col;
}
}