package PageObjects;

import java.io.File
;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class Careportal_DataCheck {

	WebDriver driver;

	public Careportal_DataCheck(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}

@FindBy(xpath="//td[contains(@class,'column-TotalSleep')]")
WebElement sleepdata;

@FindBy(xpath="//td[contains(@class,'mat-column-Mood')]")
WebElement Mooddata;

@FindAll(@FindBy(xpath="//h3[normalize-space()='Sleep Data']"))
List<WebElement> gosleep;

@FindAll(@FindBy(xpath="//h3[normalize-space()='Mood Data']"))
List<WebElement> gomood;

@FindBy(xpath = "//span[normalize-space()='Week - 1     Day - 1']")
WebElement week1day1;

@FindAll(@FindBy(xpath="//h3[normalize-space()='Daily Activity']"))
List<WebElement> dailyact;

@FindBy(xpath="//td[normalize-space()='Getting dressed']")
WebElement gettingdress;

@FindBy(xpath="//td[contains(text(),' Yoga')]")
WebElement yoga;

@FindBy(xpath="//td[normalize-space()='Walk']")
WebElement walk;

@FindBy(xpath="//td[normalize-space()='Movies & tv']")
WebElement movietv;

@FindBy(xpath="//td[normalize-space()='Showering/Bathing']")
WebElement showeringbathing;

@FindBy(xpath="//td[normalize-space()='Daydream']")
WebElement Daydream;

public String writesleepdata() throws InterruptedException
{ 
	Thread.sleep(3000);
	JavascriptExecutor je = (JavascriptExecutor) driver;
	String sleep ="";
	for (WebElement el : gosleep) 
	{
		je.executeScript("arguments[0].scrollIntoView(true);", el);
		sleep=sleepdata.getText();
		
		System.out.println(sleep);
	
	}
	
	return sleep;
	
}
public String writemooddata() throws InterruptedException
{
	Thread.sleep(3000);
	JavascriptExecutor je = (JavascriptExecutor) driver;
	String mood="";
	for (WebElement el : gomood) 
	{
		je.executeScript("arguments[0].scrollIntoView(true);", el);
	mood= Mooddata.getText();
	System.out.println(mood);
	
	//PointExcel.writetosheet(mood, 2, "Sheet1");	
}
	return mood;

}

public String yogadailyactivity() throws InterruptedException
{

	Thread.sleep(5000);
	JavascriptExecutor je = (JavascriptExecutor) driver; 
	String yogaa="";
	for (WebElement el : dailyact) 
	{
		je.executeScript("arguments[0].scrollIntoView(true);", el);
		 yogaa=	yoga.getText();
}
	return yogaa;

}

public String walkdailyactivity() throws InterruptedException
{

	Thread.sleep(3000);
	JavascriptExecutor je = (JavascriptExecutor) driver; 
	String walktext="";
	for (WebElement el : dailyact) 
	{
		je.executeScript("arguments[0].scrollIntoView(true);", el);
		 walktext=	walk.getText();
}
	return walktext;

}

public String movietvdailyactivity() throws InterruptedException
{

	Thread.sleep(3000);
	JavascriptExecutor je = (JavascriptExecutor) driver; 
	String movietvtext="";
	for (WebElement el : dailyact) 
	{
		je.executeScript("arguments[0].scrollIntoView(true);", el);
		 movietvtext=	movietv.getText();
}
	return movietvtext;

}

public String showeringbathingdailyact() throws InterruptedException
{

	Thread.sleep(3000);
	JavascriptExecutor je = (JavascriptExecutor) driver; 
	String showeringbathingtext="";
	for (WebElement el : dailyact) 
	{
		je.executeScript("arguments[0].scrollIntoView(true);", el);
		showeringbathingtext=	showeringbathing.getText();
}
	return showeringbathingtext;

}

public String daydreamdailyactivity() throws InterruptedException
{

	Thread.sleep(3000);
	JavascriptExecutor je = (JavascriptExecutor) driver; 
	String daydreamtext="";
	for (WebElement el : dailyact) 
	{
		je.executeScript("arguments[0].scrollIntoView(true);", el);
		daydreamtext=	Daydream.getText();
}
	return daydreamtext;

}

public String gettingdressdailyactivity() throws InterruptedException
{

	Thread.sleep(3000);
	JavascriptExecutor je = (JavascriptExecutor) driver; 
	String gettingdresstext="";
	for (WebElement el : dailyact) 
	{
		je.executeScript("arguments[0].scrollIntoView(true);", el);
		gettingdresstext=	gettingdress.getText();
}
	return gettingdresstext;

}

/*public void compareData(String excelPath, String sheetName, int rowNum, int columnNum, String expData, int resultRowNum, int resultColNum) throws Exception {
	
	ReadExcel r = new ReadExcel();
	r.setExcelFile(excelPath, sheetName);
	String excelData=	r.getCellData(rowNum, columnNum);
	System.out.println("Expected  data: "+expData+ " excel data "+excelData);

	if(expData.equalsIgnoreCase(excelData)) {
		ReadExcel.setCellData("PASS",resultRowNum, resultColNum, excelPath);
	}else {
		ReadExcel.setCellData("FAIL", resultRowNum, resultColNum, excelPath);
	}*/
}

//}