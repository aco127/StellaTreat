package WEEK2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import Utils.Scroll;
import Utils.WriteExcel;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DLWeek2Day5 {

	AndroidDriver driver;

	public DLWeek2Day5() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement learning;

	@FindBy(xpath = "//android.widget.TextView[@text='SUBMIT']")
	static WebElement Submit;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
	static WebElement recentsituation;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
	static WebElement thoughtrecord;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	static WebElement ok;


	@FindBy(xpath="//android.widget.ImageView")
	static WebElement back;


	@FindAll(@FindBy(xpath="//android.widget.EditText"))
	static
	List<WebElement> entertext;


	@FindBy(xpath = "android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
	static WebElement thoughtjournaling;

	public void dailylearning() throws InterruptedException {
		learning.click();
		Thread.sleep(4000);
	
	}

	public static void RightswipeWeek2() throws InterruptedException {
		Thread.sleep(4000);
		for (int i = 1; i <4; i++) {
			Dimension size = AppDriver.getDriver().manage().window().getSize();
			int startY = (int) (size.height / 2);
			int startX = (int) (size.width * 0.90);
			int endX = (int) (size.width * 0.05);
			new TouchAction((PerformsTouchActions) AppDriver.getDriver()).press(PointOption.point(startX, startY))
			.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
			.moveTo(PointOption.point(endX, startY)).release().perform();
			Thread.sleep(1000);
			System.out.println(" Swiped and I value is" + i);
			List<WebElement> element = AppDriver.getDriver().findElements(By.className("android.widget.TextView"));
			System.out.println(element.size());
			int n=element.size();
			StringBuffer output = new StringBuffer();
			for (int j = 3; j < element.size(); j++)
			{
				String seenTextNew = "";
				StringBuffer text = null;
				if(element.get(j).getText() != null && ( i <=3 && j == 3)) {
					seenTextNew = element.get(3).getText();
					WriteExcel.writetosheetWeek2(seenTextNew.toString(), i, "Day5");
					break;
				}
				else if (element.get(j).getText() != null)
				{	
					seenTextNew = element.get(j).getText();
					text= output.append(seenTextNew);
					System.out.println("text in the else if:" +text );
				}
				System.out.println("J =" +j);
				String loopFinaltext = text.toString(); 

				System.out.println("n = " +n);
				if(j==(n-1))
				{
					System.out.println("ENd of loop Final text is " + loopFinaltext);
					System.out.println("Created Row is" +i); 
					WriteExcel.writetosheetWeek2(loopFinaltext, i, "Day5");
				}
			}

			if (i==1) {
				try {

					entertext.get(0).sendKeys("Testing thoughtrecord");

					Scroll.scrollIntoView("SUBMIT");
				} catch (Exception e) 
				{

				}
			}
			if (i==2)
			{
				try {
					entertext.get(0).sendKeys("Testing thoughtrecord");
					//thoughtrecord.sendKeys("Testing thoughtrecord emotions");
					Scroll.scrollIntoView("SUBMIT");

				} 
				catch (Exception e)
				{
				}
			}
			if (i==3) 
			{
				try {
					entertext.get(0).sendKeys("Testing thoughtrecord");
					//	thoughtjournaling.sendKeys("Test Thought Journaling");
					Scroll.scrollIntoView("SUBMIT");

					Thread.sleep(1500);
					back.click();
					Thread.sleep(1500);
					back.click();

					break;
				} 
				catch (Exception e) 
				{
				}
			}

		}

	}
}

