package PageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.Assertion;
import org.junit.Assert;

public class HospitalAdmin_LoginPage {

	WebDriver driver;
	Properties prop;

	public HospitalAdmin_LoginPage(WebDriver driver) {
		
 this.driver = driver; PageFactory.initElements(driver, this);
		 
	}

	@FindBy(xpath = "//input[@id='InputEmail']")
	WebElement emailaddress;

	@FindBy(xpath = "//input[@formcontrolname='password']")
	WebElement password;

	@FindBy(xpath = "//span[contains(text(),' LOGIN ')]")
	WebElement loginbtn;

	@FindBy(xpath = "//a[@class='forget-password']")
	WebElement forgotpassword;
	
	@FindBy(xpath="//span[contains(text(),'Ebix')]")
	WebElement EbixBtn;
	
	@FindBy(xpath="//div[@class='mat-menu-content']")
	WebElement SignOut;
	
	@FindBy(xpath="//span[contains(text(),'Assessment')]")
	WebElement AssesmentTab;
	
	@FindBy(xpath="//button[contains(text(),' Assign to Patient ')]")
	WebElement AssignAssesmnettoPatient;
	

	@FindBy(xpath="//mat-select[@formcontrolname='patientName']//div[@class='mat-select-arrow']") 
	WebElement Patientdropdown;
	
	@FindBy(xpath="//mat-select[@formcontrolname='assessmentId']//div[@class='mat-select-arrow']")
	WebElement Assessmentdropdown;
	
	@FindBy(xpath="//span[@class='mat-option-text' and text()='Daily Assessment']")
	WebElement DailyAssessment;

	@FindBy(xpath="//span[@class='mat-option-text' and text()='EPDS Assessment']")
	WebElement EPDS;

	@FindBy(xpath="//button[@class='mat-raised-button save-btn-modal floatRight' and text()=' Submit ']")
	WebElement Submit;
	
	@FindBy(xpath="//span[contains(text(),'Patient List')]")
	WebElement PatientList;
	
	@FindBy(xpath="//input[@placeholder='Search by first/last/phone/email']")
	WebElement SearchUSer;
	
	@FindBy(xpath="//i[@title='Assessment List']")
	WebElement AssesmentList;
	
	@FindBy(xpath="//td[@class='mat-cell cdk-column-Name mat-column-Name ng-star-inserted']")
	WebElement AssesmentNme;
	
	@FindBy(xpath="//td[@class='mat-cell cdk-column-Status mat-column-Status ng-star-inserted']")
	WebElement Status;
	
	@FindBy(xpath="//td[@class='mat-cell cdk-column-AssessementType mat-column-AssessementType ng-star-inserted']")
	WebElement AssesmentType;
	
	@FindBy(xpath="//td[@class='edit-open-img text-left mat-cell cdk-column-Action mat-column-Action ng-star-inserted']")
	WebElement ViewIcon;
	
	@FindBy(xpath = "//input[@class='ycptinput']")
	WebElement emailyupmail;
	@FindBy(xpath = "//i[@class='material-icons-outlined f36']")
	WebElement checkinbox;
	
	@FindBy(xpath="(//button/div[contains(text(),'Resources and Help from MamaLift')])[1]")
	WebElement rolloutmailclick;
	
	@FindBy(xpath="//b[contains(text(),'NAMI: The National Alliance on Mental Illness:')]")
	WebElement rolloutmail;
	
	@FindBy(xpath="//b[contains(text(),'Find Help Now:')]")
	WebElement Tagvalue1;
	
	@FindBy(xpath="//b[contains(text(),'National Suicide Prevention Lifeline:')]")
	WebElement Tagvalue2;
	
	@FindBy(xpath="//b[contains(text(),'Crisis Text Line:')]")
	WebElement Tagvalue3;
	
	@FindBy(xpath="(//td)[4]")
	WebElement text;
	
	
	public  void Login(String Username,String Password ) throws InterruptedException 
	{
			Thread.sleep(4000);
	
	 emailaddress.sendKeys(Username); 
	  password.sendKeys(Password);
		Thread.sleep(2000);
	  loginbtn.click();
	  Thread.sleep(3000);
	

	}

	public String checkPageTitle()
	{
		String Title =driver.getTitle();
		return Title;
	}


