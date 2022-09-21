package PageObjects;

import java.util.List;
import java.util.Properties;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.ImageLoading;

public class Week2 {

	WebDriver driver;
	Properties prop;

	public Week2(WebDriver driver) {
 this.driver = driver; PageFactory.initElements(driver, this);
	}
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	@FindBy(xpath="//option[@value='Module 2']")
			WebElement week2;
	
	@FindBy(xpath="//div[@class='c-dropdown']//select")
	WebElement selectModule;
	
	@FindBy(xpath="//button[@class='navbutton' and text()='2']")
	WebElement secondcard;
	
	@FindBy(xpath="//button[@class='navbutton' and text()='3']")
	WebElement thirdcard;
	@FindBy(xpath="//button[@class='navbutton' and text()='4']")
	WebElement fourthcard;
	@FindBy(xpath="//button[@class='navbutton' and text()='5']")
	WebElement fifthcard;
	@FindBy(xpath="//button[@class='navbutton' and text()='6']")
	WebElement sixthcard;
	@FindBy(xpath="//button[@class='navbutton' and text()='7']")
	WebElement seventhcard;
	
	@FindBy(xpath="//button[@class='navbutton' and text()='8']")
	WebElement eightcard;
	
	@FindBy(xpath="//div[@dir='auto' and text()='1']")
	WebElement day1;
	
	@FindBy(xpath="//div[@dir='auto' and text()='2']")
	WebElement day2;
	
	@FindBy(xpath="//div[@dir='auto' and text()='3']")
	WebElement day3;
	
	@FindBy(xpath="//div[@dir='auto' and text()='4']")
	WebElement day4;
	
	@FindBy(xpath="//div/div[contains(text(),'5')]")
	WebElement day5;
	
	@FindBy(xpath="//p[@class='tabDayData' and text()='Day 6']")
	WebElement day6;
	
	
	
