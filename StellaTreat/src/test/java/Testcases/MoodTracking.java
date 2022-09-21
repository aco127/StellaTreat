package Testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.MoodTracker;
import Resources.Base;

public class MoodTracking extends Base{
	

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
	 
	 
	
	@Test(priority=4)
	public void trackmood() throws Exception
	{
		MoodTracker m = new MoodTracker();
		//m.checkmoodpopup();
		m.mood();
		m.checkpoints();
	}

}
