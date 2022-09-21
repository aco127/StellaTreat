package Testcases;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.MainPage;
import Resources.Base;

public class Verify_LandingPage extends Base {

	WebDriver driver;

	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("URL"));

	}

	@Test(priority = 1)
	public void verifyHeaderLinks() throws InterruptedException {
		LandingPage landingpageobj = new LandingPage(driver);
		landingpageobj.checkHeaderLinks();

	}
	
	  @Test(priority=2) public void verifyFooterLinks() throws InterruptedException
	  { LandingPage landingpageobj1 = new LandingPage(driver);
	  landingpageobj1.checkFooterLinks(); }
	  
	  
	  
	  
	  @Test(priority=3) public void verifySocialLinks() throws InterruptedException
	  { LandingPage landingpageobj2 = new LandingPage(driver);
	  landingpageobj2.checkSocialLinks(); }
	  
	  @Test(priority=4) public void verifySigninLinks() throws InterruptedException
	  { LandingPage landingpageobj3 = new LandingPage(driver);
	  landingpageobj3.checksigninLink(); }
	  
	 

	@Test(priority = 5)
	public void verifyFooterText() throws InterruptedException {
		LandingPage landingpageobj4 = new LandingPage(driver);
		landingpageobj4.checkFooterText();
	}

	
	  @Test(priority=6) public void verifyGetstartedTabs() throws
	  InterruptedException {
	  
	  LandingPage landingpageobj5 = new LandingPage(driver);
	  landingpageobj5.checkGetstartedTabs(); }
	 

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(source, new File("./Screenshots/" + result.getName() + ".png"));
				System.out.println("Screenshot taken");
			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
		}

		// driver.quit();

	}

}
