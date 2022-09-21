package PageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuperAdmin_ManageQuotes {


	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public SuperAdmin_ManageQuotes(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		/*
		 * this.driver = driver; this.wait = new WebDriverWait(driver, 10);
		 */
	}

	@FindBy(xpath = "//span[contains(text(),'Manage Quotes')]")
	WebElement HamburgerManageQuotes;
	
	@FindBy(xpath="//button[contains(text(),' + Add Quotes ')]")
	WebElement AddQuotesBtn;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement SearhcForPlanField;
	
	
	@FindBy(xpath="//input[@placeholder='Quotes']")
	WebElement Quotesinput;

	@FindBy(xpath="//td[@class='mat-cell cdk-column-quote mat-column-quote ng-star-inserted']")
	WebElement Quotesisearch;
	
	@FindBy(xpath="//button[contains(text(),' Submit ')]")
	WebElement SubmitButton;
	
	@FindBy(xpath="//td[contains(text(),' Safe ')]/following::i")
	List<WebElement> EditDelete;
	
	@FindBy(xpath="//div[@class='swal2-header']")
	WebElement ErrorMsg;
	
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement DeleteButton;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	WebElement CancelButton;
	
	
	
	@FindBy(xpath="//button[contains(text(),' Update ')]")
	WebElement UpdateBtn;
	
	public void ManageQuotes()  throws InterruptedException
	{  Thread.sleep(1000);
	HamburgerManageQuotes.click();
		Thread.sleep(1000);
		AddQuotesBtn.click();
		String Quotes1="Have a Safe Day";
		String Quotes2="Have a Safe Day & Healthy Day";
		Quotesinput.sendKeys(Quotes1);
		SubmitButton.click();
		Thread.sleep(1000);
		SearhcForPlanField.sendKeys(Quotes1);
	
		Thread.sleep(1000);
		if(Quotesisearch.isDisplayed())
		{
			System.out.println("Searched Quotes="+Quotesisearch);
		}
		else
		{
			System.out.println("Searched Plan is not displyed");
		}
		EditDelete.get(0).click();
		Thread.sleep(1000);
		Quotesinput.clear();
		Quotesinput.sendKeys(Quotes2);
		UpdateBtn.click();
		Thread.sleep(1000);
		SearhcForPlanField.sendKeys(Quotes1);
		Thread.sleep(1000);
		EditDelete.get(1).click();
		Thread.sleep(1000);
		System.out.println(ErrorMsg);
		CancelButton.click();
		Thread.sleep(1000);
		EditDelete.get(1).click();
		DeleteButton.click();
		Thread.sleep(1000);
		/*
		 * Quotesinput.sendKeys(Quotes2);
		 * System.out.println("Searched Plan is not displyed");
		 */
	}

	

}