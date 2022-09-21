package PageObjects;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utils.ImageLoading;

public class Week5 {

	WebDriver driver;
	Properties prop;

	public Week5(WebDriver driver) {
		this.driver = driver; PageFactory.initElements(driver, this);
	}



	@FindBy(xpath="//option[contains(text(),'Module 5')]")
	WebElement Module5;
	@FindBy(xpath = "//select[@style='width: 100%; padding-top: 5px; padding-bottom: 5px; background-color: rgb(255, 255, 255); border: 0px solid rgba(0, 111, 89, 0.38);']")
	WebElement SelectWeekDropDown;
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
	
	@FindAll(@FindBy(xpath="//div[@class='tracker-arrow']"))
	List<WebElement> arrow;
	
	@FindBy(xpath = "//p[contains(text(),' Click here for the Mood Tracker')]")
	WebElement ClickonLinkofMoodTracker;

	@FindBy(xpath = "//p[contains(text(),' Click here for the Activity Tracker')]")
	WebElement ClickonLinkofActivityTracker;

	@FindBy(xpath = "//p[contains(text(),'Shopping')]")
	WebElement Shopping;

	@FindBy(xpath = "//p[contains(text(),' Click here for the Sleep Tracker')]")
	WebElement ClickonLinkofSleepTracker;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73 r-1i6wzkk r-lrvibr'])[3]")
	WebElement MoodAdd;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement OkButton;


	@FindBy(xpath="//button[@class='navbutton' and text()='8']")
	WebElement eightcard;
	@FindBy(xpath="//button[@class='navbutton' and text()='9']")
	WebElement ninthcard;
	@FindBy(xpath="//button[@class='navbutton' and text()='10']")
	WebElement tenthcard;

	
	@FindBy(xpath = "(//div[@dir='auto' and text()='5'])[2]")
	WebElement day5;

	@FindBy(xpath = "//div[@dir='auto' and text()='1']")
	WebElement day1;

	@FindBy(xpath = "//p[@class='tabDayData' and text()='Day 7']")
	WebElement day7;
	
	@FindBy(xpath="//div[@dir='auto' and text()='2']")
	WebElement day2;
	
	@FindBy(xpath="//div[@dir='auto' and text()='3']")
	WebElement day3;
	
	@FindBy(xpath="//div[@dir='auto' and text()='4']")
	WebElement day4;
		@FindBy(xpath="//img[@class='nav-hover']")
	WebElement images;

	@FindAll(@FindBy(xpath="//div[@class='f-nav-link']"))
	List<WebElement> forwardlink;
	
	@FindBy(xpath="//div[@class='footer-nav-right']")
	WebElement FwdLnk;
	
	@FindAll(@FindBy(xpath = "//h3[@style='text-align: right;']"))
	WebElement forwardLink;
	@FindBy(xpath = "//button[@class='navbutton']")
	List<WebElement> cardcountsize;
	
	@FindBy(xpath = "//div[contains(text(),'Proceed')]")

	WebElement ProceedBtn;
	@FindBy(xpath = "//button[contains(text(),'SAVE')]")
	WebElement SaveButton;
	@FindBy(xpath = "//div[contains(@class, 'css-901oao') and text() = 'h']")
	WebElement SelectTmeInHrs;

	@FindBy(xpath = "//div[contains(@class, 'css-901oao') and text() = '08']")
	List<WebElement> HrsTimeSelect;
	@FindBy(xpath = "//div[contains(@class, 'css-901oao') and text() = 'm']")
	WebElement SelectTmeInMin;
	@FindBy(xpath = "//div[contains(@class, 'css-901oao') and text() = '07']")
	List<WebElement> TimeinMin;

	@FindBy(xpath = "//div[@class='example-thumb example-thumb-0 ']")
	List<WebElement> SleepScale;

	@FindBy(xpath = "//div[@class='example-track example-track-1']")
	List<WebElement> SleepScaleRange;
	@FindBy(xpath = "//div[contains(text(),'ADD TRACKING')]")
	WebElement AddTrackerBtn;
	
	@FindBy(xpath = "//textarea[@placeholder='Name']")
	List<WebElement> TextAreaName;
	
	@FindBy(xpath = "//textarea[@placeholder='Contact']")
	List<WebElement> TextAreacontact;

