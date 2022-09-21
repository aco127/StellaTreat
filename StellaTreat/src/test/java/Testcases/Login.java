package Testcases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import PageObjects.LoginPage;
import Resources.Base;
import Utils.DateUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Login extends Base {
	
	
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
		System.out.println("User logged in");
	}

	


}
