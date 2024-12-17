package pom.pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class LinksDemo extends BasePage   {

	public LinksDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToLinksPage() {
		try {
			test.log(Status.INFO, "Redirecting to the Links");
			driver.findElement(ConstantsConfig.LinksPage).click();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
