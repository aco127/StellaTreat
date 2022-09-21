package PageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CountofCards {
	
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public CountofCards(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//span[@class='menu-sidebar' and text()='Program']")
	WebElement programtab;
	
	@FindBy(xpath="//img[@title=' Add Contents']")
	List<WebElement> addContents;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper']")
	WebElement editcontent;
	
	@FindBy(xpath="//span[@class='mat-content']")
	List<WebElement> cardno;
	public String[] checkweek1day1card () throws InterruptedException
	{
		programtab.click();
		Thread.sleep(3000);
		addContents.get(2).click();
		Thread.sleep(3000);
		editcontent.click();
		Thread.sleep(3000); 
		int x =cardno.size();
		String str[] = new String[x];
		for (int i=0;i<x;i++)
		{		
			str[i] = cardno.get(i).getText();
			System.out.println(str[i]);
		}
		
		return str;
	}
	
	
	
	public String[] checkweek1day2card() throws InterruptedException
	{
		programtab.click();
		
		addContents.get(4).click();
		editcontent.click();
		Thread.sleep(3000); 
		int x =cardno.size();
		String str[] = new String[x];
		for (int i=0;i<x;i++)
		{		
		//	int j=0;
			str[i] = cardno.get(i).getText();
			System.out.println(str[i]);
		}
		
		return str;
	
}

}