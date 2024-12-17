package pom.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class SortableDemo extends BasePage{

	public SortableDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToSortable() {
		try {
			test.log(Status.INFO, "Opening Browser");
			driver.navigate().to(ConstantsConfig.SortableURL);
			driver.manage().window().maximize();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Sortable() {
		try {
			test.log(Status.INFO, "Opening Browser");
			Thread.sleep(2000);
			List<WebElement> items =  driver.findElements(ConstantsConfig.List);
			if (items.size() > 1) {
			Actions actions = new Actions(driver);
			WebElement firstItem = items.get(0);
            WebElement lastItem = items.get(items.size() - 1);
			actions.clickAndHold(firstItem).moveToElement(lastItem).release().build().perform();
			Thread.sleep(2000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
