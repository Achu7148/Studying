package Study.Studying;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationSample {
	
	public static void main(String[] args) throws InterruptedException  {

	 System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe"); //Setting up chrome driver
	 
     WebDriver driver = new ChromeDriver();
     
     driver.get("http://192.168.18.23:8080/OnlineTestingPortal/login.do");
     
     driver.manage().window().maximize();
     
     driver.findElement(By.id("userName")).sendKeys("admin@sensiple.com");
     
     driver.findElement(By.xpath("//button[@type='']")).click();
     
     Thread.sleep(3000);
     
     driver.findElement(By.id("password")).clear();
     
     driver.findElement(By.id("password")).sendKeys("password");
     
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
     
     Thread.sleep(3000);
     
    /* driver.findElement(By.className("login")).click();
     
    // driver.wait(1000);
     
    //driver.findElement(By.id("email")).click();
     
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
     
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ashwanth@selenium.com");
    
    File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    try {
     // now copy the  screenshot to desired location using copyFile //method
    FileUtils.copyFile(src, new File("D://error.png"));
    }
     
    catch (IOException e)
     {
      System.out.println(e.getMessage());
     
     }
    
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); */
     
    driver.close();
}
}