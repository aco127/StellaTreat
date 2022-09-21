package WEEK3;

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

public class DailyLearningWeek3Day3 {
	AndroidDriver driver;

	public DailyLearningWeek3Day3() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement learningweek3;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	static WebElement ok;

	@FindBy(xpath="//android.widget.ImageView")
	static WebElement back;
	
	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
	static WebElement EditText;

	@FindBy(xpath = "//android.widget.TextView[@text='SUBMIT']")
	static WebElement Submit;

	@FindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")
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
	
	public void dailylearning() throws InterruptedException {
		learningweek3.click();
		Thread.sleep(4000);
		/*
		 * List<WebElement> element =
		 * AppDriver.getDriver().findElements(By.className("android.widget.TextView"));
		 * // System.out.println(element.size()); for (int j = 0; j < element.size();
		 * j++) { if (element.get(j).getText() != null) { String SeenText =
		 * element.get(j).getText(); System.out.println(SeenText); } }
		 */
	}

	public static void RightswipeWeek3() throws InterruptedException {
		Thread.sleep(4000);
		for (int i = 1; i <11; i++) {
			Dimension size = AppDriver.getDriver().manage().window().getSize();
			int startY = (int) (size.height / 1.5);			
			int startX = (int) (size.width * 0.90);
			int endX = (int) (size.width * 0.05);
			int endx=177;
			
	new TouchAction((PerformsTouchActions) AppDriver.getDriver()).press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(endx, startY)).release().perform();
	
	Thread.sleep(1000);
			System.out.println(" Swiped and I value is" + i);

			List<WebElement> element = AppDriver.getDriver().findElements(By.className("android.widget.TextView"));
			System.out.println(element.size());
			int n=element.size();
			
			StringBuffer output = new StringBuffer();
			for (int j = 3; j <n; j++)
			{
				String seenTextNew = "";
				StringBuffer text = null;
				if(element.get(j).getText() != null && (i ==5 || i==7 || i==9 )) {
					seenTextNew = element.get(3).getText();
					WriteExcel.writetosheetWeek3(seenTextNew.toString(), i, "Day3");
					break;
				}
				else if (element.get(j).getText() != null)
				{	
					seenTextNew = element.get(j).getText();
					  text= output.append(seenTextNew);
//					  System.out.println("text in the else if:" +text );
				}
//					  System.out.println("J =" +j);
					  String loopFinaltext = text.toString(); 
				
	//				  System.out.println("n = " +n);
					  if(j==(n-1))
					  {
						   System.out.println("ENd of loop Final text is " + loopFinaltext);
						  System.out.println("Created Row is" +i); 
						  WriteExcel.writetosheetWeek3(loopFinaltext, i, "Day3");
					  }
				}

			if (i==5) 
			{
				try {
					EditText.sendKeys("Testing Thinking Style");
					Submit.click();
				} catch (Exception e)
				{
				}
			}
			
			if(i==7)
			{
				try {
					EditText.sendKeys("Testing Thinking Style");
					Submit.click();
				}
				catch(Exception e)
				{
				}
			}
			if(i==9)
			{
				try {
					activitiesdone.click();
					Savebtn.click();
					ok.click();
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

			if(i==10)
			{
				back.click();
				Thread.sleep(1500);
				back.click();
				
			break;
			}
		}
}
}