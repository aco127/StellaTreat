package Testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.ReactNative;
import PageObjects.Week3;
import PageObjects.Week4;
import PageObjects.Week5;
import Resources.Base;

public class verifyCardsforWeek5  extends Base {
	
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
	
	
	
	  @Test(priority=3) public void checkWeek5Day1() throws InterruptedException {
	  Week5 objweek5d1 = new Week5(driver); 
	  objweek5d1.checkweek5Day1();
	  
	  }
	  
	  @Test(priority=4) public void checkWeek5Day2() throws InterruptedException {
	  Week5 objweek5d2 = new Week5(driver);
	  objweek5d2.checkweek5Day2();
	  
	  
	  }
	  
	  @Test(priority=4) public void checkWeek5Day3() throws InterruptedException {
	  Week5 objweek5d3 = new Week5(driver); 
	  objweek5d3.checkweek5Day3(); }
	 
	@Test(priority=5)
	public void checkWeek5Day4() throws InterruptedException
	{
		Week5 objweek5d4 = new Week5(driver);
		objweek5d4.checkweek5Day4();
	}
	
	@Test(priority=6)
	public void checkWeek5Day5() throws InterruptedException
	{
		Week5 objweek4d5 = new Week5(driver);
		objweek4d5.checkweek5Day5();
	}
	

	@AfterTest()
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
	
	driver.quit();
	

}
}
