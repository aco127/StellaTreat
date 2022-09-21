package Testcases;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.MainPage;
import PageObjects.SuperAdmin_DTC_Cobranding;
import PageObjects.SuperAdmin_LoginPage;
import Resources.Base;
import Resources.Common;
import Resources.UpdateProperty;

public class VerifyCobrandingCustomer_HospitalRegisteration extends Base {

	WebDriver driver;

	String newhospitalEmail, Customername, careteamemails, PatientMail, PatientName, ClinicEmail, ClinicName,PMobileNo;

	//long PMobileNo;

	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("AdminURL"));
		SuperAdmin_LoginPage objectsuperadmin = new SuperAdmin_LoginPage(driver);

		objectsuperadmin.Login(prop.getProperty("AdminUsername"), prop.getProperty("AdminPassword"));

		SuperAdmin_DTC_Cobranding objsuperadmin = new SuperAdmin_DTC_Cobranding(driver);

		Common robj = new Common(driver);
		newhospitalEmail = robj.randomEmail();
		Customername = robj.generateRandomStringname();
		careteamemails = robj.CareTeamrandomEmail();
		PatientMail = robj.randomPtEmail();
		PatientName = robj.generateRandomStringname();
		PMobileNo = robj.randomPhns();
		ClinicEmail = robj.ClinicEmail();
		ClinicName = robj.generateRandomStringname();

		UpdateProperty.updateconfig("Customernames", Customername);
		UpdateProperty.updateconfig("hospitalEmail", newhospitalEmail);
		UpdateProperty.updateconfig("careteamemail", careteamemails);
		UpdateProperty.updateconfig("PatientEmail", PatientMail);
		UpdateProperty.updateconfig("PatientNames", PatientName);
	}

	@Test(priority = 1)
	public void registerCustomer() throws InterruptedException {
		SuperAdmin_DTC_Cobranding objsuperadmin = new SuperAdmin_DTC_Cobranding(driver);
		objsuperadmin.registerCustomer(Customername, newhospitalEmail);

	}

	@Test(priority = 2)
	public void VerifyCustomerRegisteration() throws InterruptedException {
		SuperAdmin_DTC_Cobranding obj1superadmin = new SuperAdmin_DTC_Cobranding(driver);
		obj1superadmin.checkcustomerRegistered();
	}

	@Test(priority = 3)
	public void verifyEditCustomer() throws InterruptedException {
		SuperAdmin_DTC_Cobranding obj2superadmin = new SuperAdmin_DTC_Cobranding(driver);
		obj2superadmin.checkEditCustomer(newhospitalEmail, Customername);

	}

	@Test(priority = 4)
	public void verifyNewHospitalLogin() throws InterruptedException {
		SuperAdmin_DTC_Cobranding obj3superadmin = new SuperAdmin_DTC_Cobranding(driver);
		obj3superadmin.checkNewHospitalLogin(newhospitalEmail);
	}

	@Test(priority = 5)
	public void AddClinic() throws InterruptedException {
		SuperAdmin_DTC_Cobranding obj4superadmin = new SuperAdmin_DTC_Cobranding(driver);
		obj4superadmin.addclinic(ClinicName, ClinicEmail);
		SuperAdmin_LoginPage objectsuperadmin = new SuperAdmin_LoginPage(driver);
		objectsuperadmin.Login(ClinicEmail, "Test@1230");
	}

	@Test(priority = 5)
	public void addPatient() throws InterruptedException {
		SuperAdmin_DTC_Cobranding obj4superadmin = new SuperAdmin_DTC_Cobranding(driver);
		obj4superadmin.addpatient(PatientName, PatientMail, PMobileNo);
	}

	@Test(priority = 6)
	public void validatePatientEmail() throws InterruptedException {
		SuperAdmin_DTC_Cobranding obj5superadmin = new SuperAdmin_DTC_Cobranding(driver);
		obj5superadmin.checkPatientEmail(PatientMail);
	}

	/*
	 * @Test(priority=7) public void registerCobrandingPatient() throws
	 * InterruptedException { MainPage mp = new MainPage(driver);
	 * //driver.get(prop.getProperty("URL")); // Thread.sleep(1000);
	 * mp.registerCobranding(); }
	 */

	@Test(priority = 8)
	public void cobrandingPatientSignup() throws InterruptedException {
		SuperAdmin_DTC_Cobranding obj6superadmin = new SuperAdmin_DTC_Cobranding(driver);
		obj6superadmin.patientSignup(PatientMail, PatientName, PMobileNo);
	}

	@Test(priority = 9)
	public void loginToReactNative() throws InterruptedException, IOException {

		SuperAdmin_DTC_Cobranding obj7superadmin = new SuperAdmin_DTC_Cobranding(driver);

		obj7superadmin.loginreactnative(PatientMail);

	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(source, new File("./Screenshots/" + result.getName() + ".png"));
				System.out.println("Screenshot taken");
			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
		}

	}
	/*
	 * @AfterSuite public void closeBrowser() { driver.quit(); }
	 */

}