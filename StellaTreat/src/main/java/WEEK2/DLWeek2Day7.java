package WEEK2;

import java.time.Duration;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
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

public class DLWeek2Day7 {

	AndroidDriver driver;

	public DLWeek2Day7() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement learning;

	@FindBy(xpath = "//android.widget.TextView[@text='SUBMIT']")
	static WebElement Submit;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	static WebElement ok;

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView")
	static WebElement back;

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")
	static WebElement back2;

	@FindBy(xpath = "//android.widget.TextView[@text='Tracker Summary Reports']")
	static WebElement trackreports;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	static WebElement quickassessment;

	@FindAll(@FindBy(xpath = "//*[contains(@text,'')]"))
	static List<WebElement> plusicon;

	@FindAll(@FindBy(xpath = "//android.widget.TextView[@text='+']"))
	static List<WebElement> emotiontherom;

	@FindBy(xpath = "//android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup")
	static WebElement greycolor;

	/*
	 * @FindBy(xpath =
	 * "//android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup")
	 * static WebElement orangecolor;
	 * 
	 * @FindBy(xpath =
	 * "//android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	 * static WebElement yellowcolor;
	 * 
	 * @FindBy(xpath =
	 * "//android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")
	 * static WebElement greenolor;
	 */

	@FindBy(xpath = "//android.widget.TextView[@text='SUBMIT']")
	static WebElement submitBtn;

	@FindBy(xpath = "//android.widget.TextView[@text='Supported']")
	static WebElement supported;

	@FindBy(xpath = "//android.widget.TextView[@text='Happy']")
	static WebElement happy;

	@FindBy(xpath = "//android.widget.TextView[@text='NEXT STEP']")
	static WebElement nextstep;

	@FindBy(xpath = "//android.widget.TextView[@text='COMPARE']")
	static WebElement compare;

	@FindBy(xpath = "//android.widget.TextView[@text='SAVE']")
	static WebElement savebtn;

	@FindBy(xpath = "//android.widget.TextView[@text='Do Again']")
	static WebElement doagain;

	@FindBy(xpath = "//android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView")
	static WebElement heading;

	@FindAll(@FindBy(xpath = "//android.widget.EditText"))
	static List<WebElement> textarea;

