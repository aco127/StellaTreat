package PageObjects;
 
import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
 
public class SuperAdmin_DTC_Cobranding {
 
WebDriver driver;
Properties prop;
 
String newHospitalURL;
String CouponCode;
static String remail;
 
public SuperAdmin_DTC_Cobranding(WebDriver driver) {
 
this.driver = driver;
PageFactory.initElements(driver, this);
 
}
 
@FindBy(xpath = "//button[@type='submit' and text()=' Register Customer ']")
WebElement registercustbtn;
 
@FindBy(xpath = "//input[@formcontrolname='firstName']")
WebElement custName;
 
@FindBy(xpath = "//input[@formcontrolname='registration_code']")
WebElement regCode;
 
@FindBy(xpath = "//input[@formcontrolname='phoneNumber']")
WebElement phoneNo;
@FindBy(xpath = "//input[@formcontrolname='email']")
WebElement email;
 
@FindBy(xpath = "//input[@formcontrolname='password']")
WebElement password;
 
@FindBy(xpath = "//input[@name='password']")
WebElement reactnativepassword;
 
@FindBy(xpath = "//input[@formcontrolname='cpassword']")
WebElement confPassword;
 
@FindBy(xpath = "//button[@class='mat-raised-button close-btn-modal closebtn']")
WebElement closebtn;
 
@FindAll(@FindBy(xpath = "//div[@class='mat-select-arrow']"))
List<WebElement> dropdown;
 
@FindBy(xpath = "//span[@class='mat-option-text' and text()=' United States ']")
WebElement selectCountry;
 
@FindBy(xpath = "//span[@class='mat-option-text' and text()=' 1 ']")
WebElement selectcoupon;
 
@FindBy(xpath = "//span[@class='mat-button-wrapper' and text()='Submit']")
WebElement submitBtn;
 
@FindBy(xpath = "//input[@placeholder='Search']")
WebElement SearhcForcustomerField;
 
@FindBy(xpath = "//tr[@class='mat-row ng-star-inserted']")
WebElement GetInforCutomerPrsent;
 
@FindBy(xpath = "//i[@title='Add Coupons']")
WebElement AddCupons;
@FindBy(xpath = "//span[@class='mat-select-placeholder ng-tns-c14-22 ng-star-inserted']")
WebElement DropdownArrow;
 
@FindBy(xpath = "//span[contains(text(),' 10 ')]")
WebElement Selecycupons;
 
@FindBy(xpath = "//h5[contains(text(),'Unused Coupon:')]")
WebElement UnusedCuponsNum;
 
@FindBy(xpath = "//button[contains(text(),'Add')]")
WebElement AddButton;
 
@FindBy(xpath = "//button[contains(text(),' Close ')]")
WebElement closeButton;
 
@FindBy(xpath = "//span[contains(text(),'Customer')]")
WebElement CustomerClick;
 
@FindBy(xpath = "//i[@class='fa fa-eye']")
WebElement detailschk;
 
@FindBy(xpath = "//div[@class='mat-select-arrow-wrapper']")
WebElement coupondropdown;
 
@FindBy(xpath = "//button[normalize-space()='Add']")
WebElement addBtn;
 
@FindBy(xpath = "//div[@class='domain-div ng-star-inserted']/span")
WebElement clinicDomain;
 
@FindBy(xpath = "//div[@class='coolQRCode']")
WebElement qrcode;
 
@FindBy(xpath = "//div[@class='cdk-global-overlay-wrapper']//div[2]//h5[1]//span")
WebElement unusedCouponCode;
 
@FindBy(xpath = "//input[@id='InputEmail']")
WebElement emailaddress;
 
@FindBy(xpath = "//input[@id='InputPassword']")
WebElement hospitalPassword;
 
@FindBy(xpath = "//span[@class='mat-button-wrapper']")
WebElement loginbtn;
 
@FindBy(xpath = "//th[normalize-space()='Action']")
WebElement action;
 
@FindBy(xpath = "//tbody/tr[2]/td[2]/button[1]")
WebElement usecodebtn;
 
@FindBy(xpath = "//tr[td[normalize-space()='Use Code']]")
WebElement couponcode;
 
@FindBy(xpath = "//span[@class='menu-sidebar' and text()='Patient List']")
WebElement patientlist;
 
@FindBy(xpath = "//button[normalize-space()='Add Patient']")
WebElement addpatient;
 
@FindBy(xpath = "(//div[@class='mat-select-arrow'])[2]")
WebElement MamaLiftDropDown;
 
@FindBy(xpath = "//span[contains(text(),' MamaLift DTC ')]")
WebElement DTcDropDown;
 

@FindBy(xpath=" //span[contains(text(),' MamaLift Axia ')]")
WebElement axiadropDown;
@FindBy(xpath = " //input[@formcontrolname='firstName']")
WebElement firstname;
 
@FindBy(xpath = "//input[@formcontrolname='middleName']")
WebElement middlename;
 
@FindBy(xpath = "//input[@formcontrolname='lastName']")
WebElement lastname;
 
@FindBy(xpath = "//select[@formcontrolname='phoneCountry']")
WebElement country;
 
@FindBy(xpath = "//input[@formcontrolname='phoneNumber']")
WebElement phnnoaddpt;
 
@FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='India']")
WebElement selectcountry;
 
