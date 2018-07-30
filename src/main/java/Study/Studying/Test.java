package Study.Studying;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import jxl.Sheet;
import jxl.Workbook;
import jxl.*;





public class Test
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
	Workbook wb = Workbook.getWorkbook(fs);
	Sheet sh = wb.getSheet("Sheet1");
	int rowCount=sh.getRows();
	System.out.println("No of Rows:"+rowCount);
	
	/*for(int row=1;row<rowCount;row++)
	{
		String Username = sh.getCell(1,row).getContents();
		driver.findElement(By.id("user_name")).sendKeys(Username);
		
		
		String Password = sh.getCell(2,row).getContents();
		driver.findElement(By.id("user_pass")).sendKeys(Password);  
		
		
		driver.findElement(By.id("login_button")).click();
		
		Thread.sleep(2000);
	}*/
	 for(int row=1;row<rowCount;row++) {
	      String Username = sh.getCell(columnname("uname",sh),row).getContents();
	      driver.findElement(By.id("user_name")).sendKeys(Username);


	      String Password = sh.getCell(columnname("password",sh),row).getContents();
	      driver.findElement(By.id("user_pass")).sendKeys(Password);          
	      driver.findElement(By.id("login_button")).click(); 
	   }
	 
	 driver.close();
}

public static int columnname(String columnName, Sheet sheetAt) throws Exception
{
    Row rows;
    rows = sheetAt.getRows();

    int col = -1;
    for (int i=0; i<rows.getLastCellNum(); i++) {
        Cell cell = rows.getCell(i);
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
