package PageObjects;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utils.ImageLoading;

public class Week4 {

	WebDriver driver;
	Properties prop;

	public Week4(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='4']")
	WebElement week4;

	@FindBy(xpath = "//button[@class='navbutton' and text()='2']")
	WebElement secondcard;

	@FindBy(xpath = "//button[@class='navbutton' and text()='3']")
	WebElement thirdcard;
	@FindBy(xpath = "//button[@class='navbutton' and text()='4']")
	WebElement fourthcard;
	@FindBy(xpath = "//button[@class='navbutton' and text()='5']")
	WebElement fifthcard;
	@FindBy(xpath = "//button[@class='navbutton' and text()='6']")
	WebElement sixthcard;
	@FindBy(xpath = "//button[@class='navbutton' and text()='7']")
	WebElement seventhcard;

	@FindBy(xpath = "//button[@class='navbutton' and text()='8']")
	WebElement eightcard;
	@FindBy(xpath = "//button[@class='navbutton' and text()='9']")
	WebElement ninthcard;
	@FindBy(xpath = "//button[@class='navbutton' and text()='10']")
	WebElement tenthcard;
	
	@FindAll(@FindBy(xpath="//p[contains(text(),'')]/p"))
	List<WebElement> para;

	@FindBy(xpath="//div[@dir='auto' and text()='2']")
	WebElement day2;
	
	@FindBy(xpath="//div[@dir='auto' and text()='3']")
	WebElement day3;
	
	@FindBy(xpath="//div[@dir='auto' and text()='4']")
	WebElement day4;
	@FindAll(@FindBy(xpath="//div[@dir='auto' and text()='5']"))
	List<WebElement>day5;
	

	@FindBy(xpath = "//p[@class='tabDayData' and text()='Day 6']")
	WebElement day6;

	@FindBy(xpath = "//p[@class='tabDayData' and text()='Day 7']")
	WebElement day7;
	@FindBy(xpath = "//img[@class='nav-hover']")
	WebElement images;

	@FindAll(@FindBy(xpath = "//div[@class='tracker-arrow']"))
	List<WebElement> arrow;
	@FindBy(xpath = "//div[@class='c-dropdown']//select")
	WebElement selectModule;

	@FindBy(xpath = "//div[@class='f-nav-link']")
	WebElement navLink;

	@FindAll(@FindBy(xpath = "//div[@class='btn-nav-wrapper']/button"))
	List<WebElement> cardSize;

	@FindBy(xpath = "//div[@class='css-901oao r-1yaosjt r-q4m81j']")
	WebElement proceedbtn;

	@FindAll(@FindBy(xpath = "//textarea"))
	List<WebElement> txtare;

	@FindAll(@FindBy(xpath = "//div[@class='col-md-3 sm-3 col-3']/div"))
	List<WebElement> checkmark;

	@FindAll(@FindBy(xpath="//img[@src='/static/media/right.e55710ce.svg']"))
	List<WebElement> rightcheckmark;
	@FindBy(xpath = "//button[@class='btn-orange']")
	WebElement saveBtn;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	WebElement okBtn;

	@FindAll(@FindBy(xpath = "//div[@class='f-nav-link']"))
	List<WebElement> forwardLink;

	@FindBy(xpath = "//img[@class='css-9pa8cd']")
	WebElement backtoPastModules;

	@FindAll(@FindBy(xpath = "//textarea"))
	List<WebElement> textarea;

	@FindAll(@FindBy(xpath="//input[@type='text']"))
	List<WebElement> text;
	
	@FindBy(xpath="//div[@class='g-like']")
	WebElement likebtn;
	
	Select Module;

