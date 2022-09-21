package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Careportal_Reports {
	
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public Careportal_Reports(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//p[normalize-space()='Reports']")
	WebElement reports;
	



@FindBy(xpath="//div[@dir='auto' and text()='Weekly Mood Report']")
	WebElement moodReportstraverse;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-16y2uox r-1w6e6rj r-1udh08x r-13qz1uu']")
	WebElement r;
	
	@FindAll(@FindBy(xpath="//div[@class='css-901oao css-cens5h r-tpevwd r-xr0dpn r-1enofrn r-aruset r-atwnbb r-ttb5dx']"))
	List<WebElement> actreport;
	
	@FindAll(@FindBy(xpath="//div[@class='css-1dbjc4n r-18u37iz']"))
	List<WebElement> act;
	
@FindBy(xpath="//span[@class='menu-sidebar' and text()='Patient List']")
WebElement patientlist;

@FindBy(xpath="//div[@class='mat-form-field-infix']/input[@placeholder='Search by first/last/phone/email']")
WebElement search;

@FindBy(xpath="//i[@title='Activity Record']")
WebElement actrecordpt;

@FindAll(@FindBy(xpath="//td[@class='mat-cell cdk-column-Title mat-column-Title ng-star-inserted']"))
List<WebElement> allActivityHospitalPortal;
String str[]=null;
String activity;

public List<String> getreport() throws InterruptedException
	{
		Thread.sleep(8000); 
		reports.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", r);
		Thread.sleep(4000); 
		List<String> myList = new ArrayList<String>();
		
		
			for (int i =0;i<act.size();i++)
			{
				try {
					activity=actreport.get(i).getText();
					myList.add(activity);
				} catch (Exception e) {
					// TODO Auto-generated catch block
				//	e.printStackTrace();
				}	
			}
			System.out.println("Report activity is:"+activity);
		
		
		return myList;
	}
	
public void checkactvityreportoncareportal() throws InterruptedException
{
	Thread.sleep(6000);
	patientlist.click();
	Thread.sleep(8000);
	search.sendKeys("atest@yopmail.com");
	Thread.sleep(9000);
	actrecordpt.click();
	
	for(int j=0;j<allActivityHospitalPortal.size();j++)
	{
		String Hospitalportal = allActivityHospitalPortal.get(j).getText();
		System.out.println(Hospitalportal);		
	}
}
	

}