package Testcases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Dashboard;
import PageObjects.LoginPage;
import PageObjects.SleepTracker;
import Resources.Base;

public class SleepTracking {
	
	
	@BeforeTest
	public void Launchapp() throws InterruptedException, MalformedURLException {
		Base basePage = new Base();
		basePage.Android_LaunchApp();
		 

	}

	@Test(priority = 1)
	public void Login() throws InterruptedException {

		LoginPage lp = new LoginPage();
		lp.Login();
	}
	
	
	  @Test(priority=2) public void sleeptracker() throws InterruptedException {
	  Dashboard d= new Dashboard();
	  d.selectsleep(); 
	  SleepTracker st= new
	  SleepTracker(); 
	  st.selectsleeptime();
	  
	  }
	 
	
}