	@FindBy(xpath="//textarea[@underlinecolorandroid='transparent']")
	List<WebElement> TextAreaofsisat;
	@FindBy(xpath = "//p[@style='text-align: center; padding-top: 7px; padding-bottom: 7px; background-color: rgb(241, 243, 250);']")
	List<WebElement> Questions;
	

	@FindBy(xpath = "//div[@style='border: 2px solid black; height: 14px; width: 14px; flex: 0 0 auto; margin-right: 4px; margin-top: 5px;']")
	List<WebElement> CheckBox;
	@FindBy(xpath = "//p[@class='v-option-item']")
	List<WebElement> Answers;
	@FindBy(xpath = "//div[@class='c-dropdown']//select")
	WebElement selectModule;
	
	@FindBy(xpath="//textarea[@type='textarea']")
	WebElement TextArea;

	@FindBy(xpath = "//p[normalize-space()='Yoga']")
	WebElement Yoga;

	@FindBy(xpath = "//p[normalize-space()='Reading']")
	WebElement Reading;

	@FindBy(xpath = "//p[normalize-space()='Add Activity']")
	WebElement AddActivity;

	@FindBy(xpath = "//p[normalize-space()='Planting flowers or buying a potted plant']")
	WebElement Plantingactivity;
	@FindBy(xpath = "//input[@type='text']")
	WebElement SearchActivity;

	@FindBy(xpath = "//p[contains(text(),'Trapped')]")
	WebElement Trapped;

	@FindBy(xpath = "//p[contains(text(),'Sad')]")
	WebElement Sad;

	@FindBy(xpath = "//p[contains(text(),'Satisfied')]")
	WebElement Satisfied;
	@FindBy(xpath="//div[contains(text(),'Back to ')]")
	WebElement BackBtn;
	
	@FindBy(xpath="//textarea[@type='textarea']")
	WebElement textarea;
	@FindBy(xpath = "//p[contains(text(),'Past Modules')]")
	WebElement PastModuleTab;
	
	@FindBy(xpath = "//span[contains(text(),'+')]")
	List<WebElement> PlusIcon;
	


	public void checkweek5Day1() throws InterruptedException
	{Thread.sleep(10000);
		PastModuleTab.click();
		SelectWeekDropDown.click();
		Module5.click();
		day1.click();
		ProceedBtn.click();

		Thread.sleep(2000);

		for (int i = 0; i <=cardcountsize.size(); i++) {
			// imgPresnet();
			System.out.println("Module 5 Day 1 card "+i);
			
			if (i==0) {
				/*
				 * Thread.sleep(1000); try { ClickonLinkofMoodTracker.click(); MoodAdd.click();
				 * ((JavascriptExecutor)
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
				 * AddTrackerBtn.click(); OkButton.click(); Thread.sleep(2000); BackBtn.click();
				 * Thread.sleep(1000);
				 * 
				 * 
				 * 
				 * }catch (Exception e) { e.printStackTrace(); }
				 */}
			  
			if (i == 6) {
				break;
			}
			 

			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(1000);
			forwardLink.click();
			

		}Thread.sleep(1000);
		BackBtn.click();
		
	}	
		
