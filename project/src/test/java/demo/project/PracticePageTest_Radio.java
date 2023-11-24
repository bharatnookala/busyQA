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

public class PracticePageTest_Radio extends Driver{
	
	PracticePage pp;
	static ExtentTest test;
	static ExtentReports report;
	
	public PracticePageTest_Radio() {
		super();
	}
	
	
	@BeforeSuite
	public void setUp() {
		//initialize the browser
		initialization();
		//initialize the page
		pp = new PracticePage();
		
	}
	
	@BeforeClass
	public void beforeClass() {
		//initializing the ExtentReport
		report = new ExtentReports(System.getProperty("user.dir")+"\\testngReport_23112023_1.html");
	}
	
	@Test
	public void TC01_Radio() throws InterruptedException {
		//init the ExtentTest
		test = report.startTest("Starting the TestNG test");
		//Radio button click
		pp.bmwradio.click();
		Thread.sleep(5000);
		//Logging
		test.log(LogStatus.INFO, "BMW Radio button clicked!!!!");
		
	}
	
	@AfterClass
	public void afterClass() {
		//for ending the report based on the test
		report.endTest(test);
		//for pushing the data to html
		report.flush();
	}
	
	@AfterSuite
	public void afterSuite() {
		tearDownMain();
	}
	
}