@FindBy(xpath = "//input[@formcontrolname='phoneNumber']")
WebElement phoneno;
 
@FindBy(xpath = "//mat-select[@formcontrolname='preferredGender']")
WebElement prefgender;
 
@FindBy(xpath = "//span[normalize-space()='She/her']")
WebElement sheher;
 
@FindBy(xpath = "//div[@class='submit_referal']/button[@class='mat-raised-button save-btn-modal']")
WebElement savebtn;
 
@FindBy(xpath = "//input[@class='ycptinput']")
WebElement inputEmail;
 
@FindBy(xpath = "//i[@class='material-icons-outlined f36']")
WebElement chkInbox;
 

@FindBy(xpath="//div[normalize-space()='CURIO Registration']")
WebElement curioRegEmail;
 

@FindBy(xpath="//i[@title='Caretaker List']")
WebElement caretakerlist;
 
@FindBy(xpath="//div[@class='mat-form-field-infix']/input[@placeholder='Search by first/last name']")
WebElement searchcaretaker;
 
@FindBy(xpath="//td[@class='text-center']/input[@type='checkbox']")
WebElement selectcaretaker;
 
@FindBy(xpath="//button[@class='mat-raised-button save-btn-modal' and text()=' Save']")
WebElement save;
 

@FindBy(xpath = "//a[contains(text(),'Click here')]")
WebElement clickHereLink;


 
@FindBy(xpath="//a[normalize-space()='Click Here']")
WebElement clickhereforhospitalLink;
 

@FindBy(xpath = "//select[@formcontrolname='age']")
WebElement age;
 
@FindBy(xpath = "//select[@formcontrolname='month']")
WebElement month;
 
@FindBy(xpath = "//select[@formcontrolname='countryName']")
WebElement countryName;
 
@FindAll(@FindBy(xpath = "//span[@class='checkmark_c']"))
List<WebElement> checkmark;
 
@FindBy(xpath = "//button[@type='button']")
WebElement button;
 
@FindBy(xpath = "//span[@style='font-weight: bold']")
List<WebElement> code;

@FindBy(xpath="//div[@id='mail']//p")
WebElement registerationcode;
 
@FindBy(xpath = "//input[@name='email']")
WebElement reactnativemail;
 

@FindBy(xpath="//input[@type='submit']")
WebElement reactnativeloginbtn;
  
@FindBy(xpath="//input[@placeholder='Code']")
WebElement regcode;
 

@FindBy(xpath="//div[@class='css-901oao r-jwli3a r-1yaosjt r-q4m81j']")
WebElement verifybtn;
 

@FindBy(xpath="//i[@title='Edit Customer']")
WebElement editCustomer;
 

@FindBy(xpath="//input[@formcontrolname='firstName']")
WebElement Fname;
 
@FindBy(xpath="//div[@class='mat-form-field-infix']")
WebElement fname;
 

@FindBy(xpath="//td[@role='gridcell']")
WebElement custmname;
 

@FindBy(xpath="//td[@role='gridcell']/span")
WebElement statusData;
 
@FindAll(@FindBy(xpath="//td[@role='gridcell']"))
List<WebElement> patientData;
 
@FindBy(xpath="//td[@role='gridcell']/p")
WebElement plan;
 
