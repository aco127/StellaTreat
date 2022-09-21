package WEEK3;

import java.net.MalformedURLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.AppDriver;
import Resources.Base;

public class Week3Day6 {
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
	public void checlearningdweek3day6() throws InterruptedException
	{
		
		Week3Data w= new Week3Data();
		w.checkDay6();
		
		DailyLearningWeek3Day6 d = new DailyLearningWeek3Day6();
		
		d.RightswipeWeek3();
	}
	
	
}
