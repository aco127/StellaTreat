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
import org.testng.asserts.SoftAssert;

import PageObjects.Activity;
import PageObjects.Mood;
import PageObjects.ReactNative;
import PageObjects.StellaLite_SleepTracker;
import Resources.Base;

public class PerformActivity_ReactNative extends Base {
	WebDriver driver;

	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("ReactNativeLogin"));
	}

	@Test(priority = 1)
	public void reactNativeLogin() throws InterruptedException {
		ReactNative objreactnative = new ReactNative(driver);
		objreactnative.SigninStellaLite(prop.getProperty("BasicUserEmail"), prop.getProperty("Password"));
	}

	@Test(priority = 2)
	public void enterSleepTracker() throws InterruptedException {
		StellaLite_SleepTracker objsleeptracker = new StellaLite_SleepTracker(driver);
		//objsleeptracker.SleepTracker();
	}

	@Test(priority = 3)
	public void enterMoodTracker() throws InterruptedException {
		Mood objmood = new Mood(driver);

		String rsrc = objmood.saveMood1();
		//String erc = objmood.reactnativeReport();
		//SoftAssert as = new SoftAssert();

		//as.assertEquals(rsrc, erc);
		//as.assertAll();

	}

	@Test(priority = 4)
	public void enterDailyActivity() throws InterruptedException {
		Activity obactivity = new Activity(driver);
		obactivity.pleasantactivity();
		obactivity.dailyactivity();
	//	obactivity.checkactivityUnderReportsandSelected();
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
	
		/*
		 * Screenshot ss=new Screenshot(); ss.getscreenshot(result);
		 */
	
	}

}