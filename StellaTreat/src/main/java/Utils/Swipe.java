package Utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import javax.swing.text.Element;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import Resources.AppDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Swipe {

	public static void check() throws InterruptedException {
		for (int i = 0; i <= 5; i++) {

			Dimension size = AppDriver.getDriver().manage().window().getSize();
			System.out.println(size.height + "height");
			System.out.println(size.width + "width");
			System.out.println(size);
			int startPoint = (int) (size.width * 0.99);
			int endPoint = (int) (size.width * 0.15);
			int ScreenPlace = (int) (size.height * 0.40);
			int y = (int) size.height * 20;
			System.out.println("startpoint is" + startPoint);
			System.out.println(endPoint);
			System.out.println(ScreenPlace);

			TouchAction ts = new TouchAction((PerformsTouchActions) AppDriver.getDriver());

			ts.press(PointOption.point(startPoint, ScreenPlace))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
					.moveTo(PointOption.point(endPoint, ScreenPlace)).release().perform();
			System.out.println("Swiped");
		}

	}

	public static void Rightswipe() throws InterruptedException {
		for (int i = 0; i <= 25; i++) {
			Dimension size = AppDriver.getDriver().manage().window().getSize();
			int startY = (int) (size.height / 2);
			int startX = (int) (size.width * 0.90);
			int endX = (int) (size.width * 0.05);
			new TouchAction((PerformsTouchActions) AppDriver.getDriver()).press(PointOption.point(startX, startY))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
					.moveTo(PointOption.point(endX, startY)).release().perform();

			System.out.println(" Swiped and I value is" + i);

			List<WebElement> element = AppDriver.getDriver().findElements(By.className("android.widget.TextView"));
			// System.out.println(element.size());
			for (int j = 0; j < element.size(); j++) {
				if (element.get(j).getText() != null) {
					String SeenText = element.get(j).getText();
					System.out.println(SeenText);

					

				}

			}

		}
	}
	public static void Lefttswipe()
	{
		Dimension size = AppDriver.getDriver().manage().window().getSize();
		int startY = (int) (size.height / 2);
        int startX = (int) (size.width * 0.05);
        int endX = (int) (size.width * 0.90);
        new TouchAction((PerformsTouchActions) AppDriver.getDriver())
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(endX, startY))
                .release().perform();	

	}
	
	
	
	}