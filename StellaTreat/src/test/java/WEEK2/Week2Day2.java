package WEEK2;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.Logout;
import Resources.Base;

public class Week2Day2 {

	
	  @BeforeTest public void Launchapp() throws MalformedURLException { Base
	  basePage = new Base(); basePage.Android_LaunchApp(); }
	  
	  @Test(priority=1) public void Login() throws InterruptedException { LoginPage
	  lp = new LoginPage(); lp.Login(); }
	 
	
	@Test(priority=2)
	public void checklearningweek2() throws InterruptedException
	
	{	
		Week2Data w= new Week2Data();
		  w.checkWeek2day2();
		DLWeek2Day2 d= new DLWeek2Day2();
		d.RightswipeWeek2();
		
	
	}
	/*
	 * @Test(priority=3) public void logoff() { Logout l = new Logout();
	 * l.applogout(); }
	 */
}
