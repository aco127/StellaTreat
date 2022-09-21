package PageObjects;

import java.util.Properties;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.util.Assert;

public class SuperAdmin_LoginPage {

	WebDriver driver;
	Properties prop;

	public SuperAdmin_LoginPage(WebDriver driver) {
		
 this.driver = driver; PageFactory.initElements(driver, this);
		 
	}

	@FindBy(xpath = "//input[@id='InputEmail']")
	WebElement emailaddress;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;

	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	WebElement loginbtn;

	@FindBy(xpath = "//a[@class='forget-password']")
	WebElement forgotpassword;
	
	@FindBy(xpath="//span[contains(text(),'Ebix')]")
	WebElement EbixBtn;
	
	@FindBy(xpath="//div[@class='mat-menu-content']")
	WebElement SignOut;
	

	
	
	public  void Login(String AdminUsername,String AdminPassword) 
	{
		try {
			Thread.sleep(1000);
	
	 emailaddress.sendKeys(AdminUsername); 
	 Thread.sleep(1000);
	  password.sendKeys(AdminPassword);
		Thread.sleep(4000);
	  loginbtn.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String checkPageTitle()
	{
		String Title =driver.getTitle();
		return Title;
	}


	public void Logout()
	{  try {
		Thread.sleep(3000);
		EbixBtn.click();
		Thread.sleep(2000);
		SignOut.click();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
