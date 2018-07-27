package Study.Studying;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import jxl.read.biff.BiffException;

public class PegaOne {
	
	public static WebDriver driver;
	
	@Test
	
	public void Login() throws InterruptedException,IOException,BiffException {
	
	
				System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe"); 																										// up chromedriver
				
				driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//For property file read
				FileInputStream fis = new FileInputStream("C:\\workspace\\Studying\\Config.properties");
				
				Properties prop = new Properties();
				
				prop.load(fis);

				driver.get(prop.getProperty("url"));

				driver.manage().window().maximize();
				
			     Thread.sleep(1000);
			     
			     //For excel read
			     /*String FilePath = "C:\\workspace\\Studying\\Study.xls";
			     
			     FileInputStream fs = new FileInputStream(FilePath);
			     
			     Workbook wb = Workbook.getWorkbook(fs);
			     
			     Sheet sh = wb.getSheet(0); 
			     
			     //Sheet sh = wb.getSheet("sheet1");  //To select a sheet using sheet name
			     
			     int rowcount=sh.getLastCellNum();*/
			     
	             CommonMethods.setText_By_Id(driver,"user_name","1234");
	             
	             CommonMethods.setText_By_Id(driver,"user_pass","1234");
	             
	             CommonMethods.click_By_Id(driver, "login_button");
	             
	             CommonMethods.click_By_className(driver, "menu_option");
	            
	             CommonMethods.click_By_linkText(driver, "Customers"); 
	             
	             CommonMethods.setText_By_Id(driver,"account_number","1234ABCD");
	             
	             CommonMethods.setText_By_Id(driver,"customer_name","Achu");
	             
	             CommonMethods.setText_By_Id(driver,"company_name","Sensiple");
	             
	             CommonMethods.click_By_Id(driver, "login_button");
	             
	             CommonMethods.setText_By_Id(driver,"account_street_address","Rajiv nagar");
	             
	             CommonMethods.setText_By_Id(driver,"account_city","Chennai");
	             
	             CommonMethods.setText_By_Id(driver,"account_state","Tamilnadu");
	             
	             CommonMethods.setText_By_Id(driver,"account_zip_code","600117");
	             
	             CommonMethods.setText_By_Id(driver,"account_email","achu7148@gmail.com");
	             
	             CommonMethods.setText_By_Id(driver,"account_phone","9876543210");
	             
	             CommonMethods.selectDropdown_By_Id(driver, "account_level", "Silver");
	             
	             WebElement calElement = driver.findElement(By.id("datepicker"));
					calElement.click();
					try {
						SelectDayFromMultiDateCalendar("23");
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}	
					
					 CommonMethods.setText_By_Id(driver,"account_ssn_code","11111");
					 
					 CommonMethods.click_By_name(driver, "Save");
					 
					 CommonMethods.click_By_className(driver, "menu_option");
					 
					 CommonMethods.click_By_linkText(driver, "Users");
					 
					 CommonMethods.setText_By_Id(driver, "fname", "Achu");
					 
					 CommonMethods.setText_By_Id(driver, "lname", "K");
					 
					 CommonMethods.setText_By_Id(driver, "email", "a@a.com");
					 
					 CommonMethods.click_By_Id(driver, "login_button");
					 
					 CommonMethods.setSleep(2000);
					 
					 CommonMethods.click_By_Id(driver, "orders_menu");
					 
					 CommonMethods.click_By_linkText(driver, "Quick Order");
					 
					 CommonMethods.click_By_name(driver, "Order");
					 
					 CommonMethods.click_By_xpath(driver, "//img[@alt='Cart']");
					 
					 CommonMethods.click_By_name(driver, "next");
					 
					 CommonMethods.click_By_className(driver, "menu_option");
					 
					 CommonMethods.setSleep(2000);
					 
					 CommonMethods.click_By_linkText(driver, "Sign Out");
					 
					 CommonMethods.setSleep(2000);
		
		            driver.close();
	}
	
	public static void SelectDayFromMultiDateCalendar(String day)
			throws InterruptedException {

		
		By calendarXpath = By
				.xpath("//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()='"
						+ day + "']");
		driver.findElement(calendarXpath).click();

		// Intentional pause for 2 seconds.
		Thread.sleep(2000);
	}
}