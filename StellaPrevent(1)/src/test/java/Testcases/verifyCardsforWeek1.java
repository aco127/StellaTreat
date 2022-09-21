package Testcases;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HospitalAdmin_LoginPage;
import PageObjects.MainPage;
import PageObjects.ReactNative;
import PageObjects.StellaLite_SleepTracker;
import PageObjects.Week1;
import Resources.Base;

public class verifyCardsforWeek1 extends Base {
	WebDriver driver;
	
	
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeBrowser();		
		driver.get(prop.getProperty("ReactNativeLogin"));
		
		
	}
	
	
	@Test(priority = 1)
	
	
	public void reactNativeLogin() throws InterruptedException {
		
		ReactNative objreactnative1 = new ReactNative(driver);
		objreactnative1.SigninStellaLite(prop.getProperty("BasicUserEmail"), prop.getProperty("Password"));
	}
	
	
	
	  @Test(priority=2) public void checkweekoneDay1() throws IOException,
	  InterruptedException {
	  
	  
	  Week1 objweek1d1 = new Week1(driver);
	  objweek1d1.checkwk1d1();
	  
	  }
	  
	  
	  
	  
	  @Test(priority=4) public void checkweekoneDay2() throws IOException,
	  InterruptedException {
	  
	  Week1 objweek1d2 = new Week1(driver); objweek1d2.checkwk1d2();
	  
	  }
	  
	  
	  @Test(priority=5) public void checkweekoneDay3() throws IOException,
	  InterruptedException {
	  
	  Week1 objweek1d3 = new Week1(driver); objweek1d3.checkwk1d3();
	  
	  }
	  
	  
	  @Test(priority=6) public void checkweekoneDay4() throws IOException,
	  InterruptedException {
	  
	  Week1 objweek1d4 = new Week1(driver);
	  objweek1d4.checkwk1d4();
	  
	  }
	  
	 
				  @Test(priority=7) public void checkweekoneDay5() throws IOException,
				  InterruptedException {
				  
				  Week1 objweek1d5 = new Week1(driver); objweek1d5.checkwk1d5();
				  
				  }
				 
			 
		  
		  @AfterTest
		  
		  public void tearDown(ITestResult result) {
		  if(ITestResult.FAILURE==result.getStatus()) { try { TakesScreenshot
		  ts=(TakesScreenshot)driver; File source=ts.getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(source, new File("./Screenshots/"+result.getName()+".png"));
		  System.out.println("Screenshot taken"); } catch (Exception e) {
		  System.out.println("Exception while taking screenshot "+e.getMessage()); } }
		  
		  //driver.quit();
		  
		  }
		 
}