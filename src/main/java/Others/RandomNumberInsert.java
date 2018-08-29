package Others;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;

public class RandomNumberInsert {
	
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	
	public static void main(String[] args) throws InterruptedException  {

	 System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe"); //Setting up chrome driver
	 
     WebDriver driver = new ChromeDriver();
     
     driver.get("http://192.168.18.23:8080/OnlineTestingPortal/login.do");
     
     driver.manage().window().maximize();
     
     driver.findElement(By.id("userName")).sendKeys(randomAlphaNumeric(5));
  
     Thread.sleep(5000);
     
     driver.close();
	}
	

	public static String randomAlphaNumeric(int count) {
	StringBuilder builder = new StringBuilder();
	while (count-- != 0) {
	int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
	builder.append(ALPHA_NUMERIC_STRING.charAt(character));
	}
	return builder.toString();
	}
	
	
}