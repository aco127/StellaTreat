package Testcases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Activity;
import PageObjects.Assessment;
import PageObjects.Dashboard;
import PageObjects.HospitalPortal;
import PageObjects.LoginPage;
import PageObjects.MoodTracker;
import PageObjects.SleepTracker;
import Resources.Base;
import Resources.BrowserBase;
import Resources.UpdateProperty;
import WEEK1.DLWeek1Day1;
import WEEK1.WeekData;
public class ResendcodeMail extends BrowserBase
{
	
		String registerationcode;
		List<String> mail;

		@BeforeTest
		public void launchHospitalPortal() throws IOException {
			BrowserBase b = new BrowserBase();
			b.initializeBrowser();
			b.generatemailid();
			driver.get(prop.getProperty("Hospitalurl"));

		}

		@Test(priority = 1)
		public void hospitalPortalLogin() throws InterruptedException {
			HospitalPortal hobj = new HospitalPortal(driver);
			hobj.HospitalLogin();
		}

		@Test(priority = 2)
		public void addPatient() throws InterruptedException {
			HospitalPortal pl = new HospitalPortal(driver);
			pl.addpatient(prop.getProperty("Firstname"), prop.getProperty("Middlename"), prop.getProperty("Lastname"),
					prop.getProperty("Email"), prop.getProperty("Phoneno"));

		}

		@Test(priority = 3, dependsOnMethods = "addPatient")
		public void patientEMailCheck() throws InterruptedException 
		{
			HospitalPortal pl2 = new HospitalPortal(driver);
			pl2.emailcheckforaddedPatient(prop.getProperty("Email"), prop.getProperty("confpwd"),
			prop.getProperty("zipcode"), prop.getProperty("pwd"));

		}

		@Test(priority = 4, dependsOnMethods = "patientEMailCheck")
		public void assignMLPProgram() throws InterruptedException, IOException {

			HospitalPortal plobj = new HospitalPortal(driver);
			plobj.assignpatientPPD();


		}

		@Test(priority = 5, dependsOnMethods = "assignMLPProgram")
		public void getRegistrationCode() throws InterruptedException {
			HospitalPortal pl3 = new HospitalPortal(driver);
			registerationcode = pl3.getRegCode(prop.getProperty("Email"));

		}

		@Test(priority = 6, dependsOnMethods = "getRegistrationCode")
		public void Launchapp() throws InterruptedException, MalformedURLException {
			Base basePage = new Base();
			basePage.Android_LaunchApp();
		}

		@Test(priority = 7, dependsOnMethods = "Launchapp")
		public void Login() throws InterruptedException {
			LoginPage lp = new LoginPage();
			lp.resendcodeclick(prop.getProperty("Email"));
		}
		
		@Test(priority=8, dependsOnMethods = "Login")
		public void checkresendmail() throws InterruptedException
		{
			HospitalPortal hobject = new HospitalPortal(driver);
			hobject.checkregcoderesendemail(prop.getProperty("Email"));
		}

}
