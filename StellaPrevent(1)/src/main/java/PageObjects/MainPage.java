package PageObjects;

import java.util.ArrayList;
import java.util.List;

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
import org.testng.Assert;

public class MainPage {
	WebDriver driver;
	WebDriverWait wait;

	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		/*
		 * this.driver = driver; this.wait = new WebDriverWait(driver, 10);
		 */
	}

	@FindBy(xpath = "//a[@target='_blank'][normalize-space()='Sign in']")
	WebElement signinTab;
	
	
	@FindBy(xpath = "//li/button[@class='btn btn-bordered-white-rounded']")
	WebElement getstartedTab;
	
	@FindBy(xpath = "(//button[contains(text(),'Get Started')])[2]")
	WebElement getstartedTabCobranding;

	@FindBy(xpath = "//ul[@class='header-links']//a[normalize-space()='What is Stella-p?']")
	WebElement stellaP;

	@FindBy(xpath = "//ul[@class='header-links']//a[normalize-space()='Science']")
	WebElement science;

	@FindBy(xpath = "//a[normalize-space()='Pricing']")
	WebElement pricing;

	@FindBy(xpath = "//ul[@class='header-links']//a[normalize-space()='FAQ']")
	WebElement faq;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement getStarted;

	@FindBy(xpath = "//em[@class='fa fa-refresh']")
	WebElement reset;

	@FindBy(xpath = "//img[@class='cross_img']")
	WebElement crossimg;

	@FindBy(xpath = "//p[contains(text(),'Definitely')]//following::span")
	WebElement definitely;

	@FindBy(xpath = "//p[contains(text(),'Definitely')]//following::span")
	WebElement hardly;

	@FindBy(xpath = "//span[@class='checkmark_r']")
	List<WebElement> sel;

	@FindBy(xpath = "//label[@class='container_c']")
	List<WebElement> agreement;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement emailSignup;

	@FindBy(xpath = "//input[@formcontrolname='firstName']")
	WebElement firstName;

	@FindBy(xpath = "//input[@formcontrolname='lastName']")
	WebElement lastName;

	@FindBy(xpath = "//input[@type='email']")
	WebElement email;

	@FindBy(xpath = "//input[@class='ycptinput']")
	WebElement emailyupmail;

	@FindBy(xpath = "//input[@formcontrolname='phoneNumber']")
	WebElement phoneno;

	@FindBy(xpath = "//input[@formcontrolname='password']")
	WebElement password;

	@FindBy(xpath = "//input[@formcontrolname='cpassword']")
	WebElement confPassword;

	@FindBy(xpath = "//div/button[contains(text(),'Sign Up')]")
	WebElement signup;

	@FindBy(xpath = "//select[@formcontrolname='year']")
	WebElement age;

	@FindBy(xpath = "//select[@formcontrolname='month']")
	WebElement month;

	@FindBy(xpath = "//select[@formcontrolname='phoneCountry']")
	WebElement country;

	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement YesBtn;

	@FindBy(xpath = "//button[contains(text(),'No')]")
	WebElement NoButton;

	@FindBy(xpath = "//h2[@class='swal2-title']")
	WebElement RegistartionSuccess;

	@FindBy(xpath = "//div/button[contains(text(),'Proceed')]")

	WebElement SuccessMsgProceedBtn;

	@FindBy(xpath = "//div[@class='register_info1 register_popup_1 ng-star-inserted']")
	WebElement SuccessMsgOfRegistartion;

	@FindBy(xpath = "//div/button[contains(text(),'Ok')]")
	WebElement SuccessPageOkButton;

	@FindAll(@FindBy(xpath = "//button[contains(text(),'Choose')]"))
	List<WebElement> chooseBtn;

	@FindBy(xpath = "//input[@class='ycptinput']")
	WebElement enteremail;
	@FindBy(xpath = "//i[@class='material-icons-outlined f36']")
	WebElement checkinbox;

	@FindBy(xpath = "//span[contains(text(),'Click Here')]")
	WebElement registerlinkClickHere;

	@FindBy(xpath = "//input[@name='email']")
	WebElement EnterEmail;

	@FindBy(xpath = "//input[@name='password']")
	WebElement EnterPass;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement LoginBtnNewPage;

	@FindBy(xpath = "//input[@placeholder='Code']")
	WebElement EnterCode;

	@FindBy(xpath = "//div/div[contains(text(),'Verify')]")
	List<WebElement> VerifyBtn;

	@FindBy(xpath = "//div[@class='css-901oao r-yz63pa r-1sdtav4 r-187bz1k r-fdjqy7']")
	WebElement UserName;

	

	@FindAll(@FindBy(xpath = "//div/a/img[@alt='Stella']"))
	List<WebElement> StellaLogo;

	@FindAll(@FindBy(xpath = "//div/button[contains(text(),'Learn more')]"))
	List<WebElement> LearnMoreBtn;

	@FindBy(xpath = "//div[@class='hero-details']")
	WebElement StellaPInfo;

	@FindAll(@FindBy(xpath = "//li/a[contains(text(),'Science')]"))
	List<WebElement> Science;

	@FindAll(@FindBy(xpath = "//li/a[contains(text(),'Pricing')]"))
	List<WebElement> Pricing;

	@FindAll(@FindBy(xpath = "//a[contains(text(),'FAQ')]"))
	List<WebElement> FAQ;

	@FindBy(xpath = "//div[@class='hero-inner-left']")
	WebElement ScienceInfo;

	@FindBy(xpath = "//div[@class='hero-inner-left']")
	WebElement PricingInfo;

	@FindAll(@FindBy(xpath = "//div[@class='hero-inner-left']"))
	List<WebElement> FAQInfo;

	@FindBy(xpath = "//img[@class='cross_img']")
	WebElement CrossIconGEtstartedPage;

	@FindBy(xpath = "//div[@class='left_icon ng-star-inserted']")
	WebElement BackArrowGetStartedPage;

	@FindBy(xpath = "//div[@class='right_icon ng-star-inserted']")
	WebElement ForwardArrowGetStartedPage;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement OkBtn;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement CancelBtnGetStartedPage;

	@FindBy(xpath = "//div/em[@class='fa fa-refresh']")
	WebElement ResetIcon;

	@FindBy(xpath = "//div[contains(@class, 'lms') and text() = 'CURIO Registration']")

	WebElement CurioRegistration;

	@FindBy(xpath = "//div[@class='swal2-html-container']")
	WebElement ErrorMSg;

	@FindBy(xpath = "//h2[@class='swal2-title']")
	WebElement ErrorMSgofCheckBox;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement ErrorMSgofCheckBoxOkbtn;
	
	@FindBy(xpath="//div[@class='display-board']")
	WebElement image;
	
	@FindBy(xpath="//button[@class='btn btn-facebook']")
	WebElement LoginWithFacebook;
	
	@FindBy(xpath="//span[@class='btn-fb-title']")
	WebElement fbLogin;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement fbEmailinput;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement fbPassword;
	
	@FindBy(xpath="//label[@id='loginbutton']")
	WebElement loginbtn;
	
	@FindBy(xpath="//input[@placeholder='Search by first/last/phone/email']")
	WebElement SearchUSer;
	
	
	@FindBy(xpath="//span[@class='menu-sidebar' and text()='Patient List']")
	WebElement patientlist;
	
	@FindBy(xpath="//div[contains(text(),'CURIO Registration')]")
	WebElement Registration_onMailclick;
	
	@FindBy(xpath="//td[@class='mat-cell cdk-column-firstName mat-column-firstName ng-star-inserted']")
	WebElement VerifyPAtientInortal;
	
	@FindBy(xpath="//img[@alt='Stella']")
	List<WebElement> StellaLogos;
	
	
	@FindBy(xpath="//div[@class='accordian-header']")
	List<WebElement> TabDropDown;
	
	@FindBy(xpath="//h3[contains(text(),'Meet MamaLift')]")
	WebElement MamaliftText;
	
	@FindBy(xpath="//a[contains(text(),'Terms of Use')]")
	WebElement TermsOFUSe;
	
	@FindBy(xpath="//a[contains(text(),'Privacy Policy')]")
	WebElement Privacypolicy;
	
	@FindBy(xpath="//a[contains(text(),'Contact Us')]")
	WebElement ContactUs;
	
	@FindBy(xpath="//label[@class='cell-label']")
	List<WebElement> LabelsforContactus;
	
	@FindBy(xpath="//h4[@class='t-heading']")
	WebElement Heading;
	
	@FindBy(xpath="//a[@class='poweredby']")
	WebElement PowerBylogo;
	
	@FindBy(xpath="//a[text()='Forgot Password?']") WebElement forgot;
	@FindBy(xpath="//input[@type='email']")WebElement email1;
	@FindBy(xpath="//input[@type='submit']")WebElement send;
	
	@FindBy(xpath="//i[@title='Unlock Contents']")
	WebElement UnlockContentAction;
	
