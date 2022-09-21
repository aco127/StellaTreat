package Testcases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

public class Login {
	

	@BeforeTest
	public void Launchapp() throws InterruptedException, MalformedURLException {
		Base basePage = new Base();
		basePage.Android_LaunchApp();
		 

	}

	@Test(priority = 1)
	public void Login() throws InterruptedException {

		LoginPage lp = new LoginPage();
		
		lp.Login();
		
	}
	


}
