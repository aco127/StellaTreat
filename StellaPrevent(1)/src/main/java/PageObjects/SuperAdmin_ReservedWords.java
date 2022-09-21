package PageObjects;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperAdmin_ReservedWords {

	WebDriver driver;
	Properties prop;

	public SuperAdmin_ReservedWords(WebDriver driver) {
		
 this.driver = driver; PageFactory.initElements(driver, this);
		 
	}

	@FindBy(xpath="//span[contains(text(),'Reserved Words')]")
	WebElement ReserveWords;
	
	@FindBy(xpath="//button[contains(text(),' + Add Categories ')]")
	WebElement AddCtegories;
	
	@FindBy(xpath="//input[@placeholder='Enter Category Name']")
	WebElement EnterCategories;
	
	@FindBy(xpath="//input[@placeholder='Enter a new tag']")
	WebElement EnterNewTag;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement SaveButton;
	
	@FindBy(xpath="//td[contains(text(),'Test')]")
	WebElement BasicSearch;
		
	@FindBy(xpath="//td[contains(text(),'Test')]/following::i")
	List<WebElement> selectcountry;
	
	@FindBy(xpath="//button[contains(text(),' Update')]")
	WebElement UpdateButton;
	
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement DeleteButton;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	WebElement CancelButton;
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement SearhcForPlanField;
	
	@FindBy(xpath="//span[contains(text(),'Email Distribution List')]")
	WebElement EmailDistribution;
	
	@FindBy(xpath="//button[contains(text(),' Add New Email ')]")
	WebElement AddEmailButton;	

	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement EnterFirstNAme;
	
	@FindBy(xpath="//input[@placeholder='Last name']")
	WebElement EnterLastName;
	
	@FindBy(xpath="//input[@placeholder='someone@example.com']")
	WebElement EnterEmail;
	
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	WebElement SubmitBtn;
	
	@FindBy(xpath="//td[@class='mat-cell cdk-column-email mat-column-email ng-star-inserted']")
	WebElement SearchEmail;
	
	@FindBy(xpath="//td[@class='mat-cell cdk-column-email mat-column-email ng-star-inserted']/following::i")
	WebElement DeleteIcon;
public void ReserveWords() throws InterruptedException
{
	ReserveWords.click();
	AddCtegories.click();
	EnterCategories.sendKeys("Test");	
	EnterNewTag.sendKeys("Harmfull");
	SaveButton.click();
	Thread.sleep(1000);
	SearhcForPlanField.sendKeys("Test");
	System.out.println(BasicSearch.getText());
	
	selectcountry.get(0).click();
	EnterNewTag.sendKeys("Harm");
	EnterNewTag.sendKeys(Keys.TAB);
	UpdateButton.click();
	Thread.sleep(1000);
	SearhcForPlanField.clear();
	SearhcForPlanField.sendKeys("Test");
	SearhcForPlanField.sendKeys(Keys.TAB);
	
	selectcountry.get(2).click();
	CancelButton.click();
	Thread.sleep(1000);
	selectcountry.get(2).click();
	DeleteButton.click();
	Thread.sleep(1000);
	
}

public  void EmailDistributionMail() throws InterruptedException
{Thread.sleep(1000);
	EmailDistribution.click();

AddEmailButton.click();
EnterFirstNAme.sendKeys("hmail");
EnterLastName.sendKeys("Last");
EnterEmail.sendKeys("hmail@yopmail.com");
SubmitBtn.click();
Thread.sleep(500);
SearhcForPlanField.sendKeys("hmail@yopmail.com");
/*
 * if(SearchEmail.isDisplayed()) {
 * System.out.println("Email is Added"+SearchEmail); }else {
 * System.out.println("Email is not added"); }
 */
DeleteIcon.click();
Thread.sleep(500);
DeleteButton.click();
}
}