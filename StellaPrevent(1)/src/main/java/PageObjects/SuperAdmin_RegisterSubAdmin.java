package PageObjects;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperAdmin_RegisterSubAdmin {

	WebDriver driver;
	Properties prop;

	public SuperAdmin_RegisterSubAdmin(WebDriver driver) {
		
 this.driver = driver; PageFactory.initElements(driver, this);
		 
	}

	
	@FindBy(xpath="//span[contains(text(),'Sub Admin')]")
	WebElement SubAdmin;
	
	@FindBy(xpath="//button[@type='submit' and text()=' + Register Sub-Admin ']")
	WebElement registerSubAdminBtn;
	
	@FindBy(xpath="//input[@formcontrolname='firstName']")
	WebElement subAdminName;
	
	@FindBy(xpath="//input[@formcontrolname='phoneNumber']")
	WebElement phoneNo;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//div[@class='mat-select-arrow-wrapper']")
	WebElement dropdown;
		
	@FindBy(xpath="//span[@class='mat-option-text' and text()=' United States ']")
	WebElement selectcountry;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()=' Submit ']")
	WebElement submit;
	


public void registerSubAdmin()
{SubAdmin.click();
	registerSubAdminBtn.click();
	subAdminName.sendKeys("tubadmin");
	phoneNo.sendKeys("98816120113");	
	email.sendKeys("tubadmin@yopmail.com");
	password.sendKeys("Test@1230");
	dropdown.click();
	selectcountry.click();
	submit.click();
}
}