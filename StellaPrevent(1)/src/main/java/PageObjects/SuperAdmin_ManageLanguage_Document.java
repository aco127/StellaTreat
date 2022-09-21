package PageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties
;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class SuperAdmin_ManageLanguage_Document {

	WebDriver driver;
	Properties prop;







	public  SuperAdmin_ManageLanguage_Document(WebDriver driver) {
		
 this.driver = driver; PageFactory.initElements(driver, this);
		 
	}

	
	@FindBy(xpath="//span[contains(text(),'Manage Documents')]")
	WebElement ManageDoc;
	
	@FindBy(xpath="//i[@title='View Document']")
	List<WebElement> ViewDoc;
	
	@FindBy(xpath="//input[@formcontrolname='firstName']")
	WebElement subAdminName;
	
	@FindBy(xpath="//input[@formcontrolname='phoneNumber']")
	WebElement phoneNo;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//div[@class='mat-select-arrow-wrapper']")
	WebElement dropdown;
		
	@FindBy(xpath="//span[@class='mat-option-text' and text()=' United States ']")
	WebElement selectcountry;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()=' Submit ']")
	WebElement submit;
	
	@FindBy(xpath="//span[contains(text(),'Manage Languages')]")WebElement ManageLanguage;
	@FindBy(xpath="//button[contains(text(),' + Add Language ')]")WebElement Addlanguage;
	@FindBy(xpath="	(//div[@class='mat-select-arrow'])[2]")WebElement DropDown;
	

	
	
	


	
	
	
public void ManageDoc() throws InterruptedException
{ ManageDoc.click();
  

  String parentHandle = driver.getWindowHandle();
	SoftAssert assertobj = new SoftAssert();
	
	//fbicon.click();
	ViewDoc.get(0).click();
	Thread.sleep(3000);
	for (String winHandle : driver.getWindowHandles()) {
		driver.switchTo().window(winHandle);
		String PrivacyPolicy = driver.getCurrentUrl();
		assertobj.assertEquals(driver.getCurrentUrl(), PrivacyPolicy, "Privacy Poicy");
	}

	driver.switchTo().window(parentHandle);
	ViewDoc.get(1).click();
	Thread.sleep(3000);
	for (String winHandle : driver.getWindowHandles()) {
		driver.switchTo().window(winHandle);
		String Acknowledgement = driver.getCurrentUrl();
		assertobj.assertEquals(driver.getCurrentUrl(), Acknowledgement, "Acknowledgement");
	}driver.switchTo().window(parentHandle);

	//driver.close();

	
}


	public void ManageLanguage()
	{
		ManageLanguage.click();
		Addlanguage.click();
		DropDown.click();
		List<WebElement> myList=driver.findElements(By.xpath("//span[@class='mat-option-text']"));

		int x = myList.size();
		String str[] = new String[x];
		
	    //myList contains all the web elements
	    //if you want to get all elements text into array list
	    List<String> all_elements_text=new ArrayList<>();

	    for(int i=0; i<myList.size(); i++){

	        //loading text of each element in to array all_elements_text
	        all_elements_text.add(myList.get(i).getText());

	        //to print directly
	        System.out.println(myList.get(i).getText());
	}
}}