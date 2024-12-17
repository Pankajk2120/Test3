package pom.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.base.BasePage;
import pom.util.ConstantsConfig;

public class UploadFilePage extends BasePage{
	String downloadDir = "C:\\Users\\IDC-212\\Downloads";
	public UploadFilePage(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void RedirectToUploadDownLoadFilePage() {
		try {
			test.log(Status.INFO, "Redirecting to the Upload Download Page");
			driver.findElement(ConstantsConfig.UploadFilePage).click();
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void UploadFile() {
		try {
			test.log(Status.INFO, "Clicking on Upload File");
			WebElement UploadFile = driver.findElement(ConstantsConfig.UploadFile);
			UploadFile.sendKeys(ConstantsConfig.FilePath);
			String Message = driver.findElement(ConstantsConfig.UploadFile).getText();
			System.out.println(Message);
			System.out.println("File upload test executed successfully.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void DownloadFile() {
		try {
			test.log(Status.INFO, "Clicking on Download File");
			WebElement DownloadButton = driver.findElement(ConstantsConfig.DownloadFile);
			DownloadButton.click();
			System.out.println("File Download test executed successfully.");
			
			// Verify the file download
	        File file = new File(downloadDir+ "\\samplefile.txt"); // Replace with actual file name
	        if (file.exists()) {
	            System.out.println("File downloaded successfully: " + file.getAbsolutePath());
	        } else {
	            System.out.println("File download failed.");
	        }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