@FindBy(xpath="//span[normalize-space()='Care Team']")
WebElement careTeam;
 
@FindBy(xpath="//span[normalize-space()='Care Team List']")
WebElement careTeamList;
 
@FindBy(xpath="//button[@type='submit']")
WebElement AddMember;
 
@FindBy(xpath="//input[@formcontrolname='category']")
WebElement Ccategory;
 
@FindBy(xpath="//input[@formcontrolname='description']")
WebElement Cdesc;
 
@FindBy(xpath="//input[@formcontrolname='qualification']")
WebElement Cqualification;
 
@FindBy(xpath="//input[@formcontrolname='registrationNumber']")
WebElement Cregno;
 
@FindBy(xpath="//input[@formcontrolname='rating']")
WebElement Crating;
 
@FindBy(xpath="//span[normalize-space()='Doctor']")
WebElement Cprofession;
 
@FindBy(xpath="//input[@formcontrolname='profession']")
WebElement CareTeamProfession;
 
@FindBy(xpath="//span[normalize-space()='Submit']")
WebElement Csubmitbtn;
 
@FindBy(xpath="//input[@formcontrolname='firstName']")
WebElement cfname;
 
@FindBy(xpath="//input[@formcontrolname='middleName']")
WebElement CMname;
 
@FindBy(xpath="//input[@formcontrolname='lastName']")
WebElement Clastname;
 
@FindBy(xpath="//input[@formcontrolname='phoneNumber']")
WebElement phoneNumber;
 
@FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='United States']")
WebElement Cuscountry;
 
@FindBy(xpath="//input[@formcontrolname='email']")
WebElement Cemail;
 
@FindAll(@FindBy(xpath="//div[@class='mat-select-arrow']"))
List<WebElement> Cdropdown;
 
@FindBy(xpath="//span[normalize-space()='Doctor']")
WebElement Cdr;
 
@FindBy(xpath="//span[normalize-space()='Female']")
WebElement CFemale;
 
@FindBy(xpath="//input[@formcontrolname='profession']")
WebElement profession;
 
@FindBy(xpath="//input[@placeholder='Search by first/last/phone/email']")
WebElement searchPatient;
 
@FindBy(xpath="//i[@title='Delete Patient']")
WebElement deletept;
 
@FindBy(xpath="//input[@formcontrolname='phoneNumber']")
WebElement Cphnno;
 
@FindBy(xpath="//input[@formcontrolname='password']")
WebElement Cpassword;
 
@FindBy(xpath="//button[normalize-space()='Yes, delete it!']")
WebElement yesDeletebtn;
 
@FindBy(xpath="//i[@title='Edit Customer']")WebElement edit;
@FindBy(xpath="//input[@id='fileinput']")WebElement img;
 
@FindBy(xpath="//i[@title='Unlock Contents']")
WebElement unlockcontenticon;
 
@FindBy(xpath="//span[normalize-space()='Unlock All Content']")
WebElement unlockAllcontent;
 
@FindBy(xpath="//button[@class='chnage-btn']")
WebElement changebtn;
 
@FindBy(xpath="//div[@class='alert alert-danger ng-star-inserted']")
List<WebElement> GetErrorMsg;

@FindBy(xpath="//div[@class='alert alert-danger ng-star-inserted']")
WebElement GetErrorMsgs;

@FindBy(xpath="//span[contains(text(),'Clinics List')]")
WebElement ClinicList;

@FindBy(xpath="//button[contains(text(),' Add Clinic ')]")
WebElement AddClinic;

@FindBy(xpath="//input[@formcontrolname='address']")
WebElement Address;

@FindBy(xpath="//input[@formcontrolname='firstName']")
WebElement custName1;

@FindBy(xpath="//div[@class='dropdown']")
WebElement DropDownLogout;

@FindBy(xpath="//a[@class='dropdown-item']")
WebElement Logout;


@FindBy(xpath="//td[@role='gridcell']")
List<WebElement> GetInforCutomerPrsents;
 

