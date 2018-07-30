package Others;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadPegaExcel {

WebDriver driver;
Workbook wb;
Sheet sh1;
int numrow;
String username;
String password;

@BeforeTest
public void setUp(String uname, String password) throws InterruptedException, FileNotFoundException, IOException
{
System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://training.openspan.com/login");
}

@DataProvider(name="testdata")
public Object[][] TestDataFeed(){

try {

// load workbook
wb=Workbook.getWorkbook(new File("D:\\Book1.xls"));

// load sheet in my case I am referring to first sheet only
sh1= wb.getSheet(0);

// get number of rows so that we can run loop based on this
numrow= sh1.getRows();
}
catch (Exception e)

{
e.printStackTrace();
}

// Create 2 D array and pass row and columns
Object [][] facebookdata=new Object[numrow][sh1.getColumns()];

// This will run a loop and each iteration  it will fetch new row
for(int i=0;i<numrow;i++){

// Fetch first row username
facebookdata[i][0]=sh1.getCell(0,i).getContents();
// Fetch first row password
facebookdata[i][1]=sh1.getCell(1,i).getContents();

}

// Return 2d array object so that test script can use the same
return facebookdata;
}

@Test(dataProvider="testdata")
public void TestFireFox(String uname,String password) throws InterruptedException, FileNotFoundException, IOException

{

driver.findElement(By.id("user_name")).sendKeys(uname);
driver.findElement(By.id("user_pass")).sendKeys(password);
driver.findElement(By.id("login_button")).click();
}


@AfterTest
public void QuitTC(){

// close browser after execution
driver.quit();
}
}