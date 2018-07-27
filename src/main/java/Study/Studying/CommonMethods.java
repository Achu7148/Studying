package Study.Studying;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class CommonMethods {
	
	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is invoke the browser
	 */

	public static void invokeURLBrowser(WebDriver driver, String strGetUrl) throws IOException, InterruptedException {
		driver.get(strGetUrl);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	} // End Method

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is set sleep value
	 */
	public static void setSleep(int intSleepValue) throws IOException, InterruptedException {
		Thread.sleep(intSleepValue);
	}// End Method

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is set time out
	 */

	public static void setTimeOut(WebDriver driver, String strTimeDurationForTimeout)
			throws IOException, InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(strTimeDurationForTimeout), TimeUnit.SECONDS);
	}// End Method

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is used to maximize the browser
	 */
	public static void maximizeWindow(WebDriver driver) throws IOException, InterruptedException {
		driver.manage().window().maximize();
	}// End Method

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is used to click the element
	 * 
	 */
	public static void click_By_Id(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.id(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.id(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {
				driver.findElement(By.id(strLocatorElement)).click();
				
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("click_By_Id Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void click_By_xpath(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.xpath(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.xpath(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {
				driver.findElement(By.xpath(strLocatorElement)).click();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("click_By_xpath Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void click_By_className(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.className(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.className(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {
				driver.findElement(By.className(strLocatorElement)).click();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("click_By_className Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void click_By_cssSelector(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {
				driver.findElement(By.cssSelector(strLocatorElement)).click();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("click_By_cssSelector Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void click_By_name(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.name(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.name(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {
				driver.findElement(By.name(strLocatorElement)).click();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("click_By_name Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void click_By_linkText(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.linkText(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.linkText(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.linkText(strLocatorElement)).click();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("clickCheckBox_By_linkText Exception has thrown");
			e.printStackTrace();
		}
	}//End Method
		
		
		/**
		 * 
		 * @param driver
		 * @param strTypeElementId
		 * @code = The purpose of this method is used to click the element for checkbox
		 * 
		 */
		public static void clickCheckBox_By_Id(WebDriver driver, String strLocatorElement) {

			try {

				boolean enableORLocators = driver.findElement(By.id(strLocatorElement)).isEnabled();
				boolean displayORLocators = driver.findElement(By.id(strLocatorElement)).isDisplayed();
				if (enableORLocators == true && displayORLocators == true) {
					driver.findElement(By.id(strLocatorElement)).click();
				} else {
					System.out.println("Element not found :-");
				}
			} catch (NoSuchElementException e) {
				System.out.println("clickCheckBox_By_Id Exception has thrown");
				e.printStackTrace();
			}

		}// EndMethod

		public static void clickCheckBox_By_xpath(WebDriver driver, String strLocatorElement) {

			try {

				boolean enableORLocators = driver.findElement(By.xpath(strLocatorElement)).isEnabled();
				boolean displayORLocators = driver.findElement(By.xpath(strLocatorElement)).isDisplayed();
				if (enableORLocators == true && displayORLocators == true) {
					driver.findElement(By.xpath(strLocatorElement)).click();
				} else {
					System.out.println("Element not found :-");
				}
			} catch (NoSuchElementException e) {
				System.out.println("clickCheckBox_By_xpath Exception has thrown");
				e.printStackTrace();
			}

		}// EndMethod

		public static void clickCheckBox_By_className(WebDriver driver, String strLocatorElement) {

			try {

				boolean enableORLocators = driver.findElement(By.className(strLocatorElement)).isEnabled();
				boolean displayORLocators = driver.findElement(By.className(strLocatorElement)).isDisplayed();
				if (enableORLocators == true && displayORLocators == true) {
					driver.findElement(By.className(strLocatorElement)).click();
				} else {
					System.out.println("Element not found :-");
				}
			} catch (NoSuchElementException e) {
				System.out.println("clickCheckBox_By_className Exception has thrown");
				e.printStackTrace();
			}

		}// EndMethod

		public static void clickCheckBox_By_cssSelector(WebDriver driver, String strLocatorElement) {

			try {

				boolean enableORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isEnabled();
				boolean displayORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isDisplayed();
				if (enableORLocators == true && displayORLocators == true) {
					driver.findElement(By.cssSelector(strLocatorElement)).click();
				} else {
					System.out.println("Element not found :-");
				}
			} catch (NoSuchElementException e) {
				System.out.println("clickCheckBox_By_cssSelector Exception has thrown");
				e.printStackTrace();
			}

		}// EndMethod

		public static void clickCheckBox_By_name(WebDriver driver, String strLocatorElement) {

			try {

				boolean enableORLocators = driver.findElement(By.name(strLocatorElement)).isEnabled();
				boolean displayORLocators = driver.findElement(By.name(strLocatorElement)).isDisplayed();
				if (enableORLocators == true && displayORLocators == true) {
					driver.findElement(By.name(strLocatorElement)).click();
				} else {
					System.out.println("Element not found :-");
				}
			} catch (NoSuchElementException e) {
				System.out.println("clickCheckBox_By_name Exception has thrown");
				e.printStackTrace();
			}

		}// EndMethod

		public static void clickCheckBox_By_linkText(WebDriver driver, String strLocatorElement) {

			try {

				boolean enableORLocators = driver.findElement(By.linkText(strLocatorElement)).isEnabled();
				boolean displayORLocators = driver.findElement(By.linkText(strLocatorElement)).isDisplayed();
				if (enableORLocators == true && displayORLocators == true) {
					driver.findElement(By.linkText(strLocatorElement)).click();
				} else {
					System.out.println("Element not found :-");
				}
			} catch (NoSuchElementException e) {
				System.out.println("clickCheckBox_By_linkText Exception has thrown");
				e.printStackTrace();
			}


	}// EndMethod
	
		

		/**
		 * 
		 * @param driver
		 * @param strTypeElementId
		 * @code = The purpose of this method is used to click the element for Radio button
		 * 
		 */
		public static void clickRadioButton_By_Id(WebDriver driver, String strLocatorElement) {

			try {

				boolean enableORLocators = driver.findElement(By.id(strLocatorElement)).isEnabled();
				boolean displayORLocators = driver.findElement(By.id(strLocatorElement)).isDisplayed();
				if (enableORLocators == true && displayORLocators == true) {
					driver.findElement(By.id(strLocatorElement)).click();
				} else {
					System.out.println("Element not found :-");
				}
			} catch (NoSuchElementException e) {
				System.out.println("clickRadioButton_By_Id Exception has thrown");
				e.printStackTrace();
			}

		}// EndMethod

		public static void clickRadioButton_By_xpath(WebDriver driver, String strLocatorElement) {

			try {

				boolean enableORLocators = driver.findElement(By.xpath(strLocatorElement)).isEnabled();
				boolean displayORLocators = driver.findElement(By.xpath(strLocatorElement)).isDisplayed();
				if (enableORLocators == true && displayORLocators == true) {
					driver.findElement(By.xpath(strLocatorElement)).click();
				} else {
					System.out.println("Element not found :-");
				}
			} catch (NoSuchElementException e) {
				System.out.println("clickRadioButton_By_xpath Exception has thrown");
				e.printStackTrace();
			}

		}// EndMethod

		public static void clickRadioButton_By_className(WebDriver driver, String strLocatorElement) {

			try {

				boolean enableORLocators = driver.findElement(By.className(strLocatorElement)).isEnabled();
				boolean displayORLocators = driver.findElement(By.className(strLocatorElement)).isDisplayed();
				if (enableORLocators == true && displayORLocators == true) {
					driver.findElement(By.className(strLocatorElement)).click();
				} else {
					System.out.println("Element not found :-");
				}
			} catch (NoSuchElementException e) {
				System.out.println("clickRadioButton_By_className Exception has thrown");
				e.printStackTrace();
			}

		}// EndMethod

		public static void clickRadioButton_By_cssSelector(WebDriver driver, String strLocatorElement) {

			try {

				boolean enableORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isEnabled();
				boolean displayORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isDisplayed();
				if (enableORLocators == true && displayORLocators == true) {
					driver.findElement(By.cssSelector(strLocatorElement)).click();
				} else {
					System.out.println("Element not found :-");
				}
			} catch (NoSuchElementException e) {
				System.out.println("clickCheckBox_By_cssSelector Exception has thrown");
				e.printStackTrace();
			}

		}// EndMethod

		public static void clickRadioButton_By_name(WebDriver driver, String strLocatorElement) {

			try {

				boolean enableORLocators = driver.findElement(By.name(strLocatorElement)).isEnabled();
				boolean displayORLocators = driver.findElement(By.name(strLocatorElement)).isDisplayed();
				if (enableORLocators == true && displayORLocators == true) {
					driver.findElement(By.name(strLocatorElement)).click();
				} else {
					System.out.println("Element not found :-");
				}
			} catch (NoSuchElementException e) {
				System.out.println("clickRadioButton_By_name Exception has thrown");
				e.printStackTrace();
			}

		}// EndMethod

		public static void clickRadioButton_By_linkText(WebDriver driver, String strLocatorElement) {

			try {

				boolean enableORLocators = driver.findElement(By.linkText(strLocatorElement)).isEnabled();
				boolean displayORLocators = driver.findElement(By.linkText(strLocatorElement)).isDisplayed();
				if (enableORLocators == true && displayORLocators == true) {
					driver.findElement(By.linkText(strLocatorElement)).click();
				} else {
					System.out.println("Element not found :-");
				}
			} catch (NoSuchElementException e) {
				System.out.println("clickRadioButton_By_linkText Exception has thrown");
				e.printStackTrace();
			}


	}// EndMethod
		
		
		
		
	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is used to double click the element
	 * 
	 */
	public static void doubleClick_By_Id(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.id(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.id(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {				
				Actions action = new Actions(driver);
				action.moveToElement(driver.findElement(By.id(strLocatorElement))).doubleClick().build().perform();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("doubleClick_By_Id Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void doubleClick_By_xpath(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.xpath(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.xpath(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {
				Actions action = new Actions(driver);
				action.moveToElement(driver.findElement(By.xpath(strLocatorElement))).doubleClick().build().perform();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("doubleClick_By_xpath Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void doubleClick_By_className(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.className(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.className(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {
				Actions action = new Actions(driver);
				action.moveToElement(driver.findElement(By.className(strLocatorElement))).doubleClick().build().perform();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("doubleClick_By_className Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void doubleClick_By_cssSelector(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {
				Actions action = new Actions(driver);
				action.moveToElement(driver.findElement(By.cssSelector(strLocatorElement))).doubleClick().build().perform();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("doubleClick_By_cssSelector Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void doubleClick_By_name(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.name(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.name(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {
				Actions action = new Actions(driver);
				action.moveToElement(driver.findElement(By.name(strLocatorElement))).doubleClick().build().perform();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("doubleClick_By_name Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void doubleClick_By_linkText(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.linkText(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.linkText(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {
				Actions action = new Actions(driver);
				action.moveToElement(driver.findElement(By.linkText(strLocatorElement))).doubleClick().build().perform();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("doubleClick_By_linkText Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod
	

	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is used to clear the field
	 * 
	 */

	public static void clear_By_Id(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.id(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.id(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.id(strLocatorElement)).clear();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("clear_By_Id Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void clear_By_xpath(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.xpath(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.xpath(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.xpath(strLocatorElement)).clear();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("clear_By_xpath Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void clear_By_className(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.className(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.className(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.className(strLocatorElement)).clear();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("clear_By_className Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void clear_By_cssSelector(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.cssSelector(strLocatorElement)).clear();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("clear_By_cssSelector Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void clear_By_name(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.name(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.name(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.name(strLocatorElement)).clear();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("clear_By_name Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void clear_By_linkText(WebDriver driver, String strLocatorElement) {

		try {

			boolean enableORLocators = driver.findElement(By.linkText(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.linkText(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.linkText(strLocatorElement)).clear();
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("clear_By_linkText Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod
	
	


	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is used to send the values in respective
	 *       text box area
	 * 
	 */

	public static void setText_By_Id(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.id(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.id(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.id(strLocatorElement)).sendKeys(strTextAreaValue);
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("setText_By_Id Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void setText_By_xpath(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.xpath(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.xpath(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.xpath(strLocatorElement)).sendKeys(strTextAreaValue);
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("setText_By_xpath Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void setText_By_className(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.className(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.className(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.className(strLocatorElement)).sendKeys(strTextAreaValue);
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("setText_By_className Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void setText_By_cssSelector(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.cssSelector(strLocatorElement)).sendKeys(strTextAreaValue);
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("setText_By_cssSelector Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void setText_By_name(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.name(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.name(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.name(strLocatorElement)).sendKeys(strTextAreaValue);
			} else {
				System.out.println("setText_By_name Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("setText_By_name Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void setText_By_linkText(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.linkText(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.linkText(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {

				driver.findElement(By.linkText(strLocatorElement)).sendKeys(strTextAreaValue);
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("setText_By_linkText Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void getScreenshot(WebDriver driver, String strTestscreenshotSteps) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// The below method will save the screen shot in d drive with name
		// "screenshot.png"
		FileUtils.copyFile(scrFile, new File("C:\\workspace\\qvsbatch1\\ScreenshotsFolder\\" + strTestscreenshotSteps + ".png"));

	}

	public static void failedCaptureTestScreenshot(WebDriver driver, String strTestscreenshotSteps) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// The below method will save the screen shot in d drive with name
		// "screenshot.png"
		FileUtils.copyFile(scrFile,
				new File("C:\\workspace\\qvsbatch1\\ScreenshotsFolder\\" + strTestscreenshotSteps + ".png"));

	}//End Method
	
	
	
	/**
	 * 
	 * @param driver
	 * @param strTypeElementId
	 * @code = The purpose of this method is used to select the values
	 * 
	 */

	public static void selectByVisibleText_By_Id(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.id(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.id(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {
				Select selectValues = new Select(driver.findElement(By.id(strLocatorElement)));
				selectValues.selectByVisibleText(strTextAreaValue);
			} else {
				System.out.println("Element not found :-" +strLocatorElement);
			}
		} catch (NoSuchElementException e) {
			System.out.println("selectByVisibleText_By_Id Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void selectByVisibleText_By_xpath(WebDriver driver, String strLocatorElement, String strTextAreaValue) throws InterruptedException {

		try {
            Thread.sleep(5000);
			boolean enableORLocators = driver.findElement(By.xpath(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.xpath(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {
				Select selectValues = new Select(driver.findElement(By.xpath(strLocatorElement)));
				selectValues.selectByVisibleText(strTextAreaValue);
			} else {
				System.out.println("Element not found :-" +strLocatorElement);
			}
		} catch (NoSuchElementException e) {
			System.out.println("selectByVisibleText_By_xpath Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void selectByVisibleText_By_className(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.className(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.className(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {
				Select selectValues = new Select(driver.findElement(By.className(strLocatorElement)));
				selectValues.selectByVisibleText(strTextAreaValue);
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("selectByVisibleText_By_className Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void selectByVisibleText_By_cssSelector(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.cssSelector(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {
				Select selectValues = new Select(driver.findElement(By.cssSelector(strLocatorElement)));
				selectValues.selectByVisibleText(strTextAreaValue);
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("selectByVisibleText_By_cssSelector Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void selectByVisibleText_By_name(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.name(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.name(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {
				Select selectValues = new Select(driver.findElement(By.name(strLocatorElement)));
				selectValues.selectByVisibleText(strTextAreaValue);
			} else {
				System.out.println("setText_By_name Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("selectByVisibleText_By_name Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	public static void selectByVisibleText_By_linkText(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.linkText(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.linkText(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {
				Select selectValues = new Select(driver.findElement(By.linkText(strLocatorElement)));
				selectValues.selectByVisibleText(strTextAreaValue);
			} else {
				System.out.println("Element not found :-");
			}
		} catch (NoSuchElementException e) {
			System.out.println("selectByVisibleText_By_linkText Exception has thrown");
			e.printStackTrace();
		}

	}// EndMethod

	//Selecting dropdown by Id
	public static void selectDropdown_By_Id(WebDriver driver, String strLocatorElement, String strTextAreaValue) {

		try {

			boolean enableORLocators = driver.findElement(By.id(strLocatorElement)).isEnabled();
			boolean displayORLocators = driver.findElement(By.id(strLocatorElement)).isDisplayed();
			if (enableORLocators == true && displayORLocators == true) {
				Select selectValues = new Select(driver.findElement(By.id(strLocatorElement)));
				selectValues.selectByVisibleText(strTextAreaValue);
			} else {
				System.out.println("Element not found :-" +strLocatorElement);
			}
		} catch (NoSuchElementException e) {
			System.out.println("selectByVisibleText_By_Id Exception has thrown");
			e.printStackTrace();
		}

	
	}

} // EndClass
