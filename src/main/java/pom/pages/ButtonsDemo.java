package pom.pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class ButtonsDemo  extends BasePage {

	public ButtonsDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToButtons() {
		try {
			test.log(Status.INFO, "Redirecting to the Buttons");
			driver.findElement(ConstantsConfig.ButtonsPage).click();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Click() {
		try {
			test.log(Status.INFO, "Clicking on The Button");
			driver.findElement(ConstantsConfig.Click).click();
			String Click_ExpectedWelcomeMessage = "You have done a dynamic click";
			String Click_ActualWelcomeMessage = driver.findElement(ConstantsConfig.ClickMessage).getText();
			if(Click_ExpectedWelcomeMessage.equals(Click_ActualWelcomeMessage)) {
				 test.log(Status.PASS, "The expected welcome message is displayed: " + Click_ActualWelcomeMessage);
				 System.out.println("Test passed: " + Click_ActualWelcomeMessage);
			}else {
				 test.log(Status.FAIL, "Expected message :" + Click_ExpectedWelcomeMessage + "but found : " + Click_ActualWelcomeMessage + "'");
		            System.out.println("Test failed: Expected message is" + Click_ExpectedWelcomeMessage + "but found :" + Click_ActualWelcomeMessage + "'");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void RightClick() {
		try {
			test.log(Status.INFO, "Redirecting to the Buttons");
			driver.findElement(ConstantsConfig.ButtonsPage).click();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void DoubleClick() {
		try {
			test.log(Status.INFO, "Redirecting to the Buttons");
			driver.findElement(ConstantsConfig.ButtonsPage).click();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
