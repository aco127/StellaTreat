package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Profile_stellaLite {
	WebDriver driver;
	WebDriverWait wait;

	public Profile_stellaLite(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		/*
		 * this.driver = driver; this.wait = new WebDriverWait(driver, 10);
		 */
	}

	@FindBy(xpath = "//div[contains(text(),'Profile')]")
	WebElement ProfileBtn;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement Okbtn;

	@FindBy(xpath = "//input[@role='switch']")
	List<WebElement> EmailSMsNoification;

	@FindBy(xpath = "//span[@class='checkmark_r']")
	List<WebElement> sel;

	@FindBy(xpath = "//div/em[@class='fa fa-refresh']")
	WebElement ResetIcon;

	@FindBy(xpath = "//input[@class='css-11aywtz r-tpevwd r-13awgt0 r-a023e6 r-1yaosjt r-1pi2tsx r-1ny4l3l r-1udh08x']")

	List<WebElement> Fields;

	@FindBy(xpath = "//div[contains(text(),'Update Profile')]")
	WebElement UpdateProfileBtn;

	@FindBy(xpath = "//div[contains(text(),'English')]")
	WebElement EnglishradioBtn;

	@FindBy(xpath = "//div[contains(text(),'Spanish')]")
	WebElement SpanishradioBtn;

	@FindBy(xpath = "//div[contains(@class, 'css') and text() = 'Change']")
	WebElement ChangeBtn;

	@FindBy(xpath = "//div[text()='Zip Code']")
	WebElement ZipCodeScroll;

	@FindBy(xpath = "//div/div[contains(text(),'Change Password')]")
	List<WebElement> ChangegPAsswordBtn;

	@FindBy(xpath = "//div[contains(text(),'Back to Dashboard')]")
	WebElement BacktoDashboard;

//div[contains(text(),'Back to Dashboard')]

	@FindBy(xpath = "//div[contains(text(),'Upgrade')]")
	WebElement UpgradePlan;

	@FindBy(xpath = "//div[contains(text(),'Choose')]")
	WebElement ChoosePRemiumPlan;

//@FindBy(xpath="//input[@id='cardNumber']")
	@FindBy(xpath = "//input[@id='cardNumber']")
	WebElement EnterCardNum;

	@FindBy(xpath = "//input[@class='css-11aywtz r-1yef56z r-1j6g5un r-a023e6 r-1yaosjt r-1pi2tsx r-1ny4l3l']")
	List<WebElement> Enterdetails;

	@FindBy(xpath = "//input[@placeholder='MM/YY']")
	WebElement enterMonthYR;

	@FindBy(xpath = "//input[@placeholder='CVV']")
	WebElement enterCVV;

	/*
	 * @FindBy(xpath = "//button[contains(text(),'Pay')]") WebElement PayButton;
	 */
	@FindBy(xpath = "//form[@id='form']")
	WebElement form;

	@FindBy(xpath = "//input[@placeholder='ZIP']")
	WebElement ZipCode;

	@FindBy(xpath = "//button[@id='pay-with-card']")
	WebElement PayButton;
	
	@FindBy(xpath="//div[@id='swal2-html-container']")
	WebElement SuccessMsg;
	
	@FindBy(xpath="//div[contains(text(),'View Plans')]")
	WebElement ViewPlans;
	
	

	public void Profile() throws InterruptedException {
		Thread.sleep(7000);
		ProfileBtn.click();

		
		/*
		 * Thread.sleep(1000); try { if (EnglishradioBtn.isSelected()) {
		 * SpanishradioBtn.click(); } else { EnglishradioBtn.click(); ChangeBtn.click();
		 * Okbtn.click(); } } catch (Exception e) { e.printStackTrace(); }
		 */
		
		  try {
		  
		  UpgradePlan.click(); Thread.sleep(1000); ChoosePRemiumPlan.click();
		  Thread.sleep(1000); Enterdetails.get(0).clear();
		  Enterdetails.get(0).sendKeys("AutoDemo@yopmail.com");
		  Enterdetails.get(1).clear(); Enterdetails.get(1).sendKeys("Common Name");
		  Thread.sleep(4000); driver.switchTo().frame(0);
		  EnterCardNum.sendKeys("4111111111111111"); enterMonthYR.sendKeys("0123");
		  enterCVV.sendKeys("111"); Thread.sleep(8000); ZipCode.sendKeys("56656");
		  Thread.sleep(3000); driver.switchTo().defaultContent(); PayButton.click();
		  System.out.println("Premium registration="+SuccessMsg.getText());
		  Okbtn.click(); Thread.sleep(6000); ProfileBtn.click();
		  
		  } catch(Exception e) { e.printStackTrace(); // ViewPlans.click();
		  Thread.sleep(1000); driver.navigate().back();
		  
		  }
		 
		 Thread.sleep(5000);
		 ProfileBtn.click();

		  
		  try { Thread.sleep(6000); EmailSMsNoification.get(0).click();
		  Thread.sleep(2000); Okbtn.click(); Thread.sleep(2000);
		  EmailSMsNoification.get(1).click(); Thread.sleep(2000); Okbtn.click();
		  }catch(Exception e) { e.printStackTrace(); } Thread.sleep(2000);
		  
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", ZipCodeScroll);
		  ZipCodeScroll.click();
		  
		  Fields.get(7).clear(); Fields.get(7).sendKeys("8879503357");
		  Fields.get(8).clear(); Fields.get(8).sendKeys("Mumbai");
		  Fields.get(9).clear(); Fields.get(9).sendKeys("400705");
		  UpdateProfileBtn.click(); Okbtn.click(); Thread.sleep(4000);
		  
		  
			
			
			  Fields.get(0).clear(); Fields.get(0).sendKeys("Test@1230");
			  Fields.get(0).clear(); Fields.get(1).sendKeys("Test@1231");
			  Fields.get(0).clear(); Fields.get(2).sendKeys("Test@1231");
			  ChangegPAsswordBtn.get(1).click(); Thread.sleep(2000); Okbtn.click();
			 
			 
		  
		  Thread.sleep(2000); BacktoDashboard.click(); Thread.sleep(2000);
		 

	}

	
	
}