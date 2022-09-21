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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HospitalAdmin_LoginPage;
import PageObjects.MainPage;
import PageObjects.ReactNative;
import PageObjects.StellaLite_SleepTracker;
import PageObjects.Week1;
import Resources.Base;

public class verifyCardsforWeek_EPDS extends Base {
	WebDriver driver;

	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("HospitalURL"));
	}

	
	  @Test(priority = 1) public void AssigneAssesment() throws
	  InterruptedException, IOException {
	  
	  HospitalAdmin_LoginPage Hospital=new HospitalAdmin_LoginPage(driver);
	  Hospital.Login(prop.getProperty("HospitalUsername"),prop.getProperty(
	  "HospitalPassword"));
	  Hospital.AssesmentAssign(prop.getProperty("BasicUserFirstName"));
	  Hospital.AssesmentPatientStatus(prop.getProperty("BasicUserFirstName"));
	  
	  }
	  
	  @Test(priority = 2) public void reactNativeLogin() throws
	  InterruptedException { ((JavascriptExecutor)
	  driver).executeScript("window.open()"); ArrayList<String> tabs = new
	  ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	  driver.get(prop.getProperty("ReactNativeLogin")); ReactNative objreactnative1
	  = new ReactNative(driver);
	  objreactnative1.SigninStellaLite(prop.getProperty("BasicUserEmail"),
	  prop.getProperty("Password")); }
	  
	  @Test(priority=3) public void checkweekoneDay1() throws IOException,
	  InterruptedException {
	  
	  
	  Week1 objweek1d1 = new Week1(driver); objweek1d1.checkwk1d1();
	  
	  }
	  
	  @Test(priority=4) public void CheckAssigneAssesmentStatusafterdailyLearning()
	  throws IOException, InterruptedException { ArrayList<String> tabs = new
	  ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(0)); HospitalAdmin_LoginPage Hospital=new
	  HospitalAdmin_LoginPage(driver);
	  Hospital.assesmentstatuscheckafterdailylearining(prop.getProperty("BasicUserFirstName"));
	  
	  
	  }
	  
	 
	@Test(priority = 4)
	public void ValidateonEmail() throws IOException, InterruptedException {
		HospitalAdmin_LoginPage Hospital = new HospitalAdmin_LoginPage(driver);
		Hospital.checkmail(prop.getProperty("BasicUserEmail"));
		Hospital.verifymail();
		driver.quit();

	}

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
	}
}