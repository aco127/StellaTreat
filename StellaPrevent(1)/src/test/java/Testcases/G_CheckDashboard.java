package Testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Careportal_Dashboard;
import PageObjects.HospitalAdmin_LoginPage;
import PageObjects.MainPage;
import PageObjects.ReactNative;
import PageObjects.Careportal_Reports;
import Resources.Base;

public class G_CheckDashboard extends Base {

	WebDriver driver;
	List<String> dashboarddata;
	List<String> Reportdata;

	@BeforeTest
	public void launchBrowser() throws IOException {
		  
				driver = initializeBrowser();
				driver.get(prop.getProperty("HospitalURL"));
	}
		
		
		@Test(priority=1)
		public void hospitalportallogin() throws IOException, InterruptedException
		{
		HospitalAdmin_LoginPage h = new  HospitalAdmin_LoginPage(driver); 
		h.Login(prop.getProperty("HospitalUsername"),prop.getProperty("HospitalPassword"));
		}


	@Test(priority=2) 
	public void checkIconOnDashboard() throws InterruptedException
	{

		Careportal_Dashboard d = new Careportal_Dashboard(driver);
		dashboarddata =d.checkActivity(prop.getProperty("BasicUserFirstName")); 
		System.out.println(dashboarddata);
		
		
		  d.checkAppUsageInfo(); d.checkMood(); d.checkSleep(); d.checkAssessment();
		  d.checkUserInfo();
		 
		
		  driver.navigate().to(prop.getProperty("ReactNativeLogin")); //
		  driver.get(prop.getProperty("ReactNativeLogin")); 		  
		  ReactNative objreactnative1 = new ReactNative(driver);
		  objreactnative1.SigninStellaLite(prop.getProperty("BasicUserEmail"), prop.getProperty("Password"));
	}
	
	@Test(priority=3) 
	public void checkreportOnPortal() throws InterruptedException
	{
	
		  Careportal_Reports rr = new Careportal_Reports(driver);
		  Reportdata= rr.getreport();
			System.out.println(Reportdata);
		
		  
			int reportsize= Reportdata.size();
			int dashboardsize = dashboarddata.size();
			
			boolean listResult = false;
			for(String report: Reportdata) {
				
				listResult = dashboarddata.contains(report);
				System.out.println("Report :"+ report +" prsence in dashboard list is: "+listResult);
			}
			



	}
}
