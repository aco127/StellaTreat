package WEEK1;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.Base;

public class Week1 {

	@BeforeTest
	public void Launchapp() throws MalformedURLException
	{
		Base basePage = new Base();
		basePage.Android_LaunchApp();
	}
	
	@Test(priority = 1) public void Login() throws InterruptedException
	{
		 LoginPage lp = new LoginPage(); Thread.sleep(1000); lp.Login();	
	}
			
	@Test(priority=2)
	public void checkweekdata() throws InterruptedException
	{
		WeekData w= new WeekData();
		w.checkWeek1day1();
		/*
		 * w.checkWeek1day2();
		 * 
		 * 
		 * DLWeek1Day2 dll= new DLWeek1Day2(); dll.RightswipeWeek1Day2();
		 * System.out.print("Day 2 completed");
		 */
		  
		 
			
			  w.checkWeek1day3(); DLWeek1Day3 dl3= new DLWeek1Day3();
			  dl3.RightswipeWeek1Day3(); System.out.print("Day 3 completed");
			 
		 
		 
				/*
				 * w.checkWeek1day4();
				 * 
				 * DLWeek1Day4 dl4= new DLWeek1Day4(); //w.checkWeek1day4();
				 * dl4.RightswipeWeek1Day4(); System.out.print("Day 4 completed");
				 * 
				 * w.checkWeek1day5(); DLWeek1Day5 dl5= new DLWeek1Day5(); w.checkWeek1day5();
				 * dl5.RightswipeWeek1Day5(); System.out.print("Day 5 completed");
				 * 
				 * DLWeek1Day6 dl6= new DLWeek1Day6(); w.checkWeek1day6();
				 * dl6.RightswipeWeek1Day6(); System.out.print("Day 6 completed");
				 * 
				 * DLWeek1Day7 dl7= new DLWeek1Day7(); w.checkWeek1day7();
				 * dl7.RightswipeWeek1Day7(); System.out.print("Day 7 completed");
				 */
	}
}

