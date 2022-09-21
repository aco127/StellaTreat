package WEEK4;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.Base;

public class Week4Day6 {
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
	
	@Test(priority=3)
	public void checklearningWeek4Day6() throws InterruptedException
	{
		DailyLearningWeek4Day6 d = new DailyLearningWeek4Day6();
		d.dailylearning();
		d.RightswipeWeek4();
		
	}

}
