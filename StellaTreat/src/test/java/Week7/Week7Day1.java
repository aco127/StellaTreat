package Week7;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.Base;
import WEEK6.Week6Data;
import WEEK7.DailyLearningWeek7Day1;
import WEEK7.Week7Data;

public class Week7Day1 {
	
	
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
	  public void checklearningWeek7Day1() throws InterruptedException, IOException 
	  {
		  Week7Data w= new Week7Data();
		  w.checkDay1();
		  DailyLearningWeek7Day1 d = new DailyLearningWeek7Day1();
		//  d.dailylearning();
		  d.RightswipeWeek7();
		  System.out.println("Week 7 Day1 completed");
	  }
	  



}