@FindBy(xpath="//button[@class='btn btn-google']")
WebElement signupgoogle;

@FindBy(xpath=" //button[@class='btn btn-black']")
WebElement signupapple;

@FindBy(xpath="//button[normalize-space()='No']")
WebElement no;
	
@FindBy(xpath="//input[@type='text']")
List<WebElement> EnetrDetailsofpremuser;

@FindBy(xpath="//input[@placeholder='Card Number']")
WebElement cardno;

@FindBy(xpath="//input[@placeholder='MM/YY']")
WebElement mmyy;

@FindBy(xpath="//input[@placeholder='CVV']")
WebElement cvv;

@FindBy(xpath="//input[@placeholder='Zip']")
WebElement ZipCode;

@FindBy(xpath="//h2[@id='swal2-title']")
WebElement SuccessText;

@FindBy(xpath="//button[contains(text(),'Proceed')]")
WebElement Proceed;

@FindBy(xpath="//button[contains(text(),'Pay')]")
WebElement PayButton;

@FindBy(xpath="//a[contains(text(),'Click Here')]")
WebElement ClickHere;

@FindBy(xpath="//input[@type='password']")
List<WebElement> Passwords;

@FindBy(xpath="//input[@value='SAVE']")
WebElement SaveBtn;

@FindBy(xpath="//p[contains(text(),'Login to your account')]")
WebElement Loginaccount;

