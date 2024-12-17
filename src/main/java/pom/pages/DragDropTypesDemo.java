package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class DragDropTypesDemo  extends BasePage{

	public DragDropTypesDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToDragAndDropPage1() {
		try {
			test.log(Status.INFO, "Redirecting DragDropTypesDemoto the Checkboxes");
			driver.get(ConstantsConfig.DragabbleURL);
			driver.manage().window().maximize();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void SimpleDragDrop() {
		try {
			test.log(Status.INFO, "Redirecting to the Checkboxes");
			WebElement Dragabble = driver.findElement(ConstantsConfig.Draggables);
			
			Actions actions = new Actions(driver);
			actions.dragAndDropBy(Dragabble, 50, 50).perform();;
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void AxisRestricted() {
		try {
			test.log(Status.INFO, "Redirecting to the Checkboxes");
			
			WebElement DragX = driver.findElement(ConstantsConfig.DragX);
			WebElement DragY = driver.findElement(ConstantsConfig.DragY);
			Actions actions = new Actions(driver);
			actions.dragAndDropBy(DragX, 500, 0);
			actions.dragAndDropBy(DragX, 0, 500);
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
