package PageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperAdmin_ManageSubject {

	WebDriver driver;
	Properties prop;

	public SuperAdmin_ManageSubject(WebDriver driver) {
		
 this.driver = driver; PageFactory.initElements(driver, this);
		 
	}

	
	@FindBy(xpath="//span[contains(text(),'Manage Subjects')]")
	WebElement ManageSubject;
	
	@FindBy(xpath="//button[contains(text(),' + Add Subject ')]")
	WebElement AddSubject;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement SearchObject;
	
	@FindBy(xpath="//input[@placeholder='Subject Name']")
	WebElement SubjectName;
	
	@FindBy(xpath="//button[contains(text(),' Save')]")
	WebElement SaveButton;
	
	@FindBy(xpath="//button[@class='mat-raised-button close-btn-modal closebtn']")
	WebElement CloseButton;
	
	@FindBy(xpath="//div[@class='mat-select-arrow-wrapper']")
	WebElement dropdown;
		
	@FindBy(xpath="//span[@class='mat-option-text' and text()=' United States ']")
	WebElement selectcountry;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper' and text()=' Submit ']")
	WebElement submit;
	
	@FindBy(xpath="//div[@class='mat-select-arrow']")
	WebElement arrow;
	
	@FindBy(xpath="(//span[contains(text(),'10')])[1]")
	WebElement SelectCount;
	
	@FindBy(xpath="//a[contains(text(),'Contact Us')]")
	WebElement ContactUs;
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div/form/div[2]/select")
	WebElement ContactUsDropDown;

	@FindBy(xpath="//option")
	List<WebElement> DropDownOptionValue;
	
	@FindBy(xpath="//h4[@class='t-heading']")
	WebElement Heading;
	@FindBy(xpath="//i[@title='Delete']")WebElement DeleteIcon;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")WebElement DeleteButton;
	@FindBy(xpath="//i[@title='Edit Subject']")WebElement EditSubject;
	@FindBy(xpath="//button[contains(text(),' Update')]")WebElement UpdateButton;
	
	
String sub="ABCTest";
public void managesubject()
{
	ManageSubject.click();
	AddSubject.click();
	SubjectName.sendKeys(sub);
	CloseButton.click();
	AddSubject.click();
	SearchObject.clear();
	SubjectName.sendKeys(sub);
	SaveButton.click();
	SearchObject.sendKeys(sub);
	SearchObject.sendKeys(Keys.TAB);
	EditSubject.click();
	SubjectName.sendKeys(sub);
	UpdateButton.click();
	SearchObject.clear();
	SearchObject.sendKeys(sub);
	SearchObject.sendKeys(Keys.TAB);
	DeleteIcon.click();
	DeleteButton.click();
}

public List<String> verifyManagesubjectfield()
{
	ManageSubject.click();
	arrow.click();
	SelectCount.click();
	
	List<WebElement> myList=driver.findElements(By.xpath("//td[@class='mat-cell cdk-column-name mat-column-name ng-star-inserted']"));

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
	return all_elements_text;
}


public void checkdatacontactUs()
{
	ContactUs.click();
   
}

public  List<String> CheckcontactUs()
{
	  ContactUs.click();
	    System.out.println(Heading.getText());
	    System.out.println(driver.getCurrentUrl());
	   
	    ContactUsDropDown.click();
	    int x = DropDownOptionValue.size();
		String str[] = new String[x];
		
	    //myList contains all the web elements
	    //if you want to get all elements text into array list
	    List<String> all_elements_text=new ArrayList<>();

	    for(int i=0; i<DropDownOptionValue.size(); i++){

	        //loading text of each element in to array all_elements_text
	        all_elements_text.add(DropDownOptionValue.get(i).getText());

	        //to print directly
	        System.out.println(DropDownOptionValue.get(i).getText());

	    }
		return all_elements_text;

}

}