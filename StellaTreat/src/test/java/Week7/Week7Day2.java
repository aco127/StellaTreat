package Week7;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.Base;
import WEEK7.DailyLearningWeek7Day1;
import WEEK7.DailyLearningWeek7Day2;
import WEEK7.Week7Data;

public class Week7Day2 {
	
	/*
	 * @BeforeTest public void Launchapp() throws MalformedURLException { Base
	 * basePage = new Base(); basePage.Android_LaunchApp(); }
	 * 
	 * @Test(priority=1) public void Login() throws InterruptedException { LoginPage
	 * lp = new LoginPage(); lp.Login(); }
	 */
	  @Test(priority=2) 
	  public void checklearningWeek5Day1() throws InterruptedException, IOException 
	  {
		  Week7Data w= new Week7Data();
		  w.checkDay2();
		  DailyLearningWeek7Day2 d = new DailyLearningWeek7Day2();
		//  d.dailylearning();
		  d.RightswipeWeek7();
		  System.out.print("Week7 Day2 completed");
	  }
	  



}
