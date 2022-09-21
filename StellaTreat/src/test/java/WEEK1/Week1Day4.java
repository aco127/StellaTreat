package WEEK1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Resources.Base;

public class Week1Day4 {
	
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
	public void Week1Day4() throws InterruptedException, IOException
	{
		DLWeek1Day4 d = new DLWeek1Day4();
		d.dailylearning();
		d.RightswipeWeek1Day4();
		
}
}
