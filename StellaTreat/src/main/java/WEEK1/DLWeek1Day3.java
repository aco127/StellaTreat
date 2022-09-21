package WEEK1;

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
import Utils.XLSReader;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DLWeek1Day3 {
	AndroidDriver driver;

	public DLWeek1Day3() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement learning;

	@FindBy(xpath = "//android.widget.TextView[@text='Perceive when your infant is worn out']")
	static WebElement percieve;

	@FindBy(xpath = "//android.widget.TextView[@text='Identify the ideal opportunity to settle your infant']")
	static WebElement Identity;

	@FindBy(xpath = "//android.widget.TextView[@text='Figure out how to settle your infant: Repetitive Motion']")
	static WebElement Motion;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	static WebElement ok;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")
	static WebElement back;

	
	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	static WebElement OK;

	public void dailylearning() throws InterruptedException {
		learning.click();
		Thread.sleep(4000);
		
	}

	public static void RightswipeWeek1Day3() throws InterruptedException {
		Thread.sleep(4000);
		for (int i = 1; i <12; i++) {
			Dimension size = AppDriver.getDriver().manage().window().getSize();
			System.out.println(size.height);
			System.out.println(size.width);
			
			
			
			int startY = (int) (size.height / 4);
			System.out.println("StartY" +startY);
			int startX = (int) (size.width * 0.5);
			System.out.println("Startx" +startX);
			int endX = (int) (size.width * 0.005);
			
			System.out.println("endX" +endX);
			
			
			Thread.sleep(1000);
			
			new TouchAction((PerformsTouchActions) AppDriver.getDriver()).press(PointOption.point(startX, startY))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
					.moveTo(PointOption.point(endX, startY)).release().perform();
			
			Thread.sleep(2000);
			System.out.println(" Swiped and I value is" + i);
			
			List<WebElement> element = AppDriver.getDriver().findElements(By.className("android.widget.TextView"));
			System.out.println(element.size());
			int n=element.size();
			StringBuffer output = new StringBuffer();
			for (int j = 3; j < element.size(); j++)
			{
				String seenTextNew = "";
				StringBuffer text = null;
				if(element.get(j).getText() != null && (i<3 && j == 3)) {
		seenTextNew = element.get(3).getText();
					WriteExcel.writetosheetWeek1(seenTextNew.toString(), i, "Day3");
					break;
				}
				else if (element.get(j).getText() != null)
				{	
					seenTextNew = element.get(j).getText();
					  text= output.append(seenTextNew);
			//	  System.out.println("text in the else if:" +text );
				}
			//		  System.out.println("J =" +j);
				  String loopFinaltext = text.toString(); 
				
//					  System.out.println("n = " +n);
					  if(j==(n-1))
					  {
						 //  System.out.println("ENd of loop Final text is " + loopFinaltext);
	//					  System.out.println("Created Row is" +i); 
						  WriteExcel.writetosheetWeek1(loopFinaltext, i, "Day3");
					  }
				}

			
			 /* List<WebElement> element =
			  AppDriver.getDriver().findElements(By.className("android.widget.TextView"));
			  System.out.println(element.size()); 
			  for (int j = 0; j < element.size(); j++) { 
				  if (element.get(j).getText() != null) { 
					  String SeenText = element.get(j).getText(); 
			 System.out.println(SeenText);
			 
					
							 
			  }*/
			// }
			 
if(i>=5&& i<=8)
{
	
	System.out.println("press keydown" +i);
	
}
			
			
			if (i == 11)

			{
				try{
					percieve.click();
				Thread.sleep(2000);
					back.click();
					Identity.click();
					Thread.sleep(3000);
					back.click();
					Motion.click();
					Thread.sleep(3000);
					back.click();
					break;
				}
				catch(Exception e)
				{
					
				}
			}
		}
	}
		
}
