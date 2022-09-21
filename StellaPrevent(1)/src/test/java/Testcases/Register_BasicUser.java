
package Testcases;

import java.io.File;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HospitalAdmin_LoginPage;
import PageObjects.MainPage;
import Resources.Base;
import Resources.Common;
import Resources.UpdateProperty;

public class Register_BasicUser extends Base {

	WebDriver driver;

	String Emails,FirstNames, MobileNo;
	MainPage m = new MainPage(driver);
	 
	
	@BeforeTest
	public void launchBrowser() throws IOException 
	{
		driver = initializeBrowser();
		driver.get(prop.getProperty("URL"));
		Common cm=new Common(driver);
		 Emails=cm.randomPtEmail();
		 FirstNames=cm.generateRandomString();
		 MobileNo=cm.randomPhns();
		 String Mob=String.valueOf(MobileNo);  
			
			UpdateProperty yp = new UpdateProperty();
			yp.updateconfig("BasicUserEmail", Emails);
			yp.updateconfig("BasicUserFirstName", FirstNames);
			yp.updateconfig("BasicUserMobileNum", Mob);
	}
	
	
	@Test(priority = 1)
	public void getStarted_BasicUer() throws InterruptedException, IOException {
		MainPage m = new MainPage(driver);
		 
		m.register();
		 m.emailregister(FirstNames,Emails,MobileNo,prop.getProperty("Password"));
		m.selectBasicPlan();
	}
	
	
	@Test(priority = 2)
	public void VerifyEmailForBasicUser() throws InterruptedException
	{	MainPage m = new MainPage(driver);
		m.checkmail(Emails,prop.getProperty("Password"));
	}
	
	
	@Test(priority = 3)
	public void verifyPatientAddedOnHospitalPortal() throws InterruptedException
	{
		MainPage m = new MainPage(driver);
		driver.get(prop.getProperty("HospitalURL"));
		HospitalAdmin_LoginPage h = new HospitalAdmin_LoginPage(driver);
		h.Login(prop.getProperty("HospitalPassword1"),prop.getProperty("HospitalPassword1"));
		m.CheckPatientAddedonHospitalCareportal(FirstNames);

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
