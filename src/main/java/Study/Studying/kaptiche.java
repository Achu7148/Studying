package Study.Studying;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kaptiche {

	
	public static void main(String[] args) throws InterruptedException  {

		 System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe"); 
		 
	     WebDriver driver = new ChromeDriver();
	     
	     driver.get("http://192.168.18.75:2000/");
	     
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.id("username")).sendKeys("clientuserr@sensiple.com");
	     
	     driver.findElement(By.id("login-password")).sendKeys("Admin@2020");
	     
	     driver.findElement(By.id("btnConvert")).click();
	     
	     Thread.sleep(2000);
	     
	     driver.quit();
	    	   
}
}
