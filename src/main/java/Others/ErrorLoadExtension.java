package Others;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;





public class ErrorLoadExtension {
	private static WebDriver driver = null;
	public static String chromeDriverFile = "D:\\Drivers\\chromedriver.exe";	
	
	@SuppressWarnings({ "deprecation", "static-access" })
	public static void main(String[] args) throws InterruptedException, IOException  {
		
		System.setProperty("webdriver.chrome.driver", chromeDriverFile);
		//Thread.sleep(3000);
		
		/*//String caps = DesiredCapabilities.Chrome();
		DesiredCapabilities caps = new DesiredCapabilities();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("chrome.switches","--disable-extensions");
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(caps);*/
		
		ChromeOptions options = new ChromeOptions();        
		//options.addArguments("--disable-extensions");   
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("load-extension"));
		DesiredCapabilities caps = new DesiredCapabilities().chrome();
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(caps);
		
			
		//Robot
		/*Robot rob;
		try {
			rob = new Robot();
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
			 
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		   // Release Enter
		//driver = new ChromeDriver();
		Thread.sleep(3000);
		//Runtime.getRuntime().exec("C:\\Users\\rajuverma\\Desktop\\AutoIt\\ErrorLoadingExtension.exe");
			
		

		driver.get("http://www.google.com");
		
		 driver.manage().window().maximize();
       // driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}//End Main Method

}