package Week6;

import java.net.MalformedURLException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.Base;
import WEEK6.DailyLearningWeek6Day1;
import WEEK6.DailyLearningWeek6Day2;
import WEEK6.DailyLearningWeek6Day3;
import WEEK6.DailyLearningWeek6Day4;
import WEEK6.Week6Data;
import WEEK7.Week7Data;

public class Week6 {
	WebDriver driver;

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
		Week6Data w= new Week6Data();
		w.checkDay1();
	
		DailyLearningWeek6Day1 d = new DailyLearningWeek6Day1();
		d.RightswipeWeek6();
		System.out.print("Day 1 completed");
		

DailyLearningWeek6Day2 d2 = new DailyLearningWeek6Day2();
w.checkDay2();
d2.RightswipeWeek6();
System.out.print("Day 2 completed");


w.checkDay3();
DailyLearningWeek6Day3 d3 = new DailyLearningWeek6Day3();
d3.RightswipeWeek6();
System.out.print("Day 3 completed");


w.checkDay4();

DailyLearningWeek6Day4 d4 = new DailyLearningWeek6Day4();
d3.RightswipeWeek6();
System.out.print("Day 4 completed");
		 
		
		
		
		 
		 
		
		
	}
}

