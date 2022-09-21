
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

public class Common {
	public Properties prop;
	public int randomInt;
	public static WebDriver driver;
    public static DesiredCapabilities cap;

    public Common(WebDriver driver) {
    	 this.driver = driver; PageFactory.initElements(driver, this);
    }
    
    
    public String randomPtEmail()
	{
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		String Email = ("user" + randomInt + "@yopmail.com");
		System.out.println("ptemail is" + Email);

		return Email;
	}
	String Email;
    		
    	 
	


public String generateRandomString() {
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
public long randomPhn()
{
	Random rand = new Random();

	long PhoneNo = (long)(rand.nextDouble()*10000000L);

	System.out.println(PhoneNo);
return PhoneNo;
}

public String randomPhns()
{
	Random rand = new Random();

	long PhoneNo = (long)(rand.nextDouble()*10000000L);
String phnno="987"+PhoneNo;
	System.out.println(phnno);
	return phnno;

}

long PhoneNo;



public String generateRandomStringname() {
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
	
	
	System.out.println("Customername is " + randomString);
	return randomString;

}

public String CareTeamrandomEmail() {
	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(1000);
	String careteamemail = ("test" + randomInt + "@yopmail.com");
	System.out.println("Newemail is" + careteamemail);

	
	System.out.println("careteamemail is" + careteamemail);

	return careteamemail;
}

public String ClinicEmail() {
	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(1000);
	String careteamemail = ("clinic" + randomInt + "@yopmail.com");
	System.out.println("Newemail is" + careteamemail);

	
	System.out.println("Clinic is" + careteamemail);

	return careteamemail;
}



String careteamemail;

public String randomEmail() {
	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(10000);
	String newemail = ("tests" + randomInt + "@yopmail.com");
	System.out.println("Newemail is" + newemail);

	
	System.out.println("HospitalEmail is" + newemail);
	return newemail;
}

// String remail, customerName;
String customerName;



String ptemail;


// long newphnno;
long drand, no;
long random;

}


