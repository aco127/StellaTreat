package Testcases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Language;
import PageObjects.LoginPage;
import Resources.Base;

public class Languagechange extends Base {
	
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
	 public void changelang() throws InterruptedException
	 {
		 Language l = new Language();
		 l.changelang();
	 }

}
