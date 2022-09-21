package PageObjects;

import java.security.Key;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Careportal_AnswerCheck {
	WebDriver driver;
	WebDriverWait wait;

	public Careportal_AnswerCheck(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);

	}

	@FindAll(@FindBy(xpath = "//span[normalize-space()='Week - 2     Day - 2']/following-sibling::table//li[@class='ng-star-inserted']"))
	List<WebElement> ansOnPortal;

	@FindBy(xpath = "//span[@class='menu-sidebar' and text()='Dashboard']")
	WebElement Dashboard;

	@FindBy(xpath = "//input[@placeholder='Search by patient name']")
	WebElement searchBypatientName;

	@FindAll(@FindBy(xpath = "//i[@class='fa fa-database cursor']"))
	List<WebElement> testData;

	@FindAll(@FindBy(xpath = "//span[normalize-space()='Week - 2     Day - 2']"))
	List<WebElement> weekdata;

	@FindBy(xpath = "//td[contains(text(),'Tester New')]")
	private WebElement text;

	private WebElement patientNameInDashboard(String patienttName) {
		searchBypatientName.sendKeys(Keys.TAB);
		String patientNameXpath = "//td[contains(text(),'" + patienttName + "')]";
		WebElement patient = driver.findElement(By.xpath(patientNameXpath));
		
		return patient;
	}

	/**
	 * This method is to verify the patient data at dashboard.
	 * 
	 * @param: patientName: -Type - String value - ""
	 * @throws InterruptedException
	 */
	public void verifyPatientDataAtDashboard() throws InterruptedException {
		Thread.sleep(3000);
		Dashboard.click();
//	Thread.sleep(500);
		//wait.until(ExpectedConditions.visibilityOf(searchBypatientName));
		Thread.sleep(3000);
		searchBypatientName.sendKeys("tester");
		searchBypatientName.sendKeys(Keys.TAB);// to do- pass parameter patientName in method
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOf(patientNameInDashboard("Tester New")));
		Thread.sleep(7000);
		if (text.isDisplayed()) {
			searchBypatientName.sendKeys(Keys.TAB);
			testData.get(0).click();
		} else {
			System.out.println("Patient Not displayed");
		}
		Thread.sleep(7000);
	}

	/**
	 * 
	 * @throws InterruptedException
	 */
	public void checkdatawk1day1() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		for (WebElement el : weekdata) {
			je.executeScript("arguments[0].scrollIntoView(true);", el);

		}
	}

	public void setAnswer() throws Exception {
		String excelPath = "C:\\Users\\shilp\\eclipse-workspace\\Appium\\src\\main\\java\\TestData\\Week2.xlsx";
		System.out.println("*****Wriiten data for Portal*****");
		//ReadExcel r = new ReadExcel();
		System.out.println("Printed data from excel");
		SoftAssert softAssert = new SoftAssert();
		int rowNum = 1;
		// int totalRows = r.getNoOfRowInSheet();
		for (int j = 0; j < 25; j++) {
			String data = ansOnPortal.get(j).getText().toString();
			System.out.println(data);
			//r.setCellData(data, rowNum, 3, excelPath);
			rowNum++;
		}
	}
}