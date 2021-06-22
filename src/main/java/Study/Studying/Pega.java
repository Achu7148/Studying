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
	
	
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe"); 																										// up chromedriver
			
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
			
			driver.findElement(By.id("products_menu")).click();
			
		    driver.findElement(By.linkText("Beverages")).click();

		    
		    driver.findElement(By.linkText("Chang")).click();
		    driver.findElement(By.id("login_button")).click();
		    driver.findElement(By.name("edit_your_cart")).click();
		    driver.findElement(By.id("next1_button")).click();
		    driver.findElement(By.id("bfirst_name")).click();
		    driver.findElement(By.id("bfirst_name")).sendKeys("asd");
		    driver.findElement(By.id("blast_name")).click();
		    driver.findElement(By.id("blast_name")).sendKeys("asd");
		    driver.findElement(By.id("bcompany_name")).click();
		    driver.findElement(By.id("bcompany_name")).sendKeys("asd");
		    driver.findElement(By.id("bstreet_address")).click();
		    driver.findElement(By.id("bstreet_address")).sendKeys("asd");
		    driver.findElement(By.cssSelector("fieldset:nth-child(3)")).click();
		    driver.findElement(By.id("bzip_code")).click();
		    driver.findElement(By.id("bzip_code")).sendKeys("12345");
		    driver.findElement(By.cssSelector("#billing_section > p:nth-child(5)")).click();
		    driver.findElement(By.id("barea_code")).click();
		    driver.findElement(By.id("barea_code")).sendKeys("123");
		    driver.findElement(By.id("bprimary_phone")).click();
		    driver.findElement(By.id("bprimary_phone")).sendKeys("1111111111");
		    driver.findElement(By.id("sfirst_name")).click();
		    driver.findElement(By.id("sfirst_name")).sendKeys("asd");
		    driver.findElement(By.id("slast_name")).click();
		    driver.findElement(By.id("slast_name")).sendKeys("asd");
		    driver.findElement(By.cssSelector("#shipping_section > p:nth-child(3)")).click();
		    driver.findElement(By.id("scompany_name")).click();
		    driver.findElement(By.id("scompany_name")).sendKeys("asd");
		    driver.findElement(By.id("sstreet_address")).click();
		    driver.findElement(By.id("sstreet_address")).sendKeys("asd");
		    driver.findElement(By.cssSelector("#billing_section > p:nth-child(4)")).click();
		    driver.findElement(By.id("szip_code")).click();
		    driver.findElement(By.id("szip_code")).sendKeys("12345");
		    driver.findElement(By.id("shipping_section")).click();
		    driver.findElement(By.name("email_address")).click();
		    driver.findElement(By.name("email_address")).sendKeys("ab@ab.com");
		    Thread.sleep(2000);
		    driver.findElement(By.id("next2_button")).click();
		    
		    
		    Select dropdown2 = new Select(driver.findElement(By.id("card_type")));
		     dropdown2.selectByVisibleText("Visa");
		  
				/*
				 * driver.findElement(By.id("card_type")).click(); { WebElement dropdown =
				 * driver.findElement(By.id("card_type"));
				 * dropdown.findElement(By.xpath("//option[. = 'Visa']")).click(); }
				 */
		    driver.findElement(By.id("card_type")).click();
		    driver.findElement(By.id("security_code")).click();
		    driver.findElement(By.id("security_code")).sendKeys("123");
		    driver.findElement(By.id("card_number")).click();
		    driver.findElement(By.id("card_number")).sendKeys("1234567890123456");
		    driver.findElement(By.id("expiry_month")).click();
		    
		    Select dropdown3 = new Select(driver.findElement(By.id("expiry_month")));
		     dropdown3.selectByVisibleText("May");
		    
//		    {
//		      WebElement dropdown = driver.findElement(By.id("expiry_month"));
//		      dropdown.findElement(By.xpath("//option[. = 'May']")).click();
//		    }
		     
		    driver.findElement(By.id("expiry_month")).click();
		    driver.findElement(By.id("expiry_year")).click();
		    
		    Select dropdown4 = new Select(driver.findElement(By.id("expiry_year")));
		     dropdown4.selectByVisibleText("2016");
		    
//		    {
//		      WebElement dropdown = driver.findElement(By.id("expiry_year"));
//		      dropdown.findElement(By.xpath("//option[. = '2016']")).click();
//		    }
		    driver.findElement(By.id("expiry_year")).click();
		    driver.findElement(By.id("submit_button")).click();
		    
		    WebElement e = driver.findElement(By.xpath("//*[contains(text(),'Order #')]"));

		    System.out.println("Element with text(): " + e.getText() );
		    
		    driver.findElement(By.cssSelector("#profile_menu img")).click();
		    
		   
		  
		     
		    driver.findElement(By.linkText("Sign Out")).click();
			
			
			//driver.findElement(By.linkText("Sign Out")).click();
			
		   //Thread.sleep(1500);
			
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