package WEEK2;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Back;
import PageObjects.LoginPage;
import Resources.Base;
import WEEK1.DLWeek1Day1;
import WEEK1.DLWeek1Day2;
import WEEK1.DLWeek1Day3;
import WEEK7.Week7Data;

public class Week2 {

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
	 	Week2Data w= new Week2Data();
		
		  w.checkWeek2day1(); DLWeek2Day1 dll= new DLWeek2Day1();
		  dll.RightswipeWeek2(); System.out.print("Day 1 completed");
		   
		  w.checkWeek2day2(); DLWeek2Day2 dl2= new DLWeek2Day2();
		  dl2.RightswipeWeek2(); System.out.print("Day 2 completed");
		  
		  w.checkWeek2day3(); DLWeek2Day3 dl3= new DLWeek2Day3();
		  dl3.RightswipeWeek2(); System.out.print("Day 3 completed");
		   
		  w.checkWeek2day4();
		  DLWeek2Day4 dl4= new DLWeek2Day4(); 
		  dl4.RightswipeWeek2();
		  System.out.print("Day 4 completed");
		  
		  w.checkWeek2day5();
		  DLWeek2Day5 dl5= new DLWeek2Day5(); 
		  dl5.RightswipeWeek2();
		  System.out.print("Day 5 completed");
		  
		  w.checkWeek2day6();
		  DLWeek2Day6 dl6= new DLWeek2Day6(); 
		  dl6.RightswipeWeek2();
		  System.out.print("Day 6 completed");
				
		
	}
}

