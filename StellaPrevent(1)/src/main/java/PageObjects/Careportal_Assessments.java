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

import Resources.Base;

public class Careportal_Assessments{
	WebDriver driver;

	public Careportal_Assessments(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[@class='menu-sidebar' and text()='Assessment']")
	WebElement Assessment;

	@FindBy(xpath="//button[@class='btn btn-add-con' and text()=' Assign to Patient ']")
	WebElement Assigntopt;

	@FindBy(xpath="//mat-select[@formcontrolname='patientName']//div[@class='mat-select-arrow']") 
	WebElement Patientdropdown;

	@FindBy(xpath="//mat-select[@formcontrolname='assessmentId']//div[@class='mat-select-arrow']")
	WebElement Assessmentdropdown;

	@FindBy(xpath="//span[@class='mat-option-text']")
	WebElement selectpatient;

	@FindBy(xpath="//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']")
	WebElement Backdrop;

	@FindBy(xpath="//span[@class='mat-option-text' and text()='Daily Assessment']")
	WebElement DailyAssessment;

	@FindBy(xpath="//span[@class='mat-option-text' and text()='EPDS']")
	WebElement EPDS;

	@FindBy(xpath="//button[@class='mat-raised-button save-btn-modal floatRight' and text()=' Submit ']")
	WebElement Submit;
	
	@FindBy(xpath="//span[@class='mat-option-text' and text()='EPDS Assessment']")
	WebElement EPDsS;
	
	
	@FindBy(xpath="//button[contains(text(),' Add New Assessment ')]")WebElement AddAssesment;
	@FindBy(xpath="//input[@placeholder='Assessment Name *']")WebElement EnterAssesmentName;
	@FindBy(xpath="//div[contains(text(),'Assign with register patient')]")WebElement Assignwithregisterpatient;
	@FindBy(xpath="//button[contains(text(),' Save ')]")WebElement SaveButton;

	public void Patientassignassessment(String FirstName) throws InterruptedException
	{
		Assessment.click();
		Thread.sleep(3000);
		Assigntopt.click();
		Thread.sleep(3000);
	Patientdropdown.click();
	Thread.sleep(3000);
	
	
	WebElement name=driver.findElement(By.xpath("//span[contains(text(),' "+FirstName+" ')]"));
	
	name.click();
	Thread.sleep(3000);
	Actions action = new Actions(driver);
			action.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(3000);
			Assessmentdropdown.click();
			Thread.sleep(2000);
			DailyAssessment.click();
			Thread.sleep(3000);
			EPDsS.click();
			action.sendKeys(Keys.TAB).build().perform();
			
			
			Thread.sleep(1000);
			Submit.click();
			
	}
	
	public void assignassessment(String FirstNames) throws InterruptedException
	{
		Assessment.click();
		Thread.sleep(4000);
		Assigntopt.click();
		Thread.sleep(4000);
	Patientdropdown.click();
	Thread.sleep(4000);
	WebElement name=driver.findElement(By.xpath("//span[contains(text(),' "+FirstNames+" ')]"));
	
	name.click();
	Actions action = new Actions(driver);
			action.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(4000);
			Assessmentdropdown.click();
			Thread.sleep(10000);
			JavascriptExecutor js = (JavascriptExecutor)driver;		
	        js.executeScript("arguments[0].click();", DailyAssessment);
			/* DailyAssessment.click(); */
			Thread.sleep(4000);
			
		        js.executeScript("arguments[0].click();", EPDS);
			
			Thread.sleep(4000);
			action.sendKeys(Keys.TAB).build().perform();
			Thread.sleep(4000);
			Submit.click();
			
	}
	
	public void AddNewAssement() throws InterruptedException
	{Assessment.click();
	Thread.sleep(4000);
		Thread.sleep(1000);
		AddAssesment.click();
		Thread.sleep(1000);
		EnterAssesmentName.sendKeys("ABCDEF");
		Thread.sleep(500);
		Assignwithregisterpatient.click();
		SaveButton.click();
		
	}

	}
	