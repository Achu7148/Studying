package Study.Studying;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Sheet;
import jxl.Workbook;

public class SampleDelete
{
	static WebDriver driver;
	public static String strReadFile = "D:\\Book1.xls"; 
	
	public static void main(String args[]) throws Exception, FindFailed, InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("http://training.openspan.com/login");
	    System.out.println("ReadExcel : " + strReadFile);
	    
	    FileInputStream fs = new FileInputStream(strReadFile);
	    Workbook wb = Workbook.(fs);
	    Sheet sh = wb.getSheet("Sheet1");
	    int rowCount=sh.getRows();
	    System.out.println("No of Rows:"+rowCount);
	   // int rowCount=sh.getRows();
	   
	    //Workbook wb = Workbook.getWorkbook(fs);
	    //Sheet sh = wb.getSheet(0);
	  
	    
 for(int row=1;row<rowCount;row++) 
 {
      String Username = sh.getCell(column("username column",sh),row).getContents();
      driver.findElement(By.id("user_name")).sendKeys(Username);


      String Password = sh.getCell(column("password column",sh),row).getContents();
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