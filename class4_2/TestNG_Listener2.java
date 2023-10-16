package class4_2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_Listener2 extends TestListenerAdapter{
	public void onTestStart(ITestResult tr) {
		System.out.println("onTestStart");
	}
	public void onTestSuccess(ITestResult tr) {
		System.out.println("onTestSuccess");
	}
	public void onTestFailure(ITestResult tr) {
		System.out.println("onTestFailure");
	}
	public void onTestSkipped(ITestResult tr) {
		System.out.println("onTestSkipped");
	}

	  
  
  
  
}
