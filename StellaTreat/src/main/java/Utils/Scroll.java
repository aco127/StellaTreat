package Utils;

import java.io.File;
import java.time.Duration;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Resources.AppDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import java.time.Duration;
import io.appium.java_client.touch.offset.PointOption;
public class Scroll {

	public static void scrollDown() {

	}

	public static void scrollNClick(By listItems, String Text) {
		boolean flag = false;

		while (true) {
			for (WebElement el : AppDriver.getDriver().findElements(listItems)) {
				if (el.getAttribute("text").equals(Text)) {
					el.click();
					flag = true;
					break;
				}
			}
			if (flag)
				break;
			else
				scrollDown();
		}
	}

	public static void scrollNClick(WebElement el) {
		int retry = 0;
		while (retry <= 5) {
			try {
				el.click();
				break;
			} catch (org.openqa.selenium.NoSuchElementException e) {
				scrollDown();
				retry++;
			}
		}
	}


		 public void scrollAndClick(String visibleText) {
		    // androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
		        }
	    
	 
	
		 public static void scrollIntoView(String Text) {
				((AndroidDriver<MobileElement>) AppDriver.getDriver()).findElementByAndroidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""
								+ Text + "\").instance(0))")
						.click();
			}
		 
		 public static void scrollIntoViewn(String Text) {
				
				  ((AndroidDriver<MobileElement>)
				  AppDriver.getDriver()).findElementByAndroidUIAutomator(
				  "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""
				  + Text + "\").instance(0))");
				 
			}
		 
		 public static void scrollTo(String text){                
			 ((AndroidDriver<MobileElement>)AppDriver.getDriver()).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))");
		   }

	public static void Takess() {
		TakesScreenshot screenshot = (TakesScreenshot) AppDriver.getDriver();

		File source = screenshot.getScreenshotAs(OutputType.FILE);

		try {

			FileUtils.copyFile(source, new File("./Screenshot/" + DateUtils.getTimeStamp() + ".png"));


		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("Screenshot is captured");

	}

	public static void presskeydown()
	{
	
		Actions builder = new Actions(AppDriver.getDriver());
		builder.sendKeys(Keys.DOWN).build().perform();
		builder.sendKeys(Keys.DOWN).build().perform();
	}
	
	public static void swipeElement(WebElement ele,int xpath, int ypath)
	{
		Actions action = new Actions(AppDriver.getDriver());
		action.dragAndDropBy(ele, xpath, ypath).build().perform();
	
System.out.println("Scrolled element and performed operation");				
}
	
	
}
	
	