	@FindBy(xpath = "//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	static WebElement orangecolor;

	public void dailylearning() throws InterruptedException {
		learning.click();
		Thread.sleep(4000);
		/*
		 * List<WebElement> element =
		 * AppDriver.getDriver().findElements(By.className("android.widget.TextView"));
		 * // System.out.println(element.size()); for (int j = 0; j < element.size();
		 * j++) { if (element.get(j).getText() != null) { String SeenText =
		 * element.get(j).getText(); System.out.println(SeenText); } }
		 */
	}

	public static void RightswipeWeek2() throws InterruptedException {
		Thread.sleep(4000);

		/*
		 * Dimension size = AppDriver.getDriver().manage().window().getSize(); int
		 * startY = (int) (size.height / 2); int startX = (int) (size.width * 0.90); int
		 * endX = (int) (size.width * 0.05);
		 * 
		 * new TouchAction((PerformsTouchActions)
		 * AppDriver.getDriver()).press(PointOption.point(startX, startY))
		 * .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
		 * .moveTo(PointOption.point(endX, startY)).release().perform();
		 */

		for (int i = 1; i < 13; i++) {

			Dimension size = AppDriver.getDriver().manage().window().getSize();
			int startY = (int) (size.height / 2);
			int startX = (int) (size.width * 0.90);
			int endX = (int) (size.width * 0.05);
			new TouchAction((PerformsTouchActions) AppDriver.getDriver()).press(PointOption.point(startX, startY))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
					.moveTo(PointOption.point(endX, startY)).release().perform();
			Thread.sleep(1500);
			System.out.println(" Swiped and I value is" + i);

			List<WebElement> element = AppDriver.getDriver().findElements(By.className("android.widget.TextView"));
			/*
			 * System.out.println(element.size()); for (int j = 0; j < element.size(); j++)
			 * { if (element.get(j).getText() != null) { String SeenText =
			 * element.get(j).getText(); System.out.println(SeenText); } }
			 */

			/*
			 * if (i == 1) { try { trackreports.click(); back.click();
			 * 
			 * } catch (Exception e) { } }
			 * 
			 * 
			 * if (i == 1 && i<=3) { // ok.click(); quickassessment.click(); back2.click();
			 * //back.click(); //break; }
			 * 
			 * if (i==3) { for (int j=0;j<plusicon.size();j++) { plusicon.get(j).click();
			 * Thread.sleep(1000); greycolor.click(); if (j==3) {
			 * Scroll.scrollIntoViewn("SUBMIT"); } } Scroll.scrollIntoView("SUBMIT"); //
			 * submitBtn.click(); }
			 * 
			 * if(i==4) { Thread.sleep(3000); try { doagain.click(); } catch(Exception e) {
			 * 
			 * } supported.click(); happy.click(); // savebtn.click(); nextstep.click();
			 * supported.click(); happy.click(); compare.click(); savebtn.click(); }
			 * 
			 * 
			 * if (i == 5) {
			 * 
			 * 
			 * emotiontherom.get(0).click(); emotiontherom.get(1).click();
			 * emotiontherom.get(1).click(); Scroll.scrollIntoViewn("SAVE");
			 * 
			 * Thread.sleep(3000); emotiontherom.get(1).click();
			 * emotiontherom.get(0).click(); emotiontherom.get(0).click(); savebtn.click();
			 * 
			 * textarea.get(0).sendKeys("Testing data"); savebtn.click(); }
			 */

			if (i == 6) {
				textarea.get(0).sendKeys("Test Practical");
				plusicon.get(0).click();
				
				Scroll.scrollIntoViewn("Informational");
				Thread.sleep(1000);

				textarea.get(1).sendKeys("Test Emotional");
				plusicon.get(1).click();
				
				

				Scroll.scrollIntoViewn("SAVE");
				Thread.sleep(1000);
				textarea.get(2).sendKeys("Test Emotional");
				plusicon.get(2).click();

				Thread.sleep(1500);
				plusicon.get(2).click();

				Thread.sleep(1500);
				plusicon.get(3).click();

				Thread.sleep(1500);
				plusicon.get(4).click();

				savebtn.click();

			}

			if (i == 7) {
				textarea.get(0).sendKeys("Test Practical Support");
				plusicon.get(0).click();

				textarea.get(1).sendKeys("Test Emotional Support");
				plusicon.get(1).click();

				Scroll.scrollIntoViewn("SAVE");
				textarea.get(2).sendKeys("Test Informational Support");
				plusicon.get(2).click();

				Thread.sleep(3000);
				savebtn.click();

			}

			if (i == 8) {
				Scroll.scrollIntoViewn("SAVE");
				Thread.sleep(3000);
				savebtn.click();
			}

			if (i == 9) {
				plusicon.get(0).click();
				orangecolor.click();

				Thread.sleep(2000);

				plusicon.get(1).click();
				orangecolor.click();
				Scroll.scrollIntoViewn("SAVE");

				savebtn.click();
			}

			if (i == 10) {
				textarea.get(0).sendKeys("Partner");
				textarea.get(1).sendKeys("Relation Partner");
				plusicon.get(0).click();

				textarea.get(2).sendKeys("Midwife");
				textarea.get(3).sendKeys("Midwife Partner");
				plusicon.get(1).click();

				textarea.get(4).sendKeys("Primary Care Provider");
				textarea.get(5).sendKeys("PCP Partner");
				plusicon.get(2).click();

				textarea.get(6).sendKeys("Partner");
				textarea.get(7).sendKeys("Relation Partner");
				plusicon.get(3).click();

				textarea.get(8).sendKeys("Mental Health Provider");
				textarea.get(9).sendKeys("Mental Health Partner");
				plusicon.get(4).click();

				Scroll.scrollIntoViewn("SAVE");

				savebtn.click();

			}

			if (i == 11) {
				textarea.get(0).sendKeys("Task");
				textarea.get(1).sendKeys("Frequency");
				textarea.get(2).sendKeys("Responsible");
				plusicon.get(0).click();
				savebtn.click();
			}

			if (i == 12) {
				textarea.get(0).sendKeys("Header1");
				textarea.get(1).sendKeys("Test");

				Scroll.scrollIntoViewn("SAVE");

			}

		}
	}
}
