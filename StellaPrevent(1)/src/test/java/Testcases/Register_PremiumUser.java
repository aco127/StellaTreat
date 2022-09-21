package Testcases;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HospitalAdmin_LoginPage;
import PageObjects.MainPage;
import Resources.Base;
import Resources.Common;

public class Register_PremiumUser extends Base {

	WebDriver driver;

	String Email,FirstName,MobileNo;


	

	@BeforeTest
	public void launchBrowser() throws IOException {

		driver = initializeBrowser();
		driver.get(prop.getProperty("URL"));
		
		Common cm=new Common(driver);
		 Email=cm.randomPtEmail();
		 FirstName=cm.generateRandomString();
		 MobileNo=cm.randomPhns();
		
	}
	
	@Test(priority = 1)
	public void getStarted_PremiumUSer() throws InterruptedException, IOException {

		MainPage objectmainPage= new MainPage(driver);

		
		objectmainPage.register();
		objectmainPage.emailregister(FirstName,Email,MobileNo,prop.getProperty("Password"));
		objectmainPage.selectpremiumplan(Email,prop.getProperty("CardNo"),prop.getProperty("expcode"),prop.getProperty("CVV"),FirstName,prop.getProperty("ZIPcode"));
	}
	
	@Test(priority = 2)
	public void VerifyEmailForPremiumUser() throws InterruptedException, IOException {
		MainPage objectmainPage= new MainPage(driver);

		objectmainPage.checkmail(Email,prop.getProperty("Password"));

	}
	@Test(priority = 3)
	public void verifyPatientAddedOnHospitalPortal() throws InterruptedException, IOException {
	
	driver.get(prop.getProperty("HospitalURL"));
	
		 HospitalAdmin_LoginPage h = new HospitalAdmin_LoginPage(driver); 
			h.Login(prop.getProperty("HospitalUsername1"),prop.getProperty("HospitalPassword1"));
			MainPage objectmainPage= new MainPage(driver);
			objectmainPage.CheckPatientAddedonHospitalCareportal(FirstName);
					
	}

	
	 


	@AfterMethod
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
	}
}
