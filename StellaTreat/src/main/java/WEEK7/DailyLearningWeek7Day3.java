package WEEK7;

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

public class DailyLearningWeek7Day3 {
	AndroidDriver driver;

	public DailyLearningWeek7Day3() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement learningweek5;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	static WebElement ok;

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView")
	static WebElement back;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")
	static WebElement IdentityText2;
	
	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[3]")
	static WebElement IdentityText3;
	
	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	static WebElement IdentityText1;

	@FindBy(xpath = "//android.widget.TextView[@text='SUBMIT']")
	static WebElement Submit;

	@FindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")
	static WebElement option;
	
	@FindBy(xpath="//android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView")
	static WebElement back2;
	

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

	public static void RightswipeWeek7() throws InterruptedException {
		Thread.sleep(4000);
		for (int i = 1; i <25; i++) {
			Dimension size = AppDriver.getDriver().manage().window().getSize();
			int startY = (int) (size.height / 2);
			int startX = (int) (size.width * 0.90);
			int endX = (int) (size.width * 0.05);
			new TouchAction((PerformsTouchActions) AppDriver.getDriver()).press(PointOption.point(startX, startY))
			.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
			.moveTo(PointOption.point(endX, startY)).release().perform();
		//	Thread.sleep(1000);
			System.out.println(" Swiped and I value is" + i);

			/*
			 * List<WebElement> element =
			 * AppDriver.getDriver().findElements(By.className("android.widget.TextView"));
			 * // System.out.println(element.size()); for (int j = 0; j < element.size();
			 * j++) { if (element.get(j).getText() != null) { String SeenText =
			 * element.get(j).getText(); System.out.println(SeenText); } }
			 */

			if (i ==26) {
				try {
					
					IdentityText1.sendKeys("Testing Fear1 ");
				}
				catch(Exception e)
				{
				
				}

			}
			
if(i==24)
{
	back.click();
	back2.click();
	
}
			
			

		}

	}
}
