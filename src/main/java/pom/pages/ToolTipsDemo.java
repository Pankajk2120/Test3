package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class ToolTipsDemo extends BasePage {
	
	public ToolTipsDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToToolTips() {
		try {
			test.log(Status.INFO, "Opening Browser");
			driver.navigate().to(ConstantsConfig.ToolTipsURL);
			driver.manage().window().maximize();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void TooltiponRight() {
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(ConstantsConfig.TooltiponRight)).perform();
			 WebDriverWait wait = new WebDriverWait(driver, 10);
		     WebElement tooltipElement = wait.until(ExpectedConditions.presenceOfElementLocated(ConstantsConfig.TooltiponRight));
		     String tooltipText = tooltipElement.getText();
		     System.out.println("Tooltip text: " + tooltipText);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
