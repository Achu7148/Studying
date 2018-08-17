package Others;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.webdriver.*;

import com.csvreader.CsvWriter;
import com.opencsv.CSVWriter;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class RajuCodePegaExcelreadWrite {
	static WebDriver driver;
	static PrintWriter pw;
	static WebElement mngrid;
	public static void main(String args[]) throws Exception, FindFailed, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
 driver.navigate().to("http://training.openspan.com/login");
 
 String inFilePath = "D:\\Book1.xls";
 System.out.println("ReadExcel : " + inFilePath);
	FileInputStream fs = new FileInputStream(inFilePath);
	Workbook wb = Workbook.getWorkbook(fs);
	Sheet sh = wb.getSheet("Sheet1");
	int Temp=sh.getRows();
	System.out.println("No of Rows:"+Temp);
	Screen s=new Screen();
	
	for(int row=1;row<Temp;row++)
	{
		String Username = sh.getCell(1,row).getContents();
		driver.findElement(By.id("user_name")).sendKeys(Username);
		
		String Password = sh.getCell(2,row).getContents();
		driver.findElement(By.id("user_pass")).sendKeys(Password);
		
		driver.findElement(By.id("login_button")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("orders_menu")).click();
		
		driver.findElement(By.linkText("Quick Order")).click();
		
		driver.findElement(By.name("Order")).click();
		
		 s.find("cart_image.png"); //identify cart button
		 s.click("cart_image.png");
		 System.out.println("cart button clicked");
		 
		 driver.findElement(By.name("next")).click();
		 
		 driver.findElement(By.name("bfirst_name")).sendKeys("Ash");
		 
		 driver.findElement(By.name("blast_name")).sendKeys("K");
		 
		 driver.findElement(By.name("bstreet_address")).sendKeys("Chennai");
		 
		 driver.findElement(By.name("bzip_code")).sendKeys("600117");
		 
		 driver.findElement(By.name("barea_code")).sendKeys("600117");
		 
		 driver.findElement(By.name("bprimary_phone")).sendKeys("9876543210");
		 
		 driver.findElement(By.name("sfirst_name")).sendKeys("Ash");
		 
		 driver.findElement(By.name("slast_name")).sendKeys("K");
		 
		 driver.findElement(By.name("sstreet_address")).sendKeys("Chennai");
		 
		 driver.findElement(By.name("szip_code")).sendKeys("600117");
		 
		 driver.findElement(By.id("next2_button")).click();
		 
		 WebElement radioBtn = driver.findElement(By.id("bill_me"));
		 
		 radioBtn.click();
		 
		 driver.findElement(By.id("submit_button")).click();
		 
		 
		 
		 mngrid = driver.findElement(By.xpath("//div[@id='load_content']/div/div/div/p[1]/b[1]"));
		 
	}
		 
		 String actual_text = mngrid.getText();
		 System.out.println("actual_text1 :-" +actual_text);
		 
		 //writing output  into csv 1
		 /*String csv = "D:\\output.csv";
		
		 CSVWriter writer = new CSVWriter(new FileWriter(csv,true),',');
		 
		 writer.write(actual_text);*/
		 
		 //writing output into csv 2
		 System.out.println("Added successfully");
		 System.out.println(actual_text);
	
		 
		FileWriter fw = new FileWriter("D:\\output.csv");
		fw.append(actual_text);
		fw.append(',');
		 fw.close();
		// fw.write(actual_text);
		 
		  
		 
		 
	
		 
		// System.out.println(actual_text);
		
		driver.findElement(By.className("menu_option")).click();
			
	     driver.findElement(By.linkText("Sign Out")).click();
	     
	//}
	//driver.quit();
	driver.close();
	}
	//driver.quit();
	//driver.close();
	
}