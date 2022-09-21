package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserBase {

	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver launchAdminPortal() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.get("https://mamaliftplus-qa-careportal.curio-dtx.com/admin");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		return driver;

	}

	public static void initializeBrowser() throws IOException {
		if (prop == null) {
			prop = new Properties();
			String propertiesPath = System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\Config2.properties";
			FileInputStream fis = new FileInputStream(propertiesPath);
			prop.load(fis);

		}
		String browserName = prop.getProperty("browserName");

		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"E:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		}
		
		if (browserName.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver",
					"E:\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		}

	}

	public static void generatemailid() 
	{
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		String newemail = ("Test" + randomInt + "@yopmail.com");
		System.out.println("Newemail is" + newemail);
		
		//prop.setProperty("Email", newemail);
		
		
UpdateProperty yp = new UpdateProperty();
		yp.updateconfig("Email", newemail);

	}

}
