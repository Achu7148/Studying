package Study.Studying;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.sikuli.script.FindFailed;

import org.sikuli.script.Pattern;

import org.sikuli.script.Screen;



public class Sikuli {


public static void main(String args[]) throws FindFailed {

  

// Create a new instance of the Firefox driver

	 System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe"); //Setting up chrome driver
     WebDriver driver = new ChromeDriver();



// And now use this to visit Google

driver.get("http://www.google.com");



//Create and initialize an instance of Screen object   

Screen screen = new Screen();



//Add image path  

Pattern image = new Pattern("D:\\SearchButton.png");

   

//Wait 10ms for image 

screen.wait(image, 10);

   

//Click on the image

screen.click(image);

  }

}