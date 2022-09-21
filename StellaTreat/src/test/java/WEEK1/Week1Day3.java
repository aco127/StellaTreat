package WEEK1;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.Base;
import Utils.XLSReader;

public class Week1Day3 {
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
	public void Week1Day3() throws InterruptedException
	{
		DLWeek1Day3 d = new DLWeek1Day3();
		d.dailylearning();
		d.RightswipeWeek1Day3();
		
}
}
