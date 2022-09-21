package Week8;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.Base;
import WEEK6.Week6Data;
import WEEK7.DailyLearningWeek7Day1;
import WEEK7.Week7Data;

public class Week8Day1 {
	
	
	@Test(priority=1)
	public void Launchapp() throws MalformedURLException
	{
		Base basePage = new Base();
		basePage.Android_LaunchApp();
	}
	
	@Test(priority=2)
	public void Login() throws InterruptedException
	{
		LoginPage lp = new LoginPage();
		lp.Login();
	}
	
	  @Test(priority=3) 
	  public void checklearningWeek8Day1() throws InterruptedException, IOException 
	  {
		  Week8Data w= new Week8Data();
		  w.checkDay1();
		  DailyLearningWeek8Day1 d = new DailyLearningWeek8Day1();
		//  d.dailylearning();
		  d.RightswipeWeek8();
		  System.out.println("Week 8 Day1 completed");
	  }
	  
	  



}
