package Week8;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.Base;
import WEEK7.Week7Data;

public class Week8 {

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
		Week7Data w= new Week7Data();
		w.checkDay1();
	
		/*
		 * DLWeek1Day2 dll= new DLWeek1Day2(); dll.RightswipeWeek1Day2();
		 * System.out.print("Day 2 completed");
		 */
		
		/*
		 * DLWeek1Day3 dl3= new DLWeek1Day3(); dl3.RightswipeWeek1Day3();
		 * System.out.print("Day 3 completed");
		 */
		 
		
		
	}
}

