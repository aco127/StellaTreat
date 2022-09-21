package PageObjects;

import java.util.List;

import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.util.Assert;

import Resources.Base;

public class Careportal_LoginPage  {

	WebDriver driver;
	Properties prop;

	public Careportal_LoginPage(WebDriver driver) {
		
 this.driver = driver; PageFactory.initElements(driver, this);
		 
	}

	@FindBy(xpath = "//input[@id='InputEmail']")
	WebElement emailaddress;

	@FindBy(xpath = "//input[@id='exampleInputPassword1']")
	WebElement password;

	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	WebElement loginbtn;

	@FindBy(xpath = "//a[@class='forget-password']")
	WebElement forgotpassword;
	
	@FindBy(xpath="//button[@type='button']")
	List<WebElement> Logout;
	
	@FindBy(xpath="//a[contains(text(),'Sign Out')]")
	WebElement SignOut;
	

	
	
	public RegisterPatient Login(String uname, String pwd) 
	{
		try {
			Thread.sleep(4000);
	
	 emailaddress.sendKeys(uname); 
	  password.sendKeys(pwd);
		Thread.sleep(4000);
	  loginbtn.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new RegisterPatient(driver);

	}

	public String checkPageTitle()
	{
		String Title =driver.getTitle();
		return Title;
	}


	public void Logout()
	{  try {
		Thread.sleep(3000);
		Logout.get(0).click();
		Thread.sleep(2000);
		SignOut.click();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
