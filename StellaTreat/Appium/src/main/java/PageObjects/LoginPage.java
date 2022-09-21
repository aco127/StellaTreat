package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.AppDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

	AndroidDriver driver;

	public LoginPage() {
		PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);

	}

	@FindBy(xpath = "//android.widget.Button[@text='IGNORE']")
	//@FindBy(xpath = "//android.widget.Button[@text='xys']")
	private WebElement Ignore;

	// @AndroidFindBy(xpath = "//android.widget.EditText[@text='Username...']")
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")
	WebElement Username;

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	WebElement Password;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='LOG IN']")
	WebElement LoginBtn;
	


	

	public void Login() throws InterruptedException {

		Thread.sleep(5000);

		try {
			Ignore.click();
		} catch (NoSuchElementException | StaleElementReferenceException e)
		{
          e.printStackTrace();
			
		}

		Username.sendKeys("rupalitester@yopmail.com");
		Password.sendKeys("Password@123");
		LoginBtn.click();
	}

}

