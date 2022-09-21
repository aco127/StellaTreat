package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Journal {

	WebDriver driver;

	public Journal(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[@class='menu-sidebar' and text()='Journal']")
	WebElement Journal;

	@FindBy(xpath="//button[@class='btn btn-add-con' and text()=' Assign to Patient ']")
	WebElement Assigntopt;

	@FindBy(xpath="//mat-select[@formcontrolname='patientName']") 
	//@FindBy(xpath="//span[@class='mat-select-placeholder ng-tns-c15-50 ng-star-inserted']")
	WebElement Patientdropdown;
	

	@FindBy(xpath="//mat-select[@formcontrolname='journalId']")
	WebElement Journaldropdown;

	@FindBy(xpath="//span[@class='mat-option-text']")
	WebElement selectpatient;

	@FindBy(xpath="//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']")
	WebElement Backdrop;

	@FindBy(xpath="//span[@class='mat-option-text' and text()='Stella HFT Journal']")
	WebElement StellaHFTJournal;
	

	@FindBy(xpath="//button[@class='mat-raised-button save-btn-modal floatRight' and text()=' Submit ']")
	WebElement Submit;
	 
	@FindBy(xpath="//mat-select[@formcontrolname='patientName']//div[@class='mat-select-arrow-wrapper']")
	WebElement dropp;
	
	@FindBy(xpath="//mat-select[@formcontrolname='journalId']//div[@class='mat-select-arrow']")
	WebElement dropj;
	
	@FindBy(xpath="//button[contains(text(),' Add New Journal ')]")
	WebElement AddnewJournal;
	
	@FindBy(xpath="//input[@placeholder='Journal Name *']")
	WebElement EnterJournelName;
	@FindBy(xpath="//button[contains(text(),' Save ')]")
	WebElement SaveButton;
	
	@FindBy(xpath="//td[text()='Assesment']/following::i")
	List<WebElement> EditDelete;
	
	@FindBy(xpath="(//i[@title='Open Journal Page'])[1]")WebElement EditJournal;
	@FindBy(xpath="(//i[@title='Delete Journal'])[1]")WebElement DeleteJournal;
	
	
	@FindBy(xpath="//h2[@class='swal2-title']")
	WebElement Msg;
	
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement DeleteButton; 
	
	@FindBy(xpath="//button[contains(text(),' + Add Journal Question ')]")
	WebElement Addqus;
	
	@FindBy(xpath="//div[@class='mat-select-arrow']")
	WebElement dropdown;
	
	@FindBy(xpath="//span[contains(text(),' text ')]")
	WebElement textselect;
	
	@FindBy(xpath="//textarea[@formcontrolname='question']")
	WebElement InputArea;
	
	@FindBy(xpath="//i[@class='fa fa-arrow-left']")
	WebElement BackArrow;
	
	@FindBy(xpath="//button[@class='save-btn-modal']")
	WebElement BtnSave;
	
	public void Assignjournal(String FirstName) throws InterruptedException
	{
		Journal.click();
		Thread.sleep(6000);
		Assigntopt.click();
		Thread.sleep(6000);
		dropp.click();
		Thread.sleep(6000);
		WebElement name=driver.findElement(By.xpath("//span[contains(text(),' "+FirstName+" ')]"));
		
		name.click();
		Thread.sleep(6000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(6000);
	
		dropj.click();
		Thread.sleep(8000);
 
JavascriptExecutor js = (JavascriptExecutor) driver; 
js.executeScript("arguments[0].click();", StellaHFTJournal);
		
		//StellaHFTJournal.click();
		Thread.sleep(6000);
		action.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(6000);
		Submit.click();
		
		
	}
	
	public void AddJournels() throws InterruptedException
	{
		Journal.click();
		Thread.sleep(6000);
		AddnewJournal.click();
		EnterJournelName.sendKeys("Anew");
		SaveButton.click();
		Thread.sleep(500);
		EditJournal.click();
		Addqus.click();
		dropdown.click();
		textselect.click();
		InputArea.sendKeys("Assesment");
		BtnSave.click();
		Thread.sleep(500);
		DeleteJournal.click();
		System.out.println(Msg.getText());
		DeleteButton.click();
		BackArrow.click();
		Thread.sleep(1000);
		DeleteJournal.click();
		System.out.println(Msg.getText());
		DeleteButton.click();
	}
}
 