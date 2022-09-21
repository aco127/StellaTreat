package WEEK5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import Utils.Scroll;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DailyLearningWeek5Day2 {
	AndroidDriver driver;

	public DailyLearningWeek5Day2() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement learningweek5;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	static WebElement ok;
	
	@FindBy(id="android:id/button1")
	static WebElement okbtn;

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView")
	static WebElement back;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
	static WebElement IdentityText;
	
	@FindBy(xpath="//android.widget.TextView[@text='What activities have you done?']")
	static WebElement activitiesdone;
	
	@FindBy(xpath="//android.widget.TextView[@text='Relax']")
	static WebElement Relax;
	
	@FindBy(xpath="//android.widget.TextView[@text='Meditation']")
	static WebElement Meditation;
	
	@FindBy(xpath="//android.widget.TextView[@text='SAVE']")
	static WebElement Savebtn;
	
	@FindBy(xpath="//android.widget.TextView[@text='Daily Activities']")
	static WebElement dailyact;
	
	@FindBy(xpath="//android.widget.TextView[@text='Eating regularly']")
	static WebElement eatingreg;
	
	@FindBy(xpath="//android.widget.TextView[@text='Showering/Bathing']")
	static WebElement showering;

	@FindBy(xpath = "//android.widget.TextView[@text='SUBMIT']")
	static WebElement Submit;

	public void dailylearning() throws InterruptedException {
		learningweek5.click();
		Thread.sleep(4000);
		/*
		 * List<WebElement> element =
		 * AppDriver.getDriver().findElements(By.className("android.widget.TextView"));
		 * // System.out.println(element.size()); for (int j = 0; j < element.size();
		 * j++) { if (element.get(j).getText() != null) { String SeenText =
		 * element.get(j).getText(); System.out.println(SeenText); } }
		 */
	}

	public static void RightswipeWeek5() throws InterruptedException {
		Thread.sleep(4000);
		for (int i = 1; i <13; i++) {
			Dimension size = AppDriver.getDriver().manage().window().getSize();
			int startY = (int) (size.height / 2);
			int startX = (int) (size.width * 0.90);
			int endX = (int) (size.width * 0.05);
			new TouchAction((PerformsTouchActions) AppDriver.getDriver()).press(PointOption.point(startX, startY))
			.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
			.moveTo(PointOption.point(endX, startY)).release().perform();
			Thread.sleep(1000);
			System.out.println(" Swiped and I value is" + i);

			/*
			 * List<WebElement> element =
			 * AppDriver.getDriver().findElements(By.className("android.widget.TextView"));
			 * // System.out.println(element.size()); for (int j = 0; j < element.size();
			 * j++) { if (element.get(j).getText() != null) { String SeenText =
			 * element.get(j).getText(); System.out.println(SeenText); } }
			 */

			if (i==4) {
				try {
					IdentityText.sendKeys("Testing Emotions ");
					
					Submit.click();
				}
				catch(Exception e)
				{
				
				}

			}
			if (i==11) {
				try {
					IdentityText.sendKeys("Testing small steps ");
					Submit.click();
					//Scroll.scrollTo("SUBMIT");
				}
				catch(Exception e)
				{
				
				}
				//Submit.click();
			}
			if(i==12)
			{
				try {
					//okbtn.click();
					activitiesdone.click();
					Savebtn.click();
					okbtn.click();
					Relax.click();
					Meditation.click();
					dailyact.click();
					showering.click();
					eatingreg.click();
					Savebtn.click();		
				}
catch(Exception e)
				{ 
	
				}
				
		}
			

		}

	}
}