@FindBy(xpath="//div[@class='recoverPasswordSuccess']")
WebElement Success;

@FindBy(xpath="//span[contains(text(),'Continue')]")
WebElement ContinuBtn;

@FindBy(xpath="//input[@id='identifierId']")
WebElement gmailinput;

@FindBy(xpath="//span[@jsname='V67aGc' and text()='Next']")
WebElement nextBtn;

@FindBy(xpath="//input[@name='password']")
WebElement gmailPassword;

@FindBy(xpath="//input[@id='c3']")
WebElement showpassword;//input[@id='c3']

@FindBy(xpath="//span[@class='btn-google-title']")
WebElement Googleloginbtn;

@FindBy(xpath="//div[@class='BHzsHc']")
WebElement useAnotherAccount;

@FindBy(xpath="//div[normalize-space()='CURIO Registration']")
WebElement curioRegEmail;

@FindBy(xpath="//button/div[normalize-space()='Forgot Password']")
WebElement forgetPassEmail;


	
@FindBy(xpath="//span[contains(text(),' Unlock All Content ')]")
WebElement AllContent;

@FindBy(xpath="//button[contains(text(),'Change')]")
WebElement ChangeButton;

@FindBy(xpath="//div[@class='mat-select-arrow']")
List<WebElement> DrpDown;

@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div/form/div[2]/select")
WebElement ContactUsDropDown;

@FindBy(xpath="//option")
List<WebElement> DropDownOptionValue;

@FindBy(xpath="(//div[@style='color: rgba(0, 123, 255, 1)'])[1]")
WebElement StaticOtp;

