package PageObjects;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPatient {
	WebDriver driver;
	public RegisterPatient(WebDriver driver) 
{
	 this.driver = driver; PageFactory.initElements(driver, this);
		 
	}

	@FindBy(xpath="//li[@class='ng-tns-c7-1']//a[@id='menu2']")
	WebElement patientlist;

	@FindBy(xpath="//button[normalize-space()='Register Patient']")
	WebElement registerpatient;

	@FindBy(xpath="//input[@formcontrolname='firstName']")
	WebElement fname;

	@FindBy(xpath="//input[@formcontrolname='middleName']")
	WebElement mname;

	@FindBy(xpath="//input[@formcontrolname='lastName']")
	WebElement lname;

	@FindBy(xpath="//input[@formcontrolname='phoneNumber']")
	WebElement contactno;

	@FindBy(xpath="//input[@formcontrolname='email']")
	WebElement Email;

	@FindBy(xpath="//input[@formcontrolname='password']")
	WebElement pwd;

	@FindBy(xpath="//input[@formcontrolname='cpassword']")
	WebElement confpwd;
	
	//@FindBy(xpath="//mat-select[@id='mat-select-8']//div[@class='mat-select-arrow']")
	@FindBy(xpath="//mat-select[@formcontrolname='countryCode']")
	WebElement country;
	
	
	@FindBy(xpath="//span[contains(text(),'United States ')]")
	WebElement selectcountry;
	
	@FindBy(xpath="//mat-select[@formcontrolname='preferredGender']")
	WebElement prefgender;

	@FindBy(xpath="//span[normalize-space()='She/her']")
	WebElement sheher;

	@FindBy(xpath="//button[@aria-label='Open calendar']//span[@class='mat-button-wrapper']//*[name()='svg']")
	WebElement Calendar;
	
	@FindBy(xpath="//div[@class='mat-calendar-body-cell-content' and text()='1']")
	WebElement selectdate;

	@FindBy(xpath="//input[@formcontrolname='zipcode']")
	WebElement zipcode;

	
	//button[@class='btn btn-add-con-next mat-button mat-button-base ng-star-inserted' and @type='submit']
	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()=' Next ']")
	WebElement nextbtn;
	
	
	@FindBy(xpath="//span[contains(text(),' NewData')]/preceding-sibling::div")
	WebElement data;

	@FindBy(xpath="//button[@class='btn-add-con-next mat-button mat-button-base ng-star-inserted']/span[@class='mat-button-wrapper']")
	//@FindBy(xpath="//button[@class='btn-add-con-next mat-button mat-button-base ng-star-inserted cdk-focused cdk-mouse-focused']//span[@class='mat-button-wrapper'][normalize-space()='Next']")
	WebElement nextbutn;

	@FindBy(xpath="//textarea[@id='mat-input-35']")
	WebElement testdata;
	//textarea[@id='mat-input-35']
	//@FindBy(xpath="//label[@for='mat-radio-11-input']//div[@class='mat-radio-inner-circle']")
	@FindBy(xpath="//div[@class='mat-radio-label-content']")
	WebElement hungrydata;

	@FindBy(xpath="//textarea[@id='mat-input-12']")
	WebElement moods;

	/*
	 * //@FindBy(xpath="//span[normalize-space()='Submit']")
	 * 
	 * @FindBy(xpath="//button[@class='btn-add-con-sub mat-button mat-button-base']"
	 * ) WebElement submit;
	 */
	
	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()=' Submit ']")
	WebElement submit;

	public WebElement patientlist()
	{

		return patientlist;
	}

	public WebElement RegisterPatients() {

		return registerpatient;

	}

	public WebElement fname() {

		return fname;

	}

	public WebElement mname() {

		return mname;

	}
	public WebElement lname() {

		return lname;

	}
	public WebElement contactno() {

		return contactno;

	}
	public WebElement Email() {
		
		return Email;

	}
	public WebElement pwd() {

		return pwd;

	}
	public WebElement confpwd() {

		return confpwd;

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
	public WebElement calendar() {

		return Calendar;
	}

	public WebElement selectdate() {

		return selectdate;

	}
	public WebElement zipcode() {

		return zipcode;

	}

	public WebElement nextbtn() {

		return nextbtn;

	}
	public WebElement data() {

		return data;

	}

	public WebElement nextbutn()
	{
		return nextbutn;
	}

	public WebElement testdata() {

		return testdata;

	}
	public WebElement hungrydata() {

		return hungrydata;

	}
	public WebElement moods() {

		return moods;

	}
	public WebElement submit() {

		return submit;

	}
	
	

}


