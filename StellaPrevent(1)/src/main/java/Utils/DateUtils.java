package Utils;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class DateUtils {
	 WebDriver driver;
	
	public DateUtils(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		/*
		 * this.driver = driver; this.wait = new WebDriverWait(driver, 10);
		 */
	}
	
	public static String getTimeStamp(){
			Date date = new Date();
			return date.toString().replaceAll(":", "_").replaceAll(" ", "_");
		}
	
	
	public static void captureScreenshot(WebDriver driver,String screenshotName)
	{
	 
	try 
	{
	TakesScreenshot ts=(TakesScreenshot)driver;
	 
	File source=ts.getScreenshotAs(OutputType.FILE);
	 
	FileHandler.copy(source, new File("./Screenshots/"+screenshotName+".png"));
	 
	System.out.println("Screenshot taken");
	} 
	catch (Exception e)
	{
	 
	System.out.println("Exception while taking screenshot "+e.getMessage());
	} 
	}
		
	}
	
	
