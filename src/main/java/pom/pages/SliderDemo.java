package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class SliderDemo  extends BasePage{

	public SliderDemo(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToSlider() {
		try {
			test.log(Status.INFO, "Opening Browser");
			driver.navigate().to(ConstantsConfig.SliderURL);
			driver.manage().window().maximize();	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void MoveTheSlider() {
		try {
			test.log(Status.INFO, "Opening Browser");
			WebElement SliderHandle = driver.findElement(By.xpath("//input[@id='ageInputId']"));
			int xOffset = SliderHandle.getLocation().getX();
			int width = SliderHandle.getSize().getWidth();
			System.out.println("xOffset : "+xOffset+ ", width : "+width);
			Actions actions = new Actions(driver);
			//actions.dragAndDropBy(SliderHandle, 0, 20).perform();
			
			actions.moveToElement(SliderHandle).moveByOffset(1, 0).click().perform();
			actions.moveToElement(SliderHandle).moveByOffset(25, 0).click().perform();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void MoveTheSlider1() {
		try {
			test.log(Status.INFO, "Opening Browser");
			WebElement slider = driver.findElement(By.id("ageInputId"));
		    WebElement output = driver.findElement(By.id("ageOutputId"));
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
            int targetValue = 77; // Desired slider value
            js.executeScript("arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('input'));", slider, targetValue);
		
            String outputValue = output.getText();
            if (outputValue.equals(String.valueOf(targetValue))) {
                System.out.println("Slider successfully set to value: " + outputValue);
            } else {
                System.out.println("Failed to set slider value. Current value: " + outputValue);
            }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
