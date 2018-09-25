package Study.Studying;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;

public class Timesheet {
	
	private static WebDriver driver = null;
	public static String chromeDriverFile = "D:\\Drivers\\chromedriver.exe";	
	
public static void main(String args[]) throws FindFailed,  InterruptedException, IOException {

  
	System.setProperty("webdriver.chrome.driver", chromeDriverFile);
	ChromeOptions options = new ChromeOptions();        
	//options.addArguments("--disable-extensions");   
	options.setExperimentalOption("excludeSwitches", Collections.singletonList("load-extension"));
	DesiredCapabilities caps = new DesiredCapabilities().chrome();
	caps.setCapability(ChromeOptions.CAPABILITY, options);
	driver = new ChromeDriver(caps);
	
	Thread.sleep(3000);
	driver.get("http://prince2.sensiple.com/");
	
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.id("j_username")).sendKeys("2305");
	 
	 driver.findElement(By.id("j_password")).sendKeys("2305");
	 
	 
	 
	 Thread.sleep(2000);
	 
	 driver.quit();
}
}