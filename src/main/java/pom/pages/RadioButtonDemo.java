package pom.pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class RadioButtonDemo extends BasePage {

	public RadioButtonDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToRadioButton() {
		try {
			test.log(Status.INFO, "Redirecting to the Checkboxes");
			driver.findElement(ConstantsConfig.RadioButtonPage).click();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void RadioSelection_Yes() {
		try {
			driver.findElement(ConstantsConfig.Yes_Radio).click();
			String Message = driver.findElement(ConstantsConfig.YesRadioMessage).getText();
			test.log(Status.INFO, "Radio Selection Message : "+Message);
			System.out.println(Message);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void RadioSelection_Impressive() {
		try {
			driver.findElement(ConstantsConfig.Impressive_Radio).click();
			String Message = driver.findElement(ConstantsConfig.ImpressiveRadioMessage).getText();
			test.log(Status.INFO, "Radio Selection Message : "+Message);
			System.out.println(Message);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
