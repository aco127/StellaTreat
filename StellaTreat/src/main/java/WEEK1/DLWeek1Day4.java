package WEEK1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;

import Resources.AppDriver;
import Utils.Scroll;
import Utils.WriteExcel;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DLWeek1Day4 {
	AndroidDriver driver;
	FileOutputStream outstream;
	static XSSFWorkbook workbook;
	static Sheet sheet;
	 static String seenTextNew;
	 static int j;
	public DLWeek1Day4() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement learning;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	static WebElement ok;

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView")
	static WebElement back;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	static WebElement situation;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")
	private static WebElement mood;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[3]")
	private static WebElement Behaviour;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")
	static WebElement worry;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")
	static WebElement petname;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[3]")
	static WebElement refocus;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")
	static WebElement worryto;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[1]")
	static WebElement AllowOverthinking;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[1]")
	static WebElement Relabel;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView[1]")
	static WebElement Reattribute;

	@FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.TextView[1]")
	static WebElement Refocus;

	@FindBy(xpath = "//android.widget.TextView[@text='SUBMIT']")
	static WebElement Submit;

	@FindBy(xpath = "//android.widget.TextView[@text='All of the above']")
	static WebElement goal;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	static WebElement OK;
	HashMap<String, String>testDetail =new HashMap<String, String>();
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

	public static void RightswipeWeek1Day4() throws InterruptedException {
		Thread.sleep(4000);
		for (int i = 1; i <= 11; i++) {
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
				  seenTextNew = "";
			  }
			  StringBuffer text = null; 
			  if(element.get(j).getText() != null && ( i ==1 && j  == 3 ||i==2|| i==8 || i==9 || i==10|| i==12 )) 
			  { 
				  seenTextNew =element.get(3).getText(); 
				  WriteExcel.writetosheetWeek1(seenTextNew.toString(),
			  i, "Day4"); 
				  System.out.println(seenTextNew); break; } else if
			  (element.get(j).getText() != null) { seenTextNew = element.get(j).getText();
			  text= output.append(seenTextNew); //
			  System.out.println("text in the else if:" +text ); } //
			  System.out.println("J =" +j); String loopFinaltext = text.toString();
			  
			  System.out.println("n = " +n); if(j==(n-1)) { //
			  System.out.println("ENd of loop Final text is " + loopFinaltext); //
			  System.out.println("Created Row is" +i); //
			  WriteExcel.writetosheetWeek1(loopFinaltext, i, "Day4");
			  
			  
			  } 
			 

			if (i >= 1 && i <= 2)

			{
				try {
					situation.sendKeys("Testing Situation");
					mood.sendKeys("Testing Mood");
					Behaviour.sendKeys("Testing Behaviour");
					Scroll.scrollIntoView("SUBMIT");

				} catch (Exception e) {
					// e.printStackTrace();
				}
			}

			if (i >= 8 && i <= 9) {
				try {
					worry.sendKeys("Testing Worry");
					petname.sendKeys("Testing Petname");
					Reattribute.sendKeys("Testing Attribute");
					Scroll.scrollIntoViewn("re-focus");
					Refocus.sendKeys("Testing Refocus");
					Scroll.scrollIntoView("SUBMIT");

				} catch (Exception e) {

					// e.printStackTrace();
				}
			}
			if (i >= 10 && i <= 12) {
				try {
					AllowOverthinking.click();
					Relabel.click();
					Reattribute.click();
					Refocus.click();
					// OK.click();
					back.click();
					break;
				} catch (Exception e) {
					// e.printStackTrace();
				}
			}
		}
	}
}
