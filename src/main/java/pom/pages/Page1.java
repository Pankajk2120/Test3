package pom.pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class Page1 extends BasePage {

	public Page1(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void TextBox() {
		try {
			test.log(Status.INFO, "Opening Browser");
			driver.findElement(ConstantsConfig.ClickOn_TextBox).click();
			driver.findElement(ConstantsConfig.FullName).sendKeys(ConstantsConfig.FullName1);
			test.log(Status.INFO,"Full Name : "+ConstantsConfig.FullName1);
			driver.findElement(ConstantsConfig.Email).sendKeys(ConstantsConfig.Email1);
			test.log(Status.INFO,"Email : "+ConstantsConfig.Email1);
			driver.findElement(ConstantsConfig.CurrentAddress).sendKeys(ConstantsConfig.CurrentAddress1);
			test.log(Status.INFO,"Current Address : "+ConstantsConfig.CurrentAddress1);
			driver.findElement(ConstantsConfig.Password).sendKeys(ConstantsConfig.Password1);
			test.log(Status.INFO,"Password : "+ConstantsConfig.Password1);
			driver.findElement(ConstantsConfig.SubmitBtn).click();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
