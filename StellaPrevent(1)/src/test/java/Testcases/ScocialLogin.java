package Testcases;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObjects.HospitalAdmin_LoginPage;
import PageObjects.MainPage;
import PageObjects.Social_Logins;
import Resources.Base;

public class ScocialLogin extends Base {

	WebDriver driver;

	
	
	/*
	 * @Test(priority = 1) public void getStarted_SignUpFacebook() throws
	 * InterruptedException, IOException {
	 * 
	 * driver = initializeBrowser(); driver.get(prop.getProperty("URL"));
	 * 
	 * MainPage m = new MainPage(driver);
	 * 
	 * 
	 * 
	 * m.checkfb(); driver.quit(); }
	 */
	  
	  
	/*
	 * @Test(priority = 2) public void getStarted_Signupgoogle() throws
	 * InterruptedException, IOException {
	 * 
	 * driver = initializeBrowser(); driver.get(prop.getProperty("URL"));
	 * 
	 * MainPage m = new MainPage(driver);
	 * 
	 * 
	 * 
	 * m.checkgooglesingnup(); //driver.quit(); }
	 */
	
	  @Test(priority=1) public void SocialLogin_Facebook() throws IOException,
	  InterruptedException { driver = initializeBrowser();
	  driver.get(prop.getProperty("ReactNativeLogin")); Social_Logins a = new
	  Social_Logins(driver);
	  
	  
	  a.loginFacebook(); driver.quit();
	  
	  
	  }
	 
	  
	  @Test(priority=2) public void SocialLogin_Google() throws IOException,
	  InterruptedException { driver = initializeBrowser();
	  driver.get(prop.getProperty("ReactNativeLogin")); Social_Logins a = new
	  Social_Logins(driver);
	  
	  a.loginGoogle(); driver.quit();
	  
	  
	  }
	 
	  
		/*
		 * @Test(priority=8) public void SocialLogin_Apple() throws IOException,
		 * InterruptedException { driver = initializeBrowser();
		 * driver.get(prop.getProperty("SURL")); Social_Logins a = new
		 * Social_Logins(driver);
		 * 
		 * 
		 * a.loginApple();
		 * 
		 * //driver.quit();
		 * 
		 * }
		 */
}
