package WEEK2;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.Base;

public class Week2Day3 {

	
	  @BeforeTest public void Launchapp() throws MalformedURLException { Base
	  basePage = new Base(); basePage.Android_LaunchApp(); }
	  
	  @Test(priority=1) public void Login() throws InterruptedException { LoginPage
	  lp = new LoginPage(); lp.Login(); }
	 
	
	@Test(priority=2)
	public void checklearningweek2() throws InterruptedException
	{
		Week2Data w= new Week2Data();
		  w.checkWeek2day3();
		DLWeek2Day3 d= new DLWeek2Day3();
		d.RightswipeWeek2();
	}

}
