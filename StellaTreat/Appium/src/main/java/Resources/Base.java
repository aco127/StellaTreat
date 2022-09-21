package Resources;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import Utils.ExtentTestManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	public static AppiumDriver<MobileElement> driver;
    public static DesiredCapabilities cap;
    private final static String APP_PACKAGE_NAME = "com.curioStellaTwo";
	private final static String APP_ACTIVITY_NAME = "com.curioStellaTwo.MainActivity";
	
	
    public static void Android_LaunchApp() throws MalformedURLException {
        cap = new DesiredCapabilities();
        
        File appDir = new File(System.getProperty("user.dir") + "/APK/");
		File app = new File(appDir, "app-release.apk");

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "TestStella");

		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");// new step

		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		// cap.setCapability(MobileCapabilityType.appPackage,"com.curioStellaTwo");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APP_PACKAGE_NAME);
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY_NAME);
		driver = new AndroidDriver<MobileElement>(new URL("http://192.168.29.201:4723/wd/hub"), cap);
        AppDriver.setDriver(driver);
        System.out.println("Android driver is set");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
    
    public static void iOS_LaunchApp() throws MalformedURLException {
        cap = new DesiredCapabilities();
        cap.setCapability("platformName", "iOS");
        cap.setCapability("deviceName", "iPhone 11");
        cap.setCapability("automationName", "XCUITest");
        cap.setCapability("platformVersion", "13.5");
        //cap.setCapability("usePrebuiltWDA", true);
        //cap.setCapability("bundleId", "com.SamadiPour.SimpleCalculator");
        //cap.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
        //cap.setCapability("bundleId", "com.apple.MobileAddressBook");
        cap.setCapability("bundleId", "io.cloudgrey.the-app");
        driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        AppDriver.setDriver(driver);
        System.out.println("iOS driver is set");

    }
   
	
    public static void closeApp(){
        driver.quit();
    }

	
    
}