	public void Logout()
	{  try {
		Thread.sleep(3000);
		EbixBtn.click();
		Thread.sleep(2000);
		SignOut.click();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	
	
	public void AssesmentAssign(String FirstName ) throws InterruptedException
	{
		Thread.sleep(1000);
		AssesmentTab.click();
		Thread.sleep(1000);
		AssignAssesmnettoPatient.click();
		Thread.sleep(1000);
		Patientdropdown.click();
		
		WebElement SelectPatient=driver.findElement(By.xpath("//span[contains(text(),'"+FirstName+"')]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", SelectPatient);
		
		Actions action = new Actions(driver);
				action.sendKeys(Keys.TAB).build().perform();
				Thread.sleep(4000);
				Assessmentdropdown.click();
				Thread.sleep(10000);
				JavascriptExecutor js = (JavascriptExecutor)driver;		
		       
			        js.executeScript("arguments[0].click();", EPDS);
				
				Thread.sleep(4000);
				action.sendKeys(Keys.TAB).build().perform();
				Thread.sleep(4000);
				Submit.click();
	}
	
	public void AssesmentPatientStatus(String FirstName ) throws InterruptedException
	{
		PatientList.click();
		Thread.sleep(2000);
		 SearchUSer.clear();
	        SearchUSer.sendKeys(FirstName);
	        Thread.sleep(700);
	        SearchUSer.sendKeys(Keys.TAB);
	        Thread.sleep(3000);
	        AssesmentList.click();
	        Thread.sleep(1000);
	        String Actual=AssesmentNme.getText();
	        String Expected="Feedback Survey";
	        Assert.assertEquals(Actual,Expected);
	        
	        String Actual1=Status.getText();
	        String Expected1="Completed";
	        Assert.assertEquals(Actual1,Expected1);
	        
	        String Actual2=AssesmentType.getText();
	        String Expected2="Screening";
	        Assert.assertEquals(Actual2,Expected2);
	        
	        if(ViewIcon.isEnabled())
	        {
	        	System.out.println("ViewIcon is Disabled");
	        }
	        else
	        {
	        	System.out.println("ViewIcon is enabled");
	        }
	        
	}
	
	
	
	
	
	
	
	
	
	
	public void checkmail(String Email) throws InterruptedException {
		Thread.sleep(2000);

		driver.get("https://yopmail.com/en/");
		Thread.sleep(2000);
		emailyupmail.clear();
		emailyupmail.sendKeys(Email);
		Thread.sleep(2000);
		checkinbox.click();
		Thread.sleep(2000);
		driver.switchTo().frame("ifinbox");
		Thread.sleep(4000);
		rolloutmailclick.click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("ifmail");
	
		
	}
	
	
	public void verifymail()
	{
		String act1=Tagvalue1.getText();
		String exp1="Find Help Now:";
		Assert.assertEquals(act1, exp1);
		
		String act2=Tagvalue2.getText();
		String exp2="National Suicide Prevention Lifeline:";
		Assert.assertEquals(act2, exp2);
		
		
		String act3=Tagvalue3.getText();
		String exp3="Crisis Text Line:";
		Assert.assertEquals(act3, exp3);
		
		
		String act4=rolloutmail.getText();
		String exp4="NAMI: The National Alliance on Mental Illness:";
		Assert.assertEquals(act4, exp4);
		
		
		String act5=text.getText();
	    String exp5="We are here to support you. If you find yourself struggling with symptoms of depression or anxiety, we want to provide you the below helpful resources to get help or support. It is recommended that you speak with a licensed healthcare professional as soon as possible if you feel that your health is worsening, you are in crisis, or are experiencing thoughts of harming yourself or others.The free resources below are available for you now – please use them!.";
		String Expected= exp5.replaceAll("[\\n\\t\\r ]", "");
		 String Actual=act5.replaceAll("[\\n\\t\\r ]", "");
		 Assert.assertEquals(Actual, Expected);
		
	}
	
	
	
	public void assesmentstatuscheckafterdailylearining(String FirstName ) throws InterruptedException
	{driver.navigate().refresh();
		PatientList.click();
		Thread.sleep(5000);
		 SearchUSer.clear();
	        SearchUSer.sendKeys(FirstName);
	        Thread.sleep(700);
	        SearchUSer.sendKeys(Keys.TAB);
	        Thread.sleep(3000);
	        AssesmentList.click();
	        Thread.sleep(1000);
	        String Actual=AssesmentNme.getText();
	        String Expected="EPDS Assessment";
	        Assert.assertEquals(Actual,Expected);
	        
	        String Actual1=Status.getText();
	        String Expected1="Completed";
	        Assert.assertEquals(Actual1,Expected1);
	        
	        String Actual2=AssesmentType.getText();
	        String Expected2="Screening";
	        Assert.assertEquals(Actual2,Expected2);
	        
	        if(ViewIcon.isEnabled())
	        {
	        	System.out.println("ViewIcon is enable");
	        }
	        else
	        {
	        	System.out.println("ViewIcon is Disabled");
	        }}
}
