package WEEK1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WeekData {
	
//	AndroidDriver driver;

	public WeekData() {
		PageFactory.initElements(AppDriver.getDriver(), this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Resource']")
	WebElement resource;
	
	@FindBy(xpath = "//android.widget.TextView[@text='My Learnings']")
	WebElement myLearnings;
	
	
	@FindBy(xpath="//android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView")
	WebElement selectWeek;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
	WebElement Week1;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Week 2']")
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

public void checkWeek1day1()
{
	resource.click();
	myLearnings.click();
	selectWeek.click();
	Week1.click();
	Day1.click();
	proceed.click();
	}

public void checkWeek1day2()
{
	resource.click();
	myLearnings.click();
	selectWeek.click();
	Week1.click();
	Day2.click();
	proceed.click();
	}

public void checkWeek1day3()
{
	resource.click();
	myLearnings.click();
	selectWeek.click();
	Week1.click();
	Day3.click();
	proceed.click();
	}
public void checkWeek1day4()
{
	resource.click();
	myLearnings.click();
	selectWeek.click();
	Week1.click();
	Day4.click();
	proceed.click();
	}
public void checkWeek1day5()
{
	resource.click();
	myLearnings.click();
	selectWeek.click();
	Week1.click();
	Day5.click();
	proceed.click();
	}
public void checkWeek1day6()
{
	resource.click();
	myLearnings.click();
	selectWeek.click();
	Week1.click();
	Day6.click();
	proceed.click();
	}
public void checkWeek1day7()
{
	resource.click();
	myLearnings.click();
	selectWeek.click();
	Week1.click();
	Day7.click();
	proceed.click();
	}

}

