package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class DragDropDemo extends BasePage{

	public DragDropDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToDragAndDropPage() {
		try {
			test.log(Status.INFO, "Redirecting to the Checkboxes");
			driver.get(ConstantsConfig.DragDropURL);
			driver.manage().window().maximize();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void DragAndDrop() {
		try {
			test.log(Status.INFO, "Redirecting to the Checkboxes");
			WebElement source = driver.findElement(ConstantsConfig.Draggable);
	        WebElement target = driver.findElement(ConstantsConfig.Droppable);
	        Actions actions = new Actions(driver);
	        //actions.dragAndDrop(source, target).perform();
	        actions.clickAndHold(source).moveToElement(target).release().build().perform();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
