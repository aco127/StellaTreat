package PageObjects;

import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class StellaLite_SleepTracker {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public StellaLite_SleepTracker(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		/*
		 * this.driver = driver; this.wait = new WebDriverWait(driver, 10);
		 */
	}

	@FindBy(xpath = "//p[contains(text(),' How did you sleep last night?')]")
	WebElement SleepTrackerButton;

	@FindBy(xpath = "//div[contains(@class, 'css-901oao') and text() = 'h']")
	WebElement SelectTmeInHrs;

	@FindBy(xpath = "//div[contains(@class, 'css-901oao') and text() = '04']")
	List<WebElement> HrsTimeSelect;
	@FindBy(xpath = "//div[contains(@class, 'css-901oao') and text() = 'm']")
	WebElement SelectTmeInMin;
	@FindBy(xpath = "//div[contains(@class, 'css-901oao') and text() = '04']")
	List<WebElement> TimeinMin;

	@FindBy(xpath = "//div[@class='example-thumb example-thumb-0 ']")
	List<WebElement> SleepScale;

	@FindBy(xpath = "//div[@class='example-track example-track-1']")
	List<WebElement> SleepScaleRange;

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-11dbcw3']")
	List<WebElement> charts;
	
	@FindBy(xpath="//div[contains(text(),'ADD TRACKING')]")
	WebElement AddTrackerBtn;
	
	@FindBy(xpath="//div[contains(text(),'Back to Dashboard')]")
	WebElement BackToDash;
	
	@FindBy(xpath="//div[@id='swal2-html-container']")
	WebElement GettextofSuccess;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement Okbutton;
	
	@FindBy(xpath="//span[contains(text(),'Dashboard')]")
	WebElement Dashboard;
	
	@FindBy(xpath="//input[@placeholder='Search by patient name']")
     WebElement SearchName;
	
	@FindBy(xpath="//h3[contains(text(),'Sleep Data')]")
	WebElement SleepData;
	
	
	@FindBy(xpath="//mat-panel-title[contains(text(),'Sleep')]")
	WebElement Sleeptab;
	
	public void imgPresnet()
	{
		 try
	        {
	           Integer iBrokenImageCount = 0;
	            List<WebElement> image_list = driver.findElements(By.tagName("img"));
	            /* Print the total number of images on the page */
	            System.out.println("The page under test has " + image_list.size() + " images");
	            for (WebElement img : image_list)
	            {
	                if (img != null)
	                {
	                    if (img.getAttribute("naturalWidth").equals("0"))
	                    {
	                        System.out.println(img.getAttribute("outerHTML") + " is broken.");
	                        iBrokenImageCount++;
	                    }
	                    else
	                    {
	                    	System.out.println(img.getAttribute("outerHTML") + " is present.");
	                    }
	                }
	            }
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	          
	            System.out.println("image is not Broken");
	        }
	       
	        System.out.println("The page " + driver.getCurrentUrl() + " has "  + " broken images");
	    }

	String TimeInhr="04";
	String TimeInMin="04";
	String Time=   TimeInhr+" : "+TimeInMin; 
	public void SleepTracker() throws InterruptedException {
		//imgPresnet();
		Thread.sleep(3000);
		SleepTrackerButton.click();
		Thread.sleep(1000);
		SelectTmeInHrs.click();
		Thread.sleep(1000);
		try {
		HrsTimeSelect.get(1).click();
		}
		catch(Exception e)
		{
			WebElement HrsTimeSelect=driver.findElement(By.xpath("//div[contains(@class, 'css-901oao') and text() = '"+TimeInhr+"']")) ;
					HrsTimeSelect.click();
		}
		
		Thread.sleep(1000);
		SelectTmeInMin.click();
		Thread.sleep(1000);
		try {
		TimeinMin.get(1).click();
		}
		catch(Exception e)
		{
			WebElement TimeinMin=driver.findElement(By.xpath("//div[contains(@class, 'css-901oao') and text() = '"+TimeInMin+"']")) ;
			TimeinMin.click();
		}

		for(int i=0;i<=5;i++)
		{
			WebElement from=SleepScale.get(0); 
			from.sendKeys(Keys.ARROW_RIGHT);
			i++;
		}
	try {
		WebElement from=SleepScale.get(1); 
	//	from.sendKeys(Keys.ARROW_LEFT);

	for(int i=0;i<=1;i++)
		{
			
			from.sendKeys(Keys.ARROW_RIGHT);
			i++;
		}
	}
	catch(Exception e)
	{
	e.printStackTrace();	
	}
	/*
	 * if (charts.get(0).isDisplayed())
	 * 
	 * { String sleepHr = charts.get(0).getText();
	 * System.out.println("Sleep hours Chart is Displyed "+sleepHr); } if
	 * (charts.get(1).isDisplayed())
	 * 
	 * { String sleepQuality = charts.get(1).getText();
	 * System.out.println("sleepQuality Chart is Displyed "+sleepQuality); } if
	 * (charts.get(2).isDisplayed())
	 * 
	 * { String Energy = charts.get(1).getText();
	 * System.out.println("Energy Chart is Displyed "+Energy); }
	 */
		AddTrackerBtn.click();
		Thread.sleep(5000);

		//System.out.println("Last 7 days History");

		
		try {
			System.out.println(GettextofSuccess.getText());
			Okbutton.click();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}		
Thread.sleep(4000);
	}
	
	
	public void CareportalDashboardcheck_sleepDataCheck(String FirstName ) throws InterruptedException
	{
		driver.navigate().refresh();
		Thread.sleep(2000);
		Dashboard.click();
		Thread.sleep(10000);
		SearchName.sendKeys(FirstName);
		SearchName.sendKeys(Keys.TAB);
		Thread.sleep(10000);
		List<WebElement> dataIcon=driver.findElements(By.xpath("//td[contains(text(),' "+FirstName+" ')]/following::i"));
		dataIcon.get(6).click();
		Thread.sleep(1000);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SleepData);
	    //
		Sleeptab.click();
		Thread.sleep(2000);
		 List<WebElement> HoursCount=driver.findElements(By.xpath("//button[contains(text(),' Total Sleep')]/following::td"));
		String HoursMatching=HoursCount.get(4).getText();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Time, HoursMatching);
		Sleeptab.click();
		
		
	}
	
	

}