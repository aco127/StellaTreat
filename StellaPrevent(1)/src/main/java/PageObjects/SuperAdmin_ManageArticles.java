package PageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuperAdmin_ManageArticles {


	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public SuperAdmin_ManageArticles(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		/*
		 * this.driver = driver; this.wait = new WebDriverWait(driver, 10);
		 */
	}

	@FindBy(xpath = "//span[contains(text(),'Manage Articles')]")
	WebElement HamburgerManageArticless;
	
	@FindBy(xpath="//Button[contains(text(),' + Add Article ')]")
	WebElement AddArticle;
	
	@FindBy(xpath="(//input)[2]")
	WebElement InputTitle;
	
	@FindBy(xpath = "//br[@data-mce-bogus='1']")
	WebElement text;
	
	
	
	@FindBy(xpath="//input[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']")
	WebElement SearchOption;

	@FindBy(xpath="//td[@class='mat-cell cdk-column-quote mat-column-quote ng-star-inserted']")
	WebElement Quotesisearch;
	
	@FindBy(xpath="//button[contains(text(),' Submit ')]")
	WebElement SubmitButton;
	@FindBy(xpath="//input[@id='fileUpload1']")WebElement img;
	@FindBy(xpath="//i[@title='Edit Notifications']")WebElement EditNotification;
	@FindBy(xpath="//button[contains(text(),'Update')]")WebElement Update;
	@FindBy(xpath="//i[@title='Delete Article']")WebElement Delete;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")WebElement DeleteButton;
	
	
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement Save;
	
	
	@FindBy(xpath="//span[contains(text(),' NLP Content')]")WebElement NLPcontent;
	@FindBy(xpath="(//i[@title='Nudge Patient'])[1]")WebElement NudgeNotification;
	@FindBy(xpath="//textarea")WebElement InputTextarea;
	@FindBy(xpath="//div[@class='mat-checkbox-inner-container']")List<WebElement> checkbox;
	@FindBy(xpath="//button[@class='mat-raised-button save-btn-modal']")WebElement ButtonVisible;
	
	@FindBy(xpath="(//i[@title='Emergency Mail'])[1]")WebElement EmergencyEmail;
	@FindBy(xpath="//span[contains(text(),' Manage Songs')]")WebElement ManageSongs;
	@FindBy(xpath="//button[contains(text(),' + Add Songs ')]")WebElement AddSongs;
	@FindBy(xpath="//input[@formcontrolname='title']")WebElement SongInputName;
	@FindBy(xpath="(//span[contains(text(),'+')])[5]")WebElement AddSongIcon;
	@FindBy(xpath="//input[@formcontrolname='name']")WebElement NameofSong;
	@FindBy(xpath="//input[@formcontrolname='duration']")WebElement Duration;
	@FindBy(xpath="//input[@formcontrolname='musicURL']")WebElement URL;
	@FindBy(xpath="//input[@id='fileUpload2']")WebElement SongsFileUpload;
	
	
	
	
	
	
	
	
	public void ManageArticles()  throws InterruptedException
	{  Thread.sleep(1000);
	HamburgerManageArticless.click();
		Thread.sleep(1000);
		AddArticle.click();
		InputTitle.sendKeys("Test");
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		text.sendKeys("Test");
		driver.switchTo().defaultContent();
		
		img.sendKeys("C:\\\\Users\\\\05122103\\\\Documents\\\\Logo.jpg");
		 
		Thread.sleep(5000);
		Save.click();
		
		SearchOption.sendKeys("Test");
		Thread.sleep(1000);
		SearchOption.sendKeys(Keys.TAB);
		
		EditNotification.click();
		InputTitle.clear();
		InputTitle.sendKeys("Tests");
		Update.click();
		Thread.sleep(1000);
		SearchOption.clear();
		SearchOption.sendKeys("Test");
		Thread.sleep(1000);
		SearchOption.sendKeys(Keys.TAB);

		Delete.click();
		DeleteButton.click();
	}

	
	
	public void NLPcontent() throws InterruptedException
	{
		NLPcontent.click();
		NudgeNotification.click();
		if(ButtonVisible.isEnabled())
		{
			System.out.println("Button is visible");
		}
		else
		{
			System.out.println("Button is disable");
		}
		
		InputTextarea.sendKeys("Testing");
		checkbox.get(0).click();
		checkbox.get(1).click();
		ButtonVisible.click();
		Thread.sleep(1000);
		
		EmergencyEmail.click();
		InputTextarea.sendKeys("Testing");
		//ButtonVisible.click();
	}
	
	
	
	public void ManageSongs() throws InterruptedException
	{
		ManageSongs.click();
		AddSongs.click();
		SongInputName.sendKeys("ABCD");
		driver.switchTo().frame(0);
		text.sendKeys("Test");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		AddSongIcon.click();
		
		NameofSong.sendKeys("ACD");
		Duration.sendKeys("1");
		URL.sendKeys("C:\\Users\\05122103\\Documents\\Logo.jpg");
		SongsFileUpload.sendKeys("C:\\Users\\05122103\\Documents\\Logo.jpg");
		img.sendKeys("C:\\Users\\05122103\\Documents\\Logo.jpg");
		driver.switchTo().defaultContent();
		Save.click();
		
		
		SearchOption.sendKeys("ABCD");
		Thread.sleep(1000);
		SearchOption.sendKeys(Keys.TAB);
		
		EditNotification.click();
		InputTitle.clear();
		InputTitle.sendKeys("Testing");
		
		Update.click();
		Thread.sleep(1000);
		SearchOption.clear();
		SearchOption.sendKeys("Testing");
		Thread.sleep(1000);
		SearchOption.sendKeys(Keys.TAB);

		Delete.click();
		DeleteButton.click();
		
	}
	

}