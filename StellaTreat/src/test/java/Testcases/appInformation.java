package Testcases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Appinfo;
import PageObjects.LoginPage;
import Resources.Base;

public class appInformation extends Base {
	
	 @BeforeTest 
	  public void Launchapp() throws InterruptedException,MalformedURLException
	  {
	 Android_LaunchApp();
	  }
	 

	
	
	@Test(priority = 1)
	public void loginTest() throws InterruptedException, MalformedURLException 	
	{
		
		LoginPage lp = new LoginPage();
		lp.Login();
		
	}
	 
	
	@Test(priority=2)
	public void checkappinfo() throws InterruptedException
	{
		Appinfo i = new Appinfo();
		i.checkappinfo();
	}
	@Test(priority=3)
	public void Logout() throws InterruptedException
	{
		
	
	
	PageObjects.Logout l = new PageObjects.Logout();
	l.applogout();
	}
}
