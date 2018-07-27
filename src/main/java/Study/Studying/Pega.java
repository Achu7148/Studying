package Study.Studying;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Pega {
	
	public static WebDriver driver;
	
	@Test
	
	public void Login() throws InterruptedException{
	
	
				System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe"); 																										// up chromedriver
			
				driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				driver.get("http://training.openspan.com/login");

				driver.manage().window().maximize();
				
			     Thread.sleep(1000);
				
			     driver.findElement(By.id("user_name")).sendKeys("1234");
			     
			     driver.findElement(By.id("user_pass")).sendKeys("1234");
			     
			     driver.findElement(By.id("login_button")).click();
			     
			     driver.findElement(By.className("menu_option")).click();
			     
			     driver.findElement(By.linkText("Customers")).click();
			     
			     driver.findElement(By.id("account_number")).sendKeys("1234ABCD");
			     
			     driver.findElement(By.id("customer_name")).sendKeys("Achu");
			     
			     driver.findElement(By.id("company_name")).sendKeys("Achu");
			     
			     driver.findElement(By.id("login_button")).click();
			     
			     driver.findElement(By.id("account_street_address")).sendKeys("Rajiv Nagar");
			     
			     driver.findElement(By.id("account_city")).sendKeys("Chennai");
			     
			     driver.findElement(By.id("account_state")).sendKeys("tamilnadu");
			     
			     driver.findElement(By.id("account_zip_code")).sendKeys("600117");
			     
			     driver.findElement(By.id("account_email")).sendKeys("achu7148@gmail.com");
			     
			     driver.findElement(By.id("account_phone")).sendKeys("1234567890");
			     
			     Select dropdown = new Select(driver.findElement(By.id("account_level")));
			     dropdown.selectByVisibleText("Silver");
			     
			     WebElement calElement = driver.findElement(By.id("datepicker"));
					calElement.click();
					try {
						SelectDayFromMultiDateCalendar("3");
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}	
					
			driver.findElement(By.id("account_ssn_code")).sendKeys("11111");
			
			driver.findElement(By.name("Save")).click();
			
			driver.findElement(By.className("menu_option")).click();
			
			driver.findElement(By.linkText("Users")).click();
			
			driver.findElement(By.id("fname")).sendKeys("Achu");
			
			driver.findElement(By.id("lname")).sendKeys("Achu");
			
			driver.findElement(By.id("email")).sendKeys("a@a.com");
			
			driver.findElement(By.id("login_button")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.className("menu_option")).click();
			
			driver.findElement(By.linkText("Sign Out")).click();
			
		   Thread.sleep(1500);
			
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