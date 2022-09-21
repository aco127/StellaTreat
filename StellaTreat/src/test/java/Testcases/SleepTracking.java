package Testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Dashboard;
import PageObjects.LoginPage;
import PageObjects.Logout;
import PageObjects.SleepTracker;
import Resources.Base;

public class SleepTracking  extends Base{

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
	 
	
	  @Test(priority=2) public void sleeptracker() throws Exception {
	  Dashboard d= new Dashboard();
	  d.selectsleep(); 
	  SleepTracker st= new SleepTracker(); 
	  st.negselect();
	  st.selectsleeptime();
	st.checksleeppoints();
	  //st.entersecondsleep();
	  //st.checksleepreport();
	  
	  }
		
		/*
		 * @Test(priority=3) public void logoff() { Logout l= new Logout();[HTTP] --> POST /wd/hub/session/bf11620a-4edb-4cb1-9194-d4a1ccdc5670/element/8b7c076a-1075-4a45-9831-b784c2df6b5c/click
[HTTP] {"id":"8b7c076a-1075-4a45-9831-b784c2df6b5c"}
[W3C (bf11620a)] Calling AppiumDriver.click() with args: ["8b7c076a-1075-4a45-9831-b784c2df6b5c","bf11620a-4edb-4cb1-9194-d4a1ccdc5670"]
[WD Proxy] Matched '/element/8b7c076a-1075-4a45-9831-b784c2df6b5c/click' to command name 'click'
[WD Proxy] Proxying [POST /element/8b7c076a-1075-4a45-9831-b784c2df6b5c/click] to [POST http://127.0.0.1:8215/wd/hub/session/020ebf09-8e50-4ddd-9334-a6dc8596e01f/element/8b7c076a-1075-4a45-9831-b784c2df6b5c/click] with body: {"element":"8b7c076a-1075-4a45-9831-b784c2df6b5c"}

		 * l.applogout(); }
		 */
	 
	
}


