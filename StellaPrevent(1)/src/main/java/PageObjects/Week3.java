package PageObjects;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utils.ImageLoading;

public class Week3 {

	WebDriver driver;
	Properties prop;

	public Week3(WebDriver driver) {
 this.driver = driver; PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//span[normalize-space()='3']")
			WebElement week3;
	
	@FindBy(xpath="//button[@class='navbutton' and text()='2']")
	WebElement secondcard;
	
	@FindBy(xpath="//button[@class='navbutton' and text()='3']")
	WebElement thirdcard;
	@FindBy(xpath="//button[@class='navbutton' and text()='4']")
	WebElement fourthcard;
	@FindBy(xpath="//button[@class='navbutton' and text()='5']")
	WebElement fifthcard;
	@FindBy(xpath="//button[@class='navbutton' and text()='6']")
	WebElement sixthcard;
	@FindBy(xpath="//button[@class='navbutton' and text()='7']")
	WebElement seventhcard;
	
	@FindBy(xpath="//button[@class='navbutton' and text()='8']")
	WebElement eightcard;
	
	@FindBy(xpath="//div[@dir='auto' and text()='2']")
	WebElement day2;
	
	@FindBy(xpath="//div[@dir='auto' and text()='3']")
	WebElement day3;
	
	@FindBy(xpath="//div[@dir='auto' and text()='4']")
	WebElement day4;
	
	@FindAll(@FindBy(xpath="//div[@dir='auto' and text()='5']"))
	List<WebElement>day5;
	
	@FindBy(xpath="//p[@class='tabDayData' and text()='Day 6']")
	WebElement day6;
	
	@FindBy(xpath="//p[@class='tabDayData' and text()='Day 7']")
	WebElement day7;
@FindBy(xpath="//img[@class='nav-hover']")
WebElement images;

@FindAll(@FindBy(xpath="//div[@draggable='true']"))
List<WebElement> drag;

@FindAll(@FindBy(xpath="//div[@class='tracker-arrow']"))
List<WebElement> arrow;

@FindBy(xpath="//div[@class='c-dropdown']//select")
WebElement selectModule;

@FindAll(@FindBy(xpath="//div[@class='css-1dbjc4n']/select"))
List<WebElement> select;

@FindBy(xpath="//input[@type='text']")
WebElement date;

@FindBy(xpath="//abbr[@aria-label='April 7, 2022']")
WebElement selectdate;

@FindBy(xpath="//div[@class='css-901oao r-1yaosjt r-q4m81j']")
WebElement proceedbtn;

@FindAll(@FindBy(xpath="//div[@class='f-nav-link']"))
List<WebElement> forwardLink;

@FindBy(xpath="//div[@class='f-nav-link']")
WebElement navLink;

@FindAll(@FindBy(xpath="//div[@class='btn-nav-wrapper']/button"))
List<WebElement> cardSize;

@FindAll(@FindBy(xpath="//div[@class='col-md-3 sm-3 col-3']"))
List<WebElement>checkmark;

@FindBy(xpath="//button[@class='btn-orange']")
WebElement saveBtn;

@FindBy(xpath="//button[normalize-space()='OK']")
WebElement okBtn;

@FindBy(xpath="//img[@class='css-9pa8cd']")
WebElement backtoPastModules;
@FindAll(@FindBy(xpath="//textarea"))
List<WebElement> txtare;

@FindAll(@FindBy(xpath="//input[@type='text']"))
List<WebElement> text;


@FindAll(@FindBy(xpath="//img [@src='/static/media/cross.c1eff854.svg']"))
List<WebElement> crossimg;

@FindAll(@FindBy(xpath="//p[@class='task-header']"))
List<WebElement> droptask;

@FindAll(@FindBy(xpath="//p[contains(text(),'')]/p"))
List<WebElement> para;


@FindBy(xpath="//div[@class='g-like']")
WebElement likebtn;

Select Module;

public void goToMOdules() throws InterruptedException
{
	this.driver=driver;
	Thread.sleep(9000);
	
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(4000);
	arrow.get(4).click();
	
	Thread.sleep(4000);

	selectModule.click();
	Select Module=new Select(driver.findElement(By.xpath("//div[@class='c-dropdown']//select")));
	Module.selectByValue("Module 3");


}


public void chkw3day1() throws InterruptedException
{
	proceedbtn.click();
	Thread.sleep(5000);
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", navLink); 
	  Thread.sleep(4000); 
	  navLink.click();
	int size =cardSize.size();
	for(int i=2;i<size;i++)
	{
		
		try {
			if(i==5)
			{
				Thread.sleep(5000);
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
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (i==7)
		{
			Thread.sleep(5000);
			txtare.get(0).sendKeys("Testing");
			Thread.sleep(4000);
			saveBtn.click();
			Thread.sleep(2000);
			okBtn.click();
		}
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 Thread.sleep(1000);
		forwardLink.get(1).click();
		System.out.println(i);
	}
	
	Thread.sleep(4000);
	((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	Thread.sleep(2000);
	backtoPastModules.click();
}


public void chkw3day2() throws InterruptedException
{
	Thread.sleep(5000);
	day2.click();
	
	proceedbtn.click();
	int size =cardSize.size();
	for(int i=2;i<size+1;i++)
	{
System.out.println(i);
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		forwardLink.get(1).click();
		if(i==4)
		{
			/*
			 * Thread.sleep(5000); txtare.get(0).sendKeys("Test textarea");
			 * txtare.get(1).sendKeys("Test textarea"); Thread.sleep(8000); saveBtn.click();
			 * Thread.sleep(3000); okBtn.click();
			 */
			
			fifthcard.click();
		//	continue;
		}
		
		if(i==5)
		{
			try {
				Thread.sleep(7000);
				txtare.get(0).sendKeys("testdata");
				Thread.sleep(8000);
				saveBtn.click();
				Thread.sleep(3000);
				okBtn.click();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(i==6)
		{
			
			Thread.sleep(5000);
			txtare.get(0).sendKeys("Test textarea");
			txtare.get(1).sendKeys("Test textarea");
			txtare.get(2).sendKeys("Test textarea");
			
			Thread.sleep(8000);
			select.get(0).click();
			Select feel=new Select(driver.findElement(By.xpath("//div[@class='css-1dbjc4n']/select")));
		feel.selectByIndex(2);
		
		Thread.sleep(6000);
		select.get(1).click();
		Select commit=new Select(driver.findElement(By.xpath("//div[@class='css-1dbjc4n']/select")));
		commit.selectByIndex(1);
		Thread.sleep(4000);
		
		date.click();
		Thread.sleep(2000);
		selectdate.click();
		
		saveBtn.click();
		Thread.sleep(2000);
		okBtn.click();
		}
	}
}

public void chkw3day3() throws InterruptedException
{
	
	Thread.sleep(5000);
	day3.click();
	
	proceedbtn.click();
	int size =cardSize.size();
	System.out.println(size);
	
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(1000);
	forwardLink.get(1).click();
	for(int i=2;i<size+1;i++)
	{
		
		if (i==2)
		{
/*
 * Thread.sleep(6000); text.get(0).sendKeys("Test");
 * text.get(1).sendKeys("Test"); text.get(2).sendKeys("Test");
 * 
 * Thread.sleep(4000); crossimg.get(0).click(); crossimg.get(1).click();
 * crossimg.get(2).click(); crossimg.get(3).click();
 * 
 * Thread.sleep(4000); saveBtn.click(); Thread.sleep(2000); okBtn.click();
 */
thirdcard.click();
continue;
		}
		
		if (i==4)
		{ 
			/*
			 * text.get(0).sendKeys("Test"); text.get(1).sendKeys("Test");
			 * text.get(2).sendKeys("Test");
			 * 
			 * Thread.sleep(4000); saveBtn.click(); Thread.sleep(2000); okBtn.click();
			 */
			
			fifthcard.click();
			continue;			
		}
		
		if (i==5)
			try {
				{
					
for (i=0;i<6;i++)

{
Thread.sleep(2000);
text.get(i).sendKeys("Testdata"+i);
}
saveBtn.click();
Thread.sleep(3000);
okBtn.click();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
	}
		
public void chkw3day4() throws InterruptedException
{
	Thread.sleep(5000);
	day4.click();
	
	proceedbtn.click();
	int size =cardSize.size();
	System.out.println(size);
	
	
	for(int i=2;i<size+1;i++)
	{
System.out.println(i);
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		forwardLink.get(1).click();
		
		if(i==3)
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
		
		if (i==5)
		{
			/*
			 * try { Thread.sleep(8000); Actions act = new Actions(driver); //Dragged and
			 * dropped.
			 * 
			 * act.dragAndDrop(drag.get(0), droptask.get(1)).build().perform();
			 * Thread.sleep(4000); saveBtn.click(); Thread.sleep(2000); okBtn.click(); }
			 * catch (InterruptedException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); }
			 */
			sixthcard.click();
			continue;
		
		}
		
		if(i==7)
		{
			try {
				Thread.sleep(6000);
				txtare.get(0).sendKeys("Test@123");
				Thread.sleep(6000);
				saveBtn.click();
				Thread.sleep(6000);
				okBtn.click();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}
	
}

public void chkw3day5() throws InterruptedException
{
	
	Thread.sleep(8000);
	day5.get(1).click();
	
	proceedbtn.click();
	
	int size =cardSize.size();
	System.out.println(size);
	
	
	for(int i=2;i<size+1;i++)
	{
System.out.println(i);
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		forwardLink.get(1).click();
		
		
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
	}
		
	
	
}

public void chechweek3Day1() throws InterruptedException
{
	week3.click();
	ImageLoading im = new ImageLoading(driver);
	im.checkimage(images);
	secondcard.click();
	im.checkimage(images);
	thirdcard.click();
	im.checkimage(images);
	fourthcard.click();
	im.checkimage(images);
	fifthcard.click();
	
	sixthcard.click();
	
	seventhcard.click();
	eightcard.click();
}



public void checkweek3Day2()
{
	day2.click();
	secondcard.click();
	thirdcard.click();
	fourthcard.click();
	fifthcard.click();
	sixthcard.click();
	
}

public void checkweek3Day3()
{
	day3.click();
	secondcard.click();
	thirdcard.click();
	fourthcard.click();
	fifthcard.click();
	sixthcard.click();
	
	
}

public void checkweek3Day4()
{
	day4.click();
	secondcard.click();
	thirdcard.click();
	fourthcard.click();
	fifthcard.click();
	sixthcard.click();
	seventhcard.click();
	eightcard.click();
}

public void checkweek3Day5()
{
//	day5.click();
	secondcard.click();
	thirdcard.click();
	fourthcard.click();
	fifthcard.click();
	sixthcard.click();
	
}
}