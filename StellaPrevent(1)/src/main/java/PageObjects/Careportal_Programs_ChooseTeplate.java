package PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Careportal_Programs_ChooseTeplate {

	WebDriver driver;

	public Careportal_Programs_ChooseTeplate(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='menu-sidebar' and text()='Program']")
	WebElement program;

	@FindBy(xpath = "//td[contains(text(),'Postpartum Depression')]//following::td/img[@title='Assign Patient']")
	List<WebElement> PPTassign;

	@FindBy(xpath = "//input[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored']")
	WebElement SearchOption;

	@FindBy(xpath = "//div/h3/span[contains(text(),'+')]")
	List<WebElement> Assementplusicon;

	@FindBy(xpath = "//input[@ng-reflect-placeholder='Search']")
	WebElement search;
	@FindBy(xpath = "(//img[@title=' Add Contents'])[2]")
	WebElement content;
	@FindBy(xpath = "//mat-icon[text()='edit']")
	List<WebElement> edit;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement choose;
	@FindBy(xpath = "//div[@class='template-item']")
	List<WebElement> template;
	@FindBy(xpath = "//span[text()='Select Template For Card']")
	WebElement select_Template;
	@FindBy(xpath = "//input[@formcontrolname='card_title']")
	WebElement title;
	@FindBy(xpath = "//input[@formcontrolname='card_time']")
	WebElement time;
	@FindBy(xpath = "//input[@formcontrolname='card_number']")
	WebElement number;
	@FindBy(xpath = "//span[@style='cursor: pointer;']")//span[@style='cursor: pointer;']
	List<WebElement> plus_Icon;
	@FindBy(xpath = "//span[@style='cursor: pointer']")
	List<WebElement> AssesmentPlusIcon;

	@FindBy(xpath = "//br[@data-mce-bogus='1']")
	WebElement text;
	
	
	@FindBy(xpath="//p[contains(text(),'Assessment header..')]")List<WebElement> AssesmentHeader;
	@FindBy(xpath="//input[@placeholder='Assessment desription']")WebElement desription;
	@FindBy(xpath="//input[@placeholder='Assessment desription']")List<WebElement> desription1;
	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	List<WebElement> upload;
	@FindBy(xpath = "//div[@class='mat-checkbox-inner-container']")
	WebElement checkbox;
	@FindBy(xpath = "//div[@class='mat-checkbox-inner-container']")
	List<WebElement> checkbox1;
	@FindBy(xpath = "//span[contains(text(),' Cancel ')]")
	WebElement cancel;
	@FindBy(xpath = "//input[@class='form-control ng-pristine ng-valid ng-touched']")
	WebElement label;

	@FindAll(@FindBy(xpath = "//span[@class='mat-checkbox-label']"))
	List<WebElement> checkboxlikecomment;
	@FindBy(xpath = "//span[text()='Save']")
	WebElement save;
	@FindBy(xpath = "//input[@formcontrolname='contentHeaderOne']")
	WebElement firstassessment;
	@FindBy(xpath = "//input[@formcontrolname='contentHeaderTwo']")
	WebElement secondassessment;
	@FindBy(xpath = "//input[@formcontrolname='feedback_message']")
	WebElement feedbackmsg;
	@FindBy(xpath = "//select[@formcontrolname='onSubmitCondition']")
	WebElement submitcond;

	@FindBy(xpath = "//body[@id='tinymce']")
	List<WebElement> Feedback;

	@FindBy(xpath = "//input[@type='text']")
	List<WebElement> InputPlaceholder;
	@FindBy(xpath = "//option[@value='0: Atleast 1  is Yes']")
	WebElement Option1;
	@FindBy(xpath = "//h3[contains(text(),'Feedback Message')]")
	WebElement msg;

	@FindBy(xpath="//input[@formcontrolname='content']")
	WebElement Content;
	@FindBy(xpath="//span[@style='cursor: pointer']")List<WebElement> PlusIcon;
	
	@FindBy(xpath="//select[@formcontrolname='cloneWeek']")
	WebElement WeekDropDown;
	public void SeletProgram() throws InterruptedException, AWTException {
		program.click();
		search.sendKeys("testing");
		content.click();
		edit.get(0).click();
	}

	public void ChooseTemmplate1() throws InterruptedException, AWTException {

		choose.click();
		template.get(1).click();
		select_Template.click();
		title.sendKeys("Template 1");
		time.sendKeys("1 min");
		number.sendKeys("1");
		plus_Icon.get(1).click();
		Thread.sleep(3000);
		// driver.switchTo().defaultContent();
//	     WebElement id = driver.findElement(By.xpath("//iframe[@id='tiny-angular_57046037031652875379601_ifr']"));
//	     driver.switchTo().frame(id);
		driver.switchTo().frame(0);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();
		upload.get(1).click();
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\05122103\\Documents\\Logo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		plus_Icon.get(3).click();
		driver.switchTo().frame(1);
		text.sendKeys(
				"Please complete the following assessment. This assessment helps you and your healthcare provider to understand how you’re progressing in your motherhood journey. We will ask you again to fill this assessment in module 5 of MamaLift, so that we can keep track of your progress over the program. There are no right or wrong answers, we just want to know how have you been feeling in the last days.");
		;
		driver.switchTo().defaultContent();
		checkbox.click();
	//	cancel.click();
		save.click();
	}

	public void ChooseTemmplate2() throws InterruptedException, AWTException {

		choose.click();
		template.get(3).click();
		Thread.sleep(3000);
		select_Template.click();
		title.sendKeys("What is be a Mom?");
		time.sendKeys("1 min");
		number.sendKeys("1");
		plus_Icon.get(1).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();
		upload.get(0).click();
		Robot rb1 = new Robot();
		rb1.delay(2000);
		StringSelection ss1 = new StringSelection("C:\\Users\\05122103\\Documents\\Logo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		rb1.keyPress(KeyEvent.VK_CONTROL);
		rb1.keyPress(KeyEvent.VK_V);

		rb1.keyRelease(KeyEvent.VK_CONTROL);
		rb1.keyRelease(KeyEvent.VK_V);

		rb1.keyPress(KeyEvent.VK_ENTER);
		rb1.keyRelease(KeyEvent.VK_ENTER);
		plus_Icon.get(3).click();
		driver.switchTo().frame(1);
		text.sendKeys("Want to know we're going to talk about in th forst module?");
		Thread.sleep(3000);

		upload.get(1).click();
		rb1.delay(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		rb1.keyPress(KeyEvent.VK_CONTROL);
		rb1.keyPress(KeyEvent.VK_V);

		rb1.keyRelease(KeyEvent.VK_CONTROL);
		rb1.keyRelease(KeyEvent.VK_V);

		rb1.keyPress(KeyEvent.VK_ENTER);
		rb1.keyRelease(KeyEvent.VK_ENTER);

		upload.get(2).click();
		rb1.delay(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		rb1.keyPress(KeyEvent.VK_CONTROL);
		rb1.keyPress(KeyEvent.VK_V);

		rb1.keyRelease(KeyEvent.VK_CONTROL);
		rb1.keyRelease(KeyEvent.VK_V);

		rb1.keyPress(KeyEvent.VK_ENTER);
		rb1.keyRelease(KeyEvent.VK_ENTER);

		upload.get(3).click();
		rb1.delay(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		rb1.keyPress(KeyEvent.VK_CONTROL);
		rb1.keyPress(KeyEvent.VK_V);

		rb1.keyRelease(KeyEvent.VK_CONTROL);
		rb1.keyRelease(KeyEvent.VK_V);

		rb1.keyPress(KeyEvent.VK_ENTER);
		rb1.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		InputPlaceholder.get(3).sendKeys(
				"In addition to me , three mothers will share their experience with you on the different topics covered.");

	}

	public void ChooseTemmplate3() throws InterruptedException, AWTException {

		choose.click();
		template.get(5).click();
		Thread.sleep(3000);
		select_Template.click();
		title.sendKeys("Be a good mom");
		time.sendKeys("1 min");
		number.sendKeys("1");
		plus_Icon.get(1).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		text.sendKeys("Overall, I am satisfied with the help I received");

		driver.switchTo().defaultContent();
		checkbox.click();
		cancel.click();

	}

	public void ChooseTemmplate4() throws InterruptedException, AWTException {

		choose.click();
		template.get(7).click();
		select_Template.click();
		title.sendKeys("What is be a Mom?");
		time.sendKeys("1 min");
		number.sendKeys("1");
		plus_Icon.get(1).click();
		Thread.sleep(3000);
		// driver.switchTo().defaultContent();
//	     WebElement id = driver.findElement(By.xpath("//iframe[@id='tiny-angular_57046037031652875379601_ifr']"));
//	     driver.switchTo().frame(id)

		driver.switchTo().frame(0);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();
		upload.get(0).click();
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\05122103\\Documents\\Logo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		upload.get(1).click();
		rb.delay(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		upload.get(2).click();
		rb.delay(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		upload.get(3).click();
		rb.delay(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		driver.switchTo().defaultContent();
		checkbox.click();
		cancel.click();
	}

	public void ChooseTemmplate5() throws InterruptedException, AWTException {

		choose.click();
		template.get(9).click();
		select_Template.click();
		title.sendKeys("Expectations and reality");
		time.sendKeys("1 min");
		number.sendKeys("1");
		plus_Icon.get(0).click();
		Thread.sleep(3000);
		// driver.switchTo().defaultContent();
//	     WebElement id = driver.findElement(By.xpath("//iframe[@id='tiny-angular_57046037031652875379601_ifr']"));
//	     driver.switchTo().frame(id)

		driver.switchTo().frame(0);
		text.sendKeys("After the birth of your baby, how has the changes in the following areas of your life felt?");
		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		text.sendKeys(
				"The gray box correspond to the different areas of your life where you may have felt changes. Click on earth gray box and drag it to the colored box that best describe the changes you felt after your baby was born. At the end, click SAVE.\r\n");
		driver.switchTo().defaultContent();

		driver.switchTo().frame(2);
		text.sendKeys("Nothing has changed");
		driver.switchTo().defaultContent();

		driver.switchTo().frame(3);
		text.sendKeys("The changes have been more difficult than I thought");
		driver.switchTo().defaultContent();

		driver.switchTo().frame(4);
		text.sendKeys("Changes have been easier than I thought");
		driver.switchTo().defaultContent();

		driver.switchTo().frame(5);
		text.sendKeys("It changed exactly as I thought");
		driver.switchTo().defaultContent();

		Assementplusicon.get(2).click();
		InputPlaceholder.get(3).sendKeys("Leisure/Hobbies");

		Assementplusicon.get(2).click();
		InputPlaceholder.get(4).sendKeys("My professional life");

		Assementplusicon.get(2).click();
		InputPlaceholder.get(5).sendKeys("Relationship with my friends");

		Assementplusicon.get(2).click();
		InputPlaceholder.get(6).sendKeys("My body");

		Assementplusicon.get(2).click();
		InputPlaceholder.get(7).sendKeys("My energy / My health");

		Assementplusicon.get(2).click();
		InputPlaceholder.get(8).sendKeys("Relationship with my partner");

		Assementplusicon.get(2).click();
		InputPlaceholder.get(9).sendKeys("Houskeeping Division");

		Assementplusicon.get(2).click();
		InputPlaceholder.get(10).sendKeys("Time for me");

		Assementplusicon.get(2).click();
		InputPlaceholder.get(11).sendKeys("Relationship with my family");

		Assementplusicon.get(2).click();
		InputPlaceholder.get(12).sendKeys("Family finances");

		driver.switchTo().frame(6);
		text.sendKeys("feedback");
		driver.switchTo().defaultContent();

		upload.get(0).click();
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\05122103\\Documents\\Logo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		driver.switchTo().defaultContent();
		checkbox.click();
		cancel.click();
	}

	public void ChooseTemmplate6() throws InterruptedException, AWTException {

		choose.click();
		template.get(10).click();
		Thread.sleep(4000);
		select_Template.click();
		Thread.sleep(500);
		title.sendKeys("Its TEMPLATE 8");
		number.sendKeys("10");
		time.sendKeys("2 min");
		Thread.sleep(3000);
		plus_Icon.get(0).click();
		// driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		text.sendKeys("Overall, I am satisfied with the help I received");

		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();

		checkboxlikecomment.get(0).click();

		firstassessment.sendKeys("Test First Assessment");
		secondassessment.sendKeys("Test Second Assessment");
		plus_Icon.get(2).click();
		// driver.switchTo().frame(0);
		driver.switchTo().frame(2);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(3);
		feedbackmsg.sendKeys("Testing FeedBack");
		driver.switchTo().defaultContent();
		// save.click();
		cancel.click();

	}

	public void ChooseTemmplate7() throws InterruptedException, AWTException {

		choose.click();
		template.get(13).click();
		select_Template.click();
		title.sendKeys("What is be a Mom?");
		time.sendKeys("1 min");
		number.sendKeys("1");
		plus_Icon.get(1).click();
		driver.switchTo().frame(0);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();
		plus_Icon.get(3).click();
		driver.switchTo().frame(1);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();

		plus_Icon.get(5).click();
		driver.switchTo().frame(2);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();

		upload.get(0).click();
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\05122103\\Documents\\Logo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		upload.get(1).click();
		rb.delay(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().defaultContent();
		checkbox.click();
		cancel.click();

	}

	public void ChooseTemmplate8() throws InterruptedException, AWTException {

		choose.click();
		template.get(13).click();
		select_Template.click();
		title.sendKeys("What is be a Mom?");
		time.sendKeys("1 min");
		number.sendKeys("1");
		plus_Icon.get(1).click();
		driver.switchTo().frame(0);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();
		plus_Icon.get(3).click();
		driver.switchTo().frame(1);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();

		plus_Icon.get(5).click();
		driver.switchTo().frame(2);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();

		upload.get(0).click();
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\05122103\\Documents\\Logo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		driver.switchTo().defaultContent();
		checkbox.click();
		cancel.click();

	}

	public void ChooseTemmplate9() throws InterruptedException, AWTException {

		choose.click();
		template.get(16).click();
		Thread.sleep(4000);
		select_Template.click();
		Thread.sleep(500);
		title.sendKeys("Expectations and reality");
		number.sendKeys("10");
		time.sendKeys("1 min");
		Thread.sleep(3000);
		plus_Icon.get(0).click();
		// driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		text.sendKeys("After the birth of your baby, how has the changes in the following areas of your life felt?");
		driver.switchTo().defaultContent();

		upload.get(0).click();
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\05122103\\Documents\\Logo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		driver.switchTo().frame(1);
		text.sendKeys(
				"Write in that textbox a good experience you had with your baby this day (a smile, a fixed look on your face) and click save a good experience. you can view the experiences stored in your piggy bank in the experiences and reading section.");
		driver.switchTo().defaultContent();

		Thread.sleep(1000);

		InputPlaceholder.get(3).sendKeys(" Assessment");
		Thread.sleep(1000);

		driver.switchTo().frame(2);
		// Feedback.get(1).sendKeys("Text");
		text.sendKeys("Text");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		InputPlaceholder.get(4).sendKeys("End of the Assessment");

		checkboxlikecomment.get(0).click();

		cancel.click();

	}

	public void ChooseTemmplate10() throws InterruptedException, AWTException {

		choose.click();
		template.get(17).click();
		select_Template.click();
		title.sendKeys("What is be a Mom?");
		time.sendKeys("1 min");
		number.sendKeys("1");
		plus_Icon.get(1).click();
		driver.switchTo().frame(0);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();

		upload.get(0).click();
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\05122103\\Documents\\Logo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		driver.switchTo().defaultContent();
		checkbox.click();
		cancel.click();

	}

	public void ChooseTemmplate11() throws InterruptedException, AWTException {

		choose.click();
		template.get(18).click();
		Thread.sleep(4000);
		select_Template.click();
		Thread.sleep(500);
		title.sendKeys("Myths about motherhood");
		number.sendKeys("11");
		time.sendKeys("1 min");
		Thread.sleep(3000);
		plus_Icon.get(0).click();
		// driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		text.sendKeys("Have I let bi self be influenced by the \"perfect mother\" myths?");
		driver.switchTo().defaultContent();

		upload.get(0).click();
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\05122103\\Documents\\Logo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		driver.switchTo().frame(1);
		text.sendKeys(
				"After reading each question, click on one of the two icons on the right. If your answer is yes click on . If your answer is no click on . At the end, click SAVE");
		driver.switchTo().defaultContent();

		Thread.sleep(1000);

		AssesmentPlusIcon.get(1).click();
		driver.switchTo().frame(2);
		text.sendKeys(
				"Did you ever feel that any of these messages were being transmitted to you (for example, by family, friends, the media)?");
		driver.switchTo().defaultContent();

		AssesmentPlusIcon.get(1).click();
		driver.switchTo().frame(3);
		text.sendKeys(
				"Did these messages influence the way you imagined this phase of your life would be, with your child (your expectations)?");
		driver.switchTo().defaultContent();

		AssesmentPlusIcon.get(1).click();
		driver.switchTo().frame(4);
		text.sendKeys(
				"Did these messages influence the way you imagined this phase of your life would be, with your child (your expectations)?");
		driver.switchTo().defaultContent();

		plus_Icon.get(2).click();
		// driver.switchTo().frame(0);
		driver.switchTo().frame(5);
		text.sendKeys("After the birth of your baby, how has the changes in the following areas of your life felt?");
		driver.switchTo().defaultContent();

		 submitcond.click();
			Option1.click();
			// Option1.sendKeys(Keys.TAB);
			Actions action = new Actions(driver);
			action.sendKeys(Keys.TAB).build().perform();

			/*
			 * driver.switchTo().defaultContent(); driver.switchTo().frame(6); text.clear();
			 * text.sendKeys("Text"); driver.switchTo().defaultContent();
			 * Thread.sleep(1000);
			 */
		 
		 
			
		checkboxlikecomment.get(0).click();

		// cancel.click();
		save.click();

	}

	public void ChooseTemmplate12() throws InterruptedException, AWTException {

		choose.click();
		template.get(19).click();
		select_Template.click();
		title.sendKeys("What is be a Mom?");
		time.sendKeys("1 min");
		number.sendKeys("1");
		plus_Icon.get(1).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();

		plus_Icon.get(3).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();
		plus_Icon.get(5).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();
		upload.get(0).click();
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\05122103\\Documents\\Logo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		driver.switchTo().defaultContent();
		checkbox.click();
		cancel.click();

	}

	public void ChooseTemmplate14() throws InterruptedException, AWTException {

		choose.click();
		template.get(21).click();
		select_Template.click();
		title.sendKeys("What is be a Mom?");
		time.sendKeys("1 min");
		number.sendKeys("1");
		plus_Icon.get(1).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();

		plus_Icon.get(3).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();
		plus_Icon.get(5).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();
		plus_Icon.get(7).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
		text.sendKeys("Overall, I am satisfied with the help I received");
		driver.switchTo().defaultContent();
		upload.get(0).click();
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\05122103\\Documents\\Logo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		upload.get(1).click();
		rb.delay(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		upload.get(2).click();
		rb.delay(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		upload.get(3).click();
		rb.delay(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		driver.switchTo().defaultContent();
		checkbox.click();
		cancel.click();

	}

	
	
	public void ChooseTemmplate17() throws InterruptedException, AWTException {

		choose.click();
		template.get(24).click();
		select_Template.click();
		title.sendKeys("Helpful thoughts vs. negative thoughts");
		time.sendKeys("1 min");
		number.sendKeys("1");
		
		upload.get(0).click();
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\05122103\\Documents\\Logo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		plus_Icon.get(0).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		text.sendKeys(" important to note your thoughts ");
		driver.switchTo().defaultContent();
		upload.get(1).click();
		rb.delay(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		driver.switchTo().frame(1);
		text.sendKeys("It is important to note your thoughts in different situations and, for that, you can record them in a diary: the Diary of Thoughts.");
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame(2);
		text.sendKeys("Situation");
		driver.switchTo().defaultContent();
		
		desription.sendKeys("Where were you?");
		driver.switchTo().defaultContent();
		
		
		Thread.sleep(1000);
		driver.switchTo().activeElement();
		PlusIcon.get(1).click();
	//	PlusIcon.get(1).click();
		//PlusIcon.get(1).click();
		
		driver.switchTo().frame(3);
		//AssesmentHeader.get(0).clear();
		AssesmentHeader.get(0).sendKeys("Emotions");
		driver.switchTo().defaultContent();
		
		desription1.get(0).sendKeys("Sadness");
		driver.switchTo().defaultContent();
		
		
		/*
		 * driver.switchTo().frame(5); //AssesmentHeader.get(1).clear();
		 * AssesmentHeader.get(0).sendKeys("Thoughts");
		 * driver.switchTo().defaultContent();
		 * 
		 * desription1.get(0).sendKeys("What is in your mind");
		 * driver.switchTo().defaultContent();
		 * 
		 * 
		 * 
		 * driver.switchTo().frame(7); //AssesmentHeader.get(2).clear();
		 * AssesmentHeader.get(2).sendKeys("Behaviors");
		 * driver.switchTo().defaultContent();
		 * 
		 * desription1.get(0).sendKeys("Good Or Bad");
		 * driver.switchTo().defaultContent();
		 * 
		 */
		
		/*
		 * driver.switchTo().frame(5); text.sendKeys("Save");
		 */
		driver.switchTo().defaultContent();
		
		
			
	

		checkbox.click();
		cancel.click();

	}

	public void ChooseTemmplate20() throws InterruptedException, AWTException {

		choose.click();
		template.get(27).click();
		select_Template.click();
		title.sendKeys("Tracker");
		time.sendKeys("1 min");
		number.sendKeys("1");
		
		upload.get(0).click();
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\05122103\\Documents\\Logo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		plus_Icon.get(1).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		text.sendKeys("Fill Tracker");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		checkbox1.get(0).click();
		checkbox1.get(1).click();
		checkbox1.get(2).click();
		
		
		plus_Icon.get(3).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(1000);
		text.sendKeys("Fill Tracker");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		
		
		//driver.switchTo().defaultContent();
		
		
			
	

		checkbox1.get(3).click();
		cancel.click();

	}
	public void ChooseTemmplate21() throws InterruptedException, AWTException {

		choose.click();
		template.get(28).click();
		select_Template.click();
		title.sendKeys("Temmplate21");
		time.sendKeys("1 min");
		number.sendKeys("1");
		
		upload.get(0).click();
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\05122103\\Documents\\Logo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		plus_Icon.get(0).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		text.sendKeys("Fill Tracker");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		Thread.sleep(1000);
		text.sendKeys("Assessment Description");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		AssesmentPlusIcon.get(1).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		Thread.sleep(1000);
		text.sendKeys("Fill Tracker");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		
		
		//driver.switchTo().defaultContent();
		plus_Icon.get(2).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
		Thread.sleep(1000);
		text.sendKeys("Fill Tracker");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
			
		driver.switchTo().defaultContent();
		driver.switchTo().frame(4);
		Thread.sleep(1000);
		text.sendKeys("Feedback");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();

		checkbox1.get(3).click();
		cancel.click();

	}	
	public void ChooseTemmplate23() throws InterruptedException, AWTException {

		choose.click();
		template.get(30).click();
		select_Template.click();
		title.sendKeys("card 23");
		time.sendKeys("1 min");
		number.sendKeys("1");
		
		upload.get(0).click();
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\05122103\\Documents\\Logo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		plus_Icon.get(1).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		text.sendKeys("content");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		
		upload.get(1).click();
		rb.delay(2000);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		driver.switchTo().frame(1);
		Thread.sleep(1000);
		text.sendKeys("new line1");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		upload.get(2).click();
		rb.delay(2000);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		driver.switchTo().frame(2);
		Thread.sleep(1000);
		text.sendKeys("new line2");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		upload.get(3).click();
		rb.delay(2000);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		driver.switchTo().frame(3);
		Thread.sleep(1000);
		text.sendKeys("new line3");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		upload.get(4).click();
		rb.delay(2000);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		driver.switchTo().frame(4);
		Thread.sleep(1000);
		text.sendKeys("new line4");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		
		plus_Icon.get(3).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(5);
		Thread.sleep(1000);
		text.sendKeys("content");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		//driver.switchTo().defaultContent();
		
		
			
	

		//checkbox1.get(3).click();
		cancel.click();

	}
	public void ChooseTemmplate30() throws InterruptedException, AWTException {

		choose.click();
		template.get(37).click();
		select_Template.click();
		title.sendKeys("card 30");
		time.sendKeys("1 min");
		number.sendKeys("1");
		
		plus_Icon.get(0).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		text.sendKeys("content");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		upload.get(0).click();
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\05122103\\Documents\\Logo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	
		driver.switchTo().frame(1);
		Thread.sleep(1000);
		text.sendKeys("new line4");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		AssesmentPlusIcon.get(1).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		Thread.sleep(1000);
		WebElement header=driver.findElement(By.xpath("//p[contains(text(),'Assessment header..')]"));
		header.clear();
		header.sendKeys("Assesment Headers");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		desription.clear();
		desription.sendKeys("Assessment description...");
		
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
		Thread.sleep(1000);
		text.sendKeys("content");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		//checkbox1.get(3).click();
		
		Assementplusicon.get(2).click();
		driver.switchTo().defaultContent();
	//	driver.switchTo().frame(5);
		Thread.sleep(1000);
		Content.sendKeys("content 0");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(7);
		Thread.sleep(1000);
		text.sendKeys("Assesment Heading");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(8);
		Thread.sleep(1000);
		text.sendKeys("Content Box");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(9);
		Thread.sleep(1000);
		text.sendKeys("Feedback Msg");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		checkbox.click();
		WeekDropDown.click();
		
		cancel.click();

	}

}