public String generateRandomString() {
String alphabet = "abcdefghijklmnopqrstuvwxyz";
StringBuilder sb = new StringBuilder();
 
// create an object of Random class
Random random = new Random();
 
// specify length of random string
int length = 5;
 
for (int i = 0; i < length; i++) {
 
// generate random index number
int index = random.nextInt(alphabet.length());
 
// get character specified by index
// from the string
char randomChar = alphabet.charAt(index);
 
// append the character to string builder
sb.append(randomChar);
}
 
String randomString = sb.toString();
return randomString;
 
}
 
public String CareTeamrandomEmail() {
Random randomGenerator = new Random();
int randomInt = randomGenerator.nextInt(1000);
String careteamemail = ("test" + randomInt + "@yopmail.com");
System.out.println("Newemail is" + careteamemail);
 
return careteamemail;
}
 
String careteamemail;
 

public String randomEmail() {
Random randomGenerator = new Random();
int randomInt = randomGenerator.nextInt(10000);
String newemail = ("test" + randomInt + "@yopmail.com");
System.out.println("Newemail is" + newemail);
 
return newemail;
}
 
//String remail, customerName;
String customerName;
 

public String randomPtEmail()
{
Random randomGenerator = new Random();
int randomInt = randomGenerator.nextInt(10000);
String ptemail = ("test" + randomInt + "@yopmail.com");
System.out.println("ptemail is" + ptemail);
 
return ptemail;
}
String ptemail;
public long randomPhn()
{
Random rand = new Random();
 
long drand = (long)(rand.nextDouble()*10000000000L);
// long random=(long) (Math.random()*100000 + 3333300000L);
System.out.println(drand);
int length = String.valueOf(drand).length();
System.out.println("phn no:" +length);
 

if (drand<10)
{
randomPhn();
}
 

return drand;
 

}
//long newphnno;
long drand,no;
long random;
 








