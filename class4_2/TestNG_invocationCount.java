package class4_2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_invocationCount {
	
	@Test
	  public void method1() {
		  System.out.println("method1");
	  }
	  @Test(invocationCount=5)
	  public void method2() {
		  System.out.println("method2");
	  }
  
  
  
  
}
