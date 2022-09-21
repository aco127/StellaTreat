package Testcases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Language;
import PageObjects.LoginPage;
import PageObjects.PrivacyandSecurity;
import Resources.Base;

public class Privacy_Security extends Base {
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
	
	  @Test(priority=2) public void checkprivacy() throws InterruptedException 
	  {
	  
	PrivacyandSecurity p = new PrivacyandSecurity(); 
	p.checkPrivacySecurity();
	/*
	 * Language l = new Language(); l.changelang();
	 */
	  
	  }
	 
}
