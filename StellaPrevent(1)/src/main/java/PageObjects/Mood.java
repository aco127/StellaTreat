package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Mood {
	
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public Mood(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		/*
		 * this.driver = driver; this.wait = new WebDriverWait(driver, 10);
		 */
	}

	@FindBy(xpath = "//p[normalize-space()='What is your mood today?']")
	WebElement Moodtoday;
	
	@FindBy(xpath="//p[normalize-space()='Awesome']//preceding::img[1]")
	WebElement Awesome;
	
	@FindBy(xpath="//p[normalize-space()='Good']//preceding::img[1]")
	WebElement Good;

	
	@FindBy(xpath="//p[normalize-space()='Ok']//preceding::img[1]")
	WebElement ok;
	
	@FindBy(xpath="//p[normalize-space()='Bad']//preceding::img[1]")
	WebElement Bad;
	
	@FindBy(xpath="//p[normalize-space()='Terrible']//preceding::img[1]")
	WebElement Terrible;
	
	@FindBy(xpath="//button[@class='btn-solid']")
	WebElement Savebtn;
	
	@FindBy(xpath="//div[@class='css-901oao r-1awozwy r-1sdtav4 r-dowuc2']")
	WebElement backbtn;
	
	@FindBy(xpath="//div[contains(text(),'Back to Dashboard')]")
	WebElement BAcktodash;
	
	@FindBy(xpath="//p[contains(text(),' What is your mood today?')]")
	WebElement MoodTracker;

	@FindBy(xpath="//div[@id='swal2-html-container']")
	WebElement GettextofSuccess;
	
	@FindBy(xpath="//span[contains(text(),'Dashboard')]")
	WebElement Dashboard;
	
	@FindBy(xpath="//input[@placeholder='Search by patient name']")
     WebElement SearchName;
	
	@FindBy(xpath="//h3[contains(text(),'Sleep Data')]")
	WebElement SleepData;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement Okbutton;
	
	@FindBy(xpath="//p[normalize-space()='Reports']")
	WebElement Reports;
	
	@FindAll(@FindBy(xpath="//div[@class='css-1dbjc4n']/div/img"))
	List <WebElement> moodonReports;
	@FindBy(xpath="//div[contains(text(),'Back to Dashboard')]")
	WebElement backtodashboard;

@FindBy(xpath="//div[@dir='auto' and text()='Weekly Mood Report']")
	WebElement moodReportstraverse;

@FindAll(@FindBy(xpath="//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73 r-1i6wzkk r-lrvibr']/img"))
List <WebElement> mood;

@FindBy(xpath="//mat-panel-title[contains(text(),'Mood')]")
WebElement moodtab;

	public String saveMood1() throws InterruptedException
	{
		Thread.sleep(10000);
		MoodTracker.click();
		Thread.sleep(2000);
		ok.click();
	//Good.click();
		//Awesome.click();
		String moodReactnativesrc=mood.get(1).getCssValue("src");
		
		Thread.sleep(2000);
		Savebtn.click();
		Thread.sleep(4000);
		try {
			System.out.println(GettextofSuccess.getText());
			SoftAssert as = new SoftAssert();
			as.assertEquals(GettextofSuccess.getText(), "Thank you for sharing how you’re feeling today. Your mood has been saved.");
			as.assertAll();
			Okbutton.click();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}		
			/*
			 * try { backtodashboard.click(); } catch(Exception e) { e.printStackTrace(); }
			 */
		//Thread.sleep(2000);
		
		return moodReactnativesrc;
	}
	
	
	public String reactnativeReport() throws InterruptedException
	{
		Thread.sleep(8000);
		Reports.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moodReportstraverse);
		Thread.sleep(4000); 
String moodReportsrc= moodonReports.get(1).getCssValue("src");
Thread.sleep(2000);
backtodashboard.click();
return  moodReportsrc;
		
	}
	
	public void saveMood() throws InterruptedException
	{
		Thread.sleep(2000);
		MoodTracker.click();
		Thread.sleep(2000);
		Good.click();
		Thread.sleep(2000);
		Savebtn.click();
		Thread.sleep(4000);
		try {
			System.out.println(GettextofSuccess.getText());
			Okbutton.click();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}		
		try {BAcktodash.click();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		Thread.sleep(2000);
	}
	
	
	public void CareportalDashboardcheck_MoodDataCheck(String FirstName ) throws InterruptedException
	{
		driver.navigate().refresh();
		Thread.sleep(5000);
		Dashboard.click();
		Thread.sleep(10000);
		SearchName.sendKeys(FirstName);
		SearchName.sendKeys(Keys.TAB);
		Thread.sleep(10000);
		List<WebElement> dataIcon=driver.findElements(By.xpath("//td[contains(text(),' "+FirstName+" ')]/following::i"));
		dataIcon.get(6).click();
		Thread.sleep(1000);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SleepData);
		moodtab.click();
		
		 List<WebElement> mood=driver.findElements(By.xpath("//button[contains(text(),' Mood ')]/following::td"));
		String Mood=mood.get(2).getText();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("4", Mood);
		moodtab.click();	
		
		
	}

}
