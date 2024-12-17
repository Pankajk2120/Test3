package pom.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class ModalDialogsDemo extends BasePage  {
	
	public ModalDialogsDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToModalDialogs() {
		try {
			test.log(Status.INFO, "Opening Browser");
			driver.navigate().to(ConstantsConfig.ModalDialogs);
			driver.manage().window().maximize();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void SmallModel() {
		try {
			test.log(Status.INFO, "Clicking on Small Model");
			driver.findElement(ConstantsConfig.SmallModal).click();
			Thread.sleep(1000);
			WebElement SmallModalText = driver.findElement(ConstantsConfig.SmallModalText);
			System.out.println("SmallModalText : "+SmallModalText.getText());
			test.log(Status.INFO, "SmallModalText : "+SmallModalText.getText());
			Thread.sleep(1000);
			driver.findElement(ConstantsConfig.SmallModalCloseBtn).click();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void LargeModel() {
		try {
			test.log(Status.INFO, "Clicking on Small Model");
			driver.findElement(ConstantsConfig.LargeModal).click();
			Thread.sleep(1000);
			WebElement LargeModalText = driver.findElement(ConstantsConfig.LargeModalText);
			System.out.println("LargeModalText : "+LargeModalText.getText());
			test.log(Status.INFO, "LargeModalText : "+LargeModalText.getText());
			Thread.sleep(1000);
			driver.findElement(ConstantsConfig.LargeModalCloseBtn).click();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

