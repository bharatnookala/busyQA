package class4_2;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestNG_ExtentReport {
	
	static ExtentTest test;
	static ExtentReports report;
	
	@BeforeClass
	public void beforeMethod() {
		System.out.println("in the @BeforeClass method");
		report = new ExtentReports(System.getProperty("user.dir")+"\\testngreport_14102023.html");
		test = report.startTest("ExtentReport start");
		
	}
	
	@Test
	public void extentReportDemo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Personal/Bharat/BusyQA/Week02_30092023/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		test.log(LogStatus.ERROR, "Browser opened");
		WebElement w1 = driver.findElement(By.id("autosuggest"));
		//sendkeys
		w1.sendKeys("busyQA1111");
		Thread.sleep(3000);
		test.log(LogStatus.FAIL, "Autosuggest populated");
		
		
		//clear
		w1.clear();
		Thread.sleep(3000);
		test.log(LogStatus.FATAL, "Autosuggest cleared");
		
		//isEnabled
		WebElement w2 = driver.findElement(By.id("bmwradio"));
		w2.click();
		test.log(LogStatus.INFO, "Radio button clicked");
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "Test case passed");
		driver.quit();
	}
	
	@AfterClass
	public void afterMethod() {
		report.endTest(test);
		report.flush();
	}
	

}
