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
import Resources.Base;

public class verifyCardsforWeek4  extends Base {
	
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
	
	@Test(priority=2)
	public void gotoWeekModues() throws InterruptedException
	{
		Week4 objweek4  = new Week4(driver);
		objweek4.goToMOdules();
	}
	
	@Test(priority=3)
	public void checkWeek4Day1() throws InterruptedException
	{
		Week4 objweek4d1 = new Week4(driver);
		objweek4d1.checkweek4Day1();
		
	}
	
	@Test(priority=4)
	public void checkWeek4Day2() throws InterruptedException
	{
		Week4 objweek4d2 = new Week4(driver);
		objweek4d2.chkwk4day2();
		
		
	}
	
	@Test(priority=4)
	public void checkWeek4Day3() throws InterruptedException
	{
		Week4 objweek4d3 = new Week4(driver);
		objweek4d3.chkwk4day3();
	}
	
	@Test(priority=5)
	public void checkWeek4Day4() throws InterruptedException
	{
		Week4 objweek4d4 = new Week4(driver);
		objweek4d4.chkwk4day4();
	}
	
	@Test(priority=6)
	public void checkWeek4Day5() throws InterruptedException
	{
		Week4 objweek4d5 = new Week4(driver);
		objweek4d5.chkweek4day5();
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