		public void checkweek5Day2() throws InterruptedException
		{
			day2.click();
			ProceedBtn.click();

			Thread.sleep(1000);

			for (int i = 0; i <= cardcountsize.size(); i++) {
				// imgPresnet();
				System.out.println("Module 5 Day 2 card "+i);
				if (i == 6) {
					
					try {
						seventhcard.click();
						//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", NextStep);
						TextAreaName.get(0).clear();
						TextAreacontact.get(0).clear();
						TextAreaName.get(0).sendKeys("abc");
						TextAreacontact.get(0).sendKeys("9876543211");
						PlusIcon.get(0).click();
						
						TextAreaName.get(1).clear();
						TextAreacontact.get(1).clear();
						TextAreaName.get(1).sendKeys("abcd");
						TextAreacontact.get(1).sendKeys("9876543212");
						PlusIcon.get(0).click();
						
						TextAreaName.get(2).clear();
						TextAreacontact.get(2).clear();
						TextAreaName.get(2).sendKeys("abce");
						TextAreacontact.get(2).sendKeys("9876543212");
						PlusIcon.get(0).click();

						TextAreaName.get(3).clear();
						TextAreacontact.get(3).clear();
						TextAreaName.get(3).sendKeys("abcf");
						TextAreacontact.get(3).sendKeys("9876543212");
						PlusIcon.get(0).click();
						
						TextAreaName.get(4).clear();
						TextAreacontact.get(4).clear();
						TextAreaName.get(4).sendKeys("abcg");
						TextAreacontact.get(4).sendKeys("9876543212");
						PlusIcon.get(0).click();
						SaveButton.click();
						OkButton.click();
						Thread.sleep(2000);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				if(i==7)
				{
					break;
				}
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
				Thread.sleep(1000);
				forwardLink.click();
			}
				Thread.sleep(1000);
				BackBtn.click();
			}
		
		public void checkweek5Day3() throws InterruptedException
		{
			day3.click();
			ProceedBtn.click();

			Thread.sleep(1000);

			for (int i = 0; i <= cardcountsize.size(); i++) {
				
				System.out.println("Module 5 Day 3 card "+i);
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
				Thread.sleep(1000);
				if(i==6)
				{
					break;
				}
				forwardLink.click();
				
			}
			Thread.sleep(1000);
			BackBtn.click();
		}
			

		public void checkweek5Day4() throws InterruptedException
		{
			day4.click();
			ProceedBtn.click();

			Thread.sleep(1000);

			for (int i = 0; i <= cardcountsize.size(); i++) {
				// imgPresnet();
				
				
				if(i==3)
				{
					try {
						TextAreaofsisat.get(0).sendKeys("Difficult situations");
						TextAreaofsisat.get(1).sendKeys("Good Strategies");
						SaveButton.click();
						OkButton.click();Thread.sleep(2000);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			
				if (i == 6) {
					try {
						Thread.sleep(1000);
						for (int i1 = 0; i1 < Questions.size(); i1++) {
							String s = Questions.get(i1).getText();
							System.out.println("Text is: " + s);

						}
						Answers.get(3).click();
						Answers.get(5).click();
						Answers.get(10).click();
						Answers.get(15).click();
						Answers.get(16).click();
						Answers.get(21).click();
						Answers.get(26).click();
						Answers.get(31).click();
						Answers.get(32).click();
						Answers.get(36).click();
						Answers.get(39).click();
						SaveButton.click();
						OkButton.click();
						Thread.sleep(1000);
						break;
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println("Module 5 Day 4 card "+i);

				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
				Thread.sleep(1000);
				forwardLink.click();
				
			}
			BackBtn.click();
			}
			

			public void checkweek5Day5() throws InterruptedException
			{
				day5.click();
				ProceedBtn.click();

				Thread.sleep(1000);

				for (int i = 0; i < cardcountsize.size(); i++) {
					// imgPresnet();
					System.out.println("Module 5 Day 5 Card "+i);

					if (i == 1) {
						Thread.sleep(1000);
						try {
							CheckBox.get(0).click();
							CheckBox.get(0).click();
							CheckBox.get(0).click();
							CheckBox.get(0).click();

							SaveButton.click();
							Thread.sleep(1000);
							OkButton.click();

						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					if (i == 2) {
						try {

							for (int i1 = 0; i1 < Questions.size(); i1++) {
								String s = Questions.get(i1).getText();
								System.out.println("Text is: " + s);

							}
							Answers.get(0).click();
							Answers.get(6).click();
							Answers.get(12).click();
							Answers.get(16).click();
							Answers.get(22).click();
							Answers.get(28).click();
							Answers.get(34).click();
							TextArea.sendKeys("Testing");
							SaveButton.click();
							OkButton.click();
							Thread.sleep(1000);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					
					if(i==5)
					{
						break;
					}
					((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
					Thread.sleep(1000);
					forwardLink.click();
					
				}
				BackBtn.click();
			
			}	
			
			public void goToMOdules() throws InterruptedException {
				this.driver = driver;
				Thread.sleep(9000);

				((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
				Thread.sleep(4000);
				arrow.get(4).click();

				Thread.sleep(4000);

				selectModule.click();
				Select Module = new Select(driver.findElement(By.xpath("//div[@class='c-dropdown']//select")));
				Module.selectByValue("Module 5");

				// selectModule.selectBy
			}
}