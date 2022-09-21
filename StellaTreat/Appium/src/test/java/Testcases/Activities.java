package Testcases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Activity;
import PageObjects.Dashboard;
import PageObjects.LoginPage;
import Resources.Base;

public class Activities {
	

	@BeforeTest
	public void Launchapp() throws InterruptedException, MalformedURLException {
		Base basePage = new Base();
		basePage.Android_LaunchApp();
		 

	}

	@Test(priority = 1)
	public void Login() throws InterruptedException {

		LoginPage lp = new LoginPage();
		Thread.sleep(1000);
		lp.Login();
	}
	
	@Test(priority=2)
	public void checkactivity() throws InterruptedException
	{
		Dashboard d = new Dashboard();
		d.selectactivity();
		
		Activity a = new Activity();
		
		 a.addpleasantactivity(); 
		 a.adddailyactivity();
		 
		a.verifyactivityonresourcereport();
		
		
		
	}

}
