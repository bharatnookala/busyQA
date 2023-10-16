package class4_2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_Listener implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("onFinish");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("onStart");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("onTestFailure");
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("onTestSkipped");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("onTestStart");
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("onTestSuccess");
		
	}

	  
  
  
  
}
