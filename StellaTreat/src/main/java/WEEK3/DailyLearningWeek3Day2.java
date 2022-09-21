package WEEK3;

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

public class DailyLearningWeek3Day2 {
	AndroidDriver driver;

	public DailyLearningWeek3Day2() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	//pixel5- Android 10
	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement learningweek2;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	static WebElement ok;

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView")
	static WebElement back;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
	static WebElement Antidotes;

	@FindBy(xpath = "//android.widget.TextView[@text='SUBMIT']")
	static WebElement Submit;

	@FindAll(@FindBy(xpath="//android.widget.TextView[@text='YES']"))
	static List<WebElement> yes;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
	static WebElement activity;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]")
	static WebElement activity2;
	
	@FindAll(@FindBy(xpath="//android.widget.EditText"))
	static
	List<WebElement> entertext;

	public void dailylearning() throws InterruptedException {
		learningweek2.click();
		Thread.sleep(4000);
		
	}

	public static void RightswipeWeek3() throws InterruptedException {
		Thread.sleep(4000);
		for (int i = 1; i < 19; i++) {
			Dimension size = AppDriver.getDriver().manage().window().getSize();
			
			int startY = (int) (size.height /1.5);
			
			
			  int staticstartx=865; int staticstarty=483; 
			  int endx=177;
			 
			
			  int startX = (int) (size.width * 0.90); 
			//  int endX = (int) (size.width * 0.30);
			 
		
			
			/*
			 * System.out.println("StartX"+startX); System.out.println("StartY"+startY);
			 * System.out.println("endX"+endX);
			 */
            
            
            new TouchAction((PerformsTouchActions)
      			  AppDriver.getDriver()).press(PointOption.point(startX, startY))
      			  .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
      			  .moveTo(PointOption.point(endx, startY)).release().perform();
            
					/*
					 * new TouchAction((PerformsTouchActions)
					 * AppDriver.getDriver()).press(PointOption.point(startX, startY))
					 * .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
					 * .moveTo(PointOption.point(endX, startY)).release().perform();
					 */
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
					if(element.get(j).getText() != null && (i ==9 || i==10 || i==12 || i==13 || i==14 || i==16)) {
						seenTextNew = element.get(3).getText();
						WriteExcel.writetosheetWeek3(seenTextNew.toString(), i, "Day2");
						break;
					}
					else if (element.get(j).getText() != null)
					{	
						seenTextNew = element.get(j).getText();
						  text= output.append(seenTextNew);
//						  System.out.println("text in the else if:" +text );
					}
	//					  System.out.println("J =" +j);
						  String loopFinaltext = text.toString(); 
					
		//				  System.out.println("n = " +n);
						  if(j==(n-1))
						  {
							   System.out.println("ENd of loop Final text is " + loopFinaltext);
							  System.out.println("Created Row is" +i); 
							  WriteExcel.writetosheetWeek3(loopFinaltext, i, "Day2");
						  }
					}

			if (i >= 10 && i <= 14) {
				try {
					Antidotes.sendKeys("Testing Antidotes one");
				} catch (Exception e) {
				}
			}

			if (i==14) {
				try {
					yes.get(0).click();
					yes.get(1).click();
					Thread.sleep(3000);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
			if (i == 16 && i <= 22) {
				try {
					entertext.get(0).sendKeys("Testing Thoughts");
					ok.click();
				}
				catch(Exception e)
				{
					
				}
					try {
					//Antidotes.sendKeys("Testing final thoughts one");
					Submit.click();
					activity2.click();
					Scroll.scrollIntoView("SUBMIT");
					Antidotes.sendKeys("Testing final thoughts one");
					Submit.click();
					Thread.sleep(1500);
					back.click();
					Thread.sleep(1500);
					back.click();
					
					
					break;
	
				} catch (Exception e) {
				}

				
			} 
		}
	}
}
