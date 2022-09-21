package PageObjects;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperAdmin_ManageNotifications {

	WebDriver driver;
	Properties prop;

	public SuperAdmin_ManageNotifications(WebDriver driver) {
		
 this.driver = driver; PageFactory.initElements(driver, this);
		 
	}

	@FindBy(xpath="//span[contains(text(),'Manage Notifications')]")
	WebElement ManageNotification;
	
	@FindBy(xpath="//div[@class='mat-select-arrow']")
	WebElement ItemPerPageArror;
	
	@FindBy(xpath="//span[contains(text(),'10')]")
	List<WebElement> selectRecord;
	
	@FindBy(xpath="//td[contains(text(),' Not_Logged_1 ')]/following::i[1]")
	WebElement EditNotLoggedInIcon;
	
	@FindBy(xpath="//mat-select[@name='channel']")
	WebElement ChannelDropDown;
	
	@FindBy(xpath="//mat-option[@value='In App']")
	WebElement InAppCheckBox;
		
	@FindBy(xpath="//mat-option[@value='Email']")
	WebElement EmailCheckBox;
	
	@FindBy(xpath="//mat-option[@value='SMS']")
	WebElement SMSCheckBox;
	
	@FindBy(xpath="//button[contains(text(),' Update')]")
	WebElement UpdateButton;
	
	@FindBy(xpath="//button[contains(text(),' Close')]")
	WebElement closeButton;
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	
public void ManageNotification() throws InterruptedException
{
	ManageNotification.click();
	Thread.sleep(2000);
	ItemPerPageArror.click();
	selectRecord.get(0).click();
	EditNotLoggedInIcon.click();
	Thread.sleep(2000);
	ChannelDropDown.click();
	boolean isSelected = InAppCheckBox.isSelected();
	if(isSelected == false) {
		InAppCheckBox.click();
	}
	
	
		EmailCheckBox.click();
		SMSCheckBox.click();
		SMSCheckBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	UpdateButton.click();
	closeButton.click();
	List<WebElement> Nudges=driver.findElements(By.xpath("//td[contains(text(),' Not_Logged_1 ')]/following::td"));
System.out.println("Text of nudges="+Nudges.get(1).getText());
System.out.println("Description of nudges="+Nudges.get(2).getText());
System.out.println("Channel of nudges="+Nudges.get(3).getText());
Thread.sleep(2000);

EditNotLoggedInIcon.click();
Thread.sleep(2000);
ChannelDropDown.click();
if(isSelected == false) {
	InAppCheckBox.click();
	EmailCheckBox.click();
	SMSCheckBox.click();
	SMSCheckBox.sendKeys(Keys.TAB);
	Thread.sleep(2000);
}

UpdateButton.click();
closeButton.click();

}
}