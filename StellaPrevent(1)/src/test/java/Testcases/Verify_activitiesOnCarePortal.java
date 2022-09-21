package Testcases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Activity;
import PageObjects.HospitalAdmin_LoginPage;
import PageObjects.MainPage;
import PageObjects.Mood;
import PageObjects.Profile_stellaLite;
import PageObjects.ReactNative;
import PageObjects.StellaLite_SleepTracker;
import Resources.Base;

public class Verify_activitiesOnCarePortal extends Base {

	WebDriver driver;

	
	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("ReactNativeLogin"));
	}
		  
		  
		@Test(priority = 1)
		public void reactnativeCheckURLBeforLogin() throws IOException, InterruptedException {
			
			
			

			ReactNative objreactnative = new ReactNative(driver);
			objreactnative.checkUrlOnReactnative();
			
		}
		@Test(priority = 2)
		public void logintoReactnative_CheckUrlafterLogin() throws IOException, InterruptedException {
			
			ReactNative objreactnative1 = new ReactNative(driver);
			objreactnative1.SigninStellaLite(prop.getProperty("BasicUserEmail"), prop.getProperty("Password"));
			objreactnative1.checkUrlOnReactnative();
		Thread.sleep(6000);
		}
		
		@Test(priority = 3)
		public void enterSleepData() throws IOException, InterruptedException {
		
		  StellaLite_SleepTracker objectsleeptracker = new StellaLite_SleepTracker(driver);
		objectsleeptracker.SleepTracker();
		  
		}
		@Test(priority = 4)
		public void verifySleepDataOnPortal() throws IOException, InterruptedException {
		
			 StellaLite_SleepTracker object = new StellaLite_SleepTracker(driver);
		  ((JavascriptExecutor) driver).executeScript("window.open()");
		  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(1));
		  
		  driver.get(prop.getProperty("HospitalURL")); Thread.sleep(2000);
		  HospitalAdmin_LoginPage h = new HospitalAdmin_LoginPage(driver);
		  
		  h.Login(prop.getProperty("HospitalUsername1"),prop.getProperty("HospitalPassword1"));
		  object.CareportalDashboardcheck_sleepDataCheck(prop.getProperty("BasicUserFirstName"));
		  
		  driver.switchTo().window(tabs.get(0)); driver.navigate().refresh();
		  
		  
		  
		
		}
		@Test(priority = 6)
		public void enterMoodData() throws IOException, InterruptedException {
		
		  Mood objectmood = new Mood(driver);
		  objectmood.saveMood();
		}
		
		@Test(priority = 7)
		public void verifyMoodDataonportal() throws IOException, InterruptedException {
			 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(1));
		  Mood objectmood = new Mood(driver);
		  objectmood.CareportalDashboardcheck_MoodDataCheck(prop.getProperty("BasicUserFirstName"));
		  
		  driver.switchTo().window(tabs.get(0)); driver.navigate().refresh();
		  
		}
		@Test(priority = 8)
		public void enterdailyactivity() throws IOException, InterruptedException {
		  Activity objectActivity = new Activity(driver); 
		  objectActivity.pleasantactivity();
		  objectActivity.dailyactivity();
		}
		@Test(priority = 8)
		public void verifydailyactivityonPortal() throws IOException, InterruptedException {
			
		  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(1));
		  Activity objectActivity = new Activity(driver); 
		  objectActivity.CareportalDashboardcheck_ActivityDataCheck(prop.getProperty("BasicUserFirstName"));
		 
		  driver.switchTo().window(tabs.get(0));
		}
		
		@Test(priority = 8)
		public void updateprofile() throws IOException, InterruptedException {
		  Profile_stellaLite objectprofile = new Profile_stellaLite(driver); 
		  objectprofile.Profile();
		}
		@Test(priority = 9)
		public void logoutReacctnative() throws IOException, InterruptedException {
		  ReactNative objreactnative1 = new ReactNative(driver);
		  objreactnative1.logout();
		  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(1));
		  Activity objectActivity = new Activity(driver); 
		  objectActivity.deletepat(prop.getProperty("BasicUserFirstName"));
		 
		  
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


