package PageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Resources.AppDriver;
import Resources.UpdateProperty;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

	//AndroidDriver driver;
	
//	AppiumDriver<MobileElement> driver;

	public LoginPage() {
		
		 try {
			 PageFactory.initElements(AppDriver.getDriver(), this);
		    } catch (Exception e) {

		        e.printStackTrace();
		    }

	}

	@FindBy(xpath = "//android.widget.Button[@text='IGNORE']")
	private WebElement Ignore;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")
	WebElement Username;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	WebElement Password;

	@FindBy(xpath = "//android.widget.TextView[@text='LOG IN']")
	WebElement LoginBtn;
	
	@AndroidFindAll(@AndroidBy(xpath="//android.widget.TextView"))
	List<WebElement> text;
	
	@AndroidFindBy(xpath="//android.widget.EditText")
	WebElement code;
	
	@AndroidFindBy(xpath="//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup")
	WebElement acknowledge;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='I ACCEPT']")
	WebElement accept;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
	WebElement crossicon;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Resend']")
	WebElement resendbtn;
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout/android.widget.TextView")
	WebElement patientname;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	WebElement profileicon;
	
	public void negativelogin() throws InterruptedException
	{
		Thread.sleep(4000);
		Username.sendKeys("tyjk");	
		Thread.sleep(3000);
		Password.sendKeys("kshc");
		LoginBtn.click();
		Thread.sleep(3000);
		System.out.println("Email error message" +text.get(3).getText());
		System.out.println("Password error message"+text.get(7).getText());	
	}

	public void Login() throws InterruptedException 
	{

//Username.sendKeys("onkar11@yopmail.com");
		Username.sendKeys("pradnyaa20sept@yopmail.com");
//Username.sendKeys("mlanewuser@yopmail.com");
	Password.sendKeys("Test@123");
	LoginBtn.click();
	
	}
	
	public void resendcodeclick(String ptemail) throws InterruptedException
	{
		Thread.sleep(5000);
		Username.sendKeys(ptemail);
		Password.sendKeys("Test@1230");
		LoginBtn.click();
		Thread.sleep(3000);
		resendbtn.click();	 
	}
	
	public void newUserLogin(String ptemail,String regcode) throws InterruptedException
	{
		Thread.sleep(5000);
		Username.sendKeys(ptemail);
		Password.sendKeys("Test@1230");
		LoginBtn.click();
		Thread.sleep(3000);
		code.sendKeys(regcode);		
		Thread.sleep(1000);
		acknowledge.click();
		Thread.sleep(2000);
		accept.click();
		Thread.sleep(2000);
		crossicon.click();
	//	UpdateProperty.updateconfig("Patientemail", ptemail);
	}
	
	public String fetchPatientname() throws InterruptedException
	{
		profileicon.click();
		Thread.sleep(2000);
		String name =patientname.getText();
	System.out.println(name.strip());
	String text = name.strip();		
	
	String[] splited = name.split("\\s+");

    String fname=splited[0];
    String split_second=splited[1];    
    System.out.println(fname);
    System.out.println(split_second);
  
((PressesKey) AppDriver.getDriver()).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
    
    return fname;
	}

}
