package class4_2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_DataProvider {
	
	
	@Test(dataProvider="busyQA",dataProviderClass=TestNG_DataProvider2.class)
	public void testMethod1(String s1, String s2) {
		System.out.println("in the test method");
		System.out.println("the username is::::"+s1);
		System.out.println("the password is::::"+s2);
	}
  
  
  
  
}
