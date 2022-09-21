package Testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.AdminKeywords;
import PageObjects.Journal;
import PageObjects.LoginPage;
import Resources.Base;
import Resources.BrowserBase;

public class NLP extends BrowserBase{


	@BeforeTest
	public void Launchapp() throws InterruptedException, MalformedURLException 
	{
		Base basePage = new Base();
		basePage.Android_LaunchApp();
	}
	
	@Test(priority = 1)
	public void Login() throws InterruptedException {
		LoginPage lp = new LoginPage();
		lp.Login();
	}

	@Test(priority = 2)
	public void enterKeywordInJournal() {
		Journal objjournal = new Journal();
		objjournal.keyword();
	}
	


	@Test(priority = 3)
	public void AdminLogin() throws InterruptedException, IOException
	{
		BrowserBase b = new BrowserBase();
		b.initializeBrowser();
		driver.get(prop.getProperty("SuperAdminurl"));
		
		AdminKeywords obj = new AdminKeywords(driver);
		obj.AdminLogin();
	} 
	
	@Test(priority=4)
	public void checkNLPContent() throws InterruptedException
	{
		AdminKeywords obj1 = new AdminKeywords(driver);
		obj1.checkNLPcontent();
	}
	
	

}
