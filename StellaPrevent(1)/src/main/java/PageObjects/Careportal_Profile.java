package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Careportal_Profile {

	WebDriver driver;

	public Careportal_Profile(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Ebix -fname
	//Hospital -lname
	//7875423378 -phoneno
	
	@FindBy(xpath="//span[@class='menu-sidebar' and text()='Profile']")
	WebElement Profile;
	
	
	@FindBy(xpath="//input[@formcontrolname='firstName']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@formcontrolname='lastName']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@formcontrolname='phoneNumber']")
	WebElement phnno;
	
	@FindAll(@FindBy(xpath="//button[normalize-space()='Update']"))
List<WebElement> updatebtn;
	
	public void updateprofile() throws InterruptedException
	{
		Profile.click();
		updatebtn.get(0).click();
		firstname.sendKeys("testfname");
		lastname.sendKeys("lname");
		phnno.sendKeys("9876543210");
		Thread.sleep(2000);
		updatebtn.get(1).click();
	}
}