package Ignore;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import reports.ExtentManager;

public class LoginTest {
	ExtentTest test;
	ExtentReports reports;
	WebDriver driver;
	
	@BeforeMethod
	public void Init() {
		 	reports =ExtentManager.getReports();
			test = reports.createTest("LoginTest");
	        
			WebDriverManager.chromedriver().setup();
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        driver = new ChromeDriver(options);
	}

	
	@AfterMethod
	public void quit() {
		reports.flush();
	}
	
	//@Test
	public void login() throws IOException {
		System.out.println(System.getProperty("user.dir"));
		test.log(Status.INFO, "Opening Browser");
		driver.get("https://www.youtube.com/");
		test.log(Status.INFO, "Starting test case Login");
		//test.log(Status.FAIL, "404 error");
		// selenium takes screenshot and puts in screesnhot folder
		//test.addScreenCaptureFromPath("D:\\Ashish\\Temp.png", "404 Error");
		//Assert.fail("404 error");
		test.log(Status.INFO, "Opening Browser");
		test.log(Status.INFO, "Logging In");
		test.log(Status.PASS, "Test Passed");
		
		
		
	}

}
