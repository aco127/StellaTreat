package PageObjects;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Careportal_Program {

	WebDriver driver;

	public Careportal_Program(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//span[@class='menu-sidebar' and text()='Program']")
	WebElement program;

	@FindBy(xpath="//td[contains(text(),'Postpartum Depression')]//following::td/img[@title='Assign Patient']")
	List<WebElement> PPTassign;
	
	@FindBy(xpath="(//td[contains(text(),'MamaLift-Test')]/following::img)[2]")
	WebElement programclick;
	
	

	@FindBy(xpath="//mat-select[@formcontrolname='patient_ids']//div[@class='mat-select-arrow']")
	WebElement Pids;
	
	//@FindBy(xpath="//span[@class='ng-star-inserted' and text()='testing user ']")
	@FindBy(xpath="//span[@class='mat-option-text']")
	WebElement selectpatient;

	/*
	 * @FindBy(
	 * xpath="//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']"
	 * ) WebElement Backdrop;
	 */

	@FindBy(xpath="//button[@class='mat-raised-button sym-btn' and text()=' Submit ']")
	WebElement Submit;

	@FindBy(xpath="//button[@class='mat-raised-button sym-btn' and text()=' Cancel ']")
	WebElement Cancel;

	@FindBy(xpath="//td[normalize-space()='Module 1 testing']//following::td/img[@title='Assign Journal']")
	WebElement Journal;

	@FindBy(xpath="//div[@class='mat-select-arrow-wrapper']")
	WebElement JournalList;

	@FindBy(xpath="//span[@class='mat-option-text' and text()='test ']")
	WebElement selectjournal;
	
	@FindBy(xpath="//button[contains(text(),' Add Program ')]")
	WebElement AddPrograms;
	
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement ProgramName;
	
	@FindBy(xpath="//input[@placeholder='LMS program id(Optional)']")
	WebElement LMSProgramID;
	
	@FindBy(xpath="//input[@placeholder='LMS Instance id(Optional)']")
	WebElement LMSInstanceID;
	
	@FindBy(xpath="//input[@placeholder='Week']")
	WebElement Duration;

	@FindBy(xpath="//span[contains(text(),' Add ')]")
	WebElement AddButton;
	
	@FindBy(xpath="//input[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']")
	WebElement SearchOption;
	
	@FindBy(xpath="//img[@title='Edit Program']")
	WebElement EditProgram;
	
	@FindBy(xpath="//span[contains(text(),' Update ')]")
	WebElement UpdateProgram;
	
	@FindBy(xpath="//img[@title='Symptom']")
	WebElement Symptoms;
	
	@FindBy(xpath="//button[@class='mat-raised-button sym-btn ng-star-inserted' and text()='Add']")
	WebElement AddButtons;
	
	@FindBy(xpath="//input[@placeholder='Symptom']")
	WebElement AddSymptoms;
	
	@FindBy(xpath="//select[@formcontrolname='priority']")
	WebElement PriorityDropDown;
	
	@FindBy(xpath="//option[contains(text(),'High')]")
	WebElement HighOption;
	
	@FindBy(xpath="//select[@formcontrolname='week']")
	WebElement WeekdropDown;
	
	@FindBy(xpath="//option[contains(text(),'Week 1')]")
	WebElement Week1;
	
	@FindBy(xpath="//select[@formcontrolname='day']")
	WebElement DayDropDown;
	
	@FindBy(xpath="//option[contains(text(),'Day 1')]")
	WebElement Day1;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement SaveButton;
	
	@FindBy(xpath="//button[contains(text(),' Close ')]")
	WebElement CloseButton;
	
	@FindBy(xpath="//i[@class='fa fa-pencil-square-o']")
	WebElement EditSymptoms;
	
	@FindBy(xpath="//button[contains(text(),' Update ')]")
	WebElement UpdateButton;

	@FindBy(xpath="//i[@class='fa fa-trash delete-icon']")
	WebElement DeleteIcon;
	
	@FindBy(xpath="//h2[@class='swal2-title']")
	WebElement Msg;
	
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement DeleteButton; 
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement OkButton;
	
	@FindBy(xpath="//img[@title='Delete Program']")
	WebElement DeleteProgram;

	@FindBy(xpath="//img[@title='Side-Effect']") WebElement sideeffect;
	
	@FindBy(xpath="//input[@type='text']") WebElement SideEffectName;
	
	@FindBy(xpath="//img[@title='Assign Journal']") WebElement Assign_Journal;
	@FindBy(xpath="(//div[@class='mat-select-value'])[2]")
	WebElement dropp;
	
	@FindBy(xpath="(//div[@class='mat-select-value'])[2]")
	WebElement dropj;
	
	@FindBy(xpath="//span[contains(text(),'Stella HFT Journal ')]")
	WebElement StellaHFTJournal;
	
	@FindBy(xpath="//img[@title='Playlist Setup']") WebElement Playlist_Setup;
	
	@FindBy(xpath="(//input[@type='number'])[1]") WebElement Mood_Tracker;
	@FindBy(xpath="(//input[@type='number'])[2]") WebElement Sleep_Tracker;
	@FindBy(xpath="(//input[@type='number'])[3]") WebElement Actiity_Tracker;
	@FindBy(xpath="(//input[@type='number'])[4]") WebElement Care_Corner;
	@FindBy(xpath="(//button[@class='mat-raised-button sym-btn'])[1]") WebElement Save;
	@FindBy(xpath="//img[@title='Assign Patient']") WebElement assignPatient;
	
	@FindBy(xpath="(//span[contains(text(),'Nidhi Test ')])[1]") WebElement NidhiTest;
	@FindBy(xpath="(//button[contains(text(),' Submit ')]") WebElement SubmitButton;
	@FindBy(xpath="//span[contains(text(),'Cancel')]") WebElement CancelButton;
	
	
	
	
	
//	public void clickSideEffect() {
//		sideeffect.click();
//	}
	
	
	String ProgramNames="Dnew";
	public void AddPrograms() throws InterruptedException
	{   Thread.sleep(500);
		program.click();
		
		
		  AddPrograms.click(); ProgramName.sendKeys(ProgramNames);
		  LMSProgramID.sendKeys("ABC123"); LMSInstanceID.sendKeys("AB12");
		  Duration.sendKeys("6"); AddButton.click();
		  try {
			  CancelButton.click();
		  }catch (Exception e) {
			e.printStackTrace();
		}
		  Thread.sleep(1000);
		  SearchOption.clear(); SearchOption.sendKeys(ProgramNames);
		  SearchOption.sendKeys(Keys.TAB); Thread.sleep(500);
		  EditProgram.click();
		  Duration.clear(); Duration.sendKeys("7"); UpdateProgram.click();
		  Thread.sleep(1000);
		 
	
	}
	
	public void Actionperform() throws InterruptedException
	{
		SearchOption.clear();
		SearchOption.sendKeys(ProgramNames);
		SearchOption.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		SearchOption.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		Symptoms.click();
		AddButtons.click();
		AddSymptoms.sendKeys("Cough");
		PriorityDropDown.click();
		HighOption.click();
		PriorityDropDown.click();
		WeekdropDown.click();
		Week1.click();
		WeekdropDown.click();
		DayDropDown.click();
		Day1.click();
		Thread.sleep(500);
		SaveButton.click();
		CloseButton.click();
		Symptoms.click();
		Thread.sleep(500);
		EditSymptoms.click();
		AddSymptoms.clear();
		AddSymptoms.sendKeys("Cold");
		UpdateButton.click();
		Thread.sleep(500);
		DeleteIcon.click();
		System.out.println(Msg.getText());
		DeleteButton.click();
		Thread.sleep(1000);
		OkButton.click();
		Thread.sleep(1000);
		CloseButton.click();
		
		
		
		
		/*sideeffect.click();
		
		SideEffectName.sendKeys("abc");
		PriorityDropDown.click();
		HighOption.click();
		PriorityDropDown.click();
		*/
		
		
		Assign_Journal.click();
		Thread.sleep(5000);
		dropp.click();
		Thread.sleep(6000);
		selectpatient.click();
		Thread.sleep(6000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(6000);
	
		dropj.click();
		Thread.sleep(8000);
 
JavascriptExecutor js = (JavascriptExecutor) driver; 
js.executeScript("arguments[0].click();", StellaHFTJournal);
		
		StellaHFTJournal.click();
		Thread.sleep(6000);
		action.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(6000);
		Submit.click();
		Thread.sleep(6000);
		  Playlist_Setup.click(); Mood_Tracker.clear(); Mood_Tracker.sendKeys("4");
		  Sleep_Tracker.clear(); Sleep_Tracker.sendKeys("44"); Actiity_Tracker.clear();
		  Actiity_Tracker.sendKeys("44"); Care_Corner.sendKeys("55");
		  
		  Save.click();
		 
		
		/*
		 * assignPatient.click(); dropp.click(); Thread.sleep(1000); JavascriptExecutor
		 * js = (JavascriptExecutor) driver; js.executeScript("arguments[0].click();",
		 * NidhiTest); dropp.click(); SubmitButton.click();
		 */		


	}
	
	public void DeletePRogram() throws InterruptedException
	{SearchOption.clear();
		SearchOption.sendKeys(ProgramNames);
		Thread.sleep(1000);
		SearchOption.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		DeleteProgram.click();
		System.out.println(Msg.getText());
		DeleteButton.click();
	}
	public void assignpatientPPD(String FirstNames) throws InterruptedException 
	{
		program.click();
		programclick.click();
		Thread.sleep(8000);
		Pids.click();
		Thread.sleep(8000);
		WebElement name=driver.findElement(By.xpath("//span[contains(text(),'"+FirstNames+"')]"));
		
		name.click();
		Actions action = new Actions(driver);
				action.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(5000);
		Submit.click();
	}

	public void assignjournal() throws InterruptedException
	{
		program.click();
		Journal.click();
		Thread.sleep(5000);
		List<WebElement> JournalList = driver.findElements(By.xpath("//div[@class='mat-select-arrow-wrapper']"));
		JournalList.get(1).click();
		//JournalList.click();
		selectjournal.click();
		Thread.sleep(5000);
		WebElement Backdrop = driver.findElement(By.xpath("//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Backdrop);
		Submit.click();



	}

}