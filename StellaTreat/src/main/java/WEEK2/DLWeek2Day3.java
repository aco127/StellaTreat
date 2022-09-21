package WEEK2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
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

public class DLWeek2Day3 {

	AndroidDriver driver;

	public DLWeek2Day3() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement learning;

	@FindBy(xpath = "//android.widget.TextView[@text='SUBMIT']")
	static WebElement Submit;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	static WebElement extremethoughts;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")
	static WebElement healthyconcerns;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	static WebElement ok;

	@FindBy(xpath="//android.widget.ImageView")
	static WebElement back;

	@FindBy(xpath = "//android.widget.TextView[@text='All or Nothing Thinking']")
	static WebElement Nothing;

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
		for (int i = 1; i <11; i++) {
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
			//System.out.println(element.size());
			int n=element.size();
			StringBuffer output = new StringBuffer();
			
			for (int j = 3; j < element.size(); j++)
			{
				if (element.get(j).getText() != null)
				{
					String SeenText = element.get(j).getText();
				//	System.out.println(SeenText);
					
					
					String Seentextnew = element.get(j).getText();
					  StringBuffer text= output.append(Seentextnew);
				
				//	  System.out.println("J =" +j);
					  String loopFinaltext = text.toString(); 
				
				//	  System.out.println("n = " +n);
					  if(j==(n-1))
					  {
						   System.out.println("ENd of loop Final text is " + loopFinaltext);
						//  System.out.println("Created Row is" +i); 
						  WriteExcel.writetosheetWeek2(loopFinaltext, i, "Day3");
							 
							  
					  }
				}
			}
			

			if (i==10) 
			{
				try {
					Nothing.click();
					Scroll.scrollIntoView("SUBMIT");
					back.click();
					Thread.sleep(1000);
					back.click();
					break;
				} catch (Exception e) {

				}
				}

			}
		}
	}
