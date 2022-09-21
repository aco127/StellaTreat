package PageObjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Careportal_Validateemail {

	WebDriver driver;

	public Careportal_Validateemail(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	String url = "https://yopmail.com/en/";

	@FindBy(xpath = "//input[@class='ycptinput']")
	WebElement email;

	@FindBy(xpath = "//i[@class='material-icons-outlined f36']")
	WebElement checkinbox;

	@FindBy(xpath = "//span[@class='lmf' and text()='CURIO']")
	WebElement mailinbox;

	@FindBy(xpath = "//a[contains(text(),'Click Here')]")
	WebElement registerlink;

	@FindBy(xpath = "//input[@formcontrolname='email']")
	WebElement regemail;

	@FindBy(xpath = "//input[@formcontrolname='password']")
	WebElement pwd;

	@FindBy(xpath = "//input[@formcontrolname='cpassword']")
	WebElement confpwd;

	// @FindBy(xpath="//mat-select[@id='mat-select-8']//div[@class='mat-select-arrow']")
	@FindBy(xpath = "//mat-select[@formcontrolname='countryCode']")
	WebElement country;

	@FindBy(xpath = "//span[contains(text(),'United States ')]")
	WebElement selectcountry;

	@FindBy(xpath = "//mat-select[@formcontrolname='preferredGender']")
	WebElement prefgender;

	@FindBy(xpath = "//span[normalize-space()='She/her']")
	WebElement sheher;

	@FindBy(xpath = "//button[@aria-label='Open calendar']//span[@class='mat-button-wrapper']//*[name()='svg']")
	WebElement Calendar;

	@FindBy(xpath = "//div[@class='mat-calendar-body-cell-content' and text()='1']")
	WebElement selectdate;

	@FindBy(xpath = "//input[@formcontrolname='zipcode']")
	WebElement zipcode;

	// button[@class='btn btn-add-con-next mat-button mat-button-base
	// ng-star-inserted' and @type='submit']
	@FindBy(xpath = "//span[contains(text(),' Next ')]")
	WebElement nextbtn;

	//@FindBy(xpath = "//span[contains(text(),' NewData')]/preceding-sibling::div")
	@FindBy(id="mat-checkbox-1")
	WebElement data;

	@FindBy(id="mat-input-9")
	WebElement type;
	
	@FindBy(xpath="//div[@class='ng-star-inserted']/mat-radio-button[@id='mat-radio-2']")
	WebElement radio;
	
	@FindBy(xpath = "//button[@class='btn-add-con-next mat-button mat-button-base ng-star-inserted']/span[@class='mat-button-wrapper']")
	WebElement nextbutn;

	@FindBy(xpath = "//textarea[@id='mat-input-35']")
	WebElement testdata;

	@FindBy(xpath = "//div[@class='mat-radio-label-content']")
	WebElement hungrydata;

	@FindBy(xpath = "//textarea[@id='mat-input-12']")
	WebElement moods;

	@FindBy(xpath = "//button[@class='btn-add-con-sub mat-button mat-button-base']")
	WebElement submit;
	
	@FindBy(xpath="//label[@for='mat-checkbox-9-input']//div[@class='mat-checkbox-inner-container']")
	WebElement anxiety;
	
	@FindBy(xpath="//textarea[@placeholder='Type here.......']")
	List<WebElement> medicalcondition;
	
	@FindBy(xpath="//textarea[@id='mat-input-10']")
	WebElement mentalhealthcondition;
	
	@FindBy(xpath="//textarea[@id='mat-input-11']")
	WebElement othercomplication;
	
	@FindBy(xpath="//label[@for='mat-checkbox-21-input']//div[@class='mat-checkbox-inner-container']")
	WebElement noneofabove;
	
	@FindBy(xpath="//div[@class='mat-radio-outer-circle']")
	List<WebElement> RadioButton;
	
	@FindBy(xpath="//mat-select[@formcontrolname='relationship']")
	WebElement SelectRelationdropdown;
	
	@FindBy(xpath="//span[contains(text(),' Father ')]")
	WebElement SelectFather;

	@FindBy(xpath="//input[@id='mat-input-9']")
	WebElement EnterFirstName;
	@FindBy(xpath="//input[@id='mat-input-10']")
	WebElement EnterLastName;
	@FindBy(xpath="//input[@id='mat-input-11']")
	WebElement EnterDignosis;
	@FindBy(xpath="//input[@id='mat-input-12']")
	WebElement Enterage;
	@FindBy(xpath="//input[@id='mat-input-13']")
	WebElement EnterDate;
	@FindBy(xpath="//input[@id='mat-input-14']")
	WebElement Remark;
	
	@FindBy(xpath="//div[@class='card']")
	WebElement CardMsg;
	@FindBy(xpath="//button[@aria-label='Open calendar']")
	WebElement calenderToggle;
	
	@FindBy(xpath="//div[@class='mat-calendar-arrow']")
	WebElement dateDropDown;
	
	@FindBy(xpath="(//div[contains(text(),'1980')])[2]")
	WebElement YearSelection;
	
	@FindBy(xpath="(//div[contains(text(),'2016')])")
	WebElement YearSelection2;
	
	@FindBy(xpath="(//div[contains(text(),'JAN')])")
	WebElement MonthSelection;
	
	@FindBy(xpath="(//div[contains(text(),'7')])[2]")
	WebElement DateSelection;
	

	@FindBy(xpath="//button[@class='mat-calendar-previous-button mat-icon-button mat-button-base']")
	WebElement BackArraow;
	
	
	
	public void ValidateonEmail(String Email,String Pwd,String Confpwd) throws InterruptedException
	{
		
		driver.get("https://yopmail.com/en/");
		Thread.sleep(2000);
		email.sendKeys(Email);
		Thread.sleep(1000);
		checkinbox.click();
		Thread.sleep(4000);
		driver.switchTo().frame("ifmail");
		Thread.sleep(2000); 
		registerlink.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		pwd.sendKeys(Pwd);
		confpwd.sendKeys(Confpwd);
		Thread.sleep(1000);
		  calenderToggle.click();
		  Thread.sleep(1000);
		  
		  dateDropDown.click();
		  Thread.sleep(1000);
		  BackArraow.click();
		  Thread.sleep(1000);
		  YearSelection.click();
		  Thread.sleep(1000);
		  MonthSelection.click();
		  Thread.sleep(1000);
		  DateSelection.click();
		  Thread.sleep(1000);
		zipcode.sendKeys("93101");
		Thread.sleep(1000);
		nextbtn.click();
		Thread.sleep(1000);
	}
	
	
	
	

	public WebElement mailinbox() {

		return mailinbox;

	}

	

	public WebElement country() {
		return country;

	}

	public WebElement selectcountry() {

		return selectcountry;

	}

	public WebElement prefgender() {

		return prefgender;

	}

	public WebElement sheher() {

		return sheher;

	}



	
public void historyAssessement()
{
	/*
	 * anxiety.click();
	 * medicalcondition.get(0).sendKeys("Testing Medical Condition");
	 * medicalcondition.get(1).sendKeys("Testing mentalHealth condition");
	 * medicalcondition.get(2).sendKeys("Testing OtherComplications");
	 * noneofabove.click(); submit.click();
	 */
	/*
	 * RadioButton.get(0).click(); RadioButton.get(6).click();
	 * RadioButton.get(13).click(); RadioButton.get(17).click();
	 * RadioButton.get(21).click(); RadioButton.get(27).click();
	 * RadioButton.get(36).click(); RadioButton.get(41).click();
	 * RadioButton.get(41).click();
	 */
	submit.click();
	
	
}
public void AddFamilyHistory() throws InterruptedException
{
	SelectRelationdropdown.click();
	SelectFather.click();
	EnterFirstName.sendKeys("ABC");
	EnterLastName.sendKeys("XYZ");
	EnterDignosis.sendKeys("Cough");
	Enterage.sendKeys("25");
	 
	  calenderToggle.click();
	  Thread.sleep(1000);
	  
	  dateDropDown.click();
	  Thread.sleep(1000);
	  BackArraow.click();
	  Thread.sleep(1000);
	  YearSelection2.click();
	  Thread.sleep(1000);
	  MonthSelection.click();
	  Thread.sleep(1000);
	  DateSelection.click();
	  Thread.sleep(1000);
	Remark.sendKeys("ABC");
	submit.click();
	System.out.println(CardMsg.getText());
}

	public void emailcheck() throws InterruptedException {

		
		
		
	}
}
