package PageObjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Resources.AppDriver;
import Resources.Base;
import Utils.DateUtils;
import Utils.MobileActions;
import Utils.Scroll;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Activity {

	AndroidDriver driver;

	public Activity() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);

	}

	@FindBy(xpath = "//android.widget.TextView[@text='SAVE']")
	private WebElement save;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	WebElement ok;

	@FindBy(xpath = "//android.widget.TextView[@text='+']")
	WebElement addactivity;

	@FindBy(xpath = "//android.widget.EditText[@text='Search activity by name (ex: Sport)']")
	WebElement searchactivity;

	@FindBy(xpath = "//android.widget.TextView[@text='Daydream']")
	WebElement Dayactivityday;

	@FindBy(xpath = "//android.widget.TextView[@text='SAVE']")
	WebElement saveact;

	@FindBy(xpath = "//android.widget.TextView[@text='Yoga']")
	WebElement yoga;

	@FindBy(xpath = "//android.widget.TextView[@text='Walk']")
	WebElement walk;

	@FindBy(xpath = "//android.widget.TextView[@text='Movies & tv']")
	WebElement Movietv;

	@FindBy(xpath = "//android.widget.TextView[@text='Daily Activities']")
	WebElement DailyActivities;

	@FindBy(xpath = "//android.widget.TextView[@text='Showering/Bathing']")
	WebElement ShoweringBathing;

	@FindBy(xpath = "//android.widget.TextView[@text='Getting dressed']")
	WebElement Gettingdressed;

	@FindBy(xpath = "//android.widget.TextView[@text='SAVE']")
	WebElement SAVEall;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	WebElement Points;

	@FindBy(xpath = "//android.widget.TextView[@text='What activities have you done?']")
	WebElement activity;

	@FindBy(xpath = "//android.widget.TextView[@text='Resource']")
	WebElement resource;

	@FindBy(xpath = "//android.widget.TextView[@text='Report']")
	WebElement report;

	@FindBy(xpath = "//android.widget.TextView[@text='Weekly Activity Report']")
	AndroidElement WeeklyActivityReport;
	
	@FindBy(xpath="//android.widget.TextView[@text='Home']")
	AndroidElement Home;
	
	public void checkactivitysavepopup() throws InterruptedException {
		save.click();
		Thread.sleep(1000);
		ok.click();
	}

	public void addpleasantactivity() throws InterruptedException

	{
		addactivity.click();
		searchactivity.sendKeys("Day");
		Dayactivityday.click();
		saveact.click();

	}

	public void adddailyactivity() throws InterruptedException {
//		activity.click();
		yoga.click();
		walk.click();
		Movietv.click();
		// Thread.sleep(2000);
		DailyActivities.click();
		ShoweringBathing.click();
		Gettingdressed.click();
		SAVEall.click();

	}
	
	
	
	public void verifyactivityonresourcereport() {
		resource.click();
		report.click();
		Scroll.scrollIntoView("Weekly Activity Report");
		
		Scroll.presskeydown();
		
		Scroll.Takess();
		AppDriver.getDriver().navigate().back();
		Home.click();
	
}
}