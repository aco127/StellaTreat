package Testcases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.Playlist;
import Resources.Base;

public class checkplaylist extends Base {
	
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
	
	@Test(priority=3)
	public void playlist() throws InterruptedException
	{
		Playlist pobj= new Playlist();
		pobj.checkPlaylist();
	}

}
