package Testcases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.AdminKeywords;
import PageObjects.Journal;
import PageObjects.Keywords;
import PageObjects.LoginPage;
import Resources.Base;
import Resources.BrowserBase;

public class ReservedKeywords extends BrowserBase {
	String email;

	@BeforeTest
	public void Launchapp() throws InterruptedException, MalformedURLException {
		Base basePage = new Base();
		basePage.Android_LaunchApp();
	}

	@Test(priority = 1)
	public void Login() throws InterruptedException {
		LoginPage lp = new LoginPage();
		lp.Login();
	}

	@Test(priority = 2)
	public void enterKeywordInJournal() {
		Journal objjournal = new Journal();
		objjournal.keyword();
	}

	@Test(priority = 3)
	public void checkAdmin() throws IOException {
		BrowserBase b = new BrowserBase();
		b.initializeBrowser();
		driver.get(prop.getProperty("SuperAdminurl"));
	}

	@Test(priority = 4)
	public void AdminLogin() throws InterruptedException {
		AdminKeywords obj = new AdminKeywords(driver);
		obj.AdminLogin();

		Thread.sleep(1000);
		obj.getContactPersondeatils();
		email = obj.getContactPersondeatils();
		Thread.sleep(3000);

		// obj.checkcontactpersonEmail(email);

	}

	@Test(priority = 5, dependsOnMethods = "AdminLogin")
	public void checkContactPersonEMail() throws InterruptedException {
		AdminKeywords obj1 = new AdminKeywords(driver);

		driver.get("https://yopmail.com");
		Thread.sleep(3000);

		obj1.checkcontactpersonEmail(email);
	}

	@Test(priority = 6)
	public void checkPatientsEmail() throws InterruptedException {
		driver.navigate().to("https://yopmail.com");
		AdminKeywords obj1 = new AdminKeywords(driver);
		obj1.checkPatientEmail();
	}

}
