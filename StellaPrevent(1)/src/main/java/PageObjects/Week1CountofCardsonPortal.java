package PageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Week1CountofCardsonPortal {
	
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public Week1CountofCardsonPortal(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement SearchProgram;
	
	@FindBy(xpath="//span[@class='menu-sidebar' and text()='Program']")
	WebElement programtab;
	
	@FindBy(xpath="//td[contains(text(),'Stella-Prevent')]/following::img")
	List<WebElement> addContents;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper']")
	List<WebElement> editcontent;
	
	@FindBy(xpath="//span[@class='mat-content']")
	List<WebElement> cardno;
	public String[] checkweek1day1card () throws InterruptedException
	{
		programtab.click();
		Thread.sleep(3000);
		addContents.get(5).click();
		Thread.sleep(3000);
		editcontent.get(0).click();
		Thread.sleep(3000); 
		int x =cardno.size();
		String str[] = new String[x];
		System.out.println("Week 1 Day 1");
		for (int i=0;i<x;i++)
		{	
			String textnew= cardno.get(i).getText();
     	String trimtext= textnew.replaceAll("Card Title - ", "");
			str[i] = cardno.get(i).getText();
          str[i]=trimtext;		
	System.out.println(str[i]);
		}
		
		return str;
	}
	
	
	public String[] checkweek1day2card() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(4000);
		programtab.click();
		
		addContents.get(5).click();
		editcontent.get(1).click();
		Thread.sleep(3000); 
		int x =cardno.size();
		String str[] = new String[x];
		System.out.println("Week 1 Day 2");
		for (int i=0;i<x;i++)
		{		String textnew= cardno.get(i).getText();
	String trimtext=	textnew.replaceAll("Card Title - ", "");
			str[i] = cardno.get(i).getText();
str[i]=trimtext;		
	System.out.println(str[i]);
		}
		return str;
	
}
	
	
	public String[] checkweek1day3card() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(4000);
		programtab.click();
		
		addContents.get(5).click();
		editcontent.get(2).click();
		Thread.sleep(3000); 
		int x =cardno.size();
		String str[] = new String[x];
		System.out.println("Week 1 Day 3");
		for (int i=0;i<x;i++)
		{		String textnew= cardno.get(i).getText();
	String trimtext=	textnew.replaceAll("Card Title - ", "");
			str[i] = cardno.get(i).getText();
str[i]=trimtext;		
	System.out.println(str[i]);
		}
		
		return str;
	
}
	
	
	public String[] checkweek1day4card() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(4000);
		programtab.click();
		
		addContents.get(5).click();
		editcontent.get(3).click();
		Thread.sleep(3000); 
		int x =cardno.size();
		String str[] = new String[x];
		for (int i=0;i<x;i++)
		{		String textnew= cardno.get(i).getText();
	String trimtext=	textnew.replaceAll("Card Title - ", "");
			str[i] = cardno.get(i).getText();
str[i]=trimtext;		
	System.out.println("Day4="+str[i]);
		}
		
		return str;
	
}
	public String[] checkweek1day5card() throws InterruptedException
	{driver.navigate().back();
	Thread.sleep(4000);
		programtab.click();
		
		addContents.get(5).click();
		editcontent.get(4).click();
		Thread.sleep(3000); 
		int x =cardno.size();
		String str[] = new String[x];
		for (int i=0;i<x;i++)
		{		String textnew= cardno.get(i).getText();
	String trimtext=	textnew.replaceAll("Card Title - ", "");
			str[i] = cardno.get(i).getText();
str[i]=trimtext;		
	System.out.println("Day5="+str[i]);
		}
		
		return str;
	
}
	

}