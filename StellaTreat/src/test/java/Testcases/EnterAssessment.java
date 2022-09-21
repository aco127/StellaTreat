package Testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.AdminKeywords;
import PageObjects.Assessment;
import PageObjects.LoginPage;
import Resources.Base;
import Resources.BrowserBase;

public class EnterAssessment extends Base {
	 @BeforeTest 
	  public void Launchapp() throws InterruptedException,MalformedURLException
	  {
		 
	 Android_LaunchApp();
	  }
	 

	
	
	@Test(priority = 1)
	public void loginTest() throws InterruptedException, MalformedURLException 	
	{
		
		LoginPage lp = new LoginPage();
		lp.Login();
		
	}

		@Test(priority=2)
		public void enterassmt() throws InterruptedException
		{
			Assessment a = new Assessment();
		a.assessmt();
			//a.EPDSAsstscore();
		}
		
		
		
		/*
		 * @Test(priority=3) public void AdminLogin() throws InterruptedException,
		 * IOException { BrowserBase b = new BrowserBase(); b.initializeBrowser();
		 * driver.get(prop.getProperty("SuperAdminurl"));
		 * 
		 * AdminKeywords obj = new AdminKeywords(driver); obj.AdminLogin();
		 * obj.checkEmaildistributionList(); }
		 */
		
}
