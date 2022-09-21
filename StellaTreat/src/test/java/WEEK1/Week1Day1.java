package WEEK1;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObjects.LoginPage;
import Resources.Base;
import Utils.XLSReader;

public class Week1Day1 {
	
	
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
	  public void checklearning() throws InterruptedException, IOException 
	  {
		  WeekData w= new WeekData();
			w.checkWeek1day1();
			
		  DLWeek1Day1 d = new DLWeek1Day1();
		  
		//  d.checktodayslearning();
		  //d.RightswipeWeek1();
		  d.swipe();
	  }
}