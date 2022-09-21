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
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DLWeek1Day2 {
	AndroidDriver driver;

	public DLWeek1Day2() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement learning;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	static WebElement ok;

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView")
	static WebElement back;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	static WebElement struggles;

	@FindBy(xpath = "//android.widget.TextView[@text='SUBMIT']")
	static WebElement Submit;
	
	@FindBy(xpath="//android.widget.TextView[@text='All of the above']")
	static
	WebElement goal;
	
	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	static WebElement OK;
	
	public void dailylearning() throws InterruptedException {
		learning.click();
		Thread.sleep(4000);
	
	}

	public static void RightswipeWeek1Day2() throws InterruptedException {
		Thread.sleep(4000);
		for (int i = 1; i < 16; i++) {
			Dimension size = AppDriver.getDriver().manage().window().getSize();
			int startY = (int) (size.height / 2);
			int startX = (int) (size.width * 0.90);
			int endX = (int) (size.width * 0.05);
			new TouchAction((PerformsTouchActions) AppDriver.getDriver()).press(PointOption.point(startX, startY))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
					.moveTo(PointOption.point(endX, startY)).release().perform();
			Thread.sleep(1500);
			System.out.println(" Swiped and I value is  " +( i+1));
			
			List<WebElement> element = AppDriver.getDriver().findElements(By.className("android.widget.TextView"));
			System.out.println(element.size());
			int n=element.size();
			StringBuffer output = new StringBuffer();
			for (int j = 3; j < element.size(); j++)
			{
				String seenTextNew = "";
				StringBuffer text = null;
				if(element.get(j).getText() != null && ( i ==1 && j == 3 ||i==3|| i==6 || i==7 || i==9 || i==10|| i==11 || i>=13 )) {
					seenTextNew = element.get(3).getText();
					WriteExcel.writetosheetWeek2(seenTextNew.toString(), i, "Day2");
					System.out.println(seenTextNew);
					break;
				}
				else if (element.get(j).getText() != null)
				{	
					seenTextNew = element.get(j).getText();
			  text= output.append(seenTextNew);
					 // System.out.println("text in the else if:" +text );
				}
			//		  System.out.println("J =" +j);
				String loopFinaltext = text.toString(); 
				
				//	  System.out.println("n = " +n);
					  if(j==(n-1))
					  {
	//					   System.out.println("ENd of loop Final text is " + loopFinaltext);
						 // System.out.println("Created Row is" +i); 
						  WriteExcel.writetosheetWeek2(loopFinaltext, i, "Day2");
							 
							  
					  }
				}

			/*
			 * List<WebElement> element =
			 * AppDriver.getDriver().findElements(By.className("android.widget.TextView"));
			 * // System.out.println(element.size()); for (int j = 0; j < element.size();
			 * j++) { if (element.get(j).getText() != null) { String SeenText =
			 * element.get(j).getText(); System.out.println(SeenText); } }
			 */
	if (i == 6)
			
			{
				try {
					struggles.sendKeys("Testing Struggles");
			
					Scroll.scrollIntoView("SUBMIT");
					
				} catch (Exception e) {
					//e.printStackTrace();
				}
			}
			
			if(i==7)
			{ try 
			{ 
			//	ok.click();
					goal.click();				
			}
			catch(Exception e)
			{
				
			//	e.printStackTrace();
			}
			}
		/*	if (i>=13 && i<=16)
			{try
			{
				OK.click();
				back.click();
				break;
			}
			catch(Exception e)
			{
				//e.printStackTrace();
			}*/
		}
	}
}

