package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.*;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.base.BasePage;

public class ParallelTest{
	
	public WebDriver driver;

	
	@Test(priority = 1)
	public void testChrome() throws InterruptedException {
	System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-debugging-port=9222");
	driver = new ChromeDriver(options);
	
	
	driver.get("https://www.bstackdemo.com/");
	driver.manage().window().maximize();
	Assert.assertEquals(driver.getTitle(), "StackDemo");
	System.out.println("1");
	}

	/*@Test(priority = 2)
	public void testFirefox() throws InterruptedException {
	System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.get("https://www.bstackdemo.com/");
	driver.manage().window().maximize();
	Assert.assertEquals(driver.getTitle(), "StackDemo"); 
	System.out.println("2");
	}
*/
	}
