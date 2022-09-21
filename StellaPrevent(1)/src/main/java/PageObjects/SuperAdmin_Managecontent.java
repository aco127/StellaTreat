package PageObjects;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SuperAdmin_Managecontent {
	
	WebDriver driver;
	Properties prop;

	public  SuperAdmin_Managecontent(WebDriver driver)
	{
 this.driver = driver; PageFactory.initElements(driver, this);
		}
	String Actual,Expected;
	
	
	@FindBy(xpath="//a[@href='/admin/dashboard/content-management']//span[@class='menu-sidebar']")
	WebElement managecontent;
	
	@FindBy(xpath="//div[normalize-space()='What-is-stella']")
	WebElement stelladropdown;
	

@FindAll(@FindBy(xpath="//mat-icon[contains(text(),'edit')]"))
	List<WebElement> editOption;

@FindBy(xpath="//body[@class='mce-content-body ']")
List<WebElement> GetContent;

@FindBy(xpath="//span[contains(text(),'Save')]")
WebElement saveButton;

@FindBy(xpath="//span[contains(text(),' Cancel')]")
WebElement CancelButton;


	
	
public void checkdataforWhatisStella() throws InterruptedException
{
	managecontent.click();
	Thread.sleep(5000);
	editOption.get(0).click();
	Thread.sleep(1000);
	driver.switchTo().frame(0);
	String ExpectedTitle="Using data driven analytics, MamaLift provides personalized self-help tools through short-term, web based modules that are intended for women who wish to manage their symptoms of depression and anxiety during pregnancy or after delivery. MamaLift guides expecting and new mothers through their journey, providing helpful tips, self-guided strategies and reminders along the way.\r\n"
			+ "MamaLift provides education and skills about the transition to parenthood as well as about depression and anxiety symptoms. The interactive exercises with personalized feedback tools support learning differently than traditional methods of learning. Mothers who are expecting and post-delivery reported greater engagement in e-health tools, specifically informative websites. Digital tools such as MamaLift are useful for delivering self-guided strategies due to the flexibility, privacy, personalization, and ease of use for the user. The modules also promote the importance of social support and how to improve the quality of relationships. Not only can MamaLift help the mom, the entire family unit can benefit.";
	String ActualTitle=GetContent.get(0).getText();
	System.out.println("WhatisStella="+ActualTitle);
	Expected= ExpectedTitle.replaceAll("[\\n\\t\\r ]", "");
	 Actual=ActualTitle.replaceAll("[\\n\\t\\r ]", "");
//	Assert.assertEquals(Expected, Actual);
	/*
	 * ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");
	 * 
	 * ((JavascriptExecutor)
	 * driver).executeScript("arguments[0].scrollIntoView(true);", saveButton);
	 */
	driver.navigate().back();
	Thread.sleep(3000);
}
public void checkdataforHome() throws InterruptedException
{
	managecontent.click();
	Thread.sleep(1000);
	editOption.get(1).click();
	Thread.sleep(1000);driver.switchTo().frame(0);
	try {
	String ExpectedTitle="MamaLift provides new and expecting mothers with the tools they need to manage symptoms of depression and anxiety. Combining customized evidence-based interventions, helpful tips, and interactive tools, MamaLift guides you along your journey.";
	String ActualTitle=GetContent.get(0).getText();
	System.out.println("Home = "+ActualTitle);
	Expected= ExpectedTitle.replaceAll("[\\n\\t\\r ]", "");
	 Actual=ActualTitle.replaceAll("[\\n\\t\\r ]", "");
	//Assert.assertEquals(Expected, Actual);
	/*
	 * ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");
	 * 
	 * ((JavascriptExecutor)
	 * driver).executeScript("arguments[0].scrollIntoView(true);", saveButton);
	 */}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	driver.navigate().back();
	Thread.sleep(3000);
}


  public void checkdataforTest() throws InterruptedException {
	  managecontent.click();
		Thread.sleep(1000);
		editOption.get(2).click();
		Thread.sleep(1000);driver.switchTo().frame(0);
		try {
		String ExpectedTitle="women are nearly twice as likely as men to suffer from depression during their lifetime. In fact, 1 in 5 women report symptoms of depression and/or anxiety after giving birth.";
		String ActualTitle=GetContent.get(0).getText();
		System.out.println("Test= "+ActualTitle);
		Expected= ExpectedTitle.replaceAll("[\\n\\t\\r ]", "");
		 Actual=ActualTitle.replaceAll("[\\n\\t\\r ]", "");
		//Assert.assertEquals(Expected, Actual);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/*
		 * ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");
		 * 
		 * ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].scrollIntoView(true);", saveButton);
		 */
		driver.navigate().back();
		Thread.sleep(3000);}
 
	


public void checkdataforStellaScience() throws InterruptedException {
	  managecontent.click();
		Thread.sleep(1000);
		editOption.get(3).click();
		Thread.sleep(1000);driver.switchTo().frame(0);
		try {
		String ExpectedTitle="Our underlying science and technology makes CurioTM intuitive and responsive to women’s behavioral and physical health care needs We approach all problems with a people-first approach, enabled by technology and data to help build programs that will holistically help them manage their conditions. This, coupled with the rigorous scientific review process all our programs are put through, ensures caregivers and care seekers embark on a journey of hope and recovery.";
		String ActualTitle=GetContent.get(0).getText();
		System.out.println("StellaScienc= "+ActualTitle);
		Expected= ExpectedTitle.replaceAll("[\\n\\t\\r ]", "");
		 Actual=ActualTitle.replaceAll("[\\n\\t\\r ]", "");
		//Assert.assertEquals(Expected, Actual);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/*
		 * ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");
		 * 
		 * ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].scrollIntoView(true);", saveButton);
		 */
		driver.navigate().back();
		Thread.sleep(3000);}

	
public void checkdataforFAQ() throws InterruptedException {
	  managecontent.click();
		Thread.sleep(1000);
		editOption.get(4).click();
		Thread.sleep(1000);driver.switchTo().frame(0);
		try {
		String ExpectedTitle="We approach all problems with a people-first approach, enabled by technology and data to help build programs that will holistically help them manage their conditions. This, coupled with the rigorous scientific review process all our programs are put through, ensures caregivers and care seekers embark on a journey of hope and recovery.?";
		String ActualTitle=GetContent.get(0).getText();
		System.out.println("FAQ"+ActualTitle);
		Expected= ExpectedTitle.replaceAll("[\\n\\t\\r ]", "");
		 Actual=ActualTitle.replaceAll("[\\n\\t\\r ]", "");
	//	Assert.assertEquals(Expected, Actual);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/*
		 * ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");
		 * 
		 * ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].scrollIntoView(true);", saveButton);
		 */
		driver.navigate().back();
		Thread.sleep(3000);}

	



public void checkdataforGetStarted() throws InterruptedException {
	  managecontent.click();
		Thread.sleep(1000);
		editOption.get(5).click();
		Thread.sleep(1000);driver.switchTo().frame(0);
		try {
		String ExpectedTitle="Welcome to MamaLift! Are you ready to get started? We would like to ask you a few questions so that we can tailor your MamaLift experience to fit your needs. Your responses are confidential and will not be shared with anyone without your permission.";
		String ActualTitle=GetContent.get(0).getText();
		System.out.println("Get started="+ActualTitle);
		Expected= ExpectedTitle.replaceAll("[\\n\\t\\r ]", "");
		 Actual=ActualTitle.replaceAll("[\\n\\t\\r ]", "");
	//	Assert.assertEquals(Expected, Actual);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/*
		 * ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");
		 * 
		 * ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].scrollIntoView(true);", saveButton);
		 */
		driver.navigate().back();
		Thread.sleep(3000);}

	
}

