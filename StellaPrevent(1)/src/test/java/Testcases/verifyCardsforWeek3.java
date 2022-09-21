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
import Resources.Base;

public class verifyCardsforWeek3  extends Base {
	
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
		Week3 objweek3 = new Week3(driver);
		objweek3.goToMOdules();
	}
	
	@Test(priority=3)
	public void checkWeek3Day1() throws InterruptedException
	{
		Week3 objw3d1 = new Week3(driver);
		objw3d1.chkw3day1();
		
	}
	
	@Test(priority=4)
	public void checkWeek3Day2() throws InterruptedException
	{
		Week3 objw3d2 = new Week3(driver);
		objw3d2.chkw3day2();
		
		
	}
	
	@Test(priority=4)
	public void checkWeek3Day3() throws InterruptedException
	{
		Week3 objw3d3 = new Week3(driver);
		objw3d3.chkw3day3();
	}
	
	@Test(priority=5)
	public void checkWeek3Day4() throws InterruptedException
	{
		Week3 objw3d4 = new Week3(driver);
		objw3d4.chkw3day4();
	}
	
	@Test(priority=6)
	public void checkWeek3Day5() throws InterruptedException
	{
		Week3 objw3d5 = new Week3(driver);
		objw3d5.chkw3day5();
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
