
package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Global {
	public Properties prop;
	public int randomInt;
	public static WebDriver driver;
    public static DesiredCapabilities cap;

    public Global(WebDriver driver) {
    	 this.driver = driver; PageFactory.initElements(driver, this);
    }
    
    
    public interface GlobalConstants
    {
      String FirstName =generateRandomString();
      String email = randomPtEmail();
    }
    
    
    
    public static String randomPtEmail()
	{
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		String Email = ("user" + randomInt + "@yopmail.com");
		System.out.println("ptemail is" + Email);

		return Email;
	}
	String Email;
    		
    	 
	public long randomPhn()
	{
		Random rand = new Random();

		long PhoneNo = (long)(rand.nextDouble()*10000000000L);
		System.out.println(PhoneNo);
	return PhoneNo;
	}

long PhoneNo;


public static String generateRandomString() {
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	StringBuilder sb = new StringBuilder();

	// create an object of Random class
	Random random = new Random();

	// specify length of random string
	int length = 5;

	for (int i = 0; i < length; i++) {

		// generate random index number
		int index = random.nextInt(alphabet.length());

		// get character specified by index
		// from the string
		char randomChar = alphabet.charAt(index);

		// append the character to string builder
		sb.append(randomChar);
	}

	String randomString = sb.toString();
	System.out.println("Name="+randomString);
	return randomString;

}

}