/*Register Customer */
			  public String registerCustomer(String Customername,String hospitalEmail) throws InterruptedException {
					CustomerClick.click();
					registercustbtn.click();
					
			customerName = generateRandomString();
			System.out.println(customerName);
			submitBtn.click();
			
			String errorMessgae=GetErrorMsg.get(0).getText();
			System.out.println("Error Msg="+errorMessgae);
			String actual="Customer name is required.";
			assertEquals(actual, errorMessgae);
			
			String errorMessgae1=GetErrorMsg.get(1).getText();
			System.out.println("Error Msg="+errorMessgae1);
			String actual1="Phone number is required.";
			assertEquals(actual1, errorMessgae1);
			
			String errorMessgae2=GetErrorMsg.get(2).getText();
			System.out.println("Error Msg="+errorMessgae2);
			String actual2="Email is required.";
			assertEquals(actual2, errorMessgae2);
			 
			String errorMessgae3=GetErrorMsg.get(3).getText();
			System.out.println("Error Msg="+errorMessgae3);
			String actual3="Password is required.";
			assertEquals(actual3, errorMessgae3);
			 
			custName.sendKeys(customerName);
			regCode.sendKeys("123456");
			dropdown.get(0).click();
			selectcoupon.click();
			dropdown.get(1).click();
			selectCountry.click();
			phoneNo.sendKeys("ABCFd");
			
			String errorMessgae4=GetErrorMsg.get(0).getText();
			System.out.println("Error Msg="+errorMessgae4);
			String actual4="Please enter the valid phone number.";
			assertEquals(actual4, errorMessgae4);
			
			phoneNo.clear();
			phoneNo.sendKeys("9876543210");
			
			remail = randomEmail();
			email.sendKeys("sgdjs@sjh");
			
			String errorMessgae5=GetErrorMsg.get(0).getText();
			System.out.println("Error Msg="+errorMessgae5);
			String actual5="Please enter the valid email";
			assertEquals(actual5, errorMessgae5);
			
			email.clear();
			email.sendKeys(hospitalEmail);
			password.sendKeys("Test");
			
			String errorMessgae6=GetErrorMsg.get(0).getText();
			System.out.println("Error Msg="+errorMessgae6);
			String actual6="Password must be atleast 1 special character and 1 digit and 1 Capital letter.Password must be at least 8 characters long.";
			String Expecteds= errorMessgae6.replaceAll("[\\n\\t\\r ]", "");
			String Actuals=actual6.replaceAll("[\\n\\t\\r ]", "");
			
			assertEquals(Actuals, Expecteds);
			
			password.clear();
			password.sendKeys("Test@1230");
			//confPassword.sendKeys("Tesdt");
			
			/*
			 * String errorMessgae7=GetErrorMsgs.getText();
			 * System.out.println("Error Msg="+errorMessgae7); String
			 * actual7="Password doesn't match"; assertEquals(actual7, errorMessgae5);
			 */
			
			confPassword.sendKeys("Test@1230");
			try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
			submitBtn.click();
			} catch (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); }
			 
			}
			// submitBtn.click();
			Thread.sleep(5000);
			// String mail= prop.getProperty("Dtcemail");
			SearhcForcustomerField.sendKeys(hospitalEmail);
			SearhcForcustomerField.clear();
			SearhcForcustomerField.sendKeys(hospitalEmail);
			// System.out.println("RegisterCutomer" + GetInforCutomerPrsent);
			System.out.println("CUSTOMER REGISTERED");
			System.out.println("Customer mail id is :"+hospitalEmail);
			return hospitalEmail;
			
			}
			 
			/*Validate Customer Registered or not*/
			public void checkcustomerRegistered() throws InterruptedException {
			Thread.sleep(9000);
			detailschk.click();
			Thread.sleep(2000);
			String initialCouponNo = unusedCouponCode.getText();
			System.out.println("initialCouponNo" + initialCouponNo);
			Thread.sleep(2000);
			int x = Integer.parseInt(initialCouponNo);
			 
			Thread.sleep(2000);
			dropdown.get(1).click();
			Thread.sleep(5000);
			 
			selectcoupon.click();
			addBtn.click();
			 
			Thread.sleep(2000);
			String finalCouponNo = unusedCouponCode.getText();
			System.out.println("finalCouponNo" + finalCouponNo);
			int y = Integer.parseInt(finalCouponNo);
			if (y > x) {
			System.out.println("Coupon added successfully");
			}
			 
			try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", qrcode);
			} catch (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); }
			 
			}
			// System.out.println("ClinicDomain :"+clinicDomain.getText());
			newHospitalURL = clinicDomain.getText();
			System.out.println(newHospitalURL);
			if (qrcode.isDisplayed());
			{
			System.out.println("QR CODE PRESENT");
			}
			try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", action);
			} catch (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); }
			 
			}
			 
			usecodebtn.click();
			CouponCode=couponcode.getText();
			System.out.println("Code Added" + couponcode.getText());
			 
			
	//		System.out.println("CHECKED REGISTERED CUSTOMER");
	
			
			}
			 
			/*Edit Customer Negative Scenario*/
			 
			public void checkEditCustomer(String newhospitalEmail,String Customername) throws InterruptedException
			 
			
			{
			// SearhcForcustomerField.sendKeys(remail);
			Thread.sleep(2000);
			SearhcForcustomerField.clear();
			Thread.sleep(5000);
			SearhcForcustomerField.sendKeys(newhospitalEmail);
			Thread.sleep(4000);
			 
			
			System.out.println(custmname.getText());
			String customerName= custmname.getText();
			editCustomer.click();
			Thread.sleep(5000);
			for (int i = 0; i < 5; i++) 
			{
			Fname.sendKeys(Keys.BACK_SPACE);
			 
			}
			Thread.sleep(4000);
			String errorMessgae=GetErrorMsgs.getText();
			System.out.println("Error Msg="+errorMessgae);
			 
			
			submitBtn.click();
			 
			
			Thread.sleep(4000);
			Fname.sendKeys(customerName);
			Thread.sleep(8000);
			//img.sendKeys("C:\\\\Users\\\\05122103\\\\Documents\\\\Logo.jpg");
			 
			//Thread.sleep(5000);
			submitBtn.click();
			 
			
			System.out.println("CHECK CUSTOMER ");
			 
			
			}
			 
			
			/*login to Hopsital Portal*/
			public void hospitallogin(String newhospitalEmail) throws InterruptedException
			{
			 
			Thread.sleep(4000);
			driver.get("https://mamalift-qa.curio-dtx.com/login");
			Thread.sleep(2000);
			Thread.sleep(1000);
			 
			
			emailaddress.sendKeys(newhospitalEmail);
			password.sendKeys("Test@1230");
			Thread.sleep(4000);
			loginbtn.click();
			 
			
			System.out.println("CHECK NEW HOSPITAL LOGIN");
			 
			}
			 
			
			 
			
			 
			
			/*Validate Registered Hospital/Customer able to Login*/
			public void checkNewHospitalLogin(String newhospitalEmail) throws InterruptedException {
			 
			
			Thread.sleep(4000);
			 
			driver.navigate().to("https://yopmail.com/en/");
			Thread.sleep(3000);
			inputEmail.sendKeys(newhospitalEmail);
			inputEmail.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			// chkInbox.click();
			// Thread.sleep(4000);
			 
			driver.switchTo().frame("ifmail");
			Thread.sleep(2000);
			clickhereforhospitalLink.click();
			 
			
			 
			
			Thread.sleep(2000);
			 
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTb.get(1));
			Thread.sleep(1000);
			
			String expectedText="https://mamalift-qa.curio-dtx.com/login";
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, expectedText, "URL Different");
			System.out.println(URL);
			/*
			 * System.out.println("CodeURL:" +driver.getCurrentUrl());
			 * 
			 * 
			 * String URL= driver.getCurrentUrl(); if(URL.contains(CouponCode)) {
			 * System.out.println("URL contains Coupon code"); } // String registeredemail
			 * =registerCustomer();
			 */			emailaddress.sendKeys(newhospitalEmail);
			 
			password.sendKeys("Test@1230");
			Thread.sleep(4000);
			loginbtn.click();
			System.out.println("CHECK NEW HOSPITAL LOGIN");
			}
			 
			
			/*Add Clinic*/
			
			public void addclinic(String clinicname,String CustEmail) throws InterruptedException
			{
				ClinicList.click();;
				AddClinic.click();
				
				 custName.sendKeys(clinicname);
				  regCode.sendKeys("12345"); 
				  dropdown.get(0).click();
				  selectcoupon.click();
				  dropdown.get(1).click();
				  selectCountry.click();
				  
				  
				  phoneNo.sendKeys("9876543211");
				  Address.sendKeys("Navi mumbai");
				  email.clear();
				  email.sendKeys(CustEmail);
				  password.clear();
				  password.sendKeys("Test@1230");
				  confPassword.sendKeys("Test@1230");
				  submitBtn.click();
				  Thread.sleep(1000);
				 
				  System.out.println("Clinic Registered and mailid is :" +CustEmail);
				  SearhcForcustomerField.sendKeys(clinicname);
				  System.out.println("RegisterCutomer"+GetInforCutomerPrsents.get(0).getText());
				 
				/*
				 * AddCupons.click(); DropdownArrow.click(); Selecycupons.click();
				 * AddButton.click(); Thread.sleep(1000);
				 * System.out.println("Unused Cupons="+UnusedCuponsNum.getText());
				 * closeButton.click();
				 */
				  
				  DropDownLogout.click();
				  Logout.click();
				  
			}
			
			
			
			
			
			
			
			
			/*Add Patient on New Hospital*/
			public void addpatient(String PatientName,String PatientMail,String pMobileNo) throws InterruptedException {
			Thread.sleep(1000);
			patientlist.click();
			addpatient.click();
			firstname.sendKeys(PatientName);
			middlename.sendKeys("Middle");
			lastname.sendKeys("LAst");
			email.sendKeys(PatientMail);
			
			MamaLiftDropDown.click();
			//DTcDropDown.click();
			axiadropDown.click();
			 country.click();
			 selectcountry.click();
			// phoneno.sendKeys("9876543211");
			phnnoaddpt.sendKeys(String.valueOf(pMobileNo));
			Thread.sleep(6000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", prefgender);
			sheher.click();
			savebtn.click();
			 
			System.out.println("Patient added and mail id is :" +PatientMail);
			
			System.out.println("ADD PATIENT");
			}
			 
			/*Validate Patient Data added same under PatientList Tab*/
			public void validatePtData()
			{
			String ptname = patientData.get(1).getText();
			 
			
			if(ptname.contains(customerName));
			{
			System.out.println("Name is Same");
			}
			 
			String Gender = patientData.get(3).getText();
			if (Gender=="Female")
			{
			System.out.println("Female");
			}
			else {
			System.out.println("Gender not same" +Gender);
			}
			 
			
			if(plan.getText().contains("Premium"))
			 
			
			{
			System.out.println("Premium plan");
			}
			else {
			System.out.println("PLan different"+plan);
			}
			 
			System.out.println("VALIDATA PATIENT DATA");
			}
			/*Check colour status when Patient performs Action on ReactNative site*/
			public void checkColourStatus() throws InterruptedException
			{
			try {
			patientlist.click();
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			searchPatient.sendKeys(ptemail);
			Thread.sleep(2000);
			searchPatient.clear();//div[@class='mat-select-arrow-wrapper'
			Thread.sleep(5000);
			searchPatient.sendKeys(ptemail);
			Thread.sleep(4000);
			String actualtooltip = statusData.getAttribute("title");
			System.out.println("Actual title:"+actualtooltip);
			 
			
			System.out.println("CHECK COLOUR");
			}
			 
			
			public void unlockContent() throws InterruptedException
			{
			unlockcontenticon.click();
			Thread.sleep(1000);
			Cdropdown.get(1).click();
			Thread.sleep(1000);
			unlockAllcontent.click();
			Thread.sleep(2000);
			changebtn.click();
			driver.navigate().refresh();
			 
			
			}
			 
			
			/*Add CareTeamMember to newly Registered Customer/Hospital*/
			public void addCareTeamMember() throws InterruptedException
			{
			Thread.sleep(4000);
			careTeam.click();
			careTeamList.click();
			AddMember.click();
			 
			
			cfname.sendKeys("Fname");
			CMname.sendKeys("Mname");
			Clastname.sendKeys("Lastname");
			 
			
			Cdropdown.get(0).click();
			CFemale.click();
			Thread.sleep(1000);
			 
			
			CareTeamProfession.sendKeys("Dr");
			 
			
			drand= randomPhn();
			//no=randomPhn();
			 
			
			Cphnno.sendKeys(String.valueOf(drand));
			 
			
			Cdropdown.get(1).click();
			Cuscountry.click();
			careteamemail = CareTeamrandomEmail();
			Cemail.sendKeys(careteamemail);
			Cpassword.sendKeys("Test@1230");
			 
			
			AddMember.click();
			 
			
			Thread.sleep(1000);
			 
			
			Ccategory.sendKeys("TestCategory");
			Cdesc.sendKeys("Tdesc");
			Cqualification.sendKeys("Bachelor");
			Cregno.sendKeys("987654");
			Crating.sendKeys("05");
			 
			
			Cdropdown.get(2).click();
			Cdr.click();
			Csubmitbtn.click();
			 
			
			System.out.println("ADDED CARETEAM MEMBER");
			}
			 
			
			public void assignCareTeaker() throws InterruptedException
			{
			Thread.sleep(2000);
			patientlist.click();
			Thread.sleep(3000);
			caretakerlist.click();
			Thread.sleep(3000);
			searchcaretaker.sendKeys("Fname");
			Thread.sleep(3000);
			selectcaretaker.click();
			Thread.sleep(3000);
			save.click();
			Thread.sleep(3000);
			 
			
			System.out.println("ASSIGN CARETAKER");
			}
			 
			
			/*Validate CareTeamMeber Able to Login and see AssignPatient*/
			 
			
			public void validateCareTeamMember() throws InterruptedException
			{
			driver.navigate().to("https://mamalift-qa.curio-dtx.com/login");
			Thread.sleep(4000);
			emailaddress.sendKeys(careteamemail);
			password.sendKeys("Test@1230");
			loginbtn.click();
			 
			
			patientlist.click();
			 
			
			searchPatient.sendKeys(ptemail);
			Thread.sleep(2000);
			searchPatient.clear();
			Thread.sleep(5000);
			searchPatient.sendKeys(ptemail);
			Thread.sleep(4000);
			 
			
			String ptname = patientData.get(1).getText();
			SoftAssert s= new SoftAssert();
			 
			
			if(ptname.contains(customerName));
			 
			
			{
			s.assertEquals(ptname, customerName, "ptname and cuname is not same");
			 
			
			System.out.println("pt available for caretaker");
			}
			System.out.println("VALIDATE CARETEAM MEMBER");
			 
			}
			 
			
			/*Deleted the added Patient to check Colour status*/
			public void deletePatient() throws InterruptedException
			{
			deletept.click();
			Thread.sleep(1000);
			yesDeletebtn.click();
			}
			/*Check Registered Patient Email for URL Receieved*/
			public void checkPatientEmail(String PatientMail) throws InterruptedException 
			{
			driver.navigate().to("https://yopmail.com/en/");
			Thread.sleep(3000);
			inputEmail.clear();
			inputEmail.sendKeys(PatientMail);
			Thread.sleep(3000);
			chkInbox.click();
			Thread.sleep(4000);
			 
			driver.switchTo().frame("ifmail");
			Thread.sleep(2000);
		//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", clickHereLink);
			clickHereLink.click();
			
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTb.get(2));
			
			Thread.sleep(1000);
			 
			String expectedText="https://mamalift-qa.curio-dtx.com";
			String URL= driver.getCurrentUrl();
			System.out.println(URL);
		//	Assert.assertEquals(URL.contains(), expectedText, "Message not same");
			//Assert.assertEquals(URL.contains(expectedText), expectedText);
			
			Assert.assertTrue(URL.contains(expectedText), "DIdnt match");
			
		//	Assert.assertTrue(false, URL)
		
			System.out.println("CHECK PATIENT EMAIL");
			 
			}
			 
			/*Signup Patient From reactnative website*/
			public void patientSignup(String PatientMail,String PatientName,String pMobileNo) throws InterruptedException
			 
			{
			 
				/*
				 * firstname.sendKeys(PatientName); lastname.sendKeys("LAst");
				 * email.sendKeys(PatientMail); phoneno.sendKeys(String.valueOf(pMobileNo));
				 */
			 
				
				/*
				 * ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
				 * driver.switchTo().window(newTb.get(3));
				 */
				
			password.sendKeys("Test@1230");
			confPassword.sendKeys("Test@1230");
			 
			Select s = new Select(age);
			s.selectByValue("24");
			 
			Select sc = new Select(countryName);
			sc.selectByValue("India");
			 
			Thread.sleep(1500);
			checkmark.get(0).click();
			checkmark.get(1).click();
			checkmark.get(2).click();
			button.click();
			Thread.sleep(4000);
			System.out.println("PATIENT SIGNUP");
			 
			
			}
			 
			
			/*Login to Reactnative Website for Registered Patient using URL Receieved via registered Email*/
			public void loginreactnative(String PatientMail) throws InterruptedException 
			{
			driver.navigate().to("https://yopmail.com/en/");
			Thread.sleep(5000);
			inputEmail.clear();
			Thread.sleep(4000);
			inputEmail.sendKeys(PatientMail);
			Thread.sleep(1500);
			chkInbox.click();
			Thread.sleep(4000);
		//	driver.switchTo().frame("ifinbox");
			//Thread.sleep(8000);
			/*
			 * clickHereLink.click(); // curioRegEmail.click(); Thread.sleep(4000);
			 * driver.switchTo().defaultContent(); Thread.sleep(2000);
			 */
			driver.switchTo().frame("ifmail");
			Thread.sleep(2000);
			 		
			String code2= registerationcode.getText();
			System.out.println(code2.length());
			System.out.println(code2.substring(504, 510));
			String regemailcode=code2.substring(504, 510);
			clickHereLink.click();
		
			
			  ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			  driver.switchTo().window(newTb.get(3));
			  
			  Thread.sleep(2000);
			  String expectedText="https://mamalift-qa-web.curio-dtx.com";
				String URL= driver.getCurrentUrl();
				System.out.println(URL);
			//	Assert.assertEquals(URL.contains(), expectedText, "Message not same");
			//	Assert.assertEquals(URL.contains(expectedText), expectedText);
				//Assert.assertEquals(URL, expectedText)
				//Assert.assertTrue(URL.contains(expectedText), "DIdnt Matched");
				
				
			//  driver.switchTo().window(newTb.get(1));
			  reactnativemail.sendKeys(PatientMail);
			  reactnativepassword.sendKeys("Test@1230"); 
			  reactnativeloginbtn.click();
			  Thread.sleep(2000); 
			  regcode.sendKeys(regemailcode); 
			  verifybtn.click();
			  
			  
			  Thread.sleep(2000);
			  
			 
			System.out.println("LOGIN REACTNATIVE");
			 
			
			}
			 
}