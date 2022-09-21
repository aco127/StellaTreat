package WEEK2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageObjects.Back;
import Resources.AppDriver;

import Utils.WriteExcel;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DLWeek2Day1 {

	AndroidDriver driver;

	public DLWeek2Day1() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView")
	WebElement learning;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
	static
	WebElement Automaticthoughts;

	@FindBy(xpath = "//android.widget.TextView[@text='SUBMIT']")
	static WebElement Submit;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	static WebElement Situation;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")
	static WebElement Feeling;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	static WebElement runningsituation;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")
	static WebElement picture;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	static WebElement memory;

	@FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")
	static WebElement memoryaffected;

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement learningweek2;
	
	@FindAll(@FindBy(xpath="//android.widget.EditText"))
	static
	List<WebElement> entertext;
	
	@FindBy(xpath="//android.widget.Button[@text='OK']")
	static
	WebElement ok;
	
@FindBy(xpath="//android.widget.TextView[@text='Week 2 Day 2']")
static
WebElement cardtext;
	
	@FindBy(xpath="//android.widget.ImageView")
	static WebElement back;
	
	
	static StringBuffer output = new StringBuffer(110);
	//static StringBuffer text;
	static String filePath = "C:\\Users\\shilp\\eclipse-workspace\\Appium\\src\\main\\java\\TestData\\Testdata3.xlsx";
	static String Sheetname="ContentCardwk2";
	public void dailylearning() throws InterruptedException {
		learningweek2.click();
		Thread.sleep(6000);
		/*
		 * List<WebElement> element =
		 * AppDriver.getDriver().findElements(By.className("android.widget.TextView"));
		 * System.out.println(element.size()); for (int j = 0; j < element.size(); j++)
		 * { if (element.get(j).getText() != null) { String SeenText =
		 * element.get(j).getText(); System.out.println(SeenText); } }
		 */
	}
/*perform swipe*/
	public static void RightswipeWeek2() throws InterruptedException {
		Thread.sleep(4000);
		for (int i = 1; i < 8; i++) {
			Dimension size = AppDriver.getDriver().manage().window().getSize();
			int startY = (int) (size.height / 1.2);
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
				if(element.get(j).getText() != null && ( i ==3|| j == 3 || i>=5)) {
					seenTextNew = element.get(3).getText();
					WriteExcel.writetosheetWeek2(seenTextNew.toString(), i, "Day1");
					break;
				}
				else if (element.get(j).getText() != null)
				{	
					seenTextNew = element.get(j).getText();
					  text= output.append(seenTextNew);
					 // System.out.println("text in the else if:" +text );
				}
					  System.out.println("J =" +j);
					  String loopFinaltext = text.toString(); 
				
					  System.out.println("n = " +n);
					  if(j==(n-1))
					  {
						   //System.out.println("ENd of loop Final text is " + loopFinaltext);
						  System.out.println("Created Row is" +i); 
						  WriteExcel.writetosheetWeek2(loopFinaltext, i, "Day1");
					  }
				}

			if (i == 3)
			{
				try {
					entertext.get(0).sendKeys("Testing Automatic Thoughts");
			
				Submit.click();
				}catch(Exception e)
				{
					
				}
			}
			if (i == 5) {
				try {
					entertext.get(0).sendKeys("Testing Situation");
					entertext.get(1).sendKeys("Testing Feeling");
				
				Submit.click();
				}
				catch(Exception e)
				{
					
				}
			
			}
			if (i == 6) {
				try {
					entertext.get(0).sendKeys("Testing running situation");
					entertext.get(1).sendKeys("Testing Picture");
					
				Submit.click();
			}
				catch(Exception e)
				{
				}
				}
			if (i == 7) {
				try {
					entertext.get(0).sendKeys("Testing Memory");
					entertext.get(1).sendKeys("Testing Memory Affected");
					
					
				Submit.click();
				Thread.sleep(1500);
				back.click();
				Thread.sleep(1500);
				back.click();
				
				
				//back.click();
				}
				catch(Exception e)
				{
				}
				}
				/*
				 * if(i>7) { try { if( cardtext.getText()=="Week 2 Day 2") {
				 * System.out.println("Week 2 day1 completed"); Back.goback(); break; } } catch
				 * (InterruptedException e) { // TODO Auto-generated catch block
				 * //e.printStackTrace(); }
				 * 
				 * }
				 */
		}

	}}
