package WEEK1;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import Utils.Scroll;
import Utils.Swipe;
import Utils.WriteExcel;
import bsh.util.Util;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DLWeek1Day1 {
	
	AndroidDriver driver;

	public DLWeek1Day1() {
		 PageFactory.initElements(AppDriver.getDriver(), this);
	}
	
	@FindBy(xpath="//android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement learning;
	
@FindBy(xpath="//android.widget.TextView[@text='Reese Witherspoon']")	
WebElement celeb;
@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
static WebElement recentsituation;
@FindBy(xpath = "//android.widget.TextView[@text='SUBMIT']")
static WebElement Submit;

@FindAll(@FindBy(xpath="//android.widget.TextView"))
static List<WebElement> cardtext;

@FindBy(xpath="//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.TextView")
//android.widget.FrameLayout/android.widget.TextView

static WebElement cardno;

@FindBy(id="android:id/button1")
static
WebElement okbtn;

@FindAll(@FindBy(xpath="//android.widget.ImageView"))
static List<WebElement> radiobtn;

@FindAll(@FindBy(xpath="//android.widget.EditText"))
static List<WebElement> Textarea;



int x=0;
	int y=1161;
			
	
	public void checktodayslearning() throws InterruptedException, IOException
	{
		learning.click();
		Thread.sleep(4000);
		//Swipe.check();
	}
		
//Swipe.Rightswipe();
public static void RightswipeWeek1() throws InterruptedException
{
	for (int i = 1; i <20; i++) {
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
		//System.out.println(element.size());
		int n=element.size();
		StringBuffer output = new StringBuffer();
		for (int j = 3; j < element.size(); j++)
		{
			String seenTextNew = "";
			StringBuffer text = null;
			if(element.get(j).getText() != null && ( i==3&& j == 3 || i>=19 ||i==1 ||i==3)) {
				seenTextNew = element.get(3).getText();
		//		WriteExcel.writetosheet(seenTextNew.toString(), i, "Day1");
				//System.out.println(i+seenTextNew);
				break;
			}
			else if (element.get(j).getText() != null)
			{	
				seenTextNew = element.get(j).getText();
				  text= output.append(seenTextNew);
				//  System.out.println("text in the else if:" +text );
			}
				//  System.out.println("J =" +j);
				  String loopFinaltext = text.toString(); 
			
				//  System.out.println("n = " +n);
				  if(j==(n-1))
				  {
//					   System.out.println("ENd of loop Final text is " + loopFinaltext);
	//				  System.out.println("Created Row is" +i); 
//					  WriteExcel.writetosheet(loopFinaltext, i, "Day1");
				  }
			}
	
		if (i==19 && i==21) {
			try {

				recentsituation.sendKeys("Testing recentsituations");
				Scroll.scrollIntoView("SUBMIT");
			} catch (Exception e) 
			{

			}
	
	
	}
	}
}


public static void swipe() throws InterruptedException
{
	Thread.sleep(1000);
	Dimension size = AppDriver.getDriver().manage().window().getSize();
	int startY = (int) (size.height / 2);
	int startX = (int) (size.width * 0.90);
	int endX = (int) (size.width * 0.05);
	
	for (int i =2; i < 20; i++) 
	{
	//	Thread.sleep(500);
	
		String oldcardno=cardno.getText();
		System.out.println(oldcardno);
		
		new TouchAction((PerformsTouchActions) AppDriver.getDriver()).press(PointOption.point(startX, startY))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
				.moveTo(PointOption.point(endX, startY)).release().perform();
	//	Thread.sleep(200);
		
				String currentcardno=  cardno.getText();

		
		System.out.println("Current cardNumber"+currentcardno);
		
		if(oldcardno.contentEquals(currentcardno))
			
			{
		i--;
		System.out.println(i);
		}
		else {
			System.out.println(" Swiped and I value is" + i);
			
		}
		
		if(i==17)
		{
			try {
				Textarea.get(0).sendKeys("Test Friend");
				Textarea.get(1).sendKeys("Test Family Member");
				Textarea.get(2).sendKeys("Test Caregiver");
				Submit.click();		
		}

			catch(Exception e) {
				
			}
	}
		
		if (i==18)
		{
			Textarea.get(0).sendKeys("Testing our Thoughst");
			Submit.click();
		}
}
}
}