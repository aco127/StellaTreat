package Week6;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.Base;
import WEEK6.DailyLearningWeek6Day1;
import WEEK6.DailyLearningWeek6Day2;
import WEEK6.DailyLearningWeek6Day3;
import WEEK6.DailyLearningWeek6Day4;
import WEEK6.DailyLearningWeek6Day5;
import WEEK6.Week6Data;

public class Week6Day5 {
	
	
	/*
	 * @BeforeTest public void Launchapp() throws MalformedURLException { Base
	 * basePage = new Base(); basePage.Android_LaunchApp(); }
	 * 
	 * @Test(priority=1) public void Login() throws InterruptedException { LoginPage
	 * lp = new LoginPage(); lp.Login(); }
	 */
	
	  @Test(priority=2) 
	  public void checklearningWeek6Day4() throws InterruptedException, IOException 
	  {
		  Week6Data w= new Week6Data();
		  w.checkDay5();
		  DailyLearningWeek6Day5 d = new DailyLearningWeek6Day5();
		//  d.dailylearning();
		  Thread.sleep(2000);
		  d.RightswipeWeek6();
		  
		  
		  System.out.println("Week6 Day5 Completed");
	  }
	  



}