@FindBy(xpath="//div[@class='cardPaymentView']//input[@id='card_number']")
WebElement Cardnumber;
//checking all URL's present on Landing page

	
	
	
	
	//select premium plan on landing page 
	public void selectpremiumplan(String Email,String CardNo,String expcode,String CVV,String FirstName,String ZIPcode) throws InterruptedException
	{
		
		
		
		  Thread.sleep(5000);
		  
		  chooseBtn.get(1).click();Thread.sleep(8000); 
		 
		
		  
		  Cardnumber.sendKeys(CardNo);
		
				PayButton.click();
		 System.out.println(SuccessText.getText());
		 Proceed.click();
	}


	public void registerCobranding() throws InterruptedException {
		Thread.sleep(2000);
		getstartedTabCobranding.click();
		Thread.sleep(2000);
		getStarted.click();
		Thread.sleep(2000);
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='checkmark_r']")));	
		sel.get(1).click();
		Thread.sleep(500);
		sel.get(1).click();
		Thread.sleep(1000);
		sel.get(1).click();
		
		  Thread.sleep(1000); sel.get(1).click(); Thread.sleep(1000);
		  sel.get(1).click(); Thread.sleep(1000); sel.get(1).click();
		  Thread.sleep(1000); sel.get(1).click(); Thread.sleep(1000);
		  sel.get(1).click(); Thread.sleep(2000); sel.get(1).click();
		 
		Thread.sleep(3000);
         try
         {
        	 sel.get(1).click();
         }
         catch(Exception e)
         {
        	 e.printStackTrace();
         }
  
		 emailSignup.click();
	}
	
	//click on get started on landing page
	public void register() throws InterruptedException {
		Thread.sleep(2000);
		getstartedTab.click();
		Thread.sleep(2000);
		getStarted.click();
		Thread.sleep(2000);
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='checkmark_r']")));	
		sel.get(1).click();
		Thread.sleep(1000);
		sel.get(1).click();
		Thread.sleep(1000);
		sel.get(1).click();
		Thread.sleep(1000);
		sel.get(1).click();
		
		Thread.sleep(1000);/*
							 * sel.get(1).click(); Thread.sleep(1000); sel.get(1).click();
							 * Thread.sleep(1000); sel.get(1).click(); Thread.sleep(1000);
							 * sel.get(1).click(); Thread.sleep(1000); sel.get(1).click();
							 * Thread.sleep(2000); sel.get(1).click();
							 */
		 
		Thread.sleep(3000);
        
  
		 emailSignup.click();
	}
	
	
	//chq@yopmail.com
	

	//on sign up email page enter all the details in required field
	public void emailregister(String FirstName,String Email,String mobileNo,String Password) throws InterruptedException {
		Thread.sleep(5000);
		firstName.sendKeys(FirstName);
		lastName.sendKeys("lastname");
		email.sendKeys(Email);
		phoneno.sendKeys(mobileNo);

		Select sage = new Select(age);
		sage.selectByValue("27");

		Select sCountry = new Select(country);
		sCountry.selectByValue("91");

		password.sendKeys(Password);
		confPassword.sendKeys(Password);

		WebElement element = signup;
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		signup.click();
		Thread.sleep(4000);
		System.out.println(ErrorMSgofCheckBox.getText());Thread.sleep(1000);
		ErrorMSgofCheckBoxOkbtn.click();
		Thread.sleep(2000);
		agreement.get(1).click();
		agreement.get(2).click();
		agreement.get(0).click();
		// agreement.get(3).click();
		Thread.sleep(1000);
		// signup.isEnabled();

		
		  ((JavascriptExecutor)
		  driver).executeScript("arguments[0].scrollIntoView(true);", element);
		  Thread.sleep(100); 
		  signup.click();
		 

	}
   //select basic plan 
	public void selectBasicPlan() throws InterruptedException {
		Thread.sleep(2000);
		chooseBtn.get(0).click();
		Thread.sleep(2000);
		try {
		//YesBtn.click();
		Thread.sleep(2000);
		System.out.println(RegistartionSuccess.getText());

		SuccessMsgProceedBtn.click();
		Thread.sleep(2000);
		System.out.println(SuccessMsgOfRegistartion.getText());
		Thread.sleep(2000);
		SuccessPageOkButton.click();

		Thread.sleep(2000);}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	//checking mail after registration weather we are getting mail and code 
	public void checkmail(String Email,String Password) throws InterruptedException {
		Thread.sleep(2000);

		driver.get("https://yopmail.com/en/");
		Thread.sleep(2000);
		emailyupmail.clear();
		emailyupmail.sendKeys(Email);
		Thread.sleep(2000);
		checkinbox.click();
		Thread.sleep(2000);
		driver.switchTo().frame("ifinbox");
		Thread.sleep(4000);
		curioRegEmail.click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("ifmail");
	
		Thread.sleep(1000);
         //registration code from yopmail
		List<WebElement> code = driver.findElements(By.xpath("//span[@style='font-weight: bold']"));
		String code1 = code.get(1).getText();
		registerlinkClickHere.click();
		Thread.sleep(5000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		Thread.sleep(5000);
		EnterEmail.sendKeys(Email);
		EnterPass.sendKeys(Password);
		LoginBtnNewPage.click();
		try {

			/*
			 * int number = Integer.parseInt(str) String Registrationcode=code1.to
			 */
			EnterCode.sendKeys(code1);
			VerifyBtn.get(1).click();

			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
//sign up with FB from lnding page
	public void checkfb() throws InterruptedException
	{
		Thread.sleep(2000);
		getstartedTab.click();
		Thread.sleep(2000);
		getStarted.click();
		Thread.sleep(2000);
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='checkmark_r']")));	
		sel.get(1).click();
		Thread.sleep(500);
		sel.get(1).click();
		Thread.sleep(1000);
		sel.get(1).click();
		Thread.sleep(1000);
		sel.get(1).click();
		Thread.sleep(1000);
		sel.get(1).click();
		Thread.sleep(1000);
		sel.get(1).click();
		Thread.sleep(1000);
		sel.get(1).click();
		Thread.sleep(1000);
		sel.get(1).click();
		Thread.sleep(2000);
		sel.get(1).click();
		Thread.sleep(3000);
         try
         {
        	 sel.get(1).click();
         }
         catch(Exception e)
         {
        	 e.printStackTrace();
         }
LoginWithFacebook.click();
		
		String loginwindow= driver.getWindowHandle();
		System.out.println(loginwindow);
		
		  //fbLogin.click(); 
		  for(String winHandle : driver.getWindowHandles())
		  {
		  driver.switchTo().window(winHandle); System.out.println(winHandle); }
		 
		Thread.sleep(3000);
		
		fbEmailinput.sendKeys("mamatesting111@gmail.com");
		fbPassword.sendKeys("Password@123");
		loginbtn.click();
		Thread.sleep(3000);
		
		ContinuBtn.click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		LoginWithFacebook.click();
		Thread.sleep(1000);
	}
	
	//sign up with google from landing page
	public void checkgooglesingnup() throws InterruptedException
	{
		Thread.sleep(2000);
		getstartedTab.click();
		Thread.sleep(2000);
		getStarted.click();
		Thread.sleep(2000);
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='checkmark_r']")));	
		sel.get(1).click();
		Thread.sleep(500);
		sel.get(1).click();
		Thread.sleep(1000);
		sel.get(1).click();
		Thread.sleep(1000);
		sel.get(1).click();
		Thread.sleep(1000);
		sel.get(1).click();
		Thread.sleep(1000);
		sel.get(1).click();
		Thread.sleep(1000);
		sel.get(1).click();
		Thread.sleep(1000);
		sel.get(1).click();
		Thread.sleep(2000);
		sel.get(1).click();
		Thread.sleep(3000);
         try
         {
        	 sel.get(1).click();
         }
         catch(Exception e)
         {
        	 e.printStackTrace();
         }
		signupgoogle.click(); 
		String loginwindow= driver.getWindowHandle();
		System.out.println(loginwindow);
		
		  //fbLogin.click(); 
		  for(String winHandle : driver.getWindowHandles())
		  {
		  driver.switchTo().window(winHandle); System.out.println(winHandle); }
		 
		Thread.sleep(3000);
	//	useAnotherAccount.click();
		//gmailinput.sendKeys("a@gmail.com");
		gmailinput.sendKeys("mamatesting111@gmail.com");
		nextBtn.click();
		gmailPassword.sendKeys("Password@123");
		showpassword.click();
		nextBtn.click();
		driver.getWindowHandle();
	Thread.sleep(10000);
		
		}
	
	//sign up with apple from landing page
	public void checksignupapple() throws InterruptedException
	{
		 for(String winHandle : driver.getWindowHandles())
		  {
		  driver.switchTo().window(winHandle); System.out.println(winHandle); 
		  }
		 
		signupapple.click();
		
		String loginwindow= driver.getWindowHandle();
		System.out.println(loginwindow);
		
		  //fbLogin.click(); 
		  for(String winHandle : driver.getWindowHandles())
		  {
		  driver.switchTo().window(winHandle); System.out.println(winHandle); }
		 
		Thread.sleep(3000);
		driver.close();
		
	}
	
	//login with facebook on reactnative site
	public void LoginWithFacebook() throws InterruptedException
	{
		LoginWithFacebook.click();
		
		String loginwindow= driver.getWindowHandle();
		System.out.println(loginwindow);
		fbLogin.click();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		    System.out.println(winHandle);
		}
		Thread.sleep(3000);
		
		fbEmailinput.sendKeys("userOne");
		fbPassword.sendKeys("Password@123");
		loginbtn.click();
	}
 
	
	//negative scenario of login on reactnative site to verify error
	public void SigninStellaLiteNegative() throws InterruptedException {
		Thread.sleep(2000);
		EnterEmail.sendKeys("pradnya.gaikwad@ebasolutions.net");
		Thread.sleep(2000);
		EnterPass.sendKeys("Password@1230");
		Thread.sleep(2000);
		LoginBtnNewPage.click();
		Thread.sleep(4000);
		System.out.println(UserName.getText());

	}	public void imgPresnet()
	{
		 try
	        {
	           Integer iBrokenImageCount = 0;
	            List<WebElement> image_list = driver.findElements(By.tagName("img"));
	            /* Print the total number of images on the page */
	            System.out.println("The page under test has " + image_list.size() + " images");
	            for (WebElement img : image_list)
	            {
	                if (img != null)
	                {
	                    if (img.getAttribute("naturalWidth").equals("0"))
	                    {
	                        System.out.println(img.getAttribute("outerHTML") + " is broken.");
	                       int count= iBrokenImageCount++;
	                    }
	                    else
	                    {
	                    	System.out.println(img.getAttribute("outerHTML") + " is present.");
	                        iBrokenImageCount++;
	                    }
	                }
	            }
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	          
	           
	        }
		 
	    }
	

	
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 
	 //negative scenarios from landing page
	public void getStartedNegativeSenarios() throws InterruptedException {
		
		 
		getstartedTab.click();
		Thread.sleep(1000);
		getStarted.click();
		Thread.sleep(7000);
		sel.get(1).click();
		Thread.sleep(7000);
		sel.get(1).click();
		BackArrowGetStartedPage.click();
		ForwardArrowGetStartedPage.click();
		Thread.sleep(7000);
		ResetIcon.click();
		/*
		 * Thread.sleep(2000); NoButton.click(); Thread.sleep(4000); ResetIcon.click();
		 */
		Thread.sleep(4000);
		YesBtn.click();
		Thread.sleep(9000);
		sel.get(2).click();
		Thread.sleep(7000);
		CrossIconGEtstartedPage.click();
		Thread.sleep(5000);
		CancelBtnGetStartedPage.click();
		CrossIconGEtstartedPage.click();
		Thread.sleep(5000);
		OkBtn.click();

	}
	
	//forget passowrd from reactnative site to check weather we are getting forget pass link on mails
	public void stellforgotpassword(String Email,String NewPassword ) throws InterruptedException {
		forgot.click();
		Thread.sleep(3000);
		email1.sendKeys(Email);
		send.click();
		driver.get("https://yopmail.com/en/");
		emailyupmail.sendKeys(Email);
		Thread.sleep(2000);
		checkinbox.click();
		Thread.sleep(2000);
		driver.switchTo().frame("ifinbox");
		Thread.sleep(4000);
		
		forgetPassEmail.click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("ifmail");
		String otpString=StaticOtp.getText().substring(30,36);
		System.out.println(otpString);
		ClickHere.click();
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		Passwords.get(0).sendKeys(otpString);
		Passwords.get(1).sendKeys(NewPassword);
		Passwords.get(2).sendKeys(NewPassword);
		SaveBtn.click();
		System.out.println("Success Message"+Success);
		Loginaccount.click();
		 EnterEmail.sendKeys(Email);
		 EnterPass.sendKeys(NewPassword);
		
		LoginBtnNewPage.click();
		Thread.sleep(1000);
		
	}
	
	
	//verify added patient from landing page is replicated or visible in careportal 
	public void CheckPatientAddedonHospitalCareportal(String FirstName) throws InterruptedException
	{
		
		patientlist.click();
		Thread.sleep(10000);
		SearchUSer.sendKeys(FirstName);
		Thread.sleep(10000);
		SearchUSer.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		SearchUSer.sendKeys(Keys.TAB);
		
		if(VerifyPAtientInortal.isDisplayed())
		{
			String nameon= VerifyPAtientInortal.getText();
			String namecheck=FirstName+" lastname";
			Assert.assertEquals(nameon.toLowerCase(),namecheck.toLowerCase());
			System.out.println("Patient is Added");
		}
		else
		{
			System.out.println("Patient is not added");
		}
	
		
		  UnlockContentAction.click(); DrpDown.get(1).click(); AllContent.click();
		  ChangeButton.click();
		  Thread.sleep(1000);
	
	}
}