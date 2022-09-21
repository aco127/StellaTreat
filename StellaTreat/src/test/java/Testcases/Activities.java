package Testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Activity;
import PageObjects.Dashboard;
import PageObjects.LoginPage;
import PageObjects.Logout;
import Resources.Base;

public class Activities extends Base
{
	

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
	  
	 

	@Test(priority = 2)
	public void checkactivity() throws InterruptedException {
		Dashboard d = new Dashboard();
		d.selectactivity();

		Activity a = new Activity();
		a.checkactivitysavepopup();
	a.addpleasantactivity();
		a.adddailyactivity();
		a.checkactivityUnderReportsandSelected();
		a.checkpointsTab();
		

	}
	/*
	 * @Test(priority=3) public void logoff() { Logout l= new Logout();
	 * l.applogout(); }
	 */

}
