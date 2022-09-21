package Testcases;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjects.Week1CountofCardsonPortal;
import PageObjects.Week2CardsCheckStellaLite;
import PageObjects.Week2CountofCardsonPortal;
import PageObjects.Week3CardsCheckStellaLite;
import PageObjects.Week3CountofCardsonPortal;
import PageObjects.Week4CardsCheckStellaLite;
import PageObjects.Week4CountofCardsonPortal;
import PageObjects.Week5CardsCheckStellaLite;
import PageObjects.Week5CountofCardsonPortal;
import PageObjects.HospitalAdmin_LoginPage;
import PageObjects.MainPage;
import PageObjects.ReactNative;
import PageObjects.Week1CardsCheckStellaLite;
import Resources.Base;

public class verifyCountofCards_ReactnativeToPortal extends Base {

	WebDriver driver;
	String[] d1, d2, d3, d4, d5;
	String[] w1, w2,w3,w4,w5;

	@Test(priority = 1)
	public void CardsCheckStellaLiteforWeek1() throws IOException, InterruptedException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("ReactNativeLogin"));
		ReactNative objreactnative = new ReactNative(driver);
		objreactnative.SigninStellaLite(prop.getProperty("BasicUserEmail"), prop.getProperty("Password"));
	
		Week1CardsCheckStellaLite cs = new Week1CardsCheckStellaLite(driver);
		
		  w1 = cs.checkcardcountsonappWeek1day1();
			
			  w2 =cs.checkcardcountsonappWeek1day2();
			  w3=cs.checkcardcountsonappWeek1day3(); w4 =
			  cs.checkcardcountsonappWeek1day4(); w5 = cs.checkcardcountsonappWeek1day5();
			 
		  
		  int w1l=w1.length;
		  int w2l=w2.length;
		  int w3l=w3.length;
		  int w4l=w4.length;
		  int w5l=w5.length;
			 


	  driver.get(prop.getProperty("HospitalURL"));
	  HospitalAdmin_LoginPage h = new  HospitalAdmin_LoginPage(driver);
		h.Login(prop.getProperty("HUsername"),prop.getProperty("HPassword"));
	  
	  Thread.sleep(9000); Week1CountofCardsonPortal c = new
	  Week1CountofCardsonPortal(driver);
	  
	  d1= c.checkweek1day1card();
	  d2=c.checkweek1day2card(); 
	  d3=c.checkweek1day3card();
	  d4=c.checkweek1day4card();
	  d5=c.checkweek1day5card();
	  
	  int d1l=d1.length;
	  int d2l=d2.length;
	  int d3l=d3.length;
	  int d4l=d4.length;
	  int d5l=d5.length;
	

	  
	  
		
		  if(w1l==d1l) { System.out.println("Week 1 Day 1 Data Matched"); } else {
		  System.out.println("Week 1 Day 1 Data does not Matched"); }
		  
		  if(w2l==d2l) { System.out.println("Week 1 Day 2 Data Matched"); } else {
		  System.out.println("Week 1 Day 2 Data does not Matched"); }
		  
		  if(w3l==d3l) { System.out.println("Week 1 Day 3 Data Matched"); } else {
		  System.out.println("Week 1 Day 3 Data does not Matched"); }
		  
		  if(w4l==d4l) { System.out.println("Week 1 Day 4 Data Matched"); } else {
		  System.out.println("Week 1 Day 4 Data does not Matched"); }
		  
		  if(w5l== d5l) {System.out.println("Week 1 Day 5 Data Matched"); } else {
		  System.out.println("Week 1 Day 5 Data does not Matched"); }
		  
		 
	  
	  
	  driver.quit(); 
	  }
	
		@Test(priority = 2)
		public void CardsCheckStellaLiteforWeek2() throws IOException, InterruptedException {
			driver = initializeBrowser();
			driver.get(prop.getProperty("SURL"));
			ReactNative objreactnative = new ReactNative(driver);
			objreactnative.SigninStellaLite(prop.getProperty("BasicUserEmail"), prop.getProperty("Password"));

			Week2CardsCheckStellaLite cs = new Week2CardsCheckStellaLite(driver);

			w1 = cs.checkcardcountsonappWeek2day1();

			
			  w2 =cs.checkcardcountsonappWeek2day2();
			  w3 =cs.checkcardcountsonappWeek2day3(); 
			  w4 = cs.checkcardcountsonappWeek2day4();
			  w5 = cs.checkcardcountsonappWeek2day5();
			 
			  int w1l=w1.length;
			  int w2l=w2.length;
			  int w3l=w3.length;
			  int w4l=w4.length;
			  int w5l=w5.length;

			driver.get(prop.getProperty("HospitalURL"));
			HospitalAdmin_LoginPage h = new HospitalAdmin_LoginPage(driver);
			h.Login(prop.getProperty("HUsername"),prop.getProperty("HPassword"));
			Thread.sleep(9000);
			Week2CountofCardsonPortal c = new Week2CountofCardsonPortal(driver);

			d1 = c.checkweek2day1card();

			
			  d2=c.checkweek2day2card();
			  d3=c.checkweek2day3card();
			  d4=c.checkweek2day4card();
			  
			  d5=c.checkweek2day5card();
			  
			  int d1l=d1.length;
			  int d2l=d2.length;
			  int d3l=d3.length;
			  int d4l=d4.length;
			  int d5l=d5.length;
			 
			  if(w1l==d1l) { System.out.println("Week 2 Day 1 Data Matched"); } else {
				  System.out.println("Week 2 Day 1 Data does not Matched"); }
				  
				  if(w2l==d2l) { System.out.println("Week 2 Day 2 Data Matched"); } else {
				  System.out.println("Week 2 Day 2 Data does not Matched"); }
				  
				  if(w3l==d3l) { System.out.println("Week 2 Day 3 Data Matched"); } else {
				  System.out.println("Week 2 Day 3 Data does not Matched"); }
				  
				  if(w4l==d4l) { System.out.println("Week 2 Day 4 Data Matched"); } else {
				  System.out.println("Week 2 Day 4 Data does not Matched"); }
				  
				  if(w5l== d5l) {System.out.println("Week 2 Day 5 Data Matched"); } else {
				  System.out.println("Week 2 Day 5 Data does not Matched"); }
				  

			driver.quit();
		}

	 
	
		@Test(priority = 3)
		public void CardsCheckStellaLiteforWeek3() throws IOException, InterruptedException {
			driver = initializeBrowser();
			driver.get(prop.getProperty("SURL"));
			ReactNative objreactnative = new ReactNative(driver);
			objreactnative.SigninStellaLite(prop.getProperty("BasicUserEmail"), prop.getProperty("Password"));

			Week3CardsCheckStellaLite cs = new Week3CardsCheckStellaLite(driver);

			w1 = cs.checkcardcountsonappWeek3day1();

			
			  w2 =cs.checkcardcountsonappWeek3day2();
			  w3 =cs.checkcardcountsonappWeek3day3(); 
			  w4 = cs.checkcardcountsonappWeek3day4();
			  w5 = cs.checkcardcountsonappWeek3day5();
			 
			  int w1l=w1.length;
			  int w2l=w2.length;
			  int w3l=w3.length;
			  int w4l=w4.length;
			  int w5l=w5.length;

			driver.get(prop.getProperty("HospitalURL"));
			HospitalAdmin_LoginPage h = new HospitalAdmin_LoginPage(driver);
			h.Login(prop.getProperty("HUsername"),prop.getProperty("HPassword"));
			Thread.sleep(9000);
			Week3CountofCardsonPortal c = new Week3CountofCardsonPortal(driver);

			d1 = c.checkweek3day1card();

			
			  d2=c.checkweek3day2card();
			  d3=c.checkweek3day3card();
			  d4=c.checkweek3day4card();
			  
			  d5=c.checkweek3day5card();
			  
			  int d1l=d1.length;
			  int d2l=d2.length;
			  int d3l=d3.length;
			  int d4l=d4.length;
			  int d5l=d5.length;
			 
			  if(w1l==d1l) { System.out.println("Week 3 Day 1 Data Matched"); } else {
				  System.out.println("Week 3 Day 1 Data does not Matched"); }
				  
				  if(w2l==d2l) { System.out.println("Week 3 Day 2 Data Matched"); } else {
				  System.out.println("Week 3 Day 2 Data does not Matched"); }
				  
				  if(w3l==d3l) { System.out.println("Week 3 Day 3 Data Matched"); } else {
				  System.out.println("Week 3 Day 3 Data does not Matched"); }
				  
				  if(w4l==d4l) { System.out.println("Week 3 Day 4 Data Matched"); } else {
				  System.out.println("Week 3 Day 4 Data does not Matched"); }
				  
				  if(w5l== d5l) {System.out.println("Week 3 Day 5 Data Matched"); } else {
				  System.out.println("Week 3 Day 5 Data does not Matched"); }
				  

			driver.quit();
		}

		@Test(priority = 4)
		public void CardsCheckStellaLiteforWeek4() throws IOException, InterruptedException {
			driver = initializeBrowser();
			driver.get(prop.getProperty("SURL"));
			ReactNative objreactnative = new ReactNative(driver);
			objreactnative.SigninStellaLite(prop.getProperty("BasicUserEmail"), prop.getProperty("Password"));

			Week4CardsCheckStellaLite cs = new Week4CardsCheckStellaLite(driver);

			w1 = cs.checkcardcountsonappWeek4day1();

			
			  w2 =cs.checkcardcountsonappWeek4day2();
			  w3 =cs.checkcardcountsonappWeek4day3(); 
			  w4 = cs.checkcardcountsonappWeek4day4();
			  w5 = cs.checkcardcountsonappWeek4day5();
			 
			  int w1l=w1.length;
			  int w2l=w2.length;
			  int w3l=w3.length;
			  int w4l=w4.length;
			  int w5l=w5.length;

			driver.get(prop.getProperty("HospitalURL"));
			HospitalAdmin_LoginPage h = new HospitalAdmin_LoginPage(driver);
			h.Login(prop.getProperty("HUsername"),prop.getProperty("HPassword"));
			Thread.sleep(9000);
			Week4CountofCardsonPortal c = new Week4CountofCardsonPortal(driver);

			d1 = c.checkweek4day1card();

			
			  d2=c.checkweek4day2card();
			  d3=c.checkweek4day3card();
			  d4=c.checkweek4day4card();
			  
			  d5=c.checkweek4day5card();
			  
			  int d1l=d1.length;
			  int d2l=d2.length;
			  int d3l=d3.length;
			  int d4l=d4.length;
			  int d5l=d5.length;
			 
			  if(w1l==d1l) { System.out.println("Week 4 Day 1 Data Matched"); } else {
				  System.out.println("Week 4 Day 1 Data does not Matched"); }
				  
				  if(w2l==d2l) { System.out.println("Week 4 Day 2 Data Matched"); } else {
				  System.out.println("Week 4 Day 2 Data does not Matched"); }
				  
				  if(w3l==d3l) { System.out.println("Week 4 Day 3 Data Matched"); } else {
				  System.out.println("Week 4 Day 3 Data does not Matched"); }
				  
				  if(w4l==d4l) { System.out.println("Week 4 Day 4 Data Matched"); } else {
				  System.out.println("Week 4 Day 4 Data does not Matched"); }
				  
				  if(w5l== d5l) {System.out.println("Week 4 Day 5 Data Matched"); } else {
				  System.out.println("Week 4 Day 5 Data does not Matched"); }
				  

			driver.quit();
		}
	 
		
		@Test(priority = 5)
		public void CardsCheckStellaLiteforWeek5() throws IOException, InterruptedException {
			driver = initializeBrowser();
			driver.get(prop.getProperty("SURL"));
			ReactNative objreactnative = new ReactNative(driver);
			objreactnative.SigninStellaLite(prop.getProperty("BasicUserEmail"), prop.getProperty("Password"));

			Week5CardsCheckStellaLite cs = new Week5CardsCheckStellaLite(driver);

			w1 = cs.checkcardcountsonappWeek5day1();

			
			  w2 =cs.checkcardcountsonappWeek5day2();
			  w3 =cs.checkcardcountsonappWeek5day3(); 
			  w4 = cs.checkcardcountsonappWeek5day4();
			  w5 = cs.checkcardcountsonappWeek5day5();
			 
			  int w1l=w1.length;
			  int w2l=w2.length;
			  int w3l=w3.length;
			  int w4l=w4.length;
			  int w5l=w5.length;

			driver.get(prop.getProperty("HospitalURL"));
			HospitalAdmin_LoginPage h = new HospitalAdmin_LoginPage(driver);
			h.Login(prop.getProperty("HUsername"),prop.getProperty("HPassword"));
			Thread.sleep(9000);
			Week5CountofCardsonPortal c = new Week5CountofCardsonPortal(driver);

			d1 = c.checkweek5day1card();

			
			  d2=c.checkweek5day2card();
			  d3=c.checkweek5day3card();
			  d4=c.checkweek5day4card();
			  
			  d5=c.checkweek5day5card();
			  
			  int d1l=d1.length;
			  int d2l=d2.length;
			  int d3l=d3.length;
			  int d4l=d4.length;
			  int d5l=d5.length;
			 
			  if(w1l==d1l) { System.out.println("Week 5 Day 1 Data Matched"); } else {
				  System.out.println("Week 5 Day 1 Data does not Matched"); }
				  
				  if(w2l==d2l) { System.out.println("Week 5 Day 2 Data Matched"); } else {
				  System.out.println("Week 5 Day 2 Data does not Matched"); }
				  
				  if(w3l==d3l) { System.out.println("Week 5 Day 3 Data Matched"); } else {
				  System.out.println("Week 5 Day 3 Data does not Matched"); }
				  
				  if(w4l==d4l) { System.out.println("Week 5 Day 4 Data Matched"); } else {
				  System.out.println("Week 5 Day 4 Data does not Matched"); }
				  
				  if(w5l== d5l) {System.out.println("Week 5 Day 5 Data Matched"); } else {
				  System.out.println("Week 5 Day 5 Data does not Matched"); }
				  

			driver.quit();
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
}}

	
