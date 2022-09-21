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
import PageObjects.Logout;
import PageObjects.MoodTracker;
import PageObjects.Points;
import PageObjects.SleepTracker;
import Resources.Base;
import Resources.BrowserBase;
import WEEK2.DLWeek2Day2;
import WEEK2.DLWeek2Day4;

public class FlowFirst extends BrowserBase {
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
		System.out.println("Patient Added and mailid is" + prop.getProperty("Email"));
	}

	@Test(priority = 3, dependsOnMethods = "addPatient")
	public void registerPatient() throws InterruptedException {
		HospitalPortal pl2 = new HospitalPortal(driver);
		pl2.emailcheckforaddedPatient(prop.getProperty("Email"), prop.getProperty("confpwd"),
				prop.getProperty("zipcode"), prop.getProperty("pwd"));
		System.out.println("Patient Registered and mailid is" + prop.getProperty("Email"));
	}

	@Test(priority = 4, dependsOnMethods = "registerPatient")
	public void assignMLPProgram() throws InterruptedException, IOException {

		HospitalPortal plobj = new HospitalPortal(driver);
		plobj.assignpatientPPD();
		plobj.assignAssessment();

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
		lp.newUserLogin(prop.getProperty("Email"), registerationcode);
	}

	@Test(priority = 8, dependsOnMethods = "Login")
	public void EPDSCalculation() throws InterruptedException {
		Assessment a = new Assessment();
		a.EPDSAsstscore();
	}

}