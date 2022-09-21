package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import Utils.Scroll;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SleepTracker {
	AndroidDriver driver;

	public SleepTracker() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);

	}

	@FindBy(xpath = "//android.widget.TextView[@text='0 h']")
	WebElement selecthr;

	@FindBy(xpath = "//android.widget.TextView[@text='08']")
	WebElement selectsleephr;

	@FindBy(xpath = "//android.widget.TextView[@text='0 m']")
	WebElement selectmin;

	@FindBy(xpath = "//android.widget.TextView[@text='30']")
	WebElement selectsleepmin;

	@FindBy(xpath="//android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView")
			WebElement InitialSleep;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[3]")
	WebElement sleepscale;
	int x = 612;
	int y = 4163;
	
	
	
	  public void selectsleeptime() throws InterruptedException {
	  
	 /* selecthr.click(); selectsleephr.click(); Thread.sleep(1000);
	  selectmin.click(); selectsleepmin.click();*/
		  Scroll.swipeElement(InitialSleep, x, y);
	 
			/*
			 * Actions action = new Actions(AppDriver.getDriver());
			 * action.dragAndDropBy(InitialSleep, x, y).build().perform();
			 */
		
	//action.clickAndHold(sleepscale).moveByOffset(x, y).click().build().perform();
	 
	  //TouchAction touchAction = new TouchAction(driver); }
	 
}
}