package WEEK3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import Utils.WriteExcel;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DailyLearningWeek3Day1 {
	AndroidDriver driver;

	public DailyLearningWeek3Day1() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement learningweek2;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	static WebElement ok;

	@FindBy(xpath="//android.widget.ImageView")
	static WebElement back;

	public void dailylearning() throws InterruptedException {
		learningweek2.click();
		Thread.sleep(4000);
	
	}

	public static void RightswipeWeek3() throws InterruptedException {
		Thread.sleep(4000);
		for (int i = 1; i < 22; i++) {
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
					WriteExcel.writetosheetWeek3(seenTextNew.toString(), i, "Day1");
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
						  WriteExcel.writetosheetWeek3(loopFinaltext, i, "Day1");
					  }
				
			}

			if (i == 21) 
			{
				try {
					Thread.sleep(1500);
					back.click();
					Thread.sleep(1500);
					back.click();
				} 
				catch (Exception e) 
				{
				}
			}
		}
	}

}
