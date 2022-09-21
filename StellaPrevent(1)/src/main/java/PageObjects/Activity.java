package PageObjects;

import java.util.Arrays;
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

public class Activity {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public Activity(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		/*
		 * this.driver = driver; this.wait = new WebDriverWait(driver, 10);
		 */
	}

	@FindBy(xpath = "//p[contains(text(),'What activities have you done?')]")
	WebElement ActivitiesdoneButton;

	@FindBy(xpath = "//p[normalize-space()='Yoga']")
	WebElement Yoga;
	

	@FindBy(xpath = "//p[normalize-space()='Relax']")
	WebElement relax;
	
	

	@FindBy(xpath = "//p[normalize-space()='Walk']")
	WebElement Walk;

	@FindBy(xpath = "//p[normalize-space()='Dating']")
	WebElement Dating;

	@FindBy(xpath = "//p[normalize-space()='Meditation']")
	WebElement Meditation;

	@FindBy(xpath = "//p[normalize-space()='Cooking']")
	WebElement Cooking;

	@FindBy(xpath = "//p[normalize-space()='Reading']")
	WebElement Reading;

	@FindBy(xpath = "//p[normalize-space()='Exercise']")
	WebElement Exercise;

	@FindBy(xpath = "//p[normalize-space()='Movies & tv']")
	WebElement Moviestv;

	@FindBy(xpath = "//p[normalize-space()='Music']")
	WebElement Music;

	@FindBy(xpath = "//p[normalize-space()='Friends']")
	WebElement Friends;

	@FindBy(xpath = "//p[normalize-space()='Shopping']")
	WebElement Shopping;

	@FindBy(xpath = "//p[normalize-space()='Relax']")
	WebElement Relax;

	@FindBy(xpath = "//p[normalize-space()='Add Activity']")
	WebElement AddActivity;

	@FindBy(xpath = "//p[normalize-space()='Planting flowers or buying a potted plant']")
	WebElement Plantingactivity;
	@FindBy(xpath = "//input[@type='text']")
	WebElement SearchActivity;

	@FindBy(xpath = "//p[normalize-space()='Daily Activities']")
	WebElement DailyActivities;

	@FindBy(xpath = "//p[normalize-space()='Showering/Bathing']")
	WebElement ShoweringBathing;

	@FindBy(xpath = "//p[normalize-space()='Getting dressed']")
	WebElement Gettingdressed;

	@FindBy(xpath = "//p[normalize-space()='Getting out of the house']")
	WebElement Gettingoutofthehouse;

	@FindBy(xpath = "//p[normalize-space()='Eating regularly']")
	WebElement Eatingregularly;

	@FindBy(xpath = "//p[normalize-space()='Chores']")
	WebElement Chores;
	
	@FindBy(xpath = "//p[contains(text(),'Shower')]")
	WebElement Shower;
	
	@FindBy(xpath = "//p[normalize-space()='Sports']")
	WebElement Sports;
	

	@FindBy(xpath = "//button[@class='btn-solid']")
	WebElement SaveButton;

	@FindBy(xpath = "//div[contains(text(),'Back to ')]")
	WebElement BackBtn;

	@FindBy(xpath = "//div[@id='swal2-html-container']")
	WebElement GettextofSuccess;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement Okbutton;

	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	WebElement Dashboard;

	@FindBy(xpath = "//input[@placeholder='Search by patient name']")
	WebElement SearchName;

	@FindBy(xpath = "//h3[contains(text(),'Sleep Data')]")
	WebElement SleepData;

	@FindBy(xpath = "//button[contains(text(),' Activity ')]")
	WebElement ActivityData;

	@FindBy(xpath = "//button[contains(text(),' Activity ')]/following::td")
	List<WebElement> activityData;
	@FindBy(xpath = "//p[normalize-space()='Reports']")
	WebElement reports;

	@FindAll(@FindBy(xpath = "//div[@class='css-901oao css-cens5h r-tpevwd r-xr0dpn r-1enofrn r-aruset r-atwnbb r-ttb5dx']"))
	List<WebElement> allactivityunderReports;
	
	@FindBy(xpath="//mat-panel-title[contains(text(),'Daily Activity')]")
	WebElement ActivityTab;
	
	@FindBy(xpath="//i[@title='Delete Patient']")
	WebElement deleteicon;
	
	@FindBy(xpath="//button[normalize-space()='Yes, delete it!']")
	WebElement deletbtn;
	
	@FindBy(xpath="//input[@placeholder='Search by first/last/phone/email']")
	WebElement searchPatient;


	String a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14;

