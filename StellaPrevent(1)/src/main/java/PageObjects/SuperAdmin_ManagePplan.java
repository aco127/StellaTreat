package PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuperAdmin_ManagePplan {


	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public SuperAdmin_ManagePplan(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		/*
		 * this.driver = driver; this.wait = new WebDriverWait(driver, 10);
		 */
	}

	@FindBy(xpath = "//span[contains(text(),'Manage Plans')]")
	WebElement HamburgerManagePlan;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement SearhcForPlanField;
	
	@FindBy(xpath="//td[@class='mat-cell cdk-column-title mat-column-title ng-star-inserted']")
	WebElement PlanPresent;
	
	@FindBy(xpath="//button[contains(text(),' + Add Plans ')]")
	WebElement AddPlansBtn;
	
	@FindBy(xpath="//input[@placeholder='Plan Title']")
	WebElement PlanTitleinput;
	
	@FindBy(xpath="//input[@placeholder='Plan Subtitle']")
	WebElement SubtitleInput;
	
	@FindBy(xpath="//input[@placeholder='Plan Price']")
	WebElement PlanPriceInput;
	
	@FindBy(xpath="//input[@formcontrolname='planDuration']")
	WebElement Duration;
	
	@FindBy(xpath="//button[contains(text(),' Submit ')]")
	WebElement SubmitButton;
	
	@FindBy(xpath="//td[contains(text(),' Silver ')]/following::i")
	List<WebElement> EditDelete;
	
	@FindBy(xpath="//div[@class='swal2-header']")
	WebElement ErrorMsg;
	
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement DeleteButton;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	WebElement CancelButton;
	
	@FindBy(xpath="//button[contains(text(),' Update ')]")
	WebElement UpdateBtn;
	@FindBy(xpath="//input[@id='fileinput']")WebElement img;
	
	@FindBy(xpath="//i[@class='fa fa-upload']")WebElement upload;
	
	public void ManagePlan() throws InterruptedException, AWTException
	{  Thread.sleep(1000);
		HamburgerManagePlan.click();
		Thread.sleep(1000);
		AddPlansBtn.click();
		PlanTitleinput.sendKeys("Silver");
		SubtitleInput.sendKeys("Silver Premium");
		Duration.sendKeys("6");
		PlanPriceInput.clear();
		PlanPriceInput.sendKeys("40");
		upload.click();
		Robot rb=new Robot();
		rb.delay(2000);
		StringSelection ss=new StringSelection("C:\\Users\\05122103\\Documents\\Logo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		SubmitButton.click();
		Thread.sleep(1000);
		SearhcForPlanField.sendKeys("Silver");
		SearhcForPlanField.sendKeys(Keys.TAB);
		if(PlanPresent.isDisplayed())
		{
			System.out.println("Searched plan="+PlanPresent);
		}
		else
		{
			System.out.println("Searched Plan is not displyed");
		}
		EditDelete.get(0).click();
		Thread.sleep(1000);
		PlanPriceInput.click();
		PlanPriceInput.sendKeys("100");
		UpdateBtn.click();
		Thread.sleep(1000);
		EditDelete.get(1).click();
		Thread.sleep(1000);
		System.out.println(ErrorMsg);
		CancelButton.click();
		Thread.sleep(1000);
		EditDelete.get(1).click();
		DeleteButton.click();
		Thread.sleep(1000);
		SearhcForPlanField.sendKeys("Silver");
		SearhcForPlanField.sendKeys(Keys.TAB);
			System.out.println("Searched Plan is not displyed");
	}

}