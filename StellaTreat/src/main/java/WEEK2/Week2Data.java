package WEEK2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Week2Data {
	
	AndroidDriver driver;

	public Week2Data() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Resource']")
	WebElement resource;
	
	@FindBy(xpath = "//android.widget.TextView[@text='My Learnings']")
	WebElement myLearnings;
	
	
	@FindBy(xpath="//android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView")
	WebElement selectWeek;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Week 1']")
	WebElement Week1;
	
	@FindBy(xpath = "//*[contains(@text,'Week 2')]")
	WebElement Week2;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Week 3']")
	WebElement Week3;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Week 4']")
	WebElement Week4;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Week 5']")
	WebElement Week5;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Week 6']")
	WebElement Week6;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Week 7']")
	WebElement Week7;
	
	
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

public void checkWeek2day1()
{
	resource.click();
	myLearnings.click();
	selectWeek.click();
	Week2.click();
	Day1.click();
	proceed.click();
	}

public void checkWeek2day2()
{
	resource.click();
	myLearnings.click();
	selectWeek.click();
	Week2.click();
	Day2.click();
	proceed.click();
	}

public void checkWeek2day3()
{
	resource.click();
	myLearnings.click();
	selectWeek.click();
	Week2.click();
	Day3.click();
	proceed.click();
	}
public void checkWeek2day4()
{
	resource.click();
	myLearnings.click();
	selectWeek.click();
	Week2.click();
	Day4.click();
	proceed.click();
	}
public void checkWeek2day5()
{
	resource.click();
	myLearnings.click();
	selectWeek.click();
	Week2.click();
	Day5.click();
	proceed.click();
	}
public void checkWeek2day6()
{
	resource.click();
	myLearnings.click();
	selectWeek.click();
	Week2.click();
	Day6.click();
	proceed.click();
	}
public void checkWeek2day7() throws InterruptedException
{
	resource.click();
	myLearnings.click();
	selectWeek.click();
	Thread.sleep(1000);
	Week2.click();
	Thread.sleep(500);
	Day7.click();
	proceed.click();
	}

}

