package PageObjects;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Week1 {

	WebDriver driver;
	Properties prop;

	public Week1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='navbutton']")
	List<WebElement> cardcounts;

	@FindBy(xpath = "//button[@class='navbutton' and text()='2']")
	WebElement secondcard;

	@FindBy(xpath = "//button[@class='navbutton' and text()='3']")
	WebElement thirdcard;
	@FindBy(xpath = "//button[@class='navbutton' and text()='4']")
	WebElement fourthcard;
	@FindBy(xpath = "//button[@class='navbutton' and text()='5']")
	WebElement fifthcard;
	@FindBy(xpath = "//button[@class='navbutton' and text()='6']")
	WebElement sixthcard;
	@FindBy(xpath = "//button[@class='navbutton' and text()='7']")
	WebElement seventhcard;
	@FindBy(xpath = "//button[@class='navbutton' and text()='8']")
	WebElement EightCard;
	@FindBy(xpath = "//button[@class='navbutton' and text()='9']")
	WebElement nineCard;
	@FindBy(xpath = "//button[@class='navbutton' and text()='10']")
	WebElement TenCard;

	@FindBy(xpath = "//button[@class='navbutton' and text()='11']")
	WebElement eleventhCard;



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
	

	@FindAll(@FindBy(xpath = "//img[@class='nav-hover']"))
	List<WebElement> image;

	@FindBy(xpath = "//p[@style='text-align: center;' and text()='SANDY']")
	WebElement sandy;

	@FindBy(xpath = "//h2[@class='dashboard-heading']")
	WebElement Heading;

	@FindBy(xpath = "//p[@style='text-align: center; padding-top: 7px; padding-bottom: 7px; background-color: rgb(241, 243, 250);']")
	List<WebElement> Questions;

	@FindBy(xpath = "//p[@class='v-option-item']")
	List<WebElement> Answers;

	@FindBy(xpath = "//button[contains(text(),'SAVE')]")
	WebElement SaveButton;

	@FindBy(xpath = "//p[contains(text(),' Click here for the Mood Tracker')]")
	WebElement ClickonLinkofMoodTracker;

	@FindBy(xpath = "//p[contains(text(),' Click here for the Activity Tracker')]")
	WebElement ClickonLinkofActivityTracker;

	@FindBy(xpath = "//p[contains(text(),'Shopping')]")
	WebElement Shopping;

	@FindBy(xpath = "//p[contains(text(),' Click here for the Sleep Tracker')]")
	WebElement ClickonLinkofSleepTracker;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73 r-1i6wzkk r-lrvibr'])[4]")
	WebElement MoodAdd;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement OkButton;

	@FindBy(xpath = "//img[@src='http://104.43.172.201:4001/upload/0.5113555946108794--10.png']")
	WebElement Activity;

	@FindBy(xpath = "//textarea[@type='textarea']")
	WebElement TextArea;

	@FindBy(xpath = "//textarea[@type='textarea']")
	List<WebElement> TextAreas;

	@FindBy(xpath = "(//div[contains(text(),'Back')])[1]")
	WebElement BackButton;

	@FindBy(xpath = "//button[@class='btn-orange']")
	WebElement SavebuttonforExp;

	@FindBy(xpath = "//p[contains(text(),'Past Modules')]")
	WebElement PastModuleTab;

	@FindBy(xpath = "//select[@style='width: 100%; padding-top: 5px; padding-bottom: 5px; background-color: rgb(255, 255, 255); border: 0px solid rgba(0, 111, 89, 0.38);']")
	WebElement SelectWeekDropDown;

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1kihuf0 r-ieixw r-1472mwg r-1777fci r-14gqq1x r-lrsllp']")

	List<WebElement> WeekofDaysSelect;

	@FindBy(xpath = "//div[contains(text(),'Proceed')]")

	WebElement ProceedBtn;

	@FindBy(xpath = "//option[@value='Module 1']")
	WebElement week1;

	@FindBy(xpath = "//div[@class='draggable']")
	List<WebElement> options;

	@FindBy(xpath = "//p[@class='task-header']")
	List<WebElement> DropOption;

	@FindBy(xpath = "Texts.get(0).sendKeys(\"Testing\");")

	List<WebElement> CrossIconW1D2C3;

	@FindBy(xpath = "(//span[@style='position: absolute; right: -10px; width: 22px; height: 22px; line-height: 20px; border-radius: 22px; background: rgb(225, 85, 85); color: rgb(255, 255, 255); font-weight: bold; text-align: center;'])[1]")

	WebElement CrossIconW1D2C3check;

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-1otgn73 r-1i6wzkk r-lrvibr']")
	WebElement Waffole;

	@FindBy(xpath = "//p[contains(text(),'Sleep Tracker')]")
	WebElement SllepTrackerWaffole;

	@FindBy(xpath = "//p[contains(text(),'Daily Learning')]")
	WebElement DailyLearcningsWaffole;

	@FindBy(xpath = "//p[contains(text(),'Mood Check In')]")
	WebElement MoodTrackerWaffole;

	@FindBy(xpath = "//p[contains(text(),'Activity Tracker')]")
	WebElement ActivityTrackerWaffole;
	@FindBy(xpath = "//div[contains(text(),'ADD TRACKING')]")
	WebElement AddTrackerBtn;

	@FindBy(xpath = "//p[contains(text(),'Dashboard')]")
	WebElement DashboardWaffole;

	@FindBy(xpath = "//div[@class='f-nav-link']")
	WebElement navLink;

	@FindAll(@FindBy(xpath = "(//div[@class='f-nav-link'])[2]"))
	WebElement forwardLink;
	@FindBy(xpath = "//button[@class='navbutton']")
	List<WebElement> cardcountsize;

	@FindBy(xpath = "//p[contains(text(),'I have been able to laugh and see the funny side of things')]")
	WebElement FieldPresent;

	@FindBy(xpath = "(//span[contains(text(),'Nothing has')])[2]")
	WebElement FieldPresentW1d2;

	@FindBy(xpath = "//img[@src='/static/media/right.e55710ce.svg']")
	List<WebElement> correctIcon;

	@FindBy(xpath = "//p[contains(text(),'During pregnancy​')]")
	WebElement Dpreg;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div/div[1]/div[5]/div/div[1]/img")
	WebElement SelectOptions1;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div/div[1]/div[6]/div/div[1]/img")
	WebElement SelectOptions2;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div/div[1]/div[7]/div/div[1]/img")
	WebElement SelectOptions3;

	@FindBy(xpath = "//button[contains(text(),'Next Step')]")
	WebElement NextStep;

	@FindBy(xpath = "//button[contains(text(),'Compare')]")
	WebElement CompareButton;

	@FindBy(xpath = "(//span[contains(text(),'+')])[2]")
	WebElement rangehigh;

	@FindBy(xpath = "(//span[contains(text(),'+')])")
	List<WebElement> RangeHigh;

	@FindBy(xpath = "//div[contains(@class, 'css-901oao') and text() = 'h']")
	WebElement SelectTmeInHrs;

	@FindBy(xpath = "//div[contains(@class, 'css-901oao') and text() = '05']")
	List<WebElement> HrsTimeSelect;
	@FindBy(xpath = "//div[contains(@class, 'css-901oao') and text() = 'm']")
	WebElement SelectTmeInMin;
	@FindBy(xpath = "//div[contains(@class, 'css-901oao') and text() = '06']")
	List<WebElement> TimeinMin;

	@FindBy(xpath = "//div[@class='example-thumb example-thumb-0 ']")
	List<WebElement> SleepScale;

	@FindBy(xpath = "//div[@class='example-track example-track-1']")
	List<WebElement> SleepScaleRange;
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

	@FindBy(xpath = "//div[@style='border: 2px solid black; height: 14px; width: 14px; flex: 0 0 auto; margin-right: 4px; margin-top: 5px;']")
	List<WebElement> CheckBox;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div/div[1]/div[4]/div[3]/p/span/span[4]/span[1]/img")
	WebElement ClcikOnStar;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div/div[1]/div[4]/div[1]/img")
	WebElement Heart;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[2]/div[2]/div/div/div[1]/div[4]/div[2]/img")
	WebElement Comments;
	
	@FindBy(xpath="//div[contains(text(),'Back to ')]")
	WebElement BackBtn;
	
	

	public void imgPresnet() {
		/*
		 * try { Integer iBrokenImageCount = 0; List<WebElement> image_list =
		 * driver.findElements(By.tagName("img")); Print the total number of images on
		 * the page System.out.println("The page under test has " + image_list.size() +
		 * " images"); for (WebElement img : image_list) { if (img != null) { if
		 * (img.getAttribute("naturalWidth").equals("0")) {
		 * System.out.println(img.getAttribute("outerHTML") + " is broken.");
		 * iBrokenImageCount++; } else {
		 * System.out.println(img.getAttribute("outerHTML") + " is present."); } } } }
		 * catch (Exception e) { e.printStackTrace();
		 * 
		 * System.out.println("image is not present"); }
		 * 
		 * System.out.println("The page " + driver.getCurrentUrl() + " has " +
		 * " broken images");
		 */
	}

	// performaing all exc of week 1 Day 1 for all cards
	public void checkwk1d1() throws InterruptedException {
		//Thread.sleep(2000);
		
		/*
		 * PastModuleTab.click(); Thread.sleep(1000); SelectWeekDropDown.click();
		 * 
		 * week1.click(); WeekofDaysSelect.get(0).click(); ProceedBtn.click();
		 * imgPresnet(); Waffole.click(); Thread.sleep(3000);
		 * SllepTrackerWaffole.click();
		 * 
		 * System.out.println(driver.getCurrentUrl()); Waffole.click();
		 * Thread.sleep(2000); DailyLearcningsWaffole.click(); Thread.sleep(2000);
		 * System.out.println(driver.getCurrentUrl()); Waffole.click();
		 * Thread.sleep(2000); MoodTrackerWaffole.click();
		 * System.out.println(driver.getCurrentUrl()); Waffole.click();
		 * Thread.sleep(2000); ActivityTrackerWaffole.click(); Thread.sleep(2000);
		 * System.out.println(driver.getCurrentUrl()); Waffole.click();
		 * Thread.sleep(2000); DashboardWaffole.click();
		 * System.out.println(driver.getCurrentUrl());
		 */
		 

		Thread.sleep(10000);

		PastModuleTab.click();
		Thread.sleep(1000);
		SelectWeekDropDown.click();

		week1.click();
		day1.click();
		ProceedBtn.click();
		Thread.sleep(5000);
		imgPresnet();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", navLink);
		Thread.sleep(5000);
		navLink.click();

		for (int i = 1; i < cardcountsize.size(); i++) {
		
			imgPresnet();

			Thread.sleep(4000);
			if (i == 3) {
				try {

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
					//Answers.get(37).click();
					Thread.sleep(1000);
					SaveButton.click();
					OkButton.click();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			Thread.sleep(2000);
			if (i == 4)

			{
				Thread.sleep(1000);
				
				/*
				 * try { ClickonLinkofMoodTracker.click(); MoodAdd.click();
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
				 * AddTrackerBtn.click(); OkButton.click(); Thread.sleep(2000); } catch
				 * (Exception e) { e.printStackTrace(); }
				 */
			}
			Thread.sleep(4000);
			if (i == 5) {
				try {

					TextArea.clear();
					TextArea.sendKeys("Testing Exercise");
					Thread.sleep(1000);
					SavebuttonforExp.click();
					Thread.sleep(1000);
					OkButton.click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			/*
			 * if (i == 6) { try {
			 * 
			 * break;
			 * 
			 * } catch (Exception e) { e.printStackTrace(); } }
			 */
			System.out.println("Module 1 Day 1 Card "+i);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(4000);
			forwardLink.click();
			Thread.sleep(2000);

		}
		BackBtn.click();
	}

	// performaing all exc of week 1 Day 2 for all cards
	public void checkwk1d2() throws InterruptedException {
		
		day2.click();
		ProceedBtn.click();

		Thread.sleep(1000);

		for (int i = 0; i < cardcountsize.size(); i++) {
			// imgPresnet();

			if (i == 1) {
				try {
					WebElement card3 = driver.findElement(By.xpath("//button[contains(text(),'3')]"));
					card3.click();
					/*
					 * Actions builder = new Actions(driver); //Dragged and dropped.
					 * 
					 * WebElement from =
					 * driver.findElement(By.xpath("(//div[@class='draggable'])[2]"));
					 * 
					 * WebElement to = driver.findElement(By.xpath("(//div[@class='wip'])[1]"));
					 * //Perform drag and builder.dragAndDrop(from, to).perform();
					 * 
					 * 
					 * // act.dragAndDrop(options.get(0), DropOption.get(0)).build().perform();
					 * ((JavascriptExecutor)
					 * driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
					 * Thread.sleep(5000); SaveButton.click(); OkButton.click();
					 */
					continue;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if (i == 2) {
				try {
					CrossIconW1D2C3.get(0).click();
					CrossIconW1D2C3.get(4).click();
					SaveButton.click();
					OkButton.click();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if (i == 4) {
				try {
					TextArea.clear();
					TextArea.sendKeys("Testing Exercise");
					Thread.sleep(500);
					SavebuttonforExp.click();
					Thread.sleep(2000);
					OkButton.click();

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (i == 5) {
				try {
				
					break;

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("Module 1 Day 2 Card "+i);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(1000);
			forwardLink.click();
			

		}
		BackBtn.click();
	}

	// performaing all exc of week 1 Day 2 for all cards
	public void checkwk1d3() throws InterruptedException {
		Thread.sleep(1000);
		day3.click();
		ProceedBtn.click();
		// forwardLink.get(1).click();
		Thread.sleep(1000);

		// imgPresnet();

		for (int i = 0; i < 7; i++) {
			
			// imgPresnet();

			if (i == 1) {
				try {
					SelectOptions1.click();
					SelectOptions2.click();
					SelectOptions3.click();
					SaveButton.click();
					Thread.sleep(2000);
					OkButton.click();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (i == 6) {
				try {
				
					break;

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("Module 1 Day 3 Card "+i);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(5000);
			forwardLink.click();
			Thread.sleep(2000);
			
		}
		BackBtn.click();

	}

	// perform exe for week 1 Day 4 for all cards
	public void checkwk1d4() throws InterruptedException {
	   day4.click();
		ProceedBtn.click();
		Thread.sleep(1000);

		imgPresnet();

		for (int i = 0; i < cardcountsize.size(); i++) {
			
			imgPresnet();

			if (i == 0) {
				Thread.sleep(1000);
				try {
					Trapped.click();
					Sad.click();
					Satisfied.click();

					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", NextStep);
					NextStep.click();
					Trapped.click();
					Sad.click();
					Satisfied.click();
					CompareButton.click();
					SaveButton.click();
					OkButton.click();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if (i == 2) {
				Thread.sleep(1000);
				try {

					TextArea.clear();
					TextArea.sendKeys("Testing Exercise");
					Thread.sleep(500);
					SavebuttonforExp.click();
					Thread.sleep(500);
					OkButton.click();

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (i == 3) {
				Thread.sleep(1000);
				try {
					for (int i3 = 0; i3 < 3; i3++) {
						RangeHigh.get(1).click();
						RangeHigh.get(2).click();
						RangeHigh.get(3).click();
					}
					SaveButton.click();
					OkButton.click();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (i == 7) {
				try {
				
					break;

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			System.out.println("Module 1 Day 4 Card "+i);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(7000);
			forwardLink.click();
			Thread.sleep(2000);
			
		}
		BackBtn.click();

	}

	// perform exe for week 1 Day 5 for all cards
	public void checkwk1d5() throws InterruptedException {
		day5.click();
		ProceedBtn.click();
		Thread.sleep(1000);

		imgPresnet();

		for (int i = 0; i < cardcountsize.size(); i++) {
			
			imgPresnet();

			if (i == 1) {
				Thread.sleep(1000);
				try {

					TextAreas.get(0).clear();
					TextAreas.get(0).sendKeys("Testing ");
					TextAreas.get(1).clear();
					TextAreas.get(1).sendKeys("Testing ");
					TextAreas.get(2).clear();
					TextAreas.get(2).sendKeys("Testing ");
					TextAreas.get(2).clear();
					TextAreas.get(2).sendKeys("Testing ");
					TextAreas.get(3).clear();
					TextAreas.get(3).sendKeys("Testing ");
					Thread.sleep(1000);
					SavebuttonforExp.click();
					Thread.sleep(1000);
					OkButton.click();

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (i == 3) {
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
			if (i == 4) {
				try {
					/*
					 * WebElement card5 =
					 * driver.findElement(By.xpath("//button[contains(text(),'5')]"));
					 * card5.click();
					 */
					
					  ClcikOnStar.click();
					  Heart.click();
						/*
						 * Comments.click(); Thread.sleep(1000); TextArea.sendKeys("ABC");
						 * SaveButton.click(); Thread.sleep(1000); BackButton.click();
						 */
					 
					continue;

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (i == 5) {
				try {
				
					break;

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("Module 1 Day 1 Card "+i);
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(6000);
			forwardLink.click();
			Thread.sleep(2000);

		}

		BackBtn.click();
		
	}

}
