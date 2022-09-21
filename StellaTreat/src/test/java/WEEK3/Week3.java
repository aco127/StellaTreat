package WEEK3;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.Base;
import WEEK1.DLWeek1Day1;
import WEEK2.DLWeek2Day1;
import WEEK7.Week7Data;

public class Week3 {

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
		Week3Data w= new Week3Data();
		w.checkDay1();
		 
		
	
		
		  DLWeek2Day1 dll= new DLWeek2Day1();
		  dll.RightswipeWeek2();
		  System.out.print("Day 2 completed");
		 
		
		/*
		 * DLWeek1Day3 dl3= new DLWeek1Day3(); dl3.RightswipeWeek1Day3();
		 * System.out.print("Day 3 completed");
		 */
		 
		
		
	}
}

