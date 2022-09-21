package Testcases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Journal;
import PageObjects.LoginPage;
import Resources.Base;

public class EnterJournal extends Base {

	
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
	 public void journal() throws InterruptedException
	 {
		 Journal j = new Journal();
		 j.journal();
		 
	 }
}
