package pom.pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class ResizeableDemo extends BasePage {

	public ResizeableDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToResize() {
		try {
			test.log(Status.INFO, "Redirecting to the Checkboxes");
			driver.navigate().to(ConstantsConfig.ResizeableURL);
			driver.manage().window().maximize();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Resizeable() {
		try {
			test.log(Status.INFO, "Redirecting to the Resize");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