	@FindBy(xpath="//p[@class='tabDayData' and text()='Day 7']")
	WebElement day7;
@FindBy(xpath="//img[@class='nav-hover']")
WebElement images;

@FindBy(xpath="//p[contains(text(),' Click here for the Mood Tracker')]")
WebElement ClickonLinkofMoodTracker;

@FindBy(xpath="//p[contains(text(),' Click here for the Activity Tracker')]")
WebElement ClickonLinkofActivityTracker;

@FindBy(xpath = "//android.widget.TextView[@text='Yoga']")
WebElement yoga;

@FindBy(xpath="//p[contains(text(),' Click here for the Sleep Tracker')]")
WebElement ClickonLinkofSleepTracker;

@FindBy(xpath="(//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73 r-1i6wzkk r-lrvibr'])[3]")
WebElement MoodAdd;

@FindBy(xpath="//button[contains(text(),'SAVE')]")
WebElement SaveButton;

@FindBy(xpath="//p[normalize-space()='Past Modules']")
WebElement pastModules;

@FindBy(xpath="//div[@class='css-901oao r-1yaosjt r-q4m81j']")
WebElement proceedbtn;

@FindBy(xpath = "//select[@style='width: 100%; padding-top: 5px; padding-bottom: 5px; background-color: rgb(255, 255, 255); border: 0px solid rgba(0, 111, 89, 0.38);']")
WebElement SelectWeekDropDown;

@FindAll(@FindBy(xpath = "//h3[@style='text-align: right;']"))
WebElement forwardLink;

@FindBy(xpath="//div[@class='f-nav-link']")
WebElement navLink;

@FindBy(xpath="//textarea[@type='textarea']")
WebElement textarea;

@FindBy(xpath="//button[@class='btn-orange']")
WebElement saveBtn;

@FindBy(xpath="//button[normalize-space()='OK']")
WebElement okBtn;

@FindAll(@FindBy(xpath="//div[@class='tracker-arrow']"))
List<WebElement> arrow;

@FindAll(@FindBy(xpath="//textarea"))
List<WebElement> txtare;

@FindBy(xpath="//p[normalize-space()='Good']")
WebElement GoodMood;

@FindAll(@FindBy(xpath="//div[@class='col-md-3 sm-3 col-3']"))
List<WebElement>checkmark;

@FindAll(@FindBy(xpath="//div[@class='btn-nav-wrapper']/button"))
List<WebElement> cardSize;



@FindBy(xpath = "//div[@style='border: 2px solid black; height: 14px; width: 14px; flex: 0 0 auto; margin-right: 4px; margin-top: 5px;']")
List<WebElement> CheckBox;

@FindBy(xpath="//img[@class='css-9pa8cd']")
WebElement backtoPastModules;

@FindAll(@FindBy(xpath="//img [@src='/static/media/cross.c1eff854.svg']"))
List<WebElement> crossimg;

@FindAll(@FindBy(xpath="//p/em"))
List<WebElement> options;

@FindBy(xpath="//div[@class='g-like']")
WebElement likebtn;

@FindBy(xpath="//div[@class='css-1dbjc4n r-1kihuf0 r-ieixw r-1472mwg r-1777fci r-14gqq1x r-lrsllp']")
List<WebElement> WeekofDaysSelect;

@FindBy(xpath = "//textarea[@type='textarea']")
WebElement TextArea;

@FindBy(xpath = "//div[contains(text(),'Proceed')]")

WebElement ProceedBtn;

@FindBy(xpath = "//button[@class='navbutton']")
List<WebElement> cardcountsize;

@FindBy(xpath="//textarea[@type='description']")
List<WebElement> Texts;

@FindBy(xpath="//div[@style='padding: 10px; width: 35px; height: 35px; box-sizing: border-box; border-radius: 50%; min-width: 0px; display: flex; align-items: center; justify-content: center; background-color: rgb(216, 216, 216);']")
List<WebElement> Checkbox;

@FindBy(xpath="//div[@style='border: 2px solid rgb(93, 189, 169); border-radius: 3px; background-color: rgba(0, 0, 0, 0); flex: 1 1 100%; display: flex; align-items: center; justify-content: center; height: 80px;']")
List<WebElement> SelectBox;

@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div/div[1]/div[4]/div[3]/p/span/span[4]/span[1]/img")
WebElement ClcikOnStar;

@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div/div[1]/div[4]/div[1]/img")
WebElement Heart;

@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div/div[1]/div[4]/div[2]/img")
WebElement Comments;

@FindBy(xpath = "(//div[contains(text(),'Back')])[1]")
WebElement BackButton;
@FindBy(xpath="//div[contains(text(),'Back to ')]")
WebElement backtocard;

@FindBy(xpath = "//p[contains(text(),'Past Modules')]")
WebElement PastModuleTab;



Select Module;
public void goToMOdules() throws InterruptedException
{
	this.driver=driver;
	Thread.sleep(9000);
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
	arrow.get(4).click();
	
	Thread.sleep(4000);

	selectModule.click();
	Select Module=new Select(driver.findElement(By.xpath("//div[@class='c-dropdown']//select")));
	Module.selectByValue("Module 2");

}


public void checkweek2Day1() throws InterruptedException
{
	Thread.sleep(3000);
	PastModuleTab.click();
	Thread.sleep(3000);
	SelectWeekDropDown.click();
	week2.click();
	day1.click();
	ProceedBtn.click();

	Thread.sleep(1000);

	for (int i = 0; i <=cardcountsize.size(); i++) {
		// imgPresnet();
		
		  if (i == 1) {
		 /*  Thread.sleep(1000); try { ClickonLinkofMoodTracker.click();
		 * MoodAdd.click(); ((JavascriptExecutor)
		 * driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 * SaveButton.click(); OkButton.click(); Thread.sleep(4000); BackBtn.click();
		 * Thread.sleep(1000); ClickonLinkofActivityTracker.click();
		 * 
		 * Yoga.click(); Reading.click(); AddActivity.click();
		 * SearchActivity.sendKeys("Planting flowers or buying a potted plant");
		 * Plantingactivity.click(); SaveButton.click(); Thread.sleep(1000);
		 * OkButton.click(); Thread.sleep(1000); SaveButton.click(); OkButton.click();
		 * Thread.sleep(5000); BackBtn.click(); Thread.sleep(1000);
		 * ((JavascriptExecutor)
		 * driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 * ClickonLinkofSleepTracker.click(); Thread.sleep(1000);
		 * 
		 * SelectTmeInHrs.click(); Thread.sleep(500); WebElement HrsTimeSelect = driver
		 * .findElement(By.
		 * xpath("//div[contains(@class, 'css-901oao') and text() = '09']"));
		 * HrsTimeSelect.click();
		 * 
		 * Thread.sleep(1000); SelectTmeInMin.click(); WebElement TimeinMin = driver
		 * .findElement(By.
		 * xpath("//div[contains(@class, 'css-901oao') and text() = '09']"));
		 * TimeinMin.click();
		 * 
		 * AddTrackerBtn.click(); OkButton.click(); Thread.sleep(2000);
		 * BackBtn.click(); Thread.sleep(1000);
		 * 
		 * 
		 *  
		 *  }catch
		 * (Exception e) { e.printStackTrace();
		 *  } 
		 * 
		 */
		  }
		 if(i==4)
		 {
			 try {
				txtare.get(0).sendKeys("Testing");
					Thread.sleep(4000);
					saveBtn.click();
					Thread.sleep(2000);
					okBtn.click();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			
			 
			 
			
		 } if(i==7) { 
			  break; }
			System.out.println(" Module 2 Day 1 card "+i);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		forwardLink.click();
		

	}
	Thread.sleep(1000);
	BackButton.click();
	
}	
	

public void checkweek2Day2() throws InterruptedException
{
	day2.click();
	ProceedBtn.click();

	Thread.sleep(1000);

	for (int i = 0; i <= cardcountsize.size(); i++) {
		// imgPresnet();
		System.out.println("Module 2 Day 2 card "+i);
		if (i == 1) {
			
			try {
				Texts.get(0).sendKeys("Testing");
				Texts.get(1).sendKeys("Testing");
				Texts.get(2).sendKeys("Testing");
				Texts.get(3).sendKeys("Testing");
				saveBtn.click();
				Thread.sleep(2000);
				okBtn.click();
				
				
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(i==2)
		{
			
			try {
				Checkbox.get(0).click();
				Checkbox.get(0).click();
				saveBtn.click();
				Thread.sleep(2000);
				okBtn.click();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} if(i==5)
		 {
			 try {
				txtare.get(0).sendKeys("Testing");
					Thread.sleep(4000);
					saveBtn.click();
					Thread.sleep(2000);
					okBtn.click();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
			 
			 if(i==6)
			 {
				 SelectBox.get(0).click();
				 SelectBox.get(0).click();
				 SelectBox.get(0).click();
				 SelectBox.get(0).click();
				 saveBtn.click();
					Thread.sleep(2000);
					okBtn.click();
				 
				 
			 }
			 if(i==8) { break; }
			 
				
	 
		System.out.println(" Module 2 Day 1 card "+i);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		forwardLink.click();
		
	}
	Thread.sleep(1000);
	BackButton.click();
	}




public void checkweek2Day3() throws InterruptedException
{
	
	day3.click();
	ProceedBtn.click();

	Thread.sleep(1000);

	for (int i = 0; i <= cardcountsize.size(); i++) {
		// imgPresnet();
		System.out.println("Card of Module 2 Day 3 card "+i);
		if (i == 3) {
			
			try {
				Texts.get(5).sendKeys("Testing");
				saveBtn.click();
				Thread.sleep(2000);
				okBtn.click();
				
				
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(i==4)
	
		 {
			 try {
				txtare.get(0).sendKeys("4-05-22");
				txtare.get(1).sendKeys("At my home");
				txtare.get(2).sendKeys("calm");
				txtare.get(3).sendKeys("Nothing");
				txtare.get(4).sendKeys("watching movie");
				txtare.get(5).sendKeys("No");
				txtare.get(6).sendKeys("good");
					Thread.sleep(2000);
					saveBtn.click();
					Thread.sleep(2000);
					okBtn.click();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
			 
			
		 if(i==6) { break; }
		 
			
		 
			System.out.println(" Module 2 Day 3 card "+i);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		forwardLink.click();
		
	}
	Thread.sleep(1000);
	BackButton.click();
	}

public void checkweek2Day4() throws InterruptedException
{
	
	day4.click();
	ProceedBtn.click();

	Thread.sleep(1000);

	for (int i = 0; i <= cardcountsize.size(); i++) {
		// imgPresnet();
		System.out.println("Module 2 Day 4 card "+i);
	
			
		 if(i==5) { break; }
		 
			
		 
			System.out.println(" Module 2 Day 4 card "+i);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		forwardLink.click();
		
	}Thread.sleep(1000);
	BackButton.click();
	}



public void checkweek2Day5() throws InterruptedException
{
	
	week2.click();
	day5.click();
	ProceedBtn.click();

	Thread.sleep(1000);

	for (int i = 0; i <= cardcountsize.size(); i++) {
		// imgPresnet();
		System.out.println("Module 2 Day 5 card "+i);
	
		if (i == 3) {
			Thread.sleep(1000);
			try {
				CheckBox.get(0).click();
				CheckBox.get(0).click();
				CheckBox.get(0).click();
				CheckBox.get(0).click();

				saveBtn.click();
				Thread.sleep(2000);
				okBtn.click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (i == 4) {
			try {
				WebElement card5 = driver.findElement(By.xpath("//button[contains(text(),'5')]"));
				card5.click();
				
				  ClcikOnStar.click(); Heart.click(); Comments.click(); Thread.sleep(1000);
				  TextArea.sendKeys("ABC"); SaveButton.click(); Thread.sleep(1000);
				  BackButton.click();
				 
				continue;

			} catch (Exception e) {
				e.printStackTrace();
			}}
			
		 if(i==5) { break; }
		 
			
		 
			System.out.println(" Module 2 Day 4 card "+i);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		forwardLink.click();
		
	}
	Thread.sleep(1000);
	BackButton.click();
	}

}