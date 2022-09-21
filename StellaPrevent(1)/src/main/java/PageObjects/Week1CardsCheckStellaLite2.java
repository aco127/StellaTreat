package PageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Week1CardsCheckStellaLite2 {
	WebDriver driver;
	Properties prop;

	public Week1CardsCheckStellaLite2(WebDriver driver) {
 this.driver = driver; PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//button[@class='navbutton']")
	List<WebElement> cardcounts;
	
	@FindBy(xpath="//option[@value='Week 1']")
			WebElement week1;
	@FindBy(xpath="//button[@class='navbutton']")
	List<WebElement> card;
	
	@FindBy(xpath="//p[@class='tabDayData' and text()='Day 2']")
	WebElement Day2;
	
	@FindBy(xpath="//p[@class='tabDayData' and text()='Day 3']")
	WebElement Day3;
	@FindBy(xpath="//p[@class='tabDayData' and text()='Day 4']")
	WebElement Day4;
	@FindBy(xpath="//p[@class='tabDayData' and text()='Day 5']")
	WebElement Day5;
	@FindBy(xpath="//p[@class='tabDayData' and text()='Day 6']")
	WebElement Day6;
	@FindBy(xpath="//p[@class='tabDayData' and text()='Day 7']")
	WebElement Day7;
	
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
	
	@FindBy(xpath="//h2[@class='dashboard-heading']")
	WebElement Heading;
	
	@FindBy(xpath="//span[@class='menu-sidebar' and text()='Program']")
	WebElement programtab;
	
	@FindBy(xpath="//img[@title=' Add Contents']")
	List<WebElement> addContents;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper']")
	WebElement editcontent;
	
	@FindBy(xpath="//span[@class='mat-content']")
	List<WebElement> cardno;
	
	@FindBy(xpath="//p[contains(text(),'Past Modules')]")
	WebElement PastModuleTab;
	
	@FindBy(xpath="//select[@style='width: 100%; padding-top: 5px; padding-bottom: 5px; background-color: rgb(255, 255, 255); border: 0px solid rgba(0, 111, 89, 0.38);']")
	WebElement SelectWeekDropDown;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1kihuf0 r-ieixw r-1472mwg r-1777fci r-14gqq1x r-lrsllp']")
	
	List<WebElement> WeekofDaysSelect;
	
	@FindBy(xpath="//div[contains(text(),'Proceed')]")
	
	WebElement ProceedBtn;
	
	 @FindBy(xpath="//div//p[@class='dash-text'][1]")
	 WebElement cont1;
	 
	
	/*@FindBy(xpath="//div//p[@class='dash-text']")
	List<WebElement>cont1;
	*/
	
	
	
	String str[]=null;
	public String[] checkcardcountsonappWeek1day1() throws InterruptedException
	{Thread.sleep(10000);
		PastModuleTab.click();
		Thread.sleep(1000);
		SelectWeekDropDown.click();
		
		week1.click();
		WeekofDaysSelect.get(0).click();
		ProceedBtn.click();
		Thread.sleep(5000);
		
		int x= cardcounts.size();
	
		int y= card.size();
		System.out.println(y);
		String str[] = new String[x];
		String content[] = new String[x];
		//List<String> str = new ArrayList<String>();
		Thread.sleep(5000);
		
		for (int i = 0; i < cardcounts.size(); i++) {
			 card.get(i).click();
			 try { 
			String text=Heading.getText();
			
			str[i]=text;
			str[i] = Heading.getText();
			System.out.println(str[i]);	
			
			 } catch(Exception e) { e.printStackTrace(); } 
			 
			 
			 
	
		return str;
}  
		card.get(0).click();
		for (int i = 0; i < cardcounts.size(); i++)
		 {
			card.get(i).click();
			 try {
					String contents=cont1.getText();
					content[i]=contents;
					content[i]=cont1.getText();
			 }
			 catch(Exception e) { e.printStackTrace(); } 
        }
		return content;

	}


	
	/*
	 * List<WebElement> m =
	 * driver.findElements(By.xpath("//h2[@class='store-name']")); // iterate over
	 * list for(int i = 0; i< m.size(); i++) { //obtain text String s =
	 * m.get(i).getText(); System.out.println("Text is: " + s);
	 */
     
	/*
	 * Browser_Launch("chrome"); sign_in(); List<String> a = new ArrayList<>();
	 * Element_to_be_clicked("xpath", "//*[@id='history-guide-item']/a");
	 * List<WebElement> text =
	 * driver.findElements(By.xpath("//ol[@class='item-section']//li//div//a")); for
	 * (int i = 0; i < text.size(); i++) { a.add(text.get(i).getText());
	 * System.out.println(text.get(i).getText()); } if
	 * (a.contains("Will & Grace - Back This Fall")) {
	 * System.out.println("test passed"); } else {
	 * System.out.println("test failed"); }
	 */
	
	public String[] checkcardcountsonappWeek1day2() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(1000);
		//week1.click();
		WeekofDaysSelect.get(1).click();
		//Day2.click();
		ProceedBtn.click();
		Thread.sleep(500);
		
		int x= cardcounts.size();
		
		int y= card.size();
		System.out.println(y);
		String str[] = new String[x];
		//List<String> str = new ArrayList<String>();
		Thread.sleep(5000);
		
		for (int i = 0; i < cardcounts.size(); i++) {
			 card.get(i).click();
			 try { 
			String text=Heading.getText();
			
			str[i]=text;
			str[i] = Heading.getText();
			System.out.println(str[i]);	
			 }
			  catch(Exception e) { e.printStackTrace(); } 
	        }
		return str;
}
	
	public String[] checkcardcountsonappWeek1day3() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(2000);
		//week1.click();
		WeekofDaysSelect.get(2).click();
		ProceedBtn.click();
		Thread.sleep(500);
		
		int x= cardcounts.size();
		
		int y= card.size();
		System.out.println(y);
		String str[] = new String[x];
		//List<String> str = new ArrayList<String>();
		Thread.sleep(5000);
		
		for (int i = 0; i < cardcounts.size(); i++) {
			 card.get(i).click();
			 try { 
			String text=Heading.getText();
			
			str[i]=text;
			str[i] = Heading.getText();
			System.out.println(str[i]);	
			 }
			  catch(Exception e) { e.printStackTrace(); } 
	        }
		return str;
}

	public String[] checkcardcountsonappWeek1day4() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(1000);
		//week1.click();
		WeekofDaysSelect.get(3).click();
		ProceedBtn.click();
		Thread.sleep(500);
		
		int x= cardcounts.size();
		
		int y= card.size();
		System.out.println(y);
		String str[] = new String[x];
		//List<String> str = new ArrayList<String>();
		Thread.sleep(5000);
		
		for (int i = 0; i < cardcounts.size(); i++) {
			 card.get(i).click();
			 try { 
			String text=Heading.getText();
			
			str[i]=text;
			str[i] = Heading.getText();
			System.out.println(str[i]);	
			 }
			  catch(Exception e) { e.printStackTrace(); } 
	        }
		return str;
}

	
	public String[] checkcardcountsonappWeek1day5() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(2000);
		//week1.click();
		WeekofDaysSelect.get(4).click();
		ProceedBtn.click();
		Thread.sleep(500);
		
		int x= cardcounts.size();
		
		int y= card.size();
		System.out.println(y);
		String str[] = new String[x];
		//List<String> str = new ArrayList<String>();
		Thread.sleep(5000);
		
		for (int i = 0; i < cardcounts.size(); i++) {
			 card.get(i).click();
			 try { 
			String text=Heading.getText();
			
			str[i]=text;
			str[i] = Heading.getText();
			System.out.println(str[i]);	
			 }
			  catch(Exception e) { e.printStackTrace(); } 
	        }
		return str;
}

	public String[] checkcardcountsonappWeek1day6() throws InterruptedException
	{
		week1.click();
		Day6.click();
		int x= cardcounts.size();
		
		int y= card.size();
		System.out.println(y);
		String str[] = new String[x];
		//List<String> str = new ArrayList<String>();
		Thread.sleep(5000);
		
		for (int i = 0; i < cardcounts.size(); i++) {
			 card.get(i).click();
			 try { 
			String text=Heading.getText();
			
			str[i]=text;
			str[i] = Heading.getText();
			System.out.println(str[i]);	
			 }
			  catch(Exception e) { e.printStackTrace(); } 
	        }
		return str;
}

	public String[] checkcardcountsonappWeek1day7() throws InterruptedException
	{
		week1.click();
		Day7.click();
		int x= cardcounts.size();
		
		int y= card.size();
		System.out.println(y);
		String str[] = new String[x];
		
		for (int z =0;z<x;z++)
		{
			Thread.sleep(500);
			card.get(z).click();
			//System.out.println(Heading.getText());
			try {
		String text=Heading.getText();
			int i=0;
			str[i]=text;
			str[i] = Heading.getText();
			System.out.println(str[i]);	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
}
		return str;
}

	
}
