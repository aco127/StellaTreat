package Testcases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Appointmentcheck;
import PageObjects.CareTeamChat;
import PageObjects.LoginPage;
import Resources.Base;

public class ChatCareTeam extends Base{
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
	  public void careteamchat() throws InterruptedException
	  {
		 CareTeamChat c = new CareTeamChat();
		 c.careTeamChat();
		 Thread.sleep(500);
		 c.schedule();
		 c.clickTab();
		 c.createappt();
		 
	  }
	 
	 
	 @Test(priority=3)
	 public void AppointmentDatecheck()
	 {
		 Appointmentcheck d = new Appointmentcheck();
		 d.checkapptscheduled();
	 }

}
