package demo.project;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import com.google.common.base.Verify;
import java.lang.reflect.Method;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import demo.project.base.Driver;
import demo.project.base.Page.PracticePage;

public class PracticePageTest_Button2 extends Driver{
	
	PracticePage pp;
	static ExtentTest test;
	static ExtentReports report;
	
	public PracticePageTest_Button2() {
		super();
	}
	
	
	@BeforeSuite
	public void setUp() {
		
		
	}
	
	@BeforeClass
	public void beforeClass() {
		//initializing the ExtentReport
		report = new ExtentReports(System.getProperty("user.dir")+"\\testngReport_23112023_1.html");
	}
	
	@BeforeMethod
	public void beforeTest(Method method) {
		test = report.startTest("Starting the TestNG test" + method.getName());
		//initialize the browser
		initialization();
		//initialize the page
		pp = new PracticePage();
		
	}
	
	@Test
	public void TC01_Radio() throws InterruptedException {
		//Radio button click
		pp.bmwradio.click();
		Thread.sleep(5000);
		test.log(LogStatus.INFO, "BMW Radio button clicked!!!!");
		
		
	}
	
	@Test
	public void TC02_CheckBox() throws InterruptedException {
		//Checkbox click
		pp.bmwcheckbox.click();
		Thread.sleep(5000);
		//Logging
		test.log(LogStatus.INFO, "BMW Check button clicked!!!!");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		//for ending the report based on the test
		report.endTest(test);
		tearDownMain();
	}
	
	@AfterClass
	public void afterClass() {
		//for pushing the data to html
		report.flush();
	}
	
	@AfterSuite
	public void afterSuite() {
		
	}
	
}