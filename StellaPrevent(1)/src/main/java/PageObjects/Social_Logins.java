package PageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Social_Logins {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public Social_Logins(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[@class='btn-apple-title']")
	WebElement appleloginBtn;

	@FindBy(xpath = "//input[@id='account_name_text_field']")
	WebElement appleidinput;

	@FindBy(xpath = "//button[@id='sign-in']")
	WebElement signinbtn;

	@FindBy(xpath = "//input[@id='password_text_field']")
	WebElement password;

	@FindBy(xpath="//span[@class='btn-fb-title']")
	WebElement fbLogin;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement fbEmailinput;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement fbPassword;
	
	@FindBy(xpath="//label[@id='loginbutton']")
	WebElement loginbtn;

	@FindBy(xpath="//span[@class='btn-google-title']")
	WebElement Googleloginbtn;
	
	@FindBy(xpath="//div[@class='BHzsHc']")
	WebElement useAnotherAccount;
	
@FindBy(xpath="//input[@id='identifierId']")
WebElement gmailinput;

@FindBy(xpath="//span[@jsname='V67aGc' and text()='Next']")
WebElement nextBtn;

@FindBy(xpath="//input[@name='password']")
WebElement gmailPassword;

@FindBy(xpath="//input[@id='c3']")
WebElement showpassword;//input[@id='c3']

@FindBy(xpath="//div[@class='css-901oao r-yz63pa r-1sdtav4 r-187bz1k r-fdjqy7']")
List<WebElement> NAme;

@FindBy(xpath="//div[contains(text(),'Logout')]")
WebElement Logout;

	public void loginApple() throws InterruptedException {
		Thread.sleep(2000);
		String loginwindow= driver.getWindowHandle();
		System.out.println(loginwindow);
		appleloginBtn.click();
		Thread.sleep(2000);
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		    System.out.println(winHandle);
		}
		//testmamalift@gmail.com
	//	Stella@123
		Thread.sleep(3000);
		appleidinput.sendKeys("testmamalift@gmail.com");
		signinbtn.click();
		password.sendKeys("Stella@123");
		signinbtn.click();
		Thread.sleep(10000);

	}
	
	
	public void loginFacebook() throws InterruptedException
	{
		Thread.sleep(2000);
		String loginwindow= driver.getWindowHandle();
		System.out.println(loginwindow);
		fbLogin.click();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		    System.out.println(winHandle);
		}
		Thread.sleep(3000);
		
		fbEmailinput.sendKeys("mamatesting111@gmail.com");
		fbPassword.sendKeys("Password@123");
		loginbtn.click();
		
	}
	
	public void loginGoogle() throws InterruptedException
	{
		Thread.sleep(3000);
		String loginwindow= driver.getWindowHandle();
		System.out.println(loginwindow);
		Googleloginbtn.click();
		
		for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		    System.out.println(winHandle);
		}
	//	useAnotherAccount.click();
		//gmailinput.sendKeys("a@gmail.com");
		gmailinput.sendKeys("mamatesting111@gmail.com");
		nextBtn.click();
		gmailPassword.sendKeys("Password@123");
		Thread.sleep(1000);
		nextBtn.click();
		driver.getWindowHandle();
	Thread.sleep(10000);
	//System.out.println(NAme.get(0).getText()+"Logged in ");
		
	//Logout.click();
		
	}
	}