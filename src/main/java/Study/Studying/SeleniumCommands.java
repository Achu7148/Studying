package Study.Studying;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;


public class SeleniumCommands{
	
	static WebDriver driver;


@BeforeSuite
public static WebDriver OpenApp(String BrowserName, String url){
fn_LaunchBrowser(BrowserName);
fn_OpenURL(url);
return driver;
}


public static void fn_OpenURL(String url){
driver.get(url);
driver.manage().window().maximize();
}
 
public static WebDriver fn_LaunchBrowser(String Browsername){
	
if(Browsername=="CH")
{
System.setProperty("webdriver.chrome.driver", "C:\\workspace\\qvsbatch1\\SelDrivers\\chromedriver.exe");
driver= new ChromeDriver();
}

else if(Browsername=="FF")
{
System.setProperty("webdriver.gecko.driver", "C:\\workspace\\qvsbatch1\\SelDrivers\\geckodriver.exe");
driver= new FirefoxDriver();
}

else if(Browsername=="IE")
{
System.setProperty("webdriver.ie.driver", "C:\\workspace\\qvsbatch1\\SelDrivers\\IEDriverServer.exe");
driver= new InternetExplorerDriver();
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;
}
}


