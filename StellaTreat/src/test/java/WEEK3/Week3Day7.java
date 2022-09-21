package WEEK3;

import java.net.MalformedURLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.AppDriver;
import Resources.Base;

public class Week3Day7 {
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
	public void checlearningdweek3day7() throws InterruptedException
	{
		Week3Data w= new Week3Data();
		w.checkDay7();
		DailyLearningWeek3Day7 d = new DailyLearningWeek3Day7();
		
		d.RightswipeWeek3();
	}
	
	
}
