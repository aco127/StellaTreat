package Utils;

import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ImageLoading {
WebDriver driver;

public ImageLoading(WebDriver driver) {
	 this.driver = driver; PageFactory.initElements(driver, this);
		}

	public void checkimage(WebElement image) throws InterruptedException
	{
		Boolean pc5 = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", image);
		Thread.sleep(2000);
	      if (pc5) {
	         System.out.println("Image present");
	      } else {
	         System.out.println("Image not present");
	      }
	}

	
	/*public void checkallimages(WebElement image,int imgsize) throws InterruptedException
	{
		for(int i=0;i<imgsize;i++)
		{
			
	//	Boolean pc5 = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0",imgsize.get(i));
		Thread.sleep(2000);
	      if (pc5) {
	         System.out.println("Image present");
	      } else {
	         System.out.println("Image not present");
	      }
	}
	*/
}

