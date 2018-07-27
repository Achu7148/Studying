package Study.Studying;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



//import Master_Scripts.HtmlReports;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class ReadPegaExcel2 {
	static WebDriver driver;
	static PrintWriter pw;
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
 driver.navigate().to("http://www.panerai.com/en-us/e-boutique.html");
 //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
 HtmlReports.Setting_Header_Values();
 HtmlReports.OverViewreporting();
 Thread.sleep(2000);
 System.out.println("Step-1");
 String LocatorElement = "link=GO TO E-BOUTIQUE";
 
 driver.findElement(By.linkText("GO TO E-BOUTIQUE")).click(); 
 Thread.sleep(5000);
 System.out.println("Step-2");
 driver.findElement(By.xpath("//*[@id='gdt']/div[3]/div[2]")).click();
 Thread.sleep(2000);
 System.out.println("Step-3");
 driver.findElement(By.linkText("My Account")).click();
 Thread.sleep(3000);
 System.out.println("Step-4");
 EventFiringWebDriver eventDriver=new EventFiringWebDriver(driver);
 eventDriver.executeScript("scroll(0,1000)");
 System.out.println("Step-5");
 if(driver.findElement(By.xpath("//a[contains(text(),'Create an account')]"))!=null){
	 System.out.println("Object is found");
 driver.findElement(By.xpath("//a[contains(text(),'Create an account')]")).click();
 Thread.sleep(3000);
 }else{
	 System.out.println("Object is not found");
 }
 System.out.println("Step-6");
  String inFilePath = "F:\\NewSwiftTestFW\\Panerai_Poc\\ReadPath.xls";
  System.out.println("ReadExcel : " + inFilePath);
	FileInputStream fs = new FileInputStream(inFilePath);
	Workbook wb = Workbook.getWorkbook(fs);
	Sheet sh = wb.getSheet("Sheet1");
	int Temp=sh.getRows();
	System.out.println("No of Rows:"+Temp);
	for(int row = 7;row < Temp;row++)
	{
		//String FirstName = sh.getCell(0,row).getContents();
		
			
		String LastName = sh.getCell(1,row).getContents();
		driver.findElement(By.id("registration_family-name")).sendKeys(LastName);
	
		String City = sh.getCell(2,row).getContents();
		driver.findElement(By.id("registration_city")).sendKeys(City);	
		
		String StreetNumber = sh.getCell(3,row).getContents();
		driver.findElement(By.id("registration_streetNumber")).sendKeys(StreetNumber);
		
		String StreetName = sh.getCell(4,row).getContents();
		driver.findElement(By.id("registration_streetName")).sendKeys(StreetName);
		
		String Zipcode = sh.getCell(5,row).getContents();
		driver.findElement(By.id("registration_zipcode")).sendKeys(Zipcode);
		
		String AdditionalInfo = sh.getCell(6,row).getContents();
		driver.findElement(By.id("registration_additionalAddress")).sendKeys(AdditionalInfo);
		
		String Email = sh.getCell(7,row).getContents();
		driver.findElement(By.id("registration_email")).sendKeys(Email);

		String ConfirmEmail = sh.getCell(8,row).getContents();
		driver.findElement(By.id("confirm-registration_email")).sendKeys(ConfirmEmail);
		
		String Password = sh.getCell(9,row).getContents();
		driver.findElement(By.id("registration_password")).sendKeys(Password);

		String RepeatPassword = sh.getCell(10,row).getContents();
		driver.findElement(By.id("confirm-registration_password")).sendKeys(RepeatPassword);
		Thread.sleep(3000);
	}
	eventDriver.executeScript("scroll(0,1000)");
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//label[text()='I have read and accept the']/preceding-sibling::input[@type='checkbox']")).click();
	//WebElement oCheckBoxOrange = driver.findElement(By.cssSelector("input[name='terms']"));
	//oCheckBoxOrange.click();
	
	driver.findElement(By.xpath("//*[@id='registration']/div/fieldset/fieldset[3]/label[1]/span[1]")).click();
	driver.findElement(By.xpath("//*[@id='registration']/div/fieldset/fieldset[3]/label[2]/span[1]")).click();
	driver.findElement(By.xpath("//*[@id='registration']/div/div[1]/button[2]")).click();
	String screenTitle=driver.getTitle();
	File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshot1, new File("C:\\Users\\sunkusreekars\\Documents\\Panerai e-Com\\Panerai_Poc\\Screenshots\\"+screenTitle+".png"));
		   String expectedTitle = "Confirmation";
		   
		   if(driver.getTitle().equals(expectedTitle)) {
		         System.out.println("Checked page title,Page title is : " + expectedTitle);		        
		         System.out.println("Link to resend activation email is : " +driver.findElement(By.linkText("click here")).getText());
		         System.out.println(driver.findElement(By.xpath("//*[@id='top']/section/h2")).getText());
		   } else {
		         System.out.println("Check page title, Incorrect page title" + driver.getTitle());
		     }
	    }
}
	

	
	

