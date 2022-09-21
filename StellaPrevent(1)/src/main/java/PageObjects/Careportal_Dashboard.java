package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Careportal_Dashboard {
	
	 WebDriver driver;

	public Careportal_Dashboard(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//i[@title='Activity']")	
WebElement activity;

@FindBy(xpath="//div[contains(text(),'Activity Report By No Of Activites')]")
WebElement noOfActivityGraph;

@FindBy(xpath="//i[@title='App Usage Info']")
WebElement appUsageInfo;

@FindBy(xpath="//i[@title='Mood']")
WebElement mood;

@FindBy(xpath="//i[@title='User Information']")
WebElement userInfo;

@FindBy(xpath="//i[@title='Sleep']")
WebElement sleep;

@FindBy(xpath="//i[@title='Data']")
WebElement data;

@FindBy(xpath="//i[@title='Assessment']")
WebElement Assessment;

@FindBy(xpath="//span[normalize-space()='Close']")
WebElement closeBtn;

@FindBy(xpath="//div[contains(text(),'Piechart')]")
WebElement piechart;

@FindBy(xpath="//div[contains(text(),'Mood Report By Average')]")
WebElement moodReportAverage;

@FindAll(@FindBy(xpath="//div[@class='row ml-0 mr-0']"))
List<WebElement> device_Timezoninfo;

//@FindAll(@FindBy(xpath="//div[@class='col-md-2 ng-star-inserted']"))

@FindAll(@FindBy(xpath="//p[@class='activity-name']"))
List<WebElement> allActivityName;

@FindBy(xpath="//input[@id='mat-input-0']")
WebElement search;

String str[]=null;

String text;

public List<String> checkActivity(String Email) throws InterruptedException
{
	Thread.sleep(8000);
	search.sendKeys(Email);
	Thread.sleep(12000);
	activity.click();
	int x = allActivityName.size();
	String str[] = new String[x];
	
	List<String> dashboardList = new ArrayList<String>();
	
	for (int j=0;j<allActivityName.size();j++)
	{
		 text=allActivityName.get(j).getText();
		dashboardList.add(text);		
	}
	
	System.out.println("Dashboard Activity data is:"+text);
	
	Thread.sleep(1000);
	noOfActivityGraph.click();
	Thread.sleep(1000);
	closeBtn.click();
	return dashboardList;
}

public void checkAppUsageInfo() throws InterruptedException
{
	Thread.sleep(4000);
	appUsageInfo.click();
	Thread.sleep(1000);
	piechart.click();
	Thread.sleep(1000);
	closeBtn.click();
}

public void checkMood() throws InterruptedException
{
	Thread.sleep(4000);
	mood.click();
	Thread.sleep(1000);
	moodReportAverage.click();
	Thread.sleep(1000);
	closeBtn.click();
}

public void checkUserInfo() throws InterruptedException
{
	Thread.sleep(4000);
userInfo.click();
for (int i =0;i<device_Timezoninfo.size();i++)
{
	String info=device_Timezoninfo.get(i).getText();
	System.out.println(info)
;
}
closeBtn.click();	
}

public void checkSleep() throws InterruptedException
{
	Thread.sleep(4000);
	sleep.click();
	Thread.sleep(1000);
	closeBtn.click();
}

public void checkAssessment() throws InterruptedException
{
	Thread.sleep(4000);
	Assessment.click();
	Thread.sleep(1000);
	closeBtn.click();
}


}