package Others;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExcelRead {
	

    public static void main(String[] args) throws InterruptedException, IOException {
    	
    	    WebDriver driver;
    	    
            File src= new File("C:\\workspace\\Studying.xls");

            FileInputStream fis=new FileInputStream(src);

            XSSFWorkbook wb=new XSSFWorkbook(fis);

            XSSFSheet Sheet1=wb.getSheetAt(0);

            int rowcount=Sheet1.getLastRowNum();

            for(int i=0;i<rowcount+1;i++) {

            String data0=Sheet1.getRow(i).getCell(0).getStringCellValue();   

            //print the value from excel to textbox and split the data in textbox 
            driver.findElement(By.xpath("//[@id='textbox']")).sendKeys(split(data0,rowcount));

            wb.close();
            //close of try catch block    
            }
        } 

	private static CharSequence split(String data0, int rowcount) {
		// TODO Auto-generated method stub
		return null;
	}
}
