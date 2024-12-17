package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class AccordionDemo extends BasePage{

	public AccordionDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToAccordion() {
		try {
			test.log(Status.INFO, "Opening Browser");
			driver.navigate().to(ConstantsConfig.AccordionURL);
			driver.manage().window().maximize();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void ClickingOnAlert1(){
		try {
			test.log(Status.INFO, "Redirecting to the Alert 1");
			waitForVisibility(driver.findElement(ConstantsConfig.Accordion1),driver);
			String[] headings = {"//h2[@id='headingTwentyOne']", "//h2[@id='headingTwentyTwo']","//h2[@id='headingTwentyThree']"};
			for (String headingXPath : headings) {
				scrollToElement1(driver.findElement(By.xpath(headingXPath)));
                WebElement header = driver.findElement(By.xpath(headingXPath));
                header.click();
                WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(headingXPath + "/following-sibling::div")));
                
                WebElement content = driver.findElement(By.xpath(headingXPath + "/following-sibling::div"));
                System.out.println("Accordion content: " + content.getText());
                Thread.sleep(2000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
