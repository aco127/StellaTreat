package PageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LandingPage {

	WebDriver driver;
	WebDriverWait wait;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li/button[@class='btn btn-bordered-white-rounded']")
	WebElement getstartedTab;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement getStarted;

	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement YesBtn;

	@FindBy(xpath = "//span[@class='checkmark_r']")
	List<WebElement> sel;
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

	@FindBy(xpath = "//button[contains(text(),'Ok')]")
	WebElement ErrorMSgofCheckBoxOkbtn;

	@FindBy(xpath = "//div[@class='left_icon ng-star-inserted']")
	WebElement BackArrowGetStartedPage;

	@FindBy(xpath = "//div[@class='right_icon ng-star-inserted']")
	WebElement ForwardArrowGetStartedPage;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement OkBtn;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement getstartedTabonclick;

	@FindBy(xpath = "(//button[contains(text(),'Get Started')])[2]")
	WebElement getstartedTabCobranding;

	@FindBy(xpath = "//ul[@class='header-links']//a[normalize-space()='What is Stella-p?']")
	WebElement stellaP;

	@FindBy(xpath = "//ul[@class='header-links']//a[normalize-space()='Science']")
	WebElement science;

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

	@FindAll(@FindBy(xpath = "(//a[contains(text(),'What is MamaLift?')])"))
	List<WebElement> whatismamalift;

	@FindAll(@FindBy(xpath = "//a[contains(text(),'FAQ')]"))
	List<WebElement> FAQ;

	@FindAll(@FindBy(xpath = "//button[@class='btn select-plan-btn']"))
	List<WebElement> order;

	@FindBy(xpath = "//div[@class='hero-inner-left']")
	WebElement ScienceInfo;

	@FindBy(xpath = "//div[@class='hero-inner-left']")
	WebElement PricingInfo;

	@FindAll(@FindBy(xpath = "//div[@class='hero-inner-left']"))
	List<WebElement> FAQInfo;

	@FindBy(xpath = "//img[@class='cross_img']")
	WebElement CrossIconGEtstartedPage;

	@FindBy(xpath = "//img[@alt='Stella']")
	List<WebElement> StellaLogos;

	@FindBy(xpath = "//div[@class='accordian-header']")
	List<WebElement> TabDropDown;

	@FindBy(xpath = "//h3[contains(text(),'Meet MamaLift')]")
	WebElement MamaliftText;

	@FindBy(xpath = "//a[contains(text(),'Terms of Use')]")
	WebElement TermsOFUSe;

	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	WebElement Privacypolicy;

	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
	WebElement ContactUs;

	@FindBy(xpath = "//img[@src='./assets/img/facebook.svg']")
	WebElement fbicon;

	@FindBy(xpath = "//a[@href='https://twitter.com/CurioDTx")
	WebElement instaicon;

	@FindBy(xpath = "//a[@href='https://twitter.com/CurioDTx']")
	WebElement twittericon;

	@FindAll(@FindBy(xpath = "//a[contains(text(),'Sign in')]"))
	List<WebElement> signinLink;

	@FindBy(xpath = "//b[@class='mb-1']")
	WebElement contactus;

	@FindBy(xpath = "//p[@class='p-spacing']")
	WebElement footerdata;
	
	@FindBy(xpath = "//a/img")
	List<WebElement> images;
	
	
	
	
	@FindBy(xpath = "//p[@class='p-spacing']")
	WebElement footerdatanext;

	String footerText = "If you are in a crisis or in danger of harming yourself, please call the National Suicide Prevention Lifeline at 1-800-273-TALK (8255).MamaLift is available based on the current FDA Enforcement Discretion Policy for Digital Health Devices for Psychiatric Disorders and is intended for use by women 18 years and older who wish to manage their symptoms of depression and anxiety. MamaLift does not provide medical advice and is not intended to replace treatment by a licensed healthcare professional. MamaLift has not been cleared by the FDA for these indications.";
	//String ftext = " MamaLift is available based on the current FDA Enforcement Discretion Policy for Digital Health Devices for Psychiatric Disorders and is intended for use by women 18 years and older who wish to manage their symptoms of depression and anxiety. MamaLift does not provide medical advice and is not intended to replace treatment by a licensed healthcare professional. MamaLift has not been cleared by the FDA for these indications. ";

	public void checkFooterText() throws InterruptedException {
		Thread.sleep(6000);
//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", footerdata);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		String ActualFooter = footerdata.getText();
		String NextFooter = footerdatanext.getText();

		SoftAssert assertobj = new SoftAssert();
		assertobj.assertEquals(ActualFooter.replaceAll("[\\n\\t\\r ]", ""), footerText.replaceAll("[\\n\\t\\r ]", ""),
				"Footer doesnt match");
//assertobj.assertEquals(NextFooter.replaceAll("[\\n\\t\\r ]", ""), ftext.replaceAll("[\\n\\t\\r ]", ""), "Footer 2 nd text doesnt match");

		assertobj.assertAll();
	}

	public void checkHeaderLinks() throws InterruptedException {
		Thread.sleep(6000);

		SoftAssert assertobj = new SoftAssert();
//SoftAssert assertobj = new SoftAssert();

		whatismamalift.get(0).click();
		Thread.sleep(2000);
		String whatismamalift = "https://mamalift-qa.curio-dtx.com/what-is-mamalift";//driver.getCurrentUrl();
		assertobj.assertEquals(driver.getCurrentUrl(), whatismamalift, "NOT ABLE TO CLICK ON WHAT IS MAMALIFT");

		Science.get(0).click();
		Thread.sleep(2000);
		String ScienceTabURL ="https://mamalift-qa.curio-dtx.com/science";// driver.getCurrentUrl();
		assertobj.assertEquals(driver.getCurrentUrl(), ScienceTabURL, "NOT ABLE TO CLICK ON ScienceTabURLTAB");

		Pricing.get(0).click();
		Thread.sleep(2000);
		String PricingTabURL ="https://mamalift-qa.curio-dtx.com/plan-and-price";// driver.getCurrentUrl();
		assertobj.assertEquals(driver.getCurrentUrl(), PricingTabURL, "NOT ABLE TO CLICK ON PRICING TAB");

		order.get(0).click();
		assertobj.assertEquals(true, getstartedTabonclick.isDisplayed());
		CrossIconGEtstartedPage.click();

		Thread.sleep(3000);
		order.get(1).click();
		assertobj.assertEquals(true, getstartedTabonclick.isDisplayed());
		CrossIconGEtstartedPage.click();

		Thread.sleep(4000);

		FAQ.get(0).click();
		Thread.sleep(2000);
		String FAQTabURL = driver.getCurrentUrl();
		assertobj.assertEquals(driver.getCurrentUrl(), FAQTabURL, "NOT ABLE TO CLICK ON FAQTabURL TAB");

		getstartedTab.click();
		assertobj.assertEquals(true, getstartedTabonclick.isDisplayed());
		CrossIconGEtstartedPage.click();

		StellaLogo.get(0).click();
		String StellaLogoPageURL = driver.getCurrentUrl();
		assertobj.assertEquals(driver.getCurrentUrl(), StellaLogoPageURL, "NOT ABLE TO CLICK ON MAMALIFT LOGO");

		LearnMoreBtn.get(0).click();
		Thread.sleep(2000);
		String LearnMoreBtn1 = driver.getCurrentUrl();
		assertobj.assertEquals(driver.getCurrentUrl(), LearnMoreBtn1, "NOT ABLE TO CLICK ON LearnMoreBtn1 TAB");
		StellaLogo.get(0).click();

		LearnMoreBtn.get(1).click();
		Thread.sleep(2000);
		String LearnMoreBtn2 = driver.getCurrentUrl();
		assertobj.assertEquals(driver.getCurrentUrl(), LearnMoreBtn2, "NOT ABLE TO CLICK ON LearnMoreBtn1 TAB");
		StellaLogo.get(0).click();

		LearnMoreBtn.get(2).click();
		Thread.sleep(2000);
		String LearnMoreBtn3 = driver.getCurrentUrl();
		assertobj.assertEquals(driver.getCurrentUrl(), LearnMoreBtn3, "NOT ABLE TO CLICK ON LearnMoreBtn1 TAB");
		StellaLogo.get(0).click();

		LearnMoreBtn.get(3).click();
		Thread.sleep(2000);
		String LearnMoreBtn4 = driver.getCurrentUrl();
		assertobj.assertEquals(driver.getCurrentUrl(), LearnMoreBtn4, "NOT ABLE TO CLICK ON LearnMoreBtn1 TAB");
		StellaLogo.get(0).click();

		Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

		boolean b = contactus.isDisplayed();
		System.out.println(b);
		assertobj.assertEquals(true, contactus.isDisplayed(), "COntatc us not available");
//assertobj.assertEquals

		Thread.sleep(2000);
		StellaLogo.get(0).click();
		Thread.sleep(4000);
		//assertobj.assertAll();

	}

	public void checkFooterLinks() throws InterruptedException {

		Thread.sleep(6000);

		SoftAssert assertobj = new SoftAssert();

		whatismamalift.get(1).click();
		Thread.sleep(2000);
		String whatismamalift = driver.getCurrentUrl();
		assertobj.assertEquals(driver.getCurrentUrl(), whatismamalift, "NOT ABLE TO CLICK ON WHAT IS MAMALIFT");

		Science.get(1).click();
		Thread.sleep(2000);
		String ScienceTabURL = driver.getCurrentUrl();
		assertobj.assertEquals(driver.getCurrentUrl(), ScienceTabURL, "NOT ABLE TO CLICK ON ScienceTabURLTAB");

		Pricing.get(1).click();
		Thread.sleep(2000);
		String PricingTabURL = driver.getCurrentUrl();
		assertobj.assertEquals(driver.getCurrentUrl(), PricingTabURL, "NOT ABLE TO CLICK ON PRICING TAB");

		FAQ.get(1).click();
		Thread.sleep(2000);
		String FAQTabURL = driver.getCurrentUrl();
		assertobj.assertEquals(driver.getCurrentUrl(), FAQTabURL, "NOT ABLE TO CLICK ON FAQTabURL TAB");

		Thread.sleep(6000);

		String parentHandle = driver.getWindowHandle(); // get the current window handle

		TermsOFUSe.click();
		Thread.sleep(3000);
		for (String winHandle : driver.getWindowHandles()) { // Gets the new window handle
			driver.switchTo().window(winHandle);
			String TermsOFUSe = driver.getCurrentUrl();
			assertobj.assertEquals(driver.getCurrentUrl(), TermsOFUSe, "PRIVACY POLICY DIDNT NOT OPEN");
// switch focus of WebDriver to the next found window handle (that's
// your newly opened window)
		}

		driver.close(); // close newly opened window when done with it
		driver.switchTo().window(parentHandle);

		Privacypolicy.click();
		Thread.sleep(3000);

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			String PrivacyPolicyURL = driver.getCurrentUrl();
			assertobj.assertEquals(driver.getCurrentUrl(), PrivacyPolicyURL, "PRIVACY POLICY DIDNT NOT OPEN");
		}

		driver.close();
		driver.switchTo().window(parentHandle);

		assertobj.assertAll();

	}

	public void checkSocialLinks() throws InterruptedException {

		Thread.sleep(4000);
		String parentHandle = driver.getWindowHandle();
		SoftAssert assertobj = new SoftAssert();
		
		//fbicon.click();
		images.get(2).click();
		Thread.sleep(3000);
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			String fBURL = driver.getCurrentUrl();
			assertobj.assertEquals(driver.getCurrentUrl(), fBURL, "fBURL DIDNT NOT OPEN");
		}

		driver.close();
		driver.switchTo().window(parentHandle);
		images.get(2).click();
		//twittericon.click();
		Thread.sleep(3000);
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);

			String twitterURL = driver.getCurrentUrl();
			assertobj.assertEquals(driver.getCurrentUrl(), twitterURL, "Twitter DIDNT NOT OPEN");

		}

		driver.close();
		driver.switchTo().window(parentHandle);
		images.get(4).click();
		//instaicon.click();
		Thread.sleep(3000);
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);

			String instaicon = driver.getCurrentUrl();
			assertobj.assertEquals(driver.getCurrentUrl(), instaicon, "insta DIDNT NOT OPEN");

		}
		driver.close();
		driver.switchTo().window(parentHandle);

	}

	public void checksigninLink() throws InterruptedException {
		String parentHandle = driver.getWindowHandle();Thread.sleep(2000);
		signinLink.get(1).click();
		Thread.sleep(2000);

		SoftAssert assertobj = new SoftAssert();

		for (String winHandle : driver.getWindowHandles()) {

			driver.switchTo().window(winHandle);
			String Signin = driver.getCurrentUrl();
			assertobj.assertEquals(driver.getCurrentUrl(), Signin, "NOT CLICKED ON SIGNIN");

		}

		driver.close(); // close newly opened window when done with it
		driver.switchTo().window(parentHandle);

	}

	public void checkGetstartedTabs() throws InterruptedException {
		getstartedTab.click();
		Thread.sleep(4000);
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
}