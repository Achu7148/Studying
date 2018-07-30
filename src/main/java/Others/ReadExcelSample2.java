package Others;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Admin
 *
 */
public class ReadExcelSample2
{
	WebDriver driver;
	WebDriverWait wait;
	HSSFWorkbook workbook;
	HSSFSheet sheet;
	HSSFCell cell;

 @BeforeTest
 public void TestSetup()
{
	// Set the path of the Firefox driver.
	 System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	
	// Enter url.
	driver.get("http://training.openspan.com/login");
	driver.manage().window().maximize();
	
	wait = new WebDriverWait(driver,30);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
 
 @Test
 public void ReadData() throws IOException
 {
	 // Import excel sheet.
	 File src=new File("D:\\Pega Test Data.xlsx");
	 
	 // Load the file.
	 FileInputStream finput = new FileInputStream(src);
	 
	 // Load he workbook.
	workbook = new HSSFWorkbook(finput);
	 
     // Load the sheet in which data is stored.
	 sheet= workbook.getSheetAt(0);
	 
	 for(int i=1; i<=sheet.getLastRowNum(); i++)
	 {
		 // Import data for Email.
		 cell = sheet.getRow(i).getCell(1);
		 cell.setCellType(Cell.CELL_TYPE_STRING);
		 driver.findElement(By.id("user_name")).sendKeys(cell.getStringCellValue());
		 
		 // Import data for password.
		 cell = sheet.getRow(i).getCell(2);
		 cell.setCellType(Cell.CELL_TYPE_STRING);
		 driver.findElement(By.id("user_pass")).sendKeys(cell.getStringCellValue());
	
		 
		 driver.findElement(By.id("login_button")).click();
		 
	     driver.findElement(By.className("menu_option")).click();
	     
	     driver.findElement(By.linkText("Customers")).click();
		 
		 cell = sheet.getRow(i).getCell(2);
		 cell.setCellType(Cell.CELL_TYPE_STRING);
		 driver.findElement(By.id("customer_name")).sendKeys(cell.getStringCellValue());
		 
		 cell = sheet.getRow(i).getCell(4);
		 cell.setCellType(Cell.CELL_TYPE_STRING);
		 driver.findElement(By.id("company_name")).sendKeys(cell.getStringCellValue());
		 
		 driver.findElement(By.id("login_button")).click();
		 
		 driver.findElement(By.className("menu_option")).click();
			
	     driver.findElement(By.linkText("Sign Out")).click();
			
	     driver.quit();
        }
	 
	
  } 

}