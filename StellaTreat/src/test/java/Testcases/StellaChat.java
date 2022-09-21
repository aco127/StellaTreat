package Testcases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.chatwithstella;
import Resources.Base;


	public class StellaChat extends Base {
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
		public void stella() throws InterruptedException
		{
			chatwithstella c = new chatwithstella();
			c.chatwithstella();
		}
	}


