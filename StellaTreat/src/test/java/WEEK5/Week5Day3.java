package WEEK5;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.Base;

public class Week5Day3 {
	
	
	@BeforeTest
	public void Launchapp() throws MalformedURLException
	{
		Base basePage = new Base();
		basePage.Android_LaunchApp();
	}
	
	@Test(priority=1)
	public void Login() throws InterruptedException
	{
		LoginPage lp = new LoginPage();
		lp.Login();
	}
	
	  @Test(priority=2) 
	  public void checklearningWeek5Day3() throws InterruptedException, IOException 
	  {Week5Data w= new Week5Data();
	  w.checkDay3();
		  DailyLearningWeek5Day3 d = new DailyLearningWeek5Day3();
	//	  d.dailylearning();
		  d.RightswipeWeek5();
	  }
	  



}
