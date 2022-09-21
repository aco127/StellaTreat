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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HospitalAdmin_LoginPage;
import PageObjects.MainPage;
import Resources.Base;
import Resources.UpdateProperty;

public class ForgetPassword extends Base {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("ReactNativeLogin"));
		UpdateProperty yp = new UpdateProperty();
		yp.updateconfig("Password", prop.getProperty("NewPassword"));
	}
	
	  @Test(priority=11) public void ForgetPass() throws InterruptedException,
	  IOException
	  { 
		 
	  MainPage m = new MainPage(driver);
		  m.stellforgotpassword(prop.getProperty("BasicUserEmail"),prop.getProperty("NewPassword"));
		 
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
		// close application
		driver.quit();
		
			/*
			 * Screenshot ss=new Screenshot(); ss.getscreenshot(result);
			 */
		
		}

	}

