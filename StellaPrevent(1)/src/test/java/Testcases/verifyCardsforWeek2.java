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

import PageObjects.MainPage;
import PageObjects.ReactNative;
import PageObjects.Week1;
import PageObjects.Week2;
import Resources.Base;

public class verifyCardsforWeek2 extends Base {
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("ReactNativeLogin"));
	}
	
	
	@Test(priority=1)
	public void checkweektwoDay1() throws IOException, InterruptedException
	{
		
		ReactNative objreactnative = new ReactNative(driver);
		objreactnative.SigninStellaLite(prop.getProperty("BasicUserEmail"), prop.getProperty("Password"));
		Thread.sleep(4000);

		Week2 week2Day1 = new Week2(driver);
		
		
		week2Day1.checkweek2Day1();
		 
	}
	@Test(priority=2)
	public void checkweektwoDay2() throws IOException, InterruptedException
	{
		
		Week2 week2Day2 = new Week2(driver);
		
		
		week2Day2.checkweek2Day2();
		 
	}
	@Test(priority=3)
	public void checkweektwoDay3() throws IOException, InterruptedException
	{
		
		Week2 week2Day3 = new Week2(driver);
		week2Day3.checkweek2Day3();
		 
	}
	@Test(priority=4)
	public void checkweektwoDay4() throws IOException, InterruptedException
	{
		
		Week2 week2Day4 = new Week2(driver);
		week2Day4.checkweek2Day4();
		 
	}
	@Test(priority=5)
	public void checkweektwoDay5() throws IOException, InterruptedException
	{
		
		Week2 week2Day5 = new Week2(driver);
		week2Day5.checkweek2Day5();
		 
	}
		
		  
		


	 
	@AfterTest
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
