package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class CheckboxDemo extends BasePage {

	public CheckboxDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToCheckboxPage() {
		try {
			test.log(Status.INFO, "Redirecting to the Checkboxes");
			driver.findElement(ConstantsConfig.CheckboxPage).click();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void CheckBoxScenario1() {
		try {
			test.log(Status.INFO, "Clicking on MainLevel1 Checkbox");
			driver.findElement(ConstantsConfig.MainLevel1_Checkbox).click();
			Thread.sleep(2000);
			driver.findElement(ConstantsConfig.MainLevel1_Plus).click();
			Thread.sleep(1000);
			if(driver.findElement(ConstantsConfig.SubLevel1_Checkbox).isSelected() && driver.findElement(ConstantsConfig.SubLevel2_Checkbox).isSelected() ) {
				test.log(Status.INFO, "Sub Levels checkbox Selected");
				System.out.println("Sub Levels checkbox Selected");
			}else {
				test.log(Status.INFO, "Sub Levels checkbox not Selected");
				System.out.println("Sub Levels checkbox not Selected");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
