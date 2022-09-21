package WEEK1;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.Base;
import WEEK2.Week2Data;

public class Week1Day2 {
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
	public void Week1Day2() throws InterruptedException
	{
		
		WeekData w = new WeekData();
		w.checkWeek1day2();
		  
		DLWeek1Day2 d = new DLWeek1Day2();
	//	d.dailylearning();
		d.RightswipeWeek1Day2();
}
}
