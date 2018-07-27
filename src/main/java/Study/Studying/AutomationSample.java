package Study.Studying;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationSample {
	
	public static void main(String[] args) throws InterruptedException  {

	 System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe"); //Setting up chrome driver
	 
     WebDriver driver = new ChromeDriver();
     
     driver.get("http://automationpractice.com/index.php");
     
     driver.manage().window().maximize();
     
     driver.findElement(By.className("login")).click();
     
    // driver.wait(1000);
     
    //driver.findElement(By.id("email")).click();
     
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
     
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ashwanth@selenium.com");
    
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
     
    driver.close();
}
}