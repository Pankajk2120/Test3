package pom.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import pom.util.ConstantsConfig;
import pom.base.BasePage;

public class LaunchPage extends BasePage  {

	public LaunchPage(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void gotoLaunchpage() {
		try {
			test.log(Status.INFO, "Opening Browser");
			driver.navigate().to(ConstantsConfig.URL);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void loginladbs1() {
		try {
			test.log(Status.INFO, "Enter Username");
			waitForVisibility(driver.findElement(By.xpath("//*[@id='idp-discovery-username']")), driver);
			driver.findElement(By.xpath("//*[@id='idp-discovery-username']")).sendKeys("joel@yopmail.com");
			waitForVisibility(driver.findElement(By.xpath("//*[@id='idp-discovery-submit']")), driver);
			clickonElement(By.xpath("//*[@id='idp-discovery-submit']"));
			Thread.sleep(2000);

			waitForVisibility(driver.findElement(By.xpath("//*[@id='okta-signin-password']")), driver);
			test.log(Status.INFO, "Enter Password");
			driver.findElement(By.xpath("//*[@id='okta-signin-password']")).sendKeys("admin@123456");

			waitForVisibility(driver.findElement(By.xpath("//*[@id='okta-signin-submit']")), driver);
			test.log(Status.INFO, "click on Submit button");
			clickonElement(By.xpath("//*[@id='okta-signin-submit']"));
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
			reportFailure("loginladbs");
		}
	}
	
	public void loginladbs2() {
		try {
			
			waitForVisibility(driver.findElement(By.xpath("(//button[@type='button'])[2]")), driver);
			clickonElement(By.xpath("(//button[@type='button'])[2]"));			
			waitForVisibility(driver.findElement(By.xpath("//p[normalize-space()='PermitLA']")), driver);
			clickonElement(By.xpath("//p[normalize-space()='PermitLA']"));
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTb.get(1));
			waitForVisibility(driver.findElement(By.xpath("//button[@type='button']")), driver);
			driver.findElement(By.xpath("//button[@type='button']")).click();
			clickonElement(By.xpath("//img[@src='login_files/angeleno_login_btn.png']"));
			waitForVisibility(driver.findElement(By.xpath("(//a[normalize-space()='Apply for a Permit'])[1]")), driver);
			clickonElement(By.xpath("(//a[normalize-space()='Apply for a Permit'])[1]"));
		} catch (Exception e) {
			e.printStackTrace();
			reportFailure("loginladbs");
		}
	}
	

	private void reportFailure(String string) {

	}
	
	
	
	

}
