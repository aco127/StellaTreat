package PageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ReactNative {
	
	WebDriver driver;
	WebDriverWait wait;

	Properties prop;
	public ReactNative(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='email']")
	WebElement EnterEmail;

	@FindBy(xpath = "//input[@name='password']")
	WebElement EnterPass;
	@FindBy(xpath = "//div[contains(text(),'Logout')]")

	WebElement LogoutStellaLite;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement LoginBtnNewPage;
	
	@FindBy(xpath="//p[normalize-space()='Reports']")
	WebElement Reports;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-16y2uox r-1w6e6rj r-1udh08x r-13qz1uu']")
	WebElement r;
	
	@FindAll(@FindBy(xpath="//div[@class='css-901oao css-cens5h r-tpevwd r-xr0dpn r-1enofrn r-aruset r-atwnbb r-ttb5dx']"))
	List<WebElement> actreport;
	
	@FindAll(@FindBy(xpath="//div[@class='css-1dbjc4n r-18u37iz']"))
	List<WebElement> act;
	
	@FindBy(xpath="//i[@title='Activity Record']")
	WebElement actrecordpt;

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
	
	@FindAll(@FindBy(xpath="//td[@class='mat-cell cdk-column-Title mat-column-Title ng-star-inserted']"))
	List<WebElement> allActivityHospitalPortal;
	String str[]=null;
	String activity;
	
	public void SigninStellaLite(String email, String password) throws InterruptedException {
		Thread.sleep(2000);
		EnterEmail.sendKeys(email);
		Thread.sleep(2000);
		EnterPass.sendKeys(password);
		Thread.sleep(2000);
		LoginBtnNewPage.click();
		Thread.sleep(10000);
		
		String URLExpected="https://mamalift-qa-web.curio-dtx.com/Dashboard";

		//Assert.assertEquals(driver.getCurrentUrl(), URLExpected, "Not able to login");

	}
	
	public List<String> getreport() throws InterruptedException
	{
		Thread.sleep(8000); 
		Reports.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", r);
		Thread.sleep(4000); 
		List<String> myList = new ArrayList<String>();
		
		
			for (int i =0;i<act.size();i++)
			{
				try {
					activity=actreport.get(i).getText();
					myList.add(activity);
				} catch (Exception e) {
					
				//	e.printStackTrace();
				}	
			}
			System.out.println("Report activity is:"+activity);
		
		
		return myList;
	}

	public void checkUrlOnReactnative() throws InterruptedException
	{
	Thread.sleep(7000);
		 String parentHandle = driver.getWindowHandle(); // get the current window handle
		    System.out.println(parentHandle);      
		TermsOFUSe.click();
		for (String winHandle : driver.getWindowHandles()) { //Gets the new window handle
	        driver.switchTo().window(winHandle);        // switch focus of WebDriver to the next found window handle (that's your newly opened window)              
	    }
		System.out.println(driver.getCurrentUrl());
	//Now your driver works on the current new handle
	//Do some work here.....
	//Time to go back to parent window
	    driver.close();                                 // close newly opened window when done with it
	    driver.switchTo().window(parentHandle);
	    
	    
	    Privacypolicy.click();
	    for (String winHandle : driver.getWindowHandles()) { 
	        driver.switchTo().window(winHandle);                  
	    }
		System.out.println(driver.getCurrentUrl());
	    driver.close();                                
	    driver.switchTo().window(parentHandle);
		
	    
	    PowerBylogo.click();
	    for (String winHandle : driver.getWindowHandles()) { 
	        driver.switchTo().window(winHandle);                  
	    }
		System.out.println(driver.getCurrentUrl());
	    driver.close();                                
	    driver.switchTo().window(parentHandle);
	    
	    ContactUs.click();
	    System.out.println(Heading.getText());
	    System.out.println(driver.getCurrentUrl());
	    
	    for(int i=0;i<LabelsforContactus.size();i++)
	    {
	    	
	    	System.out.println("Filed ="+LabelsforContactus.get(i).getText());
	    }
	    int presentfield=LabelsforContactus.size();
	    if(presentfield==5||presentfield==2)
	    {
	    	System.out.println("Field counts is matching");
	    }
	    else
	    {
	    	System.out.println("Something is missing");
	    }
	    driver.navigate().back();
	    
		
	}
	
	public void logout() throws InterruptedException {
		Thread.sleep(5000);
		LogoutStellaLite.click();
		Thread.sleep(5000);
	}
}
