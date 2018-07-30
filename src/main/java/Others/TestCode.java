package Others;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import jxl.write.Label; 
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException; 

public class TestCode {
	static WebDriver driver;
	static PrintWriter pw;
	static WebElement mngrid;
	static WebElement radioBtn;
	static WritableSheet sheet=null; 
	static int  rowCount;
	static List<String> arraylist = new ArrayList<String>(); 
	static WritableWorkbook workbook=null; 
	public static String strOutPutFile = "C:\\Users\\ashwanth.kolappan\\Documents\\My Received Files\\TestOutput.xls"; 
	public static String strReadFile = "C:\\Users\\ashwanth.kolappan\\Documents\\My Received Files\\Book1.xls"; 
	
	
	public static void main(String args[]) throws Exception, FindFailed, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://training.openspan.com/login");
       // String inFilePath = "D:\\Book1.xls";
        System.out.println("ReadExcel : " + strReadFile);
        
        FileInputStream fs = new FileInputStream(strReadFile);
    	Workbook wb = Workbook.getWorkbook(fs);
    	Sheet sh = wb.getSheet("Sheet1");
    	int rowCount=sh.getRows();
    	System.out.println("No of Rows:"+rowCount);
    	Screen s=new Screen();
    	
    	for(int row=1;row<rowCount;row++)
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
    		Thread.sleep(2000);
    		//*[@id="cart_menu"]/a/img
    		//WebElement cartImg = driver
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
    		 radioBtn = driver.findElement(By.id("bill_me"));
    		 radioBtn.click();    		 
    		 driver.findElement(By.id("submit_button")).click();
    	
    		 LockTonWriteToExcel(driver);
    		 driver.findElement(By.className("menu_option")).click(); 			
    	     driver.findElement(By.linkText("Sign Out")).click();
    	}//End For Loop 
    	driver.close();
    	
    	
    	
	}//End Main Method
	
	
	public static String LockTonWriteToExcel(WebDriver driver)
			throws IOException {
		rowCount = 0;		
		String strPrintErrorMessage = null;
		
		try {

			workbook = Workbook.createWorkbook(new File(strOutPutFile));
			if (workbook!=null) {
				sheet = workbook.createSheet("Sheet1", 0);
				if (sheet!=null) {				
					for (int i=1;i<=60;i++){
						mngrid = driver.findElement(By.xpath("//div[@id='load_content']/div/div/div/p[1]/b[1]"));
			    		 String getMngrId_text = mngrid.getText();
			    		 System.out.println("getMngrId_text :-" +getMngrId_text);
			    		 
			    		strPrintErrorMessage = "Order Number is :- "+ getMngrId_text ;
							arraylist.add(strPrintErrorMessage); 					
						excelwrite();
						for (int rows = 0; rows < arraylist.size(); rows++) {
							Label label = new Label(0, rows, arraylist.get(rows));	
							sheet.addCell(label);
							WritableCellFormat cellFormat = new WritableCellFormat();
							WritableCell cell = sheet.getWritableCell(rows, 0);
							cell.setCellFormat(cellFormat);						
							//rows++;
						}
						
						workbook.write();				
						workbook.close();
						return strPrintErrorMessage;
						
					}
					
				} else {
					
					System.out.println("The sheet is not created");
					strPrintErrorMessage = "Sheet is not found";
					return strPrintErrorMessage;
					
					
				}
			} else {
				
				System.out.println("The workbook file path is not found");
				strPrintErrorMessage = "The Workbook file path is not found";
				return strPrintErrorMessage;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
			strPrintErrorMessage = "Writtable Workbook is not opened";
			return strPrintErrorMessage;
		}
		return strPrintErrorMessage;
      
	}
	
	public static void excelwrite() throws RowsExceededException, WriteException, IOException
	{
		for (int rows = 0; rows < arraylist.size(); rows++) {
			
			Label label = new Label(0, rows, arraylist.get(rows));	
			sheet.addCell(label);
			WritableCellFormat cellFormat = new WritableCellFormat();
			WritableCell cell = sheet.getWritableCell(rows, 0);
			cell.setCellFormat(cellFormat);						
			rowCount++;
		}
		workbook.write();				
		workbook.close();
	} 

}//End test Code