	public void pleasantactivity() throws InterruptedException {
		Thread.sleep(1000);
		//imgPresnet();
		ActivitiesdoneButton.click();
		Yoga.click();
		a1 = Yoga.getText();
		System.out.println(a1);
		try{Reading.click();
		a2 = Reading.getText();
		System.out.println(a2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		try {
			relax.click();
		}
		catch (Exception e) {
               e.printStackTrace();
		}
		/*
		 * Walk.click(); a3 = Walk.getText(); System.out.println(a3);
		 */ /*
			 * AddActivity.click();
			 * 
			 * SearchActivity.sendKeys("Planting flowers or buying a potted plant");
			 * Plantingactivity.click(); a4 = Plantingactivity.getText();
			 * System.out.println(a4);
			 */
		SaveButton.click();
		try {
			//System.out.println(GettextofSuccess.getText());
			Okbutton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// BackBtn.click();
	}

	public void imgPresnet() {
		/*
		 * try { Integer iBrokenImageCount = 0; List<WebElement> image_list =
		 * driver.findElements(By.tagName("img")); Print the total number of images on
		 * the page System.out.println("The page under test has " + image_list.size() +
		 * " images"); for (WebElement img : image_list) { if (img != null) { if
		 * (img.getAttribute("naturalWidth").equals("0")) {
		 * System.out.println(img.getAttribute("outerHTML") + " is broken."); int count=
		 * iBrokenImageCount++; } else {
		 * System.out.println(img.getAttribute("outerHTML") + " is present.");
		 * iBrokenImageCount++; } } } } catch (Exception e) { e.printStackTrace();
		 * 
		 * 
		 * }
		 */

	}
	// Arrays.stream(items).anyMatch(inputStr::contains)

	// return Arrays.asList(outer).containsAll(Arrays.asList(inner))

	/*
	 * Getting out of the house Eating regularly Eating regularly Yoga Dating
	 * Reading Friends Shopping Planting flowers or buying a potted plant
	 */

	public void dailyactivity() throws InterruptedException {
		imgPresnet();
		Thread.sleep(5000);
		ActivitiesdoneButton.click();
		DailyActivities.click();
		Shower.click();
		a5 = Shower.getText();
		System.out.println(a5);
		Chores.click();
		a5 = Chores.getText();
		System.out.println(a5);
		
		Thread.sleep(2000);
		SaveButton.click();
		try {
			System.out.println(GettextofSuccess.getText());
			Thread.sleep(2000);
			Okbutton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void CareportalDashboardcheck_ActivityDataCheck(String FirstName) throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(5000);
		Dashboard.click();
		Thread.sleep(10000);
		SearchName.sendKeys(FirstName);
		SearchName.sendKeys(Keys.TAB);
		Thread.sleep(10000);
		List<WebElement> dataIcon = driver
				.findElements(By.xpath("//td[contains(text(),' " + FirstName + " ')]/following::i"));
		dataIcon.get(6).click();
		Thread.sleep(1000);
		ActivityTab.click();
		String arr1[] = { a1, a2, a3, a4, a5 };
		System.out.println("Reactnative Data=" + arr1);

		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ActivityData);

		a7 = activityData.get(3).getText();
		a8 = activityData.get(7).getText();
		a9 = activityData.get(11).getText();
		a10 = activityData.get(15).getText();
		a11 = activityData.get(19).getText();
		//a12 = activityData.get(23).getText();
		String str[] = { a7, a8, a9, a10, a11 };
		System.out.println("Careportal Data=" + str);
		// List<String> str = new ArrayList<String>();
		Thread.sleep(5000);

		// boolean listResult = false;

		Arrays.asList(arr1).containsAll(Arrays.asList(str));
		ActivityTab.click();
	}

	public void checkactivityUnderReportsandSelected() throws InterruptedException {
		Thread.sleep(8000);
		reports.click();
		for (int i = 0; i < allactivityunderReports.size(); i++)

		{
			String actnam = allactivityunderReports.get(i).getText();

			// System.out.println("activityname is"+actnam);
			String arr1[] = { a1, a2, a3, a4, a5, a6 };
			String arr2[] = { actnam };
			System.out.println("arr1 is" + Arrays.toString(arr1));
			System.out.println("arr2 is" + Arrays.toString(arr2));
			// Arrays.asList(arr1).containsAll(Arrays.asList(actnam)) ;
			if (Arrays.toString(arr1).contains(actnam)) {
				System.out.println("matched");
			} else {
				System.out.println("Didnt match" + actnam + "array" + arr1);
			}

		}

	}
	
	
	public void deletepat(String emailid) throws InterruptedException
	{
		Thread.sleep(1000);
		searchPatient.clear();
		searchPatient.sendKeys(emailid);
		Thread.sleep(2000);
		searchPatient.clear();//div[@class='mat-select-arrow-wrapper'
		Thread.sleep(5000);
		searchPatient.sendKeys(emailid);
		Thread.sleep(4000);
		
		deleteicon.click();
		deletbtn.click();
		
	}

}
