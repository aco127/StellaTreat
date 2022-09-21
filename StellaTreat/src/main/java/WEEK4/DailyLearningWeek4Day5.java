package WEEK4;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

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

public class DailyLearningWeek4Day5 {
	static AndroidDriver driver;

	public DailyLearningWeek4Day5() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement learningweek4;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	static WebElement ok;

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView")
	static WebElement back;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
	static WebElement EnterText;

	@FindBy(xpath = "//android.widget.TextView[@text='SUBMIT']")
	static WebElement Submit;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	static WebElement MoodToday;

	@FindBy(xpath = "//android.widget.TextView[@text='Awesome']")
	static WebElement awesome;

	@FindBy(xpath = "//android.widget.TextView[@text='FINISH']")
	static WebElement Finish;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
	static WebElement yes1;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView")
	static WebElement yes2;

	@FindBy(xpath = "//android.widget.TextView[@text='Circular Breathing']")
	static WebElement circbreath;

	@FindBy(xpath = "//android.widget.TextView[@text='Delegate Tasks']")
	static WebElement deltask;

	@FindBy(xpath = "//android.widget.TextView[@text='Overwhelemd']")
	static WebElement emotionsandy;

	@FindBy(xpath = "//android.widget.TextView[contains(text(),'coughing']")
	static WebElement situation;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
	static WebElement negthought;

	@FindBy(xpath = "//android.widget.TextView[@text='NEXT']")
	static WebElement Nextbtn;

	public void dailylearning() throws InterruptedException {
		learningweek4.click();
		Thread.sleep(4000);
		/*
		 * List<WebElement> element =
		 * AppDriver.getDriver().findElements(By.className("android.widget.TextView"));
		 * // System.out.println(element.size()); for (int j = 0; j < element.size();
		 * j++) { if (element.get(j).getText() != null) { String SeenText =
		 * element.get(j).getText(); System.out.println(SeenText); } }
		 */
	}
	public static void swipeHorizontal(AndroidDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
        Dimension size = AppDriver.getDriver().manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage);
        new TouchAction((PerformsTouchActions)AppDriver.getDriver()).press(PointOption.point(startPoint, anchor)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration))).moveTo(PointOption.point(endPoint, anchor)).release().perform();
    }
	public static void RightswipeWeek4() throws InterruptedException {
		Thread.sleep(4000);
		for (int i = 0; i <=29; i++) {
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
			
			
			if (i>=28) 
			{
				try {
					ok.click();
					back.click();
					break;
				} catch (Exception e) {
					
				}
			}

			/*
			 * if (i == 8) { EnterText.sendKeys("Testing Stella Trivia "); Submit.click(); }
			 * if (i == 10) { circbreath.click(); //Submit.click(); } if (i == 12) {
			 * deltask.click(); } if (i >= 15 && i >= 16) { situation.click(); }
			 * 
			 * if(i>=16 && i>=17) { emotionsandy.click(); } if(i>=17 && i>=18) {
			 * negthought.click(); } if(i>=18 && i>=19) { negthought.click(); }
			 */
			/*
			 * if (i >= 19 && i <= 20) { negthought.click(); ok.click(); back.click();
			 * break; }
			 */

		

	}
	}
}
