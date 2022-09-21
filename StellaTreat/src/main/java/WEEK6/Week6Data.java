package WEEK6;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import Utils.Scroll;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Week6Data {
	
	AndroidDriver driver;

	public Week6Data() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Resource']")
	WebElement resource;
	
	@FindBy(xpath = "//android.widget.TextView[@text='My Learnings']")
	WebElement myLearnings;
	
	
	@FindBy(xpath="//android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView")
	WebElement selectWeek;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Week 6']")
	WebElement Week6;
	
	@FindBy(xpath = "//android.widget.TextView[@text='1']")
	WebElement Day1;
	
	@FindBy(xpath = "//android.widget.TextView[@text='2']")
	WebElement Day2;
	
	@FindBy(xpath = "//android.widget.TextView[@text='3']")
	WebElement Day3;
	
	@FindBy(xpath = "//android.widget.TextView[@text='4']")
	WebElement Day4;
	
	@FindBy(xpath = "//android.widget.TextView[@text='5']")
	WebElement Day5;
	
	@FindBy(xpath = "//android.widget.TextView[@text='6']")
	WebElement Day6;
	
	@FindBy(xpath = "//android.widget.TextView[@text='7']")
	WebElement Day7;
	
	@FindBy(xpath = "//android.widget.TextView[@text='PROCEED']")
	WebElement proceed;
	public void checkDay1()
	{
		resource.click();
		myLearnings.click();
		selectWeek.click();
	//	Scoll.scrollIntoViewn()
		Scroll.scrollIntoView("Week 6");
	//	Week6.click();
		Day1.click();
		proceed.click();
		}
	
	public void checkDay2()
	{
		
		selectWeek.click();
		Scroll.scrollIntoView("Week 6");
		Day2.click();
		proceed.click();
		}
	
	public void checkDay3()
	{
		selectWeek.click();
		Scroll.scrollIntoView("Week 6");
		Day3.click();
		proceed.click();
		}
	
	public void checkDay4()
	{
		selectWeek.click();
		Scroll.scrollIntoView("Week 6");
		Day4.click();
		proceed.click();
		}
	
	public void checkDay5()
	{
		selectWeek.click();
		Scroll.scrollIntoView("Week 6");
		Day5.click();
		proceed.click();
		}
	
	public void checkDay6()
	{
		
		selectWeek.click();
		Scroll.scrollIntoView("Week 6");
		Day6.click();
		proceed.click();
		}

public void checkDay7()
{
	resource.click();
	myLearnings.click();
	selectWeek.click();

Scroll.scrollIntoView("Week 7");
	Day7.click();
	proceed.click();
	}
}

