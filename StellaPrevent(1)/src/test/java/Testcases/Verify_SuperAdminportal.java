package Testcases;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.MainPage;
import PageObjects.SuperAdmin_LoginPage;
import PageObjects.SuperAdmin_ManageArticles;
import PageObjects.SuperAdmin_ManageLanguage_Document;
import PageObjects.SuperAdmin_ManageNotifications;
import PageObjects.SuperAdmin_ManagePplan;
import PageObjects.SuperAdmin_ManageQuotes;
import PageObjects.SuperAdmin_ManageSubject;
import PageObjects.SuperAdmin_Managecontent;
import PageObjects.SuperAdmin_RegisterCustomer;
import PageObjects.SuperAdmin_RegisterSubAdmin;
import PageObjects.SuperAdmin_ReservedWords;
import Resources.Base;

public class Verify_SuperAdminportal extends Base {
	WebDriver driver;
	
	
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("AdminURL"));
	}
		
	
	
	@Test(priority=1)
	public void SuperadminLogin() throws IOException, InterruptedException
	{
		
		SuperAdmin_LoginPage objectsuperadmin = new SuperAdmin_LoginPage(driver);
		objectsuperadmin.Login(prop.getProperty("AdminUsername"),prop.getProperty("AdminPassword"));
		
	}
	
	  @Test(priority=2) public void manageNotification() throws IOException,
	  InterruptedException { Thread.sleep(1000); SuperAdmin_ManageNotifications
	  objmanageNotification = new SuperAdmin_ManageNotifications(driver);
	  objmanageNotification.ManageNotification(); Thread.sleep(700); }
	 
	
	  @Test(priority=3) public void ManageDoc_Language() throws IOException,
	  InterruptedException { Thread.sleep(1000); SuperAdmin_ManageLanguage_Document
	  objmanageDoc = new SuperAdmin_ManageLanguage_Document(driver);
	  driver.navigate().refresh();
	  objmanageDoc.ManageDoc();
	  objmanageDoc.ManageLanguage(); }
	  
	@Test(priority=4)
	public void managePlan() throws IOException, InterruptedException, AWTException
	{
		 SuperAdmin_ManagePplan objManageplan= new SuperAdmin_ManagePplan(driver);
		 driver.navigate().refresh();
		 objManageplan.ManagePlan();
		 Thread.sleep(700);
		 
	}
	
	
	  @Test(priority=5) public void manageQuotes() throws IOException,
	  InterruptedException { SuperAdmin_ManageQuotes manageQuotes= new
	  SuperAdmin_ManageQuotes(driver);
	  driver.navigate().refresh();
	  manageQuotes.ManageQuotes(); Thread.sleep(700);
	  
	  }
	  
	  @Test(priority=6) public void reserveWords() throws IOException,
	  InterruptedException { SuperAdmin_ReservedWords objreserveWords = new
	  SuperAdmin_ReservedWords(driver);
	  driver.navigate().refresh();
	  objreserveWords.ReserveWords();
	  Thread.sleep(700);
	  objreserveWords.EmailDistributionMail();
	  Thread.sleep(700);
	  
	  }
	  
	  @Test(priority=7) public void registerCustomer() throws IOException,
	  InterruptedException { 
		  SuperAdmin_RegisterCustomer objregisterCustomer = new SuperAdmin_RegisterCustomer(driver);
		  driver.navigate().refresh();
	  objregisterCustomer.registerCustomer(prop.getProperty("Custname"),prop.
	  getProperty("custphone"),prop.getProperty("CustEmail"),prop.getProperty(
	  "Password")); 
	  objregisterCustomer.editcustomer(prop.getProperty("Custname"));
	  Thread.sleep(700); }
	  
	/*`																																																																																							44*/
	  
	  @Test(priority=9) public void manageContent() throws IOException,
	  InterruptedException {
	  
	  SuperAdmin_Managecontent objregistersubadmin = new
	  SuperAdmin_Managecontent(driver);
	  driver.navigate().refresh();
	  objregistersubadmin.checkdataforWhatisStella();
	  objregistersubadmin.checkdataforHome();
	  objregistersubadmin.checkdataforTest();
	  objregistersubadmin.checkdataforStellaScience();
	  objregistersubadmin.checkdataforFAQ();
	  objregistersubadmin.checkdataforGetStarted(); Thread.sleep(700); }
	  

	  @Test(priority=9) public void NLPContent() throws IOException,
	  InterruptedException { 
		  Thread.sleep(1000); SuperAdmin_ManageArticles
	  NLPContent = new SuperAdmin_ManageArticles(driver);
		  NLPContent.NLPcontent();
	  
	  }
	  
	  @Test(priority=10) public void manageSubject() throws IOException,
	  InterruptedException {
		  
		  
		  
		  List<String> SubjectSuperadmin; List<String>
	  reactnativeSubject;
	  
	  SuperAdmin_ManageSubject objmanageSubject = new
	  SuperAdmin_ManageSubject(driver);
	  driver.navigate().refresh();
	  objmanageSubject.managesubject();
	  SubjectSuperadmin=objmanageSubject.verifyManagesubjectfield();
	  
	  driver.get(prop.getProperty("ReactNativeLogin"));
	  reactnativeSubject=objmanageSubject.CheckcontactUs();
	  
	  if(reactnativeSubject.containsAll(SubjectSuperadmin)) {
	  System.out.println("Data matched"); }
	  
	  else { System.out.println("Data does not matched"); } }
	  
	 

	@AfterTest
	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
	{
	try 
	{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(source, new File("./Screenshots/"+result.getName()+".png"));
	System.out.println("Screenshot taken");
	}
	catch (Exception e)
	{
	System.out.println("Exception while taking screenshot "+e.getMessage());
	} 
	}
	// close application
	//driver.quit();
	
	
	
	}
}