	public void goToMOdules() throws InterruptedException {
		this.driver = driver;
		Thread.sleep(9000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		arrow.get(4).click();

		Thread.sleep(4000);

		selectModule.click();
		Select Module = new Select(driver.findElement(By.xpath("//div[@class='c-dropdown']//select")));
		Module.selectByValue("Module 4");

		// selectModule.selectBy
	}

	public void checkweek4Day1() throws InterruptedException {

		proceedbtn.click();
		Thread.sleep(5000);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", navLink);
		Thread.sleep(4000);
		navLink.click();

		int size = cardSize.size();
		for (int i = 2; i < size; i++) {
			System.out.println(i);

			if (i == 6) {
				rightcheckmark.get(0).click();
				txtare.get(0).sendKeys("Test Thoughts");
				rightcheckmark.get(1).click();
				rightcheckmark.get(2).click();
				Thread.sleep(6000);
				saveBtn.click();
				Thread.sleep(3000);
				okBtn.click();
			}

			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(1000);
			forwardLink.get(1).click();

		}
		Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(2000);
		backtoPastModules.click();
		System.out.println("Week 4 Day 1 COMPLETED");
	}

	public void chkwk4day2() throws InterruptedException

	{
		Thread.sleep(5000);
		day2.click();

		proceedbtn.click();
		int size = cardSize.size();
		for (int i = 2; i < size ; i++) {
			System.out.println(i);

			if (i == 2) {
				//fourthcard.click();
				// continue;
			}
			if (i == 4) {

				fourthcard.click();
				  for (int j = 0; j < textarea.size(); j++) {
				  textarea.get(j).sendKeys("Testdata" +i); } saveBtn.click();
				  Thread.sleep(2000); okBtn.click();
				 
			
			}
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(1000);
			forwardLink.get(1).click();
		}

		Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(2000);
		backtoPastModules.click();
		System.out.println("Week 4 Day 2 COMPLETED");
	}

	public void chkwk4day3() throws InterruptedException
	{
		Thread.sleep(5000);
		day3.click();

		proceedbtn.click();
		
		int size = cardSize.size();
		for (int i = 0; i < size ; i++) 
		{
			System.out.println(i);
			
			if(i==3)
			{
				text.get(0).sendKeys("Test1");
				text.get(1).sendKeys("Test2");
				text.get(2).sendKeys("Test3");
				
				Thread.sleep(3000);
				saveBtn.click();
				Thread.sleep(2000);
				okBtn.click();
			}
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			forwardLink.get(1).click();
			
	}
		Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(2000);
		backtoPastModules.click();
		System.out.println("Week 4 Day 3 COMPLETED");
	}

	public void chkwk4day4() throws InterruptedException
	{
		Thread.sleep(5000);
		day4.click();

		proceedbtn.click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		forwardLink.get(1).click();
		int size = cardSize.size();
		for (int i = 0; i < size; i++) 
		{
			System.out.println(i);
			
			if(i==1)
			{
				Thread.sleep(6000);
				checkmark.get(2).click();
				checkmark.get(5).click();
				checkmark.get(8).click();
				checkmark.get(11).click();
				checkmark.get(14).click();
				Thread.sleep(4000);
				saveBtn.click();
				Thread.sleep(2000);
				okBtn.click();
				
			}
			
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			forwardLink.get(1).click();
		
	}
		
		Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(2000);
		backtoPastModules.click();
			
		System.out.println("Week 4 Day 4 COMPLETED");
	}
	
	public void chkweek4day5() throws InterruptedException
	{
		Thread.sleep(5000);
		day5.get(1).click();

		proceedbtn.click();
		
		Thread.sleep(7000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		forwardLink.get(1).click();
		int size = cardSize.size();
		
		for (int i = 0; i < size; i++) 
		{
			System.out.println(i);
			
			if(i==4)
			{
				try {
					Thread.sleep(4000);
					para.get(2).click();
					para.get(3).click();
					
					Thread.sleep(3000);
	saveBtn.click();
	Thread.sleep(3000);
	okBtn.click();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	}
			
			
				if(i==5)
				{
					likebtn.click();
				}
			
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			forwardLink.get(1).click();
	}
		Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(2000);
		backtoPastModules.click();
		System.out.println("Week 4 Day 5 COMPLETED");
	}

}