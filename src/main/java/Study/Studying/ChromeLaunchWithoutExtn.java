package Study.Studying;


import java.io.IOException;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;




public class ChromeLaunchWithoutExtn {

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
	driver.get("http://www.google.com");
	
	 driver.manage().window().maximize();
  // driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.close();
	driver.quit();

	



  }

}