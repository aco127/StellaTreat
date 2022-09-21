package PageObjects;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardsCheckStellaLite {
	WebDriver driver;
	Properties prop;

	public CardsCheckStellaLite(WebDriver driver) {
 this.driver = driver; PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//button[@class='navbutton']")
	List<WebElement> cardcounts;
	
	@FindBy(xpath="//div[@class='week-inside']")
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
	
	String str[]=null;
	public String[] checkcardcountsonappWeek1day1()
	{
		week1.click();
		
		int x= cardcounts.size();
		int y= card.size();
		String str[] = new String[x];
		for (int z =1;z<y;z++)
		{
			card.get(z).click();
			//System.out.println(Heading.getText());
		String text=Heading.getText();
			int i=0;
			str[i]=text;
			str[i] = Heading.getText();
			System.out.println(str[i]);			
}
		return str;
}
	
	
	public String[] checkcardcountsonappWeek1day2() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(3000);
		week1.click();
		Day2.click();
		
		int x= cardcounts.size();
		int y= card.size();
		String str[] = new String[x];
		for (int z =1;z<y;z++)
		{
			card.get(z).click();
			//System.out.println(Heading.getText());
		String text=Heading.getText();
			int i=0;
			str[i]=text;
			str[i] = Heading.getText();
			System.out.println(str[i]);			
}
		return str;
}
	
	public String[] checkcardcountsonappWeek1day3()
	{
		week1.click();
		Day3.click();
		int x= cardcounts.size();
		int y= card.size();
		String str[] = new String[x];
		for (int z =1;z<y;z++)
		{
			card.get(z).click();
			//System.out.println(Heading.getText());
		String text=Heading.getText();
			int i=0;
			str[i]=text;
			str[i] = Heading.getText();
			System.out.println(str[i]);			
}
		return str;
}

	public String[] checkcardcountsonappWeek1day4()
	{
		week1.click();
		Day4.click();
		int x= cardcounts.size();
		int y= card.size();
		String str[] = new String[x];
		for (int z =1;z<y;z++)
		{
			card.get(z).click();
			//System.out.println(Heading.getText());
		String text=Heading.getText();
			int i=0;
			str[i]=text;
			str[i] = Heading.getText();
			System.out.println(str[i]);			
}
		return str;
}

	
	public String[] checkcardcountsonappWeek1day5()
	{
		week1.click();
		Day5.click();
		int x= cardcounts.size();
		int y= card.size();
		String str[] = new String[x];
		for (int z =1;z<y;z++)
		{
			card.get(z).click();
			//System.out.println(Heading.getText());
		String text=Heading.getText();
			int i=0;
			str[i]=text;
			str[i] = Heading.getText();
			System.out.println(str[i]);			
}
		return str;
}

	public String[] checkcardcountsonappWeek1day6()
	{
		week1.click();
		Day6.click();
		int x= cardcounts.size();
		int y= card.size();
		String str[] = new String[x];
		for (int z =1;z<y;z++)
		{
			card.get(z).click();
			//System.out.println(Heading.getText());
		String text=Heading.getText();
			int i=0;
			str[i]=text;
			str[i] = Heading.getText();
			System.out.println(str[i]);			
}
		return str;
}

	public String[] checkcardcountsonappWeek1day7()
	{
		week1.click();
		Day7.click();
		int x= cardcounts.size();
		int y= card.size();
		String str[] = new String[x];
		for (int z =1;z<y;z++)
		{
			card.get(z).click();
			//System.out.println(Heading.getText());
		String text=Heading.getText();
			int i=0;
			str[i]=text;
			str[i] = Heading.getText();
			System.out.println(str[i]);			
}
		return str;
}

	
}
