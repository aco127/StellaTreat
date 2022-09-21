package PageObjects;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.util.Assert;
import static org.junit.Assert.*;

public class SuperAdmin_RegisterCustomer {
	
	
	WebDriver driver;
	Properties prop;

	public SuperAdmin_RegisterCustomer(WebDriver driver) {
		
 this.driver = driver; PageFactory.initElements(driver, this);
		 
	}

	@FindBy(xpath="//button[@type='submit' and text()=' Register Customer ']")
	WebElement registercustbtn;

	@FindBy(xpath="//input[@formcontrolname='firstName']")
	WebElement custName;
	
	@FindBy(xpath="//input[@formcontrolname='registration_code']")
	WebElement regCode;
	
	@FindBy(xpath="//input[@formcontrolname='phoneNumber']")
	WebElement phoneNo;
	@FindBy(xpath="//input[@formcontrolname='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@formcontrolname='cpassword']")
	WebElement confPassword;
	
	
	
	@FindAll(@FindBy(xpath="//div[@class='mat-select-arrow-wrapper']"))
	List<WebElement>	 dropdown;
		
		@FindBy(xpath="//span[@class='mat-option-text' and text()=' United States ']")
		WebElement selectCountry;
		
		@FindBy(xpath="//span[@class='mat-option-text' and text()=' 1 ']")
		WebElement selectcoupon;
		
		@FindBy(xpath="//span[@class='mat-button-wrapper' and text()='Submit']")
		WebElement submitBtn;
		
		@FindBy(xpath="//input[@placeholder='Search']")
		WebElement SearhcForcustomerField;
		
		@FindBy(xpath="//input[@formcontrolname='firstName']")
		WebElement FnameField;
		
	
		
		@FindBy(xpath="//td[@role='gridcell']")
		List<WebElement> GetInforCutomerPrsent;
		
		@FindBy(xpath="//i[@title='Add Coupons']")
		WebElement AddCupons;
		@FindBy(xpath="//span[@class='mat-select-placeholder ng-tns-c14-22 ng-star-inserted']")
		WebElement DropdownArrow;
		
		@FindBy(xpath="//span[contains(text(),' 10 ')]")
		WebElement Selecycupons;
		
		@FindBy(xpath="//h5[contains(text(),'Unused Coupon:')]")
		WebElement UnusedCuponsNum;
		
		@FindBy(xpath="//button[contains(text(),'Add')]")
		WebElement AddButton;
		
		@FindBy(xpath="//button[contains(text(),' Close ')]")
		WebElement closeButton;
		
		@FindBy(xpath="//span[contains(text(),'Customer')]")
		WebElement CustomerClick;
		
		@FindBy(xpath="//div[@class='alert alert-danger ng-star-inserted']")
		WebElement GetErrorMsg;
		
		@FindBy(xpath="//i[@title='Delete']")WebElement DeleteIcon;
		@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")WebElement DeleteButton;
		@FindBy(xpath="//button[contains(text(),'OK')]")WebElement OKbutton;
		
		
		
		public void registerCustomer(String Custname,String custphone,String CustEmail,String Password) throws InterruptedException
		{
			CustomerClick.click();
			
			  registercustbtn.click(); custName.sendKeys(Custname);
			  regCode.sendKeys("12345"); dropdown.get(0).click(); selectcoupon.click();
			  dropdown.get(1).click(); selectCountry.click();
			  
			  
			  phoneNo.sendKeys(custphone); email.sendKeys(CustEmail);
			  password.sendKeys(Password); confPassword.sendKeys(Password);
			  submitBtn.click(); Thread.sleep(1000);
			 
			  SearhcForcustomerField.sendKeys(Custname);
			  System.out.println("RegisterCutomer"+GetInforCutomerPrsent.get(0).getText());
			 
			/*
			 * AddCupons.click(); DropdownArrow.click(); Selecycupons.click();
			 * AddButton.click(); Thread.sleep(1000);
			 * System.out.println("Unused Cupons="+UnusedCuponsNum.getText());
			 * closeButton.click();
			 */
		}
		
		
		public void editcustomer(String Custname ) throws InterruptedException
		{
			Thread.sleep(500);
			/*
			 * List<WebElement>
			 * optios=driver.findElements(By.xpath("//td[contains(text(),'"+Custname+
			 * "')]/following::i")); optios.get(2).click();
			 */
		WebElement option=driver.findElement(By.xpath("//i[@title='Edit Customer']"));
		option.click();
		
		for(int i =0;i<=Custname.length();i++)
		{
		
		FnameField.sendKeys(Keys.BACK_SPACE);
		
		}
			Thread.sleep(500);
			String errorMessgae=GetErrorMsg.getText();
			System.out.println("Error Msg="+errorMessgae);
			String actual="Customer name is required.";
			assertEquals(actual, errorMessgae);
			String newcust=Custname+"aa";
			FnameField.sendKeys(newcust);
			submitBtn.click();
			Thread.sleep(1000);
			CustomerClick.click();
			SearhcForcustomerField.sendKeys(newcust);
			System.out.println("Customer is updated"+GetInforCutomerPrsent.get(0).getText());
			DeleteIcon.click();
			Thread.sleep(500);
			DeleteButton.click();
			OKbutton.click();
			
		}
	
		
	
